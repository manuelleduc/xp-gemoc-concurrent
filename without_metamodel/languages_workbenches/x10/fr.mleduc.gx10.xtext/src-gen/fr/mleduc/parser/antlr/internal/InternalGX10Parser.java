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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main'", "';'", "'{'", "'}'", "'MethodCall'", "'methodToCall'", "'If'", "'controlStructureCondition'", "'thenBlock'", "'elseBlock'", "'While'", "'whileBlock'", "'True'", "'False'", "'Not'", "'notExpression'", "'And'", "'leftAndExpression'", "'rightAndExpression'", "'IntConst'", "'value'", "'Plus'", "'leftPlus'", "'rightPlus'", "'Async'", "'asyncBlock'", "'Finish'", "'finishStatement'", "'Print'", "'toPrint'", "'BoolVar'", "'boolVarExpr'", "'IntVar'", "'intVarExpr'", "'IntVarAccess'", "'intVarRef'", "'BoolVarAccess'", "'boolVarRef'", "'Equal'", "'leftEqual'", "'rightEqual'", "'-'"
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
    public static final int T__51=51;
    public static final int T__52=52;
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
    // InternalGX10.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'main' ( ( ruleEString ) ) otherlv_2= ';' ( (lv_methods_3_0= ruleMethod ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_methods_3_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:77:2: ( (otherlv_0= 'main' ( ( ruleEString ) ) otherlv_2= ';' ( (lv_methods_3_0= ruleMethod ) )* ) )
            // InternalGX10.g:78:2: (otherlv_0= 'main' ( ( ruleEString ) ) otherlv_2= ';' ( (lv_methods_3_0= ruleMethod ) )* )
            {
            // InternalGX10.g:78:2: (otherlv_0= 'main' ( ( ruleEString ) ) otherlv_2= ';' ( (lv_methods_3_0= ruleMethod ) )* )
            // InternalGX10.g:79:3: otherlv_0= 'main' ( ( ruleEString ) ) otherlv_2= ';' ( (lv_methods_3_0= ruleMethod ) )*
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

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_2());
            		
            // InternalGX10.g:103:3: ( (lv_methods_3_0= ruleMethod ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGX10.g:104:4: (lv_methods_3_0= ruleMethod )
            	    {
            	    // InternalGX10.g:104:4: (lv_methods_3_0= ruleMethod )
            	    // InternalGX10.g:105:5: lv_methods_3_0= ruleMethod
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getMethodsMethodParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_methods_3_0=ruleMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_3_0,
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
    // InternalGX10.g:126:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalGX10.g:126:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalGX10.g:127:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalGX10.g:133:1: ruleStatement returns [EObject current=null] : (this_Block_0= ruleBlock | this_If_1= ruleIf | this_While_2= ruleWhile | this_True_3= ruleTrue | this_False_4= ruleFalse | this_Not_5= ruleNot | this_And_6= ruleAnd | this_IntConst_7= ruleIntConst | this_Plus_8= rulePlus | this_Async_9= ruleAsync | this_MethodCall_10= ruleMethodCall | this_Finish_11= ruleFinish | this_Print_12= rulePrint | this_BoolVar_13= ruleBoolVar | this_IntVar_14= ruleIntVar | this_IntVarAccess_15= ruleIntVarAccess | this_BoolVarAccess_16= ruleBoolVarAccess | this_Equal_17= ruleEqual ) ;
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
            // InternalGX10.g:139:2: ( (this_Block_0= ruleBlock | this_If_1= ruleIf | this_While_2= ruleWhile | this_True_3= ruleTrue | this_False_4= ruleFalse | this_Not_5= ruleNot | this_And_6= ruleAnd | this_IntConst_7= ruleIntConst | this_Plus_8= rulePlus | this_Async_9= ruleAsync | this_MethodCall_10= ruleMethodCall | this_Finish_11= ruleFinish | this_Print_12= rulePrint | this_BoolVar_13= ruleBoolVar | this_IntVar_14= ruleIntVar | this_IntVarAccess_15= ruleIntVarAccess | this_BoolVarAccess_16= ruleBoolVarAccess | this_Equal_17= ruleEqual ) )
            // InternalGX10.g:140:2: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_While_2= ruleWhile | this_True_3= ruleTrue | this_False_4= ruleFalse | this_Not_5= ruleNot | this_And_6= ruleAnd | this_IntConst_7= ruleIntConst | this_Plus_8= rulePlus | this_Async_9= ruleAsync | this_MethodCall_10= ruleMethodCall | this_Finish_11= ruleFinish | this_Print_12= rulePrint | this_BoolVar_13= ruleBoolVar | this_IntVar_14= ruleIntVar | this_IntVarAccess_15= ruleIntVarAccess | this_BoolVarAccess_16= ruleBoolVarAccess | this_Equal_17= ruleEqual )
            {
            // InternalGX10.g:140:2: (this_Block_0= ruleBlock | this_If_1= ruleIf | this_While_2= ruleWhile | this_True_3= ruleTrue | this_False_4= ruleFalse | this_Not_5= ruleNot | this_And_6= ruleAnd | this_IntConst_7= ruleIntConst | this_Plus_8= rulePlus | this_Async_9= ruleAsync | this_MethodCall_10= ruleMethodCall | this_Finish_11= ruleFinish | this_Print_12= rulePrint | this_BoolVar_13= ruleBoolVar | this_IntVar_14= ruleIntVar | this_IntVarAccess_15= ruleIntVarAccess | this_BoolVarAccess_16= ruleBoolVarAccess | this_Equal_17= ruleEqual )
            int alt2=18;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 24:
                {
                alt2=5;
                }
                break;
            case 25:
                {
                alt2=6;
                }
                break;
            case 27:
                {
                alt2=7;
                }
                break;
            case 30:
                {
                alt2=8;
                }
                break;
            case 32:
                {
                alt2=9;
                }
                break;
            case 35:
                {
                alt2=10;
                }
                break;
            case 15:
                {
                alt2=11;
                }
                break;
            case 37:
                {
                alt2=12;
                }
                break;
            case 39:
                {
                alt2=13;
                }
                break;
            case 41:
                {
                alt2=14;
                }
                break;
            case 43:
                {
                alt2=15;
                }
                break;
            case 45:
                {
                alt2=16;
                }
                break;
            case 47:
                {
                alt2=17;
                }
                break;
            case 49:
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
                    // InternalGX10.g:141:3: this_Block_0= ruleBlock
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
                    // InternalGX10.g:150:3: this_If_1= ruleIf
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
                    // InternalGX10.g:159:3: this_While_2= ruleWhile
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
                    // InternalGX10.g:168:3: this_True_3= ruleTrue
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
                    // InternalGX10.g:177:3: this_False_4= ruleFalse
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
                    // InternalGX10.g:186:3: this_Not_5= ruleNot
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
                    // InternalGX10.g:195:3: this_And_6= ruleAnd
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
                    // InternalGX10.g:204:3: this_IntConst_7= ruleIntConst
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
                    // InternalGX10.g:213:3: this_Plus_8= rulePlus
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
                    // InternalGX10.g:222:3: this_Async_9= ruleAsync
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
                    // InternalGX10.g:231:3: this_MethodCall_10= ruleMethodCall
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
                    // InternalGX10.g:240:3: this_Finish_11= ruleFinish
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
                    // InternalGX10.g:249:3: this_Print_12= rulePrint
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
                    // InternalGX10.g:258:3: this_BoolVar_13= ruleBoolVar
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
                    // InternalGX10.g:267:3: this_IntVar_14= ruleIntVar
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
                    // InternalGX10.g:276:3: this_IntVarAccess_15= ruleIntVarAccess
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
                    // InternalGX10.g:285:3: this_BoolVarAccess_16= ruleBoolVarAccess
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
                    // InternalGX10.g:294:3: this_Equal_17= ruleEqual
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
    // InternalGX10.g:306:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalGX10.g:306:55: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalGX10.g:307:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalGX10.g:313:1: ruleBoolExpression returns [EObject current=null] : (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_BoolVarAccess_4= ruleBoolVarAccess | this_Equal_5= ruleEqual ) ;
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
            // InternalGX10.g:319:2: ( (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_BoolVarAccess_4= ruleBoolVarAccess | this_Equal_5= ruleEqual ) )
            // InternalGX10.g:320:2: (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_BoolVarAccess_4= ruleBoolVarAccess | this_Equal_5= ruleEqual )
            {
            // InternalGX10.g:320:2: (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_BoolVarAccess_4= ruleBoolVarAccess | this_Equal_5= ruleEqual )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 47:
                {
                alt3=5;
                }
                break;
            case 49:
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
                    // InternalGX10.g:321:3: this_True_0= ruleTrue
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
                    // InternalGX10.g:330:3: this_False_1= ruleFalse
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
                    // InternalGX10.g:339:3: this_Not_2= ruleNot
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
                    // InternalGX10.g:348:3: this_And_3= ruleAnd
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
                    // InternalGX10.g:357:3: this_BoolVarAccess_4= ruleBoolVarAccess
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
                    // InternalGX10.g:366:3: this_Equal_5= ruleEqual
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
    // InternalGX10.g:378:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalGX10.g:378:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalGX10.g:379:2: iv_ruleIntExpression= ruleIntExpression EOF
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
    // InternalGX10.g:385:1: ruleIntExpression returns [EObject current=null] : (this_IntConst_0= ruleIntConst | this_Plus_1= rulePlus | this_IntVarAccess_2= ruleIntVarAccess ) ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntConst_0 = null;

        EObject this_Plus_1 = null;

        EObject this_IntVarAccess_2 = null;



        	enterRule();

        try {
            // InternalGX10.g:391:2: ( (this_IntConst_0= ruleIntConst | this_Plus_1= rulePlus | this_IntVarAccess_2= ruleIntVarAccess ) )
            // InternalGX10.g:392:2: (this_IntConst_0= ruleIntConst | this_Plus_1= rulePlus | this_IntVarAccess_2= ruleIntVarAccess )
            {
            // InternalGX10.g:392:2: (this_IntConst_0= ruleIntConst | this_Plus_1= rulePlus | this_IntVarAccess_2= ruleIntVarAccess )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 45:
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
                    // InternalGX10.g:393:3: this_IntConst_0= ruleIntConst
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
                    // InternalGX10.g:402:3: this_Plus_1= rulePlus
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
                    // InternalGX10.g:411:3: this_IntVarAccess_2= ruleIntVarAccess
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
    // InternalGX10.g:423:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalGX10.g:423:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalGX10.g:424:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalGX10.g:430:1: ruleExpression returns [EObject current=null] : (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_IntConst_4= ruleIntConst | this_Plus_5= rulePlus | this_MethodCall_6= ruleMethodCall | this_BoolVar_7= ruleBoolVar | this_IntVarAccess_8= ruleIntVarAccess | this_BoolVarAccess_9= ruleBoolVarAccess | this_Equal_10= ruleEqual ) ;
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
            // InternalGX10.g:436:2: ( (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_IntConst_4= ruleIntConst | this_Plus_5= rulePlus | this_MethodCall_6= ruleMethodCall | this_BoolVar_7= ruleBoolVar | this_IntVarAccess_8= ruleIntVarAccess | this_BoolVarAccess_9= ruleBoolVarAccess | this_Equal_10= ruleEqual ) )
            // InternalGX10.g:437:2: (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_IntConst_4= ruleIntConst | this_Plus_5= rulePlus | this_MethodCall_6= ruleMethodCall | this_BoolVar_7= ruleBoolVar | this_IntVarAccess_8= ruleIntVarAccess | this_BoolVarAccess_9= ruleBoolVarAccess | this_Equal_10= ruleEqual )
            {
            // InternalGX10.g:437:2: (this_True_0= ruleTrue | this_False_1= ruleFalse | this_Not_2= ruleNot | this_And_3= ruleAnd | this_IntConst_4= ruleIntConst | this_Plus_5= rulePlus | this_MethodCall_6= ruleMethodCall | this_BoolVar_7= ruleBoolVar | this_IntVarAccess_8= ruleIntVarAccess | this_BoolVarAccess_9= ruleBoolVarAccess | this_Equal_10= ruleEqual )
            int alt5=11;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 32:
                {
                alt5=6;
                }
                break;
            case 15:
                {
                alt5=7;
                }
                break;
            case 41:
                {
                alt5=8;
                }
                break;
            case 45:
                {
                alt5=9;
                }
                break;
            case 47:
                {
                alt5=10;
                }
                break;
            case 49:
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
                    // InternalGX10.g:438:3: this_True_0= ruleTrue
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
                    // InternalGX10.g:447:3: this_False_1= ruleFalse
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
                    // InternalGX10.g:456:3: this_Not_2= ruleNot
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
                    // InternalGX10.g:465:3: this_And_3= ruleAnd
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
                    // InternalGX10.g:474:3: this_IntConst_4= ruleIntConst
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
                    // InternalGX10.g:483:3: this_Plus_5= rulePlus
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
                    // InternalGX10.g:492:3: this_MethodCall_6= ruleMethodCall
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
                    // InternalGX10.g:501:3: this_BoolVar_7= ruleBoolVar
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
                    // InternalGX10.g:510:3: this_IntVarAccess_8= ruleIntVarAccess
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
                    // InternalGX10.g:519:3: this_BoolVarAccess_9= ruleBoolVarAccess
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
                    // InternalGX10.g:528:3: this_Equal_10= ruleEqual
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
    // InternalGX10.g:540:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalGX10.g:540:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalGX10.g:541:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalGX10.g:547:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_methodBlock_1_0= ruleBlock ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_methodBlock_1_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:553:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_methodBlock_1_0= ruleBlock ) ) ) )
            // InternalGX10.g:554:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_methodBlock_1_0= ruleBlock ) ) )
            {
            // InternalGX10.g:554:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_methodBlock_1_0= ruleBlock ) ) )
            // InternalGX10.g:555:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_methodBlock_1_0= ruleBlock ) )
            {
            // InternalGX10.g:555:3: ( (lv_name_0_0= ruleEString ) )
            // InternalGX10.g:556:4: (lv_name_0_0= ruleEString )
            {
            // InternalGX10.g:556:4: (lv_name_0_0= ruleEString )
            // InternalGX10.g:557:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalGX10.g:574:3: ( (lv_methodBlock_1_0= ruleBlock ) )
            // InternalGX10.g:575:4: (lv_methodBlock_1_0= ruleBlock )
            {
            // InternalGX10.g:575:4: (lv_methodBlock_1_0= ruleBlock )
            // InternalGX10.g:576:5: lv_methodBlock_1_0= ruleBlock
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
    // InternalGX10.g:597:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalGX10.g:597:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalGX10.g:598:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalGX10.g:604:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_blockStatements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_blockStatements_2_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:610:2: ( ( () otherlv_1= '{' ( (lv_blockStatements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalGX10.g:611:2: ( () otherlv_1= '{' ( (lv_blockStatements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalGX10.g:611:2: ( () otherlv_1= '{' ( (lv_blockStatements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalGX10.g:612:3: () otherlv_1= '{' ( (lv_blockStatements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalGX10.g:612:3: ()
            // InternalGX10.g:613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGX10.g:623:3: ( (lv_blockStatements_2_0= ruleStatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13||LA6_0==15||LA6_0==17||LA6_0==21||(LA6_0>=23 && LA6_0<=25)||LA6_0==27||LA6_0==30||LA6_0==32||LA6_0==35||LA6_0==37||LA6_0==39||LA6_0==41||LA6_0==43||LA6_0==45||LA6_0==47||LA6_0==49) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGX10.g:624:4: (lv_blockStatements_2_0= ruleStatement )
            	    {
            	    // InternalGX10.g:624:4: (lv_blockStatements_2_0= ruleStatement )
            	    // InternalGX10.g:625:5: lv_blockStatements_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getBlockStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:650:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGX10.g:650:47: (iv_ruleEString= ruleEString EOF )
            // InternalGX10.g:651:2: iv_ruleEString= ruleEString EOF
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
    // InternalGX10.g:657:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGX10.g:663:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGX10.g:664:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGX10.g:664:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalGX10.g:665:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGX10.g:673:3: this_ID_1= RULE_ID
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
    // InternalGX10.g:684:1: entryRuleMethodCall returns [EObject current=null] : iv_ruleMethodCall= ruleMethodCall EOF ;
    public final EObject entryRuleMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodCall = null;


        try {
            // InternalGX10.g:684:51: (iv_ruleMethodCall= ruleMethodCall EOF )
            // InternalGX10.g:685:2: iv_ruleMethodCall= ruleMethodCall EOF
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
    // InternalGX10.g:691:1: ruleMethodCall returns [EObject current=null] : (otherlv_0= 'MethodCall' otherlv_1= '{' otherlv_2= 'methodToCall' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleMethodCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGX10.g:697:2: ( (otherlv_0= 'MethodCall' otherlv_1= '{' otherlv_2= 'methodToCall' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalGX10.g:698:2: (otherlv_0= 'MethodCall' otherlv_1= '{' otherlv_2= 'methodToCall' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:698:2: (otherlv_0= 'MethodCall' otherlv_1= '{' otherlv_2= 'methodToCall' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalGX10.g:699:3: otherlv_0= 'MethodCall' otherlv_1= '{' otherlv_2= 'methodToCall' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodCallAccess().getMethodCallKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodCallAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodCallAccess().getMethodToCallKeyword_2());
            		
            // InternalGX10.g:711:3: ( ( ruleEString ) )
            // InternalGX10.g:712:4: ( ruleEString )
            {
            // InternalGX10.g:712:4: ( ruleEString )
            // InternalGX10.g:713:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMethodCallAccess().getMethodToCallMethodCrossReference_3_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:735:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalGX10.g:735:43: (iv_ruleIf= ruleIf EOF )
            // InternalGX10.g:736:2: iv_ruleIf= ruleIf EOF
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
    // InternalGX10.g:742:1: ruleIf returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'thenBlock' ( (lv_thenBlock_5_0= ruleBlock ) ) otherlv_6= 'elseBlock' ( (lv_elseBlock_7_0= ruleBlock ) ) otherlv_8= '}' ) ;
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
            // InternalGX10.g:748:2: ( (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'thenBlock' ( (lv_thenBlock_5_0= ruleBlock ) ) otherlv_6= 'elseBlock' ( (lv_elseBlock_7_0= ruleBlock ) ) otherlv_8= '}' ) )
            // InternalGX10.g:749:2: (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'thenBlock' ( (lv_thenBlock_5_0= ruleBlock ) ) otherlv_6= 'elseBlock' ( (lv_elseBlock_7_0= ruleBlock ) ) otherlv_8= '}' )
            {
            // InternalGX10.g:749:2: (otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'thenBlock' ( (lv_thenBlock_5_0= ruleBlock ) ) otherlv_6= 'elseBlock' ( (lv_elseBlock_7_0= ruleBlock ) ) otherlv_8= '}' )
            // InternalGX10.g:750:3: otherlv_0= 'If' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'thenBlock' ( (lv_thenBlock_5_0= ruleBlock ) ) otherlv_6= 'elseBlock' ( (lv_elseBlock_7_0= ruleBlock ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getControlStructureConditionKeyword_2());
            		
            // InternalGX10.g:762:3: ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) )
            // InternalGX10.g:763:4: (lv_controlStructureCondition_3_0= ruleBoolExpression )
            {
            // InternalGX10.g:763:4: (lv_controlStructureCondition_3_0= ruleBoolExpression )
            // InternalGX10.g:764:5: lv_controlStructureCondition_3_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getControlStructureConditionBoolExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getThenBlockKeyword_4());
            		
            // InternalGX10.g:785:3: ( (lv_thenBlock_5_0= ruleBlock ) )
            // InternalGX10.g:786:4: (lv_thenBlock_5_0= ruleBlock )
            {
            // InternalGX10.g:786:4: (lv_thenBlock_5_0= ruleBlock )
            // InternalGX10.g:787:5: lv_thenBlock_5_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfAccess().getThenBlockBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_6=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getElseBlockKeyword_6());
            		
            // InternalGX10.g:808:3: ( (lv_elseBlock_7_0= ruleBlock ) )
            // InternalGX10.g:809:4: (lv_elseBlock_7_0= ruleBlock )
            {
            // InternalGX10.g:809:4: (lv_elseBlock_7_0= ruleBlock )
            // InternalGX10.g:810:5: lv_elseBlock_7_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getIfAccess().getElseBlockBlockParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:835:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalGX10.g:835:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalGX10.g:836:2: iv_ruleWhile= ruleWhile EOF
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
    // InternalGX10.g:842:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'While' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'whileBlock' ( (lv_whileBlock_5_0= ruleBlock ) ) otherlv_6= '}' ) ;
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
            // InternalGX10.g:848:2: ( (otherlv_0= 'While' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'whileBlock' ( (lv_whileBlock_5_0= ruleBlock ) ) otherlv_6= '}' ) )
            // InternalGX10.g:849:2: (otherlv_0= 'While' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'whileBlock' ( (lv_whileBlock_5_0= ruleBlock ) ) otherlv_6= '}' )
            {
            // InternalGX10.g:849:2: (otherlv_0= 'While' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'whileBlock' ( (lv_whileBlock_5_0= ruleBlock ) ) otherlv_6= '}' )
            // InternalGX10.g:850:3: otherlv_0= 'While' otherlv_1= '{' otherlv_2= 'controlStructureCondition' ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) ) otherlv_4= 'whileBlock' ( (lv_whileBlock_5_0= ruleBlock ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getControlStructureConditionKeyword_2());
            		
            // InternalGX10.g:862:3: ( (lv_controlStructureCondition_3_0= ruleBoolExpression ) )
            // InternalGX10.g:863:4: (lv_controlStructureCondition_3_0= ruleBoolExpression )
            {
            // InternalGX10.g:863:4: (lv_controlStructureCondition_3_0= ruleBoolExpression )
            // InternalGX10.g:864:5: lv_controlStructureCondition_3_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getControlStructureConditionBoolExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getWhileBlockKeyword_4());
            		
            // InternalGX10.g:885:3: ( (lv_whileBlock_5_0= ruleBlock ) )
            // InternalGX10.g:886:4: (lv_whileBlock_5_0= ruleBlock )
            {
            // InternalGX10.g:886:4: (lv_whileBlock_5_0= ruleBlock )
            // InternalGX10.g:887:5: lv_whileBlock_5_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getWhileBlockBlockParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:912:1: entryRuleTrue returns [EObject current=null] : iv_ruleTrue= ruleTrue EOF ;
    public final EObject entryRuleTrue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrue = null;


        try {
            // InternalGX10.g:912:45: (iv_ruleTrue= ruleTrue EOF )
            // InternalGX10.g:913:2: iv_ruleTrue= ruleTrue EOF
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
    // InternalGX10.g:919:1: ruleTrue returns [EObject current=null] : ( () otherlv_1= 'True' ) ;
    public final EObject ruleTrue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGX10.g:925:2: ( ( () otherlv_1= 'True' ) )
            // InternalGX10.g:926:2: ( () otherlv_1= 'True' )
            {
            // InternalGX10.g:926:2: ( () otherlv_1= 'True' )
            // InternalGX10.g:927:3: () otherlv_1= 'True'
            {
            // InternalGX10.g:927:3: ()
            // InternalGX10.g:928:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrueAccess().getTrueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

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
    // InternalGX10.g:942:1: entryRuleFalse returns [EObject current=null] : iv_ruleFalse= ruleFalse EOF ;
    public final EObject entryRuleFalse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalse = null;


        try {
            // InternalGX10.g:942:46: (iv_ruleFalse= ruleFalse EOF )
            // InternalGX10.g:943:2: iv_ruleFalse= ruleFalse EOF
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
    // InternalGX10.g:949:1: ruleFalse returns [EObject current=null] : ( () otherlv_1= 'False' ) ;
    public final EObject ruleFalse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGX10.g:955:2: ( ( () otherlv_1= 'False' ) )
            // InternalGX10.g:956:2: ( () otherlv_1= 'False' )
            {
            // InternalGX10.g:956:2: ( () otherlv_1= 'False' )
            // InternalGX10.g:957:3: () otherlv_1= 'False'
            {
            // InternalGX10.g:957:3: ()
            // InternalGX10.g:958:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFalseAccess().getFalseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

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
    // InternalGX10.g:972:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalGX10.g:972:44: (iv_ruleNot= ruleNot EOF )
            // InternalGX10.g:973:2: iv_ruleNot= ruleNot EOF
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
    // InternalGX10.g:979:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'notExpression' ( (lv_notExpression_3_0= ruleBoolExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_notExpression_3_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:985:2: ( (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'notExpression' ( (lv_notExpression_3_0= ruleBoolExpression ) ) otherlv_4= '}' ) )
            // InternalGX10.g:986:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'notExpression' ( (lv_notExpression_3_0= ruleBoolExpression ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:986:2: (otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'notExpression' ( (lv_notExpression_3_0= ruleBoolExpression ) ) otherlv_4= '}' )
            // InternalGX10.g:987:3: otherlv_0= 'Not' otherlv_1= '{' otherlv_2= 'notExpression' ( (lv_notExpression_3_0= ruleBoolExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getNotAccess().getNotExpressionKeyword_2());
            		
            // InternalGX10.g:999:3: ( (lv_notExpression_3_0= ruleBoolExpression ) )
            // InternalGX10.g:1000:4: (lv_notExpression_3_0= ruleBoolExpression )
            {
            // InternalGX10.g:1000:4: (lv_notExpression_3_0= ruleBoolExpression )
            // InternalGX10.g:1001:5: lv_notExpression_3_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getNotAccess().getNotExpressionBoolExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:1026:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalGX10.g:1026:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalGX10.g:1027:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalGX10.g:1033:1: ruleAnd returns [EObject current=null] : (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'leftAndExpression' ( (lv_leftAndExpression_3_0= ruleBoolExpression ) ) otherlv_4= 'rightAndExpression' ( (lv_rightAndExpression_5_0= ruleBoolExpression ) ) otherlv_6= '}' ) ;
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
            // InternalGX10.g:1039:2: ( (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'leftAndExpression' ( (lv_leftAndExpression_3_0= ruleBoolExpression ) ) otherlv_4= 'rightAndExpression' ( (lv_rightAndExpression_5_0= ruleBoolExpression ) ) otherlv_6= '}' ) )
            // InternalGX10.g:1040:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'leftAndExpression' ( (lv_leftAndExpression_3_0= ruleBoolExpression ) ) otherlv_4= 'rightAndExpression' ( (lv_rightAndExpression_5_0= ruleBoolExpression ) ) otherlv_6= '}' )
            {
            // InternalGX10.g:1040:2: (otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'leftAndExpression' ( (lv_leftAndExpression_3_0= ruleBoolExpression ) ) otherlv_4= 'rightAndExpression' ( (lv_rightAndExpression_5_0= ruleBoolExpression ) ) otherlv_6= '}' )
            // InternalGX10.g:1041:3: otherlv_0= 'And' otherlv_1= '{' otherlv_2= 'leftAndExpression' ( (lv_leftAndExpression_3_0= ruleBoolExpression ) ) otherlv_4= 'rightAndExpression' ( (lv_rightAndExpression_5_0= ruleBoolExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getAndKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAndAccess().getLeftAndExpressionKeyword_2());
            		
            // InternalGX10.g:1053:3: ( (lv_leftAndExpression_3_0= ruleBoolExpression ) )
            // InternalGX10.g:1054:4: (lv_leftAndExpression_3_0= ruleBoolExpression )
            {
            // InternalGX10.g:1054:4: (lv_leftAndExpression_3_0= ruleBoolExpression )
            // InternalGX10.g:1055:5: lv_leftAndExpression_3_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getLeftAndExpressionBoolExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_4=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getAndAccess().getRightAndExpressionKeyword_4());
            		
            // InternalGX10.g:1076:3: ( (lv_rightAndExpression_5_0= ruleBoolExpression ) )
            // InternalGX10.g:1077:4: (lv_rightAndExpression_5_0= ruleBoolExpression )
            {
            // InternalGX10.g:1077:4: (lv_rightAndExpression_5_0= ruleBoolExpression )
            // InternalGX10.g:1078:5: lv_rightAndExpression_5_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getAndAccess().getRightAndExpressionBoolExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:1103:1: entryRuleIntConst returns [EObject current=null] : iv_ruleIntConst= ruleIntConst EOF ;
    public final EObject entryRuleIntConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConst = null;


        try {
            // InternalGX10.g:1103:49: (iv_ruleIntConst= ruleIntConst EOF )
            // InternalGX10.g:1104:2: iv_ruleIntConst= ruleIntConst EOF
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
    // InternalGX10.g:1110:1: ruleIntConst returns [EObject current=null] : (otherlv_0= 'IntConst' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleIntConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1116:2: ( (otherlv_0= 'IntConst' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalGX10.g:1117:2: (otherlv_0= 'IntConst' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:1117:2: (otherlv_0= 'IntConst' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalGX10.g:1118:3: otherlv_0= 'IntConst' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIntConstAccess().getIntConstKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getIntConstAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getIntConstAccess().getValueKeyword_2());
            		
            // InternalGX10.g:1130:3: ( (lv_value_3_0= ruleEInt ) )
            // InternalGX10.g:1131:4: (lv_value_3_0= ruleEInt )
            {
            // InternalGX10.g:1131:4: (lv_value_3_0= ruleEInt )
            // InternalGX10.g:1132:5: lv_value_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntConstAccess().getValueEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntConstRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"fr.mleduc.GX10.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIntConstAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalGX10.g:1157:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalGX10.g:1157:45: (iv_rulePlus= rulePlus EOF )
            // InternalGX10.g:1158:2: iv_rulePlus= rulePlus EOF
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
    // InternalGX10.g:1164:1: rulePlus returns [EObject current=null] : (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'leftPlus' ( (lv_leftPlus_3_0= ruleIntExpression ) ) otherlv_4= 'rightPlus' ( (lv_rightPlus_5_0= ruleIntExpression ) ) otherlv_6= '}' ) ;
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
            // InternalGX10.g:1170:2: ( (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'leftPlus' ( (lv_leftPlus_3_0= ruleIntExpression ) ) otherlv_4= 'rightPlus' ( (lv_rightPlus_5_0= ruleIntExpression ) ) otherlv_6= '}' ) )
            // InternalGX10.g:1171:2: (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'leftPlus' ( (lv_leftPlus_3_0= ruleIntExpression ) ) otherlv_4= 'rightPlus' ( (lv_rightPlus_5_0= ruleIntExpression ) ) otherlv_6= '}' )
            {
            // InternalGX10.g:1171:2: (otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'leftPlus' ( (lv_leftPlus_3_0= ruleIntExpression ) ) otherlv_4= 'rightPlus' ( (lv_rightPlus_5_0= ruleIntExpression ) ) otherlv_6= '}' )
            // InternalGX10.g:1172:3: otherlv_0= 'Plus' otherlv_1= '{' otherlv_2= 'leftPlus' ( (lv_leftPlus_3_0= ruleIntExpression ) ) otherlv_4= 'rightPlus' ( (lv_rightPlus_5_0= ruleIntExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPlusAccess().getPlusKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPlusAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getLeftPlusKeyword_2());
            		
            // InternalGX10.g:1184:3: ( (lv_leftPlus_3_0= ruleIntExpression ) )
            // InternalGX10.g:1185:4: (lv_leftPlus_3_0= ruleIntExpression )
            {
            // InternalGX10.g:1185:4: (lv_leftPlus_3_0= ruleIntExpression )
            // InternalGX10.g:1186:5: lv_leftPlus_3_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getPlusAccess().getLeftPlusIntExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_4=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getPlusAccess().getRightPlusKeyword_4());
            		
            // InternalGX10.g:1207:3: ( (lv_rightPlus_5_0= ruleIntExpression ) )
            // InternalGX10.g:1208:4: (lv_rightPlus_5_0= ruleIntExpression )
            {
            // InternalGX10.g:1208:4: (lv_rightPlus_5_0= ruleIntExpression )
            // InternalGX10.g:1209:5: lv_rightPlus_5_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getPlusAccess().getRightPlusIntExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:1234:1: entryRuleAsync returns [EObject current=null] : iv_ruleAsync= ruleAsync EOF ;
    public final EObject entryRuleAsync() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsync = null;


        try {
            // InternalGX10.g:1234:46: (iv_ruleAsync= ruleAsync EOF )
            // InternalGX10.g:1235:2: iv_ruleAsync= ruleAsync EOF
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
    // InternalGX10.g:1241:1: ruleAsync returns [EObject current=null] : (otherlv_0= 'Async' otherlv_1= '{' otherlv_2= 'asyncBlock' ( (lv_asyncBlock_3_0= ruleStatement ) ) otherlv_4= '}' ) ;
    public final EObject ruleAsync() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_asyncBlock_3_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1247:2: ( (otherlv_0= 'Async' otherlv_1= '{' otherlv_2= 'asyncBlock' ( (lv_asyncBlock_3_0= ruleStatement ) ) otherlv_4= '}' ) )
            // InternalGX10.g:1248:2: (otherlv_0= 'Async' otherlv_1= '{' otherlv_2= 'asyncBlock' ( (lv_asyncBlock_3_0= ruleStatement ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:1248:2: (otherlv_0= 'Async' otherlv_1= '{' otherlv_2= 'asyncBlock' ( (lv_asyncBlock_3_0= ruleStatement ) ) otherlv_4= '}' )
            // InternalGX10.g:1249:3: otherlv_0= 'Async' otherlv_1= '{' otherlv_2= 'asyncBlock' ( (lv_asyncBlock_3_0= ruleStatement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAsyncAccess().getAsyncKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAsyncAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAsyncAccess().getAsyncBlockKeyword_2());
            		
            // InternalGX10.g:1261:3: ( (lv_asyncBlock_3_0= ruleStatement ) )
            // InternalGX10.g:1262:4: (lv_asyncBlock_3_0= ruleStatement )
            {
            // InternalGX10.g:1262:4: (lv_asyncBlock_3_0= ruleStatement )
            // InternalGX10.g:1263:5: lv_asyncBlock_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getAsyncAccess().getAsyncBlockStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:1288:1: entryRuleFinish returns [EObject current=null] : iv_ruleFinish= ruleFinish EOF ;
    public final EObject entryRuleFinish() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinish = null;


        try {
            // InternalGX10.g:1288:47: (iv_ruleFinish= ruleFinish EOF )
            // InternalGX10.g:1289:2: iv_ruleFinish= ruleFinish EOF
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
    // InternalGX10.g:1295:1: ruleFinish returns [EObject current=null] : (otherlv_0= 'Finish' otherlv_1= '{' otherlv_2= 'finishStatement' ( (lv_finishStatement_3_0= ruleStatement ) ) otherlv_4= '}' ) ;
    public final EObject ruleFinish() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_finishStatement_3_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1301:2: ( (otherlv_0= 'Finish' otherlv_1= '{' otherlv_2= 'finishStatement' ( (lv_finishStatement_3_0= ruleStatement ) ) otherlv_4= '}' ) )
            // InternalGX10.g:1302:2: (otherlv_0= 'Finish' otherlv_1= '{' otherlv_2= 'finishStatement' ( (lv_finishStatement_3_0= ruleStatement ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:1302:2: (otherlv_0= 'Finish' otherlv_1= '{' otherlv_2= 'finishStatement' ( (lv_finishStatement_3_0= ruleStatement ) ) otherlv_4= '}' )
            // InternalGX10.g:1303:3: otherlv_0= 'Finish' otherlv_1= '{' otherlv_2= 'finishStatement' ( (lv_finishStatement_3_0= ruleStatement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFinishAccess().getFinishKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getFinishAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getFinishAccess().getFinishStatementKeyword_2());
            		
            // InternalGX10.g:1315:3: ( (lv_finishStatement_3_0= ruleStatement ) )
            // InternalGX10.g:1316:4: (lv_finishStatement_3_0= ruleStatement )
            {
            // InternalGX10.g:1316:4: (lv_finishStatement_3_0= ruleStatement )
            // InternalGX10.g:1317:5: lv_finishStatement_3_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getFinishAccess().getFinishStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:1342:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalGX10.g:1342:46: (iv_rulePrint= rulePrint EOF )
            // InternalGX10.g:1343:2: iv_rulePrint= rulePrint EOF
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
    // InternalGX10.g:1349:1: rulePrint returns [EObject current=null] : (otherlv_0= 'Print' otherlv_1= '{' otherlv_2= 'toPrint' ( (lv_toPrint_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_toPrint_3_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1355:2: ( (otherlv_0= 'Print' otherlv_1= '{' otherlv_2= 'toPrint' ( (lv_toPrint_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // InternalGX10.g:1356:2: (otherlv_0= 'Print' otherlv_1= '{' otherlv_2= 'toPrint' ( (lv_toPrint_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:1356:2: (otherlv_0= 'Print' otherlv_1= '{' otherlv_2= 'toPrint' ( (lv_toPrint_3_0= ruleExpression ) ) otherlv_4= '}' )
            // InternalGX10.g:1357:3: otherlv_0= 'Print' otherlv_1= '{' otherlv_2= 'toPrint' ( (lv_toPrint_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintAccess().getToPrintKeyword_2());
            		
            // InternalGX10.g:1369:3: ( (lv_toPrint_3_0= ruleExpression ) )
            // InternalGX10.g:1370:4: (lv_toPrint_3_0= ruleExpression )
            {
            // InternalGX10.g:1370:4: (lv_toPrint_3_0= ruleExpression )
            // InternalGX10.g:1371:5: lv_toPrint_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getToPrintExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_toPrint_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"toPrint",
            						lv_toPrint_3_0,
            						"fr.mleduc.GX10.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPrintAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalGX10.g:1396:1: entryRuleBoolVar returns [EObject current=null] : iv_ruleBoolVar= ruleBoolVar EOF ;
    public final EObject entryRuleBoolVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVar = null;


        try {
            // InternalGX10.g:1396:48: (iv_ruleBoolVar= ruleBoolVar EOF )
            // InternalGX10.g:1397:2: iv_ruleBoolVar= ruleBoolVar EOF
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
    // InternalGX10.g:1403:1: ruleBoolVar returns [EObject current=null] : (otherlv_0= 'BoolVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'boolVarExpr' ( (lv_boolVarExpr_4_0= ruleBoolExpression ) ) otherlv_5= '}' ) ;
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
            // InternalGX10.g:1409:2: ( (otherlv_0= 'BoolVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'boolVarExpr' ( (lv_boolVarExpr_4_0= ruleBoolExpression ) ) otherlv_5= '}' ) )
            // InternalGX10.g:1410:2: (otherlv_0= 'BoolVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'boolVarExpr' ( (lv_boolVarExpr_4_0= ruleBoolExpression ) ) otherlv_5= '}' )
            {
            // InternalGX10.g:1410:2: (otherlv_0= 'BoolVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'boolVarExpr' ( (lv_boolVarExpr_4_0= ruleBoolExpression ) ) otherlv_5= '}' )
            // InternalGX10.g:1411:3: otherlv_0= 'BoolVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'boolVarExpr' ( (lv_boolVarExpr_4_0= ruleBoolExpression ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoolVarAccess().getBoolVarKeyword_0());
            		
            // InternalGX10.g:1415:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGX10.g:1416:4: (lv_name_1_0= ruleEString )
            {
            // InternalGX10.g:1416:4: (lv_name_1_0= ruleEString )
            // InternalGX10.g:1417:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBoolVarAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getBoolVarAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getBoolVarAccess().getBoolVarExprKeyword_3());
            		
            // InternalGX10.g:1442:3: ( (lv_boolVarExpr_4_0= ruleBoolExpression ) )
            // InternalGX10.g:1443:4: (lv_boolVarExpr_4_0= ruleBoolExpression )
            {
            // InternalGX10.g:1443:4: (lv_boolVarExpr_4_0= ruleBoolExpression )
            // InternalGX10.g:1444:5: lv_boolVarExpr_4_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getBoolVarAccess().getBoolVarExprBoolExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:1469:1: entryRuleIntVar returns [EObject current=null] : iv_ruleIntVar= ruleIntVar EOF ;
    public final EObject entryRuleIntVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVar = null;


        try {
            // InternalGX10.g:1469:47: (iv_ruleIntVar= ruleIntVar EOF )
            // InternalGX10.g:1470:2: iv_ruleIntVar= ruleIntVar EOF
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
    // InternalGX10.g:1476:1: ruleIntVar returns [EObject current=null] : (otherlv_0= 'IntVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'intVarExpr' ( (lv_intVarExpr_4_0= ruleIntExpression ) ) otherlv_5= '}' ) ;
    public final EObject ruleIntVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_intVarExpr_4_0 = null;



        	enterRule();

        try {
            // InternalGX10.g:1482:2: ( (otherlv_0= 'IntVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'intVarExpr' ( (lv_intVarExpr_4_0= ruleIntExpression ) ) otherlv_5= '}' ) )
            // InternalGX10.g:1483:2: (otherlv_0= 'IntVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'intVarExpr' ( (lv_intVarExpr_4_0= ruleIntExpression ) ) otherlv_5= '}' )
            {
            // InternalGX10.g:1483:2: (otherlv_0= 'IntVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'intVarExpr' ( (lv_intVarExpr_4_0= ruleIntExpression ) ) otherlv_5= '}' )
            // InternalGX10.g:1484:3: otherlv_0= 'IntVar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'intVarExpr' ( (lv_intVarExpr_4_0= ruleIntExpression ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIntVarAccess().getIntVarKeyword_0());
            		
            // InternalGX10.g:1488:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGX10.g:1489:4: (lv_name_1_0= ruleEString )
            {
            // InternalGX10.g:1489:4: (lv_name_1_0= ruleEString )
            // InternalGX10.g:1490:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntVarAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            otherlv_2=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getIntVarAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getIntVarAccess().getIntVarExprKeyword_3());
            		
            // InternalGX10.g:1515:3: ( (lv_intVarExpr_4_0= ruleIntExpression ) )
            // InternalGX10.g:1516:4: (lv_intVarExpr_4_0= ruleIntExpression )
            {
            // InternalGX10.g:1516:4: (lv_intVarExpr_4_0= ruleIntExpression )
            // InternalGX10.g:1517:5: lv_intVarExpr_4_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getIntVarAccess().getIntVarExprIntExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_intVarExpr_4_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntVarRule());
            					}
            					set(
            						current,
            						"intVarExpr",
            						lv_intVarExpr_4_0,
            						"fr.mleduc.GX10.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIntVarAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalGX10.g:1542:1: entryRuleIntVarAccess returns [EObject current=null] : iv_ruleIntVarAccess= ruleIntVarAccess EOF ;
    public final EObject entryRuleIntVarAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarAccess = null;


        try {
            // InternalGX10.g:1542:53: (iv_ruleIntVarAccess= ruleIntVarAccess EOF )
            // InternalGX10.g:1543:2: iv_ruleIntVarAccess= ruleIntVarAccess EOF
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
    // InternalGX10.g:1549:1: ruleIntVarAccess returns [EObject current=null] : (otherlv_0= 'IntVarAccess' otherlv_1= '{' otherlv_2= 'intVarRef' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleIntVarAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGX10.g:1555:2: ( (otherlv_0= 'IntVarAccess' otherlv_1= '{' otherlv_2= 'intVarRef' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalGX10.g:1556:2: (otherlv_0= 'IntVarAccess' otherlv_1= '{' otherlv_2= 'intVarRef' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:1556:2: (otherlv_0= 'IntVarAccess' otherlv_1= '{' otherlv_2= 'intVarRef' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalGX10.g:1557:3: otherlv_0= 'IntVarAccess' otherlv_1= '{' otherlv_2= 'intVarRef' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIntVarAccessAccess().getIntVarAccessKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getIntVarAccessAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getIntVarAccessAccess().getIntVarRefKeyword_2());
            		
            // InternalGX10.g:1569:3: ( ( ruleEString ) )
            // InternalGX10.g:1570:4: ( ruleEString )
            {
            // InternalGX10.g:1570:4: ( ruleEString )
            // InternalGX10.g:1571:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntVarAccessRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntVarAccessAccess().getIntVarRefIntVarCrossReference_3_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIntVarAccessAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalGX10.g:1593:1: entryRuleBoolVarAccess returns [EObject current=null] : iv_ruleBoolVarAccess= ruleBoolVarAccess EOF ;
    public final EObject entryRuleBoolVarAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolVarAccess = null;


        try {
            // InternalGX10.g:1593:54: (iv_ruleBoolVarAccess= ruleBoolVarAccess EOF )
            // InternalGX10.g:1594:2: iv_ruleBoolVarAccess= ruleBoolVarAccess EOF
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
    // InternalGX10.g:1600:1: ruleBoolVarAccess returns [EObject current=null] : (otherlv_0= 'BoolVarAccess' otherlv_1= '{' otherlv_2= 'boolVarRef' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleBoolVarAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGX10.g:1606:2: ( (otherlv_0= 'BoolVarAccess' otherlv_1= '{' otherlv_2= 'boolVarRef' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalGX10.g:1607:2: (otherlv_0= 'BoolVarAccess' otherlv_1= '{' otherlv_2= 'boolVarRef' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalGX10.g:1607:2: (otherlv_0= 'BoolVarAccess' otherlv_1= '{' otherlv_2= 'boolVarRef' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalGX10.g:1608:3: otherlv_0= 'BoolVarAccess' otherlv_1= '{' otherlv_2= 'boolVarRef' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBoolVarAccessAccess().getBoolVarAccessKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolVarAccessAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBoolVarAccessAccess().getBoolVarRefKeyword_2());
            		
            // InternalGX10.g:1620:3: ( ( ruleEString ) )
            // InternalGX10.g:1621:4: ( ruleEString )
            {
            // InternalGX10.g:1621:4: ( ruleEString )
            // InternalGX10.g:1622:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoolVarAccessRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBoolVarAccessAccess().getBoolVarRefBoolVarCrossReference_3_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:1644:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalGX10.g:1644:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalGX10.g:1645:2: iv_ruleEqual= ruleEqual EOF
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
    // InternalGX10.g:1651:1: ruleEqual returns [EObject current=null] : (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'leftEqual' ( (lv_leftEqual_3_0= ruleIntExpression ) ) otherlv_4= 'rightEqual' ( (lv_rightEqual_5_0= ruleIntExpression ) ) otherlv_6= '}' ) ;
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
            // InternalGX10.g:1657:2: ( (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'leftEqual' ( (lv_leftEqual_3_0= ruleIntExpression ) ) otherlv_4= 'rightEqual' ( (lv_rightEqual_5_0= ruleIntExpression ) ) otherlv_6= '}' ) )
            // InternalGX10.g:1658:2: (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'leftEqual' ( (lv_leftEqual_3_0= ruleIntExpression ) ) otherlv_4= 'rightEqual' ( (lv_rightEqual_5_0= ruleIntExpression ) ) otherlv_6= '}' )
            {
            // InternalGX10.g:1658:2: (otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'leftEqual' ( (lv_leftEqual_3_0= ruleIntExpression ) ) otherlv_4= 'rightEqual' ( (lv_rightEqual_5_0= ruleIntExpression ) ) otherlv_6= '}' )
            // InternalGX10.g:1659:3: otherlv_0= 'Equal' otherlv_1= '{' otherlv_2= 'leftEqual' ( (lv_leftEqual_3_0= ruleIntExpression ) ) otherlv_4= 'rightEqual' ( (lv_rightEqual_5_0= ruleIntExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getEqualKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,50,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getLeftEqualKeyword_2());
            		
            // InternalGX10.g:1671:3: ( (lv_leftEqual_3_0= ruleIntExpression ) )
            // InternalGX10.g:1672:4: (lv_leftEqual_3_0= ruleIntExpression )
            {
            // InternalGX10.g:1672:4: (lv_leftEqual_3_0= ruleIntExpression )
            // InternalGX10.g:1673:5: lv_leftEqual_3_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getLeftEqualIntExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,51,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getEqualAccess().getRightEqualKeyword_4());
            		
            // InternalGX10.g:1694:3: ( (lv_rightEqual_5_0= ruleIntExpression ) )
            // InternalGX10.g:1695:4: (lv_rightEqual_5_0= ruleIntExpression )
            {
            // InternalGX10.g:1695:4: (lv_rightEqual_5_0= ruleIntExpression )
            // InternalGX10.g:1696:5: lv_rightEqual_5_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getRightEqualIntExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalGX10.g:1721:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGX10.g:1721:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGX10.g:1722:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalGX10.g:1728:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGX10.g:1734:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGX10.g:1735:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGX10.g:1735:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGX10.g:1736:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGX10.g:1736:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==52) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGX10.g:1737:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_32); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0002AAA94BA2E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002AAA94BA2A000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200140000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});

}