package org.xtext.example.resume.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.resume.services.ResumeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalResumeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Metadata'", "'style:'", "'font:'", "'imgPath:'", "'Userdata'", "'name:'", "'email:'", "'telephoneNumber:'", "'direction:'", "'city:'", "'country:'", "'Experience'", "'language:'", "'title:'", "'description:'", "'company:'", "'startDate:'", "'endDate:'", "'tags:'", "'Projects'", "'technologies:'", "'link:'", "'from:'", "','", "'Education'", "'institution:'", "'graduationDate:'", "'Skills'", "'Interests'", "'Languages'", "'Metrics'", "'Metric'", "'='", "'-'", "'Customization'", "'targetJobOffer:'", "'['", "']'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalResumeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalResumeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalResumeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalResume.g"; }


    	private ResumeGrammarAccess grammarAccess;

    	public void setGrammarAccess(ResumeGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProfile"
    // InternalResume.g:53:1: entryRuleProfile : ruleProfile EOF ;
    public final void entryRuleProfile() throws RecognitionException {
        try {
            // InternalResume.g:54:1: ( ruleProfile EOF )
            // InternalResume.g:55:1: ruleProfile EOF
            {
             before(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            ruleProfile();

            state._fsp--;

             after(grammarAccess.getProfileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalResume.g:62:1: ruleProfile : ( ( rule__Profile__Group__0 ) ) ;
    public final void ruleProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:66:2: ( ( ( rule__Profile__Group__0 ) ) )
            // InternalResume.g:67:2: ( ( rule__Profile__Group__0 ) )
            {
            // InternalResume.g:67:2: ( ( rule__Profile__Group__0 ) )
            // InternalResume.g:68:3: ( rule__Profile__Group__0 )
            {
             before(grammarAccess.getProfileAccess().getGroup()); 
            // InternalResume.g:69:3: ( rule__Profile__Group__0 )
            // InternalResume.g:69:4: rule__Profile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleMetadata"
    // InternalResume.g:78:1: entryRuleMetadata : ruleMetadata EOF ;
    public final void entryRuleMetadata() throws RecognitionException {
        try {
            // InternalResume.g:79:1: ( ruleMetadata EOF )
            // InternalResume.g:80:1: ruleMetadata EOF
            {
             before(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getMetadataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalResume.g:87:1: ruleMetadata : ( ( rule__Metadata__Group__0 ) ) ;
    public final void ruleMetadata() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:91:2: ( ( ( rule__Metadata__Group__0 ) ) )
            // InternalResume.g:92:2: ( ( rule__Metadata__Group__0 ) )
            {
            // InternalResume.g:92:2: ( ( rule__Metadata__Group__0 ) )
            // InternalResume.g:93:3: ( rule__Metadata__Group__0 )
            {
             before(grammarAccess.getMetadataAccess().getGroup()); 
            // InternalResume.g:94:3: ( rule__Metadata__Group__0 )
            // InternalResume.g:94:4: rule__Metadata__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleUserdata"
    // InternalResume.g:103:1: entryRuleUserdata : ruleUserdata EOF ;
    public final void entryRuleUserdata() throws RecognitionException {
        try {
            // InternalResume.g:104:1: ( ruleUserdata EOF )
            // InternalResume.g:105:1: ruleUserdata EOF
            {
             before(grammarAccess.getUserdataRule()); 
            pushFollow(FOLLOW_1);
            ruleUserdata();

            state._fsp--;

             after(grammarAccess.getUserdataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUserdata"


    // $ANTLR start "ruleUserdata"
    // InternalResume.g:112:1: ruleUserdata : ( ( rule__Userdata__Group__0 ) ) ;
    public final void ruleUserdata() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:116:2: ( ( ( rule__Userdata__Group__0 ) ) )
            // InternalResume.g:117:2: ( ( rule__Userdata__Group__0 ) )
            {
            // InternalResume.g:117:2: ( ( rule__Userdata__Group__0 ) )
            // InternalResume.g:118:3: ( rule__Userdata__Group__0 )
            {
             before(grammarAccess.getUserdataAccess().getGroup()); 
            // InternalResume.g:119:3: ( rule__Userdata__Group__0 )
            // InternalResume.g:119:4: rule__Userdata__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserdata"


    // $ANTLR start "entryRuleSection"
    // InternalResume.g:128:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalResume.g:129:1: ( ruleSection EOF )
            // InternalResume.g:130:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalResume.g:137:1: ruleSection : ( ( rule__Section__Alternatives ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:141:2: ( ( ( rule__Section__Alternatives ) ) )
            // InternalResume.g:142:2: ( ( rule__Section__Alternatives ) )
            {
            // InternalResume.g:142:2: ( ( rule__Section__Alternatives ) )
            // InternalResume.g:143:3: ( rule__Section__Alternatives )
            {
             before(grammarAccess.getSectionAccess().getAlternatives()); 
            // InternalResume.g:144:3: ( rule__Section__Alternatives )
            // InternalResume.g:144:4: rule__Section__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Section__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleExperience"
    // InternalResume.g:153:1: entryRuleExperience : ruleExperience EOF ;
    public final void entryRuleExperience() throws RecognitionException {
        try {
            // InternalResume.g:154:1: ( ruleExperience EOF )
            // InternalResume.g:155:1: ruleExperience EOF
            {
             before(grammarAccess.getExperienceRule()); 
            pushFollow(FOLLOW_1);
            ruleExperience();

            state._fsp--;

             after(grammarAccess.getExperienceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExperience"


    // $ANTLR start "ruleExperience"
    // InternalResume.g:162:1: ruleExperience : ( ( rule__Experience__Group__0 ) ) ;
    public final void ruleExperience() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:166:2: ( ( ( rule__Experience__Group__0 ) ) )
            // InternalResume.g:167:2: ( ( rule__Experience__Group__0 ) )
            {
            // InternalResume.g:167:2: ( ( rule__Experience__Group__0 ) )
            // InternalResume.g:168:3: ( rule__Experience__Group__0 )
            {
             before(grammarAccess.getExperienceAccess().getGroup()); 
            // InternalResume.g:169:3: ( rule__Experience__Group__0 )
            // InternalResume.g:169:4: rule__Experience__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Experience__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperience"


    // $ANTLR start "entryRuleJob"
    // InternalResume.g:178:1: entryRuleJob : ruleJob EOF ;
    public final void entryRuleJob() throws RecognitionException {
        try {
            // InternalResume.g:179:1: ( ruleJob EOF )
            // InternalResume.g:180:1: ruleJob EOF
            {
             before(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            ruleJob();

            state._fsp--;

             after(grammarAccess.getJobRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalResume.g:187:1: ruleJob : ( ( rule__Job__Group__0 ) ) ;
    public final void ruleJob() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:191:2: ( ( ( rule__Job__Group__0 ) ) )
            // InternalResume.g:192:2: ( ( rule__Job__Group__0 ) )
            {
            // InternalResume.g:192:2: ( ( rule__Job__Group__0 ) )
            // InternalResume.g:193:3: ( rule__Job__Group__0 )
            {
             before(grammarAccess.getJobAccess().getGroup()); 
            // InternalResume.g:194:3: ( rule__Job__Group__0 )
            // InternalResume.g:194:4: rule__Job__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Job__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleProjects"
    // InternalResume.g:203:1: entryRuleProjects : ruleProjects EOF ;
    public final void entryRuleProjects() throws RecognitionException {
        try {
            // InternalResume.g:204:1: ( ruleProjects EOF )
            // InternalResume.g:205:1: ruleProjects EOF
            {
             before(grammarAccess.getProjectsRule()); 
            pushFollow(FOLLOW_1);
            ruleProjects();

            state._fsp--;

             after(grammarAccess.getProjectsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProjects"


    // $ANTLR start "ruleProjects"
    // InternalResume.g:212:1: ruleProjects : ( ( rule__Projects__Group__0 ) ) ;
    public final void ruleProjects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:216:2: ( ( ( rule__Projects__Group__0 ) ) )
            // InternalResume.g:217:2: ( ( rule__Projects__Group__0 ) )
            {
            // InternalResume.g:217:2: ( ( rule__Projects__Group__0 ) )
            // InternalResume.g:218:3: ( rule__Projects__Group__0 )
            {
             before(grammarAccess.getProjectsAccess().getGroup()); 
            // InternalResume.g:219:3: ( rule__Projects__Group__0 )
            // InternalResume.g:219:4: rule__Projects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Projects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjects"


    // $ANTLR start "entryRuleProject"
    // InternalResume.g:228:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalResume.g:229:1: ( ruleProject EOF )
            // InternalResume.g:230:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalResume.g:237:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:241:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalResume.g:242:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalResume.g:242:2: ( ( rule__Project__Group__0 ) )
            // InternalResume.g:243:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalResume.g:244:3: ( rule__Project__Group__0 )
            // InternalResume.g:244:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEducation"
    // InternalResume.g:253:1: entryRuleEducation : ruleEducation EOF ;
    public final void entryRuleEducation() throws RecognitionException {
        try {
            // InternalResume.g:254:1: ( ruleEducation EOF )
            // InternalResume.g:255:1: ruleEducation EOF
            {
             before(grammarAccess.getEducationRule()); 
            pushFollow(FOLLOW_1);
            ruleEducation();

            state._fsp--;

             after(grammarAccess.getEducationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEducation"


    // $ANTLR start "ruleEducation"
    // InternalResume.g:262:1: ruleEducation : ( ( rule__Education__Group__0 ) ) ;
    public final void ruleEducation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:266:2: ( ( ( rule__Education__Group__0 ) ) )
            // InternalResume.g:267:2: ( ( rule__Education__Group__0 ) )
            {
            // InternalResume.g:267:2: ( ( rule__Education__Group__0 ) )
            // InternalResume.g:268:3: ( rule__Education__Group__0 )
            {
             before(grammarAccess.getEducationAccess().getGroup()); 
            // InternalResume.g:269:3: ( rule__Education__Group__0 )
            // InternalResume.g:269:4: rule__Education__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Education__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEducationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEducation"


    // $ANTLR start "entryRuleDegree"
    // InternalResume.g:278:1: entryRuleDegree : ruleDegree EOF ;
    public final void entryRuleDegree() throws RecognitionException {
        try {
            // InternalResume.g:279:1: ( ruleDegree EOF )
            // InternalResume.g:280:1: ruleDegree EOF
            {
             before(grammarAccess.getDegreeRule()); 
            pushFollow(FOLLOW_1);
            ruleDegree();

            state._fsp--;

             after(grammarAccess.getDegreeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDegree"


    // $ANTLR start "ruleDegree"
    // InternalResume.g:287:1: ruleDegree : ( ( rule__Degree__Group__0 ) ) ;
    public final void ruleDegree() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:291:2: ( ( ( rule__Degree__Group__0 ) ) )
            // InternalResume.g:292:2: ( ( rule__Degree__Group__0 ) )
            {
            // InternalResume.g:292:2: ( ( rule__Degree__Group__0 ) )
            // InternalResume.g:293:3: ( rule__Degree__Group__0 )
            {
             before(grammarAccess.getDegreeAccess().getGroup()); 
            // InternalResume.g:294:3: ( rule__Degree__Group__0 )
            // InternalResume.g:294:4: rule__Degree__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Degree__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDegree"


    // $ANTLR start "entryRuleSkills"
    // InternalResume.g:303:1: entryRuleSkills : ruleSkills EOF ;
    public final void entryRuleSkills() throws RecognitionException {
        try {
            // InternalResume.g:304:1: ( ruleSkills EOF )
            // InternalResume.g:305:1: ruleSkills EOF
            {
             before(grammarAccess.getSkillsRule()); 
            pushFollow(FOLLOW_1);
            ruleSkills();

            state._fsp--;

             after(grammarAccess.getSkillsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSkills"


    // $ANTLR start "ruleSkills"
    // InternalResume.g:312:1: ruleSkills : ( ( rule__Skills__Group__0 ) ) ;
    public final void ruleSkills() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:316:2: ( ( ( rule__Skills__Group__0 ) ) )
            // InternalResume.g:317:2: ( ( rule__Skills__Group__0 ) )
            {
            // InternalResume.g:317:2: ( ( rule__Skills__Group__0 ) )
            // InternalResume.g:318:3: ( rule__Skills__Group__0 )
            {
             before(grammarAccess.getSkillsAccess().getGroup()); 
            // InternalResume.g:319:3: ( rule__Skills__Group__0 )
            // InternalResume.g:319:4: rule__Skills__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Skills__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkills"


    // $ANTLR start "entryRuleSkill"
    // InternalResume.g:328:1: entryRuleSkill : ruleSkill EOF ;
    public final void entryRuleSkill() throws RecognitionException {
        try {
            // InternalResume.g:329:1: ( ruleSkill EOF )
            // InternalResume.g:330:1: ruleSkill EOF
            {
             before(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_1);
            ruleSkill();

            state._fsp--;

             after(grammarAccess.getSkillRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSkill"


    // $ANTLR start "ruleSkill"
    // InternalResume.g:337:1: ruleSkill : ( ( rule__Skill__Group__0 ) ) ;
    public final void ruleSkill() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:341:2: ( ( ( rule__Skill__Group__0 ) ) )
            // InternalResume.g:342:2: ( ( rule__Skill__Group__0 ) )
            {
            // InternalResume.g:342:2: ( ( rule__Skill__Group__0 ) )
            // InternalResume.g:343:3: ( rule__Skill__Group__0 )
            {
             before(grammarAccess.getSkillAccess().getGroup()); 
            // InternalResume.g:344:3: ( rule__Skill__Group__0 )
            // InternalResume.g:344:4: rule__Skill__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Skill__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkill"


    // $ANTLR start "entryRuleInterests"
    // InternalResume.g:353:1: entryRuleInterests : ruleInterests EOF ;
    public final void entryRuleInterests() throws RecognitionException {
        try {
            // InternalResume.g:354:1: ( ruleInterests EOF )
            // InternalResume.g:355:1: ruleInterests EOF
            {
             before(grammarAccess.getInterestsRule()); 
            pushFollow(FOLLOW_1);
            ruleInterests();

            state._fsp--;

             after(grammarAccess.getInterestsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterests"


    // $ANTLR start "ruleInterests"
    // InternalResume.g:362:1: ruleInterests : ( ( rule__Interests__Group__0 ) ) ;
    public final void ruleInterests() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:366:2: ( ( ( rule__Interests__Group__0 ) ) )
            // InternalResume.g:367:2: ( ( rule__Interests__Group__0 ) )
            {
            // InternalResume.g:367:2: ( ( rule__Interests__Group__0 ) )
            // InternalResume.g:368:3: ( rule__Interests__Group__0 )
            {
             before(grammarAccess.getInterestsAccess().getGroup()); 
            // InternalResume.g:369:3: ( rule__Interests__Group__0 )
            // InternalResume.g:369:4: rule__Interests__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interests__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterestsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterests"


    // $ANTLR start "entryRuleLanguages"
    // InternalResume.g:378:1: entryRuleLanguages : ruleLanguages EOF ;
    public final void entryRuleLanguages() throws RecognitionException {
        try {
            // InternalResume.g:379:1: ( ruleLanguages EOF )
            // InternalResume.g:380:1: ruleLanguages EOF
            {
             before(grammarAccess.getLanguagesRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguages();

            state._fsp--;

             after(grammarAccess.getLanguagesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguages"


    // $ANTLR start "ruleLanguages"
    // InternalResume.g:387:1: ruleLanguages : ( ( rule__Languages__Group__0 ) ) ;
    public final void ruleLanguages() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:391:2: ( ( ( rule__Languages__Group__0 ) ) )
            // InternalResume.g:392:2: ( ( rule__Languages__Group__0 ) )
            {
            // InternalResume.g:392:2: ( ( rule__Languages__Group__0 ) )
            // InternalResume.g:393:3: ( rule__Languages__Group__0 )
            {
             before(grammarAccess.getLanguagesAccess().getGroup()); 
            // InternalResume.g:394:3: ( rule__Languages__Group__0 )
            // InternalResume.g:394:4: rule__Languages__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Languages__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguagesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguages"


    // $ANTLR start "entryRuleMetrics"
    // InternalResume.g:403:1: entryRuleMetrics : ruleMetrics EOF ;
    public final void entryRuleMetrics() throws RecognitionException {
        try {
            // InternalResume.g:404:1: ( ruleMetrics EOF )
            // InternalResume.g:405:1: ruleMetrics EOF
            {
             before(grammarAccess.getMetricsRule()); 
            pushFollow(FOLLOW_1);
            ruleMetrics();

            state._fsp--;

             after(grammarAccess.getMetricsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetrics"


    // $ANTLR start "ruleMetrics"
    // InternalResume.g:412:1: ruleMetrics : ( ( rule__Metrics__Group__0 ) ) ;
    public final void ruleMetrics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:416:2: ( ( ( rule__Metrics__Group__0 ) ) )
            // InternalResume.g:417:2: ( ( rule__Metrics__Group__0 ) )
            {
            // InternalResume.g:417:2: ( ( rule__Metrics__Group__0 ) )
            // InternalResume.g:418:3: ( rule__Metrics__Group__0 )
            {
             before(grammarAccess.getMetricsAccess().getGroup()); 
            // InternalResume.g:419:3: ( rule__Metrics__Group__0 )
            // InternalResume.g:419:4: rule__Metrics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metrics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetricsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetrics"


    // $ANTLR start "entryRuleMetric"
    // InternalResume.g:428:1: entryRuleMetric : ruleMetric EOF ;
    public final void entryRuleMetric() throws RecognitionException {
        try {
            // InternalResume.g:429:1: ( ruleMetric EOF )
            // InternalResume.g:430:1: ruleMetric EOF
            {
             before(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_1);
            ruleMetric();

            state._fsp--;

             after(grammarAccess.getMetricRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalResume.g:437:1: ruleMetric : ( ( rule__Metric__Group__0 ) ) ;
    public final void ruleMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:441:2: ( ( ( rule__Metric__Group__0 ) ) )
            // InternalResume.g:442:2: ( ( rule__Metric__Group__0 ) )
            {
            // InternalResume.g:442:2: ( ( rule__Metric__Group__0 ) )
            // InternalResume.g:443:3: ( rule__Metric__Group__0 )
            {
             before(grammarAccess.getMetricAccess().getGroup()); 
            // InternalResume.g:444:3: ( rule__Metric__Group__0 )
            // InternalResume.g:444:4: rule__Metric__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetricAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleExpression"
    // InternalResume.g:453:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalResume.g:454:1: ( ruleExpression EOF )
            // InternalResume.g:455:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalResume.g:462:1: ruleExpression : ( ruleSubtraction ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:466:2: ( ( ruleSubtraction ) )
            // InternalResume.g:467:2: ( ruleSubtraction )
            {
            // InternalResume.g:467:2: ( ruleSubtraction )
            // InternalResume.g:468:3: ruleSubtraction
            {
             before(grammarAccess.getExpressionAccess().getSubtractionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSubtractionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSubtraction"
    // InternalResume.g:478:1: entryRuleSubtraction : ruleSubtraction EOF ;
    public final void entryRuleSubtraction() throws RecognitionException {
        try {
            // InternalResume.g:479:1: ( ruleSubtraction EOF )
            // InternalResume.g:480:1: ruleSubtraction EOF
            {
             before(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_1);
            ruleSubtraction();

            state._fsp--;

             after(grammarAccess.getSubtractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // InternalResume.g:487:1: ruleSubtraction : ( ( rule__Subtraction__Group__0 ) ) ;
    public final void ruleSubtraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:491:2: ( ( ( rule__Subtraction__Group__0 ) ) )
            // InternalResume.g:492:2: ( ( rule__Subtraction__Group__0 ) )
            {
            // InternalResume.g:492:2: ( ( rule__Subtraction__Group__0 ) )
            // InternalResume.g:493:3: ( rule__Subtraction__Group__0 )
            {
             before(grammarAccess.getSubtractionAccess().getGroup()); 
            // InternalResume.g:494:3: ( rule__Subtraction__Group__0 )
            // InternalResume.g:494:4: rule__Subtraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalResume.g:503:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalResume.g:504:1: ( ruleNumberLiteral EOF )
            // InternalResume.g:505:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalResume.g:512:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:516:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // InternalResume.g:517:2: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // InternalResume.g:517:2: ( ( rule__NumberLiteral__Group__0 ) )
            // InternalResume.g:518:3: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // InternalResume.g:519:3: ( rule__NumberLiteral__Group__0 )
            // InternalResume.g:519:4: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleCustomization"
    // InternalResume.g:528:1: entryRuleCustomization : ruleCustomization EOF ;
    public final void entryRuleCustomization() throws RecognitionException {
        try {
            // InternalResume.g:529:1: ( ruleCustomization EOF )
            // InternalResume.g:530:1: ruleCustomization EOF
            {
             before(grammarAccess.getCustomizationRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomization();

            state._fsp--;

             after(grammarAccess.getCustomizationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomization"


    // $ANTLR start "ruleCustomization"
    // InternalResume.g:537:1: ruleCustomization : ( ( rule__Customization__Group__0 ) ) ;
    public final void ruleCustomization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:541:2: ( ( ( rule__Customization__Group__0 ) ) )
            // InternalResume.g:542:2: ( ( rule__Customization__Group__0 ) )
            {
            // InternalResume.g:542:2: ( ( rule__Customization__Group__0 ) )
            // InternalResume.g:543:3: ( rule__Customization__Group__0 )
            {
             before(grammarAccess.getCustomizationAccess().getGroup()); 
            // InternalResume.g:544:3: ( rule__Customization__Group__0 )
            // InternalResume.g:544:4: rule__Customization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Customization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomization"


    // $ANTLR start "entryRuleStringList"
    // InternalResume.g:553:1: entryRuleStringList : ruleStringList EOF ;
    public final void entryRuleStringList() throws RecognitionException {
        try {
            // InternalResume.g:554:1: ( ruleStringList EOF )
            // InternalResume.g:555:1: ruleStringList EOF
            {
             before(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_1);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getStringListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringList"


    // $ANTLR start "ruleStringList"
    // InternalResume.g:562:1: ruleStringList : ( ( rule__StringList__Group__0 ) ) ;
    public final void ruleStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:566:2: ( ( ( rule__StringList__Group__0 ) ) )
            // InternalResume.g:567:2: ( ( rule__StringList__Group__0 ) )
            {
            // InternalResume.g:567:2: ( ( rule__StringList__Group__0 ) )
            // InternalResume.g:568:3: ( rule__StringList__Group__0 )
            {
             before(grammarAccess.getStringListAccess().getGroup()); 
            // InternalResume.g:569:3: ( rule__StringList__Group__0 )
            // InternalResume.g:569:4: rule__StringList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringList"


    // $ANTLR start "entryRuleDate"
    // InternalResume.g:578:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalResume.g:579:1: ( ruleDate EOF )
            // InternalResume.g:580:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalResume.g:587:1: ruleDate : ( RULE_STRING ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:591:2: ( ( RULE_STRING ) )
            // InternalResume.g:592:2: ( RULE_STRING )
            {
            // InternalResume.g:592:2: ( RULE_STRING )
            // InternalResume.g:593:3: RULE_STRING
            {
             before(grammarAccess.getDateAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "rule__Section__Alternatives"
    // InternalResume.g:602:1: rule__Section__Alternatives : ( ( ruleExperience ) | ( ruleProjects ) | ( ruleEducation ) | ( ruleSkills ) | ( ruleInterests ) | ( ruleLanguages ) | ( ruleMetrics ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:606:1: ( ( ruleExperience ) | ( ruleProjects ) | ( ruleEducation ) | ( ruleSkills ) | ( ruleInterests ) | ( ruleLanguages ) | ( ruleMetrics ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 35:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            case 39:
                {
                alt1=5;
                }
                break;
            case 40:
                {
                alt1=6;
                }
                break;
            case 41:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalResume.g:607:2: ( ruleExperience )
                    {
                    // InternalResume.g:607:2: ( ruleExperience )
                    // InternalResume.g:608:3: ruleExperience
                    {
                     before(grammarAccess.getSectionAccess().getExperienceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExperience();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getExperienceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalResume.g:613:2: ( ruleProjects )
                    {
                    // InternalResume.g:613:2: ( ruleProjects )
                    // InternalResume.g:614:3: ruleProjects
                    {
                     before(grammarAccess.getSectionAccess().getProjectsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProjects();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getProjectsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalResume.g:619:2: ( ruleEducation )
                    {
                    // InternalResume.g:619:2: ( ruleEducation )
                    // InternalResume.g:620:3: ruleEducation
                    {
                     before(grammarAccess.getSectionAccess().getEducationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEducation();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getEducationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalResume.g:625:2: ( ruleSkills )
                    {
                    // InternalResume.g:625:2: ( ruleSkills )
                    // InternalResume.g:626:3: ruleSkills
                    {
                     before(grammarAccess.getSectionAccess().getSkillsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSkills();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getSkillsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalResume.g:631:2: ( ruleInterests )
                    {
                    // InternalResume.g:631:2: ( ruleInterests )
                    // InternalResume.g:632:3: ruleInterests
                    {
                     before(grammarAccess.getSectionAccess().getInterestsParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInterests();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getInterestsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalResume.g:637:2: ( ruleLanguages )
                    {
                    // InternalResume.g:637:2: ( ruleLanguages )
                    // InternalResume.g:638:3: ruleLanguages
                    {
                     before(grammarAccess.getSectionAccess().getLanguagesParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleLanguages();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getLanguagesParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalResume.g:643:2: ( ruleMetrics )
                    {
                    // InternalResume.g:643:2: ( ruleMetrics )
                    // InternalResume.g:644:3: ruleMetrics
                    {
                     before(grammarAccess.getSectionAccess().getMetricsParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleMetrics();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getMetricsParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Alternatives"


    // $ANTLR start "rule__Profile__Group__0"
    // InternalResume.g:653:1: rule__Profile__Group__0 : rule__Profile__Group__0__Impl rule__Profile__Group__1 ;
    public final void rule__Profile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:657:1: ( rule__Profile__Group__0__Impl rule__Profile__Group__1 )
            // InternalResume.g:658:2: rule__Profile__Group__0__Impl rule__Profile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Profile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__0"


    // $ANTLR start "rule__Profile__Group__0__Impl"
    // InternalResume.g:665:1: rule__Profile__Group__0__Impl : ( ( rule__Profile__MetadataAssignment_0 ) ) ;
    public final void rule__Profile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:669:1: ( ( ( rule__Profile__MetadataAssignment_0 ) ) )
            // InternalResume.g:670:1: ( ( rule__Profile__MetadataAssignment_0 ) )
            {
            // InternalResume.g:670:1: ( ( rule__Profile__MetadataAssignment_0 ) )
            // InternalResume.g:671:2: ( rule__Profile__MetadataAssignment_0 )
            {
             before(grammarAccess.getProfileAccess().getMetadataAssignment_0()); 
            // InternalResume.g:672:2: ( rule__Profile__MetadataAssignment_0 )
            // InternalResume.g:672:3: rule__Profile__MetadataAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Profile__MetadataAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getMetadataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__0__Impl"


    // $ANTLR start "rule__Profile__Group__1"
    // InternalResume.g:680:1: rule__Profile__Group__1 : rule__Profile__Group__1__Impl rule__Profile__Group__2 ;
    public final void rule__Profile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:684:1: ( rule__Profile__Group__1__Impl rule__Profile__Group__2 )
            // InternalResume.g:685:2: rule__Profile__Group__1__Impl rule__Profile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Profile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__1"


    // $ANTLR start "rule__Profile__Group__1__Impl"
    // InternalResume.g:692:1: rule__Profile__Group__1__Impl : ( ( rule__Profile__UserdataAssignment_1 ) ) ;
    public final void rule__Profile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:696:1: ( ( ( rule__Profile__UserdataAssignment_1 ) ) )
            // InternalResume.g:697:1: ( ( rule__Profile__UserdataAssignment_1 ) )
            {
            // InternalResume.g:697:1: ( ( rule__Profile__UserdataAssignment_1 ) )
            // InternalResume.g:698:2: ( rule__Profile__UserdataAssignment_1 )
            {
             before(grammarAccess.getProfileAccess().getUserdataAssignment_1()); 
            // InternalResume.g:699:2: ( rule__Profile__UserdataAssignment_1 )
            // InternalResume.g:699:3: rule__Profile__UserdataAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Profile__UserdataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getUserdataAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__1__Impl"


    // $ANTLR start "rule__Profile__Group__2"
    // InternalResume.g:707:1: rule__Profile__Group__2 : rule__Profile__Group__2__Impl rule__Profile__Group__3 ;
    public final void rule__Profile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:711:1: ( rule__Profile__Group__2__Impl rule__Profile__Group__3 )
            // InternalResume.g:712:2: rule__Profile__Group__2__Impl rule__Profile__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Profile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__2"


    // $ANTLR start "rule__Profile__Group__2__Impl"
    // InternalResume.g:719:1: rule__Profile__Group__2__Impl : ( ( ( rule__Profile__SectionsAssignment_2 ) ) ( ( rule__Profile__SectionsAssignment_2 )* ) ) ;
    public final void rule__Profile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:723:1: ( ( ( ( rule__Profile__SectionsAssignment_2 ) ) ( ( rule__Profile__SectionsAssignment_2 )* ) ) )
            // InternalResume.g:724:1: ( ( ( rule__Profile__SectionsAssignment_2 ) ) ( ( rule__Profile__SectionsAssignment_2 )* ) )
            {
            // InternalResume.g:724:1: ( ( ( rule__Profile__SectionsAssignment_2 ) ) ( ( rule__Profile__SectionsAssignment_2 )* ) )
            // InternalResume.g:725:2: ( ( rule__Profile__SectionsAssignment_2 ) ) ( ( rule__Profile__SectionsAssignment_2 )* )
            {
            // InternalResume.g:725:2: ( ( rule__Profile__SectionsAssignment_2 ) )
            // InternalResume.g:726:3: ( rule__Profile__SectionsAssignment_2 )
            {
             before(grammarAccess.getProfileAccess().getSectionsAssignment_2()); 
            // InternalResume.g:727:3: ( rule__Profile__SectionsAssignment_2 )
            // InternalResume.g:727:4: rule__Profile__SectionsAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Profile__SectionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getSectionsAssignment_2()); 

            }

            // InternalResume.g:730:2: ( ( rule__Profile__SectionsAssignment_2 )* )
            // InternalResume.g:731:3: ( rule__Profile__SectionsAssignment_2 )*
            {
             before(grammarAccess.getProfileAccess().getSectionsAssignment_2()); 
            // InternalResume.g:732:3: ( rule__Profile__SectionsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22||LA2_0==30||LA2_0==35||(LA2_0>=38 && LA2_0<=41)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalResume.g:732:4: rule__Profile__SectionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Profile__SectionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProfileAccess().getSectionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__2__Impl"


    // $ANTLR start "rule__Profile__Group__3"
    // InternalResume.g:741:1: rule__Profile__Group__3 : rule__Profile__Group__3__Impl ;
    public final void rule__Profile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:745:1: ( rule__Profile__Group__3__Impl )
            // InternalResume.g:746:2: rule__Profile__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__3"


    // $ANTLR start "rule__Profile__Group__3__Impl"
    // InternalResume.g:752:1: rule__Profile__Group__3__Impl : ( ( rule__Profile__CustomizationAssignment_3 ) ) ;
    public final void rule__Profile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:756:1: ( ( ( rule__Profile__CustomizationAssignment_3 ) ) )
            // InternalResume.g:757:1: ( ( rule__Profile__CustomizationAssignment_3 ) )
            {
            // InternalResume.g:757:1: ( ( rule__Profile__CustomizationAssignment_3 ) )
            // InternalResume.g:758:2: ( rule__Profile__CustomizationAssignment_3 )
            {
             before(grammarAccess.getProfileAccess().getCustomizationAssignment_3()); 
            // InternalResume.g:759:2: ( rule__Profile__CustomizationAssignment_3 )
            // InternalResume.g:759:3: rule__Profile__CustomizationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Profile__CustomizationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getCustomizationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__3__Impl"


    // $ANTLR start "rule__Metadata__Group__0"
    // InternalResume.g:768:1: rule__Metadata__Group__0 : rule__Metadata__Group__0__Impl rule__Metadata__Group__1 ;
    public final void rule__Metadata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:772:1: ( rule__Metadata__Group__0__Impl rule__Metadata__Group__1 )
            // InternalResume.g:773:2: rule__Metadata__Group__0__Impl rule__Metadata__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Metadata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__0"


    // $ANTLR start "rule__Metadata__Group__0__Impl"
    // InternalResume.g:780:1: rule__Metadata__Group__0__Impl : ( 'Metadata' ) ;
    public final void rule__Metadata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:784:1: ( ( 'Metadata' ) )
            // InternalResume.g:785:1: ( 'Metadata' )
            {
            // InternalResume.g:785:1: ( 'Metadata' )
            // InternalResume.g:786:2: 'Metadata'
            {
             before(grammarAccess.getMetadataAccess().getMetadataKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getMetadataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__0__Impl"


    // $ANTLR start "rule__Metadata__Group__1"
    // InternalResume.g:795:1: rule__Metadata__Group__1 : rule__Metadata__Group__1__Impl rule__Metadata__Group__2 ;
    public final void rule__Metadata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:799:1: ( rule__Metadata__Group__1__Impl rule__Metadata__Group__2 )
            // InternalResume.g:800:2: rule__Metadata__Group__1__Impl rule__Metadata__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Metadata__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__1"


    // $ANTLR start "rule__Metadata__Group__1__Impl"
    // InternalResume.g:807:1: rule__Metadata__Group__1__Impl : ( 'style:' ) ;
    public final void rule__Metadata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:811:1: ( ( 'style:' ) )
            // InternalResume.g:812:1: ( 'style:' )
            {
            // InternalResume.g:812:1: ( 'style:' )
            // InternalResume.g:813:2: 'style:'
            {
             before(grammarAccess.getMetadataAccess().getStyleKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getStyleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__1__Impl"


    // $ANTLR start "rule__Metadata__Group__2"
    // InternalResume.g:822:1: rule__Metadata__Group__2 : rule__Metadata__Group__2__Impl rule__Metadata__Group__3 ;
    public final void rule__Metadata__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:826:1: ( rule__Metadata__Group__2__Impl rule__Metadata__Group__3 )
            // InternalResume.g:827:2: rule__Metadata__Group__2__Impl rule__Metadata__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Metadata__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__2"


    // $ANTLR start "rule__Metadata__Group__2__Impl"
    // InternalResume.g:834:1: rule__Metadata__Group__2__Impl : ( ( rule__Metadata__StyleAssignment_2 ) ) ;
    public final void rule__Metadata__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:838:1: ( ( ( rule__Metadata__StyleAssignment_2 ) ) )
            // InternalResume.g:839:1: ( ( rule__Metadata__StyleAssignment_2 ) )
            {
            // InternalResume.g:839:1: ( ( rule__Metadata__StyleAssignment_2 ) )
            // InternalResume.g:840:2: ( rule__Metadata__StyleAssignment_2 )
            {
             before(grammarAccess.getMetadataAccess().getStyleAssignment_2()); 
            // InternalResume.g:841:2: ( rule__Metadata__StyleAssignment_2 )
            // InternalResume.g:841:3: rule__Metadata__StyleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__StyleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getStyleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__2__Impl"


    // $ANTLR start "rule__Metadata__Group__3"
    // InternalResume.g:849:1: rule__Metadata__Group__3 : rule__Metadata__Group__3__Impl rule__Metadata__Group__4 ;
    public final void rule__Metadata__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:853:1: ( rule__Metadata__Group__3__Impl rule__Metadata__Group__4 )
            // InternalResume.g:854:2: rule__Metadata__Group__3__Impl rule__Metadata__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Metadata__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__3"


    // $ANTLR start "rule__Metadata__Group__3__Impl"
    // InternalResume.g:861:1: rule__Metadata__Group__3__Impl : ( 'font:' ) ;
    public final void rule__Metadata__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:865:1: ( ( 'font:' ) )
            // InternalResume.g:866:1: ( 'font:' )
            {
            // InternalResume.g:866:1: ( 'font:' )
            // InternalResume.g:867:2: 'font:'
            {
             before(grammarAccess.getMetadataAccess().getFontKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getFontKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__3__Impl"


    // $ANTLR start "rule__Metadata__Group__4"
    // InternalResume.g:876:1: rule__Metadata__Group__4 : rule__Metadata__Group__4__Impl rule__Metadata__Group__5 ;
    public final void rule__Metadata__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:880:1: ( rule__Metadata__Group__4__Impl rule__Metadata__Group__5 )
            // InternalResume.g:881:2: rule__Metadata__Group__4__Impl rule__Metadata__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Metadata__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__4"


    // $ANTLR start "rule__Metadata__Group__4__Impl"
    // InternalResume.g:888:1: rule__Metadata__Group__4__Impl : ( ( rule__Metadata__FontAssignment_4 ) ) ;
    public final void rule__Metadata__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:892:1: ( ( ( rule__Metadata__FontAssignment_4 ) ) )
            // InternalResume.g:893:1: ( ( rule__Metadata__FontAssignment_4 ) )
            {
            // InternalResume.g:893:1: ( ( rule__Metadata__FontAssignment_4 ) )
            // InternalResume.g:894:2: ( rule__Metadata__FontAssignment_4 )
            {
             before(grammarAccess.getMetadataAccess().getFontAssignment_4()); 
            // InternalResume.g:895:2: ( rule__Metadata__FontAssignment_4 )
            // InternalResume.g:895:3: rule__Metadata__FontAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__FontAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getFontAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__4__Impl"


    // $ANTLR start "rule__Metadata__Group__5"
    // InternalResume.g:903:1: rule__Metadata__Group__5 : rule__Metadata__Group__5__Impl rule__Metadata__Group__6 ;
    public final void rule__Metadata__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:907:1: ( rule__Metadata__Group__5__Impl rule__Metadata__Group__6 )
            // InternalResume.g:908:2: rule__Metadata__Group__5__Impl rule__Metadata__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Metadata__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metadata__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__5"


    // $ANTLR start "rule__Metadata__Group__5__Impl"
    // InternalResume.g:915:1: rule__Metadata__Group__5__Impl : ( 'imgPath:' ) ;
    public final void rule__Metadata__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:919:1: ( ( 'imgPath:' ) )
            // InternalResume.g:920:1: ( 'imgPath:' )
            {
            // InternalResume.g:920:1: ( 'imgPath:' )
            // InternalResume.g:921:2: 'imgPath:'
            {
             before(grammarAccess.getMetadataAccess().getImgPathKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getImgPathKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__5__Impl"


    // $ANTLR start "rule__Metadata__Group__6"
    // InternalResume.g:930:1: rule__Metadata__Group__6 : rule__Metadata__Group__6__Impl ;
    public final void rule__Metadata__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:934:1: ( rule__Metadata__Group__6__Impl )
            // InternalResume.g:935:2: rule__Metadata__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__6"


    // $ANTLR start "rule__Metadata__Group__6__Impl"
    // InternalResume.g:941:1: rule__Metadata__Group__6__Impl : ( ( rule__Metadata__ImgPathAssignment_6 ) ) ;
    public final void rule__Metadata__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:945:1: ( ( ( rule__Metadata__ImgPathAssignment_6 ) ) )
            // InternalResume.g:946:1: ( ( rule__Metadata__ImgPathAssignment_6 ) )
            {
            // InternalResume.g:946:1: ( ( rule__Metadata__ImgPathAssignment_6 ) )
            // InternalResume.g:947:2: ( rule__Metadata__ImgPathAssignment_6 )
            {
             before(grammarAccess.getMetadataAccess().getImgPathAssignment_6()); 
            // InternalResume.g:948:2: ( rule__Metadata__ImgPathAssignment_6 )
            // InternalResume.g:948:3: rule__Metadata__ImgPathAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Metadata__ImgPathAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getImgPathAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__6__Impl"


    // $ANTLR start "rule__Userdata__Group__0"
    // InternalResume.g:957:1: rule__Userdata__Group__0 : rule__Userdata__Group__0__Impl rule__Userdata__Group__1 ;
    public final void rule__Userdata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:961:1: ( rule__Userdata__Group__0__Impl rule__Userdata__Group__1 )
            // InternalResume.g:962:2: rule__Userdata__Group__0__Impl rule__Userdata__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Userdata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__0"


    // $ANTLR start "rule__Userdata__Group__0__Impl"
    // InternalResume.g:969:1: rule__Userdata__Group__0__Impl : ( 'Userdata' ) ;
    public final void rule__Userdata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:973:1: ( ( 'Userdata' ) )
            // InternalResume.g:974:1: ( 'Userdata' )
            {
            // InternalResume.g:974:1: ( 'Userdata' )
            // InternalResume.g:975:2: 'Userdata'
            {
             before(grammarAccess.getUserdataAccess().getUserdataKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getUserdataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__0__Impl"


    // $ANTLR start "rule__Userdata__Group__1"
    // InternalResume.g:984:1: rule__Userdata__Group__1 : rule__Userdata__Group__1__Impl rule__Userdata__Group__2 ;
    public final void rule__Userdata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:988:1: ( rule__Userdata__Group__1__Impl rule__Userdata__Group__2 )
            // InternalResume.g:989:2: rule__Userdata__Group__1__Impl rule__Userdata__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__1"


    // $ANTLR start "rule__Userdata__Group__1__Impl"
    // InternalResume.g:996:1: rule__Userdata__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Userdata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1000:1: ( ( 'name:' ) )
            // InternalResume.g:1001:1: ( 'name:' )
            {
            // InternalResume.g:1001:1: ( 'name:' )
            // InternalResume.g:1002:2: 'name:'
            {
             before(grammarAccess.getUserdataAccess().getNameKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__1__Impl"


    // $ANTLR start "rule__Userdata__Group__2"
    // InternalResume.g:1011:1: rule__Userdata__Group__2 : rule__Userdata__Group__2__Impl rule__Userdata__Group__3 ;
    public final void rule__Userdata__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1015:1: ( rule__Userdata__Group__2__Impl rule__Userdata__Group__3 )
            // InternalResume.g:1016:2: rule__Userdata__Group__2__Impl rule__Userdata__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Userdata__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__2"


    // $ANTLR start "rule__Userdata__Group__2__Impl"
    // InternalResume.g:1023:1: rule__Userdata__Group__2__Impl : ( ( rule__Userdata__NameAssignment_2 ) ) ;
    public final void rule__Userdata__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1027:1: ( ( ( rule__Userdata__NameAssignment_2 ) ) )
            // InternalResume.g:1028:1: ( ( rule__Userdata__NameAssignment_2 ) )
            {
            // InternalResume.g:1028:1: ( ( rule__Userdata__NameAssignment_2 ) )
            // InternalResume.g:1029:2: ( rule__Userdata__NameAssignment_2 )
            {
             before(grammarAccess.getUserdataAccess().getNameAssignment_2()); 
            // InternalResume.g:1030:2: ( rule__Userdata__NameAssignment_2 )
            // InternalResume.g:1030:3: rule__Userdata__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__2__Impl"


    // $ANTLR start "rule__Userdata__Group__3"
    // InternalResume.g:1038:1: rule__Userdata__Group__3 : rule__Userdata__Group__3__Impl rule__Userdata__Group__4 ;
    public final void rule__Userdata__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1042:1: ( rule__Userdata__Group__3__Impl rule__Userdata__Group__4 )
            // InternalResume.g:1043:2: rule__Userdata__Group__3__Impl rule__Userdata__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__3"


    // $ANTLR start "rule__Userdata__Group__3__Impl"
    // InternalResume.g:1050:1: rule__Userdata__Group__3__Impl : ( 'email:' ) ;
    public final void rule__Userdata__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1054:1: ( ( 'email:' ) )
            // InternalResume.g:1055:1: ( 'email:' )
            {
            // InternalResume.g:1055:1: ( 'email:' )
            // InternalResume.g:1056:2: 'email:'
            {
             before(grammarAccess.getUserdataAccess().getEmailKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getEmailKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__3__Impl"


    // $ANTLR start "rule__Userdata__Group__4"
    // InternalResume.g:1065:1: rule__Userdata__Group__4 : rule__Userdata__Group__4__Impl rule__Userdata__Group__5 ;
    public final void rule__Userdata__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1069:1: ( rule__Userdata__Group__4__Impl rule__Userdata__Group__5 )
            // InternalResume.g:1070:2: rule__Userdata__Group__4__Impl rule__Userdata__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Userdata__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__4"


    // $ANTLR start "rule__Userdata__Group__4__Impl"
    // InternalResume.g:1077:1: rule__Userdata__Group__4__Impl : ( ( rule__Userdata__EmailAssignment_4 ) ) ;
    public final void rule__Userdata__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1081:1: ( ( ( rule__Userdata__EmailAssignment_4 ) ) )
            // InternalResume.g:1082:1: ( ( rule__Userdata__EmailAssignment_4 ) )
            {
            // InternalResume.g:1082:1: ( ( rule__Userdata__EmailAssignment_4 ) )
            // InternalResume.g:1083:2: ( rule__Userdata__EmailAssignment_4 )
            {
             before(grammarAccess.getUserdataAccess().getEmailAssignment_4()); 
            // InternalResume.g:1084:2: ( rule__Userdata__EmailAssignment_4 )
            // InternalResume.g:1084:3: rule__Userdata__EmailAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__EmailAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getEmailAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__4__Impl"


    // $ANTLR start "rule__Userdata__Group__5"
    // InternalResume.g:1092:1: rule__Userdata__Group__5 : rule__Userdata__Group__5__Impl rule__Userdata__Group__6 ;
    public final void rule__Userdata__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1096:1: ( rule__Userdata__Group__5__Impl rule__Userdata__Group__6 )
            // InternalResume.g:1097:2: rule__Userdata__Group__5__Impl rule__Userdata__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__5"


    // $ANTLR start "rule__Userdata__Group__5__Impl"
    // InternalResume.g:1104:1: rule__Userdata__Group__5__Impl : ( 'telephoneNumber:' ) ;
    public final void rule__Userdata__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1108:1: ( ( 'telephoneNumber:' ) )
            // InternalResume.g:1109:1: ( 'telephoneNumber:' )
            {
            // InternalResume.g:1109:1: ( 'telephoneNumber:' )
            // InternalResume.g:1110:2: 'telephoneNumber:'
            {
             before(grammarAccess.getUserdataAccess().getTelephoneNumberKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getTelephoneNumberKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__5__Impl"


    // $ANTLR start "rule__Userdata__Group__6"
    // InternalResume.g:1119:1: rule__Userdata__Group__6 : rule__Userdata__Group__6__Impl rule__Userdata__Group__7 ;
    public final void rule__Userdata__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1123:1: ( rule__Userdata__Group__6__Impl rule__Userdata__Group__7 )
            // InternalResume.g:1124:2: rule__Userdata__Group__6__Impl rule__Userdata__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Userdata__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__6"


    // $ANTLR start "rule__Userdata__Group__6__Impl"
    // InternalResume.g:1131:1: rule__Userdata__Group__6__Impl : ( ( rule__Userdata__TelephoneNumberAssignment_6 ) ) ;
    public final void rule__Userdata__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1135:1: ( ( ( rule__Userdata__TelephoneNumberAssignment_6 ) ) )
            // InternalResume.g:1136:1: ( ( rule__Userdata__TelephoneNumberAssignment_6 ) )
            {
            // InternalResume.g:1136:1: ( ( rule__Userdata__TelephoneNumberAssignment_6 ) )
            // InternalResume.g:1137:2: ( rule__Userdata__TelephoneNumberAssignment_6 )
            {
             before(grammarAccess.getUserdataAccess().getTelephoneNumberAssignment_6()); 
            // InternalResume.g:1138:2: ( rule__Userdata__TelephoneNumberAssignment_6 )
            // InternalResume.g:1138:3: rule__Userdata__TelephoneNumberAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__TelephoneNumberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getTelephoneNumberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__6__Impl"


    // $ANTLR start "rule__Userdata__Group__7"
    // InternalResume.g:1146:1: rule__Userdata__Group__7 : rule__Userdata__Group__7__Impl rule__Userdata__Group__8 ;
    public final void rule__Userdata__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1150:1: ( rule__Userdata__Group__7__Impl rule__Userdata__Group__8 )
            // InternalResume.g:1151:2: rule__Userdata__Group__7__Impl rule__Userdata__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__7"


    // $ANTLR start "rule__Userdata__Group__7__Impl"
    // InternalResume.g:1158:1: rule__Userdata__Group__7__Impl : ( 'direction:' ) ;
    public final void rule__Userdata__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1162:1: ( ( 'direction:' ) )
            // InternalResume.g:1163:1: ( 'direction:' )
            {
            // InternalResume.g:1163:1: ( 'direction:' )
            // InternalResume.g:1164:2: 'direction:'
            {
             before(grammarAccess.getUserdataAccess().getDirectionKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getDirectionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__7__Impl"


    // $ANTLR start "rule__Userdata__Group__8"
    // InternalResume.g:1173:1: rule__Userdata__Group__8 : rule__Userdata__Group__8__Impl rule__Userdata__Group__9 ;
    public final void rule__Userdata__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1177:1: ( rule__Userdata__Group__8__Impl rule__Userdata__Group__9 )
            // InternalResume.g:1178:2: rule__Userdata__Group__8__Impl rule__Userdata__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Userdata__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__8"


    // $ANTLR start "rule__Userdata__Group__8__Impl"
    // InternalResume.g:1185:1: rule__Userdata__Group__8__Impl : ( ( rule__Userdata__DirectionAssignment_8 ) ) ;
    public final void rule__Userdata__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1189:1: ( ( ( rule__Userdata__DirectionAssignment_8 ) ) )
            // InternalResume.g:1190:1: ( ( rule__Userdata__DirectionAssignment_8 ) )
            {
            // InternalResume.g:1190:1: ( ( rule__Userdata__DirectionAssignment_8 ) )
            // InternalResume.g:1191:2: ( rule__Userdata__DirectionAssignment_8 )
            {
             before(grammarAccess.getUserdataAccess().getDirectionAssignment_8()); 
            // InternalResume.g:1192:2: ( rule__Userdata__DirectionAssignment_8 )
            // InternalResume.g:1192:3: rule__Userdata__DirectionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__DirectionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getDirectionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__8__Impl"


    // $ANTLR start "rule__Userdata__Group__9"
    // InternalResume.g:1200:1: rule__Userdata__Group__9 : rule__Userdata__Group__9__Impl rule__Userdata__Group__10 ;
    public final void rule__Userdata__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1204:1: ( rule__Userdata__Group__9__Impl rule__Userdata__Group__10 )
            // InternalResume.g:1205:2: rule__Userdata__Group__9__Impl rule__Userdata__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__9"


    // $ANTLR start "rule__Userdata__Group__9__Impl"
    // InternalResume.g:1212:1: rule__Userdata__Group__9__Impl : ( 'city:' ) ;
    public final void rule__Userdata__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1216:1: ( ( 'city:' ) )
            // InternalResume.g:1217:1: ( 'city:' )
            {
            // InternalResume.g:1217:1: ( 'city:' )
            // InternalResume.g:1218:2: 'city:'
            {
             before(grammarAccess.getUserdataAccess().getCityKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getCityKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__9__Impl"


    // $ANTLR start "rule__Userdata__Group__10"
    // InternalResume.g:1227:1: rule__Userdata__Group__10 : rule__Userdata__Group__10__Impl rule__Userdata__Group__11 ;
    public final void rule__Userdata__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1231:1: ( rule__Userdata__Group__10__Impl rule__Userdata__Group__11 )
            // InternalResume.g:1232:2: rule__Userdata__Group__10__Impl rule__Userdata__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Userdata__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__10"


    // $ANTLR start "rule__Userdata__Group__10__Impl"
    // InternalResume.g:1239:1: rule__Userdata__Group__10__Impl : ( ( rule__Userdata__CityAssignment_10 ) ) ;
    public final void rule__Userdata__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1243:1: ( ( ( rule__Userdata__CityAssignment_10 ) ) )
            // InternalResume.g:1244:1: ( ( rule__Userdata__CityAssignment_10 ) )
            {
            // InternalResume.g:1244:1: ( ( rule__Userdata__CityAssignment_10 ) )
            // InternalResume.g:1245:2: ( rule__Userdata__CityAssignment_10 )
            {
             before(grammarAccess.getUserdataAccess().getCityAssignment_10()); 
            // InternalResume.g:1246:2: ( rule__Userdata__CityAssignment_10 )
            // InternalResume.g:1246:3: rule__Userdata__CityAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__CityAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getCityAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__10__Impl"


    // $ANTLR start "rule__Userdata__Group__11"
    // InternalResume.g:1254:1: rule__Userdata__Group__11 : rule__Userdata__Group__11__Impl rule__Userdata__Group__12 ;
    public final void rule__Userdata__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1258:1: ( rule__Userdata__Group__11__Impl rule__Userdata__Group__12 )
            // InternalResume.g:1259:2: rule__Userdata__Group__11__Impl rule__Userdata__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Userdata__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Userdata__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__11"


    // $ANTLR start "rule__Userdata__Group__11__Impl"
    // InternalResume.g:1266:1: rule__Userdata__Group__11__Impl : ( 'country:' ) ;
    public final void rule__Userdata__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1270:1: ( ( 'country:' ) )
            // InternalResume.g:1271:1: ( 'country:' )
            {
            // InternalResume.g:1271:1: ( 'country:' )
            // InternalResume.g:1272:2: 'country:'
            {
             before(grammarAccess.getUserdataAccess().getCountryKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getCountryKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__11__Impl"


    // $ANTLR start "rule__Userdata__Group__12"
    // InternalResume.g:1281:1: rule__Userdata__Group__12 : rule__Userdata__Group__12__Impl ;
    public final void rule__Userdata__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1285:1: ( rule__Userdata__Group__12__Impl )
            // InternalResume.g:1286:2: rule__Userdata__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__12"


    // $ANTLR start "rule__Userdata__Group__12__Impl"
    // InternalResume.g:1292:1: rule__Userdata__Group__12__Impl : ( ( rule__Userdata__CountryAssignment_12 ) ) ;
    public final void rule__Userdata__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1296:1: ( ( ( rule__Userdata__CountryAssignment_12 ) ) )
            // InternalResume.g:1297:1: ( ( rule__Userdata__CountryAssignment_12 ) )
            {
            // InternalResume.g:1297:1: ( ( rule__Userdata__CountryAssignment_12 ) )
            // InternalResume.g:1298:2: ( rule__Userdata__CountryAssignment_12 )
            {
             before(grammarAccess.getUserdataAccess().getCountryAssignment_12()); 
            // InternalResume.g:1299:2: ( rule__Userdata__CountryAssignment_12 )
            // InternalResume.g:1299:3: rule__Userdata__CountryAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Userdata__CountryAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getUserdataAccess().getCountryAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__Group__12__Impl"


    // $ANTLR start "rule__Experience__Group__0"
    // InternalResume.g:1308:1: rule__Experience__Group__0 : rule__Experience__Group__0__Impl rule__Experience__Group__1 ;
    public final void rule__Experience__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1312:1: ( rule__Experience__Group__0__Impl rule__Experience__Group__1 )
            // InternalResume.g:1313:2: rule__Experience__Group__0__Impl rule__Experience__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Experience__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__0"


    // $ANTLR start "rule__Experience__Group__0__Impl"
    // InternalResume.g:1320:1: rule__Experience__Group__0__Impl : ( 'Experience' ) ;
    public final void rule__Experience__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1324:1: ( ( 'Experience' ) )
            // InternalResume.g:1325:1: ( 'Experience' )
            {
            // InternalResume.g:1325:1: ( 'Experience' )
            // InternalResume.g:1326:2: 'Experience'
            {
             before(grammarAccess.getExperienceAccess().getExperienceKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getExperienceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__0__Impl"


    // $ANTLR start "rule__Experience__Group__1"
    // InternalResume.g:1335:1: rule__Experience__Group__1 : rule__Experience__Group__1__Impl rule__Experience__Group__2 ;
    public final void rule__Experience__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1339:1: ( rule__Experience__Group__1__Impl rule__Experience__Group__2 )
            // InternalResume.g:1340:2: rule__Experience__Group__1__Impl rule__Experience__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Experience__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__1"


    // $ANTLR start "rule__Experience__Group__1__Impl"
    // InternalResume.g:1347:1: rule__Experience__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Experience__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1351:1: ( ( 'language:' ) )
            // InternalResume.g:1352:1: ( 'language:' )
            {
            // InternalResume.g:1352:1: ( 'language:' )
            // InternalResume.g:1353:2: 'language:'
            {
             before(grammarAccess.getExperienceAccess().getLanguageKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__1__Impl"


    // $ANTLR start "rule__Experience__Group__2"
    // InternalResume.g:1362:1: rule__Experience__Group__2 : rule__Experience__Group__2__Impl rule__Experience__Group__3 ;
    public final void rule__Experience__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1366:1: ( rule__Experience__Group__2__Impl rule__Experience__Group__3 )
            // InternalResume.g:1367:2: rule__Experience__Group__2__Impl rule__Experience__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Experience__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__2"


    // $ANTLR start "rule__Experience__Group__2__Impl"
    // InternalResume.g:1374:1: rule__Experience__Group__2__Impl : ( ( rule__Experience__LanguageAssignment_2 ) ) ;
    public final void rule__Experience__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1378:1: ( ( ( rule__Experience__LanguageAssignment_2 ) ) )
            // InternalResume.g:1379:1: ( ( rule__Experience__LanguageAssignment_2 ) )
            {
            // InternalResume.g:1379:1: ( ( rule__Experience__LanguageAssignment_2 ) )
            // InternalResume.g:1380:2: ( rule__Experience__LanguageAssignment_2 )
            {
             before(grammarAccess.getExperienceAccess().getLanguageAssignment_2()); 
            // InternalResume.g:1381:2: ( rule__Experience__LanguageAssignment_2 )
            // InternalResume.g:1381:3: rule__Experience__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Experience__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__2__Impl"


    // $ANTLR start "rule__Experience__Group__3"
    // InternalResume.g:1389:1: rule__Experience__Group__3 : rule__Experience__Group__3__Impl ;
    public final void rule__Experience__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1393:1: ( rule__Experience__Group__3__Impl )
            // InternalResume.g:1394:2: rule__Experience__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experience__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__3"


    // $ANTLR start "rule__Experience__Group__3__Impl"
    // InternalResume.g:1400:1: rule__Experience__Group__3__Impl : ( ( ( rule__Experience__JobsAssignment_3 ) ) ( ( rule__Experience__JobsAssignment_3 )* ) ) ;
    public final void rule__Experience__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1404:1: ( ( ( ( rule__Experience__JobsAssignment_3 ) ) ( ( rule__Experience__JobsAssignment_3 )* ) ) )
            // InternalResume.g:1405:1: ( ( ( rule__Experience__JobsAssignment_3 ) ) ( ( rule__Experience__JobsAssignment_3 )* ) )
            {
            // InternalResume.g:1405:1: ( ( ( rule__Experience__JobsAssignment_3 ) ) ( ( rule__Experience__JobsAssignment_3 )* ) )
            // InternalResume.g:1406:2: ( ( rule__Experience__JobsAssignment_3 ) ) ( ( rule__Experience__JobsAssignment_3 )* )
            {
            // InternalResume.g:1406:2: ( ( rule__Experience__JobsAssignment_3 ) )
            // InternalResume.g:1407:3: ( rule__Experience__JobsAssignment_3 )
            {
             before(grammarAccess.getExperienceAccess().getJobsAssignment_3()); 
            // InternalResume.g:1408:3: ( rule__Experience__JobsAssignment_3 )
            // InternalResume.g:1408:4: rule__Experience__JobsAssignment_3
            {
            pushFollow(FOLLOW_19);
            rule__Experience__JobsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getJobsAssignment_3()); 

            }

            // InternalResume.g:1411:2: ( ( rule__Experience__JobsAssignment_3 )* )
            // InternalResume.g:1412:3: ( rule__Experience__JobsAssignment_3 )*
            {
             before(grammarAccess.getExperienceAccess().getJobsAssignment_3()); 
            // InternalResume.g:1413:3: ( rule__Experience__JobsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalResume.g:1413:4: rule__Experience__JobsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Experience__JobsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getExperienceAccess().getJobsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__3__Impl"


    // $ANTLR start "rule__Job__Group__0"
    // InternalResume.g:1423:1: rule__Job__Group__0 : rule__Job__Group__0__Impl rule__Job__Group__1 ;
    public final void rule__Job__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1427:1: ( rule__Job__Group__0__Impl rule__Job__Group__1 )
            // InternalResume.g:1428:2: rule__Job__Group__0__Impl rule__Job__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Job__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__0"


    // $ANTLR start "rule__Job__Group__0__Impl"
    // InternalResume.g:1435:1: rule__Job__Group__0__Impl : ( 'title:' ) ;
    public final void rule__Job__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1439:1: ( ( 'title:' ) )
            // InternalResume.g:1440:1: ( 'title:' )
            {
            // InternalResume.g:1440:1: ( 'title:' )
            // InternalResume.g:1441:2: 'title:'
            {
             before(grammarAccess.getJobAccess().getTitleKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__0__Impl"


    // $ANTLR start "rule__Job__Group__1"
    // InternalResume.g:1450:1: rule__Job__Group__1 : rule__Job__Group__1__Impl rule__Job__Group__2 ;
    public final void rule__Job__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1454:1: ( rule__Job__Group__1__Impl rule__Job__Group__2 )
            // InternalResume.g:1455:2: rule__Job__Group__1__Impl rule__Job__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Job__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__1"


    // $ANTLR start "rule__Job__Group__1__Impl"
    // InternalResume.g:1462:1: rule__Job__Group__1__Impl : ( ( rule__Job__TitleAssignment_1 ) ) ;
    public final void rule__Job__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1466:1: ( ( ( rule__Job__TitleAssignment_1 ) ) )
            // InternalResume.g:1467:1: ( ( rule__Job__TitleAssignment_1 ) )
            {
            // InternalResume.g:1467:1: ( ( rule__Job__TitleAssignment_1 ) )
            // InternalResume.g:1468:2: ( rule__Job__TitleAssignment_1 )
            {
             before(grammarAccess.getJobAccess().getTitleAssignment_1()); 
            // InternalResume.g:1469:2: ( rule__Job__TitleAssignment_1 )
            // InternalResume.g:1469:3: rule__Job__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Job__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__1__Impl"


    // $ANTLR start "rule__Job__Group__2"
    // InternalResume.g:1477:1: rule__Job__Group__2 : rule__Job__Group__2__Impl rule__Job__Group__3 ;
    public final void rule__Job__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1481:1: ( rule__Job__Group__2__Impl rule__Job__Group__3 )
            // InternalResume.g:1482:2: rule__Job__Group__2__Impl rule__Job__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Job__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__2"


    // $ANTLR start "rule__Job__Group__2__Impl"
    // InternalResume.g:1489:1: rule__Job__Group__2__Impl : ( 'description:' ) ;
    public final void rule__Job__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1493:1: ( ( 'description:' ) )
            // InternalResume.g:1494:1: ( 'description:' )
            {
            // InternalResume.g:1494:1: ( 'description:' )
            // InternalResume.g:1495:2: 'description:'
            {
             before(grammarAccess.getJobAccess().getDescriptionKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getDescriptionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__2__Impl"


    // $ANTLR start "rule__Job__Group__3"
    // InternalResume.g:1504:1: rule__Job__Group__3 : rule__Job__Group__3__Impl rule__Job__Group__4 ;
    public final void rule__Job__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1508:1: ( rule__Job__Group__3__Impl rule__Job__Group__4 )
            // InternalResume.g:1509:2: rule__Job__Group__3__Impl rule__Job__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Job__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__3"


    // $ANTLR start "rule__Job__Group__3__Impl"
    // InternalResume.g:1516:1: rule__Job__Group__3__Impl : ( ( rule__Job__DescriptionAssignment_3 ) ) ;
    public final void rule__Job__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1520:1: ( ( ( rule__Job__DescriptionAssignment_3 ) ) )
            // InternalResume.g:1521:1: ( ( rule__Job__DescriptionAssignment_3 ) )
            {
            // InternalResume.g:1521:1: ( ( rule__Job__DescriptionAssignment_3 ) )
            // InternalResume.g:1522:2: ( rule__Job__DescriptionAssignment_3 )
            {
             before(grammarAccess.getJobAccess().getDescriptionAssignment_3()); 
            // InternalResume.g:1523:2: ( rule__Job__DescriptionAssignment_3 )
            // InternalResume.g:1523:3: rule__Job__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Job__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__3__Impl"


    // $ANTLR start "rule__Job__Group__4"
    // InternalResume.g:1531:1: rule__Job__Group__4 : rule__Job__Group__4__Impl rule__Job__Group__5 ;
    public final void rule__Job__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1535:1: ( rule__Job__Group__4__Impl rule__Job__Group__5 )
            // InternalResume.g:1536:2: rule__Job__Group__4__Impl rule__Job__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Job__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__4"


    // $ANTLR start "rule__Job__Group__4__Impl"
    // InternalResume.g:1543:1: rule__Job__Group__4__Impl : ( 'company:' ) ;
    public final void rule__Job__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1547:1: ( ( 'company:' ) )
            // InternalResume.g:1548:1: ( 'company:' )
            {
            // InternalResume.g:1548:1: ( 'company:' )
            // InternalResume.g:1549:2: 'company:'
            {
             before(grammarAccess.getJobAccess().getCompanyKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getCompanyKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__4__Impl"


    // $ANTLR start "rule__Job__Group__5"
    // InternalResume.g:1558:1: rule__Job__Group__5 : rule__Job__Group__5__Impl rule__Job__Group__6 ;
    public final void rule__Job__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1562:1: ( rule__Job__Group__5__Impl rule__Job__Group__6 )
            // InternalResume.g:1563:2: rule__Job__Group__5__Impl rule__Job__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Job__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__5"


    // $ANTLR start "rule__Job__Group__5__Impl"
    // InternalResume.g:1570:1: rule__Job__Group__5__Impl : ( ( rule__Job__CompanyAssignment_5 ) ) ;
    public final void rule__Job__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1574:1: ( ( ( rule__Job__CompanyAssignment_5 ) ) )
            // InternalResume.g:1575:1: ( ( rule__Job__CompanyAssignment_5 ) )
            {
            // InternalResume.g:1575:1: ( ( rule__Job__CompanyAssignment_5 ) )
            // InternalResume.g:1576:2: ( rule__Job__CompanyAssignment_5 )
            {
             before(grammarAccess.getJobAccess().getCompanyAssignment_5()); 
            // InternalResume.g:1577:2: ( rule__Job__CompanyAssignment_5 )
            // InternalResume.g:1577:3: rule__Job__CompanyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Job__CompanyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getCompanyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__5__Impl"


    // $ANTLR start "rule__Job__Group__6"
    // InternalResume.g:1585:1: rule__Job__Group__6 : rule__Job__Group__6__Impl rule__Job__Group__7 ;
    public final void rule__Job__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1589:1: ( rule__Job__Group__6__Impl rule__Job__Group__7 )
            // InternalResume.g:1590:2: rule__Job__Group__6__Impl rule__Job__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Job__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__6"


    // $ANTLR start "rule__Job__Group__6__Impl"
    // InternalResume.g:1597:1: rule__Job__Group__6__Impl : ( 'startDate:' ) ;
    public final void rule__Job__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1601:1: ( ( 'startDate:' ) )
            // InternalResume.g:1602:1: ( 'startDate:' )
            {
            // InternalResume.g:1602:1: ( 'startDate:' )
            // InternalResume.g:1603:2: 'startDate:'
            {
             before(grammarAccess.getJobAccess().getStartDateKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getStartDateKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__6__Impl"


    // $ANTLR start "rule__Job__Group__7"
    // InternalResume.g:1612:1: rule__Job__Group__7 : rule__Job__Group__7__Impl rule__Job__Group__8 ;
    public final void rule__Job__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1616:1: ( rule__Job__Group__7__Impl rule__Job__Group__8 )
            // InternalResume.g:1617:2: rule__Job__Group__7__Impl rule__Job__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Job__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__7"


    // $ANTLR start "rule__Job__Group__7__Impl"
    // InternalResume.g:1624:1: rule__Job__Group__7__Impl : ( ( rule__Job__StartDateAssignment_7 ) ) ;
    public final void rule__Job__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1628:1: ( ( ( rule__Job__StartDateAssignment_7 ) ) )
            // InternalResume.g:1629:1: ( ( rule__Job__StartDateAssignment_7 ) )
            {
            // InternalResume.g:1629:1: ( ( rule__Job__StartDateAssignment_7 ) )
            // InternalResume.g:1630:2: ( rule__Job__StartDateAssignment_7 )
            {
             before(grammarAccess.getJobAccess().getStartDateAssignment_7()); 
            // InternalResume.g:1631:2: ( rule__Job__StartDateAssignment_7 )
            // InternalResume.g:1631:3: rule__Job__StartDateAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Job__StartDateAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getStartDateAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__7__Impl"


    // $ANTLR start "rule__Job__Group__8"
    // InternalResume.g:1639:1: rule__Job__Group__8 : rule__Job__Group__8__Impl rule__Job__Group__9 ;
    public final void rule__Job__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1643:1: ( rule__Job__Group__8__Impl rule__Job__Group__9 )
            // InternalResume.g:1644:2: rule__Job__Group__8__Impl rule__Job__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Job__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__8"


    // $ANTLR start "rule__Job__Group__8__Impl"
    // InternalResume.g:1651:1: rule__Job__Group__8__Impl : ( 'endDate:' ) ;
    public final void rule__Job__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1655:1: ( ( 'endDate:' ) )
            // InternalResume.g:1656:1: ( 'endDate:' )
            {
            // InternalResume.g:1656:1: ( 'endDate:' )
            // InternalResume.g:1657:2: 'endDate:'
            {
             before(grammarAccess.getJobAccess().getEndDateKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getEndDateKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__8__Impl"


    // $ANTLR start "rule__Job__Group__9"
    // InternalResume.g:1666:1: rule__Job__Group__9 : rule__Job__Group__9__Impl rule__Job__Group__10 ;
    public final void rule__Job__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1670:1: ( rule__Job__Group__9__Impl rule__Job__Group__10 )
            // InternalResume.g:1671:2: rule__Job__Group__9__Impl rule__Job__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__Job__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__9"


    // $ANTLR start "rule__Job__Group__9__Impl"
    // InternalResume.g:1678:1: rule__Job__Group__9__Impl : ( ( rule__Job__EndDateAssignment_9 ) ) ;
    public final void rule__Job__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1682:1: ( ( ( rule__Job__EndDateAssignment_9 ) ) )
            // InternalResume.g:1683:1: ( ( rule__Job__EndDateAssignment_9 ) )
            {
            // InternalResume.g:1683:1: ( ( rule__Job__EndDateAssignment_9 ) )
            // InternalResume.g:1684:2: ( rule__Job__EndDateAssignment_9 )
            {
             before(grammarAccess.getJobAccess().getEndDateAssignment_9()); 
            // InternalResume.g:1685:2: ( rule__Job__EndDateAssignment_9 )
            // InternalResume.g:1685:3: rule__Job__EndDateAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Job__EndDateAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getEndDateAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__9__Impl"


    // $ANTLR start "rule__Job__Group__10"
    // InternalResume.g:1693:1: rule__Job__Group__10 : rule__Job__Group__10__Impl rule__Job__Group__11 ;
    public final void rule__Job__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1697:1: ( rule__Job__Group__10__Impl rule__Job__Group__11 )
            // InternalResume.g:1698:2: rule__Job__Group__10__Impl rule__Job__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__Job__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Job__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__10"


    // $ANTLR start "rule__Job__Group__10__Impl"
    // InternalResume.g:1705:1: rule__Job__Group__10__Impl : ( 'tags:' ) ;
    public final void rule__Job__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1709:1: ( ( 'tags:' ) )
            // InternalResume.g:1710:1: ( 'tags:' )
            {
            // InternalResume.g:1710:1: ( 'tags:' )
            // InternalResume.g:1711:2: 'tags:'
            {
             before(grammarAccess.getJobAccess().getTagsKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getTagsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__10__Impl"


    // $ANTLR start "rule__Job__Group__11"
    // InternalResume.g:1720:1: rule__Job__Group__11 : rule__Job__Group__11__Impl ;
    public final void rule__Job__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1724:1: ( rule__Job__Group__11__Impl )
            // InternalResume.g:1725:2: rule__Job__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Job__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__11"


    // $ANTLR start "rule__Job__Group__11__Impl"
    // InternalResume.g:1731:1: rule__Job__Group__11__Impl : ( ( rule__Job__TagsAssignment_11 ) ) ;
    public final void rule__Job__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1735:1: ( ( ( rule__Job__TagsAssignment_11 ) ) )
            // InternalResume.g:1736:1: ( ( rule__Job__TagsAssignment_11 ) )
            {
            // InternalResume.g:1736:1: ( ( rule__Job__TagsAssignment_11 ) )
            // InternalResume.g:1737:2: ( rule__Job__TagsAssignment_11 )
            {
             before(grammarAccess.getJobAccess().getTagsAssignment_11()); 
            // InternalResume.g:1738:2: ( rule__Job__TagsAssignment_11 )
            // InternalResume.g:1738:3: rule__Job__TagsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Job__TagsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getJobAccess().getTagsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__Group__11__Impl"


    // $ANTLR start "rule__Projects__Group__0"
    // InternalResume.g:1747:1: rule__Projects__Group__0 : rule__Projects__Group__0__Impl rule__Projects__Group__1 ;
    public final void rule__Projects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1751:1: ( rule__Projects__Group__0__Impl rule__Projects__Group__1 )
            // InternalResume.g:1752:2: rule__Projects__Group__0__Impl rule__Projects__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Projects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projects__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__0"


    // $ANTLR start "rule__Projects__Group__0__Impl"
    // InternalResume.g:1759:1: rule__Projects__Group__0__Impl : ( 'Projects' ) ;
    public final void rule__Projects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1763:1: ( ( 'Projects' ) )
            // InternalResume.g:1764:1: ( 'Projects' )
            {
            // InternalResume.g:1764:1: ( 'Projects' )
            // InternalResume.g:1765:2: 'Projects'
            {
             before(grammarAccess.getProjectsAccess().getProjectsKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProjectsAccess().getProjectsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__0__Impl"


    // $ANTLR start "rule__Projects__Group__1"
    // InternalResume.g:1774:1: rule__Projects__Group__1 : rule__Projects__Group__1__Impl rule__Projects__Group__2 ;
    public final void rule__Projects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1778:1: ( rule__Projects__Group__1__Impl rule__Projects__Group__2 )
            // InternalResume.g:1779:2: rule__Projects__Group__1__Impl rule__Projects__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Projects__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projects__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__1"


    // $ANTLR start "rule__Projects__Group__1__Impl"
    // InternalResume.g:1786:1: rule__Projects__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Projects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1790:1: ( ( 'language:' ) )
            // InternalResume.g:1791:1: ( 'language:' )
            {
            // InternalResume.g:1791:1: ( 'language:' )
            // InternalResume.g:1792:2: 'language:'
            {
             before(grammarAccess.getProjectsAccess().getLanguageKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProjectsAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__1__Impl"


    // $ANTLR start "rule__Projects__Group__2"
    // InternalResume.g:1801:1: rule__Projects__Group__2 : rule__Projects__Group__2__Impl rule__Projects__Group__3 ;
    public final void rule__Projects__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1805:1: ( rule__Projects__Group__2__Impl rule__Projects__Group__3 )
            // InternalResume.g:1806:2: rule__Projects__Group__2__Impl rule__Projects__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Projects__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Projects__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__2"


    // $ANTLR start "rule__Projects__Group__2__Impl"
    // InternalResume.g:1813:1: rule__Projects__Group__2__Impl : ( ( rule__Projects__LanguageAssignment_2 ) ) ;
    public final void rule__Projects__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1817:1: ( ( ( rule__Projects__LanguageAssignment_2 ) ) )
            // InternalResume.g:1818:1: ( ( rule__Projects__LanguageAssignment_2 ) )
            {
            // InternalResume.g:1818:1: ( ( rule__Projects__LanguageAssignment_2 ) )
            // InternalResume.g:1819:2: ( rule__Projects__LanguageAssignment_2 )
            {
             before(grammarAccess.getProjectsAccess().getLanguageAssignment_2()); 
            // InternalResume.g:1820:2: ( rule__Projects__LanguageAssignment_2 )
            // InternalResume.g:1820:3: rule__Projects__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Projects__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectsAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__2__Impl"


    // $ANTLR start "rule__Projects__Group__3"
    // InternalResume.g:1828:1: rule__Projects__Group__3 : rule__Projects__Group__3__Impl ;
    public final void rule__Projects__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1832:1: ( rule__Projects__Group__3__Impl )
            // InternalResume.g:1833:2: rule__Projects__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Projects__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__3"


    // $ANTLR start "rule__Projects__Group__3__Impl"
    // InternalResume.g:1839:1: rule__Projects__Group__3__Impl : ( ( ( rule__Projects__ProjectsAssignment_3 ) ) ( ( rule__Projects__ProjectsAssignment_3 )* ) ) ;
    public final void rule__Projects__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1843:1: ( ( ( ( rule__Projects__ProjectsAssignment_3 ) ) ( ( rule__Projects__ProjectsAssignment_3 )* ) ) )
            // InternalResume.g:1844:1: ( ( ( rule__Projects__ProjectsAssignment_3 ) ) ( ( rule__Projects__ProjectsAssignment_3 )* ) )
            {
            // InternalResume.g:1844:1: ( ( ( rule__Projects__ProjectsAssignment_3 ) ) ( ( rule__Projects__ProjectsAssignment_3 )* ) )
            // InternalResume.g:1845:2: ( ( rule__Projects__ProjectsAssignment_3 ) ) ( ( rule__Projects__ProjectsAssignment_3 )* )
            {
            // InternalResume.g:1845:2: ( ( rule__Projects__ProjectsAssignment_3 ) )
            // InternalResume.g:1846:3: ( rule__Projects__ProjectsAssignment_3 )
            {
             before(grammarAccess.getProjectsAccess().getProjectsAssignment_3()); 
            // InternalResume.g:1847:3: ( rule__Projects__ProjectsAssignment_3 )
            // InternalResume.g:1847:4: rule__Projects__ProjectsAssignment_3
            {
            pushFollow(FOLLOW_19);
            rule__Projects__ProjectsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectsAccess().getProjectsAssignment_3()); 

            }

            // InternalResume.g:1850:2: ( ( rule__Projects__ProjectsAssignment_3 )* )
            // InternalResume.g:1851:3: ( rule__Projects__ProjectsAssignment_3 )*
            {
             before(grammarAccess.getProjectsAccess().getProjectsAssignment_3()); 
            // InternalResume.g:1852:3: ( rule__Projects__ProjectsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalResume.g:1852:4: rule__Projects__ProjectsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Projects__ProjectsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProjectsAccess().getProjectsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // InternalResume.g:1862:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1866:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalResume.g:1867:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalResume.g:1874:1: rule__Project__Group__0__Impl : ( 'title:' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1878:1: ( ( 'title:' ) )
            // InternalResume.g:1879:1: ( 'title:' )
            {
            // InternalResume.g:1879:1: ( 'title:' )
            // InternalResume.g:1880:2: 'title:'
            {
             before(grammarAccess.getProjectAccess().getTitleKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalResume.g:1889:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1893:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalResume.g:1894:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalResume.g:1901:1: rule__Project__Group__1__Impl : ( ( rule__Project__TitleAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1905:1: ( ( ( rule__Project__TitleAssignment_1 ) ) )
            // InternalResume.g:1906:1: ( ( rule__Project__TitleAssignment_1 ) )
            {
            // InternalResume.g:1906:1: ( ( rule__Project__TitleAssignment_1 ) )
            // InternalResume.g:1907:2: ( rule__Project__TitleAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getTitleAssignment_1()); 
            // InternalResume.g:1908:2: ( rule__Project__TitleAssignment_1 )
            // InternalResume.g:1908:3: rule__Project__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalResume.g:1916:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1920:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalResume.g:1921:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalResume.g:1928:1: rule__Project__Group__2__Impl : ( 'description:' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1932:1: ( ( 'description:' ) )
            // InternalResume.g:1933:1: ( 'description:' )
            {
            // InternalResume.g:1933:1: ( 'description:' )
            // InternalResume.g:1934:2: 'description:'
            {
             before(grammarAccess.getProjectAccess().getDescriptionKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getDescriptionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalResume.g:1943:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1947:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalResume.g:1948:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalResume.g:1955:1: rule__Project__Group__3__Impl : ( ( rule__Project__DescriptionAssignment_3 ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1959:1: ( ( ( rule__Project__DescriptionAssignment_3 ) ) )
            // InternalResume.g:1960:1: ( ( rule__Project__DescriptionAssignment_3 ) )
            {
            // InternalResume.g:1960:1: ( ( rule__Project__DescriptionAssignment_3 ) )
            // InternalResume.g:1961:2: ( rule__Project__DescriptionAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getDescriptionAssignment_3()); 
            // InternalResume.g:1962:2: ( rule__Project__DescriptionAssignment_3 )
            // InternalResume.g:1962:3: rule__Project__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Project__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalResume.g:1970:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1974:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalResume.g:1975:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalResume.g:1982:1: rule__Project__Group__4__Impl : ( 'technologies:' ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:1986:1: ( ( 'technologies:' ) )
            // InternalResume.g:1987:1: ( 'technologies:' )
            {
            // InternalResume.g:1987:1: ( 'technologies:' )
            // InternalResume.g:1988:2: 'technologies:'
            {
             before(grammarAccess.getProjectAccess().getTechnologiesKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTechnologiesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // InternalResume.g:1997:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2001:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalResume.g:2002:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // InternalResume.g:2009:1: rule__Project__Group__5__Impl : ( ( rule__Project__TechnologiesAssignment_5 ) ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2013:1: ( ( ( rule__Project__TechnologiesAssignment_5 ) ) )
            // InternalResume.g:2014:1: ( ( rule__Project__TechnologiesAssignment_5 ) )
            {
            // InternalResume.g:2014:1: ( ( rule__Project__TechnologiesAssignment_5 ) )
            // InternalResume.g:2015:2: ( rule__Project__TechnologiesAssignment_5 )
            {
             before(grammarAccess.getProjectAccess().getTechnologiesAssignment_5()); 
            // InternalResume.g:2016:2: ( rule__Project__TechnologiesAssignment_5 )
            // InternalResume.g:2016:3: rule__Project__TechnologiesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Project__TechnologiesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTechnologiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // InternalResume.g:2024:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2028:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // InternalResume.g:2029:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // InternalResume.g:2036:1: rule__Project__Group__6__Impl : ( 'link:' ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2040:1: ( ( 'link:' ) )
            // InternalResume.g:2041:1: ( 'link:' )
            {
            // InternalResume.g:2041:1: ( 'link:' )
            // InternalResume.g:2042:2: 'link:'
            {
             before(grammarAccess.getProjectAccess().getLinkKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLinkKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group__7"
    // InternalResume.g:2051:1: rule__Project__Group__7 : rule__Project__Group__7__Impl rule__Project__Group__8 ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2055:1: ( rule__Project__Group__7__Impl rule__Project__Group__8 )
            // InternalResume.g:2056:2: rule__Project__Group__7__Impl rule__Project__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Project__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // InternalResume.g:2063:1: rule__Project__Group__7__Impl : ( ( rule__Project__LinkAssignment_7 ) ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2067:1: ( ( ( rule__Project__LinkAssignment_7 ) ) )
            // InternalResume.g:2068:1: ( ( rule__Project__LinkAssignment_7 ) )
            {
            // InternalResume.g:2068:1: ( ( rule__Project__LinkAssignment_7 ) )
            // InternalResume.g:2069:2: ( rule__Project__LinkAssignment_7 )
            {
             before(grammarAccess.getProjectAccess().getLinkAssignment_7()); 
            // InternalResume.g:2070:2: ( rule__Project__LinkAssignment_7 )
            // InternalResume.g:2070:3: rule__Project__LinkAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Project__LinkAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getLinkAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__Project__Group__8"
    // InternalResume.g:2078:1: rule__Project__Group__8 : rule__Project__Group__8__Impl rule__Project__Group__9 ;
    public final void rule__Project__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2082:1: ( rule__Project__Group__8__Impl rule__Project__Group__9 )
            // InternalResume.g:2083:2: rule__Project__Group__8__Impl rule__Project__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Project__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__8"


    // $ANTLR start "rule__Project__Group__8__Impl"
    // InternalResume.g:2090:1: rule__Project__Group__8__Impl : ( 'tags:' ) ;
    public final void rule__Project__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2094:1: ( ( 'tags:' ) )
            // InternalResume.g:2095:1: ( 'tags:' )
            {
            // InternalResume.g:2095:1: ( 'tags:' )
            // InternalResume.g:2096:2: 'tags:'
            {
             before(grammarAccess.getProjectAccess().getTagsKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTagsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__8__Impl"


    // $ANTLR start "rule__Project__Group__9"
    // InternalResume.g:2105:1: rule__Project__Group__9 : rule__Project__Group__9__Impl rule__Project__Group__10 ;
    public final void rule__Project__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2109:1: ( rule__Project__Group__9__Impl rule__Project__Group__10 )
            // InternalResume.g:2110:2: rule__Project__Group__9__Impl rule__Project__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__Project__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__9"


    // $ANTLR start "rule__Project__Group__9__Impl"
    // InternalResume.g:2117:1: rule__Project__Group__9__Impl : ( ( rule__Project__TagsAssignment_9 ) ) ;
    public final void rule__Project__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2121:1: ( ( ( rule__Project__TagsAssignment_9 ) ) )
            // InternalResume.g:2122:1: ( ( rule__Project__TagsAssignment_9 ) )
            {
            // InternalResume.g:2122:1: ( ( rule__Project__TagsAssignment_9 ) )
            // InternalResume.g:2123:2: ( rule__Project__TagsAssignment_9 )
            {
             before(grammarAccess.getProjectAccess().getTagsAssignment_9()); 
            // InternalResume.g:2124:2: ( rule__Project__TagsAssignment_9 )
            // InternalResume.g:2124:3: rule__Project__TagsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Project__TagsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTagsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__9__Impl"


    // $ANTLR start "rule__Project__Group__10"
    // InternalResume.g:2132:1: rule__Project__Group__10 : rule__Project__Group__10__Impl ;
    public final void rule__Project__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2136:1: ( rule__Project__Group__10__Impl )
            // InternalResume.g:2137:2: rule__Project__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__10"


    // $ANTLR start "rule__Project__Group__10__Impl"
    // InternalResume.g:2143:1: rule__Project__Group__10__Impl : ( ( rule__Project__Group_10__0 )? ) ;
    public final void rule__Project__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2147:1: ( ( ( rule__Project__Group_10__0 )? ) )
            // InternalResume.g:2148:1: ( ( rule__Project__Group_10__0 )? )
            {
            // InternalResume.g:2148:1: ( ( rule__Project__Group_10__0 )? )
            // InternalResume.g:2149:2: ( rule__Project__Group_10__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_10()); 
            // InternalResume.g:2150:2: ( rule__Project__Group_10__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalResume.g:2150:3: rule__Project__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__10__Impl"


    // $ANTLR start "rule__Project__Group_10__0"
    // InternalResume.g:2159:1: rule__Project__Group_10__0 : rule__Project__Group_10__0__Impl rule__Project__Group_10__1 ;
    public final void rule__Project__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2163:1: ( rule__Project__Group_10__0__Impl rule__Project__Group_10__1 )
            // InternalResume.g:2164:2: rule__Project__Group_10__0__Impl rule__Project__Group_10__1
            {
            pushFollow(FOLLOW_29);
            rule__Project__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_10__0"


    // $ANTLR start "rule__Project__Group_10__0__Impl"
    // InternalResume.g:2171:1: rule__Project__Group_10__0__Impl : ( 'from:' ) ;
    public final void rule__Project__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2175:1: ( ( 'from:' ) )
            // InternalResume.g:2176:1: ( 'from:' )
            {
            // InternalResume.g:2176:1: ( 'from:' )
            // InternalResume.g:2177:2: 'from:'
            {
             before(grammarAccess.getProjectAccess().getFromKeyword_10_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getFromKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_10__0__Impl"


    // $ANTLR start "rule__Project__Group_10__1"
    // InternalResume.g:2186:1: rule__Project__Group_10__1 : rule__Project__Group_10__1__Impl rule__Project__Group_10__2 ;
    public final void rule__Project__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2190:1: ( rule__Project__Group_10__1__Impl rule__Project__Group_10__2 )
            // InternalResume.g:2191:2: rule__Project__Group_10__1__Impl rule__Project__Group_10__2
            {
            pushFollow(FOLLOW_30);
            rule__Project__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_10__1"


    // $ANTLR start "rule__Project__Group_10__1__Impl"
    // InternalResume.g:2198:1: rule__Project__Group_10__1__Impl : ( ( rule__Project__FromAssignment_10_1 ) ) ;
    public final void rule__Project__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2202:1: ( ( ( rule__Project__FromAssignment_10_1 ) ) )
            // InternalResume.g:2203:1: ( ( rule__Project__FromAssignment_10_1 ) )
            {
            // InternalResume.g:2203:1: ( ( rule__Project__FromAssignment_10_1 ) )
            // InternalResume.g:2204:2: ( rule__Project__FromAssignment_10_1 )
            {
             before(grammarAccess.getProjectAccess().getFromAssignment_10_1()); 
            // InternalResume.g:2205:2: ( rule__Project__FromAssignment_10_1 )
            // InternalResume.g:2205:3: rule__Project__FromAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__FromAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getFromAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_10__1__Impl"


    // $ANTLR start "rule__Project__Group_10__2"
    // InternalResume.g:2213:1: rule__Project__Group_10__2 : rule__Project__Group_10__2__Impl ;
    public final void rule__Project__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2217:1: ( rule__Project__Group_10__2__Impl )
            // InternalResume.g:2218:2: rule__Project__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_10__2"


    // $ANTLR start "rule__Project__Group_10__2__Impl"
    // InternalResume.g:2224:1: rule__Project__Group_10__2__Impl : ( ( rule__Project__Group_10_2__0 )* ) ;
    public final void rule__Project__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2228:1: ( ( ( rule__Project__Group_10_2__0 )* ) )
            // InternalResume.g:2229:1: ( ( rule__Project__Group_10_2__0 )* )
            {
            // InternalResume.g:2229:1: ( ( rule__Project__Group_10_2__0 )* )
            // InternalResume.g:2230:2: ( rule__Project__Group_10_2__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_10_2()); 
            // InternalResume.g:2231:2: ( rule__Project__Group_10_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalResume.g:2231:3: rule__Project__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Project__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_10__2__Impl"


    // $ANTLR start "rule__Project__Group_10_2__0"
    // InternalResume.g:2240:1: rule__Project__Group_10_2__0 : rule__Project__Group_10_2__0__Impl rule__Project__Group_10_2__1 ;
    public final void rule__Project__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2244:1: ( rule__Project__Group_10_2__0__Impl rule__Project__Group_10_2__1 )
            // InternalResume.g:2245:2: rule__Project__Group_10_2__0__Impl rule__Project__Group_10_2__1
            {
            pushFollow(FOLLOW_29);
            rule__Project__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_10_2__0"


    // $ANTLR start "rule__Project__Group_10_2__0__Impl"
    // InternalResume.g:2252:1: rule__Project__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2256:1: ( ( ',' ) )
            // InternalResume.g:2257:1: ( ',' )
            {
            // InternalResume.g:2257:1: ( ',' )
            // InternalResume.g:2258:2: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_10_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getCommaKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_10_2__0__Impl"


    // $ANTLR start "rule__Project__Group_10_2__1"
    // InternalResume.g:2267:1: rule__Project__Group_10_2__1 : rule__Project__Group_10_2__1__Impl ;
    public final void rule__Project__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2271:1: ( rule__Project__Group_10_2__1__Impl )
            // InternalResume.g:2272:2: rule__Project__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_10_2__1"


    // $ANTLR start "rule__Project__Group_10_2__1__Impl"
    // InternalResume.g:2278:1: rule__Project__Group_10_2__1__Impl : ( ( rule__Project__FromAssignment_10_2_1 ) ) ;
    public final void rule__Project__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2282:1: ( ( ( rule__Project__FromAssignment_10_2_1 ) ) )
            // InternalResume.g:2283:1: ( ( rule__Project__FromAssignment_10_2_1 ) )
            {
            // InternalResume.g:2283:1: ( ( rule__Project__FromAssignment_10_2_1 ) )
            // InternalResume.g:2284:2: ( rule__Project__FromAssignment_10_2_1 )
            {
             before(grammarAccess.getProjectAccess().getFromAssignment_10_2_1()); 
            // InternalResume.g:2285:2: ( rule__Project__FromAssignment_10_2_1 )
            // InternalResume.g:2285:3: rule__Project__FromAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__FromAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getFromAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group_10_2__1__Impl"


    // $ANTLR start "rule__Education__Group__0"
    // InternalResume.g:2294:1: rule__Education__Group__0 : rule__Education__Group__0__Impl rule__Education__Group__1 ;
    public final void rule__Education__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2298:1: ( rule__Education__Group__0__Impl rule__Education__Group__1 )
            // InternalResume.g:2299:2: rule__Education__Group__0__Impl rule__Education__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Education__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Education__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__0"


    // $ANTLR start "rule__Education__Group__0__Impl"
    // InternalResume.g:2306:1: rule__Education__Group__0__Impl : ( 'Education' ) ;
    public final void rule__Education__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2310:1: ( ( 'Education' ) )
            // InternalResume.g:2311:1: ( 'Education' )
            {
            // InternalResume.g:2311:1: ( 'Education' )
            // InternalResume.g:2312:2: 'Education'
            {
             before(grammarAccess.getEducationAccess().getEducationKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEducationAccess().getEducationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__0__Impl"


    // $ANTLR start "rule__Education__Group__1"
    // InternalResume.g:2321:1: rule__Education__Group__1 : rule__Education__Group__1__Impl rule__Education__Group__2 ;
    public final void rule__Education__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2325:1: ( rule__Education__Group__1__Impl rule__Education__Group__2 )
            // InternalResume.g:2326:2: rule__Education__Group__1__Impl rule__Education__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Education__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Education__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__1"


    // $ANTLR start "rule__Education__Group__1__Impl"
    // InternalResume.g:2333:1: rule__Education__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Education__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2337:1: ( ( 'language:' ) )
            // InternalResume.g:2338:1: ( 'language:' )
            {
            // InternalResume.g:2338:1: ( 'language:' )
            // InternalResume.g:2339:2: 'language:'
            {
             before(grammarAccess.getEducationAccess().getLanguageKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEducationAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__1__Impl"


    // $ANTLR start "rule__Education__Group__2"
    // InternalResume.g:2348:1: rule__Education__Group__2 : rule__Education__Group__2__Impl rule__Education__Group__3 ;
    public final void rule__Education__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2352:1: ( rule__Education__Group__2__Impl rule__Education__Group__3 )
            // InternalResume.g:2353:2: rule__Education__Group__2__Impl rule__Education__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Education__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Education__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__2"


    // $ANTLR start "rule__Education__Group__2__Impl"
    // InternalResume.g:2360:1: rule__Education__Group__2__Impl : ( ( rule__Education__LanguageAssignment_2 ) ) ;
    public final void rule__Education__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2364:1: ( ( ( rule__Education__LanguageAssignment_2 ) ) )
            // InternalResume.g:2365:1: ( ( rule__Education__LanguageAssignment_2 ) )
            {
            // InternalResume.g:2365:1: ( ( rule__Education__LanguageAssignment_2 ) )
            // InternalResume.g:2366:2: ( rule__Education__LanguageAssignment_2 )
            {
             before(grammarAccess.getEducationAccess().getLanguageAssignment_2()); 
            // InternalResume.g:2367:2: ( rule__Education__LanguageAssignment_2 )
            // InternalResume.g:2367:3: rule__Education__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Education__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEducationAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__2__Impl"


    // $ANTLR start "rule__Education__Group__3"
    // InternalResume.g:2375:1: rule__Education__Group__3 : rule__Education__Group__3__Impl ;
    public final void rule__Education__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2379:1: ( rule__Education__Group__3__Impl )
            // InternalResume.g:2380:2: rule__Education__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Education__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__3"


    // $ANTLR start "rule__Education__Group__3__Impl"
    // InternalResume.g:2386:1: rule__Education__Group__3__Impl : ( ( rule__Education__DegreesAssignment_3 )* ) ;
    public final void rule__Education__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2390:1: ( ( ( rule__Education__DegreesAssignment_3 )* ) )
            // InternalResume.g:2391:1: ( ( rule__Education__DegreesAssignment_3 )* )
            {
            // InternalResume.g:2391:1: ( ( rule__Education__DegreesAssignment_3 )* )
            // InternalResume.g:2392:2: ( rule__Education__DegreesAssignment_3 )*
            {
             before(grammarAccess.getEducationAccess().getDegreesAssignment_3()); 
            // InternalResume.g:2393:2: ( rule__Education__DegreesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalResume.g:2393:3: rule__Education__DegreesAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Education__DegreesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEducationAccess().getDegreesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__Group__3__Impl"


    // $ANTLR start "rule__Degree__Group__0"
    // InternalResume.g:2402:1: rule__Degree__Group__0 : rule__Degree__Group__0__Impl rule__Degree__Group__1 ;
    public final void rule__Degree__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2406:1: ( rule__Degree__Group__0__Impl rule__Degree__Group__1 )
            // InternalResume.g:2407:2: rule__Degree__Group__0__Impl rule__Degree__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Degree__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__0"


    // $ANTLR start "rule__Degree__Group__0__Impl"
    // InternalResume.g:2414:1: rule__Degree__Group__0__Impl : ( 'title:' ) ;
    public final void rule__Degree__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2418:1: ( ( 'title:' ) )
            // InternalResume.g:2419:1: ( 'title:' )
            {
            // InternalResume.g:2419:1: ( 'title:' )
            // InternalResume.g:2420:2: 'title:'
            {
             before(grammarAccess.getDegreeAccess().getTitleKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__0__Impl"


    // $ANTLR start "rule__Degree__Group__1"
    // InternalResume.g:2429:1: rule__Degree__Group__1 : rule__Degree__Group__1__Impl rule__Degree__Group__2 ;
    public final void rule__Degree__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2433:1: ( rule__Degree__Group__1__Impl rule__Degree__Group__2 )
            // InternalResume.g:2434:2: rule__Degree__Group__1__Impl rule__Degree__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Degree__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__1"


    // $ANTLR start "rule__Degree__Group__1__Impl"
    // InternalResume.g:2441:1: rule__Degree__Group__1__Impl : ( ( rule__Degree__TitleAssignment_1 ) ) ;
    public final void rule__Degree__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2445:1: ( ( ( rule__Degree__TitleAssignment_1 ) ) )
            // InternalResume.g:2446:1: ( ( rule__Degree__TitleAssignment_1 ) )
            {
            // InternalResume.g:2446:1: ( ( rule__Degree__TitleAssignment_1 ) )
            // InternalResume.g:2447:2: ( rule__Degree__TitleAssignment_1 )
            {
             before(grammarAccess.getDegreeAccess().getTitleAssignment_1()); 
            // InternalResume.g:2448:2: ( rule__Degree__TitleAssignment_1 )
            // InternalResume.g:2448:3: rule__Degree__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Degree__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__1__Impl"


    // $ANTLR start "rule__Degree__Group__2"
    // InternalResume.g:2456:1: rule__Degree__Group__2 : rule__Degree__Group__2__Impl rule__Degree__Group__3 ;
    public final void rule__Degree__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2460:1: ( rule__Degree__Group__2__Impl rule__Degree__Group__3 )
            // InternalResume.g:2461:2: rule__Degree__Group__2__Impl rule__Degree__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Degree__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__2"


    // $ANTLR start "rule__Degree__Group__2__Impl"
    // InternalResume.g:2468:1: rule__Degree__Group__2__Impl : ( 'institution:' ) ;
    public final void rule__Degree__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2472:1: ( ( 'institution:' ) )
            // InternalResume.g:2473:1: ( 'institution:' )
            {
            // InternalResume.g:2473:1: ( 'institution:' )
            // InternalResume.g:2474:2: 'institution:'
            {
             before(grammarAccess.getDegreeAccess().getInstitutionKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getInstitutionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__2__Impl"


    // $ANTLR start "rule__Degree__Group__3"
    // InternalResume.g:2483:1: rule__Degree__Group__3 : rule__Degree__Group__3__Impl rule__Degree__Group__4 ;
    public final void rule__Degree__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2487:1: ( rule__Degree__Group__3__Impl rule__Degree__Group__4 )
            // InternalResume.g:2488:2: rule__Degree__Group__3__Impl rule__Degree__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Degree__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__3"


    // $ANTLR start "rule__Degree__Group__3__Impl"
    // InternalResume.g:2495:1: rule__Degree__Group__3__Impl : ( ( rule__Degree__InstitutionAssignment_3 ) ) ;
    public final void rule__Degree__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2499:1: ( ( ( rule__Degree__InstitutionAssignment_3 ) ) )
            // InternalResume.g:2500:1: ( ( rule__Degree__InstitutionAssignment_3 ) )
            {
            // InternalResume.g:2500:1: ( ( rule__Degree__InstitutionAssignment_3 ) )
            // InternalResume.g:2501:2: ( rule__Degree__InstitutionAssignment_3 )
            {
             before(grammarAccess.getDegreeAccess().getInstitutionAssignment_3()); 
            // InternalResume.g:2502:2: ( rule__Degree__InstitutionAssignment_3 )
            // InternalResume.g:2502:3: rule__Degree__InstitutionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Degree__InstitutionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getInstitutionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__3__Impl"


    // $ANTLR start "rule__Degree__Group__4"
    // InternalResume.g:2510:1: rule__Degree__Group__4 : rule__Degree__Group__4__Impl rule__Degree__Group__5 ;
    public final void rule__Degree__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2514:1: ( rule__Degree__Group__4__Impl rule__Degree__Group__5 )
            // InternalResume.g:2515:2: rule__Degree__Group__4__Impl rule__Degree__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Degree__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__4"


    // $ANTLR start "rule__Degree__Group__4__Impl"
    // InternalResume.g:2522:1: rule__Degree__Group__4__Impl : ( 'graduationDate:' ) ;
    public final void rule__Degree__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2526:1: ( ( 'graduationDate:' ) )
            // InternalResume.g:2527:1: ( 'graduationDate:' )
            {
            // InternalResume.g:2527:1: ( 'graduationDate:' )
            // InternalResume.g:2528:2: 'graduationDate:'
            {
             before(grammarAccess.getDegreeAccess().getGraduationDateKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getGraduationDateKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__4__Impl"


    // $ANTLR start "rule__Degree__Group__5"
    // InternalResume.g:2537:1: rule__Degree__Group__5 : rule__Degree__Group__5__Impl rule__Degree__Group__6 ;
    public final void rule__Degree__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2541:1: ( rule__Degree__Group__5__Impl rule__Degree__Group__6 )
            // InternalResume.g:2542:2: rule__Degree__Group__5__Impl rule__Degree__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Degree__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__5"


    // $ANTLR start "rule__Degree__Group__5__Impl"
    // InternalResume.g:2549:1: rule__Degree__Group__5__Impl : ( ( rule__Degree__GraduationDateAssignment_5 ) ) ;
    public final void rule__Degree__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2553:1: ( ( ( rule__Degree__GraduationDateAssignment_5 ) ) )
            // InternalResume.g:2554:1: ( ( rule__Degree__GraduationDateAssignment_5 ) )
            {
            // InternalResume.g:2554:1: ( ( rule__Degree__GraduationDateAssignment_5 ) )
            // InternalResume.g:2555:2: ( rule__Degree__GraduationDateAssignment_5 )
            {
             before(grammarAccess.getDegreeAccess().getGraduationDateAssignment_5()); 
            // InternalResume.g:2556:2: ( rule__Degree__GraduationDateAssignment_5 )
            // InternalResume.g:2556:3: rule__Degree__GraduationDateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Degree__GraduationDateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getGraduationDateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__5__Impl"


    // $ANTLR start "rule__Degree__Group__6"
    // InternalResume.g:2564:1: rule__Degree__Group__6 : rule__Degree__Group__6__Impl rule__Degree__Group__7 ;
    public final void rule__Degree__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2568:1: ( rule__Degree__Group__6__Impl rule__Degree__Group__7 )
            // InternalResume.g:2569:2: rule__Degree__Group__6__Impl rule__Degree__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Degree__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__6"


    // $ANTLR start "rule__Degree__Group__6__Impl"
    // InternalResume.g:2576:1: rule__Degree__Group__6__Impl : ( 'country:' ) ;
    public final void rule__Degree__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2580:1: ( ( 'country:' ) )
            // InternalResume.g:2581:1: ( 'country:' )
            {
            // InternalResume.g:2581:1: ( 'country:' )
            // InternalResume.g:2582:2: 'country:'
            {
             before(grammarAccess.getDegreeAccess().getCountryKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getCountryKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__6__Impl"


    // $ANTLR start "rule__Degree__Group__7"
    // InternalResume.g:2591:1: rule__Degree__Group__7 : rule__Degree__Group__7__Impl rule__Degree__Group__8 ;
    public final void rule__Degree__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2595:1: ( rule__Degree__Group__7__Impl rule__Degree__Group__8 )
            // InternalResume.g:2596:2: rule__Degree__Group__7__Impl rule__Degree__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Degree__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__7"


    // $ANTLR start "rule__Degree__Group__7__Impl"
    // InternalResume.g:2603:1: rule__Degree__Group__7__Impl : ( ( rule__Degree__CountryAssignment_7 ) ) ;
    public final void rule__Degree__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2607:1: ( ( ( rule__Degree__CountryAssignment_7 ) ) )
            // InternalResume.g:2608:1: ( ( rule__Degree__CountryAssignment_7 ) )
            {
            // InternalResume.g:2608:1: ( ( rule__Degree__CountryAssignment_7 ) )
            // InternalResume.g:2609:2: ( rule__Degree__CountryAssignment_7 )
            {
             before(grammarAccess.getDegreeAccess().getCountryAssignment_7()); 
            // InternalResume.g:2610:2: ( rule__Degree__CountryAssignment_7 )
            // InternalResume.g:2610:3: rule__Degree__CountryAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Degree__CountryAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getCountryAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__7__Impl"


    // $ANTLR start "rule__Degree__Group__8"
    // InternalResume.g:2618:1: rule__Degree__Group__8 : rule__Degree__Group__8__Impl rule__Degree__Group__9 ;
    public final void rule__Degree__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2622:1: ( rule__Degree__Group__8__Impl rule__Degree__Group__9 )
            // InternalResume.g:2623:2: rule__Degree__Group__8__Impl rule__Degree__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Degree__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Degree__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__8"


    // $ANTLR start "rule__Degree__Group__8__Impl"
    // InternalResume.g:2630:1: rule__Degree__Group__8__Impl : ( 'tags:' ) ;
    public final void rule__Degree__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2634:1: ( ( 'tags:' ) )
            // InternalResume.g:2635:1: ( 'tags:' )
            {
            // InternalResume.g:2635:1: ( 'tags:' )
            // InternalResume.g:2636:2: 'tags:'
            {
             before(grammarAccess.getDegreeAccess().getTagsKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getTagsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__8__Impl"


    // $ANTLR start "rule__Degree__Group__9"
    // InternalResume.g:2645:1: rule__Degree__Group__9 : rule__Degree__Group__9__Impl ;
    public final void rule__Degree__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2649:1: ( rule__Degree__Group__9__Impl )
            // InternalResume.g:2650:2: rule__Degree__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Degree__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__9"


    // $ANTLR start "rule__Degree__Group__9__Impl"
    // InternalResume.g:2656:1: rule__Degree__Group__9__Impl : ( ( rule__Degree__TagsAssignment_9 ) ) ;
    public final void rule__Degree__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2660:1: ( ( ( rule__Degree__TagsAssignment_9 ) ) )
            // InternalResume.g:2661:1: ( ( rule__Degree__TagsAssignment_9 ) )
            {
            // InternalResume.g:2661:1: ( ( rule__Degree__TagsAssignment_9 ) )
            // InternalResume.g:2662:2: ( rule__Degree__TagsAssignment_9 )
            {
             before(grammarAccess.getDegreeAccess().getTagsAssignment_9()); 
            // InternalResume.g:2663:2: ( rule__Degree__TagsAssignment_9 )
            // InternalResume.g:2663:3: rule__Degree__TagsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Degree__TagsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDegreeAccess().getTagsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__Group__9__Impl"


    // $ANTLR start "rule__Skills__Group__0"
    // InternalResume.g:2672:1: rule__Skills__Group__0 : rule__Skills__Group__0__Impl rule__Skills__Group__1 ;
    public final void rule__Skills__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2676:1: ( rule__Skills__Group__0__Impl rule__Skills__Group__1 )
            // InternalResume.g:2677:2: rule__Skills__Group__0__Impl rule__Skills__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Skills__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skills__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__0"


    // $ANTLR start "rule__Skills__Group__0__Impl"
    // InternalResume.g:2684:1: rule__Skills__Group__0__Impl : ( 'Skills' ) ;
    public final void rule__Skills__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2688:1: ( ( 'Skills' ) )
            // InternalResume.g:2689:1: ( 'Skills' )
            {
            // InternalResume.g:2689:1: ( 'Skills' )
            // InternalResume.g:2690:2: 'Skills'
            {
             before(grammarAccess.getSkillsAccess().getSkillsKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSkillsAccess().getSkillsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__0__Impl"


    // $ANTLR start "rule__Skills__Group__1"
    // InternalResume.g:2699:1: rule__Skills__Group__1 : rule__Skills__Group__1__Impl rule__Skills__Group__2 ;
    public final void rule__Skills__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2703:1: ( rule__Skills__Group__1__Impl rule__Skills__Group__2 )
            // InternalResume.g:2704:2: rule__Skills__Group__1__Impl rule__Skills__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Skills__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skills__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__1"


    // $ANTLR start "rule__Skills__Group__1__Impl"
    // InternalResume.g:2711:1: rule__Skills__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Skills__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2715:1: ( ( 'language:' ) )
            // InternalResume.g:2716:1: ( 'language:' )
            {
            // InternalResume.g:2716:1: ( 'language:' )
            // InternalResume.g:2717:2: 'language:'
            {
             before(grammarAccess.getSkillsAccess().getLanguageKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSkillsAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__1__Impl"


    // $ANTLR start "rule__Skills__Group__2"
    // InternalResume.g:2726:1: rule__Skills__Group__2 : rule__Skills__Group__2__Impl rule__Skills__Group__3 ;
    public final void rule__Skills__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2730:1: ( rule__Skills__Group__2__Impl rule__Skills__Group__3 )
            // InternalResume.g:2731:2: rule__Skills__Group__2__Impl rule__Skills__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Skills__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skills__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__2"


    // $ANTLR start "rule__Skills__Group__2__Impl"
    // InternalResume.g:2738:1: rule__Skills__Group__2__Impl : ( ( rule__Skills__LanguageAssignment_2 ) ) ;
    public final void rule__Skills__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2742:1: ( ( ( rule__Skills__LanguageAssignment_2 ) ) )
            // InternalResume.g:2743:1: ( ( rule__Skills__LanguageAssignment_2 ) )
            {
            // InternalResume.g:2743:1: ( ( rule__Skills__LanguageAssignment_2 ) )
            // InternalResume.g:2744:2: ( rule__Skills__LanguageAssignment_2 )
            {
             before(grammarAccess.getSkillsAccess().getLanguageAssignment_2()); 
            // InternalResume.g:2745:2: ( rule__Skills__LanguageAssignment_2 )
            // InternalResume.g:2745:3: rule__Skills__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Skills__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSkillsAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__2__Impl"


    // $ANTLR start "rule__Skills__Group__3"
    // InternalResume.g:2753:1: rule__Skills__Group__3 : rule__Skills__Group__3__Impl ;
    public final void rule__Skills__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2757:1: ( rule__Skills__Group__3__Impl )
            // InternalResume.g:2758:2: rule__Skills__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Skills__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__3"


    // $ANTLR start "rule__Skills__Group__3__Impl"
    // InternalResume.g:2764:1: rule__Skills__Group__3__Impl : ( ( ( rule__Skills__SkillsAssignment_3 ) ) ( ( rule__Skills__SkillsAssignment_3 )* ) ) ;
    public final void rule__Skills__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2768:1: ( ( ( ( rule__Skills__SkillsAssignment_3 ) ) ( ( rule__Skills__SkillsAssignment_3 )* ) ) )
            // InternalResume.g:2769:1: ( ( ( rule__Skills__SkillsAssignment_3 ) ) ( ( rule__Skills__SkillsAssignment_3 )* ) )
            {
            // InternalResume.g:2769:1: ( ( ( rule__Skills__SkillsAssignment_3 ) ) ( ( rule__Skills__SkillsAssignment_3 )* ) )
            // InternalResume.g:2770:2: ( ( rule__Skills__SkillsAssignment_3 ) ) ( ( rule__Skills__SkillsAssignment_3 )* )
            {
            // InternalResume.g:2770:2: ( ( rule__Skills__SkillsAssignment_3 ) )
            // InternalResume.g:2771:3: ( rule__Skills__SkillsAssignment_3 )
            {
             before(grammarAccess.getSkillsAccess().getSkillsAssignment_3()); 
            // InternalResume.g:2772:3: ( rule__Skills__SkillsAssignment_3 )
            // InternalResume.g:2772:4: rule__Skills__SkillsAssignment_3
            {
            pushFollow(FOLLOW_34);
            rule__Skills__SkillsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSkillsAccess().getSkillsAssignment_3()); 

            }

            // InternalResume.g:2775:2: ( ( rule__Skills__SkillsAssignment_3 )* )
            // InternalResume.g:2776:3: ( rule__Skills__SkillsAssignment_3 )*
            {
             before(grammarAccess.getSkillsAccess().getSkillsAssignment_3()); 
            // InternalResume.g:2777:3: ( rule__Skills__SkillsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalResume.g:2777:4: rule__Skills__SkillsAssignment_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Skills__SkillsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSkillsAccess().getSkillsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__Group__3__Impl"


    // $ANTLR start "rule__Skill__Group__0"
    // InternalResume.g:2787:1: rule__Skill__Group__0 : rule__Skill__Group__0__Impl rule__Skill__Group__1 ;
    public final void rule__Skill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2791:1: ( rule__Skill__Group__0__Impl rule__Skill__Group__1 )
            // InternalResume.g:2792:2: rule__Skill__Group__0__Impl rule__Skill__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Skill__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skill__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__0"


    // $ANTLR start "rule__Skill__Group__0__Impl"
    // InternalResume.g:2799:1: rule__Skill__Group__0__Impl : ( ( rule__Skill__NameAssignment_0 ) ) ;
    public final void rule__Skill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2803:1: ( ( ( rule__Skill__NameAssignment_0 ) ) )
            // InternalResume.g:2804:1: ( ( rule__Skill__NameAssignment_0 ) )
            {
            // InternalResume.g:2804:1: ( ( rule__Skill__NameAssignment_0 ) )
            // InternalResume.g:2805:2: ( rule__Skill__NameAssignment_0 )
            {
             before(grammarAccess.getSkillAccess().getNameAssignment_0()); 
            // InternalResume.g:2806:2: ( rule__Skill__NameAssignment_0 )
            // InternalResume.g:2806:3: rule__Skill__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Skill__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSkillAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__0__Impl"


    // $ANTLR start "rule__Skill__Group__1"
    // InternalResume.g:2814:1: rule__Skill__Group__1 : rule__Skill__Group__1__Impl rule__Skill__Group__2 ;
    public final void rule__Skill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2818:1: ( rule__Skill__Group__1__Impl rule__Skill__Group__2 )
            // InternalResume.g:2819:2: rule__Skill__Group__1__Impl rule__Skill__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Skill__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skill__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__1"


    // $ANTLR start "rule__Skill__Group__1__Impl"
    // InternalResume.g:2826:1: rule__Skill__Group__1__Impl : ( 'title:' ) ;
    public final void rule__Skill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2830:1: ( ( 'title:' ) )
            // InternalResume.g:2831:1: ( 'title:' )
            {
            // InternalResume.g:2831:1: ( 'title:' )
            // InternalResume.g:2832:2: 'title:'
            {
             before(grammarAccess.getSkillAccess().getTitleKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSkillAccess().getTitleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__1__Impl"


    // $ANTLR start "rule__Skill__Group__2"
    // InternalResume.g:2841:1: rule__Skill__Group__2 : rule__Skill__Group__2__Impl rule__Skill__Group__3 ;
    public final void rule__Skill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2845:1: ( rule__Skill__Group__2__Impl rule__Skill__Group__3 )
            // InternalResume.g:2846:2: rule__Skill__Group__2__Impl rule__Skill__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Skill__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skill__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__2"


    // $ANTLR start "rule__Skill__Group__2__Impl"
    // InternalResume.g:2853:1: rule__Skill__Group__2__Impl : ( ( rule__Skill__TitleAssignment_2 ) ) ;
    public final void rule__Skill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2857:1: ( ( ( rule__Skill__TitleAssignment_2 ) ) )
            // InternalResume.g:2858:1: ( ( rule__Skill__TitleAssignment_2 ) )
            {
            // InternalResume.g:2858:1: ( ( rule__Skill__TitleAssignment_2 ) )
            // InternalResume.g:2859:2: ( rule__Skill__TitleAssignment_2 )
            {
             before(grammarAccess.getSkillAccess().getTitleAssignment_2()); 
            // InternalResume.g:2860:2: ( rule__Skill__TitleAssignment_2 )
            // InternalResume.g:2860:3: rule__Skill__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Skill__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSkillAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__2__Impl"


    // $ANTLR start "rule__Skill__Group__3"
    // InternalResume.g:2868:1: rule__Skill__Group__3 : rule__Skill__Group__3__Impl rule__Skill__Group__4 ;
    public final void rule__Skill__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2872:1: ( rule__Skill__Group__3__Impl rule__Skill__Group__4 )
            // InternalResume.g:2873:2: rule__Skill__Group__3__Impl rule__Skill__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Skill__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Skill__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__3"


    // $ANTLR start "rule__Skill__Group__3__Impl"
    // InternalResume.g:2880:1: rule__Skill__Group__3__Impl : ( 'tags:' ) ;
    public final void rule__Skill__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2884:1: ( ( 'tags:' ) )
            // InternalResume.g:2885:1: ( 'tags:' )
            {
            // InternalResume.g:2885:1: ( 'tags:' )
            // InternalResume.g:2886:2: 'tags:'
            {
             before(grammarAccess.getSkillAccess().getTagsKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSkillAccess().getTagsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__3__Impl"


    // $ANTLR start "rule__Skill__Group__4"
    // InternalResume.g:2895:1: rule__Skill__Group__4 : rule__Skill__Group__4__Impl ;
    public final void rule__Skill__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2899:1: ( rule__Skill__Group__4__Impl )
            // InternalResume.g:2900:2: rule__Skill__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Skill__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__4"


    // $ANTLR start "rule__Skill__Group__4__Impl"
    // InternalResume.g:2906:1: rule__Skill__Group__4__Impl : ( ( rule__Skill__TagsAssignment_4 ) ) ;
    public final void rule__Skill__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2910:1: ( ( ( rule__Skill__TagsAssignment_4 ) ) )
            // InternalResume.g:2911:1: ( ( rule__Skill__TagsAssignment_4 ) )
            {
            // InternalResume.g:2911:1: ( ( rule__Skill__TagsAssignment_4 ) )
            // InternalResume.g:2912:2: ( rule__Skill__TagsAssignment_4 )
            {
             before(grammarAccess.getSkillAccess().getTagsAssignment_4()); 
            // InternalResume.g:2913:2: ( rule__Skill__TagsAssignment_4 )
            // InternalResume.g:2913:3: rule__Skill__TagsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Skill__TagsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSkillAccess().getTagsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__Group__4__Impl"


    // $ANTLR start "rule__Interests__Group__0"
    // InternalResume.g:2922:1: rule__Interests__Group__0 : rule__Interests__Group__0__Impl rule__Interests__Group__1 ;
    public final void rule__Interests__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2926:1: ( rule__Interests__Group__0__Impl rule__Interests__Group__1 )
            // InternalResume.g:2927:2: rule__Interests__Group__0__Impl rule__Interests__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Interests__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interests__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__0"


    // $ANTLR start "rule__Interests__Group__0__Impl"
    // InternalResume.g:2934:1: rule__Interests__Group__0__Impl : ( 'Interests' ) ;
    public final void rule__Interests__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2938:1: ( ( 'Interests' ) )
            // InternalResume.g:2939:1: ( 'Interests' )
            {
            // InternalResume.g:2939:1: ( 'Interests' )
            // InternalResume.g:2940:2: 'Interests'
            {
             before(grammarAccess.getInterestsAccess().getInterestsKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInterestsAccess().getInterestsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__0__Impl"


    // $ANTLR start "rule__Interests__Group__1"
    // InternalResume.g:2949:1: rule__Interests__Group__1 : rule__Interests__Group__1__Impl rule__Interests__Group__2 ;
    public final void rule__Interests__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2953:1: ( rule__Interests__Group__1__Impl rule__Interests__Group__2 )
            // InternalResume.g:2954:2: rule__Interests__Group__1__Impl rule__Interests__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Interests__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interests__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__1"


    // $ANTLR start "rule__Interests__Group__1__Impl"
    // InternalResume.g:2961:1: rule__Interests__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Interests__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2965:1: ( ( 'language:' ) )
            // InternalResume.g:2966:1: ( 'language:' )
            {
            // InternalResume.g:2966:1: ( 'language:' )
            // InternalResume.g:2967:2: 'language:'
            {
             before(grammarAccess.getInterestsAccess().getLanguageKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInterestsAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__1__Impl"


    // $ANTLR start "rule__Interests__Group__2"
    // InternalResume.g:2976:1: rule__Interests__Group__2 : rule__Interests__Group__2__Impl rule__Interests__Group__3 ;
    public final void rule__Interests__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2980:1: ( rule__Interests__Group__2__Impl rule__Interests__Group__3 )
            // InternalResume.g:2981:2: rule__Interests__Group__2__Impl rule__Interests__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Interests__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interests__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__2"


    // $ANTLR start "rule__Interests__Group__2__Impl"
    // InternalResume.g:2988:1: rule__Interests__Group__2__Impl : ( ( rule__Interests__LanguageAssignment_2 ) ) ;
    public final void rule__Interests__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:2992:1: ( ( ( rule__Interests__LanguageAssignment_2 ) ) )
            // InternalResume.g:2993:1: ( ( rule__Interests__LanguageAssignment_2 ) )
            {
            // InternalResume.g:2993:1: ( ( rule__Interests__LanguageAssignment_2 ) )
            // InternalResume.g:2994:2: ( rule__Interests__LanguageAssignment_2 )
            {
             before(grammarAccess.getInterestsAccess().getLanguageAssignment_2()); 
            // InternalResume.g:2995:2: ( rule__Interests__LanguageAssignment_2 )
            // InternalResume.g:2995:3: rule__Interests__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Interests__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterestsAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__2__Impl"


    // $ANTLR start "rule__Interests__Group__3"
    // InternalResume.g:3003:1: rule__Interests__Group__3 : rule__Interests__Group__3__Impl rule__Interests__Group__4 ;
    public final void rule__Interests__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3007:1: ( rule__Interests__Group__3__Impl rule__Interests__Group__4 )
            // InternalResume.g:3008:2: rule__Interests__Group__3__Impl rule__Interests__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Interests__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interests__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__3"


    // $ANTLR start "rule__Interests__Group__3__Impl"
    // InternalResume.g:3015:1: rule__Interests__Group__3__Impl : ( 'tags:' ) ;
    public final void rule__Interests__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3019:1: ( ( 'tags:' ) )
            // InternalResume.g:3020:1: ( 'tags:' )
            {
            // InternalResume.g:3020:1: ( 'tags:' )
            // InternalResume.g:3021:2: 'tags:'
            {
             before(grammarAccess.getInterestsAccess().getTagsKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInterestsAccess().getTagsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__3__Impl"


    // $ANTLR start "rule__Interests__Group__4"
    // InternalResume.g:3030:1: rule__Interests__Group__4 : rule__Interests__Group__4__Impl ;
    public final void rule__Interests__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3034:1: ( rule__Interests__Group__4__Impl )
            // InternalResume.g:3035:2: rule__Interests__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interests__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__4"


    // $ANTLR start "rule__Interests__Group__4__Impl"
    // InternalResume.g:3041:1: rule__Interests__Group__4__Impl : ( ( rule__Interests__TagsAssignment_4 ) ) ;
    public final void rule__Interests__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3045:1: ( ( ( rule__Interests__TagsAssignment_4 ) ) )
            // InternalResume.g:3046:1: ( ( rule__Interests__TagsAssignment_4 ) )
            {
            // InternalResume.g:3046:1: ( ( rule__Interests__TagsAssignment_4 ) )
            // InternalResume.g:3047:2: ( rule__Interests__TagsAssignment_4 )
            {
             before(grammarAccess.getInterestsAccess().getTagsAssignment_4()); 
            // InternalResume.g:3048:2: ( rule__Interests__TagsAssignment_4 )
            // InternalResume.g:3048:3: rule__Interests__TagsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Interests__TagsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInterestsAccess().getTagsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__Group__4__Impl"


    // $ANTLR start "rule__Languages__Group__0"
    // InternalResume.g:3057:1: rule__Languages__Group__0 : rule__Languages__Group__0__Impl rule__Languages__Group__1 ;
    public final void rule__Languages__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3061:1: ( rule__Languages__Group__0__Impl rule__Languages__Group__1 )
            // InternalResume.g:3062:2: rule__Languages__Group__0__Impl rule__Languages__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Languages__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languages__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__0"


    // $ANTLR start "rule__Languages__Group__0__Impl"
    // InternalResume.g:3069:1: rule__Languages__Group__0__Impl : ( 'Languages' ) ;
    public final void rule__Languages__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3073:1: ( ( 'Languages' ) )
            // InternalResume.g:3074:1: ( 'Languages' )
            {
            // InternalResume.g:3074:1: ( 'Languages' )
            // InternalResume.g:3075:2: 'Languages'
            {
             before(grammarAccess.getLanguagesAccess().getLanguagesKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLanguagesAccess().getLanguagesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__0__Impl"


    // $ANTLR start "rule__Languages__Group__1"
    // InternalResume.g:3084:1: rule__Languages__Group__1 : rule__Languages__Group__1__Impl rule__Languages__Group__2 ;
    public final void rule__Languages__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3088:1: ( rule__Languages__Group__1__Impl rule__Languages__Group__2 )
            // InternalResume.g:3089:2: rule__Languages__Group__1__Impl rule__Languages__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Languages__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languages__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__1"


    // $ANTLR start "rule__Languages__Group__1__Impl"
    // InternalResume.g:3096:1: rule__Languages__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Languages__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3100:1: ( ( 'language:' ) )
            // InternalResume.g:3101:1: ( 'language:' )
            {
            // InternalResume.g:3101:1: ( 'language:' )
            // InternalResume.g:3102:2: 'language:'
            {
             before(grammarAccess.getLanguagesAccess().getLanguageKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLanguagesAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__1__Impl"


    // $ANTLR start "rule__Languages__Group__2"
    // InternalResume.g:3111:1: rule__Languages__Group__2 : rule__Languages__Group__2__Impl rule__Languages__Group__3 ;
    public final void rule__Languages__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3115:1: ( rule__Languages__Group__2__Impl rule__Languages__Group__3 )
            // InternalResume.g:3116:2: rule__Languages__Group__2__Impl rule__Languages__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Languages__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languages__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__2"


    // $ANTLR start "rule__Languages__Group__2__Impl"
    // InternalResume.g:3123:1: rule__Languages__Group__2__Impl : ( ( rule__Languages__LanguageAssignment_2 ) ) ;
    public final void rule__Languages__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3127:1: ( ( ( rule__Languages__LanguageAssignment_2 ) ) )
            // InternalResume.g:3128:1: ( ( rule__Languages__LanguageAssignment_2 ) )
            {
            // InternalResume.g:3128:1: ( ( rule__Languages__LanguageAssignment_2 ) )
            // InternalResume.g:3129:2: ( rule__Languages__LanguageAssignment_2 )
            {
             before(grammarAccess.getLanguagesAccess().getLanguageAssignment_2()); 
            // InternalResume.g:3130:2: ( rule__Languages__LanguageAssignment_2 )
            // InternalResume.g:3130:3: rule__Languages__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Languages__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLanguagesAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__2__Impl"


    // $ANTLR start "rule__Languages__Group__3"
    // InternalResume.g:3138:1: rule__Languages__Group__3 : rule__Languages__Group__3__Impl rule__Languages__Group__4 ;
    public final void rule__Languages__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3142:1: ( rule__Languages__Group__3__Impl rule__Languages__Group__4 )
            // InternalResume.g:3143:2: rule__Languages__Group__3__Impl rule__Languages__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Languages__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languages__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__3"


    // $ANTLR start "rule__Languages__Group__3__Impl"
    // InternalResume.g:3150:1: rule__Languages__Group__3__Impl : ( 'tags:' ) ;
    public final void rule__Languages__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3154:1: ( ( 'tags:' ) )
            // InternalResume.g:3155:1: ( 'tags:' )
            {
            // InternalResume.g:3155:1: ( 'tags:' )
            // InternalResume.g:3156:2: 'tags:'
            {
             before(grammarAccess.getLanguagesAccess().getTagsKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLanguagesAccess().getTagsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__3__Impl"


    // $ANTLR start "rule__Languages__Group__4"
    // InternalResume.g:3165:1: rule__Languages__Group__4 : rule__Languages__Group__4__Impl ;
    public final void rule__Languages__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3169:1: ( rule__Languages__Group__4__Impl )
            // InternalResume.g:3170:2: rule__Languages__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Languages__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__4"


    // $ANTLR start "rule__Languages__Group__4__Impl"
    // InternalResume.g:3176:1: rule__Languages__Group__4__Impl : ( ( rule__Languages__TagsAssignment_4 ) ) ;
    public final void rule__Languages__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3180:1: ( ( ( rule__Languages__TagsAssignment_4 ) ) )
            // InternalResume.g:3181:1: ( ( rule__Languages__TagsAssignment_4 ) )
            {
            // InternalResume.g:3181:1: ( ( rule__Languages__TagsAssignment_4 ) )
            // InternalResume.g:3182:2: ( rule__Languages__TagsAssignment_4 )
            {
             before(grammarAccess.getLanguagesAccess().getTagsAssignment_4()); 
            // InternalResume.g:3183:2: ( rule__Languages__TagsAssignment_4 )
            // InternalResume.g:3183:3: rule__Languages__TagsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Languages__TagsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLanguagesAccess().getTagsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__Group__4__Impl"


    // $ANTLR start "rule__Metrics__Group__0"
    // InternalResume.g:3192:1: rule__Metrics__Group__0 : rule__Metrics__Group__0__Impl rule__Metrics__Group__1 ;
    public final void rule__Metrics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3196:1: ( rule__Metrics__Group__0__Impl rule__Metrics__Group__1 )
            // InternalResume.g:3197:2: rule__Metrics__Group__0__Impl rule__Metrics__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Metrics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metrics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__0"


    // $ANTLR start "rule__Metrics__Group__0__Impl"
    // InternalResume.g:3204:1: rule__Metrics__Group__0__Impl : ( 'Metrics' ) ;
    public final void rule__Metrics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3208:1: ( ( 'Metrics' ) )
            // InternalResume.g:3209:1: ( 'Metrics' )
            {
            // InternalResume.g:3209:1: ( 'Metrics' )
            // InternalResume.g:3210:2: 'Metrics'
            {
             before(grammarAccess.getMetricsAccess().getMetricsKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMetricsAccess().getMetricsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__0__Impl"


    // $ANTLR start "rule__Metrics__Group__1"
    // InternalResume.g:3219:1: rule__Metrics__Group__1 : rule__Metrics__Group__1__Impl rule__Metrics__Group__2 ;
    public final void rule__Metrics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3223:1: ( rule__Metrics__Group__1__Impl rule__Metrics__Group__2 )
            // InternalResume.g:3224:2: rule__Metrics__Group__1__Impl rule__Metrics__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Metrics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metrics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__1"


    // $ANTLR start "rule__Metrics__Group__1__Impl"
    // InternalResume.g:3231:1: rule__Metrics__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Metrics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3235:1: ( ( 'language:' ) )
            // InternalResume.g:3236:1: ( 'language:' )
            {
            // InternalResume.g:3236:1: ( 'language:' )
            // InternalResume.g:3237:2: 'language:'
            {
             before(grammarAccess.getMetricsAccess().getLanguageKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMetricsAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__1__Impl"


    // $ANTLR start "rule__Metrics__Group__2"
    // InternalResume.g:3246:1: rule__Metrics__Group__2 : rule__Metrics__Group__2__Impl rule__Metrics__Group__3 ;
    public final void rule__Metrics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3250:1: ( rule__Metrics__Group__2__Impl rule__Metrics__Group__3 )
            // InternalResume.g:3251:2: rule__Metrics__Group__2__Impl rule__Metrics__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Metrics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metrics__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__2"


    // $ANTLR start "rule__Metrics__Group__2__Impl"
    // InternalResume.g:3258:1: rule__Metrics__Group__2__Impl : ( ( rule__Metrics__LanguageAssignment_2 ) ) ;
    public final void rule__Metrics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3262:1: ( ( ( rule__Metrics__LanguageAssignment_2 ) ) )
            // InternalResume.g:3263:1: ( ( rule__Metrics__LanguageAssignment_2 ) )
            {
            // InternalResume.g:3263:1: ( ( rule__Metrics__LanguageAssignment_2 ) )
            // InternalResume.g:3264:2: ( rule__Metrics__LanguageAssignment_2 )
            {
             before(grammarAccess.getMetricsAccess().getLanguageAssignment_2()); 
            // InternalResume.g:3265:2: ( rule__Metrics__LanguageAssignment_2 )
            // InternalResume.g:3265:3: rule__Metrics__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Metrics__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetricsAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__2__Impl"


    // $ANTLR start "rule__Metrics__Group__3"
    // InternalResume.g:3273:1: rule__Metrics__Group__3 : rule__Metrics__Group__3__Impl ;
    public final void rule__Metrics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3277:1: ( rule__Metrics__Group__3__Impl )
            // InternalResume.g:3278:2: rule__Metrics__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metrics__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__3"


    // $ANTLR start "rule__Metrics__Group__3__Impl"
    // InternalResume.g:3284:1: rule__Metrics__Group__3__Impl : ( ( ( rule__Metrics__MetricsAssignment_3 ) ) ( ( rule__Metrics__MetricsAssignment_3 )* ) ) ;
    public final void rule__Metrics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3288:1: ( ( ( ( rule__Metrics__MetricsAssignment_3 ) ) ( ( rule__Metrics__MetricsAssignment_3 )* ) ) )
            // InternalResume.g:3289:1: ( ( ( rule__Metrics__MetricsAssignment_3 ) ) ( ( rule__Metrics__MetricsAssignment_3 )* ) )
            {
            // InternalResume.g:3289:1: ( ( ( rule__Metrics__MetricsAssignment_3 ) ) ( ( rule__Metrics__MetricsAssignment_3 )* ) )
            // InternalResume.g:3290:2: ( ( rule__Metrics__MetricsAssignment_3 ) ) ( ( rule__Metrics__MetricsAssignment_3 )* )
            {
            // InternalResume.g:3290:2: ( ( rule__Metrics__MetricsAssignment_3 ) )
            // InternalResume.g:3291:3: ( rule__Metrics__MetricsAssignment_3 )
            {
             before(grammarAccess.getMetricsAccess().getMetricsAssignment_3()); 
            // InternalResume.g:3292:3: ( rule__Metrics__MetricsAssignment_3 )
            // InternalResume.g:3292:4: rule__Metrics__MetricsAssignment_3
            {
            pushFollow(FOLLOW_36);
            rule__Metrics__MetricsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMetricsAccess().getMetricsAssignment_3()); 

            }

            // InternalResume.g:3295:2: ( ( rule__Metrics__MetricsAssignment_3 )* )
            // InternalResume.g:3296:3: ( rule__Metrics__MetricsAssignment_3 )*
            {
             before(grammarAccess.getMetricsAccess().getMetricsAssignment_3()); 
            // InternalResume.g:3297:3: ( rule__Metrics__MetricsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==42) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalResume.g:3297:4: rule__Metrics__MetricsAssignment_3
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Metrics__MetricsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMetricsAccess().getMetricsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__Group__3__Impl"


    // $ANTLR start "rule__Metric__Group__0"
    // InternalResume.g:3307:1: rule__Metric__Group__0 : rule__Metric__Group__0__Impl rule__Metric__Group__1 ;
    public final void rule__Metric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3311:1: ( rule__Metric__Group__0__Impl rule__Metric__Group__1 )
            // InternalResume.g:3312:2: rule__Metric__Group__0__Impl rule__Metric__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Metric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__0"


    // $ANTLR start "rule__Metric__Group__0__Impl"
    // InternalResume.g:3319:1: rule__Metric__Group__0__Impl : ( 'Metric' ) ;
    public final void rule__Metric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3323:1: ( ( 'Metric' ) )
            // InternalResume.g:3324:1: ( 'Metric' )
            {
            // InternalResume.g:3324:1: ( 'Metric' )
            // InternalResume.g:3325:2: 'Metric'
            {
             before(grammarAccess.getMetricAccess().getMetricKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getMetricKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__0__Impl"


    // $ANTLR start "rule__Metric__Group__1"
    // InternalResume.g:3334:1: rule__Metric__Group__1 : rule__Metric__Group__1__Impl rule__Metric__Group__2 ;
    public final void rule__Metric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3338:1: ( rule__Metric__Group__1__Impl rule__Metric__Group__2 )
            // InternalResume.g:3339:2: rule__Metric__Group__1__Impl rule__Metric__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Metric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__1"


    // $ANTLR start "rule__Metric__Group__1__Impl"
    // InternalResume.g:3346:1: rule__Metric__Group__1__Impl : ( ( rule__Metric__NameAssignment_1 ) ) ;
    public final void rule__Metric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3350:1: ( ( ( rule__Metric__NameAssignment_1 ) ) )
            // InternalResume.g:3351:1: ( ( rule__Metric__NameAssignment_1 ) )
            {
            // InternalResume.g:3351:1: ( ( rule__Metric__NameAssignment_1 ) )
            // InternalResume.g:3352:2: ( rule__Metric__NameAssignment_1 )
            {
             before(grammarAccess.getMetricAccess().getNameAssignment_1()); 
            // InternalResume.g:3353:2: ( rule__Metric__NameAssignment_1 )
            // InternalResume.g:3353:3: rule__Metric__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Metric__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetricAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__1__Impl"


    // $ANTLR start "rule__Metric__Group__2"
    // InternalResume.g:3361:1: rule__Metric__Group__2 : rule__Metric__Group__2__Impl rule__Metric__Group__3 ;
    public final void rule__Metric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3365:1: ( rule__Metric__Group__2__Impl rule__Metric__Group__3 )
            // InternalResume.g:3366:2: rule__Metric__Group__2__Impl rule__Metric__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Metric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metric__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__2"


    // $ANTLR start "rule__Metric__Group__2__Impl"
    // InternalResume.g:3373:1: rule__Metric__Group__2__Impl : ( '=' ) ;
    public final void rule__Metric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3377:1: ( ( '=' ) )
            // InternalResume.g:3378:1: ( '=' )
            {
            // InternalResume.g:3378:1: ( '=' )
            // InternalResume.g:3379:2: '='
            {
             before(grammarAccess.getMetricAccess().getEqualsSignKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__2__Impl"


    // $ANTLR start "rule__Metric__Group__3"
    // InternalResume.g:3388:1: rule__Metric__Group__3 : rule__Metric__Group__3__Impl ;
    public final void rule__Metric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3392:1: ( rule__Metric__Group__3__Impl )
            // InternalResume.g:3393:2: rule__Metric__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metric__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__3"


    // $ANTLR start "rule__Metric__Group__3__Impl"
    // InternalResume.g:3399:1: rule__Metric__Group__3__Impl : ( ( rule__Metric__ExpressionAssignment_3 ) ) ;
    public final void rule__Metric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3403:1: ( ( ( rule__Metric__ExpressionAssignment_3 ) ) )
            // InternalResume.g:3404:1: ( ( rule__Metric__ExpressionAssignment_3 ) )
            {
            // InternalResume.g:3404:1: ( ( rule__Metric__ExpressionAssignment_3 ) )
            // InternalResume.g:3405:2: ( rule__Metric__ExpressionAssignment_3 )
            {
             before(grammarAccess.getMetricAccess().getExpressionAssignment_3()); 
            // InternalResume.g:3406:2: ( rule__Metric__ExpressionAssignment_3 )
            // InternalResume.g:3406:3: rule__Metric__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Metric__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMetricAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Group__3__Impl"


    // $ANTLR start "rule__Subtraction__Group__0"
    // InternalResume.g:3415:1: rule__Subtraction__Group__0 : rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 ;
    public final void rule__Subtraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3419:1: ( rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1 )
            // InternalResume.g:3420:2: rule__Subtraction__Group__0__Impl rule__Subtraction__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Subtraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__0"


    // $ANTLR start "rule__Subtraction__Group__0__Impl"
    // InternalResume.g:3427:1: rule__Subtraction__Group__0__Impl : ( ruleNumberLiteral ) ;
    public final void rule__Subtraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3431:1: ( ( ruleNumberLiteral ) )
            // InternalResume.g:3432:1: ( ruleNumberLiteral )
            {
            // InternalResume.g:3432:1: ( ruleNumberLiteral )
            // InternalResume.g:3433:2: ruleNumberLiteral
            {
             before(grammarAccess.getSubtractionAccess().getNumberLiteralParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getSubtractionAccess().getNumberLiteralParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__0__Impl"


    // $ANTLR start "rule__Subtraction__Group__1"
    // InternalResume.g:3442:1: rule__Subtraction__Group__1 : rule__Subtraction__Group__1__Impl ;
    public final void rule__Subtraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3446:1: ( rule__Subtraction__Group__1__Impl )
            // InternalResume.g:3447:2: rule__Subtraction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__1"


    // $ANTLR start "rule__Subtraction__Group__1__Impl"
    // InternalResume.g:3453:1: rule__Subtraction__Group__1__Impl : ( ( rule__Subtraction__Group_1__0 )* ) ;
    public final void rule__Subtraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3457:1: ( ( ( rule__Subtraction__Group_1__0 )* ) )
            // InternalResume.g:3458:1: ( ( rule__Subtraction__Group_1__0 )* )
            {
            // InternalResume.g:3458:1: ( ( rule__Subtraction__Group_1__0 )* )
            // InternalResume.g:3459:2: ( rule__Subtraction__Group_1__0 )*
            {
             before(grammarAccess.getSubtractionAccess().getGroup_1()); 
            // InternalResume.g:3460:2: ( rule__Subtraction__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==44) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalResume.g:3460:3: rule__Subtraction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Subtraction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSubtractionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group__1__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__0"
    // InternalResume.g:3469:1: rule__Subtraction__Group_1__0 : rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1 ;
    public final void rule__Subtraction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3473:1: ( rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1 )
            // InternalResume.g:3474:2: rule__Subtraction__Group_1__0__Impl rule__Subtraction__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__Subtraction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__0"


    // $ANTLR start "rule__Subtraction__Group_1__0__Impl"
    // InternalResume.g:3481:1: rule__Subtraction__Group_1__0__Impl : ( () ) ;
    public final void rule__Subtraction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3485:1: ( ( () ) )
            // InternalResume.g:3486:1: ( () )
            {
            // InternalResume.g:3486:1: ( () )
            // InternalResume.g:3487:2: ()
            {
             before(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); 
            // InternalResume.g:3488:2: ()
            // InternalResume.g:3488:3: 
            {
            }

             after(grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__0__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__1"
    // InternalResume.g:3496:1: rule__Subtraction__Group_1__1 : rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2 ;
    public final void rule__Subtraction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3500:1: ( rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2 )
            // InternalResume.g:3501:2: rule__Subtraction__Group_1__1__Impl rule__Subtraction__Group_1__2
            {
            pushFollow(FOLLOW_38);
            rule__Subtraction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtraction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__1"


    // $ANTLR start "rule__Subtraction__Group_1__1__Impl"
    // InternalResume.g:3508:1: rule__Subtraction__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Subtraction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3512:1: ( ( '-' ) )
            // InternalResume.g:3513:1: ( '-' )
            {
            // InternalResume.g:3513:1: ( '-' )
            // InternalResume.g:3514:2: '-'
            {
             before(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__1__Impl"


    // $ANTLR start "rule__Subtraction__Group_1__2"
    // InternalResume.g:3523:1: rule__Subtraction__Group_1__2 : rule__Subtraction__Group_1__2__Impl ;
    public final void rule__Subtraction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3527:1: ( rule__Subtraction__Group_1__2__Impl )
            // InternalResume.g:3528:2: rule__Subtraction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__2"


    // $ANTLR start "rule__Subtraction__Group_1__2__Impl"
    // InternalResume.g:3534:1: rule__Subtraction__Group_1__2__Impl : ( ( rule__Subtraction__RightAssignment_1_2 ) ) ;
    public final void rule__Subtraction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3538:1: ( ( ( rule__Subtraction__RightAssignment_1_2 ) ) )
            // InternalResume.g:3539:1: ( ( rule__Subtraction__RightAssignment_1_2 ) )
            {
            // InternalResume.g:3539:1: ( ( rule__Subtraction__RightAssignment_1_2 ) )
            // InternalResume.g:3540:2: ( rule__Subtraction__RightAssignment_1_2 )
            {
             before(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); 
            // InternalResume.g:3541:2: ( rule__Subtraction__RightAssignment_1_2 )
            // InternalResume.g:3541:3: rule__Subtraction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Subtraction__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSubtractionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__Group_1__2__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__0"
    // InternalResume.g:3550:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3554:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // InternalResume.g:3555:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0"


    // $ANTLR start "rule__NumberLiteral__Group__0__Impl"
    // InternalResume.g:3562:1: rule__NumberLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3566:1: ( ( () ) )
            // InternalResume.g:3567:1: ( () )
            {
            // InternalResume.g:3567:1: ( () )
            // InternalResume.g:3568:2: ()
            {
             before(grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0()); 
            // InternalResume.g:3569:2: ()
            // InternalResume.g:3569:3: 
            {
            }

             after(grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__1"
    // InternalResume.g:3577:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3581:1: ( rule__NumberLiteral__Group__1__Impl )
            // InternalResume.g:3582:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1"


    // $ANTLR start "rule__NumberLiteral__Group__1__Impl"
    // InternalResume.g:3588:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3592:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // InternalResume.g:3593:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // InternalResume.g:3593:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // InternalResume.g:3594:2: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // InternalResume.g:3595:2: ( rule__NumberLiteral__ValueAssignment_1 )
            // InternalResume.g:3595:3: rule__NumberLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1__Impl"


    // $ANTLR start "rule__Customization__Group__0"
    // InternalResume.g:3604:1: rule__Customization__Group__0 : rule__Customization__Group__0__Impl rule__Customization__Group__1 ;
    public final void rule__Customization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3608:1: ( rule__Customization__Group__0__Impl rule__Customization__Group__1 )
            // InternalResume.g:3609:2: rule__Customization__Group__0__Impl rule__Customization__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Customization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__0"


    // $ANTLR start "rule__Customization__Group__0__Impl"
    // InternalResume.g:3616:1: rule__Customization__Group__0__Impl : ( 'Customization' ) ;
    public final void rule__Customization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3620:1: ( ( 'Customization' ) )
            // InternalResume.g:3621:1: ( 'Customization' )
            {
            // InternalResume.g:3621:1: ( 'Customization' )
            // InternalResume.g:3622:2: 'Customization'
            {
             before(grammarAccess.getCustomizationAccess().getCustomizationKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getCustomizationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__0__Impl"


    // $ANTLR start "rule__Customization__Group__1"
    // InternalResume.g:3631:1: rule__Customization__Group__1 : rule__Customization__Group__1__Impl rule__Customization__Group__2 ;
    public final void rule__Customization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3635:1: ( rule__Customization__Group__1__Impl rule__Customization__Group__2 )
            // InternalResume.g:3636:2: rule__Customization__Group__1__Impl rule__Customization__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Customization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__1"


    // $ANTLR start "rule__Customization__Group__1__Impl"
    // InternalResume.g:3643:1: rule__Customization__Group__1__Impl : ( 'language:' ) ;
    public final void rule__Customization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3647:1: ( ( 'language:' ) )
            // InternalResume.g:3648:1: ( 'language:' )
            {
            // InternalResume.g:3648:1: ( 'language:' )
            // InternalResume.g:3649:2: 'language:'
            {
             before(grammarAccess.getCustomizationAccess().getLanguageKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getLanguageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__1__Impl"


    // $ANTLR start "rule__Customization__Group__2"
    // InternalResume.g:3658:1: rule__Customization__Group__2 : rule__Customization__Group__2__Impl rule__Customization__Group__3 ;
    public final void rule__Customization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3662:1: ( rule__Customization__Group__2__Impl rule__Customization__Group__3 )
            // InternalResume.g:3663:2: rule__Customization__Group__2__Impl rule__Customization__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Customization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__2"


    // $ANTLR start "rule__Customization__Group__2__Impl"
    // InternalResume.g:3670:1: rule__Customization__Group__2__Impl : ( ( rule__Customization__LanguageAssignment_2 ) ) ;
    public final void rule__Customization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3674:1: ( ( ( rule__Customization__LanguageAssignment_2 ) ) )
            // InternalResume.g:3675:1: ( ( rule__Customization__LanguageAssignment_2 ) )
            {
            // InternalResume.g:3675:1: ( ( rule__Customization__LanguageAssignment_2 ) )
            // InternalResume.g:3676:2: ( rule__Customization__LanguageAssignment_2 )
            {
             before(grammarAccess.getCustomizationAccess().getLanguageAssignment_2()); 
            // InternalResume.g:3677:2: ( rule__Customization__LanguageAssignment_2 )
            // InternalResume.g:3677:3: rule__Customization__LanguageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Customization__LanguageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomizationAccess().getLanguageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__2__Impl"


    // $ANTLR start "rule__Customization__Group__3"
    // InternalResume.g:3685:1: rule__Customization__Group__3 : rule__Customization__Group__3__Impl rule__Customization__Group__4 ;
    public final void rule__Customization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3689:1: ( rule__Customization__Group__3__Impl rule__Customization__Group__4 )
            // InternalResume.g:3690:2: rule__Customization__Group__3__Impl rule__Customization__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Customization__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customization__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__3"


    // $ANTLR start "rule__Customization__Group__3__Impl"
    // InternalResume.g:3697:1: rule__Customization__Group__3__Impl : ( 'targetJobOffer:' ) ;
    public final void rule__Customization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3701:1: ( ( 'targetJobOffer:' ) )
            // InternalResume.g:3702:1: ( 'targetJobOffer:' )
            {
            // InternalResume.g:3702:1: ( 'targetJobOffer:' )
            // InternalResume.g:3703:2: 'targetJobOffer:'
            {
             before(grammarAccess.getCustomizationAccess().getTargetJobOfferKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getTargetJobOfferKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__3__Impl"


    // $ANTLR start "rule__Customization__Group__4"
    // InternalResume.g:3712:1: rule__Customization__Group__4 : rule__Customization__Group__4__Impl ;
    public final void rule__Customization__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3716:1: ( rule__Customization__Group__4__Impl )
            // InternalResume.g:3717:2: rule__Customization__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customization__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__4"


    // $ANTLR start "rule__Customization__Group__4__Impl"
    // InternalResume.g:3723:1: rule__Customization__Group__4__Impl : ( ( rule__Customization__JobOfferPathAssignment_4 ) ) ;
    public final void rule__Customization__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3727:1: ( ( ( rule__Customization__JobOfferPathAssignment_4 ) ) )
            // InternalResume.g:3728:1: ( ( rule__Customization__JobOfferPathAssignment_4 ) )
            {
            // InternalResume.g:3728:1: ( ( rule__Customization__JobOfferPathAssignment_4 ) )
            // InternalResume.g:3729:2: ( rule__Customization__JobOfferPathAssignment_4 )
            {
             before(grammarAccess.getCustomizationAccess().getJobOfferPathAssignment_4()); 
            // InternalResume.g:3730:2: ( rule__Customization__JobOfferPathAssignment_4 )
            // InternalResume.g:3730:3: rule__Customization__JobOfferPathAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Customization__JobOfferPathAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCustomizationAccess().getJobOfferPathAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__Group__4__Impl"


    // $ANTLR start "rule__StringList__Group__0"
    // InternalResume.g:3739:1: rule__StringList__Group__0 : rule__StringList__Group__0__Impl rule__StringList__Group__1 ;
    public final void rule__StringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3743:1: ( rule__StringList__Group__0__Impl rule__StringList__Group__1 )
            // InternalResume.g:3744:2: rule__StringList__Group__0__Impl rule__StringList__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__StringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__0"


    // $ANTLR start "rule__StringList__Group__0__Impl"
    // InternalResume.g:3751:1: rule__StringList__Group__0__Impl : ( '[' ) ;
    public final void rule__StringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3755:1: ( ( '[' ) )
            // InternalResume.g:3756:1: ( '[' )
            {
            // InternalResume.g:3756:1: ( '[' )
            // InternalResume.g:3757:2: '['
            {
             before(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__0__Impl"


    // $ANTLR start "rule__StringList__Group__1"
    // InternalResume.g:3766:1: rule__StringList__Group__1 : rule__StringList__Group__1__Impl rule__StringList__Group__2 ;
    public final void rule__StringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3770:1: ( rule__StringList__Group__1__Impl rule__StringList__Group__2 )
            // InternalResume.g:3771:2: rule__StringList__Group__1__Impl rule__StringList__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__StringList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__1"


    // $ANTLR start "rule__StringList__Group__1__Impl"
    // InternalResume.g:3778:1: rule__StringList__Group__1__Impl : ( ( rule__StringList__ValuesAssignment_1 ) ) ;
    public final void rule__StringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3782:1: ( ( ( rule__StringList__ValuesAssignment_1 ) ) )
            // InternalResume.g:3783:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            {
            // InternalResume.g:3783:1: ( ( rule__StringList__ValuesAssignment_1 ) )
            // InternalResume.g:3784:2: ( rule__StringList__ValuesAssignment_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_1()); 
            // InternalResume.g:3785:2: ( rule__StringList__ValuesAssignment_1 )
            // InternalResume.g:3785:3: rule__StringList__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringList__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__1__Impl"


    // $ANTLR start "rule__StringList__Group__2"
    // InternalResume.g:3793:1: rule__StringList__Group__2 : rule__StringList__Group__2__Impl rule__StringList__Group__3 ;
    public final void rule__StringList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3797:1: ( rule__StringList__Group__2__Impl rule__StringList__Group__3 )
            // InternalResume.g:3798:2: rule__StringList__Group__2__Impl rule__StringList__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__StringList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__2"


    // $ANTLR start "rule__StringList__Group__2__Impl"
    // InternalResume.g:3805:1: rule__StringList__Group__2__Impl : ( ( rule__StringList__Group_2__0 )* ) ;
    public final void rule__StringList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3809:1: ( ( ( rule__StringList__Group_2__0 )* ) )
            // InternalResume.g:3810:1: ( ( rule__StringList__Group_2__0 )* )
            {
            // InternalResume.g:3810:1: ( ( rule__StringList__Group_2__0 )* )
            // InternalResume.g:3811:2: ( rule__StringList__Group_2__0 )*
            {
             before(grammarAccess.getStringListAccess().getGroup_2()); 
            // InternalResume.g:3812:2: ( rule__StringList__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalResume.g:3812:3: rule__StringList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__StringList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getStringListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__2__Impl"


    // $ANTLR start "rule__StringList__Group__3"
    // InternalResume.g:3820:1: rule__StringList__Group__3 : rule__StringList__Group__3__Impl ;
    public final void rule__StringList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3824:1: ( rule__StringList__Group__3__Impl )
            // InternalResume.g:3825:2: rule__StringList__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__3"


    // $ANTLR start "rule__StringList__Group__3__Impl"
    // InternalResume.g:3831:1: rule__StringList__Group__3__Impl : ( ']' ) ;
    public final void rule__StringList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3835:1: ( ( ']' ) )
            // InternalResume.g:3836:1: ( ']' )
            {
            // InternalResume.g:3836:1: ( ']' )
            // InternalResume.g:3837:2: ']'
            {
             before(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group__3__Impl"


    // $ANTLR start "rule__StringList__Group_2__0"
    // InternalResume.g:3847:1: rule__StringList__Group_2__0 : rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 ;
    public final void rule__StringList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3851:1: ( rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1 )
            // InternalResume.g:3852:2: rule__StringList__Group_2__0__Impl rule__StringList__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__StringList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__0"


    // $ANTLR start "rule__StringList__Group_2__0__Impl"
    // InternalResume.g:3859:1: rule__StringList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StringList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3863:1: ( ( ',' ) )
            // InternalResume.g:3864:1: ( ',' )
            {
            // InternalResume.g:3864:1: ( ',' )
            // InternalResume.g:3865:2: ','
            {
             before(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__0__Impl"


    // $ANTLR start "rule__StringList__Group_2__1"
    // InternalResume.g:3874:1: rule__StringList__Group_2__1 : rule__StringList__Group_2__1__Impl ;
    public final void rule__StringList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3878:1: ( rule__StringList__Group_2__1__Impl )
            // InternalResume.g:3879:2: rule__StringList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__1"


    // $ANTLR start "rule__StringList__Group_2__1__Impl"
    // InternalResume.g:3885:1: rule__StringList__Group_2__1__Impl : ( ( rule__StringList__ValuesAssignment_2_1 ) ) ;
    public final void rule__StringList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3889:1: ( ( ( rule__StringList__ValuesAssignment_2_1 ) ) )
            // InternalResume.g:3890:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            {
            // InternalResume.g:3890:1: ( ( rule__StringList__ValuesAssignment_2_1 ) )
            // InternalResume.g:3891:2: ( rule__StringList__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 
            // InternalResume.g:3892:2: ( rule__StringList__ValuesAssignment_2_1 )
            // InternalResume.g:3892:3: rule__StringList__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StringList__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStringListAccess().getValuesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__Group_2__1__Impl"


    // $ANTLR start "rule__Profile__MetadataAssignment_0"
    // InternalResume.g:3901:1: rule__Profile__MetadataAssignment_0 : ( ruleMetadata ) ;
    public final void rule__Profile__MetadataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3905:1: ( ( ruleMetadata ) )
            // InternalResume.g:3906:2: ( ruleMetadata )
            {
            // InternalResume.g:3906:2: ( ruleMetadata )
            // InternalResume.g:3907:3: ruleMetadata
            {
             before(grammarAccess.getProfileAccess().getMetadataMetadataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getMetadataMetadataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__MetadataAssignment_0"


    // $ANTLR start "rule__Profile__UserdataAssignment_1"
    // InternalResume.g:3916:1: rule__Profile__UserdataAssignment_1 : ( ruleUserdata ) ;
    public final void rule__Profile__UserdataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3920:1: ( ( ruleUserdata ) )
            // InternalResume.g:3921:2: ( ruleUserdata )
            {
            // InternalResume.g:3921:2: ( ruleUserdata )
            // InternalResume.g:3922:3: ruleUserdata
            {
             before(grammarAccess.getProfileAccess().getUserdataUserdataParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUserdata();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getUserdataUserdataParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__UserdataAssignment_1"


    // $ANTLR start "rule__Profile__SectionsAssignment_2"
    // InternalResume.g:3931:1: rule__Profile__SectionsAssignment_2 : ( ruleSection ) ;
    public final void rule__Profile__SectionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3935:1: ( ( ruleSection ) )
            // InternalResume.g:3936:2: ( ruleSection )
            {
            // InternalResume.g:3936:2: ( ruleSection )
            // InternalResume.g:3937:3: ruleSection
            {
             before(grammarAccess.getProfileAccess().getSectionsSectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getSectionsSectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__SectionsAssignment_2"


    // $ANTLR start "rule__Profile__CustomizationAssignment_3"
    // InternalResume.g:3946:1: rule__Profile__CustomizationAssignment_3 : ( ruleCustomization ) ;
    public final void rule__Profile__CustomizationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3950:1: ( ( ruleCustomization ) )
            // InternalResume.g:3951:2: ( ruleCustomization )
            {
            // InternalResume.g:3951:2: ( ruleCustomization )
            // InternalResume.g:3952:3: ruleCustomization
            {
             before(grammarAccess.getProfileAccess().getCustomizationCustomizationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomization();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getCustomizationCustomizationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__CustomizationAssignment_3"


    // $ANTLR start "rule__Metadata__StyleAssignment_2"
    // InternalResume.g:3961:1: rule__Metadata__StyleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Metadata__StyleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3965:1: ( ( RULE_STRING ) )
            // InternalResume.g:3966:2: ( RULE_STRING )
            {
            // InternalResume.g:3966:2: ( RULE_STRING )
            // InternalResume.g:3967:3: RULE_STRING
            {
             before(grammarAccess.getMetadataAccess().getStyleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getStyleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__StyleAssignment_2"


    // $ANTLR start "rule__Metadata__FontAssignment_4"
    // InternalResume.g:3976:1: rule__Metadata__FontAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Metadata__FontAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3980:1: ( ( RULE_STRING ) )
            // InternalResume.g:3981:2: ( RULE_STRING )
            {
            // InternalResume.g:3981:2: ( RULE_STRING )
            // InternalResume.g:3982:3: RULE_STRING
            {
             before(grammarAccess.getMetadataAccess().getFontSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getFontSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__FontAssignment_4"


    // $ANTLR start "rule__Metadata__ImgPathAssignment_6"
    // InternalResume.g:3991:1: rule__Metadata__ImgPathAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Metadata__ImgPathAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:3995:1: ( ( RULE_STRING ) )
            // InternalResume.g:3996:2: ( RULE_STRING )
            {
            // InternalResume.g:3996:2: ( RULE_STRING )
            // InternalResume.g:3997:3: RULE_STRING
            {
             before(grammarAccess.getMetadataAccess().getImgPathSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetadataAccess().getImgPathSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__ImgPathAssignment_6"


    // $ANTLR start "rule__Userdata__NameAssignment_2"
    // InternalResume.g:4006:1: rule__Userdata__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Userdata__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4010:1: ( ( RULE_STRING ) )
            // InternalResume.g:4011:2: ( RULE_STRING )
            {
            // InternalResume.g:4011:2: ( RULE_STRING )
            // InternalResume.g:4012:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__NameAssignment_2"


    // $ANTLR start "rule__Userdata__EmailAssignment_4"
    // InternalResume.g:4021:1: rule__Userdata__EmailAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Userdata__EmailAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4025:1: ( ( RULE_STRING ) )
            // InternalResume.g:4026:2: ( RULE_STRING )
            {
            // InternalResume.g:4026:2: ( RULE_STRING )
            // InternalResume.g:4027:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getEmailSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getEmailSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__EmailAssignment_4"


    // $ANTLR start "rule__Userdata__TelephoneNumberAssignment_6"
    // InternalResume.g:4036:1: rule__Userdata__TelephoneNumberAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Userdata__TelephoneNumberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4040:1: ( ( RULE_STRING ) )
            // InternalResume.g:4041:2: ( RULE_STRING )
            {
            // InternalResume.g:4041:2: ( RULE_STRING )
            // InternalResume.g:4042:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getTelephoneNumberSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getTelephoneNumberSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__TelephoneNumberAssignment_6"


    // $ANTLR start "rule__Userdata__DirectionAssignment_8"
    // InternalResume.g:4051:1: rule__Userdata__DirectionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Userdata__DirectionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4055:1: ( ( RULE_STRING ) )
            // InternalResume.g:4056:2: ( RULE_STRING )
            {
            // InternalResume.g:4056:2: ( RULE_STRING )
            // InternalResume.g:4057:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getDirectionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getDirectionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__DirectionAssignment_8"


    // $ANTLR start "rule__Userdata__CityAssignment_10"
    // InternalResume.g:4066:1: rule__Userdata__CityAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Userdata__CityAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4070:1: ( ( RULE_STRING ) )
            // InternalResume.g:4071:2: ( RULE_STRING )
            {
            // InternalResume.g:4071:2: ( RULE_STRING )
            // InternalResume.g:4072:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getCitySTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getCitySTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__CityAssignment_10"


    // $ANTLR start "rule__Userdata__CountryAssignment_12"
    // InternalResume.g:4081:1: rule__Userdata__CountryAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Userdata__CountryAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4085:1: ( ( RULE_STRING ) )
            // InternalResume.g:4086:2: ( RULE_STRING )
            {
            // InternalResume.g:4086:2: ( RULE_STRING )
            // InternalResume.g:4087:3: RULE_STRING
            {
             before(grammarAccess.getUserdataAccess().getCountrySTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserdataAccess().getCountrySTRINGTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Userdata__CountryAssignment_12"


    // $ANTLR start "rule__Experience__LanguageAssignment_2"
    // InternalResume.g:4096:1: rule__Experience__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Experience__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4100:1: ( ( RULE_STRING ) )
            // InternalResume.g:4101:2: ( RULE_STRING )
            {
            // InternalResume.g:4101:2: ( RULE_STRING )
            // InternalResume.g:4102:3: RULE_STRING
            {
             before(grammarAccess.getExperienceAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__LanguageAssignment_2"


    // $ANTLR start "rule__Experience__JobsAssignment_3"
    // InternalResume.g:4111:1: rule__Experience__JobsAssignment_3 : ( ruleJob ) ;
    public final void rule__Experience__JobsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4115:1: ( ( ruleJob ) )
            // InternalResume.g:4116:2: ( ruleJob )
            {
            // InternalResume.g:4116:2: ( ruleJob )
            // InternalResume.g:4117:3: ruleJob
            {
             before(grammarAccess.getExperienceAccess().getJobsJobParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJob();

            state._fsp--;

             after(grammarAccess.getExperienceAccess().getJobsJobParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__JobsAssignment_3"


    // $ANTLR start "rule__Job__TitleAssignment_1"
    // InternalResume.g:4126:1: rule__Job__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Job__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4130:1: ( ( RULE_STRING ) )
            // InternalResume.g:4131:2: ( RULE_STRING )
            {
            // InternalResume.g:4131:2: ( RULE_STRING )
            // InternalResume.g:4132:3: RULE_STRING
            {
             before(grammarAccess.getJobAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__TitleAssignment_1"


    // $ANTLR start "rule__Job__DescriptionAssignment_3"
    // InternalResume.g:4141:1: rule__Job__DescriptionAssignment_3 : ( ruleStringList ) ;
    public final void rule__Job__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4145:1: ( ( ruleStringList ) )
            // InternalResume.g:4146:2: ( ruleStringList )
            {
            // InternalResume.g:4146:2: ( ruleStringList )
            // InternalResume.g:4147:3: ruleStringList
            {
             before(grammarAccess.getJobAccess().getDescriptionStringListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getJobAccess().getDescriptionStringListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__DescriptionAssignment_3"


    // $ANTLR start "rule__Job__CompanyAssignment_5"
    // InternalResume.g:4156:1: rule__Job__CompanyAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Job__CompanyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4160:1: ( ( RULE_STRING ) )
            // InternalResume.g:4161:2: ( RULE_STRING )
            {
            // InternalResume.g:4161:2: ( RULE_STRING )
            // InternalResume.g:4162:3: RULE_STRING
            {
             before(grammarAccess.getJobAccess().getCompanySTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJobAccess().getCompanySTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__CompanyAssignment_5"


    // $ANTLR start "rule__Job__StartDateAssignment_7"
    // InternalResume.g:4171:1: rule__Job__StartDateAssignment_7 : ( ruleDate ) ;
    public final void rule__Job__StartDateAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4175:1: ( ( ruleDate ) )
            // InternalResume.g:4176:2: ( ruleDate )
            {
            // InternalResume.g:4176:2: ( ruleDate )
            // InternalResume.g:4177:3: ruleDate
            {
             before(grammarAccess.getJobAccess().getStartDateDateParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getJobAccess().getStartDateDateParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__StartDateAssignment_7"


    // $ANTLR start "rule__Job__EndDateAssignment_9"
    // InternalResume.g:4186:1: rule__Job__EndDateAssignment_9 : ( ruleDate ) ;
    public final void rule__Job__EndDateAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4190:1: ( ( ruleDate ) )
            // InternalResume.g:4191:2: ( ruleDate )
            {
            // InternalResume.g:4191:2: ( ruleDate )
            // InternalResume.g:4192:3: ruleDate
            {
             before(grammarAccess.getJobAccess().getEndDateDateParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getJobAccess().getEndDateDateParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__EndDateAssignment_9"


    // $ANTLR start "rule__Job__TagsAssignment_11"
    // InternalResume.g:4201:1: rule__Job__TagsAssignment_11 : ( ruleStringList ) ;
    public final void rule__Job__TagsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4205:1: ( ( ruleStringList ) )
            // InternalResume.g:4206:2: ( ruleStringList )
            {
            // InternalResume.g:4206:2: ( ruleStringList )
            // InternalResume.g:4207:3: ruleStringList
            {
             before(grammarAccess.getJobAccess().getTagsStringListParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getJobAccess().getTagsStringListParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Job__TagsAssignment_11"


    // $ANTLR start "rule__Projects__LanguageAssignment_2"
    // InternalResume.g:4216:1: rule__Projects__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Projects__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4220:1: ( ( RULE_STRING ) )
            // InternalResume.g:4221:2: ( RULE_STRING )
            {
            // InternalResume.g:4221:2: ( RULE_STRING )
            // InternalResume.g:4222:3: RULE_STRING
            {
             before(grammarAccess.getProjectsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__LanguageAssignment_2"


    // $ANTLR start "rule__Projects__ProjectsAssignment_3"
    // InternalResume.g:4231:1: rule__Projects__ProjectsAssignment_3 : ( ruleProject ) ;
    public final void rule__Projects__ProjectsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4235:1: ( ( ruleProject ) )
            // InternalResume.g:4236:2: ( ruleProject )
            {
            // InternalResume.g:4236:2: ( ruleProject )
            // InternalResume.g:4237:3: ruleProject
            {
             before(grammarAccess.getProjectsAccess().getProjectsProjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectsAccess().getProjectsProjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projects__ProjectsAssignment_3"


    // $ANTLR start "rule__Project__TitleAssignment_1"
    // InternalResume.g:4246:1: rule__Project__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Project__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4250:1: ( ( RULE_STRING ) )
            // InternalResume.g:4251:2: ( RULE_STRING )
            {
            // InternalResume.g:4251:2: ( RULE_STRING )
            // InternalResume.g:4252:3: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TitleAssignment_1"


    // $ANTLR start "rule__Project__DescriptionAssignment_3"
    // InternalResume.g:4261:1: rule__Project__DescriptionAssignment_3 : ( ruleStringList ) ;
    public final void rule__Project__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4265:1: ( ( ruleStringList ) )
            // InternalResume.g:4266:2: ( ruleStringList )
            {
            // InternalResume.g:4266:2: ( ruleStringList )
            // InternalResume.g:4267:3: ruleStringList
            {
             before(grammarAccess.getProjectAccess().getDescriptionStringListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getDescriptionStringListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__DescriptionAssignment_3"


    // $ANTLR start "rule__Project__TechnologiesAssignment_5"
    // InternalResume.g:4276:1: rule__Project__TechnologiesAssignment_5 : ( ruleStringList ) ;
    public final void rule__Project__TechnologiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4280:1: ( ( ruleStringList ) )
            // InternalResume.g:4281:2: ( ruleStringList )
            {
            // InternalResume.g:4281:2: ( ruleStringList )
            // InternalResume.g:4282:3: ruleStringList
            {
             before(grammarAccess.getProjectAccess().getTechnologiesStringListParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTechnologiesStringListParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TechnologiesAssignment_5"


    // $ANTLR start "rule__Project__LinkAssignment_7"
    // InternalResume.g:4291:1: rule__Project__LinkAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Project__LinkAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4295:1: ( ( RULE_STRING ) )
            // InternalResume.g:4296:2: ( RULE_STRING )
            {
            // InternalResume.g:4296:2: ( RULE_STRING )
            // InternalResume.g:4297:3: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getLinkSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLinkSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__LinkAssignment_7"


    // $ANTLR start "rule__Project__TagsAssignment_9"
    // InternalResume.g:4306:1: rule__Project__TagsAssignment_9 : ( ruleStringList ) ;
    public final void rule__Project__TagsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4310:1: ( ( ruleStringList ) )
            // InternalResume.g:4311:2: ( ruleStringList )
            {
            // InternalResume.g:4311:2: ( ruleStringList )
            // InternalResume.g:4312:3: ruleStringList
            {
             before(grammarAccess.getProjectAccess().getTagsStringListParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTagsStringListParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TagsAssignment_9"


    // $ANTLR start "rule__Project__FromAssignment_10_1"
    // InternalResume.g:4321:1: rule__Project__FromAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Project__FromAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4325:1: ( ( ( RULE_ID ) ) )
            // InternalResume.g:4326:2: ( ( RULE_ID ) )
            {
            // InternalResume.g:4326:2: ( ( RULE_ID ) )
            // InternalResume.g:4327:3: ( RULE_ID )
            {
             before(grammarAccess.getProjectAccess().getFromSkillCrossReference_10_1_0()); 
            // InternalResume.g:4328:3: ( RULE_ID )
            // InternalResume.g:4329:4: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getFromSkillIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getFromSkillIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getProjectAccess().getFromSkillCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__FromAssignment_10_1"


    // $ANTLR start "rule__Project__FromAssignment_10_2_1"
    // InternalResume.g:4340:1: rule__Project__FromAssignment_10_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Project__FromAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4344:1: ( ( ( RULE_ID ) ) )
            // InternalResume.g:4345:2: ( ( RULE_ID ) )
            {
            // InternalResume.g:4345:2: ( ( RULE_ID ) )
            // InternalResume.g:4346:3: ( RULE_ID )
            {
             before(grammarAccess.getProjectAccess().getFromSkillCrossReference_10_2_1_0()); 
            // InternalResume.g:4347:3: ( RULE_ID )
            // InternalResume.g:4348:4: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getFromSkillIDTerminalRuleCall_10_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getFromSkillIDTerminalRuleCall_10_2_1_0_1()); 

            }

             after(grammarAccess.getProjectAccess().getFromSkillCrossReference_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__FromAssignment_10_2_1"


    // $ANTLR start "rule__Education__LanguageAssignment_2"
    // InternalResume.g:4359:1: rule__Education__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Education__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4363:1: ( ( RULE_STRING ) )
            // InternalResume.g:4364:2: ( RULE_STRING )
            {
            // InternalResume.g:4364:2: ( RULE_STRING )
            // InternalResume.g:4365:3: RULE_STRING
            {
             before(grammarAccess.getEducationAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEducationAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__LanguageAssignment_2"


    // $ANTLR start "rule__Education__DegreesAssignment_3"
    // InternalResume.g:4374:1: rule__Education__DegreesAssignment_3 : ( ruleDegree ) ;
    public final void rule__Education__DegreesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4378:1: ( ( ruleDegree ) )
            // InternalResume.g:4379:2: ( ruleDegree )
            {
            // InternalResume.g:4379:2: ( ruleDegree )
            // InternalResume.g:4380:3: ruleDegree
            {
             before(grammarAccess.getEducationAccess().getDegreesDegreeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDegree();

            state._fsp--;

             after(grammarAccess.getEducationAccess().getDegreesDegreeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Education__DegreesAssignment_3"


    // $ANTLR start "rule__Degree__TitleAssignment_1"
    // InternalResume.g:4389:1: rule__Degree__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Degree__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4393:1: ( ( RULE_STRING ) )
            // InternalResume.g:4394:2: ( RULE_STRING )
            {
            // InternalResume.g:4394:2: ( RULE_STRING )
            // InternalResume.g:4395:3: RULE_STRING
            {
             before(grammarAccess.getDegreeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__TitleAssignment_1"


    // $ANTLR start "rule__Degree__InstitutionAssignment_3"
    // InternalResume.g:4404:1: rule__Degree__InstitutionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Degree__InstitutionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4408:1: ( ( RULE_STRING ) )
            // InternalResume.g:4409:2: ( RULE_STRING )
            {
            // InternalResume.g:4409:2: ( RULE_STRING )
            // InternalResume.g:4410:3: RULE_STRING
            {
             before(grammarAccess.getDegreeAccess().getInstitutionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getInstitutionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__InstitutionAssignment_3"


    // $ANTLR start "rule__Degree__GraduationDateAssignment_5"
    // InternalResume.g:4419:1: rule__Degree__GraduationDateAssignment_5 : ( ruleDate ) ;
    public final void rule__Degree__GraduationDateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4423:1: ( ( ruleDate ) )
            // InternalResume.g:4424:2: ( ruleDate )
            {
            // InternalResume.g:4424:2: ( ruleDate )
            // InternalResume.g:4425:3: ruleDate
            {
             before(grammarAccess.getDegreeAccess().getGraduationDateDateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDegreeAccess().getGraduationDateDateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__GraduationDateAssignment_5"


    // $ANTLR start "rule__Degree__CountryAssignment_7"
    // InternalResume.g:4434:1: rule__Degree__CountryAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Degree__CountryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4438:1: ( ( RULE_STRING ) )
            // InternalResume.g:4439:2: ( RULE_STRING )
            {
            // InternalResume.g:4439:2: ( RULE_STRING )
            // InternalResume.g:4440:3: RULE_STRING
            {
             before(grammarAccess.getDegreeAccess().getCountrySTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDegreeAccess().getCountrySTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__CountryAssignment_7"


    // $ANTLR start "rule__Degree__TagsAssignment_9"
    // InternalResume.g:4449:1: rule__Degree__TagsAssignment_9 : ( ruleStringList ) ;
    public final void rule__Degree__TagsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4453:1: ( ( ruleStringList ) )
            // InternalResume.g:4454:2: ( ruleStringList )
            {
            // InternalResume.g:4454:2: ( ruleStringList )
            // InternalResume.g:4455:3: ruleStringList
            {
             before(grammarAccess.getDegreeAccess().getTagsStringListParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getDegreeAccess().getTagsStringListParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Degree__TagsAssignment_9"


    // $ANTLR start "rule__Skills__LanguageAssignment_2"
    // InternalResume.g:4464:1: rule__Skills__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Skills__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4468:1: ( ( RULE_STRING ) )
            // InternalResume.g:4469:2: ( RULE_STRING )
            {
            // InternalResume.g:4469:2: ( RULE_STRING )
            // InternalResume.g:4470:3: RULE_STRING
            {
             before(grammarAccess.getSkillsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSkillsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__LanguageAssignment_2"


    // $ANTLR start "rule__Skills__SkillsAssignment_3"
    // InternalResume.g:4479:1: rule__Skills__SkillsAssignment_3 : ( ruleSkill ) ;
    public final void rule__Skills__SkillsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4483:1: ( ( ruleSkill ) )
            // InternalResume.g:4484:2: ( ruleSkill )
            {
            // InternalResume.g:4484:2: ( ruleSkill )
            // InternalResume.g:4485:3: ruleSkill
            {
             before(grammarAccess.getSkillsAccess().getSkillsSkillParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSkill();

            state._fsp--;

             after(grammarAccess.getSkillsAccess().getSkillsSkillParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skills__SkillsAssignment_3"


    // $ANTLR start "rule__Skill__NameAssignment_0"
    // InternalResume.g:4494:1: rule__Skill__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Skill__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4498:1: ( ( RULE_ID ) )
            // InternalResume.g:4499:2: ( RULE_ID )
            {
            // InternalResume.g:4499:2: ( RULE_ID )
            // InternalResume.g:4500:3: RULE_ID
            {
             before(grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__NameAssignment_0"


    // $ANTLR start "rule__Skill__TitleAssignment_2"
    // InternalResume.g:4509:1: rule__Skill__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Skill__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4513:1: ( ( RULE_STRING ) )
            // InternalResume.g:4514:2: ( RULE_STRING )
            {
            // InternalResume.g:4514:2: ( RULE_STRING )
            // InternalResume.g:4515:3: RULE_STRING
            {
             before(grammarAccess.getSkillAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSkillAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__TitleAssignment_2"


    // $ANTLR start "rule__Skill__TagsAssignment_4"
    // InternalResume.g:4524:1: rule__Skill__TagsAssignment_4 : ( ruleStringList ) ;
    public final void rule__Skill__TagsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4528:1: ( ( ruleStringList ) )
            // InternalResume.g:4529:2: ( ruleStringList )
            {
            // InternalResume.g:4529:2: ( ruleStringList )
            // InternalResume.g:4530:3: ruleStringList
            {
             before(grammarAccess.getSkillAccess().getTagsStringListParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getSkillAccess().getTagsStringListParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skill__TagsAssignment_4"


    // $ANTLR start "rule__Interests__LanguageAssignment_2"
    // InternalResume.g:4539:1: rule__Interests__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Interests__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4543:1: ( ( RULE_STRING ) )
            // InternalResume.g:4544:2: ( RULE_STRING )
            {
            // InternalResume.g:4544:2: ( RULE_STRING )
            // InternalResume.g:4545:3: RULE_STRING
            {
             before(grammarAccess.getInterestsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInterestsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__LanguageAssignment_2"


    // $ANTLR start "rule__Interests__TagsAssignment_4"
    // InternalResume.g:4554:1: rule__Interests__TagsAssignment_4 : ( ruleStringList ) ;
    public final void rule__Interests__TagsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4558:1: ( ( ruleStringList ) )
            // InternalResume.g:4559:2: ( ruleStringList )
            {
            // InternalResume.g:4559:2: ( ruleStringList )
            // InternalResume.g:4560:3: ruleStringList
            {
             before(grammarAccess.getInterestsAccess().getTagsStringListParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getInterestsAccess().getTagsStringListParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interests__TagsAssignment_4"


    // $ANTLR start "rule__Languages__LanguageAssignment_2"
    // InternalResume.g:4569:1: rule__Languages__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Languages__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4573:1: ( ( RULE_STRING ) )
            // InternalResume.g:4574:2: ( RULE_STRING )
            {
            // InternalResume.g:4574:2: ( RULE_STRING )
            // InternalResume.g:4575:3: RULE_STRING
            {
             before(grammarAccess.getLanguagesAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLanguagesAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__LanguageAssignment_2"


    // $ANTLR start "rule__Languages__TagsAssignment_4"
    // InternalResume.g:4584:1: rule__Languages__TagsAssignment_4 : ( ruleStringList ) ;
    public final void rule__Languages__TagsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4588:1: ( ( ruleStringList ) )
            // InternalResume.g:4589:2: ( ruleStringList )
            {
            // InternalResume.g:4589:2: ( ruleStringList )
            // InternalResume.g:4590:3: ruleStringList
            {
             before(grammarAccess.getLanguagesAccess().getTagsStringListParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStringList();

            state._fsp--;

             after(grammarAccess.getLanguagesAccess().getTagsStringListParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languages__TagsAssignment_4"


    // $ANTLR start "rule__Metrics__LanguageAssignment_2"
    // InternalResume.g:4599:1: rule__Metrics__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Metrics__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4603:1: ( ( RULE_STRING ) )
            // InternalResume.g:4604:2: ( RULE_STRING )
            {
            // InternalResume.g:4604:2: ( RULE_STRING )
            // InternalResume.g:4605:3: RULE_STRING
            {
             before(grammarAccess.getMetricsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetricsAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__LanguageAssignment_2"


    // $ANTLR start "rule__Metrics__MetricsAssignment_3"
    // InternalResume.g:4614:1: rule__Metrics__MetricsAssignment_3 : ( ruleMetric ) ;
    public final void rule__Metrics__MetricsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4618:1: ( ( ruleMetric ) )
            // InternalResume.g:4619:2: ( ruleMetric )
            {
            // InternalResume.g:4619:2: ( ruleMetric )
            // InternalResume.g:4620:3: ruleMetric
            {
             before(grammarAccess.getMetricsAccess().getMetricsMetricParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMetric();

            state._fsp--;

             after(grammarAccess.getMetricsAccess().getMetricsMetricParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metrics__MetricsAssignment_3"


    // $ANTLR start "rule__Metric__NameAssignment_1"
    // InternalResume.g:4629:1: rule__Metric__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Metric__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4633:1: ( ( RULE_STRING ) )
            // InternalResume.g:4634:2: ( RULE_STRING )
            {
            // InternalResume.g:4634:2: ( RULE_STRING )
            // InternalResume.g:4635:3: RULE_STRING
            {
             before(grammarAccess.getMetricAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMetricAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__NameAssignment_1"


    // $ANTLR start "rule__Metric__ExpressionAssignment_3"
    // InternalResume.g:4644:1: rule__Metric__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Metric__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4648:1: ( ( ruleExpression ) )
            // InternalResume.g:4649:2: ( ruleExpression )
            {
            // InternalResume.g:4649:2: ( ruleExpression )
            // InternalResume.g:4650:3: ruleExpression
            {
             before(grammarAccess.getMetricAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMetricAccess().getExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__ExpressionAssignment_3"


    // $ANTLR start "rule__Subtraction__RightAssignment_1_2"
    // InternalResume.g:4659:1: rule__Subtraction__RightAssignment_1_2 : ( ruleNumberLiteral ) ;
    public final void rule__Subtraction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4663:1: ( ( ruleNumberLiteral ) )
            // InternalResume.g:4664:2: ( ruleNumberLiteral )
            {
            // InternalResume.g:4664:2: ( ruleNumberLiteral )
            // InternalResume.g:4665:3: ruleNumberLiteral
            {
             before(grammarAccess.getSubtractionAccess().getRightNumberLiteralParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getSubtractionAccess().getRightNumberLiteralParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtraction__RightAssignment_1_2"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment_1"
    // InternalResume.g:4674:1: rule__NumberLiteral__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4678:1: ( ( RULE_INT ) )
            // InternalResume.g:4679:2: ( RULE_INT )
            {
            // InternalResume.g:4679:2: ( RULE_INT )
            // InternalResume.g:4680:3: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment_1"


    // $ANTLR start "rule__Customization__LanguageAssignment_2"
    // InternalResume.g:4689:1: rule__Customization__LanguageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Customization__LanguageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4693:1: ( ( RULE_STRING ) )
            // InternalResume.g:4694:2: ( RULE_STRING )
            {
            // InternalResume.g:4694:2: ( RULE_STRING )
            // InternalResume.g:4695:3: RULE_STRING
            {
             before(grammarAccess.getCustomizationAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getLanguageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__LanguageAssignment_2"


    // $ANTLR start "rule__Customization__JobOfferPathAssignment_4"
    // InternalResume.g:4704:1: rule__Customization__JobOfferPathAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Customization__JobOfferPathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4708:1: ( ( RULE_STRING ) )
            // InternalResume.g:4709:2: ( RULE_STRING )
            {
            // InternalResume.g:4709:2: ( RULE_STRING )
            // InternalResume.g:4710:3: RULE_STRING
            {
             before(grammarAccess.getCustomizationAccess().getJobOfferPathSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomizationAccess().getJobOfferPathSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customization__JobOfferPathAssignment_4"


    // $ANTLR start "rule__StringList__ValuesAssignment_1"
    // InternalResume.g:4719:1: rule__StringList__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4723:1: ( ( RULE_STRING ) )
            // InternalResume.g:4724:2: ( RULE_STRING )
            {
            // InternalResume.g:4724:2: ( RULE_STRING )
            // InternalResume.g:4725:3: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__ValuesAssignment_1"


    // $ANTLR start "rule__StringList__ValuesAssignment_2_1"
    // InternalResume.g:4734:1: rule__StringList__ValuesAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StringList__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalResume.g:4738:1: ( ( RULE_STRING ) )
            // InternalResume.g:4739:2: ( RULE_STRING )
            {
            // InternalResume.g:4739:2: ( RULE_STRING )
            // InternalResume.g:4740:3: RULE_STRING
            {
             before(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringList__ValuesAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000003C840400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000003C840400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000400000000L});

}