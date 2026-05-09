package org.xtext.example.resume.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.resume.services.ResumeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalResumeParser extends AbstractInternalAntlrParser {
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

        public InternalResumeParser(TokenStream input, ResumeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Profile";
       	}

       	@Override
       	protected ResumeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProfile"
    // InternalResume.g:64:1: entryRuleProfile returns [EObject current=null] : iv_ruleProfile= ruleProfile EOF ;
    public final EObject entryRuleProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfile = null;


        try {
            // InternalResume.g:64:48: (iv_ruleProfile= ruleProfile EOF )
            // InternalResume.g:65:2: iv_ruleProfile= ruleProfile EOF
            {
             newCompositeNode(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfile=ruleProfile();

            state._fsp--;

             current =iv_ruleProfile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalResume.g:71:1: ruleProfile returns [EObject current=null] : ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) ) ;
    public final EObject ruleProfile() throws RecognitionException {
        EObject current = null;

        EObject lv_metadata_0_0 = null;

        EObject lv_userdata_1_0 = null;

        EObject lv_sections_2_0 = null;

        EObject lv_customization_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:77:2: ( ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) ) )
            // InternalResume.g:78:2: ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) )
            {
            // InternalResume.g:78:2: ( ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) ) )
            // InternalResume.g:79:3: ( (lv_metadata_0_0= ruleMetadata ) ) ( (lv_userdata_1_0= ruleUserdata ) ) ( (lv_sections_2_0= ruleSection ) )+ ( (lv_customization_3_0= ruleCustomization ) )
            {
            // InternalResume.g:79:3: ( (lv_metadata_0_0= ruleMetadata ) )
            // InternalResume.g:80:4: (lv_metadata_0_0= ruleMetadata )
            {
            // InternalResume.g:80:4: (lv_metadata_0_0= ruleMetadata )
            // InternalResume.g:81:5: lv_metadata_0_0= ruleMetadata
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getMetadataMetadataParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_metadata_0_0=ruleMetadata();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"metadata",
            						lv_metadata_0_0,
            						"org.xtext.example.resume.Resume.Metadata");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalResume.g:98:3: ( (lv_userdata_1_0= ruleUserdata ) )
            // InternalResume.g:99:4: (lv_userdata_1_0= ruleUserdata )
            {
            // InternalResume.g:99:4: (lv_userdata_1_0= ruleUserdata )
            // InternalResume.g:100:5: lv_userdata_1_0= ruleUserdata
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getUserdataUserdataParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_userdata_1_0=ruleUserdata();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"userdata",
            						lv_userdata_1_0,
            						"org.xtext.example.resume.Resume.Userdata");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalResume.g:117:3: ( (lv_sections_2_0= ruleSection ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||LA1_0==30||LA1_0==35||(LA1_0>=38 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalResume.g:118:4: (lv_sections_2_0= ruleSection )
            	    {
            	    // InternalResume.g:118:4: (lv_sections_2_0= ruleSection )
            	    // InternalResume.g:119:5: lv_sections_2_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getSectionsSectionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_sections_2_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_2_0,
            	    						"org.xtext.example.resume.Resume.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalResume.g:136:3: ( (lv_customization_3_0= ruleCustomization ) )
            // InternalResume.g:137:4: (lv_customization_3_0= ruleCustomization )
            {
            // InternalResume.g:137:4: (lv_customization_3_0= ruleCustomization )
            // InternalResume.g:138:5: lv_customization_3_0= ruleCustomization
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getCustomizationCustomizationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_customization_3_0=ruleCustomization();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"customization",
            						lv_customization_3_0,
            						"org.xtext.example.resume.Resume.Customization");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleMetadata"
    // InternalResume.g:159:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // InternalResume.g:159:49: (iv_ruleMetadata= ruleMetadata EOF )
            // InternalResume.g:160:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // InternalResume.g:166:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_style_2_0=null;
        Token otherlv_3=null;
        Token lv_font_4_0=null;
        Token otherlv_5=null;
        Token lv_imgPath_6_0=null;


        	enterRule();

        try {
            // InternalResume.g:172:2: ( (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) ) )
            // InternalResume.g:173:2: (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) )
            {
            // InternalResume.g:173:2: (otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) ) )
            // InternalResume.g:174:3: otherlv_0= 'Metadata' otherlv_1= 'style:' ( (lv_style_2_0= RULE_STRING ) ) otherlv_3= 'font:' ( (lv_font_4_0= RULE_STRING ) ) otherlv_5= 'imgPath:' ( (lv_imgPath_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getMetadataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMetadataAccess().getStyleKeyword_1());
            		
            // InternalResume.g:182:3: ( (lv_style_2_0= RULE_STRING ) )
            // InternalResume.g:183:4: (lv_style_2_0= RULE_STRING )
            {
            // InternalResume.g:183:4: (lv_style_2_0= RULE_STRING )
            // InternalResume.g:184:5: lv_style_2_0= RULE_STRING
            {
            lv_style_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_style_2_0, grammarAccess.getMetadataAccess().getStyleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"style",
            						lv_style_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getFontKeyword_3());
            		
            // InternalResume.g:204:3: ( (lv_font_4_0= RULE_STRING ) )
            // InternalResume.g:205:4: (lv_font_4_0= RULE_STRING )
            {
            // InternalResume.g:205:4: (lv_font_4_0= RULE_STRING )
            // InternalResume.g:206:5: lv_font_4_0= RULE_STRING
            {
            lv_font_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_font_4_0, grammarAccess.getMetadataAccess().getFontSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"font",
            						lv_font_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMetadataAccess().getImgPathKeyword_5());
            		
            // InternalResume.g:226:3: ( (lv_imgPath_6_0= RULE_STRING ) )
            // InternalResume.g:227:4: (lv_imgPath_6_0= RULE_STRING )
            {
            // InternalResume.g:227:4: (lv_imgPath_6_0= RULE_STRING )
            // InternalResume.g:228:5: lv_imgPath_6_0= RULE_STRING
            {
            lv_imgPath_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_imgPath_6_0, grammarAccess.getMetadataAccess().getImgPathSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetadataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"imgPath",
            						lv_imgPath_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleUserdata"
    // InternalResume.g:248:1: entryRuleUserdata returns [EObject current=null] : iv_ruleUserdata= ruleUserdata EOF ;
    public final EObject entryRuleUserdata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserdata = null;


        try {
            // InternalResume.g:248:49: (iv_ruleUserdata= ruleUserdata EOF )
            // InternalResume.g:249:2: iv_ruleUserdata= ruleUserdata EOF
            {
             newCompositeNode(grammarAccess.getUserdataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserdata=ruleUserdata();

            state._fsp--;

             current =iv_ruleUserdata; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserdata"


    // $ANTLR start "ruleUserdata"
    // InternalResume.g:255:1: ruleUserdata returns [EObject current=null] : (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) ) ;
    public final EObject ruleUserdata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_email_4_0=null;
        Token otherlv_5=null;
        Token lv_telephoneNumber_6_0=null;
        Token otherlv_7=null;
        Token lv_direction_8_0=null;
        Token otherlv_9=null;
        Token lv_city_10_0=null;
        Token otherlv_11=null;
        Token lv_country_12_0=null;


        	enterRule();

        try {
            // InternalResume.g:261:2: ( (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) ) )
            // InternalResume.g:262:2: (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) )
            {
            // InternalResume.g:262:2: (otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) ) )
            // InternalResume.g:263:3: otherlv_0= 'Userdata' otherlv_1= 'name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'email:' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'telephoneNumber:' ( (lv_telephoneNumber_6_0= RULE_STRING ) ) otherlv_7= 'direction:' ( (lv_direction_8_0= RULE_STRING ) ) otherlv_9= 'city:' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= 'country:' ( (lv_country_12_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUserdataAccess().getUserdataKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getUserdataAccess().getNameKeyword_1());
            		
            // InternalResume.g:271:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalResume.g:272:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalResume.g:272:4: (lv_name_2_0= RULE_STRING )
            // InternalResume.g:273:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUserdataAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getUserdataAccess().getEmailKeyword_3());
            		
            // InternalResume.g:293:3: ( (lv_email_4_0= RULE_STRING ) )
            // InternalResume.g:294:4: (lv_email_4_0= RULE_STRING )
            {
            // InternalResume.g:294:4: (lv_email_4_0= RULE_STRING )
            // InternalResume.g:295:5: lv_email_4_0= RULE_STRING
            {
            lv_email_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_email_4_0, grammarAccess.getUserdataAccess().getEmailSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getUserdataAccess().getTelephoneNumberKeyword_5());
            		
            // InternalResume.g:315:3: ( (lv_telephoneNumber_6_0= RULE_STRING ) )
            // InternalResume.g:316:4: (lv_telephoneNumber_6_0= RULE_STRING )
            {
            // InternalResume.g:316:4: (lv_telephoneNumber_6_0= RULE_STRING )
            // InternalResume.g:317:5: lv_telephoneNumber_6_0= RULE_STRING
            {
            lv_telephoneNumber_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_telephoneNumber_6_0, grammarAccess.getUserdataAccess().getTelephoneNumberSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"telephoneNumber",
            						lv_telephoneNumber_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getUserdataAccess().getDirectionKeyword_7());
            		
            // InternalResume.g:337:3: ( (lv_direction_8_0= RULE_STRING ) )
            // InternalResume.g:338:4: (lv_direction_8_0= RULE_STRING )
            {
            // InternalResume.g:338:4: (lv_direction_8_0= RULE_STRING )
            // InternalResume.g:339:5: lv_direction_8_0= RULE_STRING
            {
            lv_direction_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_direction_8_0, grammarAccess.getUserdataAccess().getDirectionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"direction",
            						lv_direction_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getUserdataAccess().getCityKeyword_9());
            		
            // InternalResume.g:359:3: ( (lv_city_10_0= RULE_STRING ) )
            // InternalResume.g:360:4: (lv_city_10_0= RULE_STRING )
            {
            // InternalResume.g:360:4: (lv_city_10_0= RULE_STRING )
            // InternalResume.g:361:5: lv_city_10_0= RULE_STRING
            {
            lv_city_10_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_city_10_0, grammarAccess.getUserdataAccess().getCitySTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"city",
            						lv_city_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getUserdataAccess().getCountryKeyword_11());
            		
            // InternalResume.g:381:3: ( (lv_country_12_0= RULE_STRING ) )
            // InternalResume.g:382:4: (lv_country_12_0= RULE_STRING )
            {
            // InternalResume.g:382:4: (lv_country_12_0= RULE_STRING )
            // InternalResume.g:383:5: lv_country_12_0= RULE_STRING
            {
            lv_country_12_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_country_12_0, grammarAccess.getUserdataAccess().getCountrySTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserdataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"country",
            						lv_country_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserdata"


    // $ANTLR start "entryRuleSection"
    // InternalResume.g:403:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalResume.g:403:48: (iv_ruleSection= ruleSection EOF )
            // InternalResume.g:404:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalResume.g:410:1: ruleSection returns [EObject current=null] : (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages | this_Metrics_6= ruleMetrics ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        EObject this_Experience_0 = null;

        EObject this_Projects_1 = null;

        EObject this_Education_2 = null;

        EObject this_Skills_3 = null;

        EObject this_Interests_4 = null;

        EObject this_Languages_5 = null;

        EObject this_Metrics_6 = null;



        	enterRule();

        try {
            // InternalResume.g:416:2: ( (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages | this_Metrics_6= ruleMetrics ) )
            // InternalResume.g:417:2: (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages | this_Metrics_6= ruleMetrics )
            {
            // InternalResume.g:417:2: (this_Experience_0= ruleExperience | this_Projects_1= ruleProjects | this_Education_2= ruleEducation | this_Skills_3= ruleSkills | this_Interests_4= ruleInterests | this_Languages_5= ruleLanguages | this_Metrics_6= ruleMetrics )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 38:
                {
                alt2=4;
                }
                break;
            case 39:
                {
                alt2=5;
                }
                break;
            case 40:
                {
                alt2=6;
                }
                break;
            case 41:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalResume.g:418:3: this_Experience_0= ruleExperience
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getExperienceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Experience_0=ruleExperience();

                    state._fsp--;


                    			current = this_Experience_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalResume.g:427:3: this_Projects_1= ruleProjects
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getProjectsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Projects_1=ruleProjects();

                    state._fsp--;


                    			current = this_Projects_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalResume.g:436:3: this_Education_2= ruleEducation
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getEducationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Education_2=ruleEducation();

                    state._fsp--;


                    			current = this_Education_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalResume.g:445:3: this_Skills_3= ruleSkills
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getSkillsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Skills_3=ruleSkills();

                    state._fsp--;


                    			current = this_Skills_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalResume.g:454:3: this_Interests_4= ruleInterests
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getInterestsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interests_4=ruleInterests();

                    state._fsp--;


                    			current = this_Interests_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalResume.g:463:3: this_Languages_5= ruleLanguages
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getLanguagesParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Languages_5=ruleLanguages();

                    state._fsp--;


                    			current = this_Languages_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalResume.g:472:3: this_Metrics_6= ruleMetrics
                    {

                    			newCompositeNode(grammarAccess.getSectionAccess().getMetricsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Metrics_6=ruleMetrics();

                    state._fsp--;


                    			current = this_Metrics_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleExperience"
    // InternalResume.g:484:1: entryRuleExperience returns [EObject current=null] : iv_ruleExperience= ruleExperience EOF ;
    public final EObject entryRuleExperience() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperience = null;


        try {
            // InternalResume.g:484:51: (iv_ruleExperience= ruleExperience EOF )
            // InternalResume.g:485:2: iv_ruleExperience= ruleExperience EOF
            {
             newCompositeNode(grammarAccess.getExperienceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperience=ruleExperience();

            state._fsp--;

             current =iv_ruleExperience; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExperience"


    // $ANTLR start "ruleExperience"
    // InternalResume.g:491:1: ruleExperience returns [EObject current=null] : (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ ) ;
    public final EObject ruleExperience() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_jobs_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:497:2: ( (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ ) )
            // InternalResume.g:498:2: (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ )
            {
            // InternalResume.g:498:2: (otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+ )
            // InternalResume.g:499:3: otherlv_0= 'Experience' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_jobs_3_0= ruleJob ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getExperienceAccess().getExperienceKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExperienceAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:507:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:508:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:508:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:509:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_language_2_0, grammarAccess.getExperienceAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperienceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:525:3: ( (lv_jobs_3_0= ruleJob ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalResume.g:526:4: (lv_jobs_3_0= ruleJob )
            	    {
            	    // InternalResume.g:526:4: (lv_jobs_3_0= ruleJob )
            	    // InternalResume.g:527:5: lv_jobs_3_0= ruleJob
            	    {

            	    					newCompositeNode(grammarAccess.getExperienceAccess().getJobsJobParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_jobs_3_0=ruleJob();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExperienceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jobs",
            	    						lv_jobs_3_0,
            	    						"org.xtext.example.resume.Resume.Job");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExperience"


    // $ANTLR start "entryRuleJob"
    // InternalResume.g:548:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalResume.g:548:44: (iv_ruleJob= ruleJob EOF )
            // InternalResume.g:549:2: iv_ruleJob= ruleJob EOF
            {
             newCompositeNode(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJob=ruleJob();

            state._fsp--;

             current =iv_ruleJob; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalResume.g:555:1: ruleJob returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_company_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_startDate_7_0 = null;

        AntlrDatatypeRuleToken lv_endDate_9_0 = null;

        EObject lv_tags_11_0 = null;



        	enterRule();

        try {
            // InternalResume.g:561:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) ) )
            // InternalResume.g:562:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) )
            {
            // InternalResume.g:562:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) ) )
            // InternalResume.g:563:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'company:' ( (lv_company_5_0= RULE_STRING ) ) otherlv_6= 'startDate:' ( (lv_startDate_7_0= ruleDate ) ) otherlv_8= 'endDate:' ( (lv_endDate_9_0= ruleDate ) ) otherlv_10= 'tags:' ( (lv_tags_11_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getJobAccess().getTitleKeyword_0());
            		
            // InternalResume.g:567:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalResume.g:568:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalResume.g:568:4: (lv_title_1_0= RULE_STRING )
            // InternalResume.g:569:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_title_1_0, grammarAccess.getJobAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getJobAccess().getDescriptionKeyword_2());
            		
            // InternalResume.g:589:3: ( (lv_description_3_0= ruleStringList ) )
            // InternalResume.g:590:4: (lv_description_3_0= ruleStringList )
            {
            // InternalResume.g:590:4: (lv_description_3_0= ruleStringList )
            // InternalResume.g:591:5: lv_description_3_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getJobAccess().getDescriptionStringListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_description_3_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getJobAccess().getCompanyKeyword_4());
            		
            // InternalResume.g:612:3: ( (lv_company_5_0= RULE_STRING ) )
            // InternalResume.g:613:4: (lv_company_5_0= RULE_STRING )
            {
            // InternalResume.g:613:4: (lv_company_5_0= RULE_STRING )
            // InternalResume.g:614:5: lv_company_5_0= RULE_STRING
            {
            lv_company_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_company_5_0, grammarAccess.getJobAccess().getCompanySTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"company",
            						lv_company_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getJobAccess().getStartDateKeyword_6());
            		
            // InternalResume.g:634:3: ( (lv_startDate_7_0= ruleDate ) )
            // InternalResume.g:635:4: (lv_startDate_7_0= ruleDate )
            {
            // InternalResume.g:635:4: (lv_startDate_7_0= ruleDate )
            // InternalResume.g:636:5: lv_startDate_7_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getJobAccess().getStartDateDateParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_startDate_7_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"startDate",
            						lv_startDate_7_0,
            						"org.xtext.example.resume.Resume.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getJobAccess().getEndDateKeyword_8());
            		
            // InternalResume.g:657:3: ( (lv_endDate_9_0= ruleDate ) )
            // InternalResume.g:658:4: (lv_endDate_9_0= ruleDate )
            {
            // InternalResume.g:658:4: (lv_endDate_9_0= ruleDate )
            // InternalResume.g:659:5: lv_endDate_9_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getJobAccess().getEndDateDateParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_24);
            lv_endDate_9_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"endDate",
            						lv_endDate_9_0,
            						"org.xtext.example.resume.Resume.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getJobAccess().getTagsKeyword_10());
            		
            // InternalResume.g:680:3: ( (lv_tags_11_0= ruleStringList ) )
            // InternalResume.g:681:4: (lv_tags_11_0= ruleStringList )
            {
            // InternalResume.g:681:4: (lv_tags_11_0= ruleStringList )
            // InternalResume.g:682:5: lv_tags_11_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getJobAccess().getTagsStringListParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_11_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_11_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleProjects"
    // InternalResume.g:703:1: entryRuleProjects returns [EObject current=null] : iv_ruleProjects= ruleProjects EOF ;
    public final EObject entryRuleProjects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjects = null;


        try {
            // InternalResume.g:703:49: (iv_ruleProjects= ruleProjects EOF )
            // InternalResume.g:704:2: iv_ruleProjects= ruleProjects EOF
            {
             newCompositeNode(grammarAccess.getProjectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjects=ruleProjects();

            state._fsp--;

             current =iv_ruleProjects; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjects"


    // $ANTLR start "ruleProjects"
    // InternalResume.g:710:1: ruleProjects returns [EObject current=null] : (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ ) ;
    public final EObject ruleProjects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_projects_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:716:2: ( (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ ) )
            // InternalResume.g:717:2: (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ )
            {
            // InternalResume.g:717:2: (otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+ )
            // InternalResume.g:718:3: otherlv_0= 'Projects' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_projects_3_0= ruleProject ) )+
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectsAccess().getProjectsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:726:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:727:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:727:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:728:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_language_2_0, grammarAccess.getProjectsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:744:3: ( (lv_projects_3_0= ruleProject ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalResume.g:745:4: (lv_projects_3_0= ruleProject )
            	    {
            	    // InternalResume.g:745:4: (lv_projects_3_0= ruleProject )
            	    // InternalResume.g:746:5: lv_projects_3_0= ruleProject
            	    {

            	    					newCompositeNode(grammarAccess.getProjectsAccess().getProjectsProjectParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_projects_3_0=ruleProject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"projects",
            	    						lv_projects_3_0,
            	    						"org.xtext.example.resume.Resume.Project");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjects"


    // $ANTLR start "entryRuleProject"
    // InternalResume.g:767:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalResume.g:767:48: (iv_ruleProject= ruleProject EOF )
            // InternalResume.g:768:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalResume.g:774:1: ruleProject returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_link_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_description_3_0 = null;

        EObject lv_technologies_5_0 = null;

        EObject lv_tags_9_0 = null;



        	enterRule();

        try {
            // InternalResume.g:780:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? ) )
            // InternalResume.g:781:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? )
            {
            // InternalResume.g:781:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )? )
            // InternalResume.g:782:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'description:' ( (lv_description_3_0= ruleStringList ) ) otherlv_4= 'technologies:' ( (lv_technologies_5_0= ruleStringList ) ) otherlv_6= 'link:' ( (lv_link_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getTitleKeyword_0());
            		
            // InternalResume.g:786:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalResume.g:787:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalResume.g:787:4: (lv_title_1_0= RULE_STRING )
            // InternalResume.g:788:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_title_1_0, grammarAccess.getProjectAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getDescriptionKeyword_2());
            		
            // InternalResume.g:808:3: ( (lv_description_3_0= ruleStringList ) )
            // InternalResume.g:809:4: (lv_description_3_0= ruleStringList )
            {
            // InternalResume.g:809:4: (lv_description_3_0= ruleStringList )
            // InternalResume.g:810:5: lv_description_3_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getDescriptionStringListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_description_3_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getTechnologiesKeyword_4());
            		
            // InternalResume.g:831:3: ( (lv_technologies_5_0= ruleStringList ) )
            // InternalResume.g:832:4: (lv_technologies_5_0= ruleStringList )
            {
            // InternalResume.g:832:4: (lv_technologies_5_0= ruleStringList )
            // InternalResume.g:833:5: lv_technologies_5_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getTechnologiesStringListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_technologies_5_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"technologies",
            						lv_technologies_5_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getLinkKeyword_6());
            		
            // InternalResume.g:854:3: ( (lv_link_7_0= RULE_STRING ) )
            // InternalResume.g:855:4: (lv_link_7_0= RULE_STRING )
            {
            // InternalResume.g:855:4: (lv_link_7_0= RULE_STRING )
            // InternalResume.g:856:5: lv_link_7_0= RULE_STRING
            {
            lv_link_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_link_7_0, grammarAccess.getProjectAccess().getLinkSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"link",
            						lv_link_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getProjectAccess().getTagsKeyword_8());
            		
            // InternalResume.g:876:3: ( (lv_tags_9_0= ruleStringList ) )
            // InternalResume.g:877:4: (lv_tags_9_0= ruleStringList )
            {
            // InternalResume.g:877:4: (lv_tags_9_0= ruleStringList )
            // InternalResume.g:878:5: lv_tags_9_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getTagsStringListParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_27);
            lv_tags_9_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_9_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalResume.g:895:3: (otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalResume.g:896:4: otherlv_10= 'from:' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getFromKeyword_10_0());
                    			
                    // InternalResume.g:900:4: ( (otherlv_11= RULE_ID ) )
                    // InternalResume.g:901:5: (otherlv_11= RULE_ID )
                    {
                    // InternalResume.g:901:5: (otherlv_11= RULE_ID )
                    // InternalResume.g:902:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProjectRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_29); 

                    						newLeafNode(otherlv_11, grammarAccess.getProjectAccess().getFromSkillCrossReference_10_1_0());
                    					

                    }


                    }

                    // InternalResume.g:913:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalResume.g:914:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,34,FOLLOW_28); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getProjectAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalResume.g:918:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalResume.g:919:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalResume.g:919:6: (otherlv_13= RULE_ID )
                    	    // InternalResume.g:920:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProjectRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_29); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getProjectAccess().getFromSkillCrossReference_10_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEducation"
    // InternalResume.g:937:1: entryRuleEducation returns [EObject current=null] : iv_ruleEducation= ruleEducation EOF ;
    public final EObject entryRuleEducation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEducation = null;


        try {
            // InternalResume.g:937:50: (iv_ruleEducation= ruleEducation EOF )
            // InternalResume.g:938:2: iv_ruleEducation= ruleEducation EOF
            {
             newCompositeNode(grammarAccess.getEducationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEducation=ruleEducation();

            state._fsp--;

             current =iv_ruleEducation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEducation"


    // $ANTLR start "ruleEducation"
    // InternalResume.g:944:1: ruleEducation returns [EObject current=null] : (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* ) ;
    public final EObject ruleEducation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_degrees_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:950:2: ( (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* ) )
            // InternalResume.g:951:2: (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* )
            {
            // InternalResume.g:951:2: (otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )* )
            // InternalResume.g:952:3: otherlv_0= 'Education' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_degrees_3_0= ruleDegree ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEducationAccess().getEducationKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEducationAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:960:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:961:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:961:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:962:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_language_2_0, grammarAccess.getEducationAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEducationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:978:3: ( (lv_degrees_3_0= ruleDegree ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalResume.g:979:4: (lv_degrees_3_0= ruleDegree )
            	    {
            	    // InternalResume.g:979:4: (lv_degrees_3_0= ruleDegree )
            	    // InternalResume.g:980:5: lv_degrees_3_0= ruleDegree
            	    {

            	    					newCompositeNode(grammarAccess.getEducationAccess().getDegreesDegreeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_degrees_3_0=ruleDegree();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEducationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"degrees",
            	    						lv_degrees_3_0,
            	    						"org.xtext.example.resume.Resume.Degree");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEducation"


    // $ANTLR start "entryRuleDegree"
    // InternalResume.g:1001:1: entryRuleDegree returns [EObject current=null] : iv_ruleDegree= ruleDegree EOF ;
    public final EObject entryRuleDegree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDegree = null;


        try {
            // InternalResume.g:1001:47: (iv_ruleDegree= ruleDegree EOF )
            // InternalResume.g:1002:2: iv_ruleDegree= ruleDegree EOF
            {
             newCompositeNode(grammarAccess.getDegreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDegree=ruleDegree();

            state._fsp--;

             current =iv_ruleDegree; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDegree"


    // $ANTLR start "ruleDegree"
    // InternalResume.g:1008:1: ruleDegree returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) ) ;
    public final EObject ruleDegree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token lv_institution_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_country_7_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_graduationDate_5_0 = null;

        EObject lv_tags_9_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1014:2: ( (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) ) )
            // InternalResume.g:1015:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) )
            {
            // InternalResume.g:1015:2: (otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) ) )
            // InternalResume.g:1016:3: otherlv_0= 'title:' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'institution:' ( (lv_institution_3_0= RULE_STRING ) ) otherlv_4= 'graduationDate:' ( (lv_graduationDate_5_0= ruleDate ) ) otherlv_6= 'country:' ( (lv_country_7_0= RULE_STRING ) ) otherlv_8= 'tags:' ( (lv_tags_9_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDegreeAccess().getTitleKeyword_0());
            		
            // InternalResume.g:1020:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalResume.g:1021:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalResume.g:1021:4: (lv_title_1_0= RULE_STRING )
            // InternalResume.g:1022:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_title_1_0, grammarAccess.getDegreeAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDegreeAccess().getInstitutionKeyword_2());
            		
            // InternalResume.g:1042:3: ( (lv_institution_3_0= RULE_STRING ) )
            // InternalResume.g:1043:4: (lv_institution_3_0= RULE_STRING )
            {
            // InternalResume.g:1043:4: (lv_institution_3_0= RULE_STRING )
            // InternalResume.g:1044:5: lv_institution_3_0= RULE_STRING
            {
            lv_institution_3_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_institution_3_0, grammarAccess.getDegreeAccess().getInstitutionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"institution",
            						lv_institution_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getDegreeAccess().getGraduationDateKeyword_4());
            		
            // InternalResume.g:1064:3: ( (lv_graduationDate_5_0= ruleDate ) )
            // InternalResume.g:1065:4: (lv_graduationDate_5_0= ruleDate )
            {
            // InternalResume.g:1065:4: (lv_graduationDate_5_0= ruleDate )
            // InternalResume.g:1066:5: lv_graduationDate_5_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getDegreeAccess().getGraduationDateDateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_graduationDate_5_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDegreeRule());
            					}
            					set(
            						current,
            						"graduationDate",
            						lv_graduationDate_5_0,
            						"org.xtext.example.resume.Resume.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getDegreeAccess().getCountryKeyword_6());
            		
            // InternalResume.g:1087:3: ( (lv_country_7_0= RULE_STRING ) )
            // InternalResume.g:1088:4: (lv_country_7_0= RULE_STRING )
            {
            // InternalResume.g:1088:4: (lv_country_7_0= RULE_STRING )
            // InternalResume.g:1089:5: lv_country_7_0= RULE_STRING
            {
            lv_country_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_country_7_0, grammarAccess.getDegreeAccess().getCountrySTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDegreeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"country",
            						lv_country_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getDegreeAccess().getTagsKeyword_8());
            		
            // InternalResume.g:1109:3: ( (lv_tags_9_0= ruleStringList ) )
            // InternalResume.g:1110:4: (lv_tags_9_0= ruleStringList )
            {
            // InternalResume.g:1110:4: (lv_tags_9_0= ruleStringList )
            // InternalResume.g:1111:5: lv_tags_9_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getDegreeAccess().getTagsStringListParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_9_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDegreeRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_9_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDegree"


    // $ANTLR start "entryRuleSkills"
    // InternalResume.g:1132:1: entryRuleSkills returns [EObject current=null] : iv_ruleSkills= ruleSkills EOF ;
    public final EObject entryRuleSkills() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkills = null;


        try {
            // InternalResume.g:1132:47: (iv_ruleSkills= ruleSkills EOF )
            // InternalResume.g:1133:2: iv_ruleSkills= ruleSkills EOF
            {
             newCompositeNode(grammarAccess.getSkillsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkills=ruleSkills();

            state._fsp--;

             current =iv_ruleSkills; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSkills"


    // $ANTLR start "ruleSkills"
    // InternalResume.g:1139:1: ruleSkills returns [EObject current=null] : (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ ) ;
    public final EObject ruleSkills() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_skills_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1145:2: ( (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ ) )
            // InternalResume.g:1146:2: (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ )
            {
            // InternalResume.g:1146:2: (otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+ )
            // InternalResume.g:1147:3: otherlv_0= 'Skills' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_skills_3_0= ruleSkill ) )+
            {
            otherlv_0=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSkillsAccess().getSkillsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSkillsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1155:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1156:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1156:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1157:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_language_2_0, grammarAccess.getSkillsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:1173:3: ( (lv_skills_3_0= ruleSkill ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalResume.g:1174:4: (lv_skills_3_0= ruleSkill )
            	    {
            	    // InternalResume.g:1174:4: (lv_skills_3_0= ruleSkill )
            	    // InternalResume.g:1175:5: lv_skills_3_0= ruleSkill
            	    {

            	    					newCompositeNode(grammarAccess.getSkillsAccess().getSkillsSkillParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_skills_3_0=ruleSkill();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSkillsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"skills",
            	    						lv_skills_3_0,
            	    						"org.xtext.example.resume.Resume.Skill");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSkills"


    // $ANTLR start "entryRuleSkill"
    // InternalResume.g:1196:1: entryRuleSkill returns [EObject current=null] : iv_ruleSkill= ruleSkill EOF ;
    public final EObject entryRuleSkill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkill = null;


        try {
            // InternalResume.g:1196:46: (iv_ruleSkill= ruleSkill EOF )
            // InternalResume.g:1197:2: iv_ruleSkill= ruleSkill EOF
            {
             newCompositeNode(grammarAccess.getSkillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkill=ruleSkill();

            state._fsp--;

             current =iv_ruleSkill; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSkill"


    // $ANTLR start "ruleSkill"
    // InternalResume.g:1203:1: ruleSkill returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'title:' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) ;
    public final EObject ruleSkill() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        EObject lv_tags_4_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1209:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'title:' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) )
            // InternalResume.g:1210:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'title:' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            {
            // InternalResume.g:1210:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'title:' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            // InternalResume.g:1211:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'title:' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) )
            {
            // InternalResume.g:1211:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalResume.g:1212:4: (lv_name_0_0= RULE_ID )
            {
            // InternalResume.g:1212:4: (lv_name_0_0= RULE_ID )
            // InternalResume.g:1213:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSkillAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSkillAccess().getTitleKeyword_1());
            		
            // InternalResume.g:1233:3: ( (lv_title_2_0= RULE_STRING ) )
            // InternalResume.g:1234:4: (lv_title_2_0= RULE_STRING )
            {
            // InternalResume.g:1234:4: (lv_title_2_0= RULE_STRING )
            // InternalResume.g:1235:5: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_title_2_0, grammarAccess.getSkillAccess().getTitleSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSkillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSkillAccess().getTagsKeyword_3());
            		
            // InternalResume.g:1255:3: ( (lv_tags_4_0= ruleStringList ) )
            // InternalResume.g:1256:4: (lv_tags_4_0= ruleStringList )
            {
            // InternalResume.g:1256:4: (lv_tags_4_0= ruleStringList )
            // InternalResume.g:1257:5: lv_tags_4_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getSkillAccess().getTagsStringListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_4_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSkillRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_4_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSkill"


    // $ANTLR start "entryRuleInterests"
    // InternalResume.g:1278:1: entryRuleInterests returns [EObject current=null] : iv_ruleInterests= ruleInterests EOF ;
    public final EObject entryRuleInterests() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterests = null;


        try {
            // InternalResume.g:1278:50: (iv_ruleInterests= ruleInterests EOF )
            // InternalResume.g:1279:2: iv_ruleInterests= ruleInterests EOF
            {
             newCompositeNode(grammarAccess.getInterestsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterests=ruleInterests();

            state._fsp--;

             current =iv_ruleInterests; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterests"


    // $ANTLR start "ruleInterests"
    // InternalResume.g:1285:1: ruleInterests returns [EObject current=null] : (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) ;
    public final EObject ruleInterests() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        Token otherlv_3=null;
        EObject lv_tags_4_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1291:2: ( (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) )
            // InternalResume.g:1292:2: (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            {
            // InternalResume.g:1292:2: (otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            // InternalResume.g:1293:3: otherlv_0= 'Interests' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInterestsAccess().getInterestsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getInterestsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1301:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1302:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1302:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1303:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_language_2_0, grammarAccess.getInterestsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterestsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getInterestsAccess().getTagsKeyword_3());
            		
            // InternalResume.g:1323:3: ( (lv_tags_4_0= ruleStringList ) )
            // InternalResume.g:1324:4: (lv_tags_4_0= ruleStringList )
            {
            // InternalResume.g:1324:4: (lv_tags_4_0= ruleStringList )
            // InternalResume.g:1325:5: lv_tags_4_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getInterestsAccess().getTagsStringListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_4_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterestsRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_4_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterests"


    // $ANTLR start "entryRuleLanguages"
    // InternalResume.g:1346:1: entryRuleLanguages returns [EObject current=null] : iv_ruleLanguages= ruleLanguages EOF ;
    public final EObject entryRuleLanguages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguages = null;


        try {
            // InternalResume.g:1346:50: (iv_ruleLanguages= ruleLanguages EOF )
            // InternalResume.g:1347:2: iv_ruleLanguages= ruleLanguages EOF
            {
             newCompositeNode(grammarAccess.getLanguagesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguages=ruleLanguages();

            state._fsp--;

             current =iv_ruleLanguages; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguages"


    // $ANTLR start "ruleLanguages"
    // InternalResume.g:1353:1: ruleLanguages returns [EObject current=null] : (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) ;
    public final EObject ruleLanguages() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        Token otherlv_3=null;
        EObject lv_tags_4_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1359:2: ( (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) ) )
            // InternalResume.g:1360:2: (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            {
            // InternalResume.g:1360:2: (otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) ) )
            // InternalResume.g:1361:3: otherlv_0= 'Languages' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'tags:' ( (lv_tags_4_0= ruleStringList ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getLanguagesAccess().getLanguagesKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguagesAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1369:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1370:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1370:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1371:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_language_2_0, grammarAccess.getLanguagesAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguagesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getLanguagesAccess().getTagsKeyword_3());
            		
            // InternalResume.g:1391:3: ( (lv_tags_4_0= ruleStringList ) )
            // InternalResume.g:1392:4: (lv_tags_4_0= ruleStringList )
            {
            // InternalResume.g:1392:4: (lv_tags_4_0= ruleStringList )
            // InternalResume.g:1393:5: lv_tags_4_0= ruleStringList
            {

            					newCompositeNode(grammarAccess.getLanguagesAccess().getTagsStringListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_tags_4_0=ruleStringList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLanguagesRule());
            					}
            					set(
            						current,
            						"tags",
            						lv_tags_4_0,
            						"org.xtext.example.resume.Resume.StringList");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguages"


    // $ANTLR start "entryRuleMetrics"
    // InternalResume.g:1414:1: entryRuleMetrics returns [EObject current=null] : iv_ruleMetrics= ruleMetrics EOF ;
    public final EObject entryRuleMetrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrics = null;


        try {
            // InternalResume.g:1414:48: (iv_ruleMetrics= ruleMetrics EOF )
            // InternalResume.g:1415:2: iv_ruleMetrics= ruleMetrics EOF
            {
             newCompositeNode(grammarAccess.getMetricsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetrics=ruleMetrics();

            state._fsp--;

             current =iv_ruleMetrics; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetrics"


    // $ANTLR start "ruleMetrics"
    // InternalResume.g:1421:1: ruleMetrics returns [EObject current=null] : (otherlv_0= 'Metrics' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_metrics_3_0= ruleMetric ) )+ ) ;
    public final EObject ruleMetrics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        EObject lv_metrics_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1427:2: ( (otherlv_0= 'Metrics' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_metrics_3_0= ruleMetric ) )+ ) )
            // InternalResume.g:1428:2: (otherlv_0= 'Metrics' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_metrics_3_0= ruleMetric ) )+ )
            {
            // InternalResume.g:1428:2: (otherlv_0= 'Metrics' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_metrics_3_0= ruleMetric ) )+ )
            // InternalResume.g:1429:3: otherlv_0= 'Metrics' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) ( (lv_metrics_3_0= ruleMetric ) )+
            {
            otherlv_0=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricsAccess().getMetricsKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMetricsAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1437:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1438:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1438:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1439:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            					newLeafNode(lv_language_2_0, grammarAccess.getMetricsAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetricsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:1455:3: ( (lv_metrics_3_0= ruleMetric ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==42) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalResume.g:1456:4: (lv_metrics_3_0= ruleMetric )
            	    {
            	    // InternalResume.g:1456:4: (lv_metrics_3_0= ruleMetric )
            	    // InternalResume.g:1457:5: lv_metrics_3_0= ruleMetric
            	    {

            	    					newCompositeNode(grammarAccess.getMetricsAccess().getMetricsMetricParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_metrics_3_0=ruleMetric();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMetricsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"metrics",
            	    						lv_metrics_3_0,
            	    						"org.xtext.example.resume.Resume.Metric");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetrics"


    // $ANTLR start "entryRuleMetric"
    // InternalResume.g:1478:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalResume.g:1478:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalResume.g:1479:2: iv_ruleMetric= ruleMetric EOF
            {
             newCompositeNode(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetric=ruleMetric();

            state._fsp--;

             current =iv_ruleMetric; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalResume.g:1485:1: ruleMetric returns [EObject current=null] : (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1491:2: ( (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalResume.g:1492:2: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalResume.g:1492:2: (otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalResume.g:1493:3: otherlv_0= 'Metric' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricAccess().getMetricKeyword_0());
            		
            // InternalResume.g:1497:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalResume.g:1498:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalResume.g:1498:4: (lv_name_1_0= RULE_STRING )
            // InternalResume.g:1499:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMetricAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetricRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getEqualsSignKeyword_2());
            		
            // InternalResume.g:1519:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalResume.g:1520:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalResume.g:1520:4: (lv_expression_3_0= ruleExpression )
            // InternalResume.g:1521:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMetricAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.example.resume.Resume.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleExpression"
    // InternalResume.g:1542:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalResume.g:1542:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalResume.g:1543:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalResume.g:1549:1: ruleExpression returns [EObject current=null] : this_Subtraction_0= ruleSubtraction ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Subtraction_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1555:2: (this_Subtraction_0= ruleSubtraction )
            // InternalResume.g:1556:2: this_Subtraction_0= ruleSubtraction
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getSubtractionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Subtraction_0=ruleSubtraction();

            state._fsp--;


            		current = this_Subtraction_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSubtraction"
    // InternalResume.g:1567:1: entryRuleSubtraction returns [EObject current=null] : iv_ruleSubtraction= ruleSubtraction EOF ;
    public final EObject entryRuleSubtraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtraction = null;


        try {
            // InternalResume.g:1567:52: (iv_ruleSubtraction= ruleSubtraction EOF )
            // InternalResume.g:1568:2: iv_ruleSubtraction= ruleSubtraction EOF
            {
             newCompositeNode(grammarAccess.getSubtractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtraction=ruleSubtraction();

            state._fsp--;

             current =iv_ruleSubtraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubtraction"


    // $ANTLR start "ruleSubtraction"
    // InternalResume.g:1574:1: ruleSubtraction returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )* ) ;
    public final EObject ruleSubtraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NumberLiteral_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalResume.g:1580:2: ( (this_NumberLiteral_0= ruleNumberLiteral ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )* ) )
            // InternalResume.g:1581:2: (this_NumberLiteral_0= ruleNumberLiteral ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )* )
            {
            // InternalResume.g:1581:2: (this_NumberLiteral_0= ruleNumberLiteral ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )* )
            // InternalResume.g:1582:3: this_NumberLiteral_0= ruleNumberLiteral ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubtractionAccess().getNumberLiteralParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_NumberLiteral_0=ruleNumberLiteral();

            state._fsp--;


            			current = this_NumberLiteral_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalResume.g:1590:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==44) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalResume.g:1591:4: () otherlv_2= '-' ( (lv_right_3_0= ruleNumberLiteral ) )
            	    {
            	    // InternalResume.g:1591:4: ()
            	    // InternalResume.g:1592:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSubtractionAccess().getSubtractionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_36); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSubtractionAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalResume.g:1602:4: ( (lv_right_3_0= ruleNumberLiteral ) )
            	    // InternalResume.g:1603:5: (lv_right_3_0= ruleNumberLiteral )
            	    {
            	    // InternalResume.g:1603:5: (lv_right_3_0= ruleNumberLiteral )
            	    // InternalResume.g:1604:6: lv_right_3_0= ruleNumberLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getSubtractionAccess().getRightNumberLiteralParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleNumberLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubtractionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.resume.Resume.NumberLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubtraction"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalResume.g:1626:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalResume.g:1626:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalResume.g:1627:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalResume.g:1633:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalResume.g:1639:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalResume.g:1640:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalResume.g:1640:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalResume.g:1641:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalResume.g:1641:3: ()
            // InternalResume.g:1642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
            					current);
            			

            }

            // InternalResume.g:1648:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalResume.g:1649:4: (lv_value_1_0= RULE_INT )
            {
            // InternalResume.g:1649:4: (lv_value_1_0= RULE_INT )
            // InternalResume.g:1650:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleCustomization"
    // InternalResume.g:1670:1: entryRuleCustomization returns [EObject current=null] : iv_ruleCustomization= ruleCustomization EOF ;
    public final EObject entryRuleCustomization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomization = null;


        try {
            // InternalResume.g:1670:54: (iv_ruleCustomization= ruleCustomization EOF )
            // InternalResume.g:1671:2: iv_ruleCustomization= ruleCustomization EOF
            {
             newCompositeNode(grammarAccess.getCustomizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomization=ruleCustomization();

            state._fsp--;

             current =iv_ruleCustomization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomization"


    // $ANTLR start "ruleCustomization"
    // InternalResume.g:1677:1: ruleCustomization returns [EObject current=null] : (otherlv_0= 'Customization' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'targetJobOffer:' ( (lv_jobOfferPath_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_language_2_0=null;
        Token otherlv_3=null;
        Token lv_jobOfferPath_4_0=null;


        	enterRule();

        try {
            // InternalResume.g:1683:2: ( (otherlv_0= 'Customization' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'targetJobOffer:' ( (lv_jobOfferPath_4_0= RULE_STRING ) ) ) )
            // InternalResume.g:1684:2: (otherlv_0= 'Customization' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'targetJobOffer:' ( (lv_jobOfferPath_4_0= RULE_STRING ) ) )
            {
            // InternalResume.g:1684:2: (otherlv_0= 'Customization' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'targetJobOffer:' ( (lv_jobOfferPath_4_0= RULE_STRING ) ) )
            // InternalResume.g:1685:3: otherlv_0= 'Customization' otherlv_1= 'language:' ( (lv_language_2_0= RULE_STRING ) ) otherlv_3= 'targetJobOffer:' ( (lv_jobOfferPath_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomizationAccess().getCustomizationKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomizationAccess().getLanguageKeyword_1());
            		
            // InternalResume.g:1693:3: ( (lv_language_2_0= RULE_STRING ) )
            // InternalResume.g:1694:4: (lv_language_2_0= RULE_STRING )
            {
            // InternalResume.g:1694:4: (lv_language_2_0= RULE_STRING )
            // InternalResume.g:1695:5: lv_language_2_0= RULE_STRING
            {
            lv_language_2_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_language_2_0, grammarAccess.getCustomizationAccess().getLanguageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomizationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomizationAccess().getTargetJobOfferKeyword_3());
            		
            // InternalResume.g:1715:3: ( (lv_jobOfferPath_4_0= RULE_STRING ) )
            // InternalResume.g:1716:4: (lv_jobOfferPath_4_0= RULE_STRING )
            {
            // InternalResume.g:1716:4: (lv_jobOfferPath_4_0= RULE_STRING )
            // InternalResume.g:1717:5: lv_jobOfferPath_4_0= RULE_STRING
            {
            lv_jobOfferPath_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_jobOfferPath_4_0, grammarAccess.getCustomizationAccess().getJobOfferPathSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomizationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"jobOfferPath",
            						lv_jobOfferPath_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomization"


    // $ANTLR start "entryRuleStringList"
    // InternalResume.g:1737:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // InternalResume.g:1737:51: (iv_ruleStringList= ruleStringList EOF )
            // InternalResume.g:1738:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringList"


    // $ANTLR start "ruleStringList"
    // InternalResume.g:1744:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleStringList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalResume.g:1750:2: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) )
            // InternalResume.g:1751:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            {
            // InternalResume.g:1751:2: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            // InternalResume.g:1752:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalResume.g:1756:3: ( (lv_values_1_0= RULE_STRING ) )
            // InternalResume.g:1757:4: (lv_values_1_0= RULE_STRING )
            {
            // InternalResume.g:1757:4: (lv_values_1_0= RULE_STRING )
            // InternalResume.g:1758:5: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_values_1_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringListRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalResume.g:1774:3: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalResume.g:1775:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalResume.g:1779:4: ( (lv_values_3_0= RULE_STRING ) )
            	    // InternalResume.g:1780:5: (lv_values_3_0= RULE_STRING )
            	    {
            	    // InternalResume.g:1780:5: (lv_values_3_0= RULE_STRING )
            	    // InternalResume.g:1781:6: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            	    						newLeafNode(lv_values_3_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStringListRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringList"


    // $ANTLR start "entryRuleDate"
    // InternalResume.g:1806:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // InternalResume.g:1806:44: (iv_ruleDate= ruleDate EOF )
            // InternalResume.g:1807:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalResume.g:1813:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalResume.g:1819:2: (this_STRING_0= RULE_STRING )
            // InternalResume.g:1820:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getDateAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000003C840400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000023C840400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000400000000L});

}