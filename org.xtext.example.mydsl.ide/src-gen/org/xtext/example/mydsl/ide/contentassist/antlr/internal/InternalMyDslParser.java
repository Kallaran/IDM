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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'CREATE'", "':'", "'LOAD'", "'='", "'PRINT'", "'HEAD'", "'INSERT'", "'COLUMN'", "'TO'", "'CSV'", "'DROP'", "'ROW'"
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


    // $ANTLR start "entryRuleDropRow"
    // InternalMyDsl.g:303:1: entryRuleDropRow : ruleDropRow EOF ;
    public final void entryRuleDropRow() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleDropRow EOF )
            // InternalMyDsl.g:305:1: ruleDropRow EOF
            {
             before(grammarAccess.getDropRowRule()); 
            pushFollow(FOLLOW_1);
            ruleDropRow();

            state._fsp--;

             after(grammarAccess.getDropRowRule()); 
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
    // $ANTLR end "entryRuleDropRow"


    // $ANTLR start "ruleDropRow"
    // InternalMyDsl.g:312:1: ruleDropRow : ( ( rule__DropRow__Group__0 ) ) ;
    public final void ruleDropRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__DropRow__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__DropRow__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__DropRow__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__DropRow__Group__0 )
            {
             before(grammarAccess.getDropRowAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__DropRow__Group__0 )
            // InternalMyDsl.g:319:4: rule__DropRow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DropRow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDropRow"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalMyDsl.g:327:1: rule__Command__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) | ( ruleInsertColumn ) | ( ruleToCSV ) | ( ruleDropColumn ) | ( ruleDropRow ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) | ( ruleInsertColumn ) | ( ruleToCSV ) | ( ruleDropColumn ) | ( ruleDropRow ) )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:332:2: ( ruleCreate )
                    {
                    // InternalMyDsl.g:332:2: ( ruleCreate )
                    // InternalMyDsl.g:333:3: ruleCreate
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
                    // InternalMyDsl.g:338:2: ( ruleLoad )
                    {
                    // InternalMyDsl.g:338:2: ( ruleLoad )
                    // InternalMyDsl.g:339:3: ruleLoad
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
                    // InternalMyDsl.g:344:2: ( rulePrint )
                    {
                    // InternalMyDsl.g:344:2: ( rulePrint )
                    // InternalMyDsl.g:345:3: rulePrint
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
                    // InternalMyDsl.g:350:2: ( ruleHead )
                    {
                    // InternalMyDsl.g:350:2: ( ruleHead )
                    // InternalMyDsl.g:351:3: ruleHead
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
                    // InternalMyDsl.g:356:2: ( ruleInsertColumn )
                    {
                    // InternalMyDsl.g:356:2: ( ruleInsertColumn )
                    // InternalMyDsl.g:357:3: ruleInsertColumn
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
                    // InternalMyDsl.g:362:2: ( ruleToCSV )
                    {
                    // InternalMyDsl.g:362:2: ( ruleToCSV )
                    // InternalMyDsl.g:363:3: ruleToCSV
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
                    // InternalMyDsl.g:368:2: ( ruleDropColumn )
                    {
                    // InternalMyDsl.g:368:2: ( ruleDropColumn )
                    // InternalMyDsl.g:369:3: ruleDropColumn
                    {
                     before(grammarAccess.getCommandAccess().getDropColumnParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDropColumn();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getDropColumnParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:374:2: ( ruleDropRow )
                    {
                    // InternalMyDsl.g:374:2: ( ruleDropRow )
                    // InternalMyDsl.g:375:3: ruleDropRow
                    {
                     before(grammarAccess.getCommandAccess().getDropRowParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleDropRow();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getDropRowParserRuleCall_7()); 

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
    // InternalMyDsl.g:384:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:388:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalMyDsl.g:389:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalMyDsl.g:396:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:400:1: ( ( () ) )
            // InternalMyDsl.g:401:1: ( () )
            {
            // InternalMyDsl.g:401:1: ( () )
            // InternalMyDsl.g:402:2: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // InternalMyDsl.g:403:2: ()
            // InternalMyDsl.g:403:3: 
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
    // InternalMyDsl.g:411:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:415:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalMyDsl.g:416:2: rule__Content__Group__1__Impl rule__Content__Group__2
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
    // InternalMyDsl.g:423:1: rule__Content__Group__1__Impl : ( '[' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:427:1: ( ( '[' ) )
            // InternalMyDsl.g:428:1: ( '[' )
            {
            // InternalMyDsl.g:428:1: ( '[' )
            // InternalMyDsl.g:429:2: '['
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
    // InternalMyDsl.g:438:1: rule__Content__Group__2 : rule__Content__Group__2__Impl rule__Content__Group__3 ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:442:1: ( rule__Content__Group__2__Impl rule__Content__Group__3 )
            // InternalMyDsl.g:443:2: rule__Content__Group__2__Impl rule__Content__Group__3
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
    // InternalMyDsl.g:450:1: rule__Content__Group__2__Impl : ( ( rule__Content__FieldsAssignment_2 )* ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( ( ( rule__Content__FieldsAssignment_2 )* ) )
            // InternalMyDsl.g:455:1: ( ( rule__Content__FieldsAssignment_2 )* )
            {
            // InternalMyDsl.g:455:1: ( ( rule__Content__FieldsAssignment_2 )* )
            // InternalMyDsl.g:456:2: ( rule__Content__FieldsAssignment_2 )*
            {
             before(grammarAccess.getContentAccess().getFieldsAssignment_2()); 
            // InternalMyDsl.g:457:2: ( rule__Content__FieldsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:457:3: rule__Content__FieldsAssignment_2
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
    // InternalMyDsl.g:465:1: rule__Content__Group__3 : rule__Content__Group__3__Impl ;
    public final void rule__Content__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:469:1: ( rule__Content__Group__3__Impl )
            // InternalMyDsl.g:470:2: rule__Content__Group__3__Impl
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
    // InternalMyDsl.g:476:1: rule__Content__Group__3__Impl : ( ']' ) ;
    public final void rule__Content__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( ( ']' ) )
            // InternalMyDsl.g:481:1: ( ']' )
            {
            // InternalMyDsl.g:481:1: ( ']' )
            // InternalMyDsl.g:482:2: ']'
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
    // InternalMyDsl.g:492:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:496:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalMyDsl.g:497:2: rule__Create__Group__0__Impl rule__Create__Group__1
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
    // InternalMyDsl.g:504:1: rule__Create__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:1: ( ( 'CREATE' ) )
            // InternalMyDsl.g:509:1: ( 'CREATE' )
            {
            // InternalMyDsl.g:509:1: ( 'CREATE' )
            // InternalMyDsl.g:510:2: 'CREATE'
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
    // InternalMyDsl.g:519:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalMyDsl.g:524:2: rule__Create__Group__1__Impl rule__Create__Group__2
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
    // InternalMyDsl.g:531:1: rule__Create__Group__1__Impl : ( ( rule__Create__PathAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( ( ( rule__Create__PathAssignment_1 ) ) )
            // InternalMyDsl.g:536:1: ( ( rule__Create__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:536:1: ( ( rule__Create__PathAssignment_1 ) )
            // InternalMyDsl.g:537:2: ( rule__Create__PathAssignment_1 )
            {
             before(grammarAccess.getCreateAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:538:2: ( rule__Create__PathAssignment_1 )
            // InternalMyDsl.g:538:3: rule__Create__PathAssignment_1
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
    // InternalMyDsl.g:546:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalMyDsl.g:551:2: rule__Create__Group__2__Impl rule__Create__Group__3
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
    // InternalMyDsl.g:558:1: rule__Create__Group__2__Impl : ( ':' ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:562:1: ( ( ':' ) )
            // InternalMyDsl.g:563:1: ( ':' )
            {
            // InternalMyDsl.g:563:1: ( ':' )
            // InternalMyDsl.g:564:2: ':'
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
    // InternalMyDsl.g:573:1: rule__Create__Group__3 : rule__Create__Group__3__Impl rule__Create__Group__4 ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:577:1: ( rule__Create__Group__3__Impl rule__Create__Group__4 )
            // InternalMyDsl.g:578:2: rule__Create__Group__3__Impl rule__Create__Group__4
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
    // InternalMyDsl.g:585:1: rule__Create__Group__3__Impl : ( '[' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( '[' ) )
            // InternalMyDsl.g:590:1: ( '[' )
            {
            // InternalMyDsl.g:590:1: ( '[' )
            // InternalMyDsl.g:591:2: '['
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
    // InternalMyDsl.g:600:1: rule__Create__Group__4 : rule__Create__Group__4__Impl rule__Create__Group__5 ;
    public final void rule__Create__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( rule__Create__Group__4__Impl rule__Create__Group__5 )
            // InternalMyDsl.g:605:2: rule__Create__Group__4__Impl rule__Create__Group__5
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
    // InternalMyDsl.g:612:1: rule__Create__Group__4__Impl : ( ( rule__Create__ColumnsAssignment_4 )* ) ;
    public final void rule__Create__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( ( ( rule__Create__ColumnsAssignment_4 )* ) )
            // InternalMyDsl.g:617:1: ( ( rule__Create__ColumnsAssignment_4 )* )
            {
            // InternalMyDsl.g:617:1: ( ( rule__Create__ColumnsAssignment_4 )* )
            // InternalMyDsl.g:618:2: ( rule__Create__ColumnsAssignment_4 )*
            {
             before(grammarAccess.getCreateAccess().getColumnsAssignment_4()); 
            // InternalMyDsl.g:619:2: ( rule__Create__ColumnsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:619:3: rule__Create__ColumnsAssignment_4
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
    // InternalMyDsl.g:627:1: rule__Create__Group__5 : rule__Create__Group__5__Impl rule__Create__Group__6 ;
    public final void rule__Create__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( rule__Create__Group__5__Impl rule__Create__Group__6 )
            // InternalMyDsl.g:632:2: rule__Create__Group__5__Impl rule__Create__Group__6
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
    // InternalMyDsl.g:639:1: rule__Create__Group__5__Impl : ( ']' ) ;
    public final void rule__Create__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:643:1: ( ( ']' ) )
            // InternalMyDsl.g:644:1: ( ']' )
            {
            // InternalMyDsl.g:644:1: ( ']' )
            // InternalMyDsl.g:645:2: ']'
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
    // InternalMyDsl.g:654:1: rule__Create__Group__6 : rule__Create__Group__6__Impl rule__Create__Group__7 ;
    public final void rule__Create__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:658:1: ( rule__Create__Group__6__Impl rule__Create__Group__7 )
            // InternalMyDsl.g:659:2: rule__Create__Group__6__Impl rule__Create__Group__7
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
    // InternalMyDsl.g:666:1: rule__Create__Group__6__Impl : ( ':' ) ;
    public final void rule__Create__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:670:1: ( ( ':' ) )
            // InternalMyDsl.g:671:1: ( ':' )
            {
            // InternalMyDsl.g:671:1: ( ':' )
            // InternalMyDsl.g:672:2: ':'
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
    // InternalMyDsl.g:681:1: rule__Create__Group__7 : rule__Create__Group__7__Impl rule__Create__Group__8 ;
    public final void rule__Create__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( rule__Create__Group__7__Impl rule__Create__Group__8 )
            // InternalMyDsl.g:686:2: rule__Create__Group__7__Impl rule__Create__Group__8
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
    // InternalMyDsl.g:693:1: rule__Create__Group__7__Impl : ( '[' ) ;
    public final void rule__Create__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:697:1: ( ( '[' ) )
            // InternalMyDsl.g:698:1: ( '[' )
            {
            // InternalMyDsl.g:698:1: ( '[' )
            // InternalMyDsl.g:699:2: '['
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
    // InternalMyDsl.g:708:1: rule__Create__Group__8 : rule__Create__Group__8__Impl rule__Create__Group__9 ;
    public final void rule__Create__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:712:1: ( rule__Create__Group__8__Impl rule__Create__Group__9 )
            // InternalMyDsl.g:713:2: rule__Create__Group__8__Impl rule__Create__Group__9
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
    // InternalMyDsl.g:720:1: rule__Create__Group__8__Impl : ( ( rule__Create__ContentAssignment_8 )* ) ;
    public final void rule__Create__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:724:1: ( ( ( rule__Create__ContentAssignment_8 )* ) )
            // InternalMyDsl.g:725:1: ( ( rule__Create__ContentAssignment_8 )* )
            {
            // InternalMyDsl.g:725:1: ( ( rule__Create__ContentAssignment_8 )* )
            // InternalMyDsl.g:726:2: ( rule__Create__ContentAssignment_8 )*
            {
             before(grammarAccess.getCreateAccess().getContentAssignment_8()); 
            // InternalMyDsl.g:727:2: ( rule__Create__ContentAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:727:3: rule__Create__ContentAssignment_8
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
    // InternalMyDsl.g:735:1: rule__Create__Group__9 : rule__Create__Group__9__Impl ;
    public final void rule__Create__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( rule__Create__Group__9__Impl )
            // InternalMyDsl.g:740:2: rule__Create__Group__9__Impl
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
    // InternalMyDsl.g:746:1: rule__Create__Group__9__Impl : ( ']' ) ;
    public final void rule__Create__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( ']' ) )
            // InternalMyDsl.g:751:1: ( ']' )
            {
            // InternalMyDsl.g:751:1: ( ']' )
            // InternalMyDsl.g:752:2: ']'
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
    // InternalMyDsl.g:762:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalMyDsl.g:767:2: rule__Load__Group__0__Impl rule__Load__Group__1
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
    // InternalMyDsl.g:774:1: rule__Load__Group__0__Impl : ( 'LOAD' ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:778:1: ( ( 'LOAD' ) )
            // InternalMyDsl.g:779:1: ( 'LOAD' )
            {
            // InternalMyDsl.g:779:1: ( 'LOAD' )
            // InternalMyDsl.g:780:2: 'LOAD'
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
    // InternalMyDsl.g:789:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalMyDsl.g:794:2: rule__Load__Group__1__Impl rule__Load__Group__2
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
    // InternalMyDsl.g:801:1: rule__Load__Group__1__Impl : ( ( rule__Load__NameAssignment_1 ) ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:805:1: ( ( ( rule__Load__NameAssignment_1 ) ) )
            // InternalMyDsl.g:806:1: ( ( rule__Load__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:806:1: ( ( rule__Load__NameAssignment_1 ) )
            // InternalMyDsl.g:807:2: ( rule__Load__NameAssignment_1 )
            {
             before(grammarAccess.getLoadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:808:2: ( rule__Load__NameAssignment_1 )
            // InternalMyDsl.g:808:3: rule__Load__NameAssignment_1
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
    // InternalMyDsl.g:816:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalMyDsl.g:821:2: rule__Load__Group__2__Impl rule__Load__Group__3
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
    // InternalMyDsl.g:828:1: rule__Load__Group__2__Impl : ( '=' ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:832:1: ( ( '=' ) )
            // InternalMyDsl.g:833:1: ( '=' )
            {
            // InternalMyDsl.g:833:1: ( '=' )
            // InternalMyDsl.g:834:2: '='
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
    // InternalMyDsl.g:843:1: rule__Load__Group__3 : rule__Load__Group__3__Impl ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( rule__Load__Group__3__Impl )
            // InternalMyDsl.g:848:2: rule__Load__Group__3__Impl
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
    // InternalMyDsl.g:854:1: rule__Load__Group__3__Impl : ( ( rule__Load__PathAssignment_3 ) ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:858:1: ( ( ( rule__Load__PathAssignment_3 ) ) )
            // InternalMyDsl.g:859:1: ( ( rule__Load__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:859:1: ( ( rule__Load__PathAssignment_3 ) )
            // InternalMyDsl.g:860:2: ( rule__Load__PathAssignment_3 )
            {
             before(grammarAccess.getLoadAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:861:2: ( rule__Load__PathAssignment_3 )
            // InternalMyDsl.g:861:3: rule__Load__PathAssignment_3
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
    // InternalMyDsl.g:870:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalMyDsl.g:875:2: rule__Print__Group__0__Impl rule__Print__Group__1
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
    // InternalMyDsl.g:882:1: rule__Print__Group__0__Impl : ( 'PRINT' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:886:1: ( ( 'PRINT' ) )
            // InternalMyDsl.g:887:1: ( 'PRINT' )
            {
            // InternalMyDsl.g:887:1: ( 'PRINT' )
            // InternalMyDsl.g:888:2: 'PRINT'
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
    // InternalMyDsl.g:897:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( rule__Print__Group__1__Impl )
            // InternalMyDsl.g:902:2: rule__Print__Group__1__Impl
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
    // InternalMyDsl.g:908:1: rule__Print__Group__1__Impl : ( ( rule__Print__NameAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:912:1: ( ( ( rule__Print__NameAssignment_1 ) ) )
            // InternalMyDsl.g:913:1: ( ( rule__Print__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:913:1: ( ( rule__Print__NameAssignment_1 ) )
            // InternalMyDsl.g:914:2: ( rule__Print__NameAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:915:2: ( rule__Print__NameAssignment_1 )
            // InternalMyDsl.g:915:3: rule__Print__NameAssignment_1
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
    // InternalMyDsl.g:924:1: rule__Head__Group__0 : rule__Head__Group__0__Impl rule__Head__Group__1 ;
    public final void rule__Head__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( rule__Head__Group__0__Impl rule__Head__Group__1 )
            // InternalMyDsl.g:929:2: rule__Head__Group__0__Impl rule__Head__Group__1
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
    // InternalMyDsl.g:936:1: rule__Head__Group__0__Impl : ( 'HEAD' ) ;
    public final void rule__Head__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:940:1: ( ( 'HEAD' ) )
            // InternalMyDsl.g:941:1: ( 'HEAD' )
            {
            // InternalMyDsl.g:941:1: ( 'HEAD' )
            // InternalMyDsl.g:942:2: 'HEAD'
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
    // InternalMyDsl.g:951:1: rule__Head__Group__1 : rule__Head__Group__1__Impl ;
    public final void rule__Head__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( rule__Head__Group__1__Impl )
            // InternalMyDsl.g:956:2: rule__Head__Group__1__Impl
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
    // InternalMyDsl.g:962:1: rule__Head__Group__1__Impl : ( ( rule__Head__NameAssignment_1 ) ) ;
    public final void rule__Head__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:1: ( ( ( rule__Head__NameAssignment_1 ) ) )
            // InternalMyDsl.g:967:1: ( ( rule__Head__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:967:1: ( ( rule__Head__NameAssignment_1 ) )
            // InternalMyDsl.g:968:2: ( rule__Head__NameAssignment_1 )
            {
             before(grammarAccess.getHeadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:969:2: ( rule__Head__NameAssignment_1 )
            // InternalMyDsl.g:969:3: rule__Head__NameAssignment_1
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
    // InternalMyDsl.g:978:1: rule__InsertColumn__Group__0 : rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1 ;
    public final void rule__InsertColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1 )
            // InternalMyDsl.g:983:2: rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1
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
    // InternalMyDsl.g:990:1: rule__InsertColumn__Group__0__Impl : ( 'INSERT' ) ;
    public final void rule__InsertColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:994:1: ( ( 'INSERT' ) )
            // InternalMyDsl.g:995:1: ( 'INSERT' )
            {
            // InternalMyDsl.g:995:1: ( 'INSERT' )
            // InternalMyDsl.g:996:2: 'INSERT'
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
    // InternalMyDsl.g:1005:1: rule__InsertColumn__Group__1 : rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2 ;
    public final void rule__InsertColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2 )
            // InternalMyDsl.g:1010:2: rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2
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
    // InternalMyDsl.g:1017:1: rule__InsertColumn__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__InsertColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1021:1: ( ( 'COLUMN' ) )
            // InternalMyDsl.g:1022:1: ( 'COLUMN' )
            {
            // InternalMyDsl.g:1022:1: ( 'COLUMN' )
            // InternalMyDsl.g:1023:2: 'COLUMN'
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
    // InternalMyDsl.g:1032:1: rule__InsertColumn__Group__2 : rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3 ;
    public final void rule__InsertColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3 )
            // InternalMyDsl.g:1037:2: rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3
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
    // InternalMyDsl.g:1044:1: rule__InsertColumn__Group__2__Impl : ( ( rule__InsertColumn__NameAssignment_2 ) ) ;
    public final void rule__InsertColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1048:1: ( ( ( rule__InsertColumn__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1049:1: ( ( rule__InsertColumn__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1049:1: ( ( rule__InsertColumn__NameAssignment_2 ) )
            // InternalMyDsl.g:1050:2: ( rule__InsertColumn__NameAssignment_2 )
            {
             before(grammarAccess.getInsertColumnAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1051:2: ( rule__InsertColumn__NameAssignment_2 )
            // InternalMyDsl.g:1051:3: rule__InsertColumn__NameAssignment_2
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
    // InternalMyDsl.g:1059:1: rule__InsertColumn__Group__3 : rule__InsertColumn__Group__3__Impl ;
    public final void rule__InsertColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( rule__InsertColumn__Group__3__Impl )
            // InternalMyDsl.g:1064:2: rule__InsertColumn__Group__3__Impl
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
    // InternalMyDsl.g:1070:1: rule__InsertColumn__Group__3__Impl : ( ( rule__InsertColumn__ColumnAssignment_3 ) ) ;
    public final void rule__InsertColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( ( ( rule__InsertColumn__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:1075:1: ( ( rule__InsertColumn__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:1075:1: ( ( rule__InsertColumn__ColumnAssignment_3 ) )
            // InternalMyDsl.g:1076:2: ( rule__InsertColumn__ColumnAssignment_3 )
            {
             before(grammarAccess.getInsertColumnAccess().getColumnAssignment_3()); 
            // InternalMyDsl.g:1077:2: ( rule__InsertColumn__ColumnAssignment_3 )
            // InternalMyDsl.g:1077:3: rule__InsertColumn__ColumnAssignment_3
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
    // InternalMyDsl.g:1086:1: rule__ToCSV__Group__0 : rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 ;
    public final void rule__ToCSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 )
            // InternalMyDsl.g:1091:2: rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1
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
    // InternalMyDsl.g:1098:1: rule__ToCSV__Group__0__Impl : ( 'TO' ) ;
    public final void rule__ToCSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( 'TO' ) )
            // InternalMyDsl.g:1103:1: ( 'TO' )
            {
            // InternalMyDsl.g:1103:1: ( 'TO' )
            // InternalMyDsl.g:1104:2: 'TO'
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
    // InternalMyDsl.g:1113:1: rule__ToCSV__Group__1 : rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 ;
    public final void rule__ToCSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 )
            // InternalMyDsl.g:1118:2: rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2
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
    // InternalMyDsl.g:1125:1: rule__ToCSV__Group__1__Impl : ( 'CSV' ) ;
    public final void rule__ToCSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1129:1: ( ( 'CSV' ) )
            // InternalMyDsl.g:1130:1: ( 'CSV' )
            {
            // InternalMyDsl.g:1130:1: ( 'CSV' )
            // InternalMyDsl.g:1131:2: 'CSV'
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
    // InternalMyDsl.g:1140:1: rule__ToCSV__Group__2 : rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3 ;
    public final void rule__ToCSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3 )
            // InternalMyDsl.g:1145:2: rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3
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
    // InternalMyDsl.g:1152:1: rule__ToCSV__Group__2__Impl : ( ( rule__ToCSV__NameAssignment_2 ) ) ;
    public final void rule__ToCSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1156:1: ( ( ( rule__ToCSV__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1157:1: ( ( rule__ToCSV__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1157:1: ( ( rule__ToCSV__NameAssignment_2 ) )
            // InternalMyDsl.g:1158:2: ( rule__ToCSV__NameAssignment_2 )
            {
             before(grammarAccess.getToCSVAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1159:2: ( rule__ToCSV__NameAssignment_2 )
            // InternalMyDsl.g:1159:3: rule__ToCSV__NameAssignment_2
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
    // InternalMyDsl.g:1167:1: rule__ToCSV__Group__3 : rule__ToCSV__Group__3__Impl ;
    public final void rule__ToCSV__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( rule__ToCSV__Group__3__Impl )
            // InternalMyDsl.g:1172:2: rule__ToCSV__Group__3__Impl
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
    // InternalMyDsl.g:1178:1: rule__ToCSV__Group__3__Impl : ( ( rule__ToCSV__PathAssignment_3 ) ) ;
    public final void rule__ToCSV__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( ( ( rule__ToCSV__PathAssignment_3 ) ) )
            // InternalMyDsl.g:1183:1: ( ( rule__ToCSV__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:1183:1: ( ( rule__ToCSV__PathAssignment_3 ) )
            // InternalMyDsl.g:1184:2: ( rule__ToCSV__PathAssignment_3 )
            {
             before(grammarAccess.getToCSVAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:1185:2: ( rule__ToCSV__PathAssignment_3 )
            // InternalMyDsl.g:1185:3: rule__ToCSV__PathAssignment_3
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
    // InternalMyDsl.g:1194:1: rule__DropColumn__Group__0 : rule__DropColumn__Group__0__Impl rule__DropColumn__Group__1 ;
    public final void rule__DropColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( rule__DropColumn__Group__0__Impl rule__DropColumn__Group__1 )
            // InternalMyDsl.g:1199:2: rule__DropColumn__Group__0__Impl rule__DropColumn__Group__1
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
    // InternalMyDsl.g:1206:1: rule__DropColumn__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__DropColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1210:1: ( ( 'DROP' ) )
            // InternalMyDsl.g:1211:1: ( 'DROP' )
            {
            // InternalMyDsl.g:1211:1: ( 'DROP' )
            // InternalMyDsl.g:1212:2: 'DROP'
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
    // InternalMyDsl.g:1221:1: rule__DropColumn__Group__1 : rule__DropColumn__Group__1__Impl rule__DropColumn__Group__2 ;
    public final void rule__DropColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( rule__DropColumn__Group__1__Impl rule__DropColumn__Group__2 )
            // InternalMyDsl.g:1226:2: rule__DropColumn__Group__1__Impl rule__DropColumn__Group__2
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
    // InternalMyDsl.g:1233:1: rule__DropColumn__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__DropColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( ( 'COLUMN' ) )
            // InternalMyDsl.g:1238:1: ( 'COLUMN' )
            {
            // InternalMyDsl.g:1238:1: ( 'COLUMN' )
            // InternalMyDsl.g:1239:2: 'COLUMN'
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
    // InternalMyDsl.g:1248:1: rule__DropColumn__Group__2 : rule__DropColumn__Group__2__Impl rule__DropColumn__Group__3 ;
    public final void rule__DropColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( rule__DropColumn__Group__2__Impl rule__DropColumn__Group__3 )
            // InternalMyDsl.g:1253:2: rule__DropColumn__Group__2__Impl rule__DropColumn__Group__3
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
    // InternalMyDsl.g:1260:1: rule__DropColumn__Group__2__Impl : ( ( rule__DropColumn__NameAssignment_2 ) ) ;
    public final void rule__DropColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1264:1: ( ( ( rule__DropColumn__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1265:1: ( ( rule__DropColumn__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1265:1: ( ( rule__DropColumn__NameAssignment_2 ) )
            // InternalMyDsl.g:1266:2: ( rule__DropColumn__NameAssignment_2 )
            {
             before(grammarAccess.getDropColumnAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1267:2: ( rule__DropColumn__NameAssignment_2 )
            // InternalMyDsl.g:1267:3: rule__DropColumn__NameAssignment_2
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
    // InternalMyDsl.g:1275:1: rule__DropColumn__Group__3 : rule__DropColumn__Group__3__Impl ;
    public final void rule__DropColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( rule__DropColumn__Group__3__Impl )
            // InternalMyDsl.g:1280:2: rule__DropColumn__Group__3__Impl
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
    // InternalMyDsl.g:1286:1: rule__DropColumn__Group__3__Impl : ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) ) ;
    public final void rule__DropColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1290:1: ( ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) ) )
            // InternalMyDsl.g:1291:1: ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) )
            {
            // InternalMyDsl.g:1291:1: ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) )
            // InternalMyDsl.g:1292:2: ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* )
            {
            // InternalMyDsl.g:1292:2: ( ( rule__DropColumn__ColumnsAssignment_3 ) )
            // InternalMyDsl.g:1293:3: ( rule__DropColumn__ColumnsAssignment_3 )
            {
             before(grammarAccess.getDropColumnAccess().getColumnsAssignment_3()); 
            // InternalMyDsl.g:1294:3: ( rule__DropColumn__ColumnsAssignment_3 )
            // InternalMyDsl.g:1294:4: rule__DropColumn__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__DropColumn__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDropColumnAccess().getColumnsAssignment_3()); 

            }

            // InternalMyDsl.g:1297:2: ( ( rule__DropColumn__ColumnsAssignment_3 )* )
            // InternalMyDsl.g:1298:3: ( rule__DropColumn__ColumnsAssignment_3 )*
            {
             before(grammarAccess.getDropColumnAccess().getColumnsAssignment_3()); 
            // InternalMyDsl.g:1299:3: ( rule__DropColumn__ColumnsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1299:4: rule__DropColumn__ColumnsAssignment_3
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


    // $ANTLR start "rule__DropRow__Group__0"
    // InternalMyDsl.g:1309:1: rule__DropRow__Group__0 : rule__DropRow__Group__0__Impl rule__DropRow__Group__1 ;
    public final void rule__DropRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( rule__DropRow__Group__0__Impl rule__DropRow__Group__1 )
            // InternalMyDsl.g:1314:2: rule__DropRow__Group__0__Impl rule__DropRow__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__DropRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropRow__Group__1();

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
    // $ANTLR end "rule__DropRow__Group__0"


    // $ANTLR start "rule__DropRow__Group__0__Impl"
    // InternalMyDsl.g:1321:1: rule__DropRow__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__DropRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( ( 'DROP' ) )
            // InternalMyDsl.g:1326:1: ( 'DROP' )
            {
            // InternalMyDsl.g:1326:1: ( 'DROP' )
            // InternalMyDsl.g:1327:2: 'DROP'
            {
             before(grammarAccess.getDropRowAccess().getDROPKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDropRowAccess().getDROPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropRow__Group__0__Impl"


    // $ANTLR start "rule__DropRow__Group__1"
    // InternalMyDsl.g:1336:1: rule__DropRow__Group__1 : rule__DropRow__Group__1__Impl rule__DropRow__Group__2 ;
    public final void rule__DropRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( rule__DropRow__Group__1__Impl rule__DropRow__Group__2 )
            // InternalMyDsl.g:1341:2: rule__DropRow__Group__1__Impl rule__DropRow__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DropRow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropRow__Group__2();

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
    // $ANTLR end "rule__DropRow__Group__1"


    // $ANTLR start "rule__DropRow__Group__1__Impl"
    // InternalMyDsl.g:1348:1: rule__DropRow__Group__1__Impl : ( 'ROW' ) ;
    public final void rule__DropRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( ( 'ROW' ) )
            // InternalMyDsl.g:1353:1: ( 'ROW' )
            {
            // InternalMyDsl.g:1353:1: ( 'ROW' )
            // InternalMyDsl.g:1354:2: 'ROW'
            {
             before(grammarAccess.getDropRowAccess().getROWKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDropRowAccess().getROWKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropRow__Group__1__Impl"


    // $ANTLR start "rule__DropRow__Group__2"
    // InternalMyDsl.g:1363:1: rule__DropRow__Group__2 : rule__DropRow__Group__2__Impl rule__DropRow__Group__3 ;
    public final void rule__DropRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( rule__DropRow__Group__2__Impl rule__DropRow__Group__3 )
            // InternalMyDsl.g:1368:2: rule__DropRow__Group__2__Impl rule__DropRow__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__DropRow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DropRow__Group__3();

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
    // $ANTLR end "rule__DropRow__Group__2"


    // $ANTLR start "rule__DropRow__Group__2__Impl"
    // InternalMyDsl.g:1375:1: rule__DropRow__Group__2__Impl : ( ( rule__DropRow__NameAssignment_2 ) ) ;
    public final void rule__DropRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( ( ( rule__DropRow__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1380:1: ( ( rule__DropRow__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1380:1: ( ( rule__DropRow__NameAssignment_2 ) )
            // InternalMyDsl.g:1381:2: ( rule__DropRow__NameAssignment_2 )
            {
             before(grammarAccess.getDropRowAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1382:2: ( rule__DropRow__NameAssignment_2 )
            // InternalMyDsl.g:1382:3: rule__DropRow__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DropRow__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDropRowAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropRow__Group__2__Impl"


    // $ANTLR start "rule__DropRow__Group__3"
    // InternalMyDsl.g:1390:1: rule__DropRow__Group__3 : rule__DropRow__Group__3__Impl ;
    public final void rule__DropRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( rule__DropRow__Group__3__Impl )
            // InternalMyDsl.g:1395:2: rule__DropRow__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DropRow__Group__3__Impl();

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
    // $ANTLR end "rule__DropRow__Group__3"


    // $ANTLR start "rule__DropRow__Group__3__Impl"
    // InternalMyDsl.g:1401:1: rule__DropRow__Group__3__Impl : ( ( ( rule__DropRow__RowsAssignment_3 ) ) ( ( rule__DropRow__RowsAssignment_3 )* ) ) ;
    public final void rule__DropRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( ( ( ( rule__DropRow__RowsAssignment_3 ) ) ( ( rule__DropRow__RowsAssignment_3 )* ) ) )
            // InternalMyDsl.g:1406:1: ( ( ( rule__DropRow__RowsAssignment_3 ) ) ( ( rule__DropRow__RowsAssignment_3 )* ) )
            {
            // InternalMyDsl.g:1406:1: ( ( ( rule__DropRow__RowsAssignment_3 ) ) ( ( rule__DropRow__RowsAssignment_3 )* ) )
            // InternalMyDsl.g:1407:2: ( ( rule__DropRow__RowsAssignment_3 ) ) ( ( rule__DropRow__RowsAssignment_3 )* )
            {
            // InternalMyDsl.g:1407:2: ( ( rule__DropRow__RowsAssignment_3 ) )
            // InternalMyDsl.g:1408:3: ( rule__DropRow__RowsAssignment_3 )
            {
             before(grammarAccess.getDropRowAccess().getRowsAssignment_3()); 
            // InternalMyDsl.g:1409:3: ( rule__DropRow__RowsAssignment_3 )
            // InternalMyDsl.g:1409:4: rule__DropRow__RowsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__DropRow__RowsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDropRowAccess().getRowsAssignment_3()); 

            }

            // InternalMyDsl.g:1412:2: ( ( rule__DropRow__RowsAssignment_3 )* )
            // InternalMyDsl.g:1413:3: ( rule__DropRow__RowsAssignment_3 )*
            {
             before(grammarAccess.getDropRowAccess().getRowsAssignment_3()); 
            // InternalMyDsl.g:1414:3: ( rule__DropRow__RowsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1414:4: rule__DropRow__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DropRow__RowsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDropRowAccess().getRowsAssignment_3()); 

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
    // $ANTLR end "rule__DropRow__Group__3__Impl"


    // $ANTLR start "rule__Model__CommandsAssignment"
    // InternalMyDsl.g:1424:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:1429:2: ( ruleCommand )
            {
            // InternalMyDsl.g:1429:2: ( ruleCommand )
            // InternalMyDsl.g:1430:3: ruleCommand
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
    // InternalMyDsl.g:1439:1: rule__Content__FieldsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Content__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1443:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1444:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1444:2: ( RULE_STRING )
            // InternalMyDsl.g:1445:3: RULE_STRING
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
    // InternalMyDsl.g:1454:1: rule__Create__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Create__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1459:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1459:2: ( RULE_STRING )
            // InternalMyDsl.g:1460:3: RULE_STRING
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
    // InternalMyDsl.g:1469:1: rule__Create__ColumnsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Create__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1474:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1474:2: ( RULE_STRING )
            // InternalMyDsl.g:1475:3: RULE_STRING
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
    // InternalMyDsl.g:1484:1: rule__Create__ContentAssignment_8 : ( ruleContent ) ;
    public final void rule__Create__ContentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( ( ruleContent ) )
            // InternalMyDsl.g:1489:2: ( ruleContent )
            {
            // InternalMyDsl.g:1489:2: ( ruleContent )
            // InternalMyDsl.g:1490:3: ruleContent
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
    // InternalMyDsl.g:1499:1: rule__Load__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Load__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1504:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1504:2: ( RULE_ID )
            // InternalMyDsl.g:1505:3: RULE_ID
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
    // InternalMyDsl.g:1514:1: rule__Load__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Load__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1518:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1519:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1519:2: ( RULE_STRING )
            // InternalMyDsl.g:1520:3: RULE_STRING
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
    // InternalMyDsl.g:1529:1: rule__Print__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Print__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1534:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1534:2: ( RULE_STRING )
            // InternalMyDsl.g:1535:3: RULE_STRING
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
    // InternalMyDsl.g:1544:1: rule__Head__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Head__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1549:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1549:2: ( RULE_ID )
            // InternalMyDsl.g:1550:3: RULE_ID
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
    // InternalMyDsl.g:1559:1: rule__InsertColumn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InsertColumn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1564:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1564:2: ( RULE_ID )
            // InternalMyDsl.g:1565:3: RULE_ID
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
    // InternalMyDsl.g:1574:1: rule__InsertColumn__ColumnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InsertColumn__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1578:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1579:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1579:2: ( RULE_STRING )
            // InternalMyDsl.g:1580:3: RULE_STRING
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
    // InternalMyDsl.g:1589:1: rule__ToCSV__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ToCSV__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1593:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1594:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1594:2: ( RULE_ID )
            // InternalMyDsl.g:1595:3: RULE_ID
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
    // InternalMyDsl.g:1604:1: rule__ToCSV__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ToCSV__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1609:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1609:2: ( RULE_STRING )
            // InternalMyDsl.g:1610:3: RULE_STRING
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
    // InternalMyDsl.g:1619:1: rule__DropColumn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DropColumn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1624:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1624:2: ( RULE_ID )
            // InternalMyDsl.g:1625:3: RULE_ID
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
    // InternalMyDsl.g:1634:1: rule__DropColumn__ColumnsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DropColumn__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1639:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1639:2: ( RULE_STRING )
            // InternalMyDsl.g:1640:3: RULE_STRING
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


    // $ANTLR start "rule__DropRow__NameAssignment_2"
    // InternalMyDsl.g:1649:1: rule__DropRow__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DropRow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1653:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1654:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1654:2: ( RULE_ID )
            // InternalMyDsl.g:1655:3: RULE_ID
            {
             before(grammarAccess.getDropRowAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDropRowAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropRow__NameAssignment_2"


    // $ANTLR start "rule__DropRow__RowsAssignment_3"
    // InternalMyDsl.g:1664:1: rule__DropRow__RowsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DropRow__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1668:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1669:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1669:2: ( RULE_STRING )
            // InternalMyDsl.g:1670:3: RULE_STRING
            {
             before(grammarAccess.getDropRowAccess().getRowsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDropRowAccess().getRowsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DropRow__RowsAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\15\6\uffff\1\24\2\uffff";
    static final String dfa_3s = "\1\27\6\uffff\1\30\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\7";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\uffff\1\6\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\3\uffff\1\10",
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
            return "327:1: rule__Command__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) | ( ruleInsertColumn ) | ( ruleToCSV ) | ( ruleDropColumn ) | ( ruleDropRow ) );";
        }
    }
 

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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});

}