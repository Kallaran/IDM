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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CREATE'", "':'", "'['", "']'", "'LOAD'", "'='", "'PRINT'", "'HEAD'"
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

                if ( (LA1_0==11||LA1_0==15||(LA1_0>=17 && LA1_0<=18)) ) {
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


    // $ANTLR start "rule__Command__Alternatives"
    // InternalMyDsl.g:227:1: rule__Command__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( ( ruleCreate ) | ( ruleLoad ) | ( rulePrint ) | ( ruleHead ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
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
                    // InternalMyDsl.g:232:2: ( ruleCreate )
                    {
                    // InternalMyDsl.g:232:2: ( ruleCreate )
                    // InternalMyDsl.g:233:3: ruleCreate
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
                    // InternalMyDsl.g:238:2: ( ruleLoad )
                    {
                    // InternalMyDsl.g:238:2: ( ruleLoad )
                    // InternalMyDsl.g:239:3: ruleLoad
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
                    // InternalMyDsl.g:244:2: ( rulePrint )
                    {
                    // InternalMyDsl.g:244:2: ( rulePrint )
                    // InternalMyDsl.g:245:3: rulePrint
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
                    // InternalMyDsl.g:250:2: ( ruleHead )
                    {
                    // InternalMyDsl.g:250:2: ( ruleHead )
                    // InternalMyDsl.g:251:3: ruleHead
                    {
                     before(grammarAccess.getCommandAccess().getHeadParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleHead();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getHeadParserRuleCall_3()); 

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


    // $ANTLR start "rule__Create__Group__0"
    // InternalMyDsl.g:260:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalMyDsl.g:265:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:272:1: rule__Create__Group__0__Impl : ( 'CREATE' ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:276:1: ( ( 'CREATE' ) )
            // InternalMyDsl.g:277:1: ( 'CREATE' )
            {
            // InternalMyDsl.g:277:1: ( 'CREATE' )
            // InternalMyDsl.g:278:2: 'CREATE'
            {
             before(grammarAccess.getCreateAccess().getCREATEKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalMyDsl.g:287:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalMyDsl.g:292:2: rule__Create__Group__1__Impl rule__Create__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalMyDsl.g:299:1: rule__Create__Group__1__Impl : ( ( rule__Create__PathAssignment_1 ) ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:303:1: ( ( ( rule__Create__PathAssignment_1 ) ) )
            // InternalMyDsl.g:304:1: ( ( rule__Create__PathAssignment_1 ) )
            {
            // InternalMyDsl.g:304:1: ( ( rule__Create__PathAssignment_1 ) )
            // InternalMyDsl.g:305:2: ( rule__Create__PathAssignment_1 )
            {
             before(grammarAccess.getCreateAccess().getPathAssignment_1()); 
            // InternalMyDsl.g:306:2: ( rule__Create__PathAssignment_1 )
            // InternalMyDsl.g:306:3: rule__Create__PathAssignment_1
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
    // InternalMyDsl.g:314:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalMyDsl.g:319:2: rule__Create__Group__2__Impl rule__Create__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:326:1: rule__Create__Group__2__Impl : ( ':' ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:330:1: ( ( ':' ) )
            // InternalMyDsl.g:331:1: ( ':' )
            {
            // InternalMyDsl.g:331:1: ( ':' )
            // InternalMyDsl.g:332:2: ':'
            {
             before(grammarAccess.getCreateAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:341:1: rule__Create__Group__3 : rule__Create__Group__3__Impl rule__Create__Group__4 ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( rule__Create__Group__3__Impl rule__Create__Group__4 )
            // InternalMyDsl.g:346:2: rule__Create__Group__3__Impl rule__Create__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:353:1: rule__Create__Group__3__Impl : ( '[' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( '[' ) )
            // InternalMyDsl.g:358:1: ( '[' )
            {
            // InternalMyDsl.g:358:1: ( '[' )
            // InternalMyDsl.g:359:2: '['
            {
             before(grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:368:1: rule__Create__Group__4 : rule__Create__Group__4__Impl rule__Create__Group__5 ;
    public final void rule__Create__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( rule__Create__Group__4__Impl rule__Create__Group__5 )
            // InternalMyDsl.g:373:2: rule__Create__Group__4__Impl rule__Create__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:380:1: rule__Create__Group__4__Impl : ( ( rule__Create__ColumnsAssignment_4 )* ) ;
    public final void rule__Create__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:384:1: ( ( ( rule__Create__ColumnsAssignment_4 )* ) )
            // InternalMyDsl.g:385:1: ( ( rule__Create__ColumnsAssignment_4 )* )
            {
            // InternalMyDsl.g:385:1: ( ( rule__Create__ColumnsAssignment_4 )* )
            // InternalMyDsl.g:386:2: ( rule__Create__ColumnsAssignment_4 )*
            {
             before(grammarAccess.getCreateAccess().getColumnsAssignment_4()); 
            // InternalMyDsl.g:387:2: ( rule__Create__ColumnsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:387:3: rule__Create__ColumnsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Create__ColumnsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalMyDsl.g:395:1: rule__Create__Group__5 : rule__Create__Group__5__Impl ;
    public final void rule__Create__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( rule__Create__Group__5__Impl )
            // InternalMyDsl.g:400:2: rule__Create__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:406:1: rule__Create__Group__5__Impl : ( ']' ) ;
    public final void rule__Create__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:410:1: ( ( ']' ) )
            // InternalMyDsl.g:411:1: ( ']' )
            {
            // InternalMyDsl.g:411:1: ( ']' )
            // InternalMyDsl.g:412:2: ']'
            {
             before(grammarAccess.getCreateAccess().getRightSquareBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__Load__Group__0"
    // InternalMyDsl.g:422:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalMyDsl.g:427:2: rule__Load__Group__0__Impl rule__Load__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:434:1: rule__Load__Group__0__Impl : ( 'LOAD' ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:438:1: ( ( 'LOAD' ) )
            // InternalMyDsl.g:439:1: ( 'LOAD' )
            {
            // InternalMyDsl.g:439:1: ( 'LOAD' )
            // InternalMyDsl.g:440:2: 'LOAD'
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
    // InternalMyDsl.g:449:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalMyDsl.g:454:2: rule__Load__Group__1__Impl rule__Load__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:461:1: rule__Load__Group__1__Impl : ( ( rule__Load__NameAssignment_1 ) ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:465:1: ( ( ( rule__Load__NameAssignment_1 ) ) )
            // InternalMyDsl.g:466:1: ( ( rule__Load__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:466:1: ( ( rule__Load__NameAssignment_1 ) )
            // InternalMyDsl.g:467:2: ( rule__Load__NameAssignment_1 )
            {
             before(grammarAccess.getLoadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:468:2: ( rule__Load__NameAssignment_1 )
            // InternalMyDsl.g:468:3: rule__Load__NameAssignment_1
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
    // InternalMyDsl.g:476:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalMyDsl.g:481:2: rule__Load__Group__2__Impl rule__Load__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:488:1: rule__Load__Group__2__Impl : ( '=' ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:492:1: ( ( '=' ) )
            // InternalMyDsl.g:493:1: ( '=' )
            {
            // InternalMyDsl.g:493:1: ( '=' )
            // InternalMyDsl.g:494:2: '='
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
    // InternalMyDsl.g:503:1: rule__Load__Group__3 : rule__Load__Group__3__Impl ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( rule__Load__Group__3__Impl )
            // InternalMyDsl.g:508:2: rule__Load__Group__3__Impl
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
    // InternalMyDsl.g:514:1: rule__Load__Group__3__Impl : ( ( rule__Load__PathAssignment_3 ) ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( ( ( rule__Load__PathAssignment_3 ) ) )
            // InternalMyDsl.g:519:1: ( ( rule__Load__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:519:1: ( ( rule__Load__PathAssignment_3 ) )
            // InternalMyDsl.g:520:2: ( rule__Load__PathAssignment_3 )
            {
             before(grammarAccess.getLoadAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:521:2: ( rule__Load__PathAssignment_3 )
            // InternalMyDsl.g:521:3: rule__Load__PathAssignment_3
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
    // InternalMyDsl.g:530:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalMyDsl.g:535:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:542:1: rule__Print__Group__0__Impl : ( 'PRINT' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:546:1: ( ( 'PRINT' ) )
            // InternalMyDsl.g:547:1: ( 'PRINT' )
            {
            // InternalMyDsl.g:547:1: ( 'PRINT' )
            // InternalMyDsl.g:548:2: 'PRINT'
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
    // InternalMyDsl.g:557:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( rule__Print__Group__1__Impl )
            // InternalMyDsl.g:562:2: rule__Print__Group__1__Impl
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
    // InternalMyDsl.g:568:1: rule__Print__Group__1__Impl : ( ( rule__Print__NameAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( ( ( rule__Print__NameAssignment_1 ) ) )
            // InternalMyDsl.g:573:1: ( ( rule__Print__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:573:1: ( ( rule__Print__NameAssignment_1 ) )
            // InternalMyDsl.g:574:2: ( rule__Print__NameAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:575:2: ( rule__Print__NameAssignment_1 )
            // InternalMyDsl.g:575:3: rule__Print__NameAssignment_1
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
    // InternalMyDsl.g:584:1: rule__Head__Group__0 : rule__Head__Group__0__Impl rule__Head__Group__1 ;
    public final void rule__Head__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:588:1: ( rule__Head__Group__0__Impl rule__Head__Group__1 )
            // InternalMyDsl.g:589:2: rule__Head__Group__0__Impl rule__Head__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:596:1: rule__Head__Group__0__Impl : ( 'HEAD' ) ;
    public final void rule__Head__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:600:1: ( ( 'HEAD' ) )
            // InternalMyDsl.g:601:1: ( 'HEAD' )
            {
            // InternalMyDsl.g:601:1: ( 'HEAD' )
            // InternalMyDsl.g:602:2: 'HEAD'
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
    // InternalMyDsl.g:611:1: rule__Head__Group__1 : rule__Head__Group__1__Impl ;
    public final void rule__Head__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:615:1: ( rule__Head__Group__1__Impl )
            // InternalMyDsl.g:616:2: rule__Head__Group__1__Impl
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
    // InternalMyDsl.g:622:1: rule__Head__Group__1__Impl : ( ( rule__Head__NameAssignment_1 ) ) ;
    public final void rule__Head__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( ( ( rule__Head__NameAssignment_1 ) ) )
            // InternalMyDsl.g:627:1: ( ( rule__Head__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:627:1: ( ( rule__Head__NameAssignment_1 ) )
            // InternalMyDsl.g:628:2: ( rule__Head__NameAssignment_1 )
            {
             before(grammarAccess.getHeadAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:629:2: ( rule__Head__NameAssignment_1 )
            // InternalMyDsl.g:629:3: rule__Head__NameAssignment_1
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


    // $ANTLR start "rule__Model__CommandsAssignment"
    // InternalMyDsl.g:638:1: rule__Model__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Model__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( ( ruleCommand ) )
            // InternalMyDsl.g:643:2: ( ruleCommand )
            {
            // InternalMyDsl.g:643:2: ( ruleCommand )
            // InternalMyDsl.g:644:3: ruleCommand
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
    // InternalMyDsl.g:653:1: rule__Type__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Type__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:657:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:658:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:658:2: ( RULE_STRING )
            // InternalMyDsl.g:659:3: RULE_STRING
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


    // $ANTLR start "rule__Create__PathAssignment_1"
    // InternalMyDsl.g:668:1: rule__Create__PathAssignment_1 : ( ruleType ) ;
    public final void rule__Create__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:672:1: ( ( ruleType ) )
            // InternalMyDsl.g:673:2: ( ruleType )
            {
            // InternalMyDsl.g:673:2: ( ruleType )
            // InternalMyDsl.g:674:3: ruleType
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
    // InternalMyDsl.g:683:1: rule__Create__ColumnsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Create__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:688:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:688:2: ( RULE_STRING )
            // InternalMyDsl.g:689:3: RULE_STRING
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


    // $ANTLR start "rule__Load__NameAssignment_1"
    // InternalMyDsl.g:698:1: rule__Load__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Load__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:703:2: ( RULE_ID )
            {
            // InternalMyDsl.g:703:2: ( RULE_ID )
            // InternalMyDsl.g:704:3: RULE_ID
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
    // InternalMyDsl.g:713:1: rule__Load__PathAssignment_3 : ( ruleType ) ;
    public final void rule__Load__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( ( ruleType ) )
            // InternalMyDsl.g:718:2: ( ruleType )
            {
            // InternalMyDsl.g:718:2: ( ruleType )
            // InternalMyDsl.g:719:3: ruleType
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
    // InternalMyDsl.g:728:1: rule__Print__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Print__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:733:2: ( RULE_ID )
            {
            // InternalMyDsl.g:733:2: ( RULE_ID )
            // InternalMyDsl.g:734:3: RULE_ID
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
    // InternalMyDsl.g:743:1: rule__Head__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Head__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:747:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:748:2: ( RULE_ID )
            {
            // InternalMyDsl.g:748:2: ( RULE_ID )
            // InternalMyDsl.g:749:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000068802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}