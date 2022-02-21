package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'CREATE'", "':'", "'LOAD'", "'='", "'PRINT'", "'HEAD'", "'INSERT'", "'COLUMN'", "'TO'", "'CSV'", "'DROP'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__CommandsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__CommandsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__CommandsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__CommandsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__CommandsAssignment )*
            {
             before(grammarAccess.getModelAccess().getCommandsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__CommandsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==15||(LA1_0>=17 && LA1_0<=19)||LA1_0==21||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__CommandsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__CommandsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCommandsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:78:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleCommand EOF )
            // InternalMyDsl.g:80:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDsl.g:87:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Command__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Command__Alternatives )
            // InternalMyDsl.g:94:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleContent"
    // InternalMyDsl.g:103:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleContent EOF )
            // InternalMyDsl.g:105:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalMyDsl.g:112:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Content__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Content__Group__0 )
            // InternalMyDsl.g:119:4: rule__Content__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleCreate"
    // InternalMyDsl.g:128:1: entryRuleCreate : ruleCreate EOF ;
    public final void entryRuleCreate() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleCreate EOF )
            // InternalMyDsl.g:130:1: ruleCreate EOF
            {
             before(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            ruleCreate();

            state._fsp--;

             after(grammarAccess.getCreateRule()); 
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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // InternalMyDsl.g:137:1: ruleCreate : ( ( rule__Create__Group__0 ) ) ;
    public final void ruleCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Create__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Create__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Create__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Create__Group__0 )
            {
             before(grammarAccess.getCreateAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Create__Group__0 )
            // InternalMyDsl.g:144:4: rule__Create__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getGroup()); 

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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleLoad"
    // InternalMyDsl.g:153:1: entryRuleLoad : ruleLoad EOF ;
    public final void entryRuleLoad() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleLoad EOF )
            // InternalMyDsl.g:155:1: ruleLoad EOF
            {
             before(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            ruleLoad();

            state._fsp--;

             after(grammarAccess.getLoadRule()); 
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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalMyDsl.g:162:1: ruleLoad : ( ( rule__Load__Group__0 ) ) ;
    public final void ruleLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Load__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Load__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Load__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Load__Group__0 )
            {
             before(grammarAccess.getLoadAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Load__Group__0 )
            // InternalMyDsl.g:169:4: rule__Load__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getGroup()); 

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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRulePrint"
    // InternalMyDsl.g:178:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( rulePrint EOF )
            // InternalMyDsl.g:180:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
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
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalMyDsl.g:187:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Print__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Print__Group__0 )
            // InternalMyDsl.g:194:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

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
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleHead"
    // InternalMyDsl.g:203:1: entryRuleHead : ruleHead EOF ;
    public final void entryRuleHead() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleHead EOF )
            // InternalMyDsl.g:205:1: ruleHead EOF
            {
             before(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_1);
            ruleHead();

            state._fsp--;

             after(grammarAccess.getHeadRule()); 
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
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // InternalMyDsl.g:212:1: ruleHead : ( ( rule__Head__Group__0 ) ) ;
    public final void ruleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Head__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Head__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Head__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Head__Group__0 )
            {
             before(grammarAccess.getHeadAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Head__Group__0 )
            // InternalMyDsl.g:219:4: rule__Head__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Head__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getGroup()); 

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
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleInsertColumn"
    // InternalMyDsl.g:228:1: entryRuleInsertColumn : ruleInsertColumn EOF ;
    public final void entryRuleInsertColumn() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleInsertColumn EOF )
            // InternalMyDsl.g:230:1: ruleInsertColumn EOF
            {
             before(grammarAccess.getInsertColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertColumn();

            state._fsp--;

             after(grammarAccess.getInsertColumnRule()); 
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
    // $ANTLR end "entryRuleInsertColumn"


    // $ANTLR start "ruleInsertColumn"
    // InternalMyDsl.g:237:1: ruleInsertColumn : ( ( rule__InsertColumn__Group__0 ) ) ;
    public final void ruleInsertColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__InsertColumn__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__InsertColumn__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__InsertColumn__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__InsertColumn__Group__0 )
            {
             before(grammarAccess.getInsertColumnAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__InsertColumn__Group__0 )
            // InternalMyDsl.g:244:4: rule__InsertColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertColumnAccess().getGroup()); 

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
    // $ANTLR end "ruleInsertColumn"


    // $ANTLR start "entryRuleToCSV"
    // InternalMyDsl.g:253:1: entryRuleToCSV : ruleToCSV EOF ;
    public final void entryRuleToCSV() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleToCSV EOF )
            // InternalMyDsl.g:255:1: ruleToCSV EOF
            {
             before(grammarAccess.getToCSVRule()); 
            pushFollow(FOLLOW_1);
            ruleToCSV();

            state._fsp--;

             after(grammarAccess.getToCSVRule()); 
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
    // $ANTLR end "entryRuleToCSV"


    // $ANTLR start "ruleToCSV"
    // InternalMyDsl.g:262:1: ruleToCSV : ( ( rule__ToCSV__Group__0 ) ) ;
    public final void ruleToCSV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__ToCSV__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__ToCSV__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__ToCSV__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__ToCSV__Group__0 )
            {
             before(grammarAccess.getToCSVAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__ToCSV__Group__0 )
            // InternalMyDsl.g:269:4: rule__ToCSV__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ToCSV__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToCSVAccess().getGroup()); 

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
    // $ANTLR end "ruleToCSV"


    // $ANTLR start "entryRuleDropColumn"
    // InternalMyDsl.g:278:1: entryRuleDropColumn : ruleDropColumn EOF ;
    public final void entryRuleDropColumn() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleDropColumn EOF )
            // InternalMyDsl.g:280:1: ruleDropColumn EOF
            {
             before(grammarAccess.getDropColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleDropColumn();

            state._fsp--;

             after(grammarAccess.getDropColumnRule()); 
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
    // $ANTLR end "entryRuleDropColumn"


    // $ANTLR start "ruleDropColumn"
    // InternalMyDsl.g:287:1: ruleDropColumn : ( ( rule__DropColumn__Group__0 ) ) ;
    public final void ruleDropColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__DropColumn__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__DropColumn__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__DropColumn__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__DropColumn__Group__0 )
            {
             before(grammarAccess.getDropColumnAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__DropColumn__Group__0 )
            // InternalMyDsl.g:294:4: rule__DropColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DropColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropColumnAccess().getGroup()); 

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
    // $ANTLR end "ruleDropColumn"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalMyDsl.g:302:1: rule__Command__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) | ( ruleInsertColumn ) | ( ruleToCSV ) | ( ruleDropColumn ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) | ( ruleInsertColumn ) | ( ruleToCSV ) | ( ruleDropColumn ) )
            int alt2=7;
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
            case 23:
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
                    // InternalMyDsl.g:307:2: ( ruleCreate )
                    {
                    // InternalMyDsl.g:307:2: ( ruleCreate )
                    // InternalMyDsl.g:308:3: ruleCreate
                    {
                     before(grammarAccess.getCommandAccess().getCreateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCreate();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCreateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:313:2: ( ruleLoad )
                    {
                    // InternalMyDsl.g:313:2: ( ruleLoad )
                    // InternalMyDsl.g:314:3: ruleLoad
                    {
                     before(grammarAccess.getCommandAccess().getLoadParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLoad();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getLoadParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:319:2: ( rulePrint )
                    {
                    // InternalMyDsl.g:319:2: ( rulePrint )
                    // InternalMyDsl.g:320:3: rulePrint
                    {
                     before(grammarAccess.getCommandAccess().getPrintParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getPrintParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:325:2: ( ruleHead )
                    {
                    // InternalMyDsl.g:325:2: ( ruleHead )
                    // InternalMyDsl.g:326:3: ruleHead
                    {
                     before(grammarAccess.getCommandAccess().getHeadParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleHead();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getHeadParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:331:2: ( ruleInsertColumn )
                    {
                    // InternalMyDsl.g:331:2: ( ruleInsertColumn )
                    // InternalMyDsl.g:332:3: ruleInsertColumn
                    {
                     before(grammarAccess.getCommandAccess().getInsertColumnParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertColumn();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getInsertColumnParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:337:2: ( ruleToCSV )
                    {
                    // InternalMyDsl.g:337:2: ( ruleToCSV )
                    // InternalMyDsl.g:338:3: ruleToCSV
                    {
                     before(grammarAccess.getCommandAccess().getToCSVParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleToCSV();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getToCSVParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:343:2: ( ruleDropColumn )
                    {
                    // InternalMyDsl.g:343:2: ( ruleDropColumn )
                    // InternalMyDsl.g:344:3: ruleDropColumn
                    {
                     before(grammarAccess.getCommandAccess().getDropColumnParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDropColumn();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getDropColumnParserRuleCall_6()); 

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
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__Content__Group__0"
    // InternalMyDsl.g:353:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalMyDsl.g:358:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__1();

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
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // InternalMyDsl.g:365:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:369:1: ( ( () ) )
            // InternalMyDsl.g:370:1: ( () )
            {
            // InternalMyDsl.g:370:1: ( () )
            // InternalMyDsl.g:371:2: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // InternalMyDsl.g:372:2: ()
            // InternalMyDsl.g:372:3: 
            {
            }

             after(grammarAccess.getContentAccess().getContentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // InternalMyDsl.g:380:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:384:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalMyDsl.g:385:2: rule__Content__Group__1__Impl rule__Content__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Content__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__2();

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
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // InternalMyDsl.g:392:1: rule__Content__Group__1__Impl : ( '[' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:396:1: ( ( '[' ) )
            // InternalMyDsl.g:397:1: ( '[' )
            {
            // InternalMyDsl.g:397:1: ( '[' )
            // InternalMyDsl.g:398:2: '['
            {
             before(grammarAccess.getContentAccess().getLeftSquareBracketKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__Content__Group__2"
    // InternalMyDsl.g:407:1: rule__Content__Group__2 : rule__Content__Group__2__Impl rule__Content__Group__3 ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:411:1: ( rule__Content__Group__2__Impl rule__Content__Group__3 )
            // InternalMyDsl.g:412:2: rule__Content__Group__2__Impl rule__Content__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Content__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Content__Group__3();

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
    // $ANTLR end "rule__Content__Group__2"


    // $ANTLR start "rule__Content__Group__2__Impl"
    // InternalMyDsl.g:419:1: rule__Content__Group__2__Impl : ( ( rule__Content__FieldsAssignment_2 )* ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( ( ( rule__Content__FieldsAssignment_2 )* ) )
            // InternalMyDsl.g:424:1: ( ( rule__Content__FieldsAssignment_2 )* )
            {
            // InternalMyDsl.g:424:1: ( ( rule__Content__FieldsAssignment_2 )* )
            // InternalMyDsl.g:425:2: ( rule__Content__FieldsAssignment_2 )*
            {
             before(grammarAccess.getContentAccess().getFieldsAssignment_2()); 
            // InternalMyDsl.g:426:2: ( rule__Content__FieldsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:426:3: rule__Content__FieldsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Content__FieldsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getContentAccess().getFieldsAssignment_2()); 

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
    // $ANTLR end "rule__Content__Group__2__Impl"


    // $ANTLR start "rule__Content__Group__3"
    // InternalMyDsl.g:434:1: rule__Content__Group__3 : rule__Content__Group__3__Impl ;
    public final void rule__Content__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( rule__Content__Group__3__Impl )
            // InternalMyDsl.g:439:2: rule__Content__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Content__Group__3__Impl();

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
    // $ANTLR end "rule__Content__Group__3"


    // $ANTLR start "rule__Content__Group__3__Impl"
    // InternalMyDsl.g:445:1: rule__Content__Group__3__Impl : ( ']' ) ;
    public final void rule__Content__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( ( ']' ) )
            // InternalMyDsl.g:450:1: ( ']' )
            {
            // InternalMyDsl.g:450:1: ( ']' )
            // InternalMyDsl.g:451:2: ']'
            {
             before(grammarAccess.getContentAccess().getRightSquareBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Content__Group__3__Impl"


    // $ANTLR start "rule__Create__Group__0"
    // InternalMyDsl.g:461:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:465:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalMyDsl.g:466:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Create__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__1();

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
    // $ANTLR end "rule__Create__Group__0"


    // $ANTLR start "rule__Create__Group__0__Impl"
    // InternalMyDsl.g:473:1: rule__Create__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:477:1: ( ( 'CREATE' ) )
            // InternalMyDsl.g:478:1: ( 'CREATE' )
            {
            // InternalMyDsl.g:478:1: ( 'CREATE' )
            // InternalMyDsl.g:479:2: 'CREATE'
            {
             before(grammarAccess.getCreateAccess().getCREATEKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getCREATEKeyword_0()); 

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
    // $ANTLR end "rule__Create__Group__0__Impl"


    // $ANTLR start "rule__Create__Group__1"
    // InternalMyDsl.g:488:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalMyDsl.g:493:2: rule__Create__Group__1__Impl rule__Create__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Create__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__2();

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
    // $ANTLR end "rule__Create__Group__1"


    // $ANTLR start "rule__Create__Group__1__Impl"
    // InternalMyDsl.g:500:1: rule__Create__Group__1__Impl : ( ( rule__Create__PathAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:504:1: ( ( ( rule__Create__PathAssignment_1 ) ) )
            // InternalMyDsl.g:505:1: ( ( rule__Create__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:505:1: ( ( rule__Create__PathAssignment_1 ) )
            // InternalMyDsl.g:506:2: ( rule__Create__PathAssignment_1 )
            {
             before(grammarAccess.getCreateAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:507:2: ( rule__Create__PathAssignment_1 )
            // InternalMyDsl.g:507:3: rule__Create__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Create__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getPathAssignment_1()); 

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
    // $ANTLR end "rule__Create__Group__1__Impl"


    // $ANTLR start "rule__Create__Group__2"
    // InternalMyDsl.g:515:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:519:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalMyDsl.g:520:2: rule__Create__Group__2__Impl rule__Create__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Create__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__3();

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
    // $ANTLR end "rule__Create__Group__2"


    // $ANTLR start "rule__Create__Group__2__Impl"
    // InternalMyDsl.g:527:1: rule__Create__Group__2__Impl : ( ':' ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:531:1: ( ( ':' ) )
            // InternalMyDsl.g:532:1: ( ':' )
            {
            // InternalMyDsl.g:532:1: ( ':' )
            // InternalMyDsl.g:533:2: ':'
            {
             before(grammarAccess.getCreateAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Create__Group__2__Impl"


    // $ANTLR start "rule__Create__Group__3"
    // InternalMyDsl.g:542:1: rule__Create__Group__3 : rule__Create__Group__3__Impl rule__Create__Group__4 ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( rule__Create__Group__3__Impl rule__Create__Group__4 )
            // InternalMyDsl.g:547:2: rule__Create__Group__3__Impl rule__Create__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Create__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__4();

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
    // $ANTLR end "rule__Create__Group__3"


    // $ANTLR start "rule__Create__Group__3__Impl"
    // InternalMyDsl.g:554:1: rule__Create__Group__3__Impl : ( '[' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:1: ( ( '[' ) )
            // InternalMyDsl.g:559:1: ( '[' )
            {
            // InternalMyDsl.g:559:1: ( '[' )
            // InternalMyDsl.g:560:2: '['
            {
             before(grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_3()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Create__Group__3__Impl"


    // $ANTLR start "rule__Create__Group__4"
    // InternalMyDsl.g:569:1: rule__Create__Group__4 : rule__Create__Group__4__Impl rule__Create__Group__5 ;
    public final void rule__Create__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:573:1: ( rule__Create__Group__4__Impl rule__Create__Group__5 )
            // InternalMyDsl.g:574:2: rule__Create__Group__4__Impl rule__Create__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Create__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__5();

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
    // $ANTLR end "rule__Create__Group__4"


    // $ANTLR start "rule__Create__Group__4__Impl"
    // InternalMyDsl.g:581:1: rule__Create__Group__4__Impl : ( ( rule__Create__ColumnsAssignment_4 )* ) ;
    public final void rule__Create__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:585:1: ( ( ( rule__Create__ColumnsAssignment_4 )* ) )
            // InternalMyDsl.g:586:1: ( ( rule__Create__ColumnsAssignment_4 )* )
            {
            // InternalMyDsl.g:586:1: ( ( rule__Create__ColumnsAssignment_4 )* )
            // InternalMyDsl.g:587:2: ( rule__Create__ColumnsAssignment_4 )*
            {
             before(grammarAccess.getCreateAccess().getColumnsAssignment_4()); 
            // InternalMyDsl.g:588:2: ( rule__Create__ColumnsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:588:3: rule__Create__ColumnsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Create__ColumnsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCreateAccess().getColumnsAssignment_4()); 

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
    // $ANTLR end "rule__Create__Group__4__Impl"


    // $ANTLR start "rule__Create__Group__5"
    // InternalMyDsl.g:596:1: rule__Create__Group__5 : rule__Create__Group__5__Impl rule__Create__Group__6 ;
    public final void rule__Create__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:600:1: ( rule__Create__Group__5__Impl rule__Create__Group__6 )
            // InternalMyDsl.g:601:2: rule__Create__Group__5__Impl rule__Create__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Create__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__6();

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
    // $ANTLR end "rule__Create__Group__5"


    // $ANTLR start "rule__Create__Group__5__Impl"
    // InternalMyDsl.g:608:1: rule__Create__Group__5__Impl : ( ']' ) ;
    public final void rule__Create__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( ( ']' ) )
            // InternalMyDsl.g:613:1: ( ']' )
            {
            // InternalMyDsl.g:613:1: ( ']' )
            // InternalMyDsl.g:614:2: ']'
            {
             before(grammarAccess.getCreateAccess().getRightSquareBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Create__Group__5__Impl"


    // $ANTLR start "rule__Create__Group__6"
    // InternalMyDsl.g:623:1: rule__Create__Group__6 : rule__Create__Group__6__Impl rule__Create__Group__7 ;
    public final void rule__Create__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:627:1: ( rule__Create__Group__6__Impl rule__Create__Group__7 )
            // InternalMyDsl.g:628:2: rule__Create__Group__6__Impl rule__Create__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Create__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__7();

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
    // $ANTLR end "rule__Create__Group__6"


    // $ANTLR start "rule__Create__Group__6__Impl"
    // InternalMyDsl.g:635:1: rule__Create__Group__6__Impl : ( ':' ) ;
    public final void rule__Create__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:639:1: ( ( ':' ) )
            // InternalMyDsl.g:640:1: ( ':' )
            {
            // InternalMyDsl.g:640:1: ( ':' )
            // InternalMyDsl.g:641:2: ':'
            {
             before(grammarAccess.getCreateAccess().getColonKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getColonKeyword_6()); 

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
    // $ANTLR end "rule__Create__Group__6__Impl"


    // $ANTLR start "rule__Create__Group__7"
    // InternalMyDsl.g:650:1: rule__Create__Group__7 : rule__Create__Group__7__Impl rule__Create__Group__8 ;
    public final void rule__Create__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:654:1: ( rule__Create__Group__7__Impl rule__Create__Group__8 )
            // InternalMyDsl.g:655:2: rule__Create__Group__7__Impl rule__Create__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Create__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__8();

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
    // $ANTLR end "rule__Create__Group__7"


    // $ANTLR start "rule__Create__Group__7__Impl"
    // InternalMyDsl.g:662:1: rule__Create__Group__7__Impl : ( '[' ) ;
    public final void rule__Create__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( ( '[' ) )
            // InternalMyDsl.g:667:1: ( '[' )
            {
            // InternalMyDsl.g:667:1: ( '[' )
            // InternalMyDsl.g:668:2: '['
            {
             before(grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__Create__Group__7__Impl"


    // $ANTLR start "rule__Create__Group__8"
    // InternalMyDsl.g:677:1: rule__Create__Group__8 : rule__Create__Group__8__Impl rule__Create__Group__9 ;
    public final void rule__Create__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( rule__Create__Group__8__Impl rule__Create__Group__9 )
            // InternalMyDsl.g:682:2: rule__Create__Group__8__Impl rule__Create__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Create__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__9();

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
    // $ANTLR end "rule__Create__Group__8"


    // $ANTLR start "rule__Create__Group__8__Impl"
    // InternalMyDsl.g:689:1: rule__Create__Group__8__Impl : ( ( rule__Create__ContentAssignment_8 )* ) ;
    public final void rule__Create__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:693:1: ( ( ( rule__Create__ContentAssignment_8 )* ) )
            // InternalMyDsl.g:694:1: ( ( rule__Create__ContentAssignment_8 )* )
            {
            // InternalMyDsl.g:694:1: ( ( rule__Create__ContentAssignment_8 )* )
            // InternalMyDsl.g:695:2: ( rule__Create__ContentAssignment_8 )*
            {
             before(grammarAccess.getCreateAccess().getContentAssignment_8()); 
            // InternalMyDsl.g:696:2: ( rule__Create__ContentAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:696:3: rule__Create__ContentAssignment_8
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Create__ContentAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCreateAccess().getContentAssignment_8()); 

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
    // $ANTLR end "rule__Create__Group__8__Impl"


    // $ANTLR start "rule__Create__Group__9"
    // InternalMyDsl.g:704:1: rule__Create__Group__9 : rule__Create__Group__9__Impl ;
    public final void rule__Create__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:708:1: ( rule__Create__Group__9__Impl )
            // InternalMyDsl.g:709:2: rule__Create__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__9__Impl();

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
    // $ANTLR end "rule__Create__Group__9"


    // $ANTLR start "rule__Create__Group__9__Impl"
    // InternalMyDsl.g:715:1: rule__Create__Group__9__Impl : ( ']' ) ;
    public final void rule__Create__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( ']' ) )
            // InternalMyDsl.g:720:1: ( ']' )
            {
            // InternalMyDsl.g:720:1: ( ']' )
            // InternalMyDsl.g:721:2: ']'
            {
             before(grammarAccess.getCreateAccess().getRightSquareBracketKeyword_9()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getRightSquareBracketKeyword_9()); 

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
    // $ANTLR end "rule__Create__Group__9__Impl"


    // $ANTLR start "rule__Load__Group__0"
    // InternalMyDsl.g:731:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:735:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalMyDsl.g:736:2: rule__Load__Group__0__Impl rule__Load__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Load__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__1();

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
    // $ANTLR end "rule__Load__Group__0"


    // $ANTLR start "rule__Load__Group__0__Impl"
    // InternalMyDsl.g:743:1: rule__Load__Group__0__Impl : ( 'LOAD' ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:747:1: ( ( 'LOAD' ) )
            // InternalMyDsl.g:748:1: ( 'LOAD' )
            {
            // InternalMyDsl.g:748:1: ( 'LOAD' )
            // InternalMyDsl.g:749:2: 'LOAD'
            {
             before(grammarAccess.getLoadAccess().getLOADKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getLOADKeyword_0()); 

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
    // $ANTLR end "rule__Load__Group__0__Impl"


    // $ANTLR start "rule__Load__Group__1"
    // InternalMyDsl.g:758:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:762:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalMyDsl.g:763:2: rule__Load__Group__1__Impl rule__Load__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Load__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__2();

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
    // $ANTLR end "rule__Load__Group__1"


    // $ANTLR start "rule__Load__Group__1__Impl"
    // InternalMyDsl.g:770:1: rule__Load__Group__1__Impl : ( ( rule__Load__NameAssignment_1 ) ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:774:1: ( ( ( rule__Load__NameAssignment_1 ) ) )
            // InternalMyDsl.g:775:1: ( ( rule__Load__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:775:1: ( ( rule__Load__NameAssignment_1 ) )
            // InternalMyDsl.g:776:2: ( rule__Load__NameAssignment_1 )
            {
             before(grammarAccess.getLoadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:777:2: ( rule__Load__NameAssignment_1 )
            // InternalMyDsl.g:777:3: rule__Load__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Load__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Load__Group__1__Impl"


    // $ANTLR start "rule__Load__Group__2"
    // InternalMyDsl.g:785:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:789:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalMyDsl.g:790:2: rule__Load__Group__2__Impl rule__Load__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Load__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__3();

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
    // $ANTLR end "rule__Load__Group__2"


    // $ANTLR start "rule__Load__Group__2__Impl"
    // InternalMyDsl.g:797:1: rule__Load__Group__2__Impl : ( '=' ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( ( '=' ) )
            // InternalMyDsl.g:802:1: ( '=' )
            {
            // InternalMyDsl.g:802:1: ( '=' )
            // InternalMyDsl.g:803:2: '='
            {
             before(grammarAccess.getLoadAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Load__Group__2__Impl"


    // $ANTLR start "rule__Load__Group__3"
    // InternalMyDsl.g:812:1: rule__Load__Group__3 : rule__Load__Group__3__Impl ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:1: ( rule__Load__Group__3__Impl )
            // InternalMyDsl.g:817:2: rule__Load__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__3__Impl();

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
    // $ANTLR end "rule__Load__Group__3"


    // $ANTLR start "rule__Load__Group__3__Impl"
    // InternalMyDsl.g:823:1: rule__Load__Group__3__Impl : ( ( rule__Load__PathAssignment_3 ) ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( ( rule__Load__PathAssignment_3 ) ) )
            // InternalMyDsl.g:828:1: ( ( rule__Load__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:828:1: ( ( rule__Load__PathAssignment_3 ) )
            // InternalMyDsl.g:829:2: ( rule__Load__PathAssignment_3 )
            {
             before(grammarAccess.getLoadAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:830:2: ( rule__Load__PathAssignment_3 )
            // InternalMyDsl.g:830:3: rule__Load__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Load__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getPathAssignment_3()); 

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
    // $ANTLR end "rule__Load__Group__3__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalMyDsl.g:839:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:843:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalMyDsl.g:844:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

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
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalMyDsl.g:851:1: rule__Print__Group__0__Impl : ( 'PRINT' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:1: ( ( 'PRINT' ) )
            // InternalMyDsl.g:856:1: ( 'PRINT' )
            {
            // InternalMyDsl.g:856:1: ( 'PRINT' )
            // InternalMyDsl.g:857:2: 'PRINT'
            {
             before(grammarAccess.getPrintAccess().getPRINTKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getPRINTKeyword_0()); 

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
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalMyDsl.g:866:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:870:1: ( rule__Print__Group__1__Impl )
            // InternalMyDsl.g:871:2: rule__Print__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__1__Impl();

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
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalMyDsl.g:877:1: rule__Print__Group__1__Impl : ( ( rule__Print__NameAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( ( ( rule__Print__NameAssignment_1 ) ) )
            // InternalMyDsl.g:882:1: ( ( rule__Print__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:882:1: ( ( rule__Print__NameAssignment_1 ) )
            // InternalMyDsl.g:883:2: ( rule__Print__NameAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:884:2: ( rule__Print__NameAssignment_1 )
            // InternalMyDsl.g:884:3: rule__Print__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Print__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Head__Group__0"
    // InternalMyDsl.g:893:1: rule__Head__Group__0 : rule__Head__Group__0__Impl rule__Head__Group__1 ;
    public final void rule__Head__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:897:1: ( rule__Head__Group__0__Impl rule__Head__Group__1 )
            // InternalMyDsl.g:898:2: rule__Head__Group__0__Impl rule__Head__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Head__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Head__Group__1();

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
    // $ANTLR end "rule__Head__Group__0"


    // $ANTLR start "rule__Head__Group__0__Impl"
    // InternalMyDsl.g:905:1: rule__Head__Group__0__Impl : ( 'HEAD' ) ;
    public final void rule__Head__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( ( 'HEAD' ) )
            // InternalMyDsl.g:910:1: ( 'HEAD' )
            {
            // InternalMyDsl.g:910:1: ( 'HEAD' )
            // InternalMyDsl.g:911:2: 'HEAD'
            {
             before(grammarAccess.getHeadAccess().getHEADKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHeadAccess().getHEADKeyword_0()); 

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
    // $ANTLR end "rule__Head__Group__0__Impl"


    // $ANTLR start "rule__Head__Group__1"
    // InternalMyDsl.g:920:1: rule__Head__Group__1 : rule__Head__Group__1__Impl ;
    public final void rule__Head__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:924:1: ( rule__Head__Group__1__Impl )
            // InternalMyDsl.g:925:2: rule__Head__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Head__Group__1__Impl();

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
    // $ANTLR end "rule__Head__Group__1"


    // $ANTLR start "rule__Head__Group__1__Impl"
    // InternalMyDsl.g:931:1: rule__Head__Group__1__Impl : ( ( rule__Head__NameAssignment_1 ) ) ;
    public final void rule__Head__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( ( ( rule__Head__NameAssignment_1 ) ) )
            // InternalMyDsl.g:936:1: ( ( rule__Head__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:936:1: ( ( rule__Head__NameAssignment_1 ) )
            // InternalMyDsl.g:937:2: ( rule__Head__NameAssignment_1 )
            {
             before(grammarAccess.getHeadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:938:2: ( rule__Head__NameAssignment_1 )
            // InternalMyDsl.g:938:3: rule__Head__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Head__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeadAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Head__Group__1__Impl"


    // $ANTLR start "rule__InsertColumn__Group__0"
    // InternalMyDsl.g:947:1: rule__InsertColumn__Group__0 : rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1 ;
    public final void rule__InsertColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1 )
            // InternalMyDsl.g:952:2: rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__InsertColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertColumn__Group__1();

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
    // $ANTLR end "rule__InsertColumn__Group__0"


    // $ANTLR start "rule__InsertColumn__Group__0__Impl"
    // InternalMyDsl.g:959:1: rule__InsertColumn__Group__0__Impl : ( 'INSERT' ) ;
    public final void rule__InsertColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:963:1: ( ( 'INSERT' ) )
            // InternalMyDsl.g:964:1: ( 'INSERT' )
            {
            // InternalMyDsl.g:964:1: ( 'INSERT' )
            // InternalMyDsl.g:965:2: 'INSERT'
            {
             before(grammarAccess.getInsertColumnAccess().getINSERTKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInsertColumnAccess().getINSERTKeyword_0()); 

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
    // $ANTLR end "rule__InsertColumn__Group__0__Impl"


    // $ANTLR start "rule__InsertColumn__Group__1"
    // InternalMyDsl.g:974:1: rule__InsertColumn__Group__1 : rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2 ;
    public final void rule__InsertColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:978:1: ( rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2 )
            // InternalMyDsl.g:979:2: rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__InsertColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertColumn__Group__2();

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
    // $ANTLR end "rule__InsertColumn__Group__1"


    // $ANTLR start "rule__InsertColumn__Group__1__Impl"
    // InternalMyDsl.g:986:1: rule__InsertColumn__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__InsertColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( ( 'COLUMN' ) )
            // InternalMyDsl.g:991:1: ( 'COLUMN' )
            {
            // InternalMyDsl.g:991:1: ( 'COLUMN' )
            // InternalMyDsl.g:992:2: 'COLUMN'
            {
             before(grammarAccess.getInsertColumnAccess().getCOLUMNKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInsertColumnAccess().getCOLUMNKeyword_1()); 

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
    // $ANTLR end "rule__InsertColumn__Group__1__Impl"


    // $ANTLR start "rule__InsertColumn__Group__2"
    // InternalMyDsl.g:1001:1: rule__InsertColumn__Group__2 : rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3 ;
    public final void rule__InsertColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1005:1: ( rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3 )
            // InternalMyDsl.g:1006:2: rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__InsertColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertColumn__Group__3();

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
    // $ANTLR end "rule__InsertColumn__Group__2"


    // $ANTLR start "rule__InsertColumn__Group__2__Impl"
    // InternalMyDsl.g:1013:1: rule__InsertColumn__Group__2__Impl : ( ( rule__InsertColumn__NameAssignment_2 ) ) ;
    public final void rule__InsertColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( ( ( rule__InsertColumn__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1018:1: ( ( rule__InsertColumn__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1018:1: ( ( rule__InsertColumn__NameAssignment_2 ) )
            // InternalMyDsl.g:1019:2: ( rule__InsertColumn__NameAssignment_2 )
            {
             before(grammarAccess.getInsertColumnAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1020:2: ( rule__InsertColumn__NameAssignment_2 )
            // InternalMyDsl.g:1020:3: rule__InsertColumn__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InsertColumn__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInsertColumnAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__InsertColumn__Group__2__Impl"


    // $ANTLR start "rule__InsertColumn__Group__3"
    // InternalMyDsl.g:1028:1: rule__InsertColumn__Group__3 : rule__InsertColumn__Group__3__Impl ;
    public final void rule__InsertColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1032:1: ( rule__InsertColumn__Group__3__Impl )
            // InternalMyDsl.g:1033:2: rule__InsertColumn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertColumn__Group__3__Impl();

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
    // $ANTLR end "rule__InsertColumn__Group__3"


    // $ANTLR start "rule__InsertColumn__Group__3__Impl"
    // InternalMyDsl.g:1039:1: rule__InsertColumn__Group__3__Impl : ( ( rule__InsertColumn__ColumnAssignment_3 ) ) ;
    public final void rule__InsertColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( ( ( rule__InsertColumn__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:1044:1: ( ( rule__InsertColumn__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:1044:1: ( ( rule__InsertColumn__ColumnAssignment_3 ) )
            // InternalMyDsl.g:1045:2: ( rule__InsertColumn__ColumnAssignment_3 )
            {
             before(grammarAccess.getInsertColumnAccess().getColumnAssignment_3()); 
            // InternalMyDsl.g:1046:2: ( rule__InsertColumn__ColumnAssignment_3 )
            // InternalMyDsl.g:1046:3: rule__InsertColumn__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InsertColumn__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertColumnAccess().getColumnAssignment_3()); 

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
    // $ANTLR end "rule__InsertColumn__Group__3__Impl"


    // $ANTLR start "rule__ToCSV__Group__0"
    // InternalMyDsl.g:1055:1: rule__ToCSV__Group__0 : rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 ;
    public final void rule__ToCSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1059:1: ( rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 )
            // InternalMyDsl.g:1060:2: rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ToCSV__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToCSV__Group__1();

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
    // $ANTLR end "rule__ToCSV__Group__0"


    // $ANTLR start "rule__ToCSV__Group__0__Impl"
    // InternalMyDsl.g:1067:1: rule__ToCSV__Group__0__Impl : ( 'TO' ) ;
    public final void rule__ToCSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( ( 'TO' ) )
            // InternalMyDsl.g:1072:1: ( 'TO' )
            {
            // InternalMyDsl.g:1072:1: ( 'TO' )
            // InternalMyDsl.g:1073:2: 'TO'
            {
             before(grammarAccess.getToCSVAccess().getTOKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getToCSVAccess().getTOKeyword_0()); 

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
    // $ANTLR end "rule__ToCSV__Group__0__Impl"


    // $ANTLR start "rule__ToCSV__Group__1"
    // InternalMyDsl.g:1082:1: rule__ToCSV__Group__1 : rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 ;
    public final void rule__ToCSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1086:1: ( rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 )
            // InternalMyDsl.g:1087:2: rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ToCSV__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToCSV__Group__2();

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
    // $ANTLR end "rule__ToCSV__Group__1"


    // $ANTLR start "rule__ToCSV__Group__1__Impl"
    // InternalMyDsl.g:1094:1: rule__ToCSV__Group__1__Impl : ( 'CSV' ) ;
    public final void rule__ToCSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1098:1: ( ( 'CSV' ) )
            // InternalMyDsl.g:1099:1: ( 'CSV' )
            {
            // InternalMyDsl.g:1099:1: ( 'CSV' )
            // InternalMyDsl.g:1100:2: 'CSV'
            {
             before(grammarAccess.getToCSVAccess().getCSVKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getToCSVAccess().getCSVKeyword_1()); 

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
    // $ANTLR end "rule__ToCSV__Group__1__Impl"


    // $ANTLR start "rule__ToCSV__Group__2"
    // InternalMyDsl.g:1109:1: rule__ToCSV__Group__2 : rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3 ;
    public final void rule__ToCSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1113:1: ( rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3 )
            // InternalMyDsl.g:1114:2: rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ToCSV__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ToCSV__Group__3();

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
    // $ANTLR end "rule__ToCSV__Group__2"


    // $ANTLR start "rule__ToCSV__Group__2__Impl"
    // InternalMyDsl.g:1121:1: rule__ToCSV__Group__2__Impl : ( ( rule__ToCSV__NameAssignment_2 ) ) ;
    public final void rule__ToCSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( ( ( rule__ToCSV__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1126:1: ( ( rule__ToCSV__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1126:1: ( ( rule__ToCSV__NameAssignment_2 ) )
            // InternalMyDsl.g:1127:2: ( rule__ToCSV__NameAssignment_2 )
            {
             before(grammarAccess.getToCSVAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1128:2: ( rule__ToCSV__NameAssignment_2 )
            // InternalMyDsl.g:1128:3: rule__ToCSV__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ToCSV__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getToCSVAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ToCSV__Group__2__Impl"


    // $ANTLR start "rule__ToCSV__Group__3"
    // InternalMyDsl.g:1136:1: rule__ToCSV__Group__3 : rule__ToCSV__Group__3__Impl ;
    public final void rule__ToCSV__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1140:1: ( rule__ToCSV__Group__3__Impl )
            // InternalMyDsl.g:1141:2: rule__ToCSV__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ToCSV__Group__3__Impl();

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
    // $ANTLR end "rule__ToCSV__Group__3"


    // $ANTLR start "rule__ToCSV__Group__3__Impl"
    // InternalMyDsl.g:1147:1: rule__ToCSV__Group__3__Impl : ( ( rule__ToCSV__PathAssignment_3 ) ) ;
    public final void rule__ToCSV__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( ( ( rule__ToCSV__PathAssignment_3 ) ) )
            // InternalMyDsl.g:1152:1: ( ( rule__ToCSV__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:1152:1: ( ( rule__ToCSV__PathAssignment_3 ) )
            // InternalMyDsl.g:1153:2: ( rule__ToCSV__PathAssignment_3 )
            {
             before(grammarAccess.getToCSVAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:1154:2: ( rule__ToCSV__PathAssignment_3 )
            // InternalMyDsl.g:1154:3: rule__ToCSV__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ToCSV__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getToCSVAccess().getPathAssignment_3()); 

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
    // $ANTLR end "rule__ToCSV__Group__3__Impl"


    // $ANTLR start "rule__DropColumn__Group__0"
    // InternalMyDsl.g:1163:1: rule__DropColumn__Group__0 : rule__DropColumn__Group__0__Impl rule__DropColumn__Group__1 ;
    public final void rule__DropColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1167:1: ( rule__DropColumn__Group__0__Impl rule__DropColumn__Group__1 )
            // InternalMyDsl.g:1168:2: rule__DropColumn__Group__0__Impl rule__DropColumn__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DropColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropColumn__Group__1();

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
    // $ANTLR end "rule__DropColumn__Group__0"


    // $ANTLR start "rule__DropColumn__Group__0__Impl"
    // InternalMyDsl.g:1175:1: rule__DropColumn__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__DropColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( ( 'DROP' ) )
            // InternalMyDsl.g:1180:1: ( 'DROP' )
            {
            // InternalMyDsl.g:1180:1: ( 'DROP' )
            // InternalMyDsl.g:1181:2: 'DROP'
            {
             before(grammarAccess.getDropColumnAccess().getDROPKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDropColumnAccess().getDROPKeyword_0()); 

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
    // $ANTLR end "rule__DropColumn__Group__0__Impl"


    // $ANTLR start "rule__DropColumn__Group__1"
    // InternalMyDsl.g:1190:1: rule__DropColumn__Group__1 : rule__DropColumn__Group__1__Impl rule__DropColumn__Group__2 ;
    public final void rule__DropColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1194:1: ( rule__DropColumn__Group__1__Impl rule__DropColumn__Group__2 )
            // InternalMyDsl.g:1195:2: rule__DropColumn__Group__1__Impl rule__DropColumn__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DropColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropColumn__Group__2();

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
    // $ANTLR end "rule__DropColumn__Group__1"


    // $ANTLR start "rule__DropColumn__Group__1__Impl"
    // InternalMyDsl.g:1202:1: rule__DropColumn__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__DropColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( ( 'COLUMN' ) )
            // InternalMyDsl.g:1207:1: ( 'COLUMN' )
            {
            // InternalMyDsl.g:1207:1: ( 'COLUMN' )
            // InternalMyDsl.g:1208:2: 'COLUMN'
            {
             before(grammarAccess.getDropColumnAccess().getCOLUMNKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDropColumnAccess().getCOLUMNKeyword_1()); 

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
    // $ANTLR end "rule__DropColumn__Group__1__Impl"


    // $ANTLR start "rule__DropColumn__Group__2"
    // InternalMyDsl.g:1217:1: rule__DropColumn__Group__2 : rule__DropColumn__Group__2__Impl rule__DropColumn__Group__3 ;
    public final void rule__DropColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1221:1: ( rule__DropColumn__Group__2__Impl rule__DropColumn__Group__3 )
            // InternalMyDsl.g:1222:2: rule__DropColumn__Group__2__Impl rule__DropColumn__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__DropColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropColumn__Group__3();

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
    // $ANTLR end "rule__DropColumn__Group__2"


    // $ANTLR start "rule__DropColumn__Group__2__Impl"
    // InternalMyDsl.g:1229:1: rule__DropColumn__Group__2__Impl : ( ( rule__DropColumn__NameAssignment_2 ) ) ;
    public final void rule__DropColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( ( ( rule__DropColumn__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1234:1: ( ( rule__DropColumn__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1234:1: ( ( rule__DropColumn__NameAssignment_2 ) )
            // InternalMyDsl.g:1235:2: ( rule__DropColumn__NameAssignment_2 )
            {
             before(grammarAccess.getDropColumnAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1236:2: ( rule__DropColumn__NameAssignment_2 )
            // InternalMyDsl.g:1236:3: rule__DropColumn__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DropColumn__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDropColumnAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DropColumn__Group__2__Impl"


    // $ANTLR start "rule__DropColumn__Group__3"
    // InternalMyDsl.g:1244:1: rule__DropColumn__Group__3 : rule__DropColumn__Group__3__Impl ;
    public final void rule__DropColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1248:1: ( rule__DropColumn__Group__3__Impl )
            // InternalMyDsl.g:1249:2: rule__DropColumn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropColumn__Group__3__Impl();

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
    // $ANTLR end "rule__DropColumn__Group__3"


    // $ANTLR start "rule__DropColumn__Group__3__Impl"
    // InternalMyDsl.g:1255:1: rule__DropColumn__Group__3__Impl : ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) ) ;
    public final void rule__DropColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) ) )
            // InternalMyDsl.g:1260:1: ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) )
            {
            // InternalMyDsl.g:1260:1: ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) )
            // InternalMyDsl.g:1261:2: ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* )
            {
            // InternalMyDsl.g:1261:2: ( ( rule__DropColumn__ColumnsAssignment_3 ) )
            // InternalMyDsl.g:1262:3: ( rule__DropColumn__ColumnsAssignment_3 )
            {
             before(grammarAccess.getDropColumnAccess().getColumnsAssignment_3()); 
            // InternalMyDsl.g:1263:3: ( rule__DropColumn__ColumnsAssignment_3 )
            // InternalMyDsl.g:1263:4: rule__DropColumn__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__DropColumn__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDropColumnAccess().getColumnsAssignment_3()); 

            }

            // InternalMyDsl.g:1266:2: ( ( rule__DropColumn__ColumnsAssignment_3 )* )
            // InternalMyDsl.g:1267:3: ( rule__DropColumn__ColumnsAssignment_3 )*
            {
             before(grammarAccess.getDropColumnAccess().getColumnsAssignment_3()); 
            // InternalMyDsl.g:1268:3: ( rule__DropColumn__ColumnsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1268:4: rule__DropColumn__ColumnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DropColumn__ColumnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDropColumnAccess().getColumnsAssignment_3()); 

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
    // $ANTLR end "rule__DropColumn__Group__3__Impl"


    // $ANTLR start "rule__Model__CommandsAssignment"
    // InternalMyDsl.g:1278:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:1283:2: ( ruleCommand )
            {
            // InternalMyDsl.g:1283:2: ( ruleCommand )
            // InternalMyDsl.g:1284:3: ruleCommand
            {
             before(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__CommandsAssignment"


    // $ANTLR start "rule__Content__FieldsAssignment_2"
    // InternalMyDsl.g:1293:1: rule__Content__FieldsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Content__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1298:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1298:2: ( RULE_STRING )
            // InternalMyDsl.g:1299:3: RULE_STRING
            {
             before(grammarAccess.getContentAccess().getFieldsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getContentAccess().getFieldsSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Content__FieldsAssignment_2"


    // $ANTLR start "rule__Create__PathAssignment_1"
    // InternalMyDsl.g:1308:1: rule__Create__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Create__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1313:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1313:2: ( RULE_STRING )
            // InternalMyDsl.g:1314:3: RULE_STRING
            {
             before(grammarAccess.getCreateAccess().getPathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getPathSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Create__PathAssignment_1"


    // $ANTLR start "rule__Create__ColumnsAssignment_4"
    // InternalMyDsl.g:1323:1: rule__Create__ColumnsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Create__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1328:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1328:2: ( RULE_STRING )
            // InternalMyDsl.g:1329:3: RULE_STRING
            {
             before(grammarAccess.getCreateAccess().getColumnsSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getColumnsSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Create__ColumnsAssignment_4"


    // $ANTLR start "rule__Create__ContentAssignment_8"
    // InternalMyDsl.g:1338:1: rule__Create__ContentAssignment_8 : ( ruleContent ) ;
    public final void rule__Create__ContentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( ( ruleContent ) )
            // InternalMyDsl.g:1343:2: ( ruleContent )
            {
            // InternalMyDsl.g:1343:2: ( ruleContent )
            // InternalMyDsl.g:1344:3: ruleContent
            {
             before(grammarAccess.getCreateAccess().getContentContentParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getCreateAccess().getContentContentParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Create__ContentAssignment_8"


    // $ANTLR start "rule__Load__NameAssignment_1"
    // InternalMyDsl.g:1353:1: rule__Load__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Load__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1358:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1358:2: ( RULE_ID )
            // InternalMyDsl.g:1359:3: RULE_ID
            {
             before(grammarAccess.getLoadAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Load__NameAssignment_1"


    // $ANTLR start "rule__Load__PathAssignment_3"
    // InternalMyDsl.g:1368:1: rule__Load__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Load__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1373:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1373:2: ( RULE_STRING )
            // InternalMyDsl.g:1374:3: RULE_STRING
            {
             before(grammarAccess.getLoadAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getPathSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Load__PathAssignment_3"


    // $ANTLR start "rule__Print__NameAssignment_1"
    // InternalMyDsl.g:1383:1: rule__Print__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Print__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1388:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1388:2: ( RULE_STRING )
            // InternalMyDsl.g:1389:3: RULE_STRING
            {
             before(grammarAccess.getPrintAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Print__NameAssignment_1"


    // $ANTLR start "rule__Head__NameAssignment_1"
    // InternalMyDsl.g:1398:1: rule__Head__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Head__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1403:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1403:2: ( RULE_ID )
            // InternalMyDsl.g:1404:3: RULE_ID
            {
             before(grammarAccess.getHeadAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHeadAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Head__NameAssignment_1"


    // $ANTLR start "rule__InsertColumn__NameAssignment_2"
    // InternalMyDsl.g:1413:1: rule__InsertColumn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InsertColumn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1418:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1418:2: ( RULE_ID )
            // InternalMyDsl.g:1419:3: RULE_ID
            {
             before(grammarAccess.getInsertColumnAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInsertColumnAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__InsertColumn__NameAssignment_2"


    // $ANTLR start "rule__InsertColumn__ColumnAssignment_3"
    // InternalMyDsl.g:1428:1: rule__InsertColumn__ColumnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InsertColumn__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1433:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1433:2: ( RULE_STRING )
            // InternalMyDsl.g:1434:3: RULE_STRING
            {
             before(grammarAccess.getInsertColumnAccess().getColumnSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertColumnAccess().getColumnSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__InsertColumn__ColumnAssignment_3"


    // $ANTLR start "rule__ToCSV__NameAssignment_2"
    // InternalMyDsl.g:1443:1: rule__ToCSV__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ToCSV__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1448:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1448:2: ( RULE_ID )
            // InternalMyDsl.g:1449:3: RULE_ID
            {
             before(grammarAccess.getToCSVAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getToCSVAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ToCSV__NameAssignment_2"


    // $ANTLR start "rule__ToCSV__PathAssignment_3"
    // InternalMyDsl.g:1458:1: rule__ToCSV__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ToCSV__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1462:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1463:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1463:2: ( RULE_STRING )
            // InternalMyDsl.g:1464:3: RULE_STRING
            {
             before(grammarAccess.getToCSVAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getToCSVAccess().getPathSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ToCSV__PathAssignment_3"


    // $ANTLR start "rule__DropColumn__NameAssignment_2"
    // InternalMyDsl.g:1473:1: rule__DropColumn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DropColumn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1478:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1478:2: ( RULE_ID )
            // InternalMyDsl.g:1479:3: RULE_ID
            {
             before(grammarAccess.getDropColumnAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropColumnAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DropColumn__NameAssignment_2"


    // $ANTLR start "rule__DropColumn__ColumnsAssignment_3"
    // InternalMyDsl.g:1488:1: rule__DropColumn__ColumnsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DropColumn__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1493:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1493:2: ( RULE_STRING )
            // InternalMyDsl.g:1494:3: RULE_STRING
            {
             before(grammarAccess.getDropColumnAccess().getColumnsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDropColumnAccess().getColumnsSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__DropColumn__ColumnsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000AEA002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}