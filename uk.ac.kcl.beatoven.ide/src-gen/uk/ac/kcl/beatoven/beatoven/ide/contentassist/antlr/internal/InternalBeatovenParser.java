package uk.ac.kcl.beatoven.beatoven.ide.contentassist.antlr.internal;

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
import uk.ac.kcl.beatoven.beatoven.services.BeatovenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBeatovenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_KEY", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'play'", "'hihat'", "'kick'", "'snare'", "'chords'", "'lead'", "'bass'", "'major'", "'minor'", "':'", "'loop'", "'for'", "'bars'", "'beat'", "'beats'", "'.'", "'randomise'", "'then'", "'note'", "'each'", "'every'"
    };
    public static final int RULE_KEY=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBeatovenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBeatovenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBeatovenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBeatoven.g"; }


    	private BeatovenGrammarAccess grammarAccess;

    	public void setGrammarAccess(BeatovenGrammarAccess grammarAccess) {
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
    // InternalBeatoven.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBeatoven.g:54:1: ( ruleModel EOF )
            // InternalBeatoven.g:55:1: ruleModel EOF
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
    // InternalBeatoven.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalBeatoven.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalBeatoven.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalBeatoven.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalBeatoven.g:69:3: ( rule__Model__Group__0 )
            // InternalBeatoven.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSection"
    // InternalBeatoven.g:78:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalBeatoven.g:79:1: ( ruleSection EOF )
            // InternalBeatoven.g:80:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalBeatoven.g:87:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:91:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalBeatoven.g:92:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalBeatoven.g:92:2: ( ( rule__Section__Group__0 ) )
            // InternalBeatoven.g:93:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalBeatoven.g:94:3: ( rule__Section__Group__0 )
            // InternalBeatoven.g:94:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleCommand"
    // InternalBeatoven.g:103:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalBeatoven.g:104:1: ( ruleCommand EOF )
            // InternalBeatoven.g:105:1: ruleCommand EOF
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
    // InternalBeatoven.g:112:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:116:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalBeatoven.g:117:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalBeatoven.g:117:2: ( ( rule__Command__Alternatives ) )
            // InternalBeatoven.g:118:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalBeatoven.g:119:3: ( rule__Command__Alternatives )
            // InternalBeatoven.g:119:4: rule__Command__Alternatives
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


    // $ANTLR start "entryRuleActionCommand"
    // InternalBeatoven.g:128:1: entryRuleActionCommand : ruleActionCommand EOF ;
    public final void entryRuleActionCommand() throws RecognitionException {
        try {
            // InternalBeatoven.g:129:1: ( ruleActionCommand EOF )
            // InternalBeatoven.g:130:1: ruleActionCommand EOF
            {
             before(grammarAccess.getActionCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleActionCommand();

            state._fsp--;

             after(grammarAccess.getActionCommandRule()); 
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
    // $ANTLR end "entryRuleActionCommand"


    // $ANTLR start "ruleActionCommand"
    // InternalBeatoven.g:137:1: ruleActionCommand : ( ( rule__ActionCommand__Group__0 ) ) ;
    public final void ruleActionCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:141:2: ( ( ( rule__ActionCommand__Group__0 ) ) )
            // InternalBeatoven.g:142:2: ( ( rule__ActionCommand__Group__0 ) )
            {
            // InternalBeatoven.g:142:2: ( ( rule__ActionCommand__Group__0 ) )
            // InternalBeatoven.g:143:3: ( rule__ActionCommand__Group__0 )
            {
             before(grammarAccess.getActionCommandAccess().getGroup()); 
            // InternalBeatoven.g:144:3: ( rule__ActionCommand__Group__0 )
            // InternalBeatoven.g:144:4: rule__ActionCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionCommand"


    // $ANTLR start "entryRuleLoopCommand"
    // InternalBeatoven.g:153:1: entryRuleLoopCommand : ruleLoopCommand EOF ;
    public final void entryRuleLoopCommand() throws RecognitionException {
        try {
            // InternalBeatoven.g:154:1: ( ruleLoopCommand EOF )
            // InternalBeatoven.g:155:1: ruleLoopCommand EOF
            {
             before(grammarAccess.getLoopCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleLoopCommand();

            state._fsp--;

             after(grammarAccess.getLoopCommandRule()); 
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
    // $ANTLR end "entryRuleLoopCommand"


    // $ANTLR start "ruleLoopCommand"
    // InternalBeatoven.g:162:1: ruleLoopCommand : ( ( rule__LoopCommand__Group__0 ) ) ;
    public final void ruleLoopCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:166:2: ( ( ( rule__LoopCommand__Group__0 ) ) )
            // InternalBeatoven.g:167:2: ( ( rule__LoopCommand__Group__0 ) )
            {
            // InternalBeatoven.g:167:2: ( ( rule__LoopCommand__Group__0 ) )
            // InternalBeatoven.g:168:3: ( rule__LoopCommand__Group__0 )
            {
             before(grammarAccess.getLoopCommandAccess().getGroup()); 
            // InternalBeatoven.g:169:3: ( rule__LoopCommand__Group__0 )
            // InternalBeatoven.g:169:4: rule__LoopCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoopCommand"


    // $ANTLR start "entryRuleAction"
    // InternalBeatoven.g:178:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalBeatoven.g:179:1: ( ruleAction EOF )
            // InternalBeatoven.g:180:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBeatoven.g:187:1: ruleAction : ( 'play' ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:191:2: ( ( 'play' ) )
            // InternalBeatoven.g:192:2: ( 'play' )
            {
            // InternalBeatoven.g:192:2: ( 'play' )
            // InternalBeatoven.g:193:3: 'play'
            {
             before(grammarAccess.getActionAccess().getPlayKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getPlayKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleSoundLiteral"
    // InternalBeatoven.g:203:1: entryRuleSoundLiteral : ruleSoundLiteral EOF ;
    public final void entryRuleSoundLiteral() throws RecognitionException {
        try {
            // InternalBeatoven.g:204:1: ( ruleSoundLiteral EOF )
            // InternalBeatoven.g:205:1: ruleSoundLiteral EOF
            {
             before(grammarAccess.getSoundLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleSoundLiteral();

            state._fsp--;

             after(grammarAccess.getSoundLiteralRule()); 
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
    // $ANTLR end "entryRuleSoundLiteral"


    // $ANTLR start "ruleSoundLiteral"
    // InternalBeatoven.g:212:1: ruleSoundLiteral : ( ( rule__SoundLiteral__Alternatives ) ) ;
    public final void ruleSoundLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:216:2: ( ( ( rule__SoundLiteral__Alternatives ) ) )
            // InternalBeatoven.g:217:2: ( ( rule__SoundLiteral__Alternatives ) )
            {
            // InternalBeatoven.g:217:2: ( ( rule__SoundLiteral__Alternatives ) )
            // InternalBeatoven.g:218:3: ( rule__SoundLiteral__Alternatives )
            {
             before(grammarAccess.getSoundLiteralAccess().getAlternatives()); 
            // InternalBeatoven.g:219:3: ( rule__SoundLiteral__Alternatives )
            // InternalBeatoven.g:219:4: rule__SoundLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SoundLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSoundLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSoundLiteral"


    // $ANTLR start "entryRuleDrumSample"
    // InternalBeatoven.g:228:1: entryRuleDrumSample : ruleDrumSample EOF ;
    public final void entryRuleDrumSample() throws RecognitionException {
        try {
            // InternalBeatoven.g:229:1: ( ruleDrumSample EOF )
            // InternalBeatoven.g:230:1: ruleDrumSample EOF
            {
             before(grammarAccess.getDrumSampleRule()); 
            pushFollow(FOLLOW_1);
            ruleDrumSample();

            state._fsp--;

             after(grammarAccess.getDrumSampleRule()); 
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
    // $ANTLR end "entryRuleDrumSample"


    // $ANTLR start "ruleDrumSample"
    // InternalBeatoven.g:237:1: ruleDrumSample : ( ( rule__DrumSample__Group__0 ) ) ;
    public final void ruleDrumSample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:241:2: ( ( ( rule__DrumSample__Group__0 ) ) )
            // InternalBeatoven.g:242:2: ( ( rule__DrumSample__Group__0 ) )
            {
            // InternalBeatoven.g:242:2: ( ( rule__DrumSample__Group__0 ) )
            // InternalBeatoven.g:243:3: ( rule__DrumSample__Group__0 )
            {
             before(grammarAccess.getDrumSampleAccess().getGroup()); 
            // InternalBeatoven.g:244:3: ( rule__DrumSample__Group__0 )
            // InternalBeatoven.g:244:4: rule__DrumSample__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DrumSample__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDrumSampleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDrumSample"


    // $ANTLR start "entryRuleMelody"
    // InternalBeatoven.g:253:1: entryRuleMelody : ruleMelody EOF ;
    public final void entryRuleMelody() throws RecognitionException {
        try {
            // InternalBeatoven.g:254:1: ( ruleMelody EOF )
            // InternalBeatoven.g:255:1: ruleMelody EOF
            {
             before(grammarAccess.getMelodyRule()); 
            pushFollow(FOLLOW_1);
            ruleMelody();

            state._fsp--;

             after(grammarAccess.getMelodyRule()); 
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
    // $ANTLR end "entryRuleMelody"


    // $ANTLR start "ruleMelody"
    // InternalBeatoven.g:262:1: ruleMelody : ( ( rule__Melody__Group__0 ) ) ;
    public final void ruleMelody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:266:2: ( ( ( rule__Melody__Group__0 ) ) )
            // InternalBeatoven.g:267:2: ( ( rule__Melody__Group__0 ) )
            {
            // InternalBeatoven.g:267:2: ( ( rule__Melody__Group__0 ) )
            // InternalBeatoven.g:268:3: ( rule__Melody__Group__0 )
            {
             before(grammarAccess.getMelodyAccess().getGroup()); 
            // InternalBeatoven.g:269:3: ( rule__Melody__Group__0 )
            // InternalBeatoven.g:269:4: rule__Melody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Melody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMelody"


    // $ANTLR start "entryRuleSample"
    // InternalBeatoven.g:278:1: entryRuleSample : ruleSample EOF ;
    public final void entryRuleSample() throws RecognitionException {
        try {
            // InternalBeatoven.g:279:1: ( ruleSample EOF )
            // InternalBeatoven.g:280:1: ruleSample EOF
            {
             before(grammarAccess.getSampleRule()); 
            pushFollow(FOLLOW_1);
            ruleSample();

            state._fsp--;

             after(grammarAccess.getSampleRule()); 
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
    // $ANTLR end "entryRuleSample"


    // $ANTLR start "ruleSample"
    // InternalBeatoven.g:287:1: ruleSample : ( ( rule__Sample__Alternatives ) ) ;
    public final void ruleSample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:291:2: ( ( ( rule__Sample__Alternatives ) ) )
            // InternalBeatoven.g:292:2: ( ( rule__Sample__Alternatives ) )
            {
            // InternalBeatoven.g:292:2: ( ( rule__Sample__Alternatives ) )
            // InternalBeatoven.g:293:3: ( rule__Sample__Alternatives )
            {
             before(grammarAccess.getSampleAccess().getAlternatives()); 
            // InternalBeatoven.g:294:3: ( rule__Sample__Alternatives )
            // InternalBeatoven.g:294:4: rule__Sample__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sample__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSampleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSample"


    // $ANTLR start "entryRulePattern"
    // InternalBeatoven.g:303:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalBeatoven.g:304:1: ( rulePattern EOF )
            // InternalBeatoven.g:305:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalBeatoven.g:312:1: rulePattern : ( ( rule__Pattern__Alternatives ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:316:2: ( ( ( rule__Pattern__Alternatives ) ) )
            // InternalBeatoven.g:317:2: ( ( rule__Pattern__Alternatives ) )
            {
            // InternalBeatoven.g:317:2: ( ( rule__Pattern__Alternatives ) )
            // InternalBeatoven.g:318:3: ( rule__Pattern__Alternatives )
            {
             before(grammarAccess.getPatternAccess().getAlternatives()); 
            // InternalBeatoven.g:319:3: ( rule__Pattern__Alternatives )
            // InternalBeatoven.g:319:4: rule__Pattern__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleDuration"
    // InternalBeatoven.g:328:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // InternalBeatoven.g:329:1: ( ruleDuration EOF )
            // InternalBeatoven.g:330:1: ruleDuration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // InternalBeatoven.g:337:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:341:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalBeatoven.g:342:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalBeatoven.g:342:2: ( ( rule__Duration__Group__0 ) )
            // InternalBeatoven.g:343:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalBeatoven.g:344:3: ( rule__Duration__Group__0 )
            // InternalBeatoven.g:344:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleFrequency"
    // InternalBeatoven.g:353:1: entryRuleFrequency : ruleFrequency EOF ;
    public final void entryRuleFrequency() throws RecognitionException {
        try {
            // InternalBeatoven.g:354:1: ( ruleFrequency EOF )
            // InternalBeatoven.g:355:1: ruleFrequency EOF
            {
             before(grammarAccess.getFrequencyRule()); 
            pushFollow(FOLLOW_1);
            ruleFrequency();

            state._fsp--;

             after(grammarAccess.getFrequencyRule()); 
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
    // $ANTLR end "entryRuleFrequency"


    // $ANTLR start "ruleFrequency"
    // InternalBeatoven.g:362:1: ruleFrequency : ( ( rule__Frequency__Alternatives ) ) ;
    public final void ruleFrequency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:366:2: ( ( ( rule__Frequency__Alternatives ) ) )
            // InternalBeatoven.g:367:2: ( ( rule__Frequency__Alternatives ) )
            {
            // InternalBeatoven.g:367:2: ( ( rule__Frequency__Alternatives ) )
            // InternalBeatoven.g:368:3: ( rule__Frequency__Alternatives )
            {
             before(grammarAccess.getFrequencyAccess().getAlternatives()); 
            // InternalBeatoven.g:369:3: ( rule__Frequency__Alternatives )
            // InternalBeatoven.g:369:4: rule__Frequency__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrequency"


    // $ANTLR start "entryRuleScale"
    // InternalBeatoven.g:378:1: entryRuleScale : ruleScale EOF ;
    public final void entryRuleScale() throws RecognitionException {
        try {
            // InternalBeatoven.g:379:1: ( ruleScale EOF )
            // InternalBeatoven.g:380:1: ruleScale EOF
            {
             before(grammarAccess.getScaleRule()); 
            pushFollow(FOLLOW_1);
            ruleScale();

            state._fsp--;

             after(grammarAccess.getScaleRule()); 
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
    // $ANTLR end "entryRuleScale"


    // $ANTLR start "ruleScale"
    // InternalBeatoven.g:387:1: ruleScale : ( ( rule__Scale__Alternatives ) ) ;
    public final void ruleScale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:391:2: ( ( ( rule__Scale__Alternatives ) ) )
            // InternalBeatoven.g:392:2: ( ( rule__Scale__Alternatives ) )
            {
            // InternalBeatoven.g:392:2: ( ( rule__Scale__Alternatives ) )
            // InternalBeatoven.g:393:3: ( rule__Scale__Alternatives )
            {
             before(grammarAccess.getScaleAccess().getAlternatives()); 
            // InternalBeatoven.g:394:3: ( rule__Scale__Alternatives )
            // InternalBeatoven.g:394:4: rule__Scale__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Scale__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScaleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScale"


    // $ANTLR start "entryRuleVAL"
    // InternalBeatoven.g:403:1: entryRuleVAL : ruleVAL EOF ;
    public final void entryRuleVAL() throws RecognitionException {
        try {
            // InternalBeatoven.g:404:1: ( ruleVAL EOF )
            // InternalBeatoven.g:405:1: ruleVAL EOF
            {
             before(grammarAccess.getVALRule()); 
            pushFollow(FOLLOW_1);
            ruleVAL();

            state._fsp--;

             after(grammarAccess.getVALRule()); 
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
    // $ANTLR end "entryRuleVAL"


    // $ANTLR start "ruleVAL"
    // InternalBeatoven.g:412:1: ruleVAL : ( ( rule__VAL__Alternatives ) ) ;
    public final void ruleVAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:416:2: ( ( ( rule__VAL__Alternatives ) ) )
            // InternalBeatoven.g:417:2: ( ( rule__VAL__Alternatives ) )
            {
            // InternalBeatoven.g:417:2: ( ( rule__VAL__Alternatives ) )
            // InternalBeatoven.g:418:3: ( rule__VAL__Alternatives )
            {
             before(grammarAccess.getVALAccess().getAlternatives()); 
            // InternalBeatoven.g:419:3: ( rule__VAL__Alternatives )
            // InternalBeatoven.g:419:4: rule__VAL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VAL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVALAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVAL"


    // $ANTLR start "entryRuleREAL"
    // InternalBeatoven.g:428:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalBeatoven.g:432:1: ( ruleREAL EOF )
            // InternalBeatoven.g:433:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalBeatoven.g:443:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:448:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalBeatoven.g:449:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalBeatoven.g:449:2: ( ( rule__REAL__Group__0 ) )
            // InternalBeatoven.g:450:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalBeatoven.g:451:3: ( rule__REAL__Group__0 )
            // InternalBeatoven.g:451:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalBeatoven.g:460:1: rule__Command__Alternatives : ( ( ruleLoopCommand ) | ( ruleActionCommand ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:464:1: ( ( ruleLoopCommand ) | ( ruleActionCommand ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBeatoven.g:465:2: ( ruleLoopCommand )
                    {
                    // InternalBeatoven.g:465:2: ( ruleLoopCommand )
                    // InternalBeatoven.g:466:3: ruleLoopCommand
                    {
                     before(grammarAccess.getCommandAccess().getLoopCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLoopCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getLoopCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBeatoven.g:471:2: ( ruleActionCommand )
                    {
                    // InternalBeatoven.g:471:2: ( ruleActionCommand )
                    // InternalBeatoven.g:472:3: ruleActionCommand
                    {
                     before(grammarAccess.getCommandAccess().getActionCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActionCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getActionCommandParserRuleCall_1()); 

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


    // $ANTLR start "rule__SoundLiteral__Alternatives"
    // InternalBeatoven.g:481:1: rule__SoundLiteral__Alternatives : ( ( ruleDrumSample ) | ( ruleMelody ) );
    public final void rule__SoundLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:485:1: ( ( ruleDrumSample ) | ( ruleMelody ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBeatoven.g:486:2: ( ruleDrumSample )
                    {
                    // InternalBeatoven.g:486:2: ( ruleDrumSample )
                    // InternalBeatoven.g:487:3: ruleDrumSample
                    {
                     before(grammarAccess.getSoundLiteralAccess().getDrumSampleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDrumSample();

                    state._fsp--;

                     after(grammarAccess.getSoundLiteralAccess().getDrumSampleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBeatoven.g:492:2: ( ruleMelody )
                    {
                    // InternalBeatoven.g:492:2: ( ruleMelody )
                    // InternalBeatoven.g:493:3: ruleMelody
                    {
                     before(grammarAccess.getSoundLiteralAccess().getMelodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMelody();

                    state._fsp--;

                     after(grammarAccess.getSoundLiteralAccess().getMelodyParserRuleCall_1()); 

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
    // $ANTLR end "rule__SoundLiteral__Alternatives"


    // $ANTLR start "rule__Sample__Alternatives"
    // InternalBeatoven.g:502:1: rule__Sample__Alternatives : ( ( 'hihat' ) | ( 'kick' ) | ( 'snare' ) );
    public final void rule__Sample__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:506:1: ( ( 'hihat' ) | ( 'kick' ) | ( 'snare' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalBeatoven.g:507:2: ( 'hihat' )
                    {
                    // InternalBeatoven.g:507:2: ( 'hihat' )
                    // InternalBeatoven.g:508:3: 'hihat'
                    {
                     before(grammarAccess.getSampleAccess().getHihatKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSampleAccess().getHihatKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBeatoven.g:513:2: ( 'kick' )
                    {
                    // InternalBeatoven.g:513:2: ( 'kick' )
                    // InternalBeatoven.g:514:3: 'kick'
                    {
                     before(grammarAccess.getSampleAccess().getKickKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSampleAccess().getKickKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBeatoven.g:519:2: ( 'snare' )
                    {
                    // InternalBeatoven.g:519:2: ( 'snare' )
                    // InternalBeatoven.g:520:3: 'snare'
                    {
                     before(grammarAccess.getSampleAccess().getSnareKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSampleAccess().getSnareKeyword_2()); 

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
    // $ANTLR end "rule__Sample__Alternatives"


    // $ANTLR start "rule__Pattern__Alternatives"
    // InternalBeatoven.g:529:1: rule__Pattern__Alternatives : ( ( 'chords' ) | ( 'lead' ) | ( 'bass' ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:533:1: ( ( 'chords' ) | ( 'lead' ) | ( 'bass' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalBeatoven.g:534:2: ( 'chords' )
                    {
                    // InternalBeatoven.g:534:2: ( 'chords' )
                    // InternalBeatoven.g:535:3: 'chords'
                    {
                     before(grammarAccess.getPatternAccess().getChordsKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPatternAccess().getChordsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBeatoven.g:540:2: ( 'lead' )
                    {
                    // InternalBeatoven.g:540:2: ( 'lead' )
                    // InternalBeatoven.g:541:3: 'lead'
                    {
                     before(grammarAccess.getPatternAccess().getLeadKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPatternAccess().getLeadKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBeatoven.g:546:2: ( 'bass' )
                    {
                    // InternalBeatoven.g:546:2: ( 'bass' )
                    // InternalBeatoven.g:547:3: 'bass'
                    {
                     before(grammarAccess.getPatternAccess().getBassKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getPatternAccess().getBassKeyword_2()); 

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
    // $ANTLR end "rule__Pattern__Alternatives"


    // $ANTLR start "rule__Frequency__Alternatives"
    // InternalBeatoven.g:556:1: rule__Frequency__Alternatives : ( ( ( rule__Frequency__Group_0__0 ) ) | ( ( rule__Frequency__Group_1__0 ) ) );
    public final void rule__Frequency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:560:1: ( ( ( rule__Frequency__Group_0__0 ) ) | ( ( rule__Frequency__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBeatoven.g:561:2: ( ( rule__Frequency__Group_0__0 ) )
                    {
                    // InternalBeatoven.g:561:2: ( ( rule__Frequency__Group_0__0 ) )
                    // InternalBeatoven.g:562:3: ( rule__Frequency__Group_0__0 )
                    {
                     before(grammarAccess.getFrequencyAccess().getGroup_0()); 
                    // InternalBeatoven.g:563:3: ( rule__Frequency__Group_0__0 )
                    // InternalBeatoven.g:563:4: rule__Frequency__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frequency__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFrequencyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBeatoven.g:567:2: ( ( rule__Frequency__Group_1__0 ) )
                    {
                    // InternalBeatoven.g:567:2: ( ( rule__Frequency__Group_1__0 ) )
                    // InternalBeatoven.g:568:3: ( rule__Frequency__Group_1__0 )
                    {
                     before(grammarAccess.getFrequencyAccess().getGroup_1()); 
                    // InternalBeatoven.g:569:3: ( rule__Frequency__Group_1__0 )
                    // InternalBeatoven.g:569:4: rule__Frequency__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frequency__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFrequencyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Frequency__Alternatives"


    // $ANTLR start "rule__Scale__Alternatives"
    // InternalBeatoven.g:577:1: rule__Scale__Alternatives : ( ( 'major' ) | ( 'minor' ) );
    public final void rule__Scale__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:581:1: ( ( 'major' ) | ( 'minor' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBeatoven.g:582:2: ( 'major' )
                    {
                    // InternalBeatoven.g:582:2: ( 'major' )
                    // InternalBeatoven.g:583:3: 'major'
                    {
                     before(grammarAccess.getScaleAccess().getMajorKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getScaleAccess().getMajorKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBeatoven.g:588:2: ( 'minor' )
                    {
                    // InternalBeatoven.g:588:2: ( 'minor' )
                    // InternalBeatoven.g:589:3: 'minor'
                    {
                     before(grammarAccess.getScaleAccess().getMinorKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getScaleAccess().getMinorKeyword_1()); 

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
    // $ANTLR end "rule__Scale__Alternatives"


    // $ANTLR start "rule__VAL__Alternatives"
    // InternalBeatoven.g:598:1: rule__VAL__Alternatives : ( ( RULE_INT ) | ( ruleREAL ) );
    public final void rule__VAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:602:1: ( ( RULE_INT ) | ( ruleREAL ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==27) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||(LA7_1>=25 && LA7_1<=26)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBeatoven.g:603:2: ( RULE_INT )
                    {
                    // InternalBeatoven.g:603:2: ( RULE_INT )
                    // InternalBeatoven.g:604:3: RULE_INT
                    {
                     before(grammarAccess.getVALAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getVALAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBeatoven.g:609:2: ( ruleREAL )
                    {
                    // InternalBeatoven.g:609:2: ( ruleREAL )
                    // InternalBeatoven.g:610:3: ruleREAL
                    {
                     before(grammarAccess.getVALAccess().getREALParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleREAL();

                    state._fsp--;

                     after(grammarAccess.getVALAccess().getREALParserRuleCall_1()); 

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
    // $ANTLR end "rule__VAL__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalBeatoven.g:619:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:623:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalBeatoven.g:624:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalBeatoven.g:631:1: rule__Model__Group__0__Impl : ( ( rule__Model__KeyAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:635:1: ( ( ( rule__Model__KeyAssignment_0 ) ) )
            // InternalBeatoven.g:636:1: ( ( rule__Model__KeyAssignment_0 ) )
            {
            // InternalBeatoven.g:636:1: ( ( rule__Model__KeyAssignment_0 ) )
            // InternalBeatoven.g:637:2: ( rule__Model__KeyAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getKeyAssignment_0()); 
            // InternalBeatoven.g:638:2: ( rule__Model__KeyAssignment_0 )
            // InternalBeatoven.g:638:3: rule__Model__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalBeatoven.g:646:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:650:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalBeatoven.g:651:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalBeatoven.g:658:1: rule__Model__Group__1__Impl : ( ( rule__Model__ScaleAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:662:1: ( ( ( rule__Model__ScaleAssignment_1 ) ) )
            // InternalBeatoven.g:663:1: ( ( rule__Model__ScaleAssignment_1 ) )
            {
            // InternalBeatoven.g:663:1: ( ( rule__Model__ScaleAssignment_1 ) )
            // InternalBeatoven.g:664:2: ( rule__Model__ScaleAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getScaleAssignment_1()); 
            // InternalBeatoven.g:665:2: ( rule__Model__ScaleAssignment_1 )
            // InternalBeatoven.g:665:3: rule__Model__ScaleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ScaleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getScaleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalBeatoven.g:673:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:677:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalBeatoven.g:678:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalBeatoven.g:685:1: rule__Model__Group__2__Impl : ( ( rule__Model__BpmAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:689:1: ( ( ( rule__Model__BpmAssignment_2 ) ) )
            // InternalBeatoven.g:690:1: ( ( rule__Model__BpmAssignment_2 ) )
            {
            // InternalBeatoven.g:690:1: ( ( rule__Model__BpmAssignment_2 ) )
            // InternalBeatoven.g:691:2: ( rule__Model__BpmAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getBpmAssignment_2()); 
            // InternalBeatoven.g:692:2: ( rule__Model__BpmAssignment_2 )
            // InternalBeatoven.g:692:3: rule__Model__BpmAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__BpmAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBpmAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalBeatoven.g:700:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:704:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalBeatoven.g:705:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalBeatoven.g:712:1: rule__Model__Group__3__Impl : ( ( rule__Model__IsRandomisedAssignment_3 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:716:1: ( ( ( rule__Model__IsRandomisedAssignment_3 )? ) )
            // InternalBeatoven.g:717:1: ( ( rule__Model__IsRandomisedAssignment_3 )? )
            {
            // InternalBeatoven.g:717:1: ( ( rule__Model__IsRandomisedAssignment_3 )? )
            // InternalBeatoven.g:718:2: ( rule__Model__IsRandomisedAssignment_3 )?
            {
             before(grammarAccess.getModelAccess().getIsRandomisedAssignment_3()); 
            // InternalBeatoven.g:719:2: ( rule__Model__IsRandomisedAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBeatoven.g:719:3: rule__Model__IsRandomisedAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__IsRandomisedAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getIsRandomisedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalBeatoven.g:727:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:731:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalBeatoven.g:732:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalBeatoven.g:739:1: rule__Model__Group__4__Impl : ( ( ( rule__Model__SectionsAssignment_4 ) ) ( ( rule__Model__SectionsAssignment_4 )* ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:743:1: ( ( ( ( rule__Model__SectionsAssignment_4 ) ) ( ( rule__Model__SectionsAssignment_4 )* ) ) )
            // InternalBeatoven.g:744:1: ( ( ( rule__Model__SectionsAssignment_4 ) ) ( ( rule__Model__SectionsAssignment_4 )* ) )
            {
            // InternalBeatoven.g:744:1: ( ( ( rule__Model__SectionsAssignment_4 ) ) ( ( rule__Model__SectionsAssignment_4 )* ) )
            // InternalBeatoven.g:745:2: ( ( rule__Model__SectionsAssignment_4 ) ) ( ( rule__Model__SectionsAssignment_4 )* )
            {
            // InternalBeatoven.g:745:2: ( ( rule__Model__SectionsAssignment_4 ) )
            // InternalBeatoven.g:746:3: ( rule__Model__SectionsAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getSectionsAssignment_4()); 
            // InternalBeatoven.g:747:3: ( rule__Model__SectionsAssignment_4 )
            // InternalBeatoven.g:747:4: rule__Model__SectionsAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Model__SectionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSectionsAssignment_4()); 

            }

            // InternalBeatoven.g:750:2: ( ( rule__Model__SectionsAssignment_4 )* )
            // InternalBeatoven.g:751:3: ( rule__Model__SectionsAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getSectionsAssignment_4()); 
            // InternalBeatoven.g:752:3: ( rule__Model__SectionsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==23) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalBeatoven.g:752:4: rule__Model__SectionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__SectionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSectionsAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalBeatoven.g:761:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:765:1: ( rule__Model__Group__5__Impl )
            // InternalBeatoven.g:766:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalBeatoven.g:772:1: rule__Model__Group__5__Impl : ( ( ( rule__Model__CallsAssignment_5 ) ) ( ( rule__Model__CallsAssignment_5 )* ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:776:1: ( ( ( ( rule__Model__CallsAssignment_5 ) ) ( ( rule__Model__CallsAssignment_5 )* ) ) )
            // InternalBeatoven.g:777:1: ( ( ( rule__Model__CallsAssignment_5 ) ) ( ( rule__Model__CallsAssignment_5 )* ) )
            {
            // InternalBeatoven.g:777:1: ( ( ( rule__Model__CallsAssignment_5 ) ) ( ( rule__Model__CallsAssignment_5 )* ) )
            // InternalBeatoven.g:778:2: ( ( rule__Model__CallsAssignment_5 ) ) ( ( rule__Model__CallsAssignment_5 )* )
            {
            // InternalBeatoven.g:778:2: ( ( rule__Model__CallsAssignment_5 ) )
            // InternalBeatoven.g:779:3: ( rule__Model__CallsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getCallsAssignment_5()); 
            // InternalBeatoven.g:780:3: ( rule__Model__CallsAssignment_5 )
            // InternalBeatoven.g:780:4: rule__Model__CallsAssignment_5
            {
            pushFollow(FOLLOW_8);
            rule__Model__CallsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getCallsAssignment_5()); 

            }

            // InternalBeatoven.g:783:2: ( ( rule__Model__CallsAssignment_5 )* )
            // InternalBeatoven.g:784:3: ( rule__Model__CallsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getCallsAssignment_5()); 
            // InternalBeatoven.g:785:3: ( rule__Model__CallsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBeatoven.g:785:4: rule__Model__CallsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__CallsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getCallsAssignment_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalBeatoven.g:795:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:799:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalBeatoven.g:800:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

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
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalBeatoven.g:807:1: rule__Section__Group__0__Impl : ( ( rule__Section__NameAssignment_0 ) ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:811:1: ( ( ( rule__Section__NameAssignment_0 ) ) )
            // InternalBeatoven.g:812:1: ( ( rule__Section__NameAssignment_0 ) )
            {
            // InternalBeatoven.g:812:1: ( ( rule__Section__NameAssignment_0 ) )
            // InternalBeatoven.g:813:2: ( rule__Section__NameAssignment_0 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_0()); 
            // InternalBeatoven.g:814:2: ( rule__Section__NameAssignment_0 )
            // InternalBeatoven.g:814:3: rule__Section__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalBeatoven.g:822:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:826:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalBeatoven.g:827:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

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
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalBeatoven.g:834:1: rule__Section__Group__1__Impl : ( ( rule__Section__DurationAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:838:1: ( ( ( rule__Section__DurationAssignment_1 ) ) )
            // InternalBeatoven.g:839:1: ( ( rule__Section__DurationAssignment_1 ) )
            {
            // InternalBeatoven.g:839:1: ( ( rule__Section__DurationAssignment_1 ) )
            // InternalBeatoven.g:840:2: ( rule__Section__DurationAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getDurationAssignment_1()); 
            // InternalBeatoven.g:841:2: ( rule__Section__DurationAssignment_1 )
            // InternalBeatoven.g:841:3: rule__Section__DurationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__DurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getDurationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalBeatoven.g:849:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:853:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalBeatoven.g:854:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

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
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalBeatoven.g:861:1: rule__Section__Group__2__Impl : ( ':' ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:865:1: ( ( ':' ) )
            // InternalBeatoven.g:866:1: ( ':' )
            {
            // InternalBeatoven.g:866:1: ( ':' )
            // InternalBeatoven.g:867:2: ':'
            {
             before(grammarAccess.getSectionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalBeatoven.g:876:1: rule__Section__Group__3 : rule__Section__Group__3__Impl ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:880:1: ( rule__Section__Group__3__Impl )
            // InternalBeatoven.g:881:2: rule__Section__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__3__Impl();

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
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalBeatoven.g:887:1: rule__Section__Group__3__Impl : ( ( ( rule__Section__CommandsAssignment_3 ) ) ( ( rule__Section__CommandsAssignment_3 )* ) ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:891:1: ( ( ( ( rule__Section__CommandsAssignment_3 ) ) ( ( rule__Section__CommandsAssignment_3 )* ) ) )
            // InternalBeatoven.g:892:1: ( ( ( rule__Section__CommandsAssignment_3 ) ) ( ( rule__Section__CommandsAssignment_3 )* ) )
            {
            // InternalBeatoven.g:892:1: ( ( ( rule__Section__CommandsAssignment_3 ) ) ( ( rule__Section__CommandsAssignment_3 )* ) )
            // InternalBeatoven.g:893:2: ( ( rule__Section__CommandsAssignment_3 ) ) ( ( rule__Section__CommandsAssignment_3 )* )
            {
            // InternalBeatoven.g:893:2: ( ( rule__Section__CommandsAssignment_3 ) )
            // InternalBeatoven.g:894:3: ( rule__Section__CommandsAssignment_3 )
            {
             before(grammarAccess.getSectionAccess().getCommandsAssignment_3()); 
            // InternalBeatoven.g:895:3: ( rule__Section__CommandsAssignment_3 )
            // InternalBeatoven.g:895:4: rule__Section__CommandsAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__Section__CommandsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getCommandsAssignment_3()); 

            }

            // InternalBeatoven.g:898:2: ( ( rule__Section__CommandsAssignment_3 )* )
            // InternalBeatoven.g:899:3: ( rule__Section__CommandsAssignment_3 )*
            {
             before(grammarAccess.getSectionAccess().getCommandsAssignment_3()); 
            // InternalBeatoven.g:900:3: ( rule__Section__CommandsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBeatoven.g:900:4: rule__Section__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Section__CommandsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getCommandsAssignment_3()); 

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
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__ActionCommand__Group__0"
    // InternalBeatoven.g:910:1: rule__ActionCommand__Group__0 : rule__ActionCommand__Group__0__Impl rule__ActionCommand__Group__1 ;
    public final void rule__ActionCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:914:1: ( rule__ActionCommand__Group__0__Impl rule__ActionCommand__Group__1 )
            // InternalBeatoven.g:915:2: rule__ActionCommand__Group__0__Impl rule__ActionCommand__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ActionCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionCommand__Group__1();

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
    // $ANTLR end "rule__ActionCommand__Group__0"


    // $ANTLR start "rule__ActionCommand__Group__0__Impl"
    // InternalBeatoven.g:922:1: rule__ActionCommand__Group__0__Impl : ( ( rule__ActionCommand__ActionAssignment_0 ) ) ;
    public final void rule__ActionCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:926:1: ( ( ( rule__ActionCommand__ActionAssignment_0 ) ) )
            // InternalBeatoven.g:927:1: ( ( rule__ActionCommand__ActionAssignment_0 ) )
            {
            // InternalBeatoven.g:927:1: ( ( rule__ActionCommand__ActionAssignment_0 ) )
            // InternalBeatoven.g:928:2: ( rule__ActionCommand__ActionAssignment_0 )
            {
             before(grammarAccess.getActionCommandAccess().getActionAssignment_0()); 
            // InternalBeatoven.g:929:2: ( rule__ActionCommand__ActionAssignment_0 )
            // InternalBeatoven.g:929:3: rule__ActionCommand__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ActionCommand__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionCommandAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCommand__Group__0__Impl"


    // $ANTLR start "rule__ActionCommand__Group__1"
    // InternalBeatoven.g:937:1: rule__ActionCommand__Group__1 : rule__ActionCommand__Group__1__Impl rule__ActionCommand__Group__2 ;
    public final void rule__ActionCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:941:1: ( rule__ActionCommand__Group__1__Impl rule__ActionCommand__Group__2 )
            // InternalBeatoven.g:942:2: rule__ActionCommand__Group__1__Impl rule__ActionCommand__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ActionCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionCommand__Group__2();

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
    // $ANTLR end "rule__ActionCommand__Group__1"


    // $ANTLR start "rule__ActionCommand__Group__1__Impl"
    // InternalBeatoven.g:949:1: rule__ActionCommand__Group__1__Impl : ( ( rule__ActionCommand__SoundAssignment_1 ) ) ;
    public final void rule__ActionCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:953:1: ( ( ( rule__ActionCommand__SoundAssignment_1 ) ) )
            // InternalBeatoven.g:954:1: ( ( rule__ActionCommand__SoundAssignment_1 ) )
            {
            // InternalBeatoven.g:954:1: ( ( rule__ActionCommand__SoundAssignment_1 ) )
            // InternalBeatoven.g:955:2: ( rule__ActionCommand__SoundAssignment_1 )
            {
             before(grammarAccess.getActionCommandAccess().getSoundAssignment_1()); 
            // InternalBeatoven.g:956:2: ( rule__ActionCommand__SoundAssignment_1 )
            // InternalBeatoven.g:956:3: rule__ActionCommand__SoundAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionCommand__SoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionCommandAccess().getSoundAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCommand__Group__1__Impl"


    // $ANTLR start "rule__ActionCommand__Group__2"
    // InternalBeatoven.g:964:1: rule__ActionCommand__Group__2 : rule__ActionCommand__Group__2__Impl ;
    public final void rule__ActionCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:968:1: ( rule__ActionCommand__Group__2__Impl )
            // InternalBeatoven.g:969:2: rule__ActionCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionCommand__Group__2__Impl();

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
    // $ANTLR end "rule__ActionCommand__Group__2"


    // $ANTLR start "rule__ActionCommand__Group__2__Impl"
    // InternalBeatoven.g:975:1: rule__ActionCommand__Group__2__Impl : ( ( rule__ActionCommand__FrequencyAssignment_2 ) ) ;
    public final void rule__ActionCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:979:1: ( ( ( rule__ActionCommand__FrequencyAssignment_2 ) ) )
            // InternalBeatoven.g:980:1: ( ( rule__ActionCommand__FrequencyAssignment_2 ) )
            {
            // InternalBeatoven.g:980:1: ( ( rule__ActionCommand__FrequencyAssignment_2 ) )
            // InternalBeatoven.g:981:2: ( rule__ActionCommand__FrequencyAssignment_2 )
            {
             before(grammarAccess.getActionCommandAccess().getFrequencyAssignment_2()); 
            // InternalBeatoven.g:982:2: ( rule__ActionCommand__FrequencyAssignment_2 )
            // InternalBeatoven.g:982:3: rule__ActionCommand__FrequencyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActionCommand__FrequencyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActionCommandAccess().getFrequencyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCommand__Group__2__Impl"


    // $ANTLR start "rule__LoopCommand__Group__0"
    // InternalBeatoven.g:991:1: rule__LoopCommand__Group__0 : rule__LoopCommand__Group__0__Impl rule__LoopCommand__Group__1 ;
    public final void rule__LoopCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:995:1: ( rule__LoopCommand__Group__0__Impl rule__LoopCommand__Group__1 )
            // InternalBeatoven.g:996:2: rule__LoopCommand__Group__0__Impl rule__LoopCommand__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LoopCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__1();

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
    // $ANTLR end "rule__LoopCommand__Group__0"


    // $ANTLR start "rule__LoopCommand__Group__0__Impl"
    // InternalBeatoven.g:1003:1: rule__LoopCommand__Group__0__Impl : ( 'loop' ) ;
    public final void rule__LoopCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1007:1: ( ( 'loop' ) )
            // InternalBeatoven.g:1008:1: ( 'loop' )
            {
            // InternalBeatoven.g:1008:1: ( 'loop' )
            // InternalBeatoven.g:1009:2: 'loop'
            {
             before(grammarAccess.getLoopCommandAccess().getLoopKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopCommandAccess().getLoopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group__0__Impl"


    // $ANTLR start "rule__LoopCommand__Group__1"
    // InternalBeatoven.g:1018:1: rule__LoopCommand__Group__1 : rule__LoopCommand__Group__1__Impl rule__LoopCommand__Group__2 ;
    public final void rule__LoopCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1022:1: ( rule__LoopCommand__Group__1__Impl rule__LoopCommand__Group__2 )
            // InternalBeatoven.g:1023:2: rule__LoopCommand__Group__1__Impl rule__LoopCommand__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__LoopCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__2();

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
    // $ANTLR end "rule__LoopCommand__Group__1"


    // $ANTLR start "rule__LoopCommand__Group__1__Impl"
    // InternalBeatoven.g:1030:1: rule__LoopCommand__Group__1__Impl : ( ( rule__LoopCommand__DurationAssignment_1 ) ) ;
    public final void rule__LoopCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1034:1: ( ( ( rule__LoopCommand__DurationAssignment_1 ) ) )
            // InternalBeatoven.g:1035:1: ( ( rule__LoopCommand__DurationAssignment_1 ) )
            {
            // InternalBeatoven.g:1035:1: ( ( rule__LoopCommand__DurationAssignment_1 ) )
            // InternalBeatoven.g:1036:2: ( rule__LoopCommand__DurationAssignment_1 )
            {
             before(grammarAccess.getLoopCommandAccess().getDurationAssignment_1()); 
            // InternalBeatoven.g:1037:2: ( rule__LoopCommand__DurationAssignment_1 )
            // InternalBeatoven.g:1037:3: rule__LoopCommand__DurationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LoopCommand__DurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopCommandAccess().getDurationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group__1__Impl"


    // $ANTLR start "rule__LoopCommand__Group__2"
    // InternalBeatoven.g:1045:1: rule__LoopCommand__Group__2 : rule__LoopCommand__Group__2__Impl rule__LoopCommand__Group__3 ;
    public final void rule__LoopCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1049:1: ( rule__LoopCommand__Group__2__Impl rule__LoopCommand__Group__3 )
            // InternalBeatoven.g:1050:2: rule__LoopCommand__Group__2__Impl rule__LoopCommand__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__LoopCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__3();

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
    // $ANTLR end "rule__LoopCommand__Group__2"


    // $ANTLR start "rule__LoopCommand__Group__2__Impl"
    // InternalBeatoven.g:1057:1: rule__LoopCommand__Group__2__Impl : ( ':' ) ;
    public final void rule__LoopCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1061:1: ( ( ':' ) )
            // InternalBeatoven.g:1062:1: ( ':' )
            {
            // InternalBeatoven.g:1062:1: ( ':' )
            // InternalBeatoven.g:1063:2: ':'
            {
             before(grammarAccess.getLoopCommandAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLoopCommandAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group__2__Impl"


    // $ANTLR start "rule__LoopCommand__Group__3"
    // InternalBeatoven.g:1072:1: rule__LoopCommand__Group__3 : rule__LoopCommand__Group__3__Impl rule__LoopCommand__Group__4 ;
    public final void rule__LoopCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1076:1: ( rule__LoopCommand__Group__3__Impl rule__LoopCommand__Group__4 )
            // InternalBeatoven.g:1077:2: rule__LoopCommand__Group__3__Impl rule__LoopCommand__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__LoopCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__4();

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
    // $ANTLR end "rule__LoopCommand__Group__3"


    // $ANTLR start "rule__LoopCommand__Group__3__Impl"
    // InternalBeatoven.g:1084:1: rule__LoopCommand__Group__3__Impl : ( ( ( rule__LoopCommand__CommandsAssignment_3 ) ) ( ( rule__LoopCommand__CommandsAssignment_3 )* ) ) ;
    public final void rule__LoopCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1088:1: ( ( ( ( rule__LoopCommand__CommandsAssignment_3 ) ) ( ( rule__LoopCommand__CommandsAssignment_3 )* ) ) )
            // InternalBeatoven.g:1089:1: ( ( ( rule__LoopCommand__CommandsAssignment_3 ) ) ( ( rule__LoopCommand__CommandsAssignment_3 )* ) )
            {
            // InternalBeatoven.g:1089:1: ( ( ( rule__LoopCommand__CommandsAssignment_3 ) ) ( ( rule__LoopCommand__CommandsAssignment_3 )* ) )
            // InternalBeatoven.g:1090:2: ( ( rule__LoopCommand__CommandsAssignment_3 ) ) ( ( rule__LoopCommand__CommandsAssignment_3 )* )
            {
            // InternalBeatoven.g:1090:2: ( ( rule__LoopCommand__CommandsAssignment_3 ) )
            // InternalBeatoven.g:1091:3: ( rule__LoopCommand__CommandsAssignment_3 )
            {
             before(grammarAccess.getLoopCommandAccess().getCommandsAssignment_3()); 
            // InternalBeatoven.g:1092:3: ( rule__LoopCommand__CommandsAssignment_3 )
            // InternalBeatoven.g:1092:4: rule__LoopCommand__CommandsAssignment_3
            {
            pushFollow(FOLLOW_12);
            rule__LoopCommand__CommandsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopCommandAccess().getCommandsAssignment_3()); 

            }

            // InternalBeatoven.g:1095:2: ( ( rule__LoopCommand__CommandsAssignment_3 )* )
            // InternalBeatoven.g:1096:3: ( rule__LoopCommand__CommandsAssignment_3 )*
            {
             before(grammarAccess.getLoopCommandAccess().getCommandsAssignment_3()); 
            // InternalBeatoven.g:1097:3: ( rule__LoopCommand__CommandsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalBeatoven.g:1097:4: rule__LoopCommand__CommandsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__LoopCommand__CommandsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLoopCommandAccess().getCommandsAssignment_3()); 

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
    // $ANTLR end "rule__LoopCommand__Group__3__Impl"


    // $ANTLR start "rule__LoopCommand__Group__4"
    // InternalBeatoven.g:1106:1: rule__LoopCommand__Group__4 : rule__LoopCommand__Group__4__Impl ;
    public final void rule__LoopCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1110:1: ( rule__LoopCommand__Group__4__Impl )
            // InternalBeatoven.g:1111:2: rule__LoopCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group__4__Impl();

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
    // $ANTLR end "rule__LoopCommand__Group__4"


    // $ANTLR start "rule__LoopCommand__Group__4__Impl"
    // InternalBeatoven.g:1117:1: rule__LoopCommand__Group__4__Impl : ( ( rule__LoopCommand__Group_4__0 )? ) ;
    public final void rule__LoopCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1121:1: ( ( ( rule__LoopCommand__Group_4__0 )? ) )
            // InternalBeatoven.g:1122:1: ( ( rule__LoopCommand__Group_4__0 )? )
            {
            // InternalBeatoven.g:1122:1: ( ( rule__LoopCommand__Group_4__0 )? )
            // InternalBeatoven.g:1123:2: ( rule__LoopCommand__Group_4__0 )?
            {
             before(grammarAccess.getLoopCommandAccess().getGroup_4()); 
            // InternalBeatoven.g:1124:2: ( rule__LoopCommand__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBeatoven.g:1124:3: rule__LoopCommand__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoopCommand__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopCommandAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group__4__Impl"


    // $ANTLR start "rule__LoopCommand__Group_4__0"
    // InternalBeatoven.g:1133:1: rule__LoopCommand__Group_4__0 : rule__LoopCommand__Group_4__0__Impl rule__LoopCommand__Group_4__1 ;
    public final void rule__LoopCommand__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1137:1: ( rule__LoopCommand__Group_4__0__Impl rule__LoopCommand__Group_4__1 )
            // InternalBeatoven.g:1138:2: rule__LoopCommand__Group_4__0__Impl rule__LoopCommand__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__LoopCommand__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group_4__1();

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
    // $ANTLR end "rule__LoopCommand__Group_4__0"


    // $ANTLR start "rule__LoopCommand__Group_4__0__Impl"
    // InternalBeatoven.g:1145:1: rule__LoopCommand__Group_4__0__Impl : ( ( rule__LoopCommand__ContinueAssignment_4_0 ) ) ;
    public final void rule__LoopCommand__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1149:1: ( ( ( rule__LoopCommand__ContinueAssignment_4_0 ) ) )
            // InternalBeatoven.g:1150:1: ( ( rule__LoopCommand__ContinueAssignment_4_0 ) )
            {
            // InternalBeatoven.g:1150:1: ( ( rule__LoopCommand__ContinueAssignment_4_0 ) )
            // InternalBeatoven.g:1151:2: ( rule__LoopCommand__ContinueAssignment_4_0 )
            {
             before(grammarAccess.getLoopCommandAccess().getContinueAssignment_4_0()); 
            // InternalBeatoven.g:1152:2: ( rule__LoopCommand__ContinueAssignment_4_0 )
            // InternalBeatoven.g:1152:3: rule__LoopCommand__ContinueAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__LoopCommand__ContinueAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getLoopCommandAccess().getContinueAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group_4__0__Impl"


    // $ANTLR start "rule__LoopCommand__Group_4__1"
    // InternalBeatoven.g:1160:1: rule__LoopCommand__Group_4__1 : rule__LoopCommand__Group_4__1__Impl ;
    public final void rule__LoopCommand__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1164:1: ( rule__LoopCommand__Group_4__1__Impl )
            // InternalBeatoven.g:1165:2: rule__LoopCommand__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoopCommand__Group_4__1__Impl();

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
    // $ANTLR end "rule__LoopCommand__Group_4__1"


    // $ANTLR start "rule__LoopCommand__Group_4__1__Impl"
    // InternalBeatoven.g:1171:1: rule__LoopCommand__Group_4__1__Impl : ( ( rule__LoopCommand__NextAssignment_4_1 ) ) ;
    public final void rule__LoopCommand__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1175:1: ( ( ( rule__LoopCommand__NextAssignment_4_1 ) ) )
            // InternalBeatoven.g:1176:1: ( ( rule__LoopCommand__NextAssignment_4_1 ) )
            {
            // InternalBeatoven.g:1176:1: ( ( rule__LoopCommand__NextAssignment_4_1 ) )
            // InternalBeatoven.g:1177:2: ( rule__LoopCommand__NextAssignment_4_1 )
            {
             before(grammarAccess.getLoopCommandAccess().getNextAssignment_4_1()); 
            // InternalBeatoven.g:1178:2: ( rule__LoopCommand__NextAssignment_4_1 )
            // InternalBeatoven.g:1178:3: rule__LoopCommand__NextAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LoopCommand__NextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopCommandAccess().getNextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__Group_4__1__Impl"


    // $ANTLR start "rule__DrumSample__Group__0"
    // InternalBeatoven.g:1187:1: rule__DrumSample__Group__0 : rule__DrumSample__Group__0__Impl rule__DrumSample__Group__1 ;
    public final void rule__DrumSample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1191:1: ( rule__DrumSample__Group__0__Impl rule__DrumSample__Group__1 )
            // InternalBeatoven.g:1192:2: rule__DrumSample__Group__0__Impl rule__DrumSample__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__DrumSample__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DrumSample__Group__1();

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
    // $ANTLR end "rule__DrumSample__Group__0"


    // $ANTLR start "rule__DrumSample__Group__0__Impl"
    // InternalBeatoven.g:1199:1: rule__DrumSample__Group__0__Impl : ( ( rule__DrumSample__StyleAssignment_0 ) ) ;
    public final void rule__DrumSample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1203:1: ( ( ( rule__DrumSample__StyleAssignment_0 ) ) )
            // InternalBeatoven.g:1204:1: ( ( rule__DrumSample__StyleAssignment_0 ) )
            {
            // InternalBeatoven.g:1204:1: ( ( rule__DrumSample__StyleAssignment_0 ) )
            // InternalBeatoven.g:1205:2: ( rule__DrumSample__StyleAssignment_0 )
            {
             before(grammarAccess.getDrumSampleAccess().getStyleAssignment_0()); 
            // InternalBeatoven.g:1206:2: ( rule__DrumSample__StyleAssignment_0 )
            // InternalBeatoven.g:1206:3: rule__DrumSample__StyleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DrumSample__StyleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDrumSampleAccess().getStyleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DrumSample__Group__0__Impl"


    // $ANTLR start "rule__DrumSample__Group__1"
    // InternalBeatoven.g:1214:1: rule__DrumSample__Group__1 : rule__DrumSample__Group__1__Impl rule__DrumSample__Group__2 ;
    public final void rule__DrumSample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1218:1: ( rule__DrumSample__Group__1__Impl rule__DrumSample__Group__2 )
            // InternalBeatoven.g:1219:2: rule__DrumSample__Group__1__Impl rule__DrumSample__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DrumSample__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DrumSample__Group__2();

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
    // $ANTLR end "rule__DrumSample__Group__1"


    // $ANTLR start "rule__DrumSample__Group__1__Impl"
    // InternalBeatoven.g:1226:1: rule__DrumSample__Group__1__Impl : ( ( rule__DrumSample__SampleAssignment_1 ) ) ;
    public final void rule__DrumSample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1230:1: ( ( ( rule__DrumSample__SampleAssignment_1 ) ) )
            // InternalBeatoven.g:1231:1: ( ( rule__DrumSample__SampleAssignment_1 ) )
            {
            // InternalBeatoven.g:1231:1: ( ( rule__DrumSample__SampleAssignment_1 ) )
            // InternalBeatoven.g:1232:2: ( rule__DrumSample__SampleAssignment_1 )
            {
             before(grammarAccess.getDrumSampleAccess().getSampleAssignment_1()); 
            // InternalBeatoven.g:1233:2: ( rule__DrumSample__SampleAssignment_1 )
            // InternalBeatoven.g:1233:3: rule__DrumSample__SampleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DrumSample__SampleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDrumSampleAccess().getSampleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DrumSample__Group__1__Impl"


    // $ANTLR start "rule__DrumSample__Group__2"
    // InternalBeatoven.g:1241:1: rule__DrumSample__Group__2 : rule__DrumSample__Group__2__Impl ;
    public final void rule__DrumSample__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1245:1: ( rule__DrumSample__Group__2__Impl )
            // InternalBeatoven.g:1246:2: rule__DrumSample__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DrumSample__Group__2__Impl();

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
    // $ANTLR end "rule__DrumSample__Group__2"


    // $ANTLR start "rule__DrumSample__Group__2__Impl"
    // InternalBeatoven.g:1252:1: rule__DrumSample__Group__2__Impl : ( ( rule__DrumSample__CounterAssignment_2 ) ) ;
    public final void rule__DrumSample__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1256:1: ( ( ( rule__DrumSample__CounterAssignment_2 ) ) )
            // InternalBeatoven.g:1257:1: ( ( rule__DrumSample__CounterAssignment_2 ) )
            {
            // InternalBeatoven.g:1257:1: ( ( rule__DrumSample__CounterAssignment_2 ) )
            // InternalBeatoven.g:1258:2: ( rule__DrumSample__CounterAssignment_2 )
            {
             before(grammarAccess.getDrumSampleAccess().getCounterAssignment_2()); 
            // InternalBeatoven.g:1259:2: ( rule__DrumSample__CounterAssignment_2 )
            // InternalBeatoven.g:1259:3: rule__DrumSample__CounterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DrumSample__CounterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDrumSampleAccess().getCounterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DrumSample__Group__2__Impl"


    // $ANTLR start "rule__Melody__Group__0"
    // InternalBeatoven.g:1268:1: rule__Melody__Group__0 : rule__Melody__Group__0__Impl rule__Melody__Group__1 ;
    public final void rule__Melody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1272:1: ( rule__Melody__Group__0__Impl rule__Melody__Group__1 )
            // InternalBeatoven.g:1273:2: rule__Melody__Group__0__Impl rule__Melody__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Melody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Melody__Group__1();

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
    // $ANTLR end "rule__Melody__Group__0"


    // $ANTLR start "rule__Melody__Group__0__Impl"
    // InternalBeatoven.g:1280:1: rule__Melody__Group__0__Impl : ( ( rule__Melody__AmountOfNotesAssignment_0 ) ) ;
    public final void rule__Melody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1284:1: ( ( ( rule__Melody__AmountOfNotesAssignment_0 ) ) )
            // InternalBeatoven.g:1285:1: ( ( rule__Melody__AmountOfNotesAssignment_0 ) )
            {
            // InternalBeatoven.g:1285:1: ( ( rule__Melody__AmountOfNotesAssignment_0 ) )
            // InternalBeatoven.g:1286:2: ( rule__Melody__AmountOfNotesAssignment_0 )
            {
             before(grammarAccess.getMelodyAccess().getAmountOfNotesAssignment_0()); 
            // InternalBeatoven.g:1287:2: ( rule__Melody__AmountOfNotesAssignment_0 )
            // InternalBeatoven.g:1287:3: rule__Melody__AmountOfNotesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Melody__AmountOfNotesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getAmountOfNotesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__0__Impl"


    // $ANTLR start "rule__Melody__Group__1"
    // InternalBeatoven.g:1295:1: rule__Melody__Group__1 : rule__Melody__Group__1__Impl rule__Melody__Group__2 ;
    public final void rule__Melody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1299:1: ( rule__Melody__Group__1__Impl rule__Melody__Group__2 )
            // InternalBeatoven.g:1300:2: rule__Melody__Group__1__Impl rule__Melody__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Melody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Melody__Group__2();

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
    // $ANTLR end "rule__Melody__Group__1"


    // $ANTLR start "rule__Melody__Group__1__Impl"
    // InternalBeatoven.g:1307:1: rule__Melody__Group__1__Impl : ( ( rule__Melody__IsMelodyAssignment_1 ) ) ;
    public final void rule__Melody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1311:1: ( ( ( rule__Melody__IsMelodyAssignment_1 ) ) )
            // InternalBeatoven.g:1312:1: ( ( rule__Melody__IsMelodyAssignment_1 ) )
            {
            // InternalBeatoven.g:1312:1: ( ( rule__Melody__IsMelodyAssignment_1 ) )
            // InternalBeatoven.g:1313:2: ( rule__Melody__IsMelodyAssignment_1 )
            {
             before(grammarAccess.getMelodyAccess().getIsMelodyAssignment_1()); 
            // InternalBeatoven.g:1314:2: ( rule__Melody__IsMelodyAssignment_1 )
            // InternalBeatoven.g:1314:3: rule__Melody__IsMelodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Melody__IsMelodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getIsMelodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__1__Impl"


    // $ANTLR start "rule__Melody__Group__2"
    // InternalBeatoven.g:1322:1: rule__Melody__Group__2 : rule__Melody__Group__2__Impl rule__Melody__Group__3 ;
    public final void rule__Melody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1326:1: ( rule__Melody__Group__2__Impl rule__Melody__Group__3 )
            // InternalBeatoven.g:1327:2: rule__Melody__Group__2__Impl rule__Melody__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Melody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Melody__Group__3();

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
    // $ANTLR end "rule__Melody__Group__2"


    // $ANTLR start "rule__Melody__Group__2__Impl"
    // InternalBeatoven.g:1334:1: rule__Melody__Group__2__Impl : ( ( rule__Melody__StyleAssignment_2 ) ) ;
    public final void rule__Melody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1338:1: ( ( ( rule__Melody__StyleAssignment_2 ) ) )
            // InternalBeatoven.g:1339:1: ( ( rule__Melody__StyleAssignment_2 ) )
            {
            // InternalBeatoven.g:1339:1: ( ( rule__Melody__StyleAssignment_2 ) )
            // InternalBeatoven.g:1340:2: ( rule__Melody__StyleAssignment_2 )
            {
             before(grammarAccess.getMelodyAccess().getStyleAssignment_2()); 
            // InternalBeatoven.g:1341:2: ( rule__Melody__StyleAssignment_2 )
            // InternalBeatoven.g:1341:3: rule__Melody__StyleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Melody__StyleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getStyleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__2__Impl"


    // $ANTLR start "rule__Melody__Group__3"
    // InternalBeatoven.g:1349:1: rule__Melody__Group__3 : rule__Melody__Group__3__Impl ;
    public final void rule__Melody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1353:1: ( rule__Melody__Group__3__Impl )
            // InternalBeatoven.g:1354:2: rule__Melody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Melody__Group__3__Impl();

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
    // $ANTLR end "rule__Melody__Group__3"


    // $ANTLR start "rule__Melody__Group__3__Impl"
    // InternalBeatoven.g:1360:1: rule__Melody__Group__3__Impl : ( ( rule__Melody__PatternAssignment_3 ) ) ;
    public final void rule__Melody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1364:1: ( ( ( rule__Melody__PatternAssignment_3 ) ) )
            // InternalBeatoven.g:1365:1: ( ( rule__Melody__PatternAssignment_3 ) )
            {
            // InternalBeatoven.g:1365:1: ( ( rule__Melody__PatternAssignment_3 ) )
            // InternalBeatoven.g:1366:2: ( rule__Melody__PatternAssignment_3 )
            {
             before(grammarAccess.getMelodyAccess().getPatternAssignment_3()); 
            // InternalBeatoven.g:1367:2: ( rule__Melody__PatternAssignment_3 )
            // InternalBeatoven.g:1367:3: rule__Melody__PatternAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Melody__PatternAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMelodyAccess().getPatternAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__Group__3__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalBeatoven.g:1376:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1380:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalBeatoven.g:1381:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Duration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

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
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalBeatoven.g:1388:1: rule__Duration__Group__0__Impl : ( 'for' ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1392:1: ( ( 'for' ) )
            // InternalBeatoven.g:1393:1: ( 'for' )
            {
            // InternalBeatoven.g:1393:1: ( 'for' )
            // InternalBeatoven.g:1394:2: 'for'
            {
             before(grammarAccess.getDurationAccess().getForKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDurationAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalBeatoven.g:1403:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl rule__Duration__Group__2 ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1407:1: ( rule__Duration__Group__1__Impl rule__Duration__Group__2 )
            // InternalBeatoven.g:1408:2: rule__Duration__Group__1__Impl rule__Duration__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Duration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__2();

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
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalBeatoven.g:1415:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__AmountOfBarsAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1419:1: ( ( ( rule__Duration__AmountOfBarsAssignment_1 ) ) )
            // InternalBeatoven.g:1420:1: ( ( rule__Duration__AmountOfBarsAssignment_1 ) )
            {
            // InternalBeatoven.g:1420:1: ( ( rule__Duration__AmountOfBarsAssignment_1 ) )
            // InternalBeatoven.g:1421:2: ( rule__Duration__AmountOfBarsAssignment_1 )
            {
             before(grammarAccess.getDurationAccess().getAmountOfBarsAssignment_1()); 
            // InternalBeatoven.g:1422:2: ( rule__Duration__AmountOfBarsAssignment_1 )
            // InternalBeatoven.g:1422:3: rule__Duration__AmountOfBarsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Duration__AmountOfBarsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getAmountOfBarsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__Duration__Group__2"
    // InternalBeatoven.g:1430:1: rule__Duration__Group__2 : rule__Duration__Group__2__Impl ;
    public final void rule__Duration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1434:1: ( rule__Duration__Group__2__Impl )
            // InternalBeatoven.g:1435:2: rule__Duration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__2__Impl();

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
    // $ANTLR end "rule__Duration__Group__2"


    // $ANTLR start "rule__Duration__Group__2__Impl"
    // InternalBeatoven.g:1441:1: rule__Duration__Group__2__Impl : ( 'bars' ) ;
    public final void rule__Duration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1445:1: ( ( 'bars' ) )
            // InternalBeatoven.g:1446:1: ( 'bars' )
            {
            // InternalBeatoven.g:1446:1: ( 'bars' )
            // InternalBeatoven.g:1447:2: 'bars'
            {
             before(grammarAccess.getDurationAccess().getBarsKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDurationAccess().getBarsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__2__Impl"


    // $ANTLR start "rule__Frequency__Group_0__0"
    // InternalBeatoven.g:1457:1: rule__Frequency__Group_0__0 : rule__Frequency__Group_0__0__Impl rule__Frequency__Group_0__1 ;
    public final void rule__Frequency__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1461:1: ( rule__Frequency__Group_0__0__Impl rule__Frequency__Group_0__1 )
            // InternalBeatoven.g:1462:2: rule__Frequency__Group_0__0__Impl rule__Frequency__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Frequency__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frequency__Group_0__1();

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
    // $ANTLR end "rule__Frequency__Group_0__0"


    // $ANTLR start "rule__Frequency__Group_0__0__Impl"
    // InternalBeatoven.g:1469:1: rule__Frequency__Group_0__0__Impl : ( ( rule__Frequency__EachAssignment_0_0 ) ) ;
    public final void rule__Frequency__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1473:1: ( ( ( rule__Frequency__EachAssignment_0_0 ) ) )
            // InternalBeatoven.g:1474:1: ( ( rule__Frequency__EachAssignment_0_0 ) )
            {
            // InternalBeatoven.g:1474:1: ( ( rule__Frequency__EachAssignment_0_0 ) )
            // InternalBeatoven.g:1475:2: ( rule__Frequency__EachAssignment_0_0 )
            {
             before(grammarAccess.getFrequencyAccess().getEachAssignment_0_0()); 
            // InternalBeatoven.g:1476:2: ( rule__Frequency__EachAssignment_0_0 )
            // InternalBeatoven.g:1476:3: rule__Frequency__EachAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__EachAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyAccess().getEachAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group_0__0__Impl"


    // $ANTLR start "rule__Frequency__Group_0__1"
    // InternalBeatoven.g:1484:1: rule__Frequency__Group_0__1 : rule__Frequency__Group_0__1__Impl rule__Frequency__Group_0__2 ;
    public final void rule__Frequency__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1488:1: ( rule__Frequency__Group_0__1__Impl rule__Frequency__Group_0__2 )
            // InternalBeatoven.g:1489:2: rule__Frequency__Group_0__1__Impl rule__Frequency__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__Frequency__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frequency__Group_0__2();

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
    // $ANTLR end "rule__Frequency__Group_0__1"


    // $ANTLR start "rule__Frequency__Group_0__1__Impl"
    // InternalBeatoven.g:1496:1: rule__Frequency__Group_0__1__Impl : ( ( rule__Frequency__AmountOfBeatsAssignment_0_1 ) ) ;
    public final void rule__Frequency__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1500:1: ( ( ( rule__Frequency__AmountOfBeatsAssignment_0_1 ) ) )
            // InternalBeatoven.g:1501:1: ( ( rule__Frequency__AmountOfBeatsAssignment_0_1 ) )
            {
            // InternalBeatoven.g:1501:1: ( ( rule__Frequency__AmountOfBeatsAssignment_0_1 ) )
            // InternalBeatoven.g:1502:2: ( rule__Frequency__AmountOfBeatsAssignment_0_1 )
            {
             before(grammarAccess.getFrequencyAccess().getAmountOfBeatsAssignment_0_1()); 
            // InternalBeatoven.g:1503:2: ( rule__Frequency__AmountOfBeatsAssignment_0_1 )
            // InternalBeatoven.g:1503:3: rule__Frequency__AmountOfBeatsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__AmountOfBeatsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyAccess().getAmountOfBeatsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group_0__1__Impl"


    // $ANTLR start "rule__Frequency__Group_0__2"
    // InternalBeatoven.g:1511:1: rule__Frequency__Group_0__2 : rule__Frequency__Group_0__2__Impl ;
    public final void rule__Frequency__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1515:1: ( rule__Frequency__Group_0__2__Impl )
            // InternalBeatoven.g:1516:2: rule__Frequency__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__Group_0__2__Impl();

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
    // $ANTLR end "rule__Frequency__Group_0__2"


    // $ANTLR start "rule__Frequency__Group_0__2__Impl"
    // InternalBeatoven.g:1522:1: rule__Frequency__Group_0__2__Impl : ( 'beat' ) ;
    public final void rule__Frequency__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1526:1: ( ( 'beat' ) )
            // InternalBeatoven.g:1527:1: ( 'beat' )
            {
            // InternalBeatoven.g:1527:1: ( 'beat' )
            // InternalBeatoven.g:1528:2: 'beat'
            {
             before(grammarAccess.getFrequencyAccess().getBeatKeyword_0_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFrequencyAccess().getBeatKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group_0__2__Impl"


    // $ANTLR start "rule__Frequency__Group_1__0"
    // InternalBeatoven.g:1538:1: rule__Frequency__Group_1__0 : rule__Frequency__Group_1__0__Impl rule__Frequency__Group_1__1 ;
    public final void rule__Frequency__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1542:1: ( rule__Frequency__Group_1__0__Impl rule__Frequency__Group_1__1 )
            // InternalBeatoven.g:1543:2: rule__Frequency__Group_1__0__Impl rule__Frequency__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Frequency__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frequency__Group_1__1();

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
    // $ANTLR end "rule__Frequency__Group_1__0"


    // $ANTLR start "rule__Frequency__Group_1__0__Impl"
    // InternalBeatoven.g:1550:1: rule__Frequency__Group_1__0__Impl : ( ( rule__Frequency__EveryAssignment_1_0 ) ) ;
    public final void rule__Frequency__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1554:1: ( ( ( rule__Frequency__EveryAssignment_1_0 ) ) )
            // InternalBeatoven.g:1555:1: ( ( rule__Frequency__EveryAssignment_1_0 ) )
            {
            // InternalBeatoven.g:1555:1: ( ( rule__Frequency__EveryAssignment_1_0 ) )
            // InternalBeatoven.g:1556:2: ( rule__Frequency__EveryAssignment_1_0 )
            {
             before(grammarAccess.getFrequencyAccess().getEveryAssignment_1_0()); 
            // InternalBeatoven.g:1557:2: ( rule__Frequency__EveryAssignment_1_0 )
            // InternalBeatoven.g:1557:3: rule__Frequency__EveryAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__EveryAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyAccess().getEveryAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group_1__0__Impl"


    // $ANTLR start "rule__Frequency__Group_1__1"
    // InternalBeatoven.g:1565:1: rule__Frequency__Group_1__1 : rule__Frequency__Group_1__1__Impl rule__Frequency__Group_1__2 ;
    public final void rule__Frequency__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1569:1: ( rule__Frequency__Group_1__1__Impl rule__Frequency__Group_1__2 )
            // InternalBeatoven.g:1570:2: rule__Frequency__Group_1__1__Impl rule__Frequency__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Frequency__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frequency__Group_1__2();

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
    // $ANTLR end "rule__Frequency__Group_1__1"


    // $ANTLR start "rule__Frequency__Group_1__1__Impl"
    // InternalBeatoven.g:1577:1: rule__Frequency__Group_1__1__Impl : ( ( rule__Frequency__AmountOfBeatsAssignment_1_1 ) ) ;
    public final void rule__Frequency__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1581:1: ( ( ( rule__Frequency__AmountOfBeatsAssignment_1_1 ) ) )
            // InternalBeatoven.g:1582:1: ( ( rule__Frequency__AmountOfBeatsAssignment_1_1 ) )
            {
            // InternalBeatoven.g:1582:1: ( ( rule__Frequency__AmountOfBeatsAssignment_1_1 ) )
            // InternalBeatoven.g:1583:2: ( rule__Frequency__AmountOfBeatsAssignment_1_1 )
            {
             before(grammarAccess.getFrequencyAccess().getAmountOfBeatsAssignment_1_1()); 
            // InternalBeatoven.g:1584:2: ( rule__Frequency__AmountOfBeatsAssignment_1_1 )
            // InternalBeatoven.g:1584:3: rule__Frequency__AmountOfBeatsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__AmountOfBeatsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFrequencyAccess().getAmountOfBeatsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group_1__1__Impl"


    // $ANTLR start "rule__Frequency__Group_1__2"
    // InternalBeatoven.g:1592:1: rule__Frequency__Group_1__2 : rule__Frequency__Group_1__2__Impl ;
    public final void rule__Frequency__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1596:1: ( rule__Frequency__Group_1__2__Impl )
            // InternalBeatoven.g:1597:2: rule__Frequency__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frequency__Group_1__2__Impl();

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
    // $ANTLR end "rule__Frequency__Group_1__2"


    // $ANTLR start "rule__Frequency__Group_1__2__Impl"
    // InternalBeatoven.g:1603:1: rule__Frequency__Group_1__2__Impl : ( 'beats' ) ;
    public final void rule__Frequency__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1607:1: ( ( 'beats' ) )
            // InternalBeatoven.g:1608:1: ( 'beats' )
            {
            // InternalBeatoven.g:1608:1: ( 'beats' )
            // InternalBeatoven.g:1609:2: 'beats'
            {
             before(grammarAccess.getFrequencyAccess().getBeatsKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFrequencyAccess().getBeatsKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__Group_1__2__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalBeatoven.g:1619:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1623:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalBeatoven.g:1624:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

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
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalBeatoven.g:1631:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1635:1: ( ( ( RULE_INT )? ) )
            // InternalBeatoven.g:1636:1: ( ( RULE_INT )? )
            {
            // InternalBeatoven.g:1636:1: ( ( RULE_INT )? )
            // InternalBeatoven.g:1637:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalBeatoven.g:1638:2: ( RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBeatoven.g:1638:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalBeatoven.g:1646:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1650:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalBeatoven.g:1651:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

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
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalBeatoven.g:1658:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1662:1: ( ( '.' ) )
            // InternalBeatoven.g:1663:1: ( '.' )
            {
            // InternalBeatoven.g:1663:1: ( '.' )
            // InternalBeatoven.g:1664:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalBeatoven.g:1673:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1677:1: ( rule__REAL__Group__2__Impl )
            // InternalBeatoven.g:1678:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

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
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalBeatoven.g:1684:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1688:1: ( ( RULE_INT ) )
            // InternalBeatoven.g:1689:1: ( RULE_INT )
            {
            // InternalBeatoven.g:1689:1: ( RULE_INT )
            // InternalBeatoven.g:1690:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__Model__KeyAssignment_0"
    // InternalBeatoven.g:1700:1: rule__Model__KeyAssignment_0 : ( RULE_KEY ) ;
    public final void rule__Model__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1704:1: ( ( RULE_KEY ) )
            // InternalBeatoven.g:1705:2: ( RULE_KEY )
            {
            // InternalBeatoven.g:1705:2: ( RULE_KEY )
            // InternalBeatoven.g:1706:3: RULE_KEY
            {
             before(grammarAccess.getModelAccess().getKeyKEYTerminalRuleCall_0_0()); 
            match(input,RULE_KEY,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getKeyKEYTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__KeyAssignment_0"


    // $ANTLR start "rule__Model__ScaleAssignment_1"
    // InternalBeatoven.g:1715:1: rule__Model__ScaleAssignment_1 : ( ruleScale ) ;
    public final void rule__Model__ScaleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1719:1: ( ( ruleScale ) )
            // InternalBeatoven.g:1720:2: ( ruleScale )
            {
            // InternalBeatoven.g:1720:2: ( ruleScale )
            // InternalBeatoven.g:1721:3: ruleScale
            {
             before(grammarAccess.getModelAccess().getScaleScaleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScale();

            state._fsp--;

             after(grammarAccess.getModelAccess().getScaleScaleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ScaleAssignment_1"


    // $ANTLR start "rule__Model__BpmAssignment_2"
    // InternalBeatoven.g:1730:1: rule__Model__BpmAssignment_2 : ( RULE_INT ) ;
    public final void rule__Model__BpmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1734:1: ( ( RULE_INT ) )
            // InternalBeatoven.g:1735:2: ( RULE_INT )
            {
            // InternalBeatoven.g:1735:2: ( RULE_INT )
            // InternalBeatoven.g:1736:3: RULE_INT
            {
             before(grammarAccess.getModelAccess().getBpmINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getBpmINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BpmAssignment_2"


    // $ANTLR start "rule__Model__IsRandomisedAssignment_3"
    // InternalBeatoven.g:1745:1: rule__Model__IsRandomisedAssignment_3 : ( ( 'randomise' ) ) ;
    public final void rule__Model__IsRandomisedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1749:1: ( ( ( 'randomise' ) ) )
            // InternalBeatoven.g:1750:2: ( ( 'randomise' ) )
            {
            // InternalBeatoven.g:1750:2: ( ( 'randomise' ) )
            // InternalBeatoven.g:1751:3: ( 'randomise' )
            {
             before(grammarAccess.getModelAccess().getIsRandomisedRandomiseKeyword_3_0()); 
            // InternalBeatoven.g:1752:3: ( 'randomise' )
            // InternalBeatoven.g:1753:4: 'randomise'
            {
             before(grammarAccess.getModelAccess().getIsRandomisedRandomiseKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getIsRandomisedRandomiseKeyword_3_0()); 

            }

             after(grammarAccess.getModelAccess().getIsRandomisedRandomiseKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__IsRandomisedAssignment_3"


    // $ANTLR start "rule__Model__SectionsAssignment_4"
    // InternalBeatoven.g:1764:1: rule__Model__SectionsAssignment_4 : ( ruleSection ) ;
    public final void rule__Model__SectionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1768:1: ( ( ruleSection ) )
            // InternalBeatoven.g:1769:2: ( ruleSection )
            {
            // InternalBeatoven.g:1769:2: ( ruleSection )
            // InternalBeatoven.g:1770:3: ruleSection
            {
             before(grammarAccess.getModelAccess().getSectionsSectionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSectionsSectionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SectionsAssignment_4"


    // $ANTLR start "rule__Model__CallsAssignment_5"
    // InternalBeatoven.g:1779:1: rule__Model__CallsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Model__CallsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1783:1: ( ( ( RULE_ID ) ) )
            // InternalBeatoven.g:1784:2: ( ( RULE_ID ) )
            {
            // InternalBeatoven.g:1784:2: ( ( RULE_ID ) )
            // InternalBeatoven.g:1785:3: ( RULE_ID )
            {
             before(grammarAccess.getModelAccess().getCallsSectionCrossReference_5_0()); 
            // InternalBeatoven.g:1786:3: ( RULE_ID )
            // InternalBeatoven.g:1787:4: RULE_ID
            {
             before(grammarAccess.getModelAccess().getCallsSectionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCallsSectionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getModelAccess().getCallsSectionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CallsAssignment_5"


    // $ANTLR start "rule__Section__NameAssignment_0"
    // InternalBeatoven.g:1798:1: rule__Section__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1802:1: ( ( RULE_ID ) )
            // InternalBeatoven.g:1803:2: ( RULE_ID )
            {
            // InternalBeatoven.g:1803:2: ( RULE_ID )
            // InternalBeatoven.g:1804:3: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_0"


    // $ANTLR start "rule__Section__DurationAssignment_1"
    // InternalBeatoven.g:1813:1: rule__Section__DurationAssignment_1 : ( ruleDuration ) ;
    public final void rule__Section__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1817:1: ( ( ruleDuration ) )
            // InternalBeatoven.g:1818:2: ( ruleDuration )
            {
            // InternalBeatoven.g:1818:2: ( ruleDuration )
            // InternalBeatoven.g:1819:3: ruleDuration
            {
             before(grammarAccess.getSectionAccess().getDurationDurationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getDurationDurationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__DurationAssignment_1"


    // $ANTLR start "rule__Section__CommandsAssignment_3"
    // InternalBeatoven.g:1828:1: rule__Section__CommandsAssignment_3 : ( ruleCommand ) ;
    public final void rule__Section__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1832:1: ( ( ruleCommand ) )
            // InternalBeatoven.g:1833:2: ( ruleCommand )
            {
            // InternalBeatoven.g:1833:2: ( ruleCommand )
            // InternalBeatoven.g:1834:3: ruleCommand
            {
             before(grammarAccess.getSectionAccess().getCommandsCommandParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getCommandsCommandParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__CommandsAssignment_3"


    // $ANTLR start "rule__ActionCommand__ActionAssignment_0"
    // InternalBeatoven.g:1843:1: rule__ActionCommand__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__ActionCommand__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1847:1: ( ( ruleAction ) )
            // InternalBeatoven.g:1848:2: ( ruleAction )
            {
            // InternalBeatoven.g:1848:2: ( ruleAction )
            // InternalBeatoven.g:1849:3: ruleAction
            {
             before(grammarAccess.getActionCommandAccess().getActionActionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionCommandAccess().getActionActionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCommand__ActionAssignment_0"


    // $ANTLR start "rule__ActionCommand__SoundAssignment_1"
    // InternalBeatoven.g:1858:1: rule__ActionCommand__SoundAssignment_1 : ( ruleSoundLiteral ) ;
    public final void rule__ActionCommand__SoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1862:1: ( ( ruleSoundLiteral ) )
            // InternalBeatoven.g:1863:2: ( ruleSoundLiteral )
            {
            // InternalBeatoven.g:1863:2: ( ruleSoundLiteral )
            // InternalBeatoven.g:1864:3: ruleSoundLiteral
            {
             before(grammarAccess.getActionCommandAccess().getSoundSoundLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSoundLiteral();

            state._fsp--;

             after(grammarAccess.getActionCommandAccess().getSoundSoundLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCommand__SoundAssignment_1"


    // $ANTLR start "rule__ActionCommand__FrequencyAssignment_2"
    // InternalBeatoven.g:1873:1: rule__ActionCommand__FrequencyAssignment_2 : ( ruleFrequency ) ;
    public final void rule__ActionCommand__FrequencyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1877:1: ( ( ruleFrequency ) )
            // InternalBeatoven.g:1878:2: ( ruleFrequency )
            {
            // InternalBeatoven.g:1878:2: ( ruleFrequency )
            // InternalBeatoven.g:1879:3: ruleFrequency
            {
             before(grammarAccess.getActionCommandAccess().getFrequencyFrequencyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFrequency();

            state._fsp--;

             after(grammarAccess.getActionCommandAccess().getFrequencyFrequencyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionCommand__FrequencyAssignment_2"


    // $ANTLR start "rule__LoopCommand__DurationAssignment_1"
    // InternalBeatoven.g:1888:1: rule__LoopCommand__DurationAssignment_1 : ( ruleDuration ) ;
    public final void rule__LoopCommand__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1892:1: ( ( ruleDuration ) )
            // InternalBeatoven.g:1893:2: ( ruleDuration )
            {
            // InternalBeatoven.g:1893:2: ( ruleDuration )
            // InternalBeatoven.g:1894:3: ruleDuration
            {
             before(grammarAccess.getLoopCommandAccess().getDurationDurationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getLoopCommandAccess().getDurationDurationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__DurationAssignment_1"


    // $ANTLR start "rule__LoopCommand__CommandsAssignment_3"
    // InternalBeatoven.g:1903:1: rule__LoopCommand__CommandsAssignment_3 : ( ruleActionCommand ) ;
    public final void rule__LoopCommand__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1907:1: ( ( ruleActionCommand ) )
            // InternalBeatoven.g:1908:2: ( ruleActionCommand )
            {
            // InternalBeatoven.g:1908:2: ( ruleActionCommand )
            // InternalBeatoven.g:1909:3: ruleActionCommand
            {
             before(grammarAccess.getLoopCommandAccess().getCommandsActionCommandParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleActionCommand();

            state._fsp--;

             after(grammarAccess.getLoopCommandAccess().getCommandsActionCommandParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__CommandsAssignment_3"


    // $ANTLR start "rule__LoopCommand__ContinueAssignment_4_0"
    // InternalBeatoven.g:1918:1: rule__LoopCommand__ContinueAssignment_4_0 : ( ( 'then' ) ) ;
    public final void rule__LoopCommand__ContinueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1922:1: ( ( ( 'then' ) ) )
            // InternalBeatoven.g:1923:2: ( ( 'then' ) )
            {
            // InternalBeatoven.g:1923:2: ( ( 'then' ) )
            // InternalBeatoven.g:1924:3: ( 'then' )
            {
             before(grammarAccess.getLoopCommandAccess().getContinueThenKeyword_4_0_0()); 
            // InternalBeatoven.g:1925:3: ( 'then' )
            // InternalBeatoven.g:1926:4: 'then'
            {
             before(grammarAccess.getLoopCommandAccess().getContinueThenKeyword_4_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopCommandAccess().getContinueThenKeyword_4_0_0()); 

            }

             after(grammarAccess.getLoopCommandAccess().getContinueThenKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__ContinueAssignment_4_0"


    // $ANTLR start "rule__LoopCommand__NextAssignment_4_1"
    // InternalBeatoven.g:1937:1: rule__LoopCommand__NextAssignment_4_1 : ( ruleCommand ) ;
    public final void rule__LoopCommand__NextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1941:1: ( ( ruleCommand ) )
            // InternalBeatoven.g:1942:2: ( ruleCommand )
            {
            // InternalBeatoven.g:1942:2: ( ruleCommand )
            // InternalBeatoven.g:1943:3: ruleCommand
            {
             before(grammarAccess.getLoopCommandAccess().getNextCommandParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getLoopCommandAccess().getNextCommandParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoopCommand__NextAssignment_4_1"


    // $ANTLR start "rule__DrumSample__StyleAssignment_0"
    // InternalBeatoven.g:1952:1: rule__DrumSample__StyleAssignment_0 : ( RULE_ID ) ;
    public final void rule__DrumSample__StyleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1956:1: ( ( RULE_ID ) )
            // InternalBeatoven.g:1957:2: ( RULE_ID )
            {
            // InternalBeatoven.g:1957:2: ( RULE_ID )
            // InternalBeatoven.g:1958:3: RULE_ID
            {
             before(grammarAccess.getDrumSampleAccess().getStyleIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDrumSampleAccess().getStyleIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DrumSample__StyleAssignment_0"


    // $ANTLR start "rule__DrumSample__SampleAssignment_1"
    // InternalBeatoven.g:1967:1: rule__DrumSample__SampleAssignment_1 : ( ruleSample ) ;
    public final void rule__DrumSample__SampleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1971:1: ( ( ruleSample ) )
            // InternalBeatoven.g:1972:2: ( ruleSample )
            {
            // InternalBeatoven.g:1972:2: ( ruleSample )
            // InternalBeatoven.g:1973:3: ruleSample
            {
             before(grammarAccess.getDrumSampleAccess().getSampleSampleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSample();

            state._fsp--;

             after(grammarAccess.getDrumSampleAccess().getSampleSampleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DrumSample__SampleAssignment_1"


    // $ANTLR start "rule__DrumSample__CounterAssignment_2"
    // InternalBeatoven.g:1982:1: rule__DrumSample__CounterAssignment_2 : ( RULE_INT ) ;
    public final void rule__DrumSample__CounterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:1986:1: ( ( RULE_INT ) )
            // InternalBeatoven.g:1987:2: ( RULE_INT )
            {
            // InternalBeatoven.g:1987:2: ( RULE_INT )
            // InternalBeatoven.g:1988:3: RULE_INT
            {
             before(grammarAccess.getDrumSampleAccess().getCounterINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDrumSampleAccess().getCounterINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DrumSample__CounterAssignment_2"


    // $ANTLR start "rule__Melody__AmountOfNotesAssignment_0"
    // InternalBeatoven.g:1997:1: rule__Melody__AmountOfNotesAssignment_0 : ( RULE_INT ) ;
    public final void rule__Melody__AmountOfNotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:2001:1: ( ( RULE_INT ) )
            // InternalBeatoven.g:2002:2: ( RULE_INT )
            {
            // InternalBeatoven.g:2002:2: ( RULE_INT )
            // InternalBeatoven.g:2003:3: RULE_INT
            {
             before(grammarAccess.getMelodyAccess().getAmountOfNotesINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMelodyAccess().getAmountOfNotesINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__AmountOfNotesAssignment_0"


    // $ANTLR start "rule__Melody__IsMelodyAssignment_1"
    // InternalBeatoven.g:2012:1: rule__Melody__IsMelodyAssignment_1 : ( ( 'note' ) ) ;
    public final void rule__Melody__IsMelodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:2016:1: ( ( ( 'note' ) ) )
            // InternalBeatoven.g:2017:2: ( ( 'note' ) )
            {
            // InternalBeatoven.g:2017:2: ( ( 'note' ) )
            // InternalBeatoven.g:2018:3: ( 'note' )
            {
             before(grammarAccess.getMelodyAccess().getIsMelodyNoteKeyword_1_0()); 
            // InternalBeatoven.g:2019:3: ( 'note' )
            // InternalBeatoven.g:2020:4: 'note'
            {
             before(grammarAccess.getMelodyAccess().getIsMelodyNoteKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMelodyAccess().getIsMelodyNoteKeyword_1_0()); 

            }

             after(grammarAccess.getMelodyAccess().getIsMelodyNoteKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__IsMelodyAssignment_1"


    // $ANTLR start "rule__Melody__StyleAssignment_2"
    // InternalBeatoven.g:2031:1: rule__Melody__StyleAssignment_2 : ( RULE_ID ) ;
    public final void rule__Melody__StyleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:2035:1: ( ( RULE_ID ) )
            // InternalBeatoven.g:2036:2: ( RULE_ID )
            {
            // InternalBeatoven.g:2036:2: ( RULE_ID )
            // InternalBeatoven.g:2037:3: RULE_ID
            {
             before(grammarAccess.getMelodyAccess().getStyleIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMelodyAccess().getStyleIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__StyleAssignment_2"


    // $ANTLR start "rule__Melody__PatternAssignment_3"
    // InternalBeatoven.g:2046:1: rule__Melody__PatternAssignment_3 : ( rulePattern ) ;
    public final void rule__Melody__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:2050:1: ( ( rulePattern ) )
            // InternalBeatoven.g:2051:2: ( rulePattern )
            {
            // InternalBeatoven.g:2051:2: ( rulePattern )
            // InternalBeatoven.g:2052:3: rulePattern
            {
             before(grammarAccess.getMelodyAccess().getPatternPatternParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getMelodyAccess().getPatternPatternParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Melody__PatternAssignment_3"


    // $ANTLR start "rule__Duration__AmountOfBarsAssignment_1"
    // InternalBeatoven.g:2061:1: rule__Duration__AmountOfBarsAssignment_1 : ( RULE_INT ) ;
    public final void rule__Duration__AmountOfBarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:2065:1: ( ( RULE_INT ) )
            // InternalBeatoven.g:2066:2: ( RULE_INT )
            {
            // InternalBeatoven.g:2066:2: ( RULE_INT )
            // InternalBeatoven.g:2067:3: RULE_INT
            {
             before(grammarAccess.getDurationAccess().getAmountOfBarsINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDurationAccess().getAmountOfBarsINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__AmountOfBarsAssignment_1"


    // $ANTLR start "rule__Frequency__EachAssignment_0_0"
    // InternalBeatoven.g:2076:1: rule__Frequency__EachAssignment_0_0 : ( ( 'each' ) ) ;
    public final void rule__Frequency__EachAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:2080:1: ( ( ( 'each' ) ) )
            // InternalBeatoven.g:2081:2: ( ( 'each' ) )
            {
            // InternalBeatoven.g:2081:2: ( ( 'each' ) )
            // InternalBeatoven.g:2082:3: ( 'each' )
            {
             before(grammarAccess.getFrequencyAccess().getEachEachKeyword_0_0_0()); 
            // InternalBeatoven.g:2083:3: ( 'each' )
            // InternalBeatoven.g:2084:4: 'each'
            {
             before(grammarAccess.getFrequencyAccess().getEachEachKeyword_0_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFrequencyAccess().getEachEachKeyword_0_0_0()); 

            }

             after(grammarAccess.getFrequencyAccess().getEachEachKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__EachAssignment_0_0"


    // $ANTLR start "rule__Frequency__AmountOfBeatsAssignment_0_1"
    // InternalBeatoven.g:2095:1: rule__Frequency__AmountOfBeatsAssignment_0_1 : ( ruleVAL ) ;
    public final void rule__Frequency__AmountOfBeatsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:2099:1: ( ( ruleVAL ) )
            // InternalBeatoven.g:2100:2: ( ruleVAL )
            {
            // InternalBeatoven.g:2100:2: ( ruleVAL )
            // InternalBeatoven.g:2101:3: ruleVAL
            {
             before(grammarAccess.getFrequencyAccess().getAmountOfBeatsVALParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVAL();

            state._fsp--;

             after(grammarAccess.getFrequencyAccess().getAmountOfBeatsVALParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__AmountOfBeatsAssignment_0_1"


    // $ANTLR start "rule__Frequency__EveryAssignment_1_0"
    // InternalBeatoven.g:2110:1: rule__Frequency__EveryAssignment_1_0 : ( ( 'every' ) ) ;
    public final void rule__Frequency__EveryAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:2114:1: ( ( ( 'every' ) ) )
            // InternalBeatoven.g:2115:2: ( ( 'every' ) )
            {
            // InternalBeatoven.g:2115:2: ( ( 'every' ) )
            // InternalBeatoven.g:2116:3: ( 'every' )
            {
             before(grammarAccess.getFrequencyAccess().getEveryEveryKeyword_1_0_0()); 
            // InternalBeatoven.g:2117:3: ( 'every' )
            // InternalBeatoven.g:2118:4: 'every'
            {
             before(grammarAccess.getFrequencyAccess().getEveryEveryKeyword_1_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFrequencyAccess().getEveryEveryKeyword_1_0_0()); 

            }

             after(grammarAccess.getFrequencyAccess().getEveryEveryKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__EveryAssignment_1_0"


    // $ANTLR start "rule__Frequency__AmountOfBeatsAssignment_1_1"
    // InternalBeatoven.g:2129:1: rule__Frequency__AmountOfBeatsAssignment_1_1 : ( ruleVAL ) ;
    public final void rule__Frequency__AmountOfBeatsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBeatoven.g:2133:1: ( ( ruleVAL ) )
            // InternalBeatoven.g:2134:2: ( ruleVAL )
            {
            // InternalBeatoven.g:2134:2: ( ruleVAL )
            // InternalBeatoven.g:2135:3: ruleVAL
            {
             before(grammarAccess.getFrequencyAccess().getAmountOfBeatsVALParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVAL();

            state._fsp--;

             after(grammarAccess.getFrequencyAccess().getAmountOfBeatsVALParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frequency__AmountOfBeatsAssignment_1_1"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\1\27\uffff";
    static final String dfa_3s = "\1\6\1\uffff\1\4\1\15\1\36\3\4\1\6\1\37\1\20\2\4\3\37\1\31\1\4\1\32\1\4\1\uffff\1\31\1\uffff\1\32";
    static final String dfa_4s = "\1\35\1\uffff\1\6\1\17\1\36\3\4\1\6\1\40\1\22\2\33\3\40\1\33\1\4\1\33\1\4\1\uffff\1\31\1\uffff\1\32";
    static final String dfa_5s = "\1\uffff\1\2\22\uffff\1\1\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\30\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\5\uffff\1\2\11\uffff\1\1\6\uffff\1\1",
            "",
            "\1\4\1\uffff\1\3",
            "\1\5\1\6\1\7",
            "\1\10",
            "\1\11",
            "\1\11",
            "\1\11",
            "\1\12",
            "\1\13\1\14",
            "\1\15\1\16\1\17",
            "\1\20\26\uffff\1\21",
            "\1\22\26\uffff\1\23",
            "\1\13\1\14",
            "\1\13\1\14",
            "\1\13\1\14",
            "\1\24\1\uffff\1\21",
            "\1\25",
            "\1\26\1\23",
            "\1\27",
            "",
            "\1\24",
            "",
            "\1\26"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1097:3: ( rule__LoopCommand__CommandsAssignment_3 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000042L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000401002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});

}