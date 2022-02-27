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

                if ( (LA1_0==13||LA1_0==15||(LA1_0>=17 && LA1_0<=19)||LA1_0==21||LA1_0==23||LA1_0==25) ) {
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


    // $ANTLR start "entryRuleInsertRow"
    // InternalMyDsl.g:328:1: entryRuleInsertRow : ruleInsertRow EOF ;
    public final void entryRuleInsertRow() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleInsertRow EOF )
            // InternalMyDsl.g:330:1: ruleInsertRow EOF
            {
             before(grammarAccess.getInsertRowRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertRow();

            state._fsp--;

             after(grammarAccess.getInsertRowRule()); 
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
    // $ANTLR end "entryRuleInsertRow"


    // $ANTLR start "ruleInsertRow"
    // InternalMyDsl.g:337:1: ruleInsertRow : ( ( rule__InsertRow__Group__0 ) ) ;
    public final void ruleInsertRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__InsertRow__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__InsertRow__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__InsertRow__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__InsertRow__Group__0 )
            {
             before(grammarAccess.getInsertRowAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__InsertRow__Group__0 )
            // InternalMyDsl.g:344:4: rule__InsertRow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertRow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsertRow"


    // $ANTLR start "entryRuleGetColumn"
    // InternalMyDsl.g:353:1: entryRuleGetColumn : ruleGetColumn EOF ;
    public final void entryRuleGetColumn() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleGetColumn EOF )
            // InternalMyDsl.g:355:1: ruleGetColumn EOF
            {
             before(grammarAccess.getGetColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleGetColumn();

            state._fsp--;

             after(grammarAccess.getGetColumnRule()); 
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
    // $ANTLR end "entryRuleGetColumn"


    // $ANTLR start "ruleGetColumn"
    // InternalMyDsl.g:362:1: ruleGetColumn : ( ( rule__GetColumn__Group__0 ) ) ;
    public final void ruleGetColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__GetColumn__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__GetColumn__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__GetColumn__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__GetColumn__Group__0 )
            {
             before(grammarAccess.getGetColumnAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__GetColumn__Group__0 )
            // InternalMyDsl.g:369:4: rule__GetColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetColumn"


    // $ANTLR start "entryRuleGetRow"
    // InternalMyDsl.g:378:1: entryRuleGetRow : ruleGetRow EOF ;
    public final void entryRuleGetRow() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleGetRow EOF )
            // InternalMyDsl.g:380:1: ruleGetRow EOF
            {
             before(grammarAccess.getGetRowRule()); 
            pushFollow(FOLLOW_1);
            ruleGetRow();

            state._fsp--;

             after(grammarAccess.getGetRowRule()); 
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
    // $ANTLR end "entryRuleGetRow"


    // $ANTLR start "ruleGetRow"
    // InternalMyDsl.g:387:1: ruleGetRow : ( ( rule__GetRow__Group__0 ) ) ;
    public final void ruleGetRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__GetRow__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__GetRow__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__GetRow__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__GetRow__Group__0 )
            {
             before(grammarAccess.getGetRowAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__GetRow__Group__0 )
            // InternalMyDsl.g:394:4: rule__GetRow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GetRow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetRow"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalMyDsl.g:402:1: rule__Command__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) | ( ruleInsertColumn ) | ( ruleToCSV ) | ( ruleDropColumn ) | ( ruleDropRow ) | ( ruleInsertRow ) | ( ruleGetColumn ) | ( ruleGetRow ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) | ( ruleInsertColumn ) | ( ruleToCSV ) | ( ruleDropColumn ) | ( ruleDropRow ) | ( ruleInsertRow ) | ( ruleGetColumn ) | ( ruleGetRow ) )
            int alt2=11;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:407:2: ( ruleCreate )
                    {
                    // InternalMyDsl.g:407:2: ( ruleCreate )
                    // InternalMyDsl.g:408:3: ruleCreate
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
                    // InternalMyDsl.g:413:2: ( ruleLoad )
                    {
                    // InternalMyDsl.g:413:2: ( ruleLoad )
                    // InternalMyDsl.g:414:3: ruleLoad
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
                    // InternalMyDsl.g:419:2: ( rulePrint )
                    {
                    // InternalMyDsl.g:419:2: ( rulePrint )
                    // InternalMyDsl.g:420:3: rulePrint
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
                    // InternalMyDsl.g:425:2: ( ruleHead )
                    {
                    // InternalMyDsl.g:425:2: ( ruleHead )
                    // InternalMyDsl.g:426:3: ruleHead
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
                    // InternalMyDsl.g:431:2: ( ruleInsertColumn )
                    {
                    // InternalMyDsl.g:431:2: ( ruleInsertColumn )
                    // InternalMyDsl.g:432:3: ruleInsertColumn
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
                    // InternalMyDsl.g:437:2: ( ruleToCSV )
                    {
                    // InternalMyDsl.g:437:2: ( ruleToCSV )
                    // InternalMyDsl.g:438:3: ruleToCSV
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
                    // InternalMyDsl.g:443:2: ( ruleDropColumn )
                    {
                    // InternalMyDsl.g:443:2: ( ruleDropColumn )
                    // InternalMyDsl.g:444:3: ruleDropColumn
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
                    // InternalMyDsl.g:449:2: ( ruleDropRow )
                    {
                    // InternalMyDsl.g:449:2: ( ruleDropRow )
                    // InternalMyDsl.g:450:3: ruleDropRow
                    {
                     before(grammarAccess.getCommandAccess().getDropRowParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleDropRow();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getDropRowParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:455:2: ( ruleInsertRow )
                    {
                    // InternalMyDsl.g:455:2: ( ruleInsertRow )
                    // InternalMyDsl.g:456:3: ruleInsertRow
                    {
                     before(grammarAccess.getCommandAccess().getInsertRowParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertRow();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getInsertRowParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:461:2: ( ruleGetColumn )
                    {
                    // InternalMyDsl.g:461:2: ( ruleGetColumn )
                    // InternalMyDsl.g:462:3: ruleGetColumn
                    {
                     before(grammarAccess.getCommandAccess().getGetColumnParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleGetColumn();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getGetColumnParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:467:2: ( ruleGetRow )
                    {
                    // InternalMyDsl.g:467:2: ( ruleGetRow )
                    // InternalMyDsl.g:468:3: ruleGetRow
                    {
                     before(grammarAccess.getCommandAccess().getGetRowParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleGetRow();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getGetRowParserRuleCall_10()); 

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
    // InternalMyDsl.g:477:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // InternalMyDsl.g:482:2: rule__Content__Group__0__Impl rule__Content__Group__1
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
    // InternalMyDsl.g:489:1: rule__Content__Group__0__Impl : ( () ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:493:1: ( ( () ) )
            // InternalMyDsl.g:494:1: ( () )
            {
            // InternalMyDsl.g:494:1: ( () )
            // InternalMyDsl.g:495:2: ()
            {
             before(grammarAccess.getContentAccess().getContentAction_0()); 
            // InternalMyDsl.g:496:2: ()
            // InternalMyDsl.g:496:3: 
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
    // InternalMyDsl.g:504:1: rule__Content__Group__1 : rule__Content__Group__1__Impl rule__Content__Group__2 ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:1: ( rule__Content__Group__1__Impl rule__Content__Group__2 )
            // InternalMyDsl.g:509:2: rule__Content__Group__1__Impl rule__Content__Group__2
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
    // InternalMyDsl.g:516:1: rule__Content__Group__1__Impl : ( '[' ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:520:1: ( ( '[' ) )
            // InternalMyDsl.g:521:1: ( '[' )
            {
            // InternalMyDsl.g:521:1: ( '[' )
            // InternalMyDsl.g:522:2: '['
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
    // InternalMyDsl.g:531:1: rule__Content__Group__2 : rule__Content__Group__2__Impl rule__Content__Group__3 ;
    public final void rule__Content__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( rule__Content__Group__2__Impl rule__Content__Group__3 )
            // InternalMyDsl.g:536:2: rule__Content__Group__2__Impl rule__Content__Group__3
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
    // InternalMyDsl.g:543:1: rule__Content__Group__2__Impl : ( ( rule__Content__FieldsAssignment_2 )* ) ;
    public final void rule__Content__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:547:1: ( ( ( rule__Content__FieldsAssignment_2 )* ) )
            // InternalMyDsl.g:548:1: ( ( rule__Content__FieldsAssignment_2 )* )
            {
            // InternalMyDsl.g:548:1: ( ( rule__Content__FieldsAssignment_2 )* )
            // InternalMyDsl.g:549:2: ( rule__Content__FieldsAssignment_2 )*
            {
             before(grammarAccess.getContentAccess().getFieldsAssignment_2()); 
            // InternalMyDsl.g:550:2: ( rule__Content__FieldsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:550:3: rule__Content__FieldsAssignment_2
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
    // InternalMyDsl.g:558:1: rule__Content__Group__3 : rule__Content__Group__3__Impl ;
    public final void rule__Content__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:562:1: ( rule__Content__Group__3__Impl )
            // InternalMyDsl.g:563:2: rule__Content__Group__3__Impl
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
    // InternalMyDsl.g:569:1: rule__Content__Group__3__Impl : ( ']' ) ;
    public final void rule__Content__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:573:1: ( ( ']' ) )
            // InternalMyDsl.g:574:1: ( ']' )
            {
            // InternalMyDsl.g:574:1: ( ']' )
            // InternalMyDsl.g:575:2: ']'
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
    // InternalMyDsl.g:585:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalMyDsl.g:590:2: rule__Create__Group__0__Impl rule__Create__Group__1
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
    // InternalMyDsl.g:597:1: rule__Create__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:601:1: ( ( 'CREATE' ) )
            // InternalMyDsl.g:602:1: ( 'CREATE' )
            {
            // InternalMyDsl.g:602:1: ( 'CREATE' )
            // InternalMyDsl.g:603:2: 'CREATE'
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
    // InternalMyDsl.g:612:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalMyDsl.g:617:2: rule__Create__Group__1__Impl rule__Create__Group__2
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
    // InternalMyDsl.g:624:1: rule__Create__Group__1__Impl : ( ( rule__Create__PathAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:628:1: ( ( ( rule__Create__PathAssignment_1 ) ) )
            // InternalMyDsl.g:629:1: ( ( rule__Create__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:629:1: ( ( rule__Create__PathAssignment_1 ) )
            // InternalMyDsl.g:630:2: ( rule__Create__PathAssignment_1 )
            {
             before(grammarAccess.getCreateAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:631:2: ( rule__Create__PathAssignment_1 )
            // InternalMyDsl.g:631:3: rule__Create__PathAssignment_1
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
    // InternalMyDsl.g:639:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:643:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalMyDsl.g:644:2: rule__Create__Group__2__Impl rule__Create__Group__3
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
    // InternalMyDsl.g:651:1: rule__Create__Group__2__Impl : ( ':' ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:655:1: ( ( ':' ) )
            // InternalMyDsl.g:656:1: ( ':' )
            {
            // InternalMyDsl.g:656:1: ( ':' )
            // InternalMyDsl.g:657:2: ':'
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
    // InternalMyDsl.g:666:1: rule__Create__Group__3 : rule__Create__Group__3__Impl rule__Create__Group__4 ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:670:1: ( rule__Create__Group__3__Impl rule__Create__Group__4 )
            // InternalMyDsl.g:671:2: rule__Create__Group__3__Impl rule__Create__Group__4
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
    // InternalMyDsl.g:678:1: rule__Create__Group__3__Impl : ( '[' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:682:1: ( ( '[' ) )
            // InternalMyDsl.g:683:1: ( '[' )
            {
            // InternalMyDsl.g:683:1: ( '[' )
            // InternalMyDsl.g:684:2: '['
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
    // InternalMyDsl.g:693:1: rule__Create__Group__4 : rule__Create__Group__4__Impl rule__Create__Group__5 ;
    public final void rule__Create__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:697:1: ( rule__Create__Group__4__Impl rule__Create__Group__5 )
            // InternalMyDsl.g:698:2: rule__Create__Group__4__Impl rule__Create__Group__5
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
    // InternalMyDsl.g:705:1: rule__Create__Group__4__Impl : ( ( rule__Create__ColumnsAssignment_4 )* ) ;
    public final void rule__Create__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:709:1: ( ( ( rule__Create__ColumnsAssignment_4 )* ) )
            // InternalMyDsl.g:710:1: ( ( rule__Create__ColumnsAssignment_4 )* )
            {
            // InternalMyDsl.g:710:1: ( ( rule__Create__ColumnsAssignment_4 )* )
            // InternalMyDsl.g:711:2: ( rule__Create__ColumnsAssignment_4 )*
            {
             before(grammarAccess.getCreateAccess().getColumnsAssignment_4()); 
            // InternalMyDsl.g:712:2: ( rule__Create__ColumnsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:712:3: rule__Create__ColumnsAssignment_4
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
    // InternalMyDsl.g:720:1: rule__Create__Group__5 : rule__Create__Group__5__Impl rule__Create__Group__6 ;
    public final void rule__Create__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:724:1: ( rule__Create__Group__5__Impl rule__Create__Group__6 )
            // InternalMyDsl.g:725:2: rule__Create__Group__5__Impl rule__Create__Group__6
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
    // InternalMyDsl.g:732:1: rule__Create__Group__5__Impl : ( ']' ) ;
    public final void rule__Create__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:736:1: ( ( ']' ) )
            // InternalMyDsl.g:737:1: ( ']' )
            {
            // InternalMyDsl.g:737:1: ( ']' )
            // InternalMyDsl.g:738:2: ']'
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
    // InternalMyDsl.g:747:1: rule__Create__Group__6 : rule__Create__Group__6__Impl rule__Create__Group__7 ;
    public final void rule__Create__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( rule__Create__Group__6__Impl rule__Create__Group__7 )
            // InternalMyDsl.g:752:2: rule__Create__Group__6__Impl rule__Create__Group__7
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
    // InternalMyDsl.g:759:1: rule__Create__Group__6__Impl : ( ':' ) ;
    public final void rule__Create__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:763:1: ( ( ':' ) )
            // InternalMyDsl.g:764:1: ( ':' )
            {
            // InternalMyDsl.g:764:1: ( ':' )
            // InternalMyDsl.g:765:2: ':'
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
    // InternalMyDsl.g:774:1: rule__Create__Group__7 : rule__Create__Group__7__Impl rule__Create__Group__8 ;
    public final void rule__Create__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:778:1: ( rule__Create__Group__7__Impl rule__Create__Group__8 )
            // InternalMyDsl.g:779:2: rule__Create__Group__7__Impl rule__Create__Group__8
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
    // InternalMyDsl.g:786:1: rule__Create__Group__7__Impl : ( '[' ) ;
    public final void rule__Create__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:790:1: ( ( '[' ) )
            // InternalMyDsl.g:791:1: ( '[' )
            {
            // InternalMyDsl.g:791:1: ( '[' )
            // InternalMyDsl.g:792:2: '['
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
    // InternalMyDsl.g:801:1: rule__Create__Group__8 : rule__Create__Group__8__Impl rule__Create__Group__9 ;
    public final void rule__Create__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:805:1: ( rule__Create__Group__8__Impl rule__Create__Group__9 )
            // InternalMyDsl.g:806:2: rule__Create__Group__8__Impl rule__Create__Group__9
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
    // InternalMyDsl.g:813:1: rule__Create__Group__8__Impl : ( ( rule__Create__ContentAssignment_8 )* ) ;
    public final void rule__Create__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:1: ( ( ( rule__Create__ContentAssignment_8 )* ) )
            // InternalMyDsl.g:818:1: ( ( rule__Create__ContentAssignment_8 )* )
            {
            // InternalMyDsl.g:818:1: ( ( rule__Create__ContentAssignment_8 )* )
            // InternalMyDsl.g:819:2: ( rule__Create__ContentAssignment_8 )*
            {
             before(grammarAccess.getCreateAccess().getContentAssignment_8()); 
            // InternalMyDsl.g:820:2: ( rule__Create__ContentAssignment_8 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:820:3: rule__Create__ContentAssignment_8
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
    // InternalMyDsl.g:828:1: rule__Create__Group__9 : rule__Create__Group__9__Impl ;
    public final void rule__Create__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:832:1: ( rule__Create__Group__9__Impl )
            // InternalMyDsl.g:833:2: rule__Create__Group__9__Impl
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
    // InternalMyDsl.g:839:1: rule__Create__Group__9__Impl : ( ']' ) ;
    public final void rule__Create__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:843:1: ( ( ']' ) )
            // InternalMyDsl.g:844:1: ( ']' )
            {
            // InternalMyDsl.g:844:1: ( ']' )
            // InternalMyDsl.g:845:2: ']'
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
    // InternalMyDsl.g:855:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:859:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalMyDsl.g:860:2: rule__Load__Group__0__Impl rule__Load__Group__1
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
    // InternalMyDsl.g:867:1: rule__Load__Group__0__Impl : ( 'LOAD' ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:871:1: ( ( 'LOAD' ) )
            // InternalMyDsl.g:872:1: ( 'LOAD' )
            {
            // InternalMyDsl.g:872:1: ( 'LOAD' )
            // InternalMyDsl.g:873:2: 'LOAD'
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
    // InternalMyDsl.g:882:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:886:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalMyDsl.g:887:2: rule__Load__Group__1__Impl rule__Load__Group__2
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
    // InternalMyDsl.g:894:1: rule__Load__Group__1__Impl : ( ( rule__Load__NameAssignment_1 ) ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( ( ( rule__Load__NameAssignment_1 ) ) )
            // InternalMyDsl.g:899:1: ( ( rule__Load__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:899:1: ( ( rule__Load__NameAssignment_1 ) )
            // InternalMyDsl.g:900:2: ( rule__Load__NameAssignment_1 )
            {
             before(grammarAccess.getLoadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:901:2: ( rule__Load__NameAssignment_1 )
            // InternalMyDsl.g:901:3: rule__Load__NameAssignment_1
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
    // InternalMyDsl.g:909:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalMyDsl.g:914:2: rule__Load__Group__2__Impl rule__Load__Group__3
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
    // InternalMyDsl.g:921:1: rule__Load__Group__2__Impl : ( '=' ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:925:1: ( ( '=' ) )
            // InternalMyDsl.g:926:1: ( '=' )
            {
            // InternalMyDsl.g:926:1: ( '=' )
            // InternalMyDsl.g:927:2: '='
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
    // InternalMyDsl.g:936:1: rule__Load__Group__3 : rule__Load__Group__3__Impl ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:940:1: ( rule__Load__Group__3__Impl )
            // InternalMyDsl.g:941:2: rule__Load__Group__3__Impl
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
    // InternalMyDsl.g:947:1: rule__Load__Group__3__Impl : ( ( rule__Load__PathAssignment_3 ) ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:951:1: ( ( ( rule__Load__PathAssignment_3 ) ) )
            // InternalMyDsl.g:952:1: ( ( rule__Load__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:952:1: ( ( rule__Load__PathAssignment_3 ) )
            // InternalMyDsl.g:953:2: ( rule__Load__PathAssignment_3 )
            {
             before(grammarAccess.getLoadAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:954:2: ( rule__Load__PathAssignment_3 )
            // InternalMyDsl.g:954:3: rule__Load__PathAssignment_3
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
    // InternalMyDsl.g:963:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:967:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalMyDsl.g:968:2: rule__Print__Group__0__Impl rule__Print__Group__1
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
    // InternalMyDsl.g:975:1: rule__Print__Group__0__Impl : ( 'PRINT' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:979:1: ( ( 'PRINT' ) )
            // InternalMyDsl.g:980:1: ( 'PRINT' )
            {
            // InternalMyDsl.g:980:1: ( 'PRINT' )
            // InternalMyDsl.g:981:2: 'PRINT'
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
    // InternalMyDsl.g:990:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:994:1: ( rule__Print__Group__1__Impl )
            // InternalMyDsl.g:995:2: rule__Print__Group__1__Impl
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
    // InternalMyDsl.g:1001:1: rule__Print__Group__1__Impl : ( ( rule__Print__NameAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1005:1: ( ( ( rule__Print__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1006:1: ( ( rule__Print__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1006:1: ( ( rule__Print__NameAssignment_1 ) )
            // InternalMyDsl.g:1007:2: ( rule__Print__NameAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1008:2: ( rule__Print__NameAssignment_1 )
            // InternalMyDsl.g:1008:3: rule__Print__NameAssignment_1
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
    // InternalMyDsl.g:1017:1: rule__Head__Group__0 : rule__Head__Group__0__Impl rule__Head__Group__1 ;
    public final void rule__Head__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1021:1: ( rule__Head__Group__0__Impl rule__Head__Group__1 )
            // InternalMyDsl.g:1022:2: rule__Head__Group__0__Impl rule__Head__Group__1
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
    // InternalMyDsl.g:1029:1: rule__Head__Group__0__Impl : ( 'HEAD' ) ;
    public final void rule__Head__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1033:1: ( ( 'HEAD' ) )
            // InternalMyDsl.g:1034:1: ( 'HEAD' )
            {
            // InternalMyDsl.g:1034:1: ( 'HEAD' )
            // InternalMyDsl.g:1035:2: 'HEAD'
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
    // InternalMyDsl.g:1044:1: rule__Head__Group__1 : rule__Head__Group__1__Impl ;
    public final void rule__Head__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1048:1: ( rule__Head__Group__1__Impl )
            // InternalMyDsl.g:1049:2: rule__Head__Group__1__Impl
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
    // InternalMyDsl.g:1055:1: rule__Head__Group__1__Impl : ( ( rule__Head__NameAssignment_1 ) ) ;
    public final void rule__Head__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1059:1: ( ( ( rule__Head__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1060:1: ( ( rule__Head__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1060:1: ( ( rule__Head__NameAssignment_1 ) )
            // InternalMyDsl.g:1061:2: ( rule__Head__NameAssignment_1 )
            {
             before(grammarAccess.getHeadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1062:2: ( rule__Head__NameAssignment_1 )
            // InternalMyDsl.g:1062:3: rule__Head__NameAssignment_1
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
    // InternalMyDsl.g:1071:1: rule__InsertColumn__Group__0 : rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1 ;
    public final void rule__InsertColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1075:1: ( rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1 )
            // InternalMyDsl.g:1076:2: rule__InsertColumn__Group__0__Impl rule__InsertColumn__Group__1
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
    // InternalMyDsl.g:1083:1: rule__InsertColumn__Group__0__Impl : ( 'INSERT' ) ;
    public final void rule__InsertColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( ( 'INSERT' ) )
            // InternalMyDsl.g:1088:1: ( 'INSERT' )
            {
            // InternalMyDsl.g:1088:1: ( 'INSERT' )
            // InternalMyDsl.g:1089:2: 'INSERT'
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
    // InternalMyDsl.g:1098:1: rule__InsertColumn__Group__1 : rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2 ;
    public final void rule__InsertColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2 )
            // InternalMyDsl.g:1103:2: rule__InsertColumn__Group__1__Impl rule__InsertColumn__Group__2
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
    // InternalMyDsl.g:1110:1: rule__InsertColumn__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__InsertColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1114:1: ( ( 'COLUMN' ) )
            // InternalMyDsl.g:1115:1: ( 'COLUMN' )
            {
            // InternalMyDsl.g:1115:1: ( 'COLUMN' )
            // InternalMyDsl.g:1116:2: 'COLUMN'
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
    // InternalMyDsl.g:1125:1: rule__InsertColumn__Group__2 : rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3 ;
    public final void rule__InsertColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1129:1: ( rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3 )
            // InternalMyDsl.g:1130:2: rule__InsertColumn__Group__2__Impl rule__InsertColumn__Group__3
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
    // InternalMyDsl.g:1137:1: rule__InsertColumn__Group__2__Impl : ( ( rule__InsertColumn__NameAssignment_2 ) ) ;
    public final void rule__InsertColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:1: ( ( ( rule__InsertColumn__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1142:1: ( ( rule__InsertColumn__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1142:1: ( ( rule__InsertColumn__NameAssignment_2 ) )
            // InternalMyDsl.g:1143:2: ( rule__InsertColumn__NameAssignment_2 )
            {
             before(grammarAccess.getInsertColumnAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1144:2: ( rule__InsertColumn__NameAssignment_2 )
            // InternalMyDsl.g:1144:3: rule__InsertColumn__NameAssignment_2
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
    // InternalMyDsl.g:1152:1: rule__InsertColumn__Group__3 : rule__InsertColumn__Group__3__Impl rule__InsertColumn__Group__4 ;
    public final void rule__InsertColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1156:1: ( rule__InsertColumn__Group__3__Impl rule__InsertColumn__Group__4 )
            // InternalMyDsl.g:1157:2: rule__InsertColumn__Group__3__Impl rule__InsertColumn__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__InsertColumn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertColumn__Group__4();

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
    // InternalMyDsl.g:1164:1: rule__InsertColumn__Group__3__Impl : ( ( rule__InsertColumn__ColumnAssignment_3 ) ) ;
    public final void rule__InsertColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( ( ( rule__InsertColumn__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:1169:1: ( ( rule__InsertColumn__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:1169:1: ( ( rule__InsertColumn__ColumnAssignment_3 ) )
            // InternalMyDsl.g:1170:2: ( rule__InsertColumn__ColumnAssignment_3 )
            {
             before(grammarAccess.getInsertColumnAccess().getColumnAssignment_3()); 
            // InternalMyDsl.g:1171:2: ( rule__InsertColumn__ColumnAssignment_3 )
            // InternalMyDsl.g:1171:3: rule__InsertColumn__ColumnAssignment_3
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


    // $ANTLR start "rule__InsertColumn__Group__4"
    // InternalMyDsl.g:1179:1: rule__InsertColumn__Group__4 : rule__InsertColumn__Group__4__Impl rule__InsertColumn__Group__5 ;
    public final void rule__InsertColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1183:1: ( rule__InsertColumn__Group__4__Impl rule__InsertColumn__Group__5 )
            // InternalMyDsl.g:1184:2: rule__InsertColumn__Group__4__Impl rule__InsertColumn__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__InsertColumn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertColumn__Group__5();

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
    // $ANTLR end "rule__InsertColumn__Group__4"


    // $ANTLR start "rule__InsertColumn__Group__4__Impl"
    // InternalMyDsl.g:1191:1: rule__InsertColumn__Group__4__Impl : ( ':' ) ;
    public final void rule__InsertColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( ( ':' ) )
            // InternalMyDsl.g:1196:1: ( ':' )
            {
            // InternalMyDsl.g:1196:1: ( ':' )
            // InternalMyDsl.g:1197:2: ':'
            {
             before(grammarAccess.getInsertColumnAccess().getColonKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInsertColumnAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertColumn__Group__4__Impl"


    // $ANTLR start "rule__InsertColumn__Group__5"
    // InternalMyDsl.g:1206:1: rule__InsertColumn__Group__5 : rule__InsertColumn__Group__5__Impl ;
    public final void rule__InsertColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1210:1: ( rule__InsertColumn__Group__5__Impl )
            // InternalMyDsl.g:1211:2: rule__InsertColumn__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertColumn__Group__5__Impl();

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
    // $ANTLR end "rule__InsertColumn__Group__5"


    // $ANTLR start "rule__InsertColumn__Group__5__Impl"
    // InternalMyDsl.g:1217:1: rule__InsertColumn__Group__5__Impl : ( ( ( rule__InsertColumn__ContentAssignment_5 ) ) ( ( rule__InsertColumn__ContentAssignment_5 )* ) ) ;
    public final void rule__InsertColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1221:1: ( ( ( ( rule__InsertColumn__ContentAssignment_5 ) ) ( ( rule__InsertColumn__ContentAssignment_5 )* ) ) )
            // InternalMyDsl.g:1222:1: ( ( ( rule__InsertColumn__ContentAssignment_5 ) ) ( ( rule__InsertColumn__ContentAssignment_5 )* ) )
            {
            // InternalMyDsl.g:1222:1: ( ( ( rule__InsertColumn__ContentAssignment_5 ) ) ( ( rule__InsertColumn__ContentAssignment_5 )* ) )
            // InternalMyDsl.g:1223:2: ( ( rule__InsertColumn__ContentAssignment_5 ) ) ( ( rule__InsertColumn__ContentAssignment_5 )* )
            {
            // InternalMyDsl.g:1223:2: ( ( rule__InsertColumn__ContentAssignment_5 ) )
            // InternalMyDsl.g:1224:3: ( rule__InsertColumn__ContentAssignment_5 )
            {
             before(grammarAccess.getInsertColumnAccess().getContentAssignment_5()); 
            // InternalMyDsl.g:1225:3: ( rule__InsertColumn__ContentAssignment_5 )
            // InternalMyDsl.g:1225:4: rule__InsertColumn__ContentAssignment_5
            {
            pushFollow(FOLLOW_6);
            rule__InsertColumn__ContentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInsertColumnAccess().getContentAssignment_5()); 

            }

            // InternalMyDsl.g:1228:2: ( ( rule__InsertColumn__ContentAssignment_5 )* )
            // InternalMyDsl.g:1229:3: ( rule__InsertColumn__ContentAssignment_5 )*
            {
             before(grammarAccess.getInsertColumnAccess().getContentAssignment_5()); 
            // InternalMyDsl.g:1230:3: ( rule__InsertColumn__ContentAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1230:4: rule__InsertColumn__ContentAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__InsertColumn__ContentAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getInsertColumnAccess().getContentAssignment_5()); 

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
    // $ANTLR end "rule__InsertColumn__Group__5__Impl"


    // $ANTLR start "rule__ToCSV__Group__0"
    // InternalMyDsl.g:1240:1: rule__ToCSV__Group__0 : rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 ;
    public final void rule__ToCSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1 )
            // InternalMyDsl.g:1245:2: rule__ToCSV__Group__0__Impl rule__ToCSV__Group__1
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
    // InternalMyDsl.g:1252:1: rule__ToCSV__Group__0__Impl : ( 'TO' ) ;
    public final void rule__ToCSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1256:1: ( ( 'TO' ) )
            // InternalMyDsl.g:1257:1: ( 'TO' )
            {
            // InternalMyDsl.g:1257:1: ( 'TO' )
            // InternalMyDsl.g:1258:2: 'TO'
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
    // InternalMyDsl.g:1267:1: rule__ToCSV__Group__1 : rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 ;
    public final void rule__ToCSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2 )
            // InternalMyDsl.g:1272:2: rule__ToCSV__Group__1__Impl rule__ToCSV__Group__2
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
    // InternalMyDsl.g:1279:1: rule__ToCSV__Group__1__Impl : ( 'CSV' ) ;
    public final void rule__ToCSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( ( 'CSV' ) )
            // InternalMyDsl.g:1284:1: ( 'CSV' )
            {
            // InternalMyDsl.g:1284:1: ( 'CSV' )
            // InternalMyDsl.g:1285:2: 'CSV'
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
    // InternalMyDsl.g:1294:1: rule__ToCSV__Group__2 : rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3 ;
    public final void rule__ToCSV__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3 )
            // InternalMyDsl.g:1299:2: rule__ToCSV__Group__2__Impl rule__ToCSV__Group__3
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
    // InternalMyDsl.g:1306:1: rule__ToCSV__Group__2__Impl : ( ( rule__ToCSV__NameAssignment_2 ) ) ;
    public final void rule__ToCSV__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1310:1: ( ( ( rule__ToCSV__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1311:1: ( ( rule__ToCSV__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1311:1: ( ( rule__ToCSV__NameAssignment_2 ) )
            // InternalMyDsl.g:1312:2: ( rule__ToCSV__NameAssignment_2 )
            {
             before(grammarAccess.getToCSVAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1313:2: ( rule__ToCSV__NameAssignment_2 )
            // InternalMyDsl.g:1313:3: rule__ToCSV__NameAssignment_2
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
    // InternalMyDsl.g:1321:1: rule__ToCSV__Group__3 : rule__ToCSV__Group__3__Impl ;
    public final void rule__ToCSV__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( rule__ToCSV__Group__3__Impl )
            // InternalMyDsl.g:1326:2: rule__ToCSV__Group__3__Impl
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
    // InternalMyDsl.g:1332:1: rule__ToCSV__Group__3__Impl : ( ( rule__ToCSV__PathAssignment_3 ) ) ;
    public final void rule__ToCSV__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( ( ( rule__ToCSV__PathAssignment_3 ) ) )
            // InternalMyDsl.g:1337:1: ( ( rule__ToCSV__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:1337:1: ( ( rule__ToCSV__PathAssignment_3 ) )
            // InternalMyDsl.g:1338:2: ( rule__ToCSV__PathAssignment_3 )
            {
             before(grammarAccess.getToCSVAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:1339:2: ( rule__ToCSV__PathAssignment_3 )
            // InternalMyDsl.g:1339:3: rule__ToCSV__PathAssignment_3
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
    // InternalMyDsl.g:1348:1: rule__DropColumn__Group__0 : rule__DropColumn__Group__0__Impl rule__DropColumn__Group__1 ;
    public final void rule__DropColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( rule__DropColumn__Group__0__Impl rule__DropColumn__Group__1 )
            // InternalMyDsl.g:1353:2: rule__DropColumn__Group__0__Impl rule__DropColumn__Group__1
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
    // InternalMyDsl.g:1360:1: rule__DropColumn__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__DropColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1364:1: ( ( 'DROP' ) )
            // InternalMyDsl.g:1365:1: ( 'DROP' )
            {
            // InternalMyDsl.g:1365:1: ( 'DROP' )
            // InternalMyDsl.g:1366:2: 'DROP'
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
    // InternalMyDsl.g:1375:1: rule__DropColumn__Group__1 : rule__DropColumn__Group__1__Impl rule__DropColumn__Group__2 ;
    public final void rule__DropColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( rule__DropColumn__Group__1__Impl rule__DropColumn__Group__2 )
            // InternalMyDsl.g:1380:2: rule__DropColumn__Group__1__Impl rule__DropColumn__Group__2
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
    // InternalMyDsl.g:1387:1: rule__DropColumn__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__DropColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( ( 'COLUMN' ) )
            // InternalMyDsl.g:1392:1: ( 'COLUMN' )
            {
            // InternalMyDsl.g:1392:1: ( 'COLUMN' )
            // InternalMyDsl.g:1393:2: 'COLUMN'
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
    // InternalMyDsl.g:1402:1: rule__DropColumn__Group__2 : rule__DropColumn__Group__2__Impl rule__DropColumn__Group__3 ;
    public final void rule__DropColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( rule__DropColumn__Group__2__Impl rule__DropColumn__Group__3 )
            // InternalMyDsl.g:1407:2: rule__DropColumn__Group__2__Impl rule__DropColumn__Group__3
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
    // InternalMyDsl.g:1414:1: rule__DropColumn__Group__2__Impl : ( ( rule__DropColumn__NameAssignment_2 ) ) ;
    public final void rule__DropColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( ( ( rule__DropColumn__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1419:1: ( ( rule__DropColumn__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1419:1: ( ( rule__DropColumn__NameAssignment_2 ) )
            // InternalMyDsl.g:1420:2: ( rule__DropColumn__NameAssignment_2 )
            {
             before(grammarAccess.getDropColumnAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1421:2: ( rule__DropColumn__NameAssignment_2 )
            // InternalMyDsl.g:1421:3: rule__DropColumn__NameAssignment_2
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
    // InternalMyDsl.g:1429:1: rule__DropColumn__Group__3 : rule__DropColumn__Group__3__Impl ;
    public final void rule__DropColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( rule__DropColumn__Group__3__Impl )
            // InternalMyDsl.g:1434:2: rule__DropColumn__Group__3__Impl
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
    // InternalMyDsl.g:1440:1: rule__DropColumn__Group__3__Impl : ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) ) ;
    public final void rule__DropColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) ) )
            // InternalMyDsl.g:1445:1: ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) )
            {
            // InternalMyDsl.g:1445:1: ( ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* ) )
            // InternalMyDsl.g:1446:2: ( ( rule__DropColumn__ColumnsAssignment_3 ) ) ( ( rule__DropColumn__ColumnsAssignment_3 )* )
            {
            // InternalMyDsl.g:1446:2: ( ( rule__DropColumn__ColumnsAssignment_3 ) )
            // InternalMyDsl.g:1447:3: ( rule__DropColumn__ColumnsAssignment_3 )
            {
             before(grammarAccess.getDropColumnAccess().getColumnsAssignment_3()); 
            // InternalMyDsl.g:1448:3: ( rule__DropColumn__ColumnsAssignment_3 )
            // InternalMyDsl.g:1448:4: rule__DropColumn__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__DropColumn__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDropColumnAccess().getColumnsAssignment_3()); 

            }

            // InternalMyDsl.g:1451:2: ( ( rule__DropColumn__ColumnsAssignment_3 )* )
            // InternalMyDsl.g:1452:3: ( rule__DropColumn__ColumnsAssignment_3 )*
            {
             before(grammarAccess.getDropColumnAccess().getColumnsAssignment_3()); 
            // InternalMyDsl.g:1453:3: ( rule__DropColumn__ColumnsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1453:4: rule__DropColumn__ColumnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DropColumn__ColumnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMyDsl.g:1463:1: rule__DropRow__Group__0 : rule__DropRow__Group__0__Impl rule__DropRow__Group__1 ;
    public final void rule__DropRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( rule__DropRow__Group__0__Impl rule__DropRow__Group__1 )
            // InternalMyDsl.g:1468:2: rule__DropRow__Group__0__Impl rule__DropRow__Group__1
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
    // InternalMyDsl.g:1475:1: rule__DropRow__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__DropRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( ( 'DROP' ) )
            // InternalMyDsl.g:1480:1: ( 'DROP' )
            {
            // InternalMyDsl.g:1480:1: ( 'DROP' )
            // InternalMyDsl.g:1481:2: 'DROP'
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
    // InternalMyDsl.g:1490:1: rule__DropRow__Group__1 : rule__DropRow__Group__1__Impl rule__DropRow__Group__2 ;
    public final void rule__DropRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( rule__DropRow__Group__1__Impl rule__DropRow__Group__2 )
            // InternalMyDsl.g:1495:2: rule__DropRow__Group__1__Impl rule__DropRow__Group__2
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
    // InternalMyDsl.g:1502:1: rule__DropRow__Group__1__Impl : ( 'ROW' ) ;
    public final void rule__DropRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( ( 'ROW' ) )
            // InternalMyDsl.g:1507:1: ( 'ROW' )
            {
            // InternalMyDsl.g:1507:1: ( 'ROW' )
            // InternalMyDsl.g:1508:2: 'ROW'
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
    // InternalMyDsl.g:1517:1: rule__DropRow__Group__2 : rule__DropRow__Group__2__Impl rule__DropRow__Group__3 ;
    public final void rule__DropRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( rule__DropRow__Group__2__Impl rule__DropRow__Group__3 )
            // InternalMyDsl.g:1522:2: rule__DropRow__Group__2__Impl rule__DropRow__Group__3
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
    // InternalMyDsl.g:1529:1: rule__DropRow__Group__2__Impl : ( ( rule__DropRow__NameAssignment_2 ) ) ;
    public final void rule__DropRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( ( ( rule__DropRow__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1534:1: ( ( rule__DropRow__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1534:1: ( ( rule__DropRow__NameAssignment_2 ) )
            // InternalMyDsl.g:1535:2: ( rule__DropRow__NameAssignment_2 )
            {
             before(grammarAccess.getDropRowAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1536:2: ( rule__DropRow__NameAssignment_2 )
            // InternalMyDsl.g:1536:3: rule__DropRow__NameAssignment_2
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
    // InternalMyDsl.g:1544:1: rule__DropRow__Group__3 : rule__DropRow__Group__3__Impl ;
    public final void rule__DropRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( rule__DropRow__Group__3__Impl )
            // InternalMyDsl.g:1549:2: rule__DropRow__Group__3__Impl
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
    // InternalMyDsl.g:1555:1: rule__DropRow__Group__3__Impl : ( ( ( rule__DropRow__RowsAssignment_3 ) ) ( ( rule__DropRow__RowsAssignment_3 )* ) ) ;
    public final void rule__DropRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1559:1: ( ( ( ( rule__DropRow__RowsAssignment_3 ) ) ( ( rule__DropRow__RowsAssignment_3 )* ) ) )
            // InternalMyDsl.g:1560:1: ( ( ( rule__DropRow__RowsAssignment_3 ) ) ( ( rule__DropRow__RowsAssignment_3 )* ) )
            {
            // InternalMyDsl.g:1560:1: ( ( ( rule__DropRow__RowsAssignment_3 ) ) ( ( rule__DropRow__RowsAssignment_3 )* ) )
            // InternalMyDsl.g:1561:2: ( ( rule__DropRow__RowsAssignment_3 ) ) ( ( rule__DropRow__RowsAssignment_3 )* )
            {
            // InternalMyDsl.g:1561:2: ( ( rule__DropRow__RowsAssignment_3 ) )
            // InternalMyDsl.g:1562:3: ( rule__DropRow__RowsAssignment_3 )
            {
             before(grammarAccess.getDropRowAccess().getRowsAssignment_3()); 
            // InternalMyDsl.g:1563:3: ( rule__DropRow__RowsAssignment_3 )
            // InternalMyDsl.g:1563:4: rule__DropRow__RowsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__DropRow__RowsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDropRowAccess().getRowsAssignment_3()); 

            }

            // InternalMyDsl.g:1566:2: ( ( rule__DropRow__RowsAssignment_3 )* )
            // InternalMyDsl.g:1567:3: ( rule__DropRow__RowsAssignment_3 )*
            {
             before(grammarAccess.getDropRowAccess().getRowsAssignment_3()); 
            // InternalMyDsl.g:1568:3: ( rule__DropRow__RowsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1568:4: rule__DropRow__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DropRow__RowsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "rule__InsertRow__Group__0"
    // InternalMyDsl.g:1578:1: rule__InsertRow__Group__0 : rule__InsertRow__Group__0__Impl rule__InsertRow__Group__1 ;
    public final void rule__InsertRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1582:1: ( rule__InsertRow__Group__0__Impl rule__InsertRow__Group__1 )
            // InternalMyDsl.g:1583:2: rule__InsertRow__Group__0__Impl rule__InsertRow__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__InsertRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertRow__Group__1();

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
    // $ANTLR end "rule__InsertRow__Group__0"


    // $ANTLR start "rule__InsertRow__Group__0__Impl"
    // InternalMyDsl.g:1590:1: rule__InsertRow__Group__0__Impl : ( 'INSERT' ) ;
    public final void rule__InsertRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( ( 'INSERT' ) )
            // InternalMyDsl.g:1595:1: ( 'INSERT' )
            {
            // InternalMyDsl.g:1595:1: ( 'INSERT' )
            // InternalMyDsl.g:1596:2: 'INSERT'
            {
             before(grammarAccess.getInsertRowAccess().getINSERTKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInsertRowAccess().getINSERTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertRow__Group__0__Impl"


    // $ANTLR start "rule__InsertRow__Group__1"
    // InternalMyDsl.g:1605:1: rule__InsertRow__Group__1 : rule__InsertRow__Group__1__Impl rule__InsertRow__Group__2 ;
    public final void rule__InsertRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( rule__InsertRow__Group__1__Impl rule__InsertRow__Group__2 )
            // InternalMyDsl.g:1610:2: rule__InsertRow__Group__1__Impl rule__InsertRow__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__InsertRow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertRow__Group__2();

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
    // $ANTLR end "rule__InsertRow__Group__1"


    // $ANTLR start "rule__InsertRow__Group__1__Impl"
    // InternalMyDsl.g:1617:1: rule__InsertRow__Group__1__Impl : ( 'ROW' ) ;
    public final void rule__InsertRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( ( 'ROW' ) )
            // InternalMyDsl.g:1622:1: ( 'ROW' )
            {
            // InternalMyDsl.g:1622:1: ( 'ROW' )
            // InternalMyDsl.g:1623:2: 'ROW'
            {
             before(grammarAccess.getInsertRowAccess().getROWKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInsertRowAccess().getROWKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertRow__Group__1__Impl"


    // $ANTLR start "rule__InsertRow__Group__2"
    // InternalMyDsl.g:1632:1: rule__InsertRow__Group__2 : rule__InsertRow__Group__2__Impl rule__InsertRow__Group__3 ;
    public final void rule__InsertRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( rule__InsertRow__Group__2__Impl rule__InsertRow__Group__3 )
            // InternalMyDsl.g:1637:2: rule__InsertRow__Group__2__Impl rule__InsertRow__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__InsertRow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertRow__Group__3();

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
    // $ANTLR end "rule__InsertRow__Group__2"


    // $ANTLR start "rule__InsertRow__Group__2__Impl"
    // InternalMyDsl.g:1644:1: rule__InsertRow__Group__2__Impl : ( ( rule__InsertRow__NameAssignment_2 ) ) ;
    public final void rule__InsertRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( ( ( rule__InsertRow__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1649:1: ( ( rule__InsertRow__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1649:1: ( ( rule__InsertRow__NameAssignment_2 ) )
            // InternalMyDsl.g:1650:2: ( rule__InsertRow__NameAssignment_2 )
            {
             before(grammarAccess.getInsertRowAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1651:2: ( rule__InsertRow__NameAssignment_2 )
            // InternalMyDsl.g:1651:3: rule__InsertRow__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InsertRow__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInsertRowAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertRow__Group__2__Impl"


    // $ANTLR start "rule__InsertRow__Group__3"
    // InternalMyDsl.g:1659:1: rule__InsertRow__Group__3 : rule__InsertRow__Group__3__Impl ;
    public final void rule__InsertRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( rule__InsertRow__Group__3__Impl )
            // InternalMyDsl.g:1664:2: rule__InsertRow__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertRow__Group__3__Impl();

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
    // $ANTLR end "rule__InsertRow__Group__3"


    // $ANTLR start "rule__InsertRow__Group__3__Impl"
    // InternalMyDsl.g:1670:1: rule__InsertRow__Group__3__Impl : ( ( ( rule__InsertRow__RowsAssignment_3 ) ) ( ( rule__InsertRow__RowsAssignment_3 )* ) ) ;
    public final void rule__InsertRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( ( ( ( rule__InsertRow__RowsAssignment_3 ) ) ( ( rule__InsertRow__RowsAssignment_3 )* ) ) )
            // InternalMyDsl.g:1675:1: ( ( ( rule__InsertRow__RowsAssignment_3 ) ) ( ( rule__InsertRow__RowsAssignment_3 )* ) )
            {
            // InternalMyDsl.g:1675:1: ( ( ( rule__InsertRow__RowsAssignment_3 ) ) ( ( rule__InsertRow__RowsAssignment_3 )* ) )
            // InternalMyDsl.g:1676:2: ( ( rule__InsertRow__RowsAssignment_3 ) ) ( ( rule__InsertRow__RowsAssignment_3 )* )
            {
            // InternalMyDsl.g:1676:2: ( ( rule__InsertRow__RowsAssignment_3 ) )
            // InternalMyDsl.g:1677:3: ( rule__InsertRow__RowsAssignment_3 )
            {
             before(grammarAccess.getInsertRowAccess().getRowsAssignment_3()); 
            // InternalMyDsl.g:1678:3: ( rule__InsertRow__RowsAssignment_3 )
            // InternalMyDsl.g:1678:4: rule__InsertRow__RowsAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__InsertRow__RowsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertRowAccess().getRowsAssignment_3()); 

            }

            // InternalMyDsl.g:1681:2: ( ( rule__InsertRow__RowsAssignment_3 )* )
            // InternalMyDsl.g:1682:3: ( rule__InsertRow__RowsAssignment_3 )*
            {
             before(grammarAccess.getInsertRowAccess().getRowsAssignment_3()); 
            // InternalMyDsl.g:1683:3: ( rule__InsertRow__RowsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1683:4: rule__InsertRow__RowsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__InsertRow__RowsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getInsertRowAccess().getRowsAssignment_3()); 

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
    // $ANTLR end "rule__InsertRow__Group__3__Impl"


    // $ANTLR start "rule__GetColumn__Group__0"
    // InternalMyDsl.g:1693:1: rule__GetColumn__Group__0 : rule__GetColumn__Group__0__Impl rule__GetColumn__Group__1 ;
    public final void rule__GetColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( rule__GetColumn__Group__0__Impl rule__GetColumn__Group__1 )
            // InternalMyDsl.g:1698:2: rule__GetColumn__Group__0__Impl rule__GetColumn__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__GetColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetColumn__Group__1();

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
    // $ANTLR end "rule__GetColumn__Group__0"


    // $ANTLR start "rule__GetColumn__Group__0__Impl"
    // InternalMyDsl.g:1705:1: rule__GetColumn__Group__0__Impl : ( 'GET' ) ;
    public final void rule__GetColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1709:1: ( ( 'GET' ) )
            // InternalMyDsl.g:1710:1: ( 'GET' )
            {
            // InternalMyDsl.g:1710:1: ( 'GET' )
            // InternalMyDsl.g:1711:2: 'GET'
            {
             before(grammarAccess.getGetColumnAccess().getGETKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGetColumnAccess().getGETKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColumn__Group__0__Impl"


    // $ANTLR start "rule__GetColumn__Group__1"
    // InternalMyDsl.g:1720:1: rule__GetColumn__Group__1 : rule__GetColumn__Group__1__Impl rule__GetColumn__Group__2 ;
    public final void rule__GetColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1724:1: ( rule__GetColumn__Group__1__Impl rule__GetColumn__Group__2 )
            // InternalMyDsl.g:1725:2: rule__GetColumn__Group__1__Impl rule__GetColumn__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__GetColumn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetColumn__Group__2();

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
    // $ANTLR end "rule__GetColumn__Group__1"


    // $ANTLR start "rule__GetColumn__Group__1__Impl"
    // InternalMyDsl.g:1732:1: rule__GetColumn__Group__1__Impl : ( 'COLUMN' ) ;
    public final void rule__GetColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( ( 'COLUMN' ) )
            // InternalMyDsl.g:1737:1: ( 'COLUMN' )
            {
            // InternalMyDsl.g:1737:1: ( 'COLUMN' )
            // InternalMyDsl.g:1738:2: 'COLUMN'
            {
             before(grammarAccess.getGetColumnAccess().getCOLUMNKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGetColumnAccess().getCOLUMNKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColumn__Group__1__Impl"


    // $ANTLR start "rule__GetColumn__Group__2"
    // InternalMyDsl.g:1747:1: rule__GetColumn__Group__2 : rule__GetColumn__Group__2__Impl rule__GetColumn__Group__3 ;
    public final void rule__GetColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( rule__GetColumn__Group__2__Impl rule__GetColumn__Group__3 )
            // InternalMyDsl.g:1752:2: rule__GetColumn__Group__2__Impl rule__GetColumn__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__GetColumn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetColumn__Group__3();

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
    // $ANTLR end "rule__GetColumn__Group__2"


    // $ANTLR start "rule__GetColumn__Group__2__Impl"
    // InternalMyDsl.g:1759:1: rule__GetColumn__Group__2__Impl : ( ( rule__GetColumn__NameAssignment_2 ) ) ;
    public final void rule__GetColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( ( ( rule__GetColumn__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1764:1: ( ( rule__GetColumn__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1764:1: ( ( rule__GetColumn__NameAssignment_2 ) )
            // InternalMyDsl.g:1765:2: ( rule__GetColumn__NameAssignment_2 )
            {
             before(grammarAccess.getGetColumnAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1766:2: ( rule__GetColumn__NameAssignment_2 )
            // InternalMyDsl.g:1766:3: rule__GetColumn__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GetColumn__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGetColumnAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColumn__Group__2__Impl"


    // $ANTLR start "rule__GetColumn__Group__3"
    // InternalMyDsl.g:1774:1: rule__GetColumn__Group__3 : rule__GetColumn__Group__3__Impl ;
    public final void rule__GetColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( rule__GetColumn__Group__3__Impl )
            // InternalMyDsl.g:1779:2: rule__GetColumn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetColumn__Group__3__Impl();

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
    // $ANTLR end "rule__GetColumn__Group__3"


    // $ANTLR start "rule__GetColumn__Group__3__Impl"
    // InternalMyDsl.g:1785:1: rule__GetColumn__Group__3__Impl : ( ( rule__GetColumn__ColumnAssignment_3 ) ) ;
    public final void rule__GetColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( ( ( rule__GetColumn__ColumnAssignment_3 ) ) )
            // InternalMyDsl.g:1790:1: ( ( rule__GetColumn__ColumnAssignment_3 ) )
            {
            // InternalMyDsl.g:1790:1: ( ( rule__GetColumn__ColumnAssignment_3 ) )
            // InternalMyDsl.g:1791:2: ( rule__GetColumn__ColumnAssignment_3 )
            {
             before(grammarAccess.getGetColumnAccess().getColumnAssignment_3()); 
            // InternalMyDsl.g:1792:2: ( rule__GetColumn__ColumnAssignment_3 )
            // InternalMyDsl.g:1792:3: rule__GetColumn__ColumnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GetColumn__ColumnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGetColumnAccess().getColumnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColumn__Group__3__Impl"


    // $ANTLR start "rule__GetRow__Group__0"
    // InternalMyDsl.g:1801:1: rule__GetRow__Group__0 : rule__GetRow__Group__0__Impl rule__GetRow__Group__1 ;
    public final void rule__GetRow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( rule__GetRow__Group__0__Impl rule__GetRow__Group__1 )
            // InternalMyDsl.g:1806:2: rule__GetRow__Group__0__Impl rule__GetRow__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__GetRow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetRow__Group__1();

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
    // $ANTLR end "rule__GetRow__Group__0"


    // $ANTLR start "rule__GetRow__Group__0__Impl"
    // InternalMyDsl.g:1813:1: rule__GetRow__Group__0__Impl : ( 'GET' ) ;
    public final void rule__GetRow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1817:1: ( ( 'GET' ) )
            // InternalMyDsl.g:1818:1: ( 'GET' )
            {
            // InternalMyDsl.g:1818:1: ( 'GET' )
            // InternalMyDsl.g:1819:2: 'GET'
            {
             before(grammarAccess.getGetRowAccess().getGETKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGetRowAccess().getGETKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetRow__Group__0__Impl"


    // $ANTLR start "rule__GetRow__Group__1"
    // InternalMyDsl.g:1828:1: rule__GetRow__Group__1 : rule__GetRow__Group__1__Impl rule__GetRow__Group__2 ;
    public final void rule__GetRow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( rule__GetRow__Group__1__Impl rule__GetRow__Group__2 )
            // InternalMyDsl.g:1833:2: rule__GetRow__Group__1__Impl rule__GetRow__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__GetRow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetRow__Group__2();

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
    // $ANTLR end "rule__GetRow__Group__1"


    // $ANTLR start "rule__GetRow__Group__1__Impl"
    // InternalMyDsl.g:1840:1: rule__GetRow__Group__1__Impl : ( 'ROW' ) ;
    public final void rule__GetRow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1844:1: ( ( 'ROW' ) )
            // InternalMyDsl.g:1845:1: ( 'ROW' )
            {
            // InternalMyDsl.g:1845:1: ( 'ROW' )
            // InternalMyDsl.g:1846:2: 'ROW'
            {
             before(grammarAccess.getGetRowAccess().getROWKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGetRowAccess().getROWKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetRow__Group__1__Impl"


    // $ANTLR start "rule__GetRow__Group__2"
    // InternalMyDsl.g:1855:1: rule__GetRow__Group__2 : rule__GetRow__Group__2__Impl rule__GetRow__Group__3 ;
    public final void rule__GetRow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( rule__GetRow__Group__2__Impl rule__GetRow__Group__3 )
            // InternalMyDsl.g:1860:2: rule__GetRow__Group__2__Impl rule__GetRow__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__GetRow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GetRow__Group__3();

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
    // $ANTLR end "rule__GetRow__Group__2"


    // $ANTLR start "rule__GetRow__Group__2__Impl"
    // InternalMyDsl.g:1867:1: rule__GetRow__Group__2__Impl : ( ( rule__GetRow__NameAssignment_2 ) ) ;
    public final void rule__GetRow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( ( ( rule__GetRow__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1872:1: ( ( rule__GetRow__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1872:1: ( ( rule__GetRow__NameAssignment_2 ) )
            // InternalMyDsl.g:1873:2: ( rule__GetRow__NameAssignment_2 )
            {
             before(grammarAccess.getGetRowAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1874:2: ( rule__GetRow__NameAssignment_2 )
            // InternalMyDsl.g:1874:3: rule__GetRow__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GetRow__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGetRowAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetRow__Group__2__Impl"


    // $ANTLR start "rule__GetRow__Group__3"
    // InternalMyDsl.g:1882:1: rule__GetRow__Group__3 : rule__GetRow__Group__3__Impl ;
    public final void rule__GetRow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( rule__GetRow__Group__3__Impl )
            // InternalMyDsl.g:1887:2: rule__GetRow__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GetRow__Group__3__Impl();

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
    // $ANTLR end "rule__GetRow__Group__3"


    // $ANTLR start "rule__GetRow__Group__3__Impl"
    // InternalMyDsl.g:1893:1: rule__GetRow__Group__3__Impl : ( ( rule__GetRow__IndexAssignment_3 ) ) ;
    public final void rule__GetRow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( ( ( rule__GetRow__IndexAssignment_3 ) ) )
            // InternalMyDsl.g:1898:1: ( ( rule__GetRow__IndexAssignment_3 ) )
            {
            // InternalMyDsl.g:1898:1: ( ( rule__GetRow__IndexAssignment_3 ) )
            // InternalMyDsl.g:1899:2: ( rule__GetRow__IndexAssignment_3 )
            {
             before(grammarAccess.getGetRowAccess().getIndexAssignment_3()); 
            // InternalMyDsl.g:1900:2: ( rule__GetRow__IndexAssignment_3 )
            // InternalMyDsl.g:1900:3: rule__GetRow__IndexAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GetRow__IndexAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGetRowAccess().getIndexAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetRow__Group__3__Impl"


    // $ANTLR start "rule__Model__CommandsAssignment"
    // InternalMyDsl.g:1909:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:1914:2: ( ruleCommand )
            {
            // InternalMyDsl.g:1914:2: ( ruleCommand )
            // InternalMyDsl.g:1915:3: ruleCommand
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
    // InternalMyDsl.g:1924:1: rule__Content__FieldsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Content__FieldsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1928:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1929:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1929:2: ( RULE_STRING )
            // InternalMyDsl.g:1930:3: RULE_STRING
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
    // InternalMyDsl.g:1939:1: rule__Create__PathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Create__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1943:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1944:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1944:2: ( RULE_STRING )
            // InternalMyDsl.g:1945:3: RULE_STRING
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
    // InternalMyDsl.g:1954:1: rule__Create__ColumnsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Create__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1959:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1959:2: ( RULE_STRING )
            // InternalMyDsl.g:1960:3: RULE_STRING
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
    // InternalMyDsl.g:1969:1: rule__Create__ContentAssignment_8 : ( ruleContent ) ;
    public final void rule__Create__ContentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( ruleContent ) )
            // InternalMyDsl.g:1974:2: ( ruleContent )
            {
            // InternalMyDsl.g:1974:2: ( ruleContent )
            // InternalMyDsl.g:1975:3: ruleContent
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
    // InternalMyDsl.g:1984:1: rule__Load__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Load__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1989:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1989:2: ( RULE_ID )
            // InternalMyDsl.g:1990:3: RULE_ID
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
    // InternalMyDsl.g:1999:1: rule__Load__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Load__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2004:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2004:2: ( RULE_STRING )
            // InternalMyDsl.g:2005:3: RULE_STRING
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
    // InternalMyDsl.g:2014:1: rule__Print__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Print__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2018:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2019:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2019:2: ( RULE_STRING )
            // InternalMyDsl.g:2020:3: RULE_STRING
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
    // InternalMyDsl.g:2029:1: rule__Head__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Head__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2033:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2034:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2034:2: ( RULE_ID )
            // InternalMyDsl.g:2035:3: RULE_ID
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
    // InternalMyDsl.g:2044:1: rule__InsertColumn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InsertColumn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2049:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2049:2: ( RULE_ID )
            // InternalMyDsl.g:2050:3: RULE_ID
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
    // InternalMyDsl.g:2059:1: rule__InsertColumn__ColumnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InsertColumn__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2063:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2064:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2064:2: ( RULE_STRING )
            // InternalMyDsl.g:2065:3: RULE_STRING
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


    // $ANTLR start "rule__InsertColumn__ContentAssignment_5"
    // InternalMyDsl.g:2074:1: rule__InsertColumn__ContentAssignment_5 : ( RULE_STRING ) ;
    public final void rule__InsertColumn__ContentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2078:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2079:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2079:2: ( RULE_STRING )
            // InternalMyDsl.g:2080:3: RULE_STRING
            {
             before(grammarAccess.getInsertColumnAccess().getContentSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertColumnAccess().getContentSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertColumn__ContentAssignment_5"


    // $ANTLR start "rule__ToCSV__NameAssignment_2"
    // InternalMyDsl.g:2089:1: rule__ToCSV__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ToCSV__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2093:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2094:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2094:2: ( RULE_ID )
            // InternalMyDsl.g:2095:3: RULE_ID
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
    // InternalMyDsl.g:2104:1: rule__ToCSV__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ToCSV__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2108:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2109:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2109:2: ( RULE_STRING )
            // InternalMyDsl.g:2110:3: RULE_STRING
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
    // InternalMyDsl.g:2119:1: rule__DropColumn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DropColumn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2124:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2124:2: ( RULE_ID )
            // InternalMyDsl.g:2125:3: RULE_ID
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
    // InternalMyDsl.g:2134:1: rule__DropColumn__ColumnsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DropColumn__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2139:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2139:2: ( RULE_STRING )
            // InternalMyDsl.g:2140:3: RULE_STRING
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
    // InternalMyDsl.g:2149:1: rule__DropRow__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DropRow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2153:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2154:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2154:2: ( RULE_ID )
            // InternalMyDsl.g:2155:3: RULE_ID
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
    // InternalMyDsl.g:2164:1: rule__DropRow__RowsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DropRow__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2169:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2169:2: ( RULE_STRING )
            // InternalMyDsl.g:2170:3: RULE_STRING
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


    // $ANTLR start "rule__InsertRow__NameAssignment_2"
    // InternalMyDsl.g:2179:1: rule__InsertRow__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InsertRow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2184:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2184:2: ( RULE_ID )
            // InternalMyDsl.g:2185:3: RULE_ID
            {
             before(grammarAccess.getInsertRowAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInsertRowAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertRow__NameAssignment_2"


    // $ANTLR start "rule__InsertRow__RowsAssignment_3"
    // InternalMyDsl.g:2194:1: rule__InsertRow__RowsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__InsertRow__RowsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2198:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2199:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2199:2: ( RULE_STRING )
            // InternalMyDsl.g:2200:3: RULE_STRING
            {
             before(grammarAccess.getInsertRowAccess().getRowsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertRowAccess().getRowsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertRow__RowsAssignment_3"


    // $ANTLR start "rule__GetColumn__NameAssignment_2"
    // InternalMyDsl.g:2209:1: rule__GetColumn__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GetColumn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2213:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2214:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2214:2: ( RULE_ID )
            // InternalMyDsl.g:2215:3: RULE_ID
            {
             before(grammarAccess.getGetColumnAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetColumnAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColumn__NameAssignment_2"


    // $ANTLR start "rule__GetColumn__ColumnAssignment_3"
    // InternalMyDsl.g:2224:1: rule__GetColumn__ColumnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__GetColumn__ColumnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2228:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2229:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2229:2: ( RULE_STRING )
            // InternalMyDsl.g:2230:3: RULE_STRING
            {
             before(grammarAccess.getGetColumnAccess().getColumnSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGetColumnAccess().getColumnSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetColumn__ColumnAssignment_3"


    // $ANTLR start "rule__GetRow__NameAssignment_2"
    // InternalMyDsl.g:2239:1: rule__GetRow__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__GetRow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2244:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2244:2: ( RULE_ID )
            // InternalMyDsl.g:2245:3: RULE_ID
            {
             before(grammarAccess.getGetRowAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGetRowAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetRow__NameAssignment_2"


    // $ANTLR start "rule__GetRow__IndexAssignment_3"
    // InternalMyDsl.g:2254:1: rule__GetRow__IndexAssignment_3 : ( RULE_INT ) ;
    public final void rule__GetRow__IndexAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2259:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2259:2: ( RULE_INT )
            // InternalMyDsl.g:2260:3: RULE_INT
            {
             before(grammarAccess.getGetRowAccess().getIndexINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGetRowAccess().getIndexINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetRow__IndexAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\15\4\uffff\1\24\1\uffff\2\24\6\uffff";
    static final String dfa_3s = "\1\31\4\uffff\1\30\1\uffff\2\30\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\2\uffff\1\5\1\11\1\10\1\7\1\13\1\12";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\uffff\1\6\1\uffff\1\7\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\11\3\uffff\1\12",
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
            return "402:1: rule__Command__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) | ( ruleInsertColumn ) | ( ruleToCSV ) | ( ruleDropColumn ) | ( ruleDropRow ) | ( ruleInsertRow ) | ( ruleGetColumn ) | ( ruleGetRow ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002AEA002L});
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});

}