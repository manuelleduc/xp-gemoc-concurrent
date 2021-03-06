/*
 * generated by Xtext 2.9.2
 */
package fr.mleduc.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.mleduc.ide.contentassist.antlr.internal.InternalGX10Parser;
import fr.mleduc.services.GX10GrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class GX10Parser extends AbstractContentAssistParser {

	@Inject
	private GX10GrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalGX10Parser createParser() {
		InternalGX10Parser result = new InternalGX10Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getBoolExpressionAccess().getAlternatives(), "rule__BoolExpression__Alternatives");
					put(grammarAccess.getIntBinaryOperationAccess().getAlternatives(), "rule__IntBinaryOperation__Alternatives");
					put(grammarAccess.getIntExpressionAccess().getAlternatives(), "rule__IntExpression__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_2(), "rule__Method__Group_2__0");
					put(grammarAccess.getMethodAccess().getGroup_2_1(), "rule__Method__Group_2_1__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getMethodCallAccess().getGroup(), "rule__MethodCall__Group__0");
					put(grammarAccess.getMethodCallAccess().getGroup_4(), "rule__MethodCall__Group_4__0");
					put(grammarAccess.getMethodCallAccess().getGroup_4_3(), "rule__MethodCall__Group_4_3__0");
					put(grammarAccess.getReferentiableAccess().getGroup(), "rule__Referentiable__Group__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getWhileAccess().getGroup(), "rule__While__Group__0");
					put(grammarAccess.getTrueAccess().getGroup(), "rule__True__Group__0");
					put(grammarAccess.getFalseAccess().getGroup(), "rule__False__Group__0");
					put(grammarAccess.getNotAccess().getGroup(), "rule__Not__Group__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getIntConstAccess().getGroup(), "rule__IntConst__Group__0");
					put(grammarAccess.getPlusAccess().getGroup(), "rule__Plus__Group__0");
					put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
					put(grammarAccess.getAsyncAccess().getGroup(), "rule__Async__Group__0");
					put(grammarAccess.getFinishAccess().getGroup(), "rule__Finish__Group__0");
					put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
					put(grammarAccess.getBoolVarAccess().getGroup(), "rule__BoolVar__Group__0");
					put(grammarAccess.getIntVarAccess().getGroup(), "rule__IntVar__Group__0");
					put(grammarAccess.getIntVarAccessAccess().getGroup(), "rule__IntVarAccess__Group__0");
					put(grammarAccess.getBoolVarAccessAccess().getGroup(), "rule__BoolVarAccess__Group__0");
					put(grammarAccess.getEqualAccess().getGroup(), "rule__Equal__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getMethodCallParameterAccess().getGroup(), "rule__MethodCallParameter__Group__0");
					put(grammarAccess.getProgramAccess().getStartMethodAssignment_1(), "rule__Program__StartMethodAssignment_1");
					put(grammarAccess.getProgramAccess().getMethodsAssignment_2(), "rule__Program__MethodsAssignment_2");
					put(grammarAccess.getMethodAccess().getNameAssignment_0(), "rule__Method__NameAssignment_0");
					put(grammarAccess.getMethodAccess().getMethodParametersAssignment_2_0(), "rule__Method__MethodParametersAssignment_2_0");
					put(grammarAccess.getMethodAccess().getMethodParametersAssignment_2_1_1(), "rule__Method__MethodParametersAssignment_2_1_1");
					put(grammarAccess.getMethodAccess().getMethodBlockAssignment_4(), "rule__Method__MethodBlockAssignment_4");
					put(grammarAccess.getBlockAccess().getBlockStatementsAssignment_2(), "rule__Block__BlockStatementsAssignment_2");
					put(grammarAccess.getMethodCallAccess().getMethodToCallAssignment_3(), "rule__MethodCall__MethodToCallAssignment_3");
					put(grammarAccess.getMethodCallAccess().getMethodCallParametersAssignment_4_2(), "rule__MethodCall__MethodCallParametersAssignment_4_2");
					put(grammarAccess.getMethodCallAccess().getMethodCallParametersAssignment_4_3_1(), "rule__MethodCall__MethodCallParametersAssignment_4_3_1");
					put(grammarAccess.getReferentiableAccess().getNameAssignment_1(), "rule__Referentiable__NameAssignment_1");
					put(grammarAccess.getIfAccess().getControlStructureConditionAssignment_3(), "rule__If__ControlStructureConditionAssignment_3");
					put(grammarAccess.getIfAccess().getThenBlockAssignment_5(), "rule__If__ThenBlockAssignment_5");
					put(grammarAccess.getIfAccess().getElseBlockAssignment_7(), "rule__If__ElseBlockAssignment_7");
					put(grammarAccess.getWhileAccess().getControlStructureConditionAssignment_3(), "rule__While__ControlStructureConditionAssignment_3");
					put(grammarAccess.getWhileAccess().getWhileBlockAssignment_5(), "rule__While__WhileBlockAssignment_5");
					put(grammarAccess.getNotAccess().getNotExpressionAssignment_3(), "rule__Not__NotExpressionAssignment_3");
					put(grammarAccess.getAndAccess().getLeftAndExpressionAssignment_3(), "rule__And__LeftAndExpressionAssignment_3");
					put(grammarAccess.getAndAccess().getRightAndExpressionAssignment_5(), "rule__And__RightAndExpressionAssignment_5");
					put(grammarAccess.getIntConstAccess().getValueAssignment_1(), "rule__IntConst__ValueAssignment_1");
					put(grammarAccess.getPlusAccess().getLeftBinaryExpressionAssignment_3(), "rule__Plus__LeftBinaryExpressionAssignment_3");
					put(grammarAccess.getPlusAccess().getRightBinaryExpressionAssignment_5(), "rule__Plus__RightBinaryExpressionAssignment_5");
					put(grammarAccess.getTimeAccess().getLeftBinaryExpressionAssignment_3(), "rule__Time__LeftBinaryExpressionAssignment_3");
					put(grammarAccess.getTimeAccess().getRightBinaryExpressionAssignment_5(), "rule__Time__RightBinaryExpressionAssignment_5");
					put(grammarAccess.getAsyncAccess().getAsyncBlockAssignment_3(), "rule__Async__AsyncBlockAssignment_3");
					put(grammarAccess.getFinishAccess().getFinishStatementAssignment_3(), "rule__Finish__FinishStatementAssignment_3");
					put(grammarAccess.getPrintAccess().getToPrintAssignment_2(), "rule__Print__ToPrintAssignment_2");
					put(grammarAccess.getBoolVarAccess().getBoolVarExprAssignment_3(), "rule__BoolVar__BoolVarExprAssignment_3");
					put(grammarAccess.getBoolVarAccess().getBoolVarNameAssignment_5(), "rule__BoolVar__BoolVarNameAssignment_5");
					put(grammarAccess.getIntVarAccess().getIntVarNameAssignment_1(), "rule__IntVar__IntVarNameAssignment_1");
					put(grammarAccess.getIntVarAccess().getIntVarExprAssignment_3(), "rule__IntVar__IntVarExprAssignment_3");
					put(grammarAccess.getIntVarAccessAccess().getIntVarRefAssignment_1(), "rule__IntVarAccess__IntVarRefAssignment_1");
					put(grammarAccess.getBoolVarAccessAccess().getBoolVarRefAssignment_1(), "rule__BoolVarAccess__BoolVarRefAssignment_1");
					put(grammarAccess.getEqualAccess().getLeftEqualAssignment_3(), "rule__Equal__LeftEqualAssignment_3");
					put(grammarAccess.getEqualAccess().getRightEqualAssignment_5(), "rule__Equal__RightEqualAssignment_5");
					put(grammarAccess.getMethodCallParameterAccess().getNameAssignment_1(), "rule__MethodCallParameter__NameAssignment_1");
					put(grammarAccess.getMethodCallParameterAccess().getMethodCallParameterExprAssignment_4(), "rule__MethodCallParameter__MethodCallParameterExprAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalGX10Parser typedParser = (InternalGX10Parser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GX10GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GX10GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
