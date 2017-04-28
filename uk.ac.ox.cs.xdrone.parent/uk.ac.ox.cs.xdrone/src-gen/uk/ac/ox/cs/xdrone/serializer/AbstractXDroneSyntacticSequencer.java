/*
 * generated by Xtext 2.10.0
 */
package uk.ac.ox.cs.xdrone.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import uk.ac.ox.cs.xdrone.services.XDroneGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractXDroneSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XDroneGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Command_LandParserRuleCall_1_1_or_TakeoffParserRuleCall_0_1;
	protected AbstractElementAlias match_Main_SemicolonKeyword_3_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XDroneGrammarAccess) access;
		match_Command_LandParserRuleCall_1_1_or_TakeoffParserRuleCall_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCommandAccess().getLandParserRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getTakeoffParserRuleCall_0_1()));
		match_Main_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getMainAccess().getSemicolonKeyword_3_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getLandRule())
			return getLandToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTakeoffRule())
			return getTakeoffToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Land : 'LAND';
	 */
	protected String getLandToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "LAND";
	}
	
	/**
	 * Takeoff: 'TAKEOFF';
	 */
	protected String getTakeoffToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "TAKEOFF";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Command_LandParserRuleCall_1_1_or_TakeoffParserRuleCall_0_1.equals(syntax))
				emit_Command_LandParserRuleCall_1_1_or_TakeoffParserRuleCall_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Main_SemicolonKeyword_3_1_q.equals(syntax))
				emit_Main_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     Takeoff | Land
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Command_LandParserRuleCall_1_1_or_TakeoffParserRuleCall_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     commands+=Command (ambiguity) 'end' (rule end)
	 *     commands+=Command (ambiguity) commands+=Command
	 */
	protected void emit_Main_SemicolonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
