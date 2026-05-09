package org.xtext.example.resume.generator;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
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
import org.xtext.example.resume.resume.Skill;
import org.xtext.example.resume.resume.Skills;

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
    String targetLang = "es";
    String _language = profile.getCustomization().getLanguage();
    boolean _tripleNotEquals = (_language != null);
    if (_tripleNotEquals) {
      targetLang = profile.getCustomization().getLanguage().replace("\"", "").trim().toLowerCase();
    }
    final ArrayList<Job> matchedJobs = new ArrayList<Job>();
    final ArrayList<Job> omittedJobs = new ArrayList<Job>();
    final ArrayList<Project> matchedProjects = new ArrayList<Project>();
    final ArrayList<Project> omittedProjects = new ArrayList<Project>();
    final ArrayList<Degree> allEducation = new ArrayList<Degree>();
    EList<Section> _sections = profile.getSections();
    for (final Section section : _sections) {
      boolean _matched = false;
      if (section instanceof Experience) {
        _matched=true;
        if (((((Experience)section).getLanguage() != null) && Objects.equals(((Experience)section).getLanguage().replace("\"", "").trim().toLowerCase(), targetLang))) {
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
      }
      if (!_matched) {
        if (section instanceof Projects) {
          _matched=true;
          if (((((Projects)section).getLanguage() != null) && Objects.equals(((Projects)section).getLanguage().replace("\"", "").trim().toLowerCase(), targetLang))) {
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
      }
      if (!_matched) {
        if (section instanceof Education) {
          _matched=true;
          if (((((Education)section).getLanguage() != null) && Objects.equals(((Education)section).getLanguage().replace("\"", "").trim().toLowerCase(), targetLang))) {
            allEducation.addAll(((Education)section).getDegrees());
          }
        }
      }
    }
    final int matchPercentage = this.calculateMatchPercentage(profile, requiredTags, targetLang);
    fsa.generateFile("Dashboard_CV.html", this.generateHTML(profile, requiredTags, matchPercentage, matchedJobs, omittedJobs, matchedProjects, omittedProjects, allEducation, targetLang));
  }

  public int calculateMatchPercentage(final Profile profile, final List<String> requiredTags, final String targetLang) {
    boolean _isEmpty = requiredTags.isEmpty();
    if (_isEmpty) {
      return 100;
    }
    final HashSet<String> userTags = new HashSet<String>();
    EList<Section> _sections = profile.getSections();
    for (final Section section : _sections) {
      boolean _matched = false;
      if (section instanceof Experience) {
        _matched=true;
        if (((((Experience)section).getLanguage() != null) && Objects.equals(((Experience)section).getLanguage().replace("\"", "").trim().toLowerCase(), targetLang))) {
          final Consumer<Job> _function = (Job j) -> {
            final Consumer<String> _function_1 = (String t) -> {
              userTags.add(t.replace("\"", "").trim().toLowerCase());
            };
            j.getTags().getValues().forEach(_function_1);
          };
          ((Experience)section).getJobs().forEach(_function);
        }
      }
      if (!_matched) {
        if (section instanceof Projects) {
          _matched=true;
          if (((((Projects)section).getLanguage() != null) && Objects.equals(((Projects)section).getLanguage().replace("\"", "").trim().toLowerCase(), targetLang))) {
            final Consumer<Project> _function = (Project p) -> {
              final Consumer<String> _function_1 = (String t) -> {
                userTags.add(t.replace("\"", "").trim().toLowerCase());
              };
              p.getTags().getValues().forEach(_function_1);
            };
            ((Projects)section).getProjects().forEach(_function);
          }
        }
      }
      if (!_matched) {
        if (section instanceof Skills) {
          _matched=true;
          if (((((Skills)section).getLanguage() != null) && Objects.equals(((Skills)section).getLanguage().replace("\"", "").trim().toLowerCase(), targetLang))) {
            final Consumer<Skill> _function = (Skill s) -> {
              final Consumer<String> _function_1 = (String t) -> {
                userTags.add(t.replace("\"", "").trim().toLowerCase());
              };
              s.getTags().getValues().forEach(_function_1);
            };
            ((Skills)section).getSkills().forEach(_function);
          }
        }
      }
      if (!_matched) {
        if (section instanceof Education) {
          _matched=true;
          if (((((Education)section).getLanguage() != null) && Objects.equals(((Education)section).getLanguage().replace("\"", "").trim().toLowerCase(), targetLang))) {
            final Consumer<Degree> _function = (Degree d) -> {
              final Consumer<String> _function_1 = (String t) -> {
                userTags.add(t.replace("\"", "").trim().toLowerCase());
              };
              d.getTags().getValues().forEach(_function_1);
            };
            ((Education)section).getDegrees().forEach(_function);
          }
        }
      }
    }
    int matchCount = 0;
    for (final String reqTag : requiredTags) {
      boolean _contains = userTags.contains(reqTag);
      if (_contains) {
        matchCount++;
      }
    }
    int _size = requiredTags.size();
    return ((matchCount * 100) / _size);
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

  public CharSequence generateHTML(final Profile profile, final List<String> requiredTags, final int matchPercentage, final List<Job> mJobs, final List<Job> oJobs, final List<Project> mProj, final List<Project> oProj, final List<Degree> allEdu, final String lang) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"");
    _builder.append(lang);
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
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
    _builder.append(".card { background: white; padding: 25px; border-radius: 12px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); margin-bottom: 20px; border: 1px solid #e1e4e8; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".dashboard { border-left: 8px solid ");
    {
      if ((matchPercentage >= 80)) {
        _builder.append("#2ecc71");
      } else {
        if ((matchPercentage >= 50)) {
          _builder.append("#f39c12");
        } else {
          _builder.append("#e74c3c");
        }
      }
    }
    _builder.append("; background: #fef9e7; }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append(".cv-header { text-align: center; border-bottom: 3px solid #3498db; padding-bottom: 10px; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("h2 { color: #2c3e50; border-bottom: 2px solid #eee; padding-bottom: 5px; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".tag-box { display: inline-block; background: #e8f4fd; color: #2980b9; padding: 2px 8px; border-radius: 4px; font-size: 12px; margin-right: 5px; margin-top: 5px;}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".omitted-item { color: #c0392b; font-size: 0.9em; margin-bottom: 5px; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".progress-container { width: 100%; background-color: #ddd; border-radius: 8px; margin: 15px 0; overflow: hidden; }");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".progress-bar { height: 24px; text-align: center; color: white; font-weight: bold; line-height: 24px;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("background-color: ");
    {
      if ((matchPercentage >= 80)) {
        _builder.append("#2ecc71");
      } else {
        if ((matchPercentage >= 50)) {
          _builder.append("#f39c12");
        } else {
          _builder.append("#e74c3c");
        }
      }
    }
    _builder.append("; ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("width: ");
    _builder.append(matchPercentage, "\t\t\t");
    _builder.append("%; ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(".edu-item { margin-bottom: 10px; padding-left: 10px; border-left: 3px solid #95a5a6; }");
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
    _builder.append("<h2>");
    {
      boolean _equals = Objects.equals(lang, "en");
      if (_equals) {
        _builder.append("\ud83d\udcca Analysis Dashboard");
      } else {
        _builder.append("\ud83d\udcca Dashboard de Análisis");
      }
    }
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<p><b>");
    {
      boolean _equals_1 = Objects.equals(lang, "en");
      if (_equals_1) {
        _builder.append("Target Offer:");
      } else {
        _builder.append("Oferta Objetivo:");
      }
    }
    _builder.append("</b> ");
    String _replace = profile.getCustomization().getJobOfferPath().replace("\"", "");
    _builder.append(_replace, "\t\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<p><b>");
    {
      boolean _equals_2 = Objects.equals(lang, "en");
      if (_equals_2) {
        _builder.append("Required Tags:");
      } else {
        _builder.append("Tags Requeridos:");
      }
    }
    _builder.append("</b> ");
    String _join = String.join(", ", requiredTags);
    _builder.append(_join, "\t\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h3>Match Score: ");
    _builder.append(matchPercentage, "\t\t");
    _builder.append("%</h3>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<div class=\"progress-container\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div class=\"progress-bar\">");
    {
      if ((matchPercentage > 10)) {
        _builder.append(matchPercentage, "\t\t\t");
        _builder.append("%");
      }
    }
    _builder.append("</div>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h4>");
    {
      boolean _equals_3 = Objects.equals(lang, "en");
      if (_equals_3) {
        _builder.append("Elements omitted from the final CV:");
      } else {
        _builder.append("Elementos omitidos en el CV final:");
      }
    }
    _builder.append("</h4>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<ul>");
    _builder.newLine();
    {
      if ((oJobs.isEmpty() && oProj.isEmpty())) {
        _builder.append("\t\t\t");
        _builder.append("<li style=\"color: green;\">");
        {
          boolean _equals_4 = Objects.equals(lang, "en");
          if (_equals_4) {
            _builder.append("Perfect! Your experience and projects are a 100% match.");
          } else {
            _builder.append("¡Perfecto! Tu experiencia y proyectos encajan al 100%.");
          }
        }
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t\t\t");
        {
          for(final Job j : oJobs) {
            _builder.append("<li class=\"omitted-item\">");
            {
              boolean _equals_5 = Objects.equals(lang, "en");
              if (_equals_5) {
                _builder.append("Experience:");
              } else {
                _builder.append("Experiencia:");
              }
            }
            _builder.append(" ");
            String _replace_1 = j.getTitle().replace("\"", "");
            _builder.append(_replace_1, "\t\t\t");
            _builder.append("</li>");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        {
          for(final Project p : oProj) {
            _builder.append("<li class=\"omitted-item\">");
            {
              boolean _equals_6 = Objects.equals(lang, "en");
              if (_equals_6) {
                _builder.append("Project:");
              } else {
                _builder.append("Proyecto:");
              }
            }
            _builder.append(" ");
            String _replace_2 = p.getTitle().replace("\"", "");
            _builder.append(_replace_2, "\t\t\t");
            _builder.append("</li>");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
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
    String _replace_3 = profile.getUserdata().getName().replace("\"", "");
    _builder.append(_replace_3, "\t\t\t");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    String _replace_4 = profile.getUserdata().getEmail().replace("\"", "");
    _builder.append(_replace_4, "\t\t\t");
    _builder.append(" | ");
    String _replace_5 = profile.getUserdata().getTelephoneNumber().replace("\"", "");
    _builder.append(_replace_5, "\t\t\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    String _replace_6 = profile.getUserdata().getDirection().replace("\"", "");
    _builder.append(_replace_6, "\t\t\t");
    _builder.append(", ");
    String _replace_7 = profile.getUserdata().getCity().replace("\"", "");
    _builder.append(_replace_7, "\t\t\t");
    _builder.append(", ");
    String _replace_8 = profile.getUserdata().getCountry().replace("\"", "");
    _builder.append(_replace_8, "\t\t\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _isEmpty = allEdu.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t\t");
        _builder.append("<h2>");
        {
          boolean _equals_7 = Objects.equals(lang, "en");
          if (_equals_7) {
            _builder.append("\ud83c\udf93 Academic Background");
          } else {
            _builder.append("\ud83c\udf93 Formación Académica");
          }
        }
        _builder.append("</h2>");
        _builder.newLineIfNotEmpty();
        {
          for(final Degree e : allEdu) {
            _builder.append("\t\t");
            _builder.append("<div class=\"edu-item\">");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<b>");
            String _replace_9 = e.getTitle().replace("\"", "");
            _builder.append(_replace_9, "\t\t\t");
            _builder.append("</b><br>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            String _replace_10 = e.getInstitution().replace("\"", "");
            _builder.append(_replace_10, "\t\t\t");
            _builder.append(" | ");
            String _replace_11 = e.getGraduationDate().replace("\"", "");
            _builder.append(_replace_11, "\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("</div>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    {
      boolean _isEmpty_1 = mProj.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\t\t");
        _builder.append("<h2>");
        {
          boolean _equals_8 = Objects.equals(lang, "en");
          if (_equals_8) {
            _builder.append("\ud83d\ude80 Selected Projects");
          } else {
            _builder.append("\ud83d\ude80 Proyectos Seleccionados");
          }
        }
        _builder.append("</h2>");
        _builder.newLineIfNotEmpty();
        {
          for(final Project p_1 : mProj) {
            _builder.append("\t\t");
            _builder.append("<div style=\"margin-bottom: 15px;\">");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<b>");
            String _replace_12 = p_1.getTitle().replace("\"", "");
            _builder.append(_replace_12, "\t\t\t");
            _builder.append("</b> - <small>");
            String _replace_13 = p_1.getLink().replace("\"", "");
            _builder.append(_replace_13, "\t\t\t");
            _builder.append("</small>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<p style=\"margin: 5px 0;\">");
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
      }
    }
    _builder.newLine();
    {
      boolean _isEmpty_2 = mJobs.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\t\t");
        _builder.append("<h2>");
        {
          boolean _equals_9 = Objects.equals(lang, "en");
          if (_equals_9) {
            _builder.append("\ud83d\udcbc Relevant Professional Experience");
          } else {
            _builder.append("\ud83d\udcbc Experiencia Profesional Relevante");
          }
        }
        _builder.append("</h2>");
        _builder.newLineIfNotEmpty();
        {
          for(final Job j_1 : mJobs) {
            _builder.append("\t\t");
            _builder.append("<div style=\"margin-bottom: 20px;\">");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<b>");
            String _replace_14 = j_1.getTitle().replace("\"", "");
            _builder.append(_replace_14, "\t\t\t");
            _builder.append("</b> | <i>");
            String _replace_15 = j_1.getCompany().replace("\"", "");
            _builder.append(_replace_15, "\t\t\t");
            _builder.append("</i>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<br><small>");
            String _replace_16 = j_1.getStartDate().replace("\"", "");
            _builder.append(_replace_16, "\t\t\t");
            _builder.append(" - ");
            String _replace_17 = j_1.getEndDate().replace("\"", "");
            _builder.append(_replace_17, "\t\t\t");
            _builder.append("</small>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("<p style=\"margin: 5px 0;\">");
            String _join_2 = String.join(", ", j_1.getDescription().getValues());
            _builder.append(_join_2, "\t\t\t");
            _builder.append("</p>");
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
