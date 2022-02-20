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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'CREATE'", "':'", "'LOAD'", "'='", "'PRINT'", "'HEAD'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
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

                if ( (LA1_0==13||LA1_0==15||(LA1_0>=17 && LA1_0<=18)) ) {
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


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:107:1: ruleType returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:114:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:114:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalMyDsl.g:115:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:115:3: (lv_name_0_0= RULE_STRING )
            // InternalMyDsl.g:116:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRule());
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:135:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDsl.g:135:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDsl.g:136:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalMyDsl.g:142:1: ruleCommand returns [EObject current=null] : (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Load_1 = null;

        EObject this_Print_2 = null;

        EObject this_Head_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:148:2: ( (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead ) )
            // InternalMyDsl.g:149:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead )
            {
            // InternalMyDsl.g:149:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:150:3: this_Create_0= ruleCreate
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
                    // InternalMyDsl.g:159:3: this_Load_1= ruleLoad
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
                    // InternalMyDsl.g:168:3: this_Print_2= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getPrintParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_2=rulePrint();

                    state._fsp--;


                    			current = this_Print_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:177:3: this_Head_3= ruleHead
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getHeadParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Head_3=ruleHead();

                    state._fsp--;


                    			current = this_Head_3;
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


    // $ANTLR start "entryRuleContent"
    // InternalMyDsl.g:189:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalMyDsl.g:189:48: (iv_ruleContent= ruleContent EOF )
            // InternalMyDsl.g:190:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalMyDsl.g:196:1: ruleContent returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_fields_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:202:2: ( ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' ) )
            // InternalMyDsl.g:203:2: ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' )
            {
            // InternalMyDsl.g:203:2: ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' )
            // InternalMyDsl.g:204:3: () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']'
            {
            // InternalMyDsl.g:204:3: ()
            // InternalMyDsl.g:205:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentAccess().getContentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContentAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:215:3: ( (lv_fields_2_0= RULE_STRING ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:216:4: (lv_fields_2_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:216:4: (lv_fields_2_0= RULE_STRING )
            	    // InternalMyDsl.g:217:5: lv_fields_2_0= RULE_STRING
            	    {
            	    lv_fields_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    					newLeafNode(lv_fields_2_0, grammarAccess.getContentAccess().getFieldsSTRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getContentRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"fields",
            	    						lv_fields_2_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContentAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleCreate"
    // InternalMyDsl.g:241:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalMyDsl.g:241:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalMyDsl.g:242:2: iv_ruleCreate= ruleCreate EOF
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
    // InternalMyDsl.g:248:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'CREATE' ( (lv_path_1_0= ruleType ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_columns_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_path_1_0 = null;

        EObject lv_content_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( (otherlv_0= 'CREATE' ( (lv_path_1_0= ruleType ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' ) )
            // InternalMyDsl.g:255:2: (otherlv_0= 'CREATE' ( (lv_path_1_0= ruleType ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' )
            {
            // InternalMyDsl.g:255:2: (otherlv_0= 'CREATE' ( (lv_path_1_0= ruleType ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' )
            // InternalMyDsl.g:256:3: otherlv_0= 'CREATE' ( (lv_path_1_0= ruleType ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCREATEKeyword_0());
            		
            // InternalMyDsl.g:260:3: ( (lv_path_1_0= ruleType ) )
            // InternalMyDsl.g:261:4: (lv_path_1_0= ruleType )
            {
            // InternalMyDsl.g:261:4: (lv_path_1_0= ruleType )
            // InternalMyDsl.g:262:5: lv_path_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getCreateAccess().getPathTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_path_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalMyDsl.g:287:3: ( (lv_columns_4_0= RULE_STRING ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:288:4: (lv_columns_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:288:4: (lv_columns_4_0= RULE_STRING )
            	    // InternalMyDsl.g:289:5: lv_columns_4_0= RULE_STRING
            	    {
            	    lv_columns_4_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    					newLeafNode(lv_columns_4_0, grammarAccess.getCreateAccess().getColumnsSTRINGTerminalRuleCall_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCreateRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"columns",
            	    						lv_columns_4_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCreateAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getCreateAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalMyDsl.g:317:3: ( (lv_content_8_0= ruleContent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:318:4: (lv_content_8_0= ruleContent )
            	    {
            	    // InternalMyDsl.g:318:4: (lv_content_8_0= ruleContent )
            	    // InternalMyDsl.g:319:5: lv_content_8_0= ruleContent
            	    {

            	    					newCompositeNode(grammarAccess.getCreateAccess().getContentContentParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_content_8_0=ruleContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCreateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.Content");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCreateAccess().getRightSquareBracketKeyword_9());
            		

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
    // InternalMyDsl.g:344:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalMyDsl.g:344:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalMyDsl.g:345:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalMyDsl.g:351:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= ruleType ) ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:357:2: ( (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= ruleType ) ) ) )
            // InternalMyDsl.g:358:2: (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= ruleType ) ) )
            {
            // InternalMyDsl.g:358:2: (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= ruleType ) ) )
            // InternalMyDsl.g:359:3: otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLOADKeyword_0());
            		
            // InternalMyDsl.g:363:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:364:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:364:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:365:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDsl.g:385:3: ( (lv_path_3_0= ruleType ) )
            // InternalMyDsl.g:386:4: (lv_path_3_0= ruleType )
            {
            // InternalMyDsl.g:386:4: (lv_path_3_0= ruleType )
            // InternalMyDsl.g:387:5: lv_path_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getPathTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
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
    // InternalMyDsl.g:408:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalMyDsl.g:408:46: (iv_rulePrint= rulePrint EOF )
            // InternalMyDsl.g:409:2: iv_rulePrint= rulePrint EOF
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
    // InternalMyDsl.g:415:1: rulePrint returns [EObject current=null] : (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:421:2: ( (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:422:2: (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:422:2: (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:423:3: otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPRINTKeyword_0());
            		
            // InternalMyDsl.g:427:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:428:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:428:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:429:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleHead"
    // InternalMyDsl.g:449:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // InternalMyDsl.g:449:45: (iv_ruleHead= ruleHead EOF )
            // InternalMyDsl.g:450:2: iv_ruleHead= ruleHead EOF
            {
             newCompositeNode(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHead=ruleHead();

            state._fsp--;

             current =iv_ruleHead; 
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
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // InternalMyDsl.g:456:1: ruleHead returns [EObject current=null] : (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:462:2: ( (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:463:2: (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:463:2: (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:464:3: otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getHeadAccess().getHEADKeyword_0());
            		
            // InternalMyDsl.g:468:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:469:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:469:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:470:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHeadAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleHead"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000006A002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}