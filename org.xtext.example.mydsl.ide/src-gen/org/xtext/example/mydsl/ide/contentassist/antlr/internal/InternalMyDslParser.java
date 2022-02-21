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

                if ( (LA1_0==13||LA1_0==15||(LA1_0>=17 && LA1_0<=19)||LA1_0==21) ) {
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


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleType EOF )
            // InternalMyDsl.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:87:1: ruleType : ( ( rule__Type__NameAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Type__NameAssignment ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Type__NameAssignment ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Type__NameAssignment ) )
            // InternalMyDsl.g:93:3: ( rule__Type__NameAssignment )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment()); 
            // InternalMyDsl.g:94:3: ( rule__Type__NameAssignment )
            // InternalMyDsl.g:94:4: rule__Type__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:103:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCommand EOF )
            // InternalMyDsl.g:105:1: ruleCommand EOF
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
    // InternalMyDsl.g:112:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Command__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Command__Alternatives )
            // InternalMyDsl.g:119:4: rule__Command__Alternatives
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
    // InternalMyDsl.g:128:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleContent EOF )
            // InternalMyDsl.g:130:1: ruleContent EOF
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
    // InternalMyDsl.g:137:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Content__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Content__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Content__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Content__Group__0 )
            // InternalMyDsl.g:144:4: rule__Content__Group__0
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
    // InternalMyDsl.g:153:1: entryRuleCreate : ruleCreate EOF ;
    public final void entryRuleCreate() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleCreate EOF )
            // InternalMyDsl.g:155:1: ruleCreate EOF
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
    // InternalMyDsl.g:162:1: ruleCreate : ( ( rule__Create__Group__0 ) ) ;
    public final void ruleCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Create__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Create__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Create__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Create__Group__0 )
            {
             before(grammarAccess.getCreateAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Create__Group__0 )
            // InternalMyDsl.g:169:4: rule__Create__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleLoad : ruleLoad EOF ;
    public final void entryRuleLoad() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleLoad EOF )
            // InternalMyDsl.g:180:1: ruleLoad EOF
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
    // InternalMyDsl.g:187:1: ruleLoad : ( ( rule__Load__Group__0 ) ) ;
    public final void ruleLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Load__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Load__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Load__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Load__Group__0 )
            {
             before(grammarAccess.getLoadAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Load__Group__0 )
            // InternalMyDsl.g:194:4: rule__Load__Group__0
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
    // InternalMyDsl.g:203:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( rulePrint EOF )
            // InternalMyDsl.g:205:1: rulePrint EOF
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
    // InternalMyDsl.g:212:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Print__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Print__Group__0 )
            // InternalMyDsl.g:219:4: rule__Print__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleHead : ruleHead EOF ;
    public final void entryRuleHead() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleHead EOF )
            // InternalMyDsl.g:230:1: ruleHead EOF
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
    // InternalMyDsl.g:237:1: ruleHead : ( ( rule__Head__Group__0 ) ) ;
    public final void ruleHead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Head__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Head__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Head__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Head__Group__0 )
            {
             before(grammarAccess.getHeadAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Head__Group__0 )
            // InternalMyDsl.g:244:4: rule__Head__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleInsertColumn : ruleInsertColumn EOF ;
    public final void entryRuleInsertColumn() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleInsertColumn EOF )
            // InternalMyDsl.g:255:1: ruleInsertColumn EOF
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
    // InternalMyDsl.g:262:1: ruleInsertColumn : ( ( rule__InsertColumn__Group__0 ) ) ;
    public final void ruleInsertColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__InsertColumn__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__InsertColumn__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__InsertColumn__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__InsertColumn__Group__0 )
            {
             before(grammarAccess.getInsertColumnAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__InsertColumn__Group__0 )
            // InternalMyDsl.g:269:4: rule__InsertColumn__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleToCSV : ruleToCSV EOF ;
    public final void entryRuleToCSV() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleToCSV EOF )
            // InternalMyDsl.g:280:1: ruleToCSV EOF
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
    // InternalMyDsl.g:287:1: ruleToCSV : ( ( rule__ToCSV__Group__0 ) ) ;
    public final void ruleToCSV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ToCSV__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ToCSV__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ToCSV__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__ToCSV__Group__0 )
            {
             before(grammarAccess.getToCSVAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__ToCSV__Group__0 )
            // InternalMyDsl.g:294:4: rule__ToCSV__Group__0
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


    // $ANTLR start "rule__Command__Alternatives"
    // InternalMyDsl.g:302:1: rule__Command__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) | ( ruleInsertColumn ) | ( ruleToCSV ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) | ( ruleInsertColumn ) | ( ruleToCSV ) )
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

            }
        }
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
    // InternalMyDsl.g:347:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalMyDsl.g:352:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalMyDsl.g:359:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:363:1: ( ( () ) )
            // InternalMyDsl.g:364:1: ( () )
            {
            // InternalMyDsl.g:364:1: ( () )
            // InternalMyDsl.g:365:2: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // InternalMyDsl.g:366:2: ()
            // InternalMyDsl.g:366:3: 
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
    // InternalMyDsl.g:374:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalMyDsl.g:379:2: rule__Content__Group__1__Impl rule__Content__Group__2
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
    // InternalMyDsl.g:386:1: rule__Content__Group__1__Impl : ( '[' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:390:1: ( ( '[' ) )
            // InternalMyDsl.g:391:1: ( '[' )
            {
            // InternalMyDsl.g:391:1: ( '[' )
            // InternalMyDsl.g:392:2: '['
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
    // InternalMyDsl.g:401:1: rule__Content__Group__2 : rule__Content__Group__2__Impl rule__Content__Group__3 ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( rule__Content__Group__2__Impl rule__Content__Group__3 )
            // InternalMyDsl.g:406:2: rule__Content__Group__2__Impl rule__Content__Group__3
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
    // InternalMyDsl.g:413:1: rule__Content__Group__2__Impl : ( ( rule__Content__FieldsAssignment_2 )* ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:417:1: ( ( ( rule__Content__FieldsAssignment_2 )* ) )
            // InternalMyDsl.g:418:1: ( ( rule__Content__FieldsAssignment_2 )* )
            {
            // InternalMyDsl.g:418:1: ( ( rule__Content__FieldsAssignment_2 )* )
            // InternalMyDsl.g:419:2: ( rule__Content__FieldsAssignment_2 )*
            {
             before(grammarAccess.getContentAccess().getFieldsAssignment_2()); 
            // InternalMyDsl.g:420:2: ( rule__Content__FieldsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:420:3: rule__Content__FieldsAssignment_2
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
    // InternalMyDsl.g:428:1: rule__Content__Group__3 : rule__Content__Group__3__Impl ;
    public final void rule__Content__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( rule__Content__Group__3__Impl )
            // InternalMyDsl.g:433:2: rule__Content__Group__3__Impl
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
    // InternalMyDsl.g:439:1: rule__Content__Group__3__Impl : ( ']' ) ;
    public final void rule__Content__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( ( ']' ) )
            // InternalMyDsl.g:444:1: ( ']' )
            {
            // InternalMyDsl.g:444:1: ( ']' )
            // InternalMyDsl.g:445:2: ']'
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
    // InternalMyDsl.g:455:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:459:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalMyDsl.g:460:2: rule__Create__Group__0__Impl rule__Create__Group__1
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
    // InternalMyDsl.g:467:1: rule__Create__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:471:1: ( ( 'CREATE' ) )
            // InternalMyDsl.g:472:1: ( 'CREATE' )
            {
            // InternalMyDsl.g:472:1: ( 'CREATE' )
            // InternalMyDsl.g:473:2: 'CREATE'
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
    // InternalMyDsl.g:482:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:486:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalMyDsl.g:487:2: rule__Create__Group__1__Impl rule__Create__Group__2
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
    // InternalMyDsl.g:494:1: rule__Create__Group__1__Impl : ( ( rule__Create__PathAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:498:1: ( ( ( rule__Create__PathAssignment_1 ) ) )
            // InternalMyDsl.g:499:1: ( ( rule__Create__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:499:1: ( ( rule__Create__PathAssignment_1 ) )
            // InternalMyDsl.g:500:2: ( rule__Create__PathAssignment_1 )
            {
             before(grammarAccess.getCreateAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:501:2: ( rule__Create__PathAssignment_1 )
            // InternalMyDsl.g:501:3: rule__Create__PathAssignment_1
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
    // InternalMyDsl.g:509:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:513:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalMyDsl.g:514:2: rule__Create__Group__2__Impl rule__Create__Group__3
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
    // InternalMyDsl.g:521:1: rule__Create__Group__2__Impl : ( ':' ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:525:1: ( ( ':' ) )
            // InternalMyDsl.g:526:1: ( ':' )
            {
            // InternalMyDsl.g:526:1: ( ':' )
            // InternalMyDsl.g:527:2: ':'
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
    // InternalMyDsl.g:536:1: rule__Create__Group__3 : rule__Create__Group__3__Impl rule__Create__Group__4 ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( rule__Create__Group__3__Impl rule__Create__Group__4 )
            // InternalMyDsl.g:541:2: rule__Create__Group__3__Impl rule__Create__Group__4
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
    // InternalMyDsl.g:548:1: rule__Create__Group__3__Impl : ( '[' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:552:1: ( ( '[' ) )
            // InternalMyDsl.g:553:1: ( '[' )
            {
            // InternalMyDsl.g:553:1: ( '[' )
            // InternalMyDsl.g:554:2: '['
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
    // InternalMyDsl.g:563:1: rule__Create__Group__4 : rule__Create__Group__4__Impl rule__Create__Group__5 ;
    public final void rule__Create__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( rule__Create__Group__4__Impl rule__Create__Group__5 )
            // InternalMyDsl.g:568:2: rule__Create__Group__4__Impl rule__Create__Group__5
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
    // InternalMyDsl.g:575:1: rule__Create__Group__4__Impl : ( ( rule__Create__ColumnsAssignment_4 )* ) ;
    public final void rule__Create__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:579:1: ( ( ( rule__Create__ColumnsAssignment_4 )* ) )
            // InternalMyDsl.g:580:1: ( ( rule__Create__ColumnsAssignment_4 )* )
            {
            // InternalMyDsl.g:580:1: ( ( rule__Create__ColumnsAssignment_4 )* )
            // InternalMyDsl.g:581:2: ( rule__Create__ColumnsAssignment_4 )*
            {
             before(grammarAccess.getCreateAccess().getColumnsAssignment_4()); 
            // InternalMyDsl.g:582:2: ( rule__Create__ColumnsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:582:3: rule__Create__ColumnsAssignment_4
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
    // InternalMyDsl.g:590:1: rule__Create__Group__5 : rule__Create__Group__5__Impl rule__Create__Group__6 ;
    public final void rule__Create__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( rule__Create__Group__5__Impl rule__Create__Group__6 )
            // InternalMyDsl.g:595:2: rule__Create__Group__5__Impl rule__Create__Group__6
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
    // InternalMyDsl.g:602:1: rule__Create__Group__5__Impl : ( ']' ) ;
    public final void rule__Create__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:606:1: ( ( ']' ) )
            // InternalMyDsl.g:607:1: ( ']' )
            {
            // InternalMyDsl.g:607:1: ( ']' )
            // InternalMyDsl.g:608:2: ']'
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
    // InternalMyDsl.g:617:1: rule__Create__Group__6 : rule__Create__Group__6__Impl rule__Create__Group__7 ;
    public final void rule__Create__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( rule__Create__Group__6__Impl rule__Create__Group__7 )
            // InternalMyDsl.g:622:2: rule__Create__Group__6__Impl rule__Create__Group__7
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
    // InternalMyDsl.g:629:1: rule__Create__Group__6__Impl : ( ':' ) ;
    public final void rule__Create__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:633:1: ( ( ':' ) )
            // InternalMyDsl.g:634:1: ( ':' )
            {
            // InternalMyDsl.g:634:1: ( ':' )
            // InternalMyDsl.g:635:2: ':'
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
    // InternalMyDsl.g:644:1: rule__Create__Group__7 : rule__Create__Group__7__Impl rule__Create__Group__8 ;
    public final void rule__Create__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( rule__Create__Group__7__Impl rule__Create__Group__8 )
            // InternalMyDsl.g:649:2: rule__Create__Group__7__Impl rule__Create__Group__8
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
    // InternalMyDsl.g:656:1: rule__Create__Group__7__Impl : ( '[' ) ;
    public final void rule__Create__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:660:1: ( ( '[' ) )
            // InternalMyDsl.g:661:1: ( '[' )
            {
            // InternalMyDsl.g:661:1: ( '[' )
            // InternalMyDsl.g:662:2: '['
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
    // InternalMyDsl.g:671:1: rule__Create__Group__8 : rule__Create__Group__8__Impl rule__Create__Group__9 ;
    public final void rule__Create__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( rule__Create__Group__8__Impl rule__Create__Group__9 )
            // InternalMyDsl.g:676:2: rule__Create__Group__8__Impl rule__Create__Group__9
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
    // InternalMyDsl.g:683:1: rule__Create__Group__8__Impl : ( ( rule__Create__ContentAssignment_8 )* ) ;
    public final void rule__Create__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( ( ( rule__Create__ContentAssignment_8 )* ) )
            // InternalMyDsl.g:688:1: ( ( rule__Create__ContentAssignment_8 )* )
            {
            // InternalMyDsl.g:688:1: ( ( rule__Create__ContentAssignment_8 )* )
            // InternalMyDsl.g:689:2: ( rule__Create__ContentAssignment_8 )*
            {
             before(grammarAccess.getCreateAccess().getContentAssignment_8()); 
            // InternalMyDsl.g:690:2: ( rule__Create__ContentAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:690:3: rule__Create__ContentAssignment_8
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
    // InternalMyDsl.g:698:1: rule__Create__Group__9 : rule__Create__Group__9__Impl ;
    public final void rule__Create__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( rule__Create__Group__9__Impl )
            // InternalMyDsl.g:703:2: rule__Create__Group__9__Impl
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
    // InternalMyDsl.g:709:1: rule__Create__Group__9__Impl : ( ']' ) ;
    public final void rule__Create__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( ']' ) )
            // InternalMyDsl.g:714:1: ( ']' )
            {
            // InternalMyDsl.g:714:1: ( ']' )
            // InternalMyDsl.g:715:2: ']'
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
    // InternalMyDsl.g:725:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalMyDsl.g:730:2: rule__Load__Group__0__Impl rule__Load__Group__1
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
    // InternalMyDsl.g:737:1: rule__Load__Group__0__Impl : ( 'LOAD' ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:1: ( ( 'LOAD' ) )
            // InternalMyDsl.g:742:1: ( 'LOAD' )
            {
            // InternalMyDsl.g:742:1: ( 'LOAD' )
            // InternalMyDsl.g:743:2: 'LOAD'
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
    // InternalMyDsl.g:752:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalMyDsl.g:757:2: rule__Load__Group__1__Impl rule__Load__Group__2
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
    // InternalMyDsl.g:764:1: rule__Load__Group__1__Impl : ( ( rule__Load__NameAssignment_1 ) ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:768:1: ( ( ( rule__Load__NameAssignment_1 ) ) )
            // InternalMyDsl.g:769:1: ( ( rule__Load__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:769:1: ( ( rule__Load__NameAssignment_1 ) )
            // InternalMyDsl.g:770:2: ( rule__Load__NameAssignment_1 )
            {
             before(grammarAccess.getLoadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:771:2: ( rule__Load__NameAssignment_1 )
            // InternalMyDsl.g:771:3: rule__Load__NameAssignment_1
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
    // InternalMyDsl.g:779:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalMyDsl.g:784:2: rule__Load__Group__2__Impl rule__Load__Group__3
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
    // InternalMyDsl.g:791:1: rule__Load__Group__2__Impl : ( '=' ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( ( '=' ) )
            // InternalMyDsl.g:796:1: ( '=' )
            {
            // InternalMyDsl.g:796:1: ( '=' )
            // InternalMyDsl.g:797:2: '='
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
    // InternalMyDsl.g:806:1: rule__Load__Group__3 : rule__Load__Group__3__Impl ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:810:1: ( rule__Load__Group__3__Impl )
            // InternalMyDsl.g:811:2: rule__Load__Group__3__Impl
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
    // InternalMyDsl.g:817:1: rule__Load__Group__3__Impl : ( ( rule__Load__PathAssignment_3 ) ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( ( ( rule__Load__PathAssignment_3 ) ) )
            // InternalMyDsl.g:822:1: ( ( rule__Load__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:822:1: ( ( rule__Load__PathAssignment_3 ) )
            // InternalMyDsl.g:823:2: ( rule__Load__PathAssignment_3 )
            {
             before(grammarAccess.getLoadAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:824:2: ( rule__Load__PathAssignment_3 )
            // InternalMyDsl.g:824:3: rule__Load__PathAssignment_3
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
    // InternalMyDsl.g:833:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalMyDsl.g:838:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:845:1: rule__Print__Group__0__Impl : ( 'PRINT' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:849:1: ( ( 'PRINT' ) )
            // InternalMyDsl.g:850:1: ( 'PRINT' )
            {
            // InternalMyDsl.g:850:1: ( 'PRINT' )
            // InternalMyDsl.g:851:2: 'PRINT'
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
    // InternalMyDsl.g:860:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:864:1: ( rule__Print__Group__1__Impl )
            // InternalMyDsl.g:865:2: rule__Print__Group__1__Impl
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
    // InternalMyDsl.g:871:1: rule__Print__Group__1__Impl : ( ( rule__Print__NameAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( ( ( rule__Print__NameAssignment_1 ) ) )
            // InternalMyDsl.g:876:1: ( ( rule__Print__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:876:1: ( ( rule__Print__NameAssignment_1 ) )
            // InternalMyDsl.g:877:2: ( rule__Print__NameAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:878:2: ( rule__Print__NameAssignment_1 )
            // InternalMyDsl.g:878:3: rule__Print__NameAssignment_1
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
    // InternalMyDsl.g:887:1: rule__Head__Group__0 : rule__Head__Group__0__Impl rule__Head__Group__1 ;
    public final void rule__Head__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( rule__Head__Group__0__Impl rule__Head__Group__1 )
            // InternalMyDsl.g:892:2: rule__Head__Group__0__Impl rule__Head__Group__1
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
    // InternalMyDsl.g:899:1: rule__Head__Group__0__Impl : ( 'HEAD' ) ;
    public final void rule__Head__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:903:1: ( ( 'HEAD' ) )
            // InternalMyDsl.g:904:1: ( 'HEAD' )
            {
            // InternalMyDsl.g:904:1: ( 'HEAD' )
            // InternalMyDsl.g:905:2: 'HEAD'
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
    // InternalMyDsl.g:914:1: rule__Head__Group__1 : rule__Head__Group__1__Impl ;
    public final void rule__Head__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( rule__Head__Group__1__Impl )
            // InternalMyDsl.g:919:2: rule__Head__Group__1__Impl
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
    // InternalMyDsl.g:925:1: rule__Head__Group__1__Impl : ( ( rule__Head__NameAssignment_1 ) ) ;
    public final void rule__Head__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( ( ( rule__Head__NameAssignment_1 ) ) )
            // InternalMyDsl.g:930:1: ( ( rule__Head__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:930:1: ( ( rule__Head__NameAssignment_1 ) )
            // InternalMyDsl.g:931:2: ( rule__Head__NameAssignment_1 )
            {
             before(grammarAccess.getHeadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:932:2: ( rule__Head__NameAssignment_1 )
            // InternalMyDsl.g:932:3: rule__Head__NameAssignment_1
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
    // InternalMyDsl.g:941:1: rule__InsertColumn__Group__0 : rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1 ;
    public final void rule__InsertColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1 )
            // InternalMyDsl.g:946:2: rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1
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
    // InternalMyDsl.g:953:1: rule__InsertColumn__Group__0__Impl : ( 'INSERT' ) ;
    public final void rule__InsertColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:957:1: ( ( 'INSERT' ) )
            // InternalMyDsl.g:958:1: ( 'INSERT' )
            {
            // InternalMyDsl.g:958:1: ( 'INSERT' )
            // InternalMyDsl.g:959:2: 'INSERT'
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
    // InternalMyDsl.g:968:1: rule__InsertColumn__Group__1 : rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2 ;
    public final void rule__InsertColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:972:1: ( rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2 )
            // InternalMyDsl.g:973:2: rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2
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
    // InternalMyDsl.g:980:1: rule__InsertColumn__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__InsertColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:984:1: ( ( 'COLUMN' ) )
            // InternalMyDsl.g:985:1: ( 'COLUMN' )
            {
            // InternalMyDsl.g:985:1: ( 'COLUMN' )
            // InternalMyDsl.g:986:2: 'COLUMN'
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
    // InternalMyDsl.g:995:1: rule__InsertColumn__Group__2 : rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3 ;
    public final void rule__InsertColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:999:1: ( rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3 )
            // InternalMyDsl.g:1000:2: rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3
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
    // InternalMyDsl.g:1007:1: rule__InsertColumn__Group__2__Impl : ( ( rule__InsertColumn__NameAssignment_2 ) ) ;
    public final void rule__InsertColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1011:1: ( ( ( rule__InsertColumn__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1012:1: ( ( rule__InsertColumn__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1012:1: ( ( rule__InsertColumn__NameAssignment_2 ) )
            // InternalMyDsl.g:1013:2: ( rule__InsertColumn__NameAssignment_2 )
            {
             before(grammarAccess.getInsertColumnAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1014:2: ( rule__InsertColumn__NameAssignment_2 )
            // InternalMyDsl.g:1014:3: rule__InsertColumn__NameAssignment_2
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
    // InternalMyDsl.g:1022:1: rule__InsertColumn__Group__3 : rule__InsertColumn__Group__3__Impl ;
    public final void rule__InsertColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( rule__InsertColumn__Group__3__Impl )
            // InternalMyDsl.g:1027:2: rule__InsertColumn__Group__3__Impl
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
    // InternalMyDsl.g:1033:1: rule__InsertColumn__Group__3__Impl : ( ( rule__InsertColumn__ColumnAssignment_3 ) ) ;
    public final void rule__InsertColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( ( rule__InsertColumn__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:1038:1: ( ( rule__InsertColumn__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:1038:1: ( ( rule__InsertColumn__ColumnAssignment_3 ) )
            // InternalMyDsl.g:1039:2: ( rule__InsertColumn__ColumnAssignment_3 )
            {
             before(grammarAccess.getInsertColumnAccess().getColumnAssignment_3()); 
            // InternalMyDsl.g:1040:2: ( rule__InsertColumn__ColumnAssignment_3 )
            // InternalMyDsl.g:1040:3: rule__InsertColumn__ColumnAssignment_3
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
    // InternalMyDsl.g:1049:1: rule__ToCSV__Group__0 : rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 ;
    public final void rule__ToCSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1053:1: ( rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 )
            // InternalMyDsl.g:1054:2: rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1
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
    // InternalMyDsl.g:1061:1: rule__ToCSV__Group__0__Impl : ( 'TO' ) ;
    public final void rule__ToCSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1065:1: ( ( 'TO' ) )
            // InternalMyDsl.g:1066:1: ( 'TO' )
            {
            // InternalMyDsl.g:1066:1: ( 'TO' )
            // InternalMyDsl.g:1067:2: 'TO'
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
    // InternalMyDsl.g:1076:1: rule__ToCSV__Group__1 : rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 ;
    public final void rule__ToCSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 )
            // InternalMyDsl.g:1081:2: rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2
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
    // InternalMyDsl.g:1088:1: rule__ToCSV__Group__1__Impl : ( 'CSV' ) ;
    public final void rule__ToCSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1092:1: ( ( 'CSV' ) )
            // InternalMyDsl.g:1093:1: ( 'CSV' )
            {
            // InternalMyDsl.g:1093:1: ( 'CSV' )
            // InternalMyDsl.g:1094:2: 'CSV'
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
    // InternalMyDsl.g:1103:1: rule__ToCSV__Group__2 : rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3 ;
    public final void rule__ToCSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3 )
            // InternalMyDsl.g:1108:2: rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3
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
    // InternalMyDsl.g:1115:1: rule__ToCSV__Group__2__Impl : ( ( rule__ToCSV__NameAssignment_2 ) ) ;
    public final void rule__ToCSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1119:1: ( ( ( rule__ToCSV__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1120:1: ( ( rule__ToCSV__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1120:1: ( ( rule__ToCSV__NameAssignment_2 ) )
            // InternalMyDsl.g:1121:2: ( rule__ToCSV__NameAssignment_2 )
            {
             before(grammarAccess.getToCSVAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1122:2: ( rule__ToCSV__NameAssignment_2 )
            // InternalMyDsl.g:1122:3: rule__ToCSV__NameAssignment_2
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
    // InternalMyDsl.g:1130:1: rule__ToCSV__Group__3 : rule__ToCSV__Group__3__Impl ;
    public final void rule__ToCSV__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1134:1: ( rule__ToCSV__Group__3__Impl )
            // InternalMyDsl.g:1135:2: rule__ToCSV__Group__3__Impl
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
    // InternalMyDsl.g:1141:1: rule__ToCSV__Group__3__Impl : ( ( rule__ToCSV__PathAssignment_3 ) ) ;
    public final void rule__ToCSV__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( ( rule__ToCSV__PathAssignment_3 ) ) )
            // InternalMyDsl.g:1146:1: ( ( rule__ToCSV__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:1146:1: ( ( rule__ToCSV__PathAssignment_3 ) )
            // InternalMyDsl.g:1147:2: ( rule__ToCSV__PathAssignment_3 )
            {
             before(grammarAccess.getToCSVAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:1148:2: ( rule__ToCSV__PathAssignment_3 )
            // InternalMyDsl.g:1148:3: rule__ToCSV__PathAssignment_3
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


    // $ANTLR start "rule__Model__CommandsAssignment"
    // InternalMyDsl.g:1157:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1161:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:1162:2: ( ruleCommand )
            {
            // InternalMyDsl.g:1162:2: ( ruleCommand )
            // InternalMyDsl.g:1163:3: ruleCommand
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


    // $ANTLR start "rule__Type__NameAssignment"
    // InternalMyDsl.g:1172:1: rule__Type__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1177:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1177:2: ( RULE_STRING )
            // InternalMyDsl.g:1178:3: RULE_STRING
            {
             before(grammarAccess.getTypeAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Type__NameAssignment"


    // $ANTLR start "rule__Content__FieldsAssignment_2"
    // InternalMyDsl.g:1187:1: rule__Content__FieldsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Content__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1192:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1192:2: ( RULE_STRING )
            // InternalMyDsl.g:1193:3: RULE_STRING
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
    // InternalMyDsl.g:1202:1: rule__Create__PathAssignment_1 : ( ruleType ) ;
    public final void rule__Create__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( ( ruleType ) )
            // InternalMyDsl.g:1207:2: ( ruleType )
            {
            // InternalMyDsl.g:1207:2: ( ruleType )
            // InternalMyDsl.g:1208:3: ruleType
            {
             before(grammarAccess.getCreateAccess().getPathTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getCreateAccess().getPathTypeParserRuleCall_1_0()); 

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
    // InternalMyDsl.g:1217:1: rule__Create__ColumnsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Create__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1221:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1222:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1222:2: ( RULE_STRING )
            // InternalMyDsl.g:1223:3: RULE_STRING
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
    // InternalMyDsl.g:1232:1: rule__Create__ContentAssignment_8 : ( ruleContent ) ;
    public final void rule__Create__ContentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1236:1: ( ( ruleContent ) )
            // InternalMyDsl.g:1237:2: ( ruleContent )
            {
            // InternalMyDsl.g:1237:2: ( ruleContent )
            // InternalMyDsl.g:1238:3: ruleContent
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
    // InternalMyDsl.g:1247:1: rule__Load__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Load__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1252:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1252:2: ( RULE_ID )
            // InternalMyDsl.g:1253:3: RULE_ID
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
    // InternalMyDsl.g:1262:1: rule__Load__PathAssignment_3 : ( ruleType ) ;
    public final void rule__Load__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( ( ruleType ) )
            // InternalMyDsl.g:1267:2: ( ruleType )
            {
            // InternalMyDsl.g:1267:2: ( ruleType )
            // InternalMyDsl.g:1268:3: ruleType
            {
             before(grammarAccess.getLoadAccess().getPathTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getPathTypeParserRuleCall_3_0()); 

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
    // InternalMyDsl.g:1277:1: rule__Print__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Print__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1282:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1282:2: ( RULE_ID )
            // InternalMyDsl.g:1283:3: RULE_ID
            {
             before(grammarAccess.getPrintAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // InternalMyDsl.g:1292:1: rule__Head__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Head__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1297:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1297:2: ( RULE_ID )
            // InternalMyDsl.g:1298:3: RULE_ID
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
    // InternalMyDsl.g:1307:1: rule__InsertColumn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InsertColumn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1312:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1312:2: ( RULE_ID )
            // InternalMyDsl.g:1313:3: RULE_ID
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
    // InternalMyDsl.g:1322:1: rule__InsertColumn__ColumnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InsertColumn__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1327:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1327:2: ( RULE_STRING )
            // InternalMyDsl.g:1328:3: RULE_STRING
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
    // InternalMyDsl.g:1337:1: rule__ToCSV__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ToCSV__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1342:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1342:2: ( RULE_ID )
            // InternalMyDsl.g:1343:3: RULE_ID
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
    // InternalMyDsl.g:1352:1: rule__ToCSV__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ToCSV__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1356:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1357:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1357:2: ( RULE_STRING )
            // InternalMyDsl.g:1358:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000002EA002L});
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