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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'CREATE'", "':'", "'LOAD'", "'='", "'PRINT'", "'HEAD'", "'INSERT'", "'COLUMN'", "'TO'", "'CSV'", "'DROP'", "'ROW'", "'GET'"
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
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

                if ( (LA1_0==13||LA1_0==15||(LA1_0>=17 && LA1_0<=19)||LA1_0==21||LA1_0==23||LA1_0==25) ) {
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
    // InternalMyDsl.g:107:1: ruleCommand returns [EObject current=null] : (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead | this_InsertColumn_4= ruleInsertColumn | this_ToCSV_5= ruleToCSV | this_DropColumn_6= ruleDropColumn | this_DropRow_7= ruleDropRow | this_InsertRow_8= ruleInsertRow | this_GetColumn_9= ruleGetColumn | this_GetRow_10= ruleGetRow ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Load_1 = null;

        EObject this_Print_2 = null;

        EObject this_Head_3 = null;

        EObject this_InsertColumn_4 = null;

        EObject this_ToCSV_5 = null;

        EObject this_DropColumn_6 = null;

        EObject this_DropRow_7 = null;

        EObject this_InsertRow_8 = null;

        EObject this_GetColumn_9 = null;

        EObject this_GetRow_10 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead | this_InsertColumn_4= ruleInsertColumn | this_ToCSV_5= ruleToCSV | this_DropColumn_6= ruleDropColumn | this_DropRow_7= ruleDropRow | this_InsertRow_8= ruleInsertRow | this_GetColumn_9= ruleGetColumn | this_GetRow_10= ruleGetRow ) )
            // InternalMyDsl.g:114:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead | this_InsertColumn_4= ruleInsertColumn | this_ToCSV_5= ruleToCSV | this_DropColumn_6= ruleDropColumn | this_DropRow_7= ruleDropRow | this_InsertRow_8= ruleInsertRow | this_GetColumn_9= ruleGetColumn | this_GetRow_10= ruleGetRow )
            {
            // InternalMyDsl.g:114:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead | this_InsertColumn_4= ruleInsertColumn | this_ToCSV_5= ruleToCSV | this_DropColumn_6= ruleDropColumn | this_DropRow_7= ruleDropRow | this_InsertRow_8= ruleInsertRow | this_GetColumn_9= ruleGetColumn | this_GetRow_10= ruleGetRow )
            int alt2=11;
            alt2 = dfa2.predict(input);
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
                case 4 :
                    // InternalMyDsl.g:142:3: this_Head_3= ruleHead
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
                    // InternalMyDsl.g:151:3: this_InsertColumn_4= ruleInsertColumn
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
                    // InternalMyDsl.g:160:3: this_ToCSV_5= ruleToCSV
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getToCSVParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ToCSV_5=ruleToCSV();

                    state._fsp--;


                    			current = this_ToCSV_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:169:3: this_DropColumn_6= ruleDropColumn
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDropColumnParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropColumn_6=ruleDropColumn();

                    state._fsp--;


                    			current = this_DropColumn_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:178:3: this_DropRow_7= ruleDropRow
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDropRowParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DropRow_7=ruleDropRow();

                    state._fsp--;


                    			current = this_DropRow_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:187:3: this_InsertRow_8= ruleInsertRow
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getInsertRowParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_InsertRow_8=ruleInsertRow();

                    state._fsp--;


                    			current = this_InsertRow_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:196:3: this_GetColumn_9= ruleGetColumn
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getGetColumnParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetColumn_9=ruleGetColumn();

                    state._fsp--;


                    			current = this_GetColumn_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:205:3: this_GetRow_10= ruleGetRow
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getGetRowParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetRow_10=ruleGetRow();

                    state._fsp--;


                    			current = this_GetRow_10;
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
    // InternalMyDsl.g:217:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalMyDsl.g:217:48: (iv_ruleContent= ruleContent EOF )
            // InternalMyDsl.g:218:2: iv_ruleContent= ruleContent EOF
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
    // InternalMyDsl.g:224:1: ruleContent returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_fields_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:230:2: ( ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' ) )
            // InternalMyDsl.g:231:2: ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' )
            {
            // InternalMyDsl.g:231:2: ( () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']' )
            // InternalMyDsl.g:232:3: () otherlv_1= '[' ( (lv_fields_2_0= RULE_STRING ) )* otherlv_3= ']'
            {
            // InternalMyDsl.g:232:3: ()
            // InternalMyDsl.g:233:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentAccess().getContentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContentAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:243:3: ( (lv_fields_2_0= RULE_STRING ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:244:4: (lv_fields_2_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:244:4: (lv_fields_2_0= RULE_STRING )
            	    // InternalMyDsl.g:245:5: lv_fields_2_0= RULE_STRING
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
    // InternalMyDsl.g:269:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalMyDsl.g:269:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalMyDsl.g:270:2: iv_ruleCreate= ruleCreate EOF
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
    // InternalMyDsl.g:276:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'CREATE' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_columns_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_content_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:282:2: ( (otherlv_0= 'CREATE' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' ) )
            // InternalMyDsl.g:283:2: (otherlv_0= 'CREATE' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' )
            {
            // InternalMyDsl.g:283:2: (otherlv_0= 'CREATE' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']' )
            // InternalMyDsl.g:284:3: otherlv_0= 'CREATE' ( (lv_path_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_columns_4_0= RULE_STRING ) )* otherlv_5= ']' otherlv_6= ':' otherlv_7= '[' ( (lv_content_8_0= ruleContent ) )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCREATEKeyword_0());
            		
            // InternalMyDsl.g:288:3: ( (lv_path_1_0= RULE_STRING ) )
            // InternalMyDsl.g:289:4: (lv_path_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:289:4: (lv_path_1_0= RULE_STRING )
            // InternalMyDsl.g:290:5: lv_path_1_0= RULE_STRING
            {
            lv_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_path_1_0, grammarAccess.getCreateAccess().getPathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalMyDsl.g:314:3: ( (lv_columns_4_0= RULE_STRING ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:315:4: (lv_columns_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:315:4: (lv_columns_4_0= RULE_STRING )
            	    // InternalMyDsl.g:316:5: lv_columns_4_0= RULE_STRING
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
            		
            // InternalMyDsl.g:344:3: ( (lv_content_8_0= ruleContent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:345:4: (lv_content_8_0= ruleContent )
            	    {
            	    // InternalMyDsl.g:345:4: (lv_content_8_0= ruleContent )
            	    // InternalMyDsl.g:346:5: lv_content_8_0= ruleContent
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
    // InternalMyDsl.g:371:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalMyDsl.g:371:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalMyDsl.g:372:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalMyDsl.g:378:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:384:2: ( (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:385:2: (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:385:2: (otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:386:3: otherlv_0= 'LOAD' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_path_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLOADKeyword_0());
            		
            // InternalMyDsl.g:390:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:391:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:391:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:392:5: lv_name_1_0= RULE_ID
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
            		
            // InternalMyDsl.g:412:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMyDsl.g:413:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:413:4: (lv_path_3_0= RULE_STRING )
            // InternalMyDsl.g:414:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_3_0, grammarAccess.getLoadAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadRule());
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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRulePrint"
    // InternalMyDsl.g:434:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalMyDsl.g:434:46: (iv_rulePrint= rulePrint EOF )
            // InternalMyDsl.g:435:2: iv_rulePrint= rulePrint EOF
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
    // InternalMyDsl.g:441:1: rulePrint returns [EObject current=null] : (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:447:2: ( (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:448:2: (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:448:2: (otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:449:3: otherlv_0= 'PRINT' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPRINTKeyword_0());
            		
            // InternalMyDsl.g:453:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:454:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:454:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:455:5: lv_name_1_0= RULE_STRING
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
    // InternalMyDsl.g:475:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // InternalMyDsl.g:475:45: (iv_ruleHead= ruleHead EOF )
            // InternalMyDsl.g:476:2: iv_ruleHead= ruleHead EOF
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
    // InternalMyDsl.g:482:1: ruleHead returns [EObject current=null] : (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:488:2: ( (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:489:2: (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:489:2: (otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:490:3: otherlv_0= 'HEAD' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getHeadAccess().getHEADKeyword_0());
            		
            // InternalMyDsl.g:494:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:495:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:495:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:496:5: lv_name_1_0= RULE_ID
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
    // InternalMyDsl.g:516:1: entryRuleInsertColumn returns [EObject current=null] : iv_ruleInsertColumn= ruleInsertColumn EOF ;
    public final EObject entryRuleInsertColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertColumn = null;


        try {
            // InternalMyDsl.g:516:53: (iv_ruleInsertColumn= ruleInsertColumn EOF )
            // InternalMyDsl.g:517:2: iv_ruleInsertColumn= ruleInsertColumn EOF
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
    // InternalMyDsl.g:523:1: ruleInsertColumn returns [EObject current=null] : (otherlv_0= 'INSERT' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_content_5_0= RULE_STRING ) )+ ) ;
    public final EObject ruleInsertColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_column_3_0=null;
        Token otherlv_4=null;
        Token lv_content_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:529:2: ( (otherlv_0= 'INSERT' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_content_5_0= RULE_STRING ) )+ ) )
            // InternalMyDsl.g:530:2: (otherlv_0= 'INSERT' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_content_5_0= RULE_STRING ) )+ )
            {
            // InternalMyDsl.g:530:2: (otherlv_0= 'INSERT' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_content_5_0= RULE_STRING ) )+ )
            // InternalMyDsl.g:531:3: otherlv_0= 'INSERT' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) otherlv_4= ':' ( (lv_content_5_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertColumnAccess().getINSERTKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertColumnAccess().getCOLUMNKeyword_1());
            		
            // InternalMyDsl.g:539:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:540:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:540:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:541:5: lv_name_2_0= RULE_ID
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

            // InternalMyDsl.g:557:3: ( (lv_column_3_0= RULE_STRING ) )
            // InternalMyDsl.g:558:4: (lv_column_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:558:4: (lv_column_3_0= RULE_STRING )
            // InternalMyDsl.g:559:5: lv_column_3_0= RULE_STRING
            {
            lv_column_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertColumnAccess().getColonKeyword_4());
            		
            // InternalMyDsl.g:579:3: ( (lv_content_5_0= RULE_STRING ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:580:4: (lv_content_5_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:580:4: (lv_content_5_0= RULE_STRING )
            	    // InternalMyDsl.g:581:5: lv_content_5_0= RULE_STRING
            	    {
            	    lv_content_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            	    					newLeafNode(lv_content_5_0, grammarAccess.getInsertColumnAccess().getContentSTRINGTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getInsertColumnRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"content",
            	    						lv_content_5_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleInsertColumn"


    // $ANTLR start "entryRuleToCSV"
    // InternalMyDsl.g:601:1: entryRuleToCSV returns [EObject current=null] : iv_ruleToCSV= ruleToCSV EOF ;
    public final EObject entryRuleToCSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToCSV = null;


        try {
            // InternalMyDsl.g:601:46: (iv_ruleToCSV= ruleToCSV EOF )
            // InternalMyDsl.g:602:2: iv_ruleToCSV= ruleToCSV EOF
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
    // InternalMyDsl.g:608:1: ruleToCSV returns [EObject current=null] : (otherlv_0= 'TO' otherlv_1= 'CSV' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleToCSV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:614:2: ( (otherlv_0= 'TO' otherlv_1= 'CSV' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:615:2: (otherlv_0= 'TO' otherlv_1= 'CSV' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:615:2: (otherlv_0= 'TO' otherlv_1= 'CSV' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:616:3: otherlv_0= 'TO' otherlv_1= 'CSV' ( (lv_name_2_0= RULE_ID ) ) ( (lv_path_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getToCSVAccess().getTOKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getToCSVAccess().getCSVKeyword_1());
            		
            // InternalMyDsl.g:624:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:625:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:625:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:626:5: lv_name_2_0= RULE_ID
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

            // InternalMyDsl.g:642:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMyDsl.g:643:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:643:4: (lv_path_3_0= RULE_STRING )
            // InternalMyDsl.g:644:5: lv_path_3_0= RULE_STRING
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


    // $ANTLR start "entryRuleDropColumn"
    // InternalMyDsl.g:664:1: entryRuleDropColumn returns [EObject current=null] : iv_ruleDropColumn= ruleDropColumn EOF ;
    public final EObject entryRuleDropColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropColumn = null;


        try {
            // InternalMyDsl.g:664:51: (iv_ruleDropColumn= ruleDropColumn EOF )
            // InternalMyDsl.g:665:2: iv_ruleDropColumn= ruleDropColumn EOF
            {
             newCompositeNode(grammarAccess.getDropColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropColumn=ruleDropColumn();

            state._fsp--;

             current =iv_ruleDropColumn; 
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
    // $ANTLR end "entryRuleDropColumn"


    // $ANTLR start "ruleDropColumn"
    // InternalMyDsl.g:671:1: ruleDropColumn returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_columns_3_0= RULE_STRING ) )+ ) ;
    public final EObject ruleDropColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_columns_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:677:2: ( (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_columns_3_0= RULE_STRING ) )+ ) )
            // InternalMyDsl.g:678:2: (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_columns_3_0= RULE_STRING ) )+ )
            {
            // InternalMyDsl.g:678:2: (otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_columns_3_0= RULE_STRING ) )+ )
            // InternalMyDsl.g:679:3: otherlv_0= 'DROP' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_columns_3_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDropColumnAccess().getDROPKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDropColumnAccess().getCOLUMNKeyword_1());
            		
            // InternalMyDsl.g:687:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:688:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:688:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:689:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDropColumnAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:705:3: ( (lv_columns_3_0= RULE_STRING ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:706:4: (lv_columns_3_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:706:4: (lv_columns_3_0= RULE_STRING )
            	    // InternalMyDsl.g:707:5: lv_columns_3_0= RULE_STRING
            	    {
            	    lv_columns_3_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            	    					newLeafNode(lv_columns_3_0, grammarAccess.getDropColumnAccess().getColumnsSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDropColumnRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"columns",
            	    						lv_columns_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleDropColumn"


    // $ANTLR start "entryRuleDropRow"
    // InternalMyDsl.g:727:1: entryRuleDropRow returns [EObject current=null] : iv_ruleDropRow= ruleDropRow EOF ;
    public final EObject entryRuleDropRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDropRow = null;


        try {
            // InternalMyDsl.g:727:48: (iv_ruleDropRow= ruleDropRow EOF )
            // InternalMyDsl.g:728:2: iv_ruleDropRow= ruleDropRow EOF
            {
             newCompositeNode(grammarAccess.getDropRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDropRow=ruleDropRow();

            state._fsp--;

             current =iv_ruleDropRow; 
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
    // $ANTLR end "entryRuleDropRow"


    // $ANTLR start "ruleDropRow"
    // InternalMyDsl.g:734:1: ruleDropRow returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_rows_3_0= RULE_STRING ) )+ ) ;
    public final EObject ruleDropRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_rows_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:740:2: ( (otherlv_0= 'DROP' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_rows_3_0= RULE_STRING ) )+ ) )
            // InternalMyDsl.g:741:2: (otherlv_0= 'DROP' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_rows_3_0= RULE_STRING ) )+ )
            {
            // InternalMyDsl.g:741:2: (otherlv_0= 'DROP' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_rows_3_0= RULE_STRING ) )+ )
            // InternalMyDsl.g:742:3: otherlv_0= 'DROP' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_rows_3_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDropRowAccess().getDROPKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDropRowAccess().getROWKeyword_1());
            		
            // InternalMyDsl.g:750:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:751:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:751:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:752:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDropRowAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDropRowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:768:3: ( (lv_rows_3_0= RULE_STRING ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:769:4: (lv_rows_3_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:769:4: (lv_rows_3_0= RULE_STRING )
            	    // InternalMyDsl.g:770:5: lv_rows_3_0= RULE_STRING
            	    {
            	    lv_rows_3_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            	    					newLeafNode(lv_rows_3_0, grammarAccess.getDropRowAccess().getRowsSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDropRowRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"rows",
            	    						lv_rows_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

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
    // $ANTLR end "ruleDropRow"


    // $ANTLR start "entryRuleInsertRow"
    // InternalMyDsl.g:790:1: entryRuleInsertRow returns [EObject current=null] : iv_ruleInsertRow= ruleInsertRow EOF ;
    public final EObject entryRuleInsertRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertRow = null;


        try {
            // InternalMyDsl.g:790:50: (iv_ruleInsertRow= ruleInsertRow EOF )
            // InternalMyDsl.g:791:2: iv_ruleInsertRow= ruleInsertRow EOF
            {
             newCompositeNode(grammarAccess.getInsertRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertRow=ruleInsertRow();

            state._fsp--;

             current =iv_ruleInsertRow; 
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
    // $ANTLR end "entryRuleInsertRow"


    // $ANTLR start "ruleInsertRow"
    // InternalMyDsl.g:797:1: ruleInsertRow returns [EObject current=null] : (otherlv_0= 'INSERT' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_rows_3_0= RULE_STRING ) )+ ) ;
    public final EObject ruleInsertRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_rows_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:803:2: ( (otherlv_0= 'INSERT' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_rows_3_0= RULE_STRING ) )+ ) )
            // InternalMyDsl.g:804:2: (otherlv_0= 'INSERT' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_rows_3_0= RULE_STRING ) )+ )
            {
            // InternalMyDsl.g:804:2: (otherlv_0= 'INSERT' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_rows_3_0= RULE_STRING ) )+ )
            // InternalMyDsl.g:805:3: otherlv_0= 'INSERT' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_rows_3_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertRowAccess().getINSERTKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertRowAccess().getROWKeyword_1());
            		
            // InternalMyDsl.g:813:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:814:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:814:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:815:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInsertRowAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertRowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:831:3: ( (lv_rows_3_0= RULE_STRING ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:832:4: (lv_rows_3_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:832:4: (lv_rows_3_0= RULE_STRING )
            	    // InternalMyDsl.g:833:5: lv_rows_3_0= RULE_STRING
            	    {
            	    lv_rows_3_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            	    					newLeafNode(lv_rows_3_0, grammarAccess.getInsertRowAccess().getRowsSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getInsertRowRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"rows",
            	    						lv_rows_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

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
    // $ANTLR end "ruleInsertRow"


    // $ANTLR start "entryRuleGetColumn"
    // InternalMyDsl.g:853:1: entryRuleGetColumn returns [EObject current=null] : iv_ruleGetColumn= ruleGetColumn EOF ;
    public final EObject entryRuleGetColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetColumn = null;


        try {
            // InternalMyDsl.g:853:50: (iv_ruleGetColumn= ruleGetColumn EOF )
            // InternalMyDsl.g:854:2: iv_ruleGetColumn= ruleGetColumn EOF
            {
             newCompositeNode(grammarAccess.getGetColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetColumn=ruleGetColumn();

            state._fsp--;

             current =iv_ruleGetColumn; 
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
    // $ANTLR end "entryRuleGetColumn"


    // $ANTLR start "ruleGetColumn"
    // InternalMyDsl.g:860:1: ruleGetColumn returns [EObject current=null] : (otherlv_0= 'GET' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleGetColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_column_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:866:2: ( (otherlv_0= 'GET' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:867:2: (otherlv_0= 'GET' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:867:2: (otherlv_0= 'GET' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:868:3: otherlv_0= 'GET' otherlv_1= 'COLUMN' ( (lv_name_2_0= RULE_ID ) ) ( (lv_column_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getGetColumnAccess().getGETKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGetColumnAccess().getCOLUMNKeyword_1());
            		
            // InternalMyDsl.g:876:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:877:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:877:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:878:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGetColumnAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:894:3: ( (lv_column_3_0= RULE_STRING ) )
            // InternalMyDsl.g:895:4: (lv_column_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:895:4: (lv_column_3_0= RULE_STRING )
            // InternalMyDsl.g:896:5: lv_column_3_0= RULE_STRING
            {
            lv_column_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_column_3_0, grammarAccess.getGetColumnAccess().getColumnSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetColumnRule());
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
    // $ANTLR end "ruleGetColumn"


    // $ANTLR start "entryRuleGetRow"
    // InternalMyDsl.g:916:1: entryRuleGetRow returns [EObject current=null] : iv_ruleGetRow= ruleGetRow EOF ;
    public final EObject entryRuleGetRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetRow = null;


        try {
            // InternalMyDsl.g:916:47: (iv_ruleGetRow= ruleGetRow EOF )
            // InternalMyDsl.g:917:2: iv_ruleGetRow= ruleGetRow EOF
            {
             newCompositeNode(grammarAccess.getGetRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetRow=ruleGetRow();

            state._fsp--;

             current =iv_ruleGetRow; 
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
    // $ANTLR end "entryRuleGetRow"


    // $ANTLR start "ruleGetRow"
    // InternalMyDsl.g:923:1: ruleGetRow returns [EObject current=null] : (otherlv_0= 'GET' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_index_3_0= RULE_INT ) ) ) ;
    public final EObject ruleGetRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_index_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:929:2: ( (otherlv_0= 'GET' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_index_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:930:2: (otherlv_0= 'GET' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_index_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:930:2: (otherlv_0= 'GET' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_index_3_0= RULE_INT ) ) )
            // InternalMyDsl.g:931:3: otherlv_0= 'GET' otherlv_1= 'ROW' ( (lv_name_2_0= RULE_ID ) ) ( (lv_index_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getGetRowAccess().getGETKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGetRowAccess().getROWKeyword_1());
            		
            // InternalMyDsl.g:939:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:940:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:940:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:941:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGetRowAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetRowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:957:3: ( (lv_index_3_0= RULE_INT ) )
            // InternalMyDsl.g:958:4: (lv_index_3_0= RULE_INT )
            {
            // InternalMyDsl.g:958:4: (lv_index_3_0= RULE_INT )
            // InternalMyDsl.g:959:5: lv_index_3_0= RULE_INT
            {
            lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_index_3_0, grammarAccess.getGetRowAccess().getIndexINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetRowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_3_0,
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
    // $ANTLR end "ruleGetRow"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\15\4\uffff\1\24\1\uffff\2\24\6\uffff";
    static final String dfa_3s = "\1\31\4\uffff\1\30\1\uffff\2\30\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\2\uffff\1\11\1\5\1\10\1\7\1\13\1\12";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\uffff\1\6\1\uffff\1\7\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\12\3\uffff\1\11",
            "",
            "\1\14\3\uffff\1\13",
            "\1\16\3\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "114:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Print_2= rulePrint | this_Head_3= ruleHead | this_InsertColumn_4= ruleInsertColumn | this_ToCSV_5= ruleToCSV | this_DropColumn_6= ruleDropColumn | this_DropRow_7= ruleDropRow | this_InsertRow_8= ruleInsertRow | this_GetColumn_9= ruleGetColumn | this_GetRow_10= ruleGetRow )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002AEA002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});

}