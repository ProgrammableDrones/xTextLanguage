/*
 * generated by Xtext 2.10.0
 */
package uk.ac.ox.cs.xdrone.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import uk.ac.ox.cs.xdrone.ide.contentassist.antlr.internal.InternalXDroneParser;
import uk.ac.ox.cs.xdrone.services.XDroneGrammarAccess;

public class XDroneParser extends AbstractContentAssistParser {

	@Inject
	private XDroneGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalXDroneParser createParser() {
		InternalXDroneParser result = new InternalXDroneParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
					put(grammarAccess.getMainAccess().getGroup_3(), "rule__Main__Group_3__0");
					put(grammarAccess.getCommandAccess().getGroup_0(), "rule__Command__Group_0__0");
					put(grammarAccess.getCommandAccess().getGroup_1(), "rule__Command__Group_1__0");
					put(grammarAccess.getUpAccess().getGroup(), "rule__Up__Group__0");
					put(grammarAccess.getDownAccess().getGroup(), "rule__Down__Group__0");
					put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
					put(grammarAccess.getRightAccess().getGroup(), "rule__Right__Group__0");
					put(grammarAccess.getForwardAccess().getGroup(), "rule__Forward__Group__0");
					put(grammarAccess.getBackwardAccess().getGroup(), "rule__Backward__Group__0");
					put(grammarAccess.getRotateLAccess().getGroup(), "rule__RotateL__Group__0");
					put(grammarAccess.getRotateRAccess().getGroup(), "rule__RotateR__Group__0");
					put(grammarAccess.getProgramAccess().getMainAssignment(), "rule__Program__MainAssignment");
					put(grammarAccess.getMainAccess().getNameAssignment_1(), "rule__Main__NameAssignment_1");
					put(grammarAccess.getMainAccess().getCommandsAssignment_3_0(), "rule__Main__CommandsAssignment_3_0");
					put(grammarAccess.getUpAccess().getMillisecondsAssignment_2(), "rule__Up__MillisecondsAssignment_2");
					put(grammarAccess.getDownAccess().getMillisecondsAssignment_2(), "rule__Down__MillisecondsAssignment_2");
					put(grammarAccess.getLeftAccess().getMillisecondsAssignment_2(), "rule__Left__MillisecondsAssignment_2");
					put(grammarAccess.getRightAccess().getMillisecondsAssignment_2(), "rule__Right__MillisecondsAssignment_2");
					put(grammarAccess.getForwardAccess().getMillisecondsAssignment_2(), "rule__Forward__MillisecondsAssignment_2");
					put(grammarAccess.getBackwardAccess().getMillisecondsAssignment_2(), "rule__Backward__MillisecondsAssignment_2");
					put(grammarAccess.getRotateLAccess().getMillisecondsAssignment_2(), "rule__RotateL__MillisecondsAssignment_2");
					put(grammarAccess.getRotateRAccess().getMillisecondsAssignment_2(), "rule__RotateR__MillisecondsAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalXDroneParser typedParser = (InternalXDroneParser) parser;
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

	public XDroneGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XDroneGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
