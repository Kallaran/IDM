package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CREATE'", "'='", "'LOAD'", "'PRINT'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalMyDsl.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_commands_0_0= ruleCommand )
            	    // InternalMyDsl.g:80:4: lv_commands_0_0= ruleCommand
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Command");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:100:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDsl.g:101:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:107:1: ruleCommand returns [EObject current=null] : (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Load_1 = null;

        EObject this_Print_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint ) )
            // InternalMyDsl.g:114:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint )
            {
            // InternalMyDsl.g:114:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_Create_0= ruleCreate
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCreateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Create_0=ruleCreate();

                    state._fsp--;


                    			current = this_Create_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_Load_1= ruleLoad
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLoadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Load_1=ruleLoad();

                    state._fsp--;


                    			current = this_Load_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:133:3: this_Print_2= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getPrintParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_2=rulePrint();

                    state._fsp--;


                    			current = this_Print_2;
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCreate"
    // InternalMyDsl.g:145:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalMyDsl.g:145:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalMyDsl.g:146:2: iv_ruleCreate= ruleCreate EOF
            {
             newCompositeNode(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreate=ruleCreate();

            state._fsp--;

             current =iv_ruleCreate; 
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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // InternalMyDsl.g:152:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'CREATE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:158:2: ( (otherlv_0= 'CREATE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) ) )
            // InternalMyDsl.g:159:2: (otherlv_0= 'CREATE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) )
            {
            // InternalMyDsl.g:159:2: (otherlv_0= 'CREATE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) )
            // InternalMyDsl.g:160:3: otherlv_0= 'CREATE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCREATEKeyword_0());
            		
            // InternalMyDsl.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCreateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:186:3: ( (lv_path_3_0= rulePath ) )
            // InternalMyDsl.g:187:4: (lv_path_3_0= rulePath )
            {
            // InternalMyDsl.g:187:4: (lv_path_3_0= rulePath )
            // InternalMyDsl.g:188:5: lv_path_3_0= rulePath
            {

            					newCompositeNode(grammarAccess.getCreateAccess().getPathPathParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_3_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.xtext.example.mydsl.MyDsl.Path");
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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleLoad"
    // InternalMyDsl.g:209:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalMyDsl.g:209:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalMyDsl.g:210:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalMyDsl.g:216:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:222:2: ( (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) ) )
            // InternalMyDsl.g:223:2: (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) )
            {
            // InternalMyDsl.g:223:2: (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) )
            // InternalMyDsl.g:224:3: otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLOADKeyword_0());
            		
            // InternalMyDsl.g:228:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:229:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:229:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:230:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLoadAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:250:3: ( (lv_path_3_0= rulePath ) )
            // InternalMyDsl.g:251:4: (lv_path_3_0= rulePath )
            {
            // InternalMyDsl.g:251:4: (lv_path_3_0= rulePath )
            // InternalMyDsl.g:252:5: lv_path_3_0= rulePath
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getPathPathParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_3_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.xtext.example.mydsl.MyDsl.Path");
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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRulePrint"
    // InternalMyDsl.g:273:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalMyDsl.g:273:46: (iv_rulePrint= rulePrint EOF )
            // InternalMyDsl.g:274:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalMyDsl.g:280:1: rulePrint returns [EObject current=null] : (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:286:2: ( (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) ) )
            // InternalMyDsl.g:287:2: (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) )
            {
            // InternalMyDsl.g:287:2: (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) ) )
            // InternalMyDsl.g:288:3: otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= rulePath ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPRINTKeyword_0());
            		
            // InternalMyDsl.g:292:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:293:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:293:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:294:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrintAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:314:3: ( (lv_path_3_0= rulePath ) )
            // InternalMyDsl.g:315:4: (lv_path_3_0= rulePath )
            {
            // InternalMyDsl.g:315:4: (lv_path_3_0= rulePath )
            // InternalMyDsl.g:316:5: lv_path_3_0= rulePath
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getPathPathParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_3_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.xtext.example.mydsl.MyDsl.Path");
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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRulePath"
    // InternalMyDsl.g:337:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalMyDsl.g:337:45: (iv_rulePath= rulePath EOF )
            // InternalMyDsl.g:338:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
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
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalMyDsl.g:344:1: rulePath returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:350:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:351:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:351:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMyDsl.g:352:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:352:3: (lv_name_0_0= RULE_STRING )
            // InternalMyDsl.g:353:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPathAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPathRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "rulePath"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});

}