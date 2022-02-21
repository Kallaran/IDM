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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'CREATE'", "':'", "'LOAD'", "'='", "'PRINT'", "'HEAD'", "'INSERT'", "'COLUMN'", "'TO'", "'CSV'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==13||LA1_0==15||(LA1_0>=17 && LA1_0<=19)||LA1_0==21) ) {
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
    // InternalMyDsl.g:142:1: ruleCommand returns [EObject current=null] : (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead | this_InsertColumn_4= ruleInsertColumn | this_ToCSV_5= ruleToCSV ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Load_1 = null;

        EObject this_Print_2 = null;

        EObject this_Head_3 = null;

        EObject this_InsertColumn_4 = null;

        EObject this_ToCSV_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:148:2: ( (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead | this_InsertColumn_4= ruleInsertColumn | this_ToCSV_5= ruleToCSV ) )
            // InternalMyDsl.g:149:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead | this_InsertColumn_4= ruleInsertColumn | this_ToCSV_5= ruleToCSV )
            {
            // InternalMyDsl.g:149:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead | this_InsertColumn_4= ruleInsertColumn | this_ToCSV_5= ruleToCSV )
            int alt2=6;
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
            case 19:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
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
                case 5 :
                    // InternalMyDsl.g:186:3: this_InsertColumn_4= ruleInsertColumn
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getInsertColumnParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_InsertColumn_4=ruleInsertColumn();

                    state._fsp--;


                    			current = this_InsertColumn_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:195:3: this_ToCSV_5= ruleToCSV
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getToCSVParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ToCSV_5=ruleToCSV();

                    state._fsp--;


                    			current = this_ToCSV_5;
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
    // InternalMyDsl.g:207:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalMyDsl.g:207:48: (iv_ruleContent= ruleContent EOF )
            // InternalMyDsl.g:208:2: iv_ruleContent= ruleContent EOF
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
    // InternalMyDsl.g:214:1: ruleContent returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_fields_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:220:2: ( ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' ) )
            // InternalMyDsl.g:221:2: ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' )
            {
            // InternalMyDsl.g:221:2: ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' )
            // InternalMyDsl.g:222:3: () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']'
            {
            // InternalMyDsl.g:222:3: ()
            // InternalMyDsl.g:223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentAccess().getContentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContentAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:233:3: ( (lv_fields_2_0= RULE_STRING ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:234:4: (lv_fields_2_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:234:4: (lv_fields_2_0= RULE_STRING )
            	    // InternalMyDsl.g:235:5: lv_fields_2_0= RULE_STRING
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
    // InternalMyDsl.g:259:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalMyDsl.g:259:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalMyDsl.g:260:2: iv_ruleCreate= ruleCreate EOF
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
    // InternalMyDsl.g:266:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'CREATE' ( (lv_path_1_0= ruleType ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' ) ;
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
            // InternalMyDsl.g:272:2: ( (otherlv_0= 'CREATE' ( (lv_path_1_0= ruleType ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' ) )
            // InternalMyDsl.g:273:2: (otherlv_0= 'CREATE' ( (lv_path_1_0= ruleType ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' )
            {
            // InternalMyDsl.g:273:2: (otherlv_0= 'CREATE' ( (lv_path_1_0= ruleType ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' )
            // InternalMyDsl.g:274:3: otherlv_0= 'CREATE' ( (lv_path_1_0= ruleType ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCREATEKeyword_0());
            		
            // InternalMyDsl.g:278:3: ( (lv_path_1_0= ruleType ) )
            // InternalMyDsl.g:279:4: (lv_path_1_0= ruleType )
            {
            // InternalMyDsl.g:279:4: (lv_path_1_0= ruleType )
            // InternalMyDsl.g:280:5: lv_path_1_0= ruleType
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
            		
            // InternalMyDsl.g:305:3: ( (lv_columns_4_0= RULE_STRING ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:306:4: (lv_columns_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:306:4: (lv_columns_4_0= RULE_STRING )
            	    // InternalMyDsl.g:307:5: lv_columns_4_0= RULE_STRING
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
            		
            // InternalMyDsl.g:335:3: ( (lv_content_8_0= ruleContent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:336:4: (lv_content_8_0= ruleContent )
            	    {
            	    // InternalMyDsl.g:336:4: (lv_content_8_0= ruleContent )
            	    // InternalMyDsl.g:337:5: lv_content_8_0= ruleContent
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
    // InternalMyDsl.g:362:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalMyDsl.g:362:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalMyDsl.g:363:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalMyDsl.g:369:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= ruleType ) ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:375:2: ( (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= ruleType ) ) ) )
            // InternalMyDsl.g:376:2: (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= ruleType ) ) )
            {
            // InternalMyDsl.g:376:2: (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= ruleType ) ) )
            // InternalMyDsl.g:377:3: otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLOADKeyword_0());
            		
            // InternalMyDsl.g:381:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:382:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:382:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:383:5: lv_name_1_0= RULE_ID
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
            		
            // InternalMyDsl.g:403:3: ( (lv_path_3_0= ruleType ) )
            // InternalMyDsl.g:404:4: (lv_path_3_0= ruleType )
            {
            // InternalMyDsl.g:404:4: (lv_path_3_0= ruleType )
            // InternalMyDsl.g:405:5: lv_path_3_0= ruleType
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
    // InternalMyDsl.g:426:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalMyDsl.g:426:46: (iv_rulePrint= rulePrint EOF )
            // InternalMyDsl.g:427:2: iv_rulePrint= rulePrint EOF
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
    // InternalMyDsl.g:433:1: rulePrint returns [EObject current=null] : (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:439:2: ( (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:440:2: (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:440:2: (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:441:3: otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPRINTKeyword_0());
            		
            // InternalMyDsl.g:445:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:446:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:446:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:447:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrintAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleHead"
    // InternalMyDsl.g:467:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // InternalMyDsl.g:467:45: (iv_ruleHead= ruleHead EOF )
            // InternalMyDsl.g:468:2: iv_ruleHead= ruleHead EOF
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
    // InternalMyDsl.g:474:1: ruleHead returns [EObject current=null] : (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:480:2: ( (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:481:2: (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:481:2: (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:482:3: otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getHeadAccess().getHEADKeyword_0());
            		
            // InternalMyDsl.g:486:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:487:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:487:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:488:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleInsertColumn"
    // InternalMyDsl.g:508:1: entryRuleInsertColumn returns [EObject current=null] : iv_ruleInsertColumn= ruleInsertColumn EOF ;
    public final EObject entryRuleInsertColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertColumn = null;


        try {
            // InternalMyDsl.g:508:53: (iv_ruleInsertColumn= ruleInsertColumn EOF )
            // InternalMyDsl.g:509:2: iv_ruleInsertColumn= ruleInsertColumn EOF
            {
             newCompositeNode(grammarAccess.getInsertColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertColumn=ruleInsertColumn();

            state._fsp--;

             current =iv_ruleInsertColumn; 
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
    // $ANTLR end "entryRuleInsertColumn"


    // $ANTLR start "ruleInsertColumn"
    // InternalMyDsl.g:515:1: ruleInsertColumn returns [EObject current=null] : (otherlv_0= 'INSERT' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleInsertColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_column_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:521:2: ( (otherlv_0= 'INSERT' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:522:2: (otherlv_0= 'INSERT' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:522:2: (otherlv_0= 'INSERT' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:523:3: otherlv_0= 'INSERT' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertColumnAccess().getINSERTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertColumnAccess().getCOLUMNKeyword_1());
            		
            // InternalMyDsl.g:531:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:532:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:532:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:533:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInsertColumnAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:549:3: ( (lv_column_3_0= RULE_STRING ) )
            // InternalMyDsl.g:550:4: (lv_column_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:550:4: (lv_column_3_0= RULE_STRING )
            // InternalMyDsl.g:551:5: lv_column_3_0= RULE_STRING
            {
            lv_column_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_column_3_0, grammarAccess.getInsertColumnAccess().getColumnSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"column",
            						lv_column_3_0,
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
    // $ANTLR end "ruleInsertColumn"


    // $ANTLR start "entryRuleToCSV"
    // InternalMyDsl.g:571:1: entryRuleToCSV returns [EObject current=null] : iv_ruleToCSV= ruleToCSV EOF ;
    public final EObject entryRuleToCSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToCSV = null;


        try {
            // InternalMyDsl.g:571:46: (iv_ruleToCSV= ruleToCSV EOF )
            // InternalMyDsl.g:572:2: iv_ruleToCSV= ruleToCSV EOF
            {
             newCompositeNode(grammarAccess.getToCSVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToCSV=ruleToCSV();

            state._fsp--;

             current =iv_ruleToCSV; 
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
    // $ANTLR end "entryRuleToCSV"


    // $ANTLR start "ruleToCSV"
    // InternalMyDsl.g:578:1: ruleToCSV returns [EObject current=null] : (otherlv_0= 'TO' otherlv_1= 'CSV' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleToCSV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:584:2: ( (otherlv_0= 'TO' otherlv_1= 'CSV' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:585:2: (otherlv_0= 'TO' otherlv_1= 'CSV' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:585:2: (otherlv_0= 'TO' otherlv_1= 'CSV' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:586:3: otherlv_0= 'TO' otherlv_1= 'CSV' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getToCSVAccess().getTOKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getToCSVAccess().getCSVKeyword_1());
            		
            // InternalMyDsl.g:594:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:595:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:595:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:596:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getToCSVAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToCSVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:612:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMyDsl.g:613:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:613:4: (lv_path_3_0= RULE_STRING )
            // InternalMyDsl.g:614:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_3_0, grammarAccess.getToCSVAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToCSVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
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
    // $ANTLR end "ruleToCSV"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000002EA002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});

}