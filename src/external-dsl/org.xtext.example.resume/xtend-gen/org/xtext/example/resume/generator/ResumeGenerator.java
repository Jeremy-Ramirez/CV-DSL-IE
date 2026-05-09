package org.xtext.example.resume.generator;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.resume.resume.Degree;
import org.xtext.example.resume.resume.Education;
import org.xtext.example.resume.resume.Experience;
import org.xtext.example.resume.resume.Job;
import org.xtext.example.resume.resume.Profile;
import org.xtext.example.resume.resume.Project;
import org.xtext.example.resume.resume.Projects;
import org.xtext.example.resume.resume.Section;

@SuppressWarnings("all")
public class ResumeGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Profile profile = ((Profile) _head);
    if ((((profile == null) || (profile.getCustomization() == null)) || (profile.getCustomization().getJobOfferPath() == null))) {
      return;
    }
    final String jsonPath = profile.getCustomization().getJobOfferPath().replace("\"", "").trim();
    final File file = new File(jsonPath);
    if (((!file.exists()) || file.isDirectory())) {
      return;
    }
    final List<String> requiredTags = this.getRequiredTagsFromJson(jsonPath);
    final ArrayList<Job> matchedJobs = new ArrayList<Job>();
    final ArrayList<Job> omittedJobs = new ArrayList<Job>();
    final ArrayList<Project> matchedProjects = new ArrayList<Project>();
    final ArrayList<Project> omittedProjects = new ArrayList<Project>();
    final ArrayList<Degree> matchedEducation = new ArrayList<Degree>();
    EList<Section> _sections = profile.getSections();
    for (final Section section : _sections) {
      boolean _matched = false;
      if (section instanceof Experience) {
        _matched=true;
        EList<Job> _jobs = ((Experience)section).getJobs();
        for (final Job job : _jobs) {
          boolean _matchesTags = this.matchesTags(job.getTags().getValues(), requiredTags);
          if (_matchesTags) {
            matchedJobs.add(job);
          } else {
            omittedJobs.add(job);
          }
        }
      }
      if (!_matched) {
        if (section instanceof Projects) {
          _matched=true;
          EList<Project> _projects = ((Projects)section).getProjects();
          for (final Project proj : _projects) {
            boolean _matchesTags = this.matchesTags(proj.getTags().getValues(), requiredTags);
            if (_matchesTags) {
              matchedProjects.add(proj);
            } else {
              omittedProjects.add(proj);
            }
          }
        }
      }
      if (!_matched) {
        if (section instanceof Education) {
          _matched=true;
          EList<Degree> _degrees = ((Education)section).getDegrees();
          for (final Degree degree : _degrees) {
            boolean _matchesTags = this.matchesTags(degree.getTags().getValues(), requiredTags);
            if (_matchesTags) {
              matchedEducation.add(degree);
            }
          }
        }
      }
    }
    fsa.generateFile("Dashboard_CV.html", this.generateHTML(profile, requiredTags, matchedJobs, omittedJobs, matchedProjects, omittedProjects, matchedEducation));
  }

  public List<String> getRequiredTagsFromJson(final String path) {
    final ArrayList<String> tags = new ArrayList<String>();
    try {
      byte[] _readAllBytes = Files.readAllBytes(Paths.get(path));
      final String content = new String(_readAllBytes);
      final Matcher matcher = Pattern.compile("\"requiredTags\"\\s*:\\s*\\[(.*?)\\]").matcher(content);
      boolean _find = matcher.find();
      if (_find) {
        final String[] rawTags = matcher.group(1).split(",");
        for (final String tag : rawTags) {
          tags.add(tag.replace("\"", "").trim().toLowerCase());
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return tags;
  }

  public boolean matchesTags(final List<String> elementTags, final List<String> requiredTags) {
    if (((elementTags == null) || elementTags.isEmpty())) {
      return false;
    }
    for (final String tag : elementTags) {
      boolean _contains = requiredTags.contains(tag.replace("\"", "").trim().toLowerCase());
      if (_contains) {
        return true;
      }
    }
    return false;
  }

  public CharSequence generateHTML(final Profile profile, final List<String> requiredTags, final List<Job> mJobs, final List<Job> oJobs, final List<Project> mProj, final List<Project> oProj, final List<Degree> mEdu) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<meta charset=\"UTF-8\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<style>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("body { font-family: sans-serif; line-height: 1.6; color: #333; max-width: 900px; margin: auto; background: #f0f2f5; padding: 20px; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".card { background: white; padding: 25px; border-radius: 12px; shadow: 0 4px 6px rgba(0,0,0,0.1); margin-bottom: 20px; border: 1px solid #e1e4e8; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".dashboard { border-left: 8px solid #f1c40f; background: #fef9e7; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".cv-header { text-align: center; border-bottom: 3px solid #3498db; padding-bottom: 10px; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("h2 { color: #2c3e50; border-bottom: 1px solid #eee; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".tag-box { display: inline-block; background: #e8f4fd; color: #2980b9; padding: 2px 8px; border-radius: 4px; font-size: 12px; margin-right: 5px; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".omitted-item { color: #c0392b; font-size: 0.9em; margin-bottom: 5px; }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"card dashboard\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h2>\ud83d\udd0d Análisis de Relevancia (Feedback)</h2>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<p><b>Criterio Externo:</b> ");
    String _join = String.join(", ", requiredTags);
    _builder.append(_join, "\t\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h4>Elementos descartados por falta de match:</h4>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("\t\t\t");
    {
      for(final Job j : oJobs) {
        _builder.append("<li class=\"omitted-item\">Experiencia: ");
        String _replace = j.getTitle().replace("\"", "");
        _builder.append(_replace, "\t\t\t");
        _builder.append("</li>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    {
      for(final Project p : oProj) {
        _builder.append("<li class=\"omitted-item\">Proyecto: ");
        String _replace_1 = p.getTitle().replace("\"", "");
        _builder.append(_replace_1, "\t\t\t");
        _builder.append("</li>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"card\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"cv-header\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h1>");
    String _replace_2 = profile.getUserdata().getName().replace("\"", "");
    _builder.append(_replace_2, "\t\t\t");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    String _replace_3 = profile.getUserdata().getEmail().replace("\"", "");
    _builder.append(_replace_3, "\t\t\t");
    _builder.append(" | ");
    String _replace_4 = profile.getUserdata().getTelephoneNumber().replace("\"", "");
    _builder.append(_replace_4, "\t\t\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h2>\ud83d\ude80 Proyectos Seleccionados</h2>");
    _builder.newLine();
    {
      for(final Project p_1 : mProj) {
        _builder.append("\t\t");
        _builder.append("<div>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<b>");
        String _replace_5 = p_1.getTitle().replace("\"", "");
        _builder.append(_replace_5, "\t\t\t");
        _builder.append("</b> - <a href=\"#\">");
        String _replace_6 = p_1.getLink().replace("\"", "");
        _builder.append(_replace_6, "\t\t\t");
        _builder.append("</a>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<p>");
        String _join_1 = String.join(", ", p_1.getDescription().getValues());
        _builder.append(_join_1, "\t\t\t");
        _builder.append("</p>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<div>");
        {
          EList<String> _values = p_1.getTags().getValues();
          for(final String t : _values) {
            _builder.append("<span class=\"tag-box\">");
            _builder.append(t, "\t\t\t");
            _builder.append("</span>");
          }
        }
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h2>\ud83d\udcbc Experiencia Profesional Relevante</h2>");
    _builder.newLine();
    {
      for(final Job j_1 : mJobs) {
        _builder.append("\t\t");
        _builder.append("<div style=\"margin-bottom: 15px;\">");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<b>");
        String _replace_7 = j_1.getTitle().replace("\"", "");
        _builder.append(_replace_7, "\t\t\t");
        _builder.append("</b> en <i>");
        String _replace_8 = j_1.getCompany().replace("\"", "");
        _builder.append(_replace_8, "\t\t\t");
        _builder.append("</i>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<br><small>");
        String _replace_9 = j_1.getStartDate().replace("\"", "");
        _builder.append(_replace_9, "\t\t\t");
        _builder.append(" - ");
        String _replace_10 = j_1.getEndDate().replace("\"", "");
        _builder.append(_replace_10, "\t\t\t");
        _builder.append("</small>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("<div>");
        {
          EList<String> _values_1 = j_1.getTags().getValues();
          for(final String t_1 : _values_1) {
            _builder.append("<span class=\"tag-box\">");
            _builder.append(t_1, "\t\t\t");
            _builder.append("</span>");
          }
        }
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h2>\ud83c\udf93 Educación Relacionada</h2>");
    _builder.newLine();
    {
      for(final Degree e : mEdu) {
        _builder.append("\t\t");
        _builder.append("<p><b>");
        String _replace_11 = e.getTitle().replace("\"", "");
        _builder.append(_replace_11, "\t\t");
        _builder.append("</b> - ");
        String _replace_12 = e.getInstitution().replace("\"", "");
        _builder.append(_replace_12, "\t\t");
        _builder.append(" (");
        String _replace_13 = e.getGraduationDate().replace("\"", "");
        _builder.append(_replace_13, "\t\t");
        _builder.append(")</p>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
