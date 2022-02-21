/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getContentAccess().getGroup(), "rule__Content__Group__0");
			builder.put(grammarAccess.getCreateAccess().getGroup(), "rule__Create__Group__0");
			builder.put(grammarAccess.getLoadAccess().getGroup(), "rule__Load__Group__0");
			builder.put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
			builder.put(grammarAccess.getHeadAccess().getGroup(), "rule__Head__Group__0");
			builder.put(grammarAccess.getInsertColumnAccess().getGroup(), "rule__InsertColumn__Group__0");
			builder.put(grammarAccess.getToCSVAccess().getGroup(), "rule__ToCSV__Group__0");
			builder.put(grammarAccess.getModelAccess().getCommandsAssignment(), "rule__Model__CommandsAssignment");
			builder.put(grammarAccess.getContentAccess().getFieldsAssignment_2(), "rule__Content__FieldsAssignment_2");
			builder.put(grammarAccess.getCreateAccess().getPathAssignment_1(), "rule__Create__PathAssignment_1");
			builder.put(grammarAccess.getCreateAccess().getColumnsAssignment_4(), "rule__Create__ColumnsAssignment_4");
			builder.put(grammarAccess.getCreateAccess().getContentAssignment_8(), "rule__Create__ContentAssignment_8");
			builder.put(grammarAccess.getLoadAccess().getNameAssignment_1(), "rule__Load__NameAssignment_1");
			builder.put(grammarAccess.getLoadAccess().getPathAssignment_3(), "rule__Load__PathAssignment_3");
			builder.put(grammarAccess.getPrintAccess().getNameAssignment_1(), "rule__Print__NameAssignment_1");
			builder.put(grammarAccess.getHeadAccess().getNameAssignment_1(), "rule__Head__NameAssignment_1");
			builder.put(grammarAccess.getInsertColumnAccess().getNameAssignment_2(), "rule__InsertColumn__NameAssignment_2");
			builder.put(grammarAccess.getInsertColumnAccess().getColumnAssignment_3(), "rule__InsertColumn__ColumnAssignment_3");
			builder.put(grammarAccess.getToCSVAccess().getNameAssignment_2(), "rule__ToCSV__NameAssignment_2");
			builder.put(grammarAccess.getToCSVAccess().getPathAssignment_3(), "rule__ToCSV__PathAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
