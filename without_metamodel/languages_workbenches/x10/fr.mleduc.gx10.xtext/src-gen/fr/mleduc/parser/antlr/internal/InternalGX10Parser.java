package fr.mleduc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.mleduc.services.GX10GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGX10Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main'", "'{'", "'}'", "'MethodCall'", "'methodToCall'", "'If'", "'controlStructureCondition'", "'thenBlock'", "'elseBlock'", "'While'", "'whileBlock'", "'True'", "'False'", "'Not'", "'notExpression'", "'And'", "'leftAndExpression'", "'rightAndExpression'", "'ic'", "'Plus'", "'leftPlus'", "'rightPlus'", "'Async'", "'asyncBlock'", "'Finish'", "'finishStatement'", "'print'", "'('", "')'", "'BoolVar'", "'boolVarExpr'", "'iv'", "'<-'", "'ir'", "'BoolVarAccess'", "'boolVarRef'", "'Equal'", "'leftEqual'", "'rightEqual'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGX10Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGX10Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGX10Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalGX10.g"; }



     	private GX10GrammarAccess grammarAccess;

        public InternalGX10Parser(TokenStream input, GX10GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected GX10GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalGX10.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalGX10.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalGX10.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalGX10.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'main' ( ( ruleEString ) ) ( (lv_methods_2_0= ruleMethod ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_methods_2_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:77:2: ( (otherlv_0= 'main' ( ( ruleEString ) ) ( (lv_methods_2_0= ruleMethod ) )* ) )
            // InternalGX10.g:78:2: (otherlv_0= 'main' ( ( ruleEString ) ) ( (lv_methods_2_0= ruleMethod ) )* )
            {
            // InternalGX10.g:78:2: (otherlv_0= 'main' ( ( ruleEString ) ) ( (lv_methods_2_0= ruleMethod ) )* )
            // InternalGX10.g:79:3: otherlv_0= 'main' ( ( ruleEString ) ) ( (lv_methods_2_0= ruleMethod ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getMainKeyword_0());
            		
            // InternalGX10.g:83:3: ( ( ruleEString ) )
            // InternalGX10.g:84:4: ( ruleEString )
            {
            // InternalGX10.g:84:4: ( ruleEString )
            // InternalGX10.g:85:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            				

            					newCompositeNode(grammarAccess.getProgramAccess().getStartMethodMethodCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGX10.g:99:3: ( (lv_methods_2_0= ruleMethod ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGX10.g:100:4: (lv_methods_2_0= ruleMethod )
            	    {
            	    // InternalGX10.g:100:4: (lv_methods_2_0= ruleMethod )
            	    // InternalGX10.g:101:5: lv_methods_2_0= ruleMethod
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getMethodsMethodParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_methods_2_0=ruleMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_2_0,
            	    						"fr.mleduc.GX10.Method");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalGX10.g:122:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalGX10.g:122:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalGX10.g:123:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalGX10.g:129:1: ruleStatement returns [EObject current=null] : (this_Block_0= ruleBlock | this_If_1= ruleIf | this_While_2= ruleWhile | this_True_3= ruleTrue | this_False_4= ruleFalse | this_Not_5= ruleNot | this_And_6= ruleAnd | this_IntConst_7= ruleIntConst | this_Plus_8= rulePlus | this_Async_9= ruleAsync | this_MethodCall_10= ruleMethodCall | this_Finish_11= ruleFinish | this_Print_12= rulePrint | this_BoolVar_13= ruleBoolVar | this_IntVar_14= ruleIntVar | this_IntVarAccess_15= ruleIntVarAccess | this_BoolVarAccess_16= ruleBoolVarAccess | this_Equal_17= ruleEqual ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_If_1 = null;

        EObject this_While_2 = null;

        EObject this_True_3 = null;

        EObject this_False_4 = null;

        EObject this_Not_5 = null;

        EObject this_And_6 = null;

        EObject this_IntConst_7 = null;

        EObject this_Plus_8 = null;

        EObject this_Async_9 = null;

        EObject this_MethodCall_10 = null;

        EObject this_Finish_11 = null;

        EObject this_Print_12 = null;

        EObject this_BoolVar_13 = null;

        EObject this_IntVar_14 = null;

        EObject this_IntVarAccess_15 = null;

        EObject this_BoolVarAccess_16 = null;

        EObject this_Equal_17 = null;



        	enterRule();

        try {
            // InternalGX10.g:135:2: ( (this_Block_0= ruleBlock | this_If_1= ruleIf | this_While_2= ruleWhile | this_True_3= ruleTrue | this_False_4= ruleFalse | this_Not_5= ruleNot | this_And_6= ruleAnd | this_IntConst_7= ruleIntConst | this_Plus_8= rulePlus | this_Async_9= ruleAsync | this_MethodCall_10= ruleMethodCall | this_Finish_11= ruleFinish | this_Print_12= rulePrint | this_BoolVar_13= ruleBoolVar | this_IntVar_14= ruleIntVar | this_IntVarAccess_15= ruleIntVarAccess | this_BoolVarAccess_16= ruleBoolVarAccess | this_Equal_17= ruleEqual ) )
            // InternalGX10.g:136:2: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_While_2= ruleWhile | this_True_3= ruleTrue | this_False_4= ruleFalse | this_Not_5= ruleNot | this_And_6= ruleAnd | this_IntConst_7= ruleIntConst | this_Plus_8= rulePlus | this_Async_9= ruleAsync | this_MethodCall_10= ruleMethodCall | this_Finish_11= ruleFinish | this_Print_12= rulePrint | this_BoolVar_13= ruleBoolVar | this_IntVar_14= ruleIntVar | this_IntVarAccess_15= ruleIntVarAccess | this_BoolVarAccess_16= ruleBoolVarAccess | this_Equal_17= ruleEqual )
            {
            // InternalGX10.g:136:2: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_While_2= ruleWhile | this_True_3= ruleTrue | this_False_4= ruleFalse | this_Not_5= ruleNot | this_And_6= ruleAnd | this_IntConst_7= ruleIntConst | this_Plus_8= rulePlus | this_Async_9= ruleAsync | this_MethodCall_10= ruleMethodCall | this_Finish_11= ruleFinish | this_Print_12= rulePrint | this_BoolVar_13= ruleBoolVar | this_IntVar_14= ruleIntVar | this_IntVarAccess_15= ruleIntVarAccess | this_BoolVarAccess_16= ruleBoolVarAccess | this_Equal_17= ruleEqual )
            int alt2=18;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            case 24:
                {
                alt2=6;
                }
                break;
            case 26:
                {
                alt2=7;
                }
                break;
            case 29:
                {
                alt2=8;
                }
                break;
            case 30:
                {
                alt2=9;
                }
                break;
            case 33:
                {
                alt2=10;
                }
                break;
            case 14:
                {
                alt2=11;
                }
                break;
            case 35:
                {
                alt2=12;
                }
                break;
            case 37:
                {
                alt2=13;
                }
                break;
            case 40:
                {
                alt2=14;
                }
                break;
            case 42:
                {
                alt2=15;
                }
                break;
            case 44:
                {
                alt2=16;
                }
                break;
            case 45:
                {
                alt2=17;
                }
                break;
            case 47:
                {
                alt2=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGX10.g:137:3: this_Block_0= ruleBlock
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Block_0=ruleBlock();

                    state._fsp--;


                    			current = this_Block_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGX10.g:146:3: this_If_1= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_1=ruleIf();

                    state._fsp--;


                    			current = this_If_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGX10.g:155:3: this_While_2= ruleWhile
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_While_2=ruleWhile();

                    state._fsp--;


                    			current = this_While_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGX10.g:164:3: this_True_3= ruleTrue
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTrueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_True_3=ruleTrue();

                    state._fsp--;


                    			current = this_True_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGX10.g:173:3: this_False_4= ruleFalse
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFalseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_False_4=ruleFalse();

                    state._fsp--;


                    			current = this_False_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGX10.g:182:3: this_Not_5= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNotParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_5=ruleNot();

                    state._fsp--;


                    			current = this_Not_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGX10.g:191:3: this_And_6= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAndParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_6=ruleAnd();

                    state._fsp--;


                    			current = this_And_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGX10.g:200:3: this_IntConst_7= ruleIntConst
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIntConstParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntConst_7=ruleIntConst();

                    state._fsp--;


                    			current = this_IntConst_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalGX10.g:209:3: this_Plus_8= rulePlus
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPlusParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Plus_8=rulePlus();

                    state._fsp--;


                    			current = this_Plus_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalGX10.g:218:3: this_Async_9= ruleAsync
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAsyncParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Async_9=ruleAsync();

                    state._fsp--;


                    			current = this_Async_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalGX10.g:227:3: this_MethodCall_10= ruleMethodCall
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMethodCallParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodCall_10=ruleMethodCall();

                    state._fsp--;


                    			current = this_MethodCall_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalGX10.g:236:3: this_Finish_11= ruleFinish
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFinishParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Finish_11=ruleFinish();

                    state._fsp--;


                    			current = this_Finish_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalGX10.g:245:3: this_Print_12= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_12=rulePrint();

                    state._fsp--;


                    			current = this_Print_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalGX10.g:254:3: this_BoolVar_13= ruleBoolVar
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBoolVarParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolVar_13=ruleBoolVar();

                    state._fsp--;


                    			current = this_BoolVar_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalGX10.g:263:3: this_IntVar_14= ruleIntVar
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIntVarParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVar_14=ruleIntVar();

                    state._fsp--;


                    			current = this_IntVar_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalGX10.g:272:3: this_IntVarAccess_15= ruleIntVarAccess
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIntVarAccessParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVarAccess_15=ruleIntVarAccess();

                    state._fsp--;


                    			current = this_IntVarAccess_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalGX10.g:281:3: this_BoolVarAccess_16= ruleBoolVarAccess
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBoolVarAccessParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolVarAccess_16=ruleBoolVarAccess();

                    state._fsp--;


                    			current = this_BoolVarAccess_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalGX10.g:290:3: this_Equal_17= ruleEqual
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getEqualParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equal_17=ruleEqual();

                    state._fsp--;


                    			current = this_Equal_17;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalGX10.g:302:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalGX10.g:302:55: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalGX10.g:303:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;

             current =iv_ruleBoolExpression; 
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
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalGX10.g:309:1: ruleBoolExpression returns [EObject current=null] : (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_BoolVarAccess_4= ruleBoolVarAccess | this_Equal_5= ruleEqual ) ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_True_0 = null;

        EObject this_False_1 = null;

        EObject this_Not_2 = null;

        EObject this_And_3 = null;

        EObject this_BoolVarAccess_4 = null;

        EObject this_Equal_5 = null;



        	enterRule();

        try {
            // InternalGX10.g:315:2: ( (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_BoolVarAccess_4= ruleBoolVarAccess | this_Equal_5= ruleEqual ) )
            // InternalGX10.g:316:2: (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_BoolVarAccess_4= ruleBoolVarAccess | this_Equal_5= ruleEqual )
            {
            // InternalGX10.g:316:2: (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_BoolVarAccess_4= ruleBoolVarAccess | this_Equal_5= ruleEqual )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            case 45:
                {
                alt3=5;
                }
                break;
            case 47:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGX10.g:317:3: this_True_0= ruleTrue
                    {

                    			newCompositeNode(grammarAccess.getBoolExpressionAccess().getTrueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_True_0=ruleTrue();

                    state._fsp--;


                    			current = this_True_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGX10.g:326:3: this_False_1= ruleFalse
                    {

                    			newCompositeNode(grammarAccess.getBoolExpressionAccess().getFalseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_False_1=ruleFalse();

                    state._fsp--;


                    			current = this_False_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGX10.g:335:3: this_Not_2= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getBoolExpressionAccess().getNotParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_2=ruleNot();

                    state._fsp--;


                    			current = this_Not_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGX10.g:344:3: this_And_3= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getBoolExpressionAccess().getAndParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_3=ruleAnd();

                    state._fsp--;


                    			current = this_And_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGX10.g:353:3: this_BoolVarAccess_4= ruleBoolVarAccess
                    {

                    			newCompositeNode(grammarAccess.getBoolExpressionAccess().getBoolVarAccessParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolVarAccess_4=ruleBoolVarAccess();

                    state._fsp--;


                    			current = this_BoolVarAccess_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGX10.g:362:3: this_Equal_5= ruleEqual
                    {

                    			newCompositeNode(grammarAccess.getBoolExpressionAccess().getEqualParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equal_5=ruleEqual();

                    state._fsp--;


                    			current = this_Equal_5;
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
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleIntExpression"
    // InternalGX10.g:374:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalGX10.g:374:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalGX10.g:375:2: iv_ruleIntExpression= ruleIntExpression EOF
            {
             newCompositeNode(grammarAccess.getIntExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntExpression=ruleIntExpression();

            state._fsp--;

             current =iv_ruleIntExpression; 
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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalGX10.g:381:1: ruleIntExpression returns [EObject current=null] : (this_IntConst_0= ruleIntConst | this_Plus_1= rulePlus | this_IntVarAccess_2= ruleIntVarAccess ) ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntConst_0 = null;

        EObject this_Plus_1 = null;

        EObject this_IntVarAccess_2 = null;



        	enterRule();

        try {
            // InternalGX10.g:387:2: ( (this_IntConst_0= ruleIntConst | this_Plus_1= rulePlus | this_IntVarAccess_2= ruleIntVarAccess ) )
            // InternalGX10.g:388:2: (this_IntConst_0= ruleIntConst | this_Plus_1= rulePlus | this_IntVarAccess_2= ruleIntVarAccess )
            {
            // InternalGX10.g:388:2: (this_IntConst_0= ruleIntConst | this_Plus_1= rulePlus | this_IntVarAccess_2= ruleIntVarAccess )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 30:
                {
                alt4=2;
                }
                break;
            case 44:
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
                    // InternalGX10.g:389:3: this_IntConst_0= ruleIntConst
                    {

                    			newCompositeNode(grammarAccess.getIntExpressionAccess().getIntConstParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntConst_0=ruleIntConst();

                    state._fsp--;


                    			current = this_IntConst_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGX10.g:398:3: this_Plus_1= rulePlus
                    {

                    			newCompositeNode(grammarAccess.getIntExpressionAccess().getPlusParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Plus_1=rulePlus();

                    state._fsp--;


                    			current = this_Plus_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGX10.g:407:3: this_IntVarAccess_2= ruleIntVarAccess
                    {

                    			newCompositeNode(grammarAccess.getIntExpressionAccess().getIntVarAccessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVarAccess_2=ruleIntVarAccess();

                    state._fsp--;


                    			current = this_IntVarAccess_2;
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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalGX10.g:419:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGX10.g:419:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGX10.g:420:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalGX10.g:426:1: ruleExpression returns [EObject current=null] : (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_IntConst_4= ruleIntConst | this_Plus_5= rulePlus | this_MethodCall_6= ruleMethodCall | this_BoolVar_7= ruleBoolVar | this_IntVarAccess_8= ruleIntVarAccess | this_BoolVarAccess_9= ruleBoolVarAccess | this_Equal_10= ruleEqual ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_True_0 = null;

        EObject this_False_1 = null;

        EObject this_Not_2 = null;

        EObject this_And_3 = null;

        EObject this_IntConst_4 = null;

        EObject this_Plus_5 = null;

        EObject this_MethodCall_6 = null;

        EObject this_BoolVar_7 = null;

        EObject this_IntVarAccess_8 = null;

        EObject this_BoolVarAccess_9 = null;

        EObject this_Equal_10 = null;



        	enterRule();

        try {
            // InternalGX10.g:432:2: ( (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_IntConst_4= ruleIntConst | this_Plus_5= rulePlus | this_MethodCall_6= ruleMethodCall | this_BoolVar_7= ruleBoolVar | this_IntVarAccess_8= ruleIntVarAccess | this_BoolVarAccess_9= ruleBoolVarAccess | this_Equal_10= ruleEqual ) )
            // InternalGX10.g:433:2: (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_IntConst_4= ruleIntConst | this_Plus_5= rulePlus | this_MethodCall_6= ruleMethodCall | this_BoolVar_7= ruleBoolVar | this_IntVarAccess_8= ruleIntVarAccess | this_BoolVarAccess_9= ruleBoolVarAccess | this_Equal_10= ruleEqual )
            {
            // InternalGX10.g:433:2: (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_IntConst_4= ruleIntConst | this_Plus_5= rulePlus | this_MethodCall_6= ruleMethodCall | this_BoolVar_7= ruleBoolVar | this_IntVarAccess_8= ruleIntVarAccess | this_BoolVarAccess_9= ruleBoolVarAccess | this_Equal_10= ruleEqual )
            int alt5=11;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            case 30:
                {
                alt5=6;
                }
                break;
            case 14:
                {
                alt5=7;
                }
                break;
            case 40:
                {
                alt5=8;
                }
                break;
            case 44:
                {
                alt5=9;
                }
                break;
            case 45:
                {
                alt5=10;
                }
                break;
            case 47:
                {
                alt5=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGX10.g:434:3: this_True_0= ruleTrue
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getTrueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_True_0=ruleTrue();

                    state._fsp--;


                    			current = this_True_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGX10.g:443:3: this_False_1= ruleFalse
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getFalseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_False_1=ruleFalse();

                    state._fsp--;


                    			current = this_False_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGX10.g:452:3: this_Not_2= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNotParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_2=ruleNot();

                    state._fsp--;


                    			current = this_Not_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGX10.g:461:3: this_And_3= ruleAnd
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getAndParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_And_3=ruleAnd();

                    state._fsp--;


                    			current = this_And_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGX10.g:470:3: this_IntConst_4= ruleIntConst
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIntConstParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntConst_4=ruleIntConst();

                    state._fsp--;


                    			current = this_IntConst_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGX10.g:479:3: this_Plus_5= rulePlus
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPlusParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Plus_5=rulePlus();

                    state._fsp--;


                    			current = this_Plus_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGX10.g:488:3: this_MethodCall_6= ruleMethodCall
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getMethodCallParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodCall_6=ruleMethodCall();

                    state._fsp--;


                    			current = this_MethodCall_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGX10.g:497:3: this_BoolVar_7= ruleBoolVar
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBoolVarParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolVar_7=ruleBoolVar();

                    state._fsp--;


                    			current = this_BoolVar_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalGX10.g:506:3: this_IntVarAccess_8= ruleIntVarAccess
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIntVarAccessParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVarAccess_8=ruleIntVarAccess();

                    state._fsp--;


                    			current = this_IntVarAccess_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalGX10.g:515:3: this_BoolVarAccess_9= ruleBoolVarAccess
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBoolVarAccessParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_BoolVarAccess_9=ruleBoolVarAccess();

                    state._fsp--;


                    			current = this_BoolVarAccess_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalGX10.g:524:3: this_Equal_10= ruleEqual
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getEqualParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equal_10=ruleEqual();

                    state._fsp--;


                    			current = this_Equal_10;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMethod"
    // InternalGX10.g:536:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalGX10.g:536:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalGX10.g:537:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalGX10.g:543:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_methodBlock_1_0= ruleBlock ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_methodBlock_1_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:549:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_methodBlock_1_0= ruleBlock ) ) ) )
            // InternalGX10.g:550:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_methodBlock_1_0= ruleBlock ) ) )
            {
            // InternalGX10.g:550:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_methodBlock_1_0= ruleBlock ) ) )
            // InternalGX10.g:551:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_methodBlock_1_0= ruleBlock ) )
            {
            // InternalGX10.g:551:3: ( (lv_name_0_0= ruleEString ) )
            // InternalGX10.g:552:4: (lv_name_0_0= ruleEString )
            {
            // InternalGX10.g:552:4: (lv_name_0_0= ruleEString )
            // InternalGX10.g:553:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.mleduc.GX10.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGX10.g:570:3: ( (lv_methodBlock_1_0= ruleBlock ) )
            // InternalGX10.g:571:4: (lv_methodBlock_1_0= ruleBlock )
            {
            // InternalGX10.g:571:4: (lv_methodBlock_1_0= ruleBlock )
            // InternalGX10.g:572:5: lv_methodBlock_1_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getMethodBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_methodBlock_1_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"methodBlock",
            						lv_methodBlock_1_0,
            						"fr.mleduc.GX10.Block");
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleBlock"
    // InternalGX10.g:593:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalGX10.g:593:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalGX10.g:594:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalGX10.g:600:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_blockStatements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_blockStatements_2_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:606:2: ( ( () otherlv_1= '{' ( (lv_blockStatements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalGX10.g:607:2: ( () otherlv_1= '{' ( (lv_blockStatements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalGX10.g:607:2: ( () otherlv_1= '{' ( (lv_blockStatements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalGX10.g:608:3: () otherlv_1= '{' ( (lv_blockStatements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalGX10.g:608:3: ()
            // InternalGX10.g:609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGX10.g:619:3: ( (lv_blockStatements_2_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12||LA6_0==14||LA6_0==16||LA6_0==20||(LA6_0>=22 && LA6_0<=24)||LA6_0==26||(LA6_0>=29 && LA6_0<=30)||LA6_0==33||LA6_0==35||LA6_0==37||LA6_0==40||LA6_0==42||(LA6_0>=44 && LA6_0<=45)||LA6_0==47) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGX10.g:620:4: (lv_blockStatements_2_0= ruleStatement )
            	    {
            	    // InternalGX10.g:620:4: (lv_blockStatements_2_0= ruleStatement )
            	    // InternalGX10.g:621:5: lv_blockStatements_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getBlockStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_blockStatements_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"blockStatements",
            	    						lv_blockStatements_2_0,
            	    						"fr.mleduc.GX10.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleEString"
    // InternalGX10.g:646:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGX10.g:646:47: (iv_ruleEString= ruleEString EOF )
            // InternalGX10.g:647:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGX10.g:653:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGX10.g:659:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGX10.g:660:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGX10.g:660:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGX10.g:661:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGX10.g:669:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMethodCall"
    // InternalGX10.g:680:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // InternalGX10.g:680:51: (iv_ruleMethodCall= ruleMethodCall EOF )
            // InternalGX10.g:681:2: iv_ruleMethodCall= ruleMethodCall EOF
            {
             newCompositeNode(grammarAccess.getMethodCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodCall=ruleMethodCall();

            state._fsp--;

             current =iv_ruleMethodCall; 
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
    // $ANTLR end "entryRuleMethodCall"


    // $ANTLR start "ruleMethodCall"
    // InternalGX10.g:687:1: ruleMethodCall returns [EObject current=null] : (otherlv_0= 'MethodCall' otherlv_1= '{' otherlv_2= 'methodToCall' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGX10.g:693:2: ( (otherlv_0= 'MethodCall' otherlv_1= '{' otherlv_2= 'methodToCall' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalGX10.g:694:2: (otherlv_0= 'MethodCall' otherlv_1= '{' otherlv_2= 'methodToCall' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:694:2: (otherlv_0= 'MethodCall' otherlv_1= '{' otherlv_2= 'methodToCall' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalGX10.g:695:3: otherlv_0= 'MethodCall' otherlv_1= '{' otherlv_2= 'methodToCall' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodCallAccess().getMethodCallKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodCallAccess().getMethodToCallKeyword_2());
            		
            // InternalGX10.g:707:3: ( ( ruleEString ) )
            // InternalGX10.g:708:4: ( ruleEString )
            {
            // InternalGX10.g:708:4: ( ruleEString )
            // InternalGX10.g:709:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMethodCallAccess().getMethodToCallMethodCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodCallAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMethodCall"


    // $ANTLR start "entryRuleIf"
    // InternalGX10.g:731:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalGX10.g:731:43: (iv_ruleIf= ruleIf EOF )
            // InternalGX10.g:732:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalGX10.g:738:1: ruleIf returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'thenBlock' ( (lv_thenBlock_5_0= ruleBlock ) ) otherlv_6= 'elseBlock' ( (lv_elseBlock_7_0= ruleBlock ) ) otherlv_8= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_controlStructureCondition_3_0 = null;

        EObject lv_thenBlock_5_0 = null;

        EObject lv_elseBlock_7_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:744:2: ( (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'thenBlock' ( (lv_thenBlock_5_0= ruleBlock ) ) otherlv_6= 'elseBlock' ( (lv_elseBlock_7_0= ruleBlock ) ) otherlv_8= '}' ) )
            // InternalGX10.g:745:2: (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'thenBlock' ( (lv_thenBlock_5_0= ruleBlock ) ) otherlv_6= 'elseBlock' ( (lv_elseBlock_7_0= ruleBlock ) ) otherlv_8= '}' )
            {
            // InternalGX10.g:745:2: (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'thenBlock' ( (lv_thenBlock_5_0= ruleBlock ) ) otherlv_6= 'elseBlock' ( (lv_elseBlock_7_0= ruleBlock ) ) otherlv_8= '}' )
            // InternalGX10.g:746:3: otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'thenBlock' ( (lv_thenBlock_5_0= ruleBlock ) ) otherlv_6= 'elseBlock' ( (lv_elseBlock_7_0= ruleBlock ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getControlStructureConditionKeyword_2());
            		
            // InternalGX10.g:758:3: ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) )
            // InternalGX10.g:759:4: (lv_controlStructureCondition_3_0= ruleBoolExpression )
            {
            // InternalGX10.g:759:4: (lv_controlStructureCondition_3_0= ruleBoolExpression )
            // InternalGX10.g:760:5: lv_controlStructureCondition_3_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getControlStructureConditionBoolExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_controlStructureCondition_3_0=ruleBoolExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"controlStructureCondition",
            						lv_controlStructureCondition_3_0,
            						"fr.mleduc.GX10.BoolExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getThenBlockKeyword_4());
            		
            // InternalGX10.g:781:3: ( (lv_thenBlock_5_0= ruleBlock ) )
            // InternalGX10.g:782:4: (lv_thenBlock_5_0= ruleBlock )
            {
            // InternalGX10.g:782:4: (lv_thenBlock_5_0= ruleBlock )
            // InternalGX10.g:783:5: lv_thenBlock_5_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfAccess().getThenBlockBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_thenBlock_5_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"thenBlock",
            						lv_thenBlock_5_0,
            						"fr.mleduc.GX10.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getElseBlockKeyword_6());
            		
            // InternalGX10.g:804:3: ( (lv_elseBlock_7_0= ruleBlock ) )
            // InternalGX10.g:805:4: (lv_elseBlock_7_0= ruleBlock )
            {
            // InternalGX10.g:805:4: (lv_elseBlock_7_0= ruleBlock )
            // InternalGX10.g:806:5: lv_elseBlock_7_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfAccess().getElseBlockBlockParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_elseBlock_7_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"elseBlock",
            						lv_elseBlock_7_0,
            						"fr.mleduc.GX10.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // InternalGX10.g:831:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalGX10.g:831:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalGX10.g:832:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalGX10.g:838:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'While' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'whileBlock' ( (lv_whileBlock_5_0= ruleBlock ) ) otherlv_6= '}' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_controlStructureCondition_3_0 = null;

        EObject lv_whileBlock_5_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:844:2: ( (otherlv_0= 'While' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'whileBlock' ( (lv_whileBlock_5_0= ruleBlock ) ) otherlv_6= '}' ) )
            // InternalGX10.g:845:2: (otherlv_0= 'While' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'whileBlock' ( (lv_whileBlock_5_0= ruleBlock ) ) otherlv_6= '}' )
            {
            // InternalGX10.g:845:2: (otherlv_0= 'While' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'whileBlock' ( (lv_whileBlock_5_0= ruleBlock ) ) otherlv_6= '}' )
            // InternalGX10.g:846:3: otherlv_0= 'While' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'whileBlock' ( (lv_whileBlock_5_0= ruleBlock ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getControlStructureConditionKeyword_2());
            		
            // InternalGX10.g:858:3: ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) )
            // InternalGX10.g:859:4: (lv_controlStructureCondition_3_0= ruleBoolExpression )
            {
            // InternalGX10.g:859:4: (lv_controlStructureCondition_3_0= ruleBoolExpression )
            // InternalGX10.g:860:5: lv_controlStructureCondition_3_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getControlStructureConditionBoolExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_controlStructureCondition_3_0=ruleBoolExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"controlStructureCondition",
            						lv_controlStructureCondition_3_0,
            						"fr.mleduc.GX10.BoolExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getWhileBlockKeyword_4());
            		
            // InternalGX10.g:881:3: ( (lv_whileBlock_5_0= ruleBlock ) )
            // InternalGX10.g:882:4: (lv_whileBlock_5_0= ruleBlock )
            {
            // InternalGX10.g:882:4: (lv_whileBlock_5_0= ruleBlock )
            // InternalGX10.g:883:5: lv_whileBlock_5_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getWhileBlockBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_whileBlock_5_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"whileBlock",
            						lv_whileBlock_5_0,
            						"fr.mleduc.GX10.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleTrue"
    // InternalGX10.g:908:1: entryRuleTrue returns [EObject current=null] : iv_ruleTrue= ruleTrue EOF ;
    public final EObject entryRuleTrue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrue = null;


        try {
            // InternalGX10.g:908:45: (iv_ruleTrue= ruleTrue EOF )
            // InternalGX10.g:909:2: iv_ruleTrue= ruleTrue EOF
            {
             newCompositeNode(grammarAccess.getTrueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrue=ruleTrue();

            state._fsp--;

             current =iv_ruleTrue; 
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
    // $ANTLR end "entryRuleTrue"


    // $ANTLR start "ruleTrue"
    // InternalGX10.g:915:1: ruleTrue returns [EObject current=null] : ( () otherlv_1= 'True' ) ;
    public final EObject ruleTrue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGX10.g:921:2: ( ( () otherlv_1= 'True' ) )
            // InternalGX10.g:922:2: ( () otherlv_1= 'True' )
            {
            // InternalGX10.g:922:2: ( () otherlv_1= 'True' )
            // InternalGX10.g:923:3: () otherlv_1= 'True'
            {
            // InternalGX10.g:923:3: ()
            // InternalGX10.g:924:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueAccess().getTrueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTrueAccess().getTrueKeyword_1());
            		

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
    // $ANTLR end "ruleTrue"


    // $ANTLR start "entryRuleFalse"
    // InternalGX10.g:938:1: entryRuleFalse returns [EObject current=null] : iv_ruleFalse= ruleFalse EOF ;
    public final EObject entryRuleFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalse = null;


        try {
            // InternalGX10.g:938:46: (iv_ruleFalse= ruleFalse EOF )
            // InternalGX10.g:939:2: iv_ruleFalse= ruleFalse EOF
            {
             newCompositeNode(grammarAccess.getFalseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFalse=ruleFalse();

            state._fsp--;

             current =iv_ruleFalse; 
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
    // $ANTLR end "entryRuleFalse"


    // $ANTLR start "ruleFalse"
    // InternalGX10.g:945:1: ruleFalse returns [EObject current=null] : ( () otherlv_1= 'False' ) ;
    public final EObject ruleFalse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGX10.g:951:2: ( ( () otherlv_1= 'False' ) )
            // InternalGX10.g:952:2: ( () otherlv_1= 'False' )
            {
            // InternalGX10.g:952:2: ( () otherlv_1= 'False' )
            // InternalGX10.g:953:3: () otherlv_1= 'False'
            {
            // InternalGX10.g:953:3: ()
            // InternalGX10.g:954:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFalseAccess().getFalseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFalseAccess().getFalseKeyword_1());
            		

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
    // $ANTLR end "ruleFalse"


    // $ANTLR start "entryRuleNot"
    // InternalGX10.g:968:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalGX10.g:968:44: (iv_ruleNot= ruleNot EOF )
            // InternalGX10.g:969:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalGX10.g:975:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'notExpression' ( (lv_notExpression_3_0= ruleBoolExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_notExpression_3_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:981:2: ( (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'notExpression' ( (lv_notExpression_3_0= ruleBoolExpression ) ) otherlv_4= '}' ) )
            // InternalGX10.g:982:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'notExpression' ( (lv_notExpression_3_0= ruleBoolExpression ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:982:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'notExpression' ( (lv_notExpression_3_0= ruleBoolExpression ) ) otherlv_4= '}' )
            // InternalGX10.g:983:3: otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'notExpression' ( (lv_notExpression_3_0= ruleBoolExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNotAccess().getNotExpressionKeyword_2());
            		
            // InternalGX10.g:995:3: ( (lv_notExpression_3_0= ruleBoolExpression ) )
            // InternalGX10.g:996:4: (lv_notExpression_3_0= ruleBoolExpression )
            {
            // InternalGX10.g:996:4: (lv_notExpression_3_0= ruleBoolExpression )
            // InternalGX10.g:997:5: lv_notExpression_3_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getNotAccess().getNotExpressionBoolExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_notExpression_3_0=ruleBoolExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"notExpression",
            						lv_notExpression_3_0,
            						"fr.mleduc.GX10.BoolExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNotAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleAnd"
    // InternalGX10.g:1022:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalGX10.g:1022:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalGX10.g:1023:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalGX10.g:1029:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'leftAndExpression' ( (lv_leftAndExpression_3_0= ruleBoolExpression ) ) otherlv_4= 'rightAndExpression' ( (lv_rightAndExpression_5_0= ruleBoolExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_leftAndExpression_3_0 = null;

        EObject lv_rightAndExpression_5_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1035:2: ( (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'leftAndExpression' ( (lv_leftAndExpression_3_0= ruleBoolExpression ) ) otherlv_4= 'rightAndExpression' ( (lv_rightAndExpression_5_0= ruleBoolExpression ) ) otherlv_6= '}' ) )
            // InternalGX10.g:1036:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'leftAndExpression' ( (lv_leftAndExpression_3_0= ruleBoolExpression ) ) otherlv_4= 'rightAndExpression' ( (lv_rightAndExpression_5_0= ruleBoolExpression ) ) otherlv_6= '}' )
            {
            // InternalGX10.g:1036:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'leftAndExpression' ( (lv_leftAndExpression_3_0= ruleBoolExpression ) ) otherlv_4= 'rightAndExpression' ( (lv_rightAndExpression_5_0= ruleBoolExpression ) ) otherlv_6= '}' )
            // InternalGX10.g:1037:3: otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'leftAndExpression' ( (lv_leftAndExpression_3_0= ruleBoolExpression ) ) otherlv_4= 'rightAndExpression' ( (lv_rightAndExpression_5_0= ruleBoolExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getLeftAndExpressionKeyword_2());
            		
            // InternalGX10.g:1049:3: ( (lv_leftAndExpression_3_0= ruleBoolExpression ) )
            // InternalGX10.g:1050:4: (lv_leftAndExpression_3_0= ruleBoolExpression )
            {
            // InternalGX10.g:1050:4: (lv_leftAndExpression_3_0= ruleBoolExpression )
            // InternalGX10.g:1051:5: lv_leftAndExpression_3_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getLeftAndExpressionBoolExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_leftAndExpression_3_0=ruleBoolExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"leftAndExpression",
            						lv_leftAndExpression_3_0,
            						"fr.mleduc.GX10.BoolExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getAndAccess().getRightAndExpressionKeyword_4());
            		
            // InternalGX10.g:1072:3: ( (lv_rightAndExpression_5_0= ruleBoolExpression ) )
            // InternalGX10.g:1073:4: (lv_rightAndExpression_5_0= ruleBoolExpression )
            {
            // InternalGX10.g:1073:4: (lv_rightAndExpression_5_0= ruleBoolExpression )
            // InternalGX10.g:1074:5: lv_rightAndExpression_5_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getRightAndExpressionBoolExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_rightAndExpression_5_0=ruleBoolExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					set(
            						current,
            						"rightAndExpression",
            						lv_rightAndExpression_5_0,
            						"fr.mleduc.GX10.BoolExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAndAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleIntConst"
    // InternalGX10.g:1099:1: entryRuleIntConst returns [EObject current=null] : iv_ruleIntConst= ruleIntConst EOF ;
    public final EObject entryRuleIntConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConst = null;


        try {
            // InternalGX10.g:1099:49: (iv_ruleIntConst= ruleIntConst EOF )
            // InternalGX10.g:1100:2: iv_ruleIntConst= ruleIntConst EOF
            {
             newCompositeNode(grammarAccess.getIntConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntConst=ruleIntConst();

            state._fsp--;

             current =iv_ruleIntConst; 
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
    // $ANTLR end "entryRuleIntConst"


    // $ANTLR start "ruleIntConst"
    // InternalGX10.g:1106:1: ruleIntConst returns [EObject current=null] : (otherlv_0= 'ic' ( (lv_value_1_0= ruleEInt ) ) ) ;
    public final EObject ruleIntConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1112:2: ( (otherlv_0= 'ic' ( (lv_value_1_0= ruleEInt ) ) ) )
            // InternalGX10.g:1113:2: (otherlv_0= 'ic' ( (lv_value_1_0= ruleEInt ) ) )
            {
            // InternalGX10.g:1113:2: (otherlv_0= 'ic' ( (lv_value_1_0= ruleEInt ) ) )
            // InternalGX10.g:1114:3: otherlv_0= 'ic' ( (lv_value_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getIntConstAccess().getIcKeyword_0());
            		
            // InternalGX10.g:1118:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalGX10.g:1119:4: (lv_value_1_0= ruleEInt )
            {
            // InternalGX10.g:1119:4: (lv_value_1_0= ruleEInt )
            // InternalGX10.g:1120:5: lv_value_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntConstAccess().getValueEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntConstRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"fr.mleduc.GX10.EInt");
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
    // $ANTLR end "ruleIntConst"


    // $ANTLR start "entryRulePlus"
    // InternalGX10.g:1141:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalGX10.g:1141:45: (iv_rulePlus= rulePlus EOF )
            // InternalGX10.g:1142:2: iv_rulePlus= rulePlus EOF
            {
             newCompositeNode(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlus=rulePlus();

            state._fsp--;

             current =iv_rulePlus; 
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
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalGX10.g:1148:1: rulePlus returns [EObject current=null] : (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'leftPlus' ( (lv_leftPlus_3_0= ruleIntExpression ) ) otherlv_4= 'rightPlus' ( (lv_rightPlus_5_0= ruleIntExpression ) ) otherlv_6= '}' ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_leftPlus_3_0 = null;

        EObject lv_rightPlus_5_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1154:2: ( (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'leftPlus' ( (lv_leftPlus_3_0= ruleIntExpression ) ) otherlv_4= 'rightPlus' ( (lv_rightPlus_5_0= ruleIntExpression ) ) otherlv_6= '}' ) )
            // InternalGX10.g:1155:2: (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'leftPlus' ( (lv_leftPlus_3_0= ruleIntExpression ) ) otherlv_4= 'rightPlus' ( (lv_rightPlus_5_0= ruleIntExpression ) ) otherlv_6= '}' )
            {
            // InternalGX10.g:1155:2: (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'leftPlus' ( (lv_leftPlus_3_0= ruleIntExpression ) ) otherlv_4= 'rightPlus' ( (lv_rightPlus_5_0= ruleIntExpression ) ) otherlv_6= '}' )
            // InternalGX10.g:1156:3: otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'leftPlus' ( (lv_leftPlus_3_0= ruleIntExpression ) ) otherlv_4= 'rightPlus' ( (lv_rightPlus_5_0= ruleIntExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPlusAccess().getPlusKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPlusAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getLeftPlusKeyword_2());
            		
            // InternalGX10.g:1168:3: ( (lv_leftPlus_3_0= ruleIntExpression ) )
            // InternalGX10.g:1169:4: (lv_leftPlus_3_0= ruleIntExpression )
            {
            // InternalGX10.g:1169:4: (lv_leftPlus_3_0= ruleIntExpression )
            // InternalGX10.g:1170:5: lv_leftPlus_3_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getPlusAccess().getLeftPlusIntExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_leftPlus_3_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlusRule());
            					}
            					set(
            						current,
            						"leftPlus",
            						lv_leftPlus_3_0,
            						"fr.mleduc.GX10.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getPlusAccess().getRightPlusKeyword_4());
            		
            // InternalGX10.g:1191:3: ( (lv_rightPlus_5_0= ruleIntExpression ) )
            // InternalGX10.g:1192:4: (lv_rightPlus_5_0= ruleIntExpression )
            {
            // InternalGX10.g:1192:4: (lv_rightPlus_5_0= ruleIntExpression )
            // InternalGX10.g:1193:5: lv_rightPlus_5_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getPlusAccess().getRightPlusIntExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_rightPlus_5_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlusRule());
            					}
            					set(
            						current,
            						"rightPlus",
            						lv_rightPlus_5_0,
            						"fr.mleduc.GX10.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPlusAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleAsync"
    // InternalGX10.g:1218:1: entryRuleAsync returns [EObject current=null] : iv_ruleAsync= ruleAsync EOF ;
    public final EObject entryRuleAsync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsync = null;


        try {
            // InternalGX10.g:1218:46: (iv_ruleAsync= ruleAsync EOF )
            // InternalGX10.g:1219:2: iv_ruleAsync= ruleAsync EOF
            {
             newCompositeNode(grammarAccess.getAsyncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsync=ruleAsync();

            state._fsp--;

             current =iv_ruleAsync; 
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
    // $ANTLR end "entryRuleAsync"


    // $ANTLR start "ruleAsync"
    // InternalGX10.g:1225:1: ruleAsync returns [EObject current=null] : (otherlv_0= 'Async' otherlv_1= '{' otherlv_2= 'asyncBlock' ( (lv_asyncBlock_3_0= ruleStatement ) ) otherlv_4= '}' ) ;
    public final EObject ruleAsync() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_asyncBlock_3_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1231:2: ( (otherlv_0= 'Async' otherlv_1= '{' otherlv_2= 'asyncBlock' ( (lv_asyncBlock_3_0= ruleStatement ) ) otherlv_4= '}' ) )
            // InternalGX10.g:1232:2: (otherlv_0= 'Async' otherlv_1= '{' otherlv_2= 'asyncBlock' ( (lv_asyncBlock_3_0= ruleStatement ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:1232:2: (otherlv_0= 'Async' otherlv_1= '{' otherlv_2= 'asyncBlock' ( (lv_asyncBlock_3_0= ruleStatement ) ) otherlv_4= '}' )
            // InternalGX10.g:1233:3: otherlv_0= 'Async' otherlv_1= '{' otherlv_2= 'asyncBlock' ( (lv_asyncBlock_3_0= ruleStatement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAsyncAccess().getAsyncKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAsyncAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAsyncAccess().getAsyncBlockKeyword_2());
            		
            // InternalGX10.g:1245:3: ( (lv_asyncBlock_3_0= ruleStatement ) )
            // InternalGX10.g:1246:4: (lv_asyncBlock_3_0= ruleStatement )
            {
            // InternalGX10.g:1246:4: (lv_asyncBlock_3_0= ruleStatement )
            // InternalGX10.g:1247:5: lv_asyncBlock_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getAsyncAccess().getAsyncBlockStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_asyncBlock_3_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsyncRule());
            					}
            					set(
            						current,
            						"asyncBlock",
            						lv_asyncBlock_3_0,
            						"fr.mleduc.GX10.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAsyncAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAsync"


    // $ANTLR start "entryRuleFinish"
    // InternalGX10.g:1272:1: entryRuleFinish returns [EObject current=null] : iv_ruleFinish= ruleFinish EOF ;
    public final EObject entryRuleFinish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinish = null;


        try {
            // InternalGX10.g:1272:47: (iv_ruleFinish= ruleFinish EOF )
            // InternalGX10.g:1273:2: iv_ruleFinish= ruleFinish EOF
            {
             newCompositeNode(grammarAccess.getFinishRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinish=ruleFinish();

            state._fsp--;

             current =iv_ruleFinish; 
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
    // $ANTLR end "entryRuleFinish"


    // $ANTLR start "ruleFinish"
    // InternalGX10.g:1279:1: ruleFinish returns [EObject current=null] : (otherlv_0= 'Finish' otherlv_1= '{' otherlv_2= 'finishStatement' ( (lv_finishStatement_3_0= ruleStatement ) ) otherlv_4= '}' ) ;
    public final EObject ruleFinish() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_finishStatement_3_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1285:2: ( (otherlv_0= 'Finish' otherlv_1= '{' otherlv_2= 'finishStatement' ( (lv_finishStatement_3_0= ruleStatement ) ) otherlv_4= '}' ) )
            // InternalGX10.g:1286:2: (otherlv_0= 'Finish' otherlv_1= '{' otherlv_2= 'finishStatement' ( (lv_finishStatement_3_0= ruleStatement ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:1286:2: (otherlv_0= 'Finish' otherlv_1= '{' otherlv_2= 'finishStatement' ( (lv_finishStatement_3_0= ruleStatement ) ) otherlv_4= '}' )
            // InternalGX10.g:1287:3: otherlv_0= 'Finish' otherlv_1= '{' otherlv_2= 'finishStatement' ( (lv_finishStatement_3_0= ruleStatement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFinishAccess().getFinishKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getFinishAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFinishAccess().getFinishStatementKeyword_2());
            		
            // InternalGX10.g:1299:3: ( (lv_finishStatement_3_0= ruleStatement ) )
            // InternalGX10.g:1300:4: (lv_finishStatement_3_0= ruleStatement )
            {
            // InternalGX10.g:1300:4: (lv_finishStatement_3_0= ruleStatement )
            // InternalGX10.g:1301:5: lv_finishStatement_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getFinishAccess().getFinishStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_finishStatement_3_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinishRule());
            					}
            					set(
            						current,
            						"finishStatement",
            						lv_finishStatement_3_0,
            						"fr.mleduc.GX10.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFinishAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFinish"


    // $ANTLR start "entryRulePrint"
    // InternalGX10.g:1326:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalGX10.g:1326:46: (iv_rulePrint= rulePrint EOF )
            // InternalGX10.g:1327:2: iv_rulePrint= rulePrint EOF
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
    // InternalGX10.g:1333:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' otherlv_1= '(' ( (lv_toPrint_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_toPrint_2_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1339:2: ( (otherlv_0= 'print' otherlv_1= '(' ( (lv_toPrint_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalGX10.g:1340:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_toPrint_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalGX10.g:1340:2: (otherlv_0= 'print' otherlv_1= '(' ( (lv_toPrint_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalGX10.g:1341:3: otherlv_0= 'print' otherlv_1= '(' ( (lv_toPrint_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGX10.g:1349:3: ( (lv_toPrint_2_0= ruleExpression ) )
            // InternalGX10.g:1350:4: (lv_toPrint_2_0= ruleExpression )
            {
            // InternalGX10.g:1350:4: (lv_toPrint_2_0= ruleExpression )
            // InternalGX10.g:1351:5: lv_toPrint_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getToPrintExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_toPrint_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"toPrint",
            						lv_toPrint_2_0,
            						"fr.mleduc.GX10.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPrintAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleBoolVar"
    // InternalGX10.g:1376:1: entryRuleBoolVar returns [EObject current=null] : iv_ruleBoolVar= ruleBoolVar EOF ;
    public final EObject entryRuleBoolVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVar = null;


        try {
            // InternalGX10.g:1376:48: (iv_ruleBoolVar= ruleBoolVar EOF )
            // InternalGX10.g:1377:2: iv_ruleBoolVar= ruleBoolVar EOF
            {
             newCompositeNode(grammarAccess.getBoolVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolVar=ruleBoolVar();

            state._fsp--;

             current =iv_ruleBoolVar; 
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
    // $ANTLR end "entryRuleBoolVar"


    // $ANTLR start "ruleBoolVar"
    // InternalGX10.g:1383:1: ruleBoolVar returns [EObject current=null] : (otherlv_0= 'BoolVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'boolVarExpr' ( (lv_boolVarExpr_4_0= ruleBoolExpression ) ) otherlv_5= '}' ) ;
    public final EObject ruleBoolVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_boolVarExpr_4_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1389:2: ( (otherlv_0= 'BoolVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'boolVarExpr' ( (lv_boolVarExpr_4_0= ruleBoolExpression ) ) otherlv_5= '}' ) )
            // InternalGX10.g:1390:2: (otherlv_0= 'BoolVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'boolVarExpr' ( (lv_boolVarExpr_4_0= ruleBoolExpression ) ) otherlv_5= '}' )
            {
            // InternalGX10.g:1390:2: (otherlv_0= 'BoolVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'boolVarExpr' ( (lv_boolVarExpr_4_0= ruleBoolExpression ) ) otherlv_5= '}' )
            // InternalGX10.g:1391:3: otherlv_0= 'BoolVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'boolVarExpr' ( (lv_boolVarExpr_4_0= ruleBoolExpression ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoolVarAccess().getBoolVarKeyword_0());
            		
            // InternalGX10.g:1395:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGX10.g:1396:4: (lv_name_1_0= ruleEString )
            {
            // InternalGX10.g:1396:4: (lv_name_1_0= ruleEString )
            // InternalGX10.g:1397:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBoolVarAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoolVarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.mleduc.GX10.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getBoolVarAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getBoolVarAccess().getBoolVarExprKeyword_3());
            		
            // InternalGX10.g:1422:3: ( (lv_boolVarExpr_4_0= ruleBoolExpression ) )
            // InternalGX10.g:1423:4: (lv_boolVarExpr_4_0= ruleBoolExpression )
            {
            // InternalGX10.g:1423:4: (lv_boolVarExpr_4_0= ruleBoolExpression )
            // InternalGX10.g:1424:5: lv_boolVarExpr_4_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getBoolVarAccess().getBoolVarExprBoolExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_boolVarExpr_4_0=ruleBoolExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoolVarRule());
            					}
            					set(
            						current,
            						"boolVarExpr",
            						lv_boolVarExpr_4_0,
            						"fr.mleduc.GX10.BoolExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBoolVarAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleBoolVar"


    // $ANTLR start "entryRuleIntVar"
    // InternalGX10.g:1449:1: entryRuleIntVar returns [EObject current=null] : iv_ruleIntVar= ruleIntVar EOF ;
    public final EObject entryRuleIntVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVar = null;


        try {
            // InternalGX10.g:1449:47: (iv_ruleIntVar= ruleIntVar EOF )
            // InternalGX10.g:1450:2: iv_ruleIntVar= ruleIntVar EOF
            {
             newCompositeNode(grammarAccess.getIntVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVar=ruleIntVar();

            state._fsp--;

             current =iv_ruleIntVar; 
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
    // $ANTLR end "entryRuleIntVar"


    // $ANTLR start "ruleIntVar"
    // InternalGX10.g:1456:1: ruleIntVar returns [EObject current=null] : (otherlv_0= 'iv' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<-' ( (lv_intVarExpr_3_0= ruleIntExpression ) ) ) ;
    public final EObject ruleIntVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_intVarExpr_3_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1462:2: ( (otherlv_0= 'iv' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<-' ( (lv_intVarExpr_3_0= ruleIntExpression ) ) ) )
            // InternalGX10.g:1463:2: (otherlv_0= 'iv' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<-' ( (lv_intVarExpr_3_0= ruleIntExpression ) ) )
            {
            // InternalGX10.g:1463:2: (otherlv_0= 'iv' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<-' ( (lv_intVarExpr_3_0= ruleIntExpression ) ) )
            // InternalGX10.g:1464:3: otherlv_0= 'iv' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '<-' ( (lv_intVarExpr_3_0= ruleIntExpression ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIntVarAccess().getIvKeyword_0());
            		
            // InternalGX10.g:1468:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGX10.g:1469:4: (lv_name_1_0= ruleEString )
            {
            // InternalGX10.g:1469:4: (lv_name_1_0= ruleEString )
            // InternalGX10.g:1470:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntVarAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntVarRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.mleduc.GX10.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getIntVarAccess().getLessThanSignHyphenMinusKeyword_2());
            		
            // InternalGX10.g:1491:3: ( (lv_intVarExpr_3_0= ruleIntExpression ) )
            // InternalGX10.g:1492:4: (lv_intVarExpr_3_0= ruleIntExpression )
            {
            // InternalGX10.g:1492:4: (lv_intVarExpr_3_0= ruleIntExpression )
            // InternalGX10.g:1493:5: lv_intVarExpr_3_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getIntVarAccess().getIntVarExprIntExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_intVarExpr_3_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntVarRule());
            					}
            					set(
            						current,
            						"intVarExpr",
            						lv_intVarExpr_3_0,
            						"fr.mleduc.GX10.IntExpression");
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
    // $ANTLR end "ruleIntVar"


    // $ANTLR start "entryRuleIntVarAccess"
    // InternalGX10.g:1514:1: entryRuleIntVarAccess returns [EObject current=null] : iv_ruleIntVarAccess= ruleIntVarAccess EOF ;
    public final EObject entryRuleIntVarAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarAccess = null;


        try {
            // InternalGX10.g:1514:53: (iv_ruleIntVarAccess= ruleIntVarAccess EOF )
            // InternalGX10.g:1515:2: iv_ruleIntVarAccess= ruleIntVarAccess EOF
            {
             newCompositeNode(grammarAccess.getIntVarAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVarAccess=ruleIntVarAccess();

            state._fsp--;

             current =iv_ruleIntVarAccess; 
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
    // $ANTLR end "entryRuleIntVarAccess"


    // $ANTLR start "ruleIntVarAccess"
    // InternalGX10.g:1521:1: ruleIntVarAccess returns [EObject current=null] : (otherlv_0= 'ir' ( ( ruleEString ) ) ) ;
    public final EObject ruleIntVarAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalGX10.g:1527:2: ( (otherlv_0= 'ir' ( ( ruleEString ) ) ) )
            // InternalGX10.g:1528:2: (otherlv_0= 'ir' ( ( ruleEString ) ) )
            {
            // InternalGX10.g:1528:2: (otherlv_0= 'ir' ( ( ruleEString ) ) )
            // InternalGX10.g:1529:3: otherlv_0= 'ir' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIntVarAccessAccess().getIrKeyword_0());
            		
            // InternalGX10.g:1533:3: ( ( ruleEString ) )
            // InternalGX10.g:1534:4: ( ruleEString )
            {
            // InternalGX10.g:1534:4: ( ruleEString )
            // InternalGX10.g:1535:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntVarAccessRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntVarAccessAccess().getIntVarRefIntVarCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleIntVarAccess"


    // $ANTLR start "entryRuleBoolVarAccess"
    // InternalGX10.g:1553:1: entryRuleBoolVarAccess returns [EObject current=null] : iv_ruleBoolVarAccess= ruleBoolVarAccess EOF ;
    public final EObject entryRuleBoolVarAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVarAccess = null;


        try {
            // InternalGX10.g:1553:54: (iv_ruleBoolVarAccess= ruleBoolVarAccess EOF )
            // InternalGX10.g:1554:2: iv_ruleBoolVarAccess= ruleBoolVarAccess EOF
            {
             newCompositeNode(grammarAccess.getBoolVarAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolVarAccess=ruleBoolVarAccess();

            state._fsp--;

             current =iv_ruleBoolVarAccess; 
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
    // $ANTLR end "entryRuleBoolVarAccess"


    // $ANTLR start "ruleBoolVarAccess"
    // InternalGX10.g:1560:1: ruleBoolVarAccess returns [EObject current=null] : (otherlv_0= 'BoolVarAccess' otherlv_1= '{' otherlv_2= 'boolVarRef' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleBoolVarAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGX10.g:1566:2: ( (otherlv_0= 'BoolVarAccess' otherlv_1= '{' otherlv_2= 'boolVarRef' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalGX10.g:1567:2: (otherlv_0= 'BoolVarAccess' otherlv_1= '{' otherlv_2= 'boolVarRef' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:1567:2: (otherlv_0= 'BoolVarAccess' otherlv_1= '{' otherlv_2= 'boolVarRef' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalGX10.g:1568:3: otherlv_0= 'BoolVarAccess' otherlv_1= '{' otherlv_2= 'boolVarRef' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBoolVarAccessAccess().getBoolVarAccessKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolVarAccessAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBoolVarAccessAccess().getBoolVarRefKeyword_2());
            		
            // InternalGX10.g:1580:3: ( ( ruleEString ) )
            // InternalGX10.g:1581:4: ( ruleEString )
            {
            // InternalGX10.g:1581:4: ( ruleEString )
            // InternalGX10.g:1582:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoolVarAccessRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBoolVarAccessAccess().getBoolVarRefBoolVarCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBoolVarAccessAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBoolVarAccess"


    // $ANTLR start "entryRuleEqual"
    // InternalGX10.g:1604:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalGX10.g:1604:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalGX10.g:1605:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalGX10.g:1611:1: ruleEqual returns [EObject current=null] : (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'leftEqual' ( (lv_leftEqual_3_0= ruleIntExpression ) ) otherlv_4= 'rightEqual' ( (lv_rightEqual_5_0= ruleIntExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_leftEqual_3_0 = null;

        EObject lv_rightEqual_5_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1617:2: ( (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'leftEqual' ( (lv_leftEqual_3_0= ruleIntExpression ) ) otherlv_4= 'rightEqual' ( (lv_rightEqual_5_0= ruleIntExpression ) ) otherlv_6= '}' ) )
            // InternalGX10.g:1618:2: (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'leftEqual' ( (lv_leftEqual_3_0= ruleIntExpression ) ) otherlv_4= 'rightEqual' ( (lv_rightEqual_5_0= ruleIntExpression ) ) otherlv_6= '}' )
            {
            // InternalGX10.g:1618:2: (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'leftEqual' ( (lv_leftEqual_3_0= ruleIntExpression ) ) otherlv_4= 'rightEqual' ( (lv_rightEqual_5_0= ruleIntExpression ) ) otherlv_6= '}' )
            // InternalGX10.g:1619:3: otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'leftEqual' ( (lv_leftEqual_3_0= ruleIntExpression ) ) otherlv_4= 'rightEqual' ( (lv_rightEqual_5_0= ruleIntExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getEqualKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getLeftEqualKeyword_2());
            		
            // InternalGX10.g:1631:3: ( (lv_leftEqual_3_0= ruleIntExpression ) )
            // InternalGX10.g:1632:4: (lv_leftEqual_3_0= ruleIntExpression )
            {
            // InternalGX10.g:1632:4: (lv_leftEqual_3_0= ruleIntExpression )
            // InternalGX10.g:1633:5: lv_leftEqual_3_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getLeftEqualIntExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_leftEqual_3_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"leftEqual",
            						lv_leftEqual_3_0,
            						"fr.mleduc.GX10.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getEqualAccess().getRightEqualKeyword_4());
            		
            // InternalGX10.g:1654:3: ( (lv_rightEqual_5_0= ruleIntExpression ) )
            // InternalGX10.g:1655:4: (lv_rightEqual_5_0= ruleIntExpression )
            {
            // InternalGX10.g:1655:4: (lv_rightEqual_5_0= ruleIntExpression )
            // InternalGX10.g:1656:5: lv_rightEqual_5_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getRightEqualIntExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_rightEqual_5_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"rightEqual",
            						lv_rightEqual_5_0,
            						"fr.mleduc.GX10.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEqualAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleEInt"
    // InternalGX10.g:1681:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGX10.g:1681:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGX10.g:1682:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalGX10.g:1688:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGX10.g:1694:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGX10.g:1695:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGX10.g:1695:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGX10.g:1696:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGX10.g:1696:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==50) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGX10.g:1697:4: kw= '-'
                    {
                    kw=(Token)match(input,50,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000B52A65D17000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000B52A65D15000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});

}