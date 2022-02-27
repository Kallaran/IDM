/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Assignment cCommandsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCommandsCommandParserRuleCall_0 = (RuleCall)cCommandsAssignment.eContents().get(0);
		
		//Model:
		//    commands+=Command*;
		@Override public ParserRule getRule() { return rule; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment() { return cCommandsAssignment; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_0() { return cCommandsCommandParserRuleCall_0; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Command");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCreateParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLoadParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPrintParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cHeadParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cInsertColumnParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cToCSVParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cDropColumnParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cDropRowParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cInsertRowParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cGetColumnParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cGetRowParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		
		//Command:
		//    Create | Load | Print | Head | InsertColumn | ToCSV | DropColumn | DropRow | InsertRow | GetColumn | GetRow;
		@Override public ParserRule getRule() { return rule; }
		
		//Create | Load | Print | Head | InsertColumn | ToCSV | DropColumn | DropRow | InsertRow | GetColumn | GetRow
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Create
		public RuleCall getCreateParserRuleCall_0() { return cCreateParserRuleCall_0; }
		
		//Load
		public RuleCall getLoadParserRuleCall_1() { return cLoadParserRuleCall_1; }
		
		//Print
		public RuleCall getPrintParserRuleCall_2() { return cPrintParserRuleCall_2; }
		
		//Head
		public RuleCall getHeadParserRuleCall_3() { return cHeadParserRuleCall_3; }
		
		//InsertColumn
		public RuleCall getInsertColumnParserRuleCall_4() { return cInsertColumnParserRuleCall_4; }
		
		//ToCSV
		public RuleCall getToCSVParserRuleCall_5() { return cToCSVParserRuleCall_5; }
		
		//DropColumn
		public RuleCall getDropColumnParserRuleCall_6() { return cDropColumnParserRuleCall_6; }
		
		//DropRow
		public RuleCall getDropRowParserRuleCall_7() { return cDropRowParserRuleCall_7; }
		
		//InsertRow
		public RuleCall getInsertRowParserRuleCall_8() { return cInsertRowParserRuleCall_8; }
		
		//GetColumn
		public RuleCall getGetColumnParserRuleCall_9() { return cGetColumnParserRuleCall_9; }
		
		//GetRow
		public RuleCall getGetRowParserRuleCall_10() { return cGetRowParserRuleCall_10; }
	}
	public class ContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Content");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cContentAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFieldsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFieldsSTRINGTerminalRuleCall_2_0 = (RuleCall)cFieldsAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Content:
		//    {Content} '['(fields+=STRING)* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//{Content} '['(fields+=STRING)* ']'
		public Group getGroup() { return cGroup; }
		
		//{Content}
		public Action getContentAction_0() { return cContentAction_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//(fields+=STRING)*
		public Assignment getFieldsAssignment_2() { return cFieldsAssignment_2; }
		
		//STRING
		public RuleCall getFieldsSTRINGTerminalRuleCall_2_0() { return cFieldsSTRINGTerminalRuleCall_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class CreateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Create");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCREATEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPathAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPathSTRINGTerminalRuleCall_1_0 = (RuleCall)cPathAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cColumnsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cColumnsSTRINGTerminalRuleCall_4_0 = (RuleCall)cColumnsAssignment_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cContentAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cContentContentParserRuleCall_8_0 = (RuleCall)cContentAssignment_8.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Create:
		//    'CREATE'  path=STRING ':' '['(columns+=STRING)* ']' ':' '['(content+=Content)* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'CREATE'  path=STRING ':' '['(columns+=STRING)* ']' ':' '['(content+=Content)* ']'
		public Group getGroup() { return cGroup; }
		
		//'CREATE'
		public Keyword getCREATEKeyword_0() { return cCREATEKeyword_0; }
		
		//path=STRING
		public Assignment getPathAssignment_1() { return cPathAssignment_1; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_1_0() { return cPathSTRINGTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }
		
		//(columns+=STRING)*
		public Assignment getColumnsAssignment_4() { return cColumnsAssignment_4; }
		
		//STRING
		public RuleCall getColumnsSTRINGTerminalRuleCall_4_0() { return cColumnsSTRINGTerminalRuleCall_4_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_5() { return cRightSquareBracketKeyword_5; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_7() { return cLeftSquareBracketKeyword_7; }
		
		//(content+=Content)*
		public Assignment getContentAssignment_8() { return cContentAssignment_8; }
		
		//Content
		public RuleCall getContentContentParserRuleCall_8_0() { return cContentContentParserRuleCall_8_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_9() { return cRightSquareBracketKeyword_9; }
	}
	public class LoadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Load");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLOADKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPathAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPathSTRINGTerminalRuleCall_3_0 = (RuleCall)cPathAssignment_3.eContents().get(0);
		
		//Load:
		//    'LOAD' name=ID '=' path=STRING ;
		@Override public ParserRule getRule() { return rule; }
		
		//'LOAD' name=ID '=' path=STRING
		public Group getGroup() { return cGroup; }
		
		//'LOAD'
		public Keyword getLOADKeyword_0() { return cLOADKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//path=STRING
		public Assignment getPathAssignment_3() { return cPathAssignment_3; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_3_0() { return cPathSTRINGTerminalRuleCall_3_0; }
	}
	public class PrintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Print");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPRINTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Print:
		//    'PRINT' name=STRING ;
		@Override public ParserRule getRule() { return rule; }
		
		//'PRINT' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'PRINT'
		public Keyword getPRINTKeyword_0() { return cPRINTKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	public class HeadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Head");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHEADKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Head:
		//    'HEAD' name=ID ;
		@Override public ParserRule getRule() { return rule; }
		
		//'HEAD' name=ID
		public Group getGroup() { return cGroup; }
		
		//'HEAD'
		public Keyword getHEADKeyword_0() { return cHEADKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class InsertColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.InsertColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cINSERTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCOLUMNKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cColumnAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cColumnSTRINGTerminalRuleCall_3_0 = (RuleCall)cColumnAssignment_3.eContents().get(0);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cContentAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cContentSTRINGTerminalRuleCall_5_0 = (RuleCall)cContentAssignment_5.eContents().get(0);
		
		//InsertColumn:
		//    'INSERT' 'COLUMN' name=ID column=STRING ':' (content+=STRING)+;
		@Override public ParserRule getRule() { return rule; }
		
		//'INSERT' 'COLUMN' name=ID column=STRING ':' (content+=STRING)+
		public Group getGroup() { return cGroup; }
		
		//'INSERT'
		public Keyword getINSERTKeyword_0() { return cINSERTKeyword_0; }
		
		//'COLUMN'
		public Keyword getCOLUMNKeyword_1() { return cCOLUMNKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//column=STRING
		public Assignment getColumnAssignment_3() { return cColumnAssignment_3; }
		
		//STRING
		public RuleCall getColumnSTRINGTerminalRuleCall_3_0() { return cColumnSTRINGTerminalRuleCall_3_0; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//(content+=STRING)+
		public Assignment getContentAssignment_5() { return cContentAssignment_5; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_5_0() { return cContentSTRINGTerminalRuleCall_5_0; }
	}
	public class ToCSVElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ToCSV");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTOKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCSVKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cPathAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPathSTRINGTerminalRuleCall_3_0 = (RuleCall)cPathAssignment_3.eContents().get(0);
		
		//ToCSV:
		//    'TO' 'CSV' name=ID path=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'TO' 'CSV' name=ID path=STRING
		public Group getGroup() { return cGroup; }
		
		//'TO'
		public Keyword getTOKeyword_0() { return cTOKeyword_0; }
		
		//'CSV'
		public Keyword getCSVKeyword_1() { return cCSVKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//path=STRING
		public Assignment getPathAssignment_3() { return cPathAssignment_3; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_3_0() { return cPathSTRINGTerminalRuleCall_3_0; }
	}
	public class DropColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.DropColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDROPKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCOLUMNKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cColumnsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cColumnsSTRINGTerminalRuleCall_3_0 = (RuleCall)cColumnsAssignment_3.eContents().get(0);
		
		//DropColumn:
		//    'DROP' 'COLUMN' name=ID (columns+=STRING)+;
		@Override public ParserRule getRule() { return rule; }
		
		//'DROP' 'COLUMN' name=ID (columns+=STRING)+
		public Group getGroup() { return cGroup; }
		
		//'DROP'
		public Keyword getDROPKeyword_0() { return cDROPKeyword_0; }
		
		//'COLUMN'
		public Keyword getCOLUMNKeyword_1() { return cCOLUMNKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//(columns+=STRING)+
		public Assignment getColumnsAssignment_3() { return cColumnsAssignment_3; }
		
		//STRING
		public RuleCall getColumnsSTRINGTerminalRuleCall_3_0() { return cColumnsSTRINGTerminalRuleCall_3_0; }
	}
	public class DropRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.DropRow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDROPKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cROWKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cRowsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRowsSTRINGTerminalRuleCall_3_0 = (RuleCall)cRowsAssignment_3.eContents().get(0);
		
		//DropRow:
		//    'DROP' 'ROW' name=ID (rows+=STRING)+;
		@Override public ParserRule getRule() { return rule; }
		
		//'DROP' 'ROW' name=ID (rows+=STRING)+
		public Group getGroup() { return cGroup; }
		
		//'DROP'
		public Keyword getDROPKeyword_0() { return cDROPKeyword_0; }
		
		//'ROW'
		public Keyword getROWKeyword_1() { return cROWKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//(rows+=STRING)+
		public Assignment getRowsAssignment_3() { return cRowsAssignment_3; }
		
		//STRING
		public RuleCall getRowsSTRINGTerminalRuleCall_3_0() { return cRowsSTRINGTerminalRuleCall_3_0; }
	}
	public class InsertRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.InsertRow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cINSERTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cROWKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cRowsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRowsSTRINGTerminalRuleCall_3_0 = (RuleCall)cRowsAssignment_3.eContents().get(0);
		
		//InsertRow:
		//    'INSERT' 'ROW' name=ID (rows+=STRING)+;
		@Override public ParserRule getRule() { return rule; }
		
		//'INSERT' 'ROW' name=ID (rows+=STRING)+
		public Group getGroup() { return cGroup; }
		
		//'INSERT'
		public Keyword getINSERTKeyword_0() { return cINSERTKeyword_0; }
		
		//'ROW'
		public Keyword getROWKeyword_1() { return cROWKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//(rows+=STRING)+
		public Assignment getRowsAssignment_3() { return cRowsAssignment_3; }
		
		//STRING
		public RuleCall getRowsSTRINGTerminalRuleCall_3_0() { return cRowsSTRINGTerminalRuleCall_3_0; }
	}
	public class GetColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.GetColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGETKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCOLUMNKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cColumnAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cColumnSTRINGTerminalRuleCall_3_0 = (RuleCall)cColumnAssignment_3.eContents().get(0);
		
		//GetColumn:
		//    'GET' 'COLUMN' name=ID column=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'GET' 'COLUMN' name=ID column=STRING
		public Group getGroup() { return cGroup; }
		
		//'GET'
		public Keyword getGETKeyword_0() { return cGETKeyword_0; }
		
		//'COLUMN'
		public Keyword getCOLUMNKeyword_1() { return cCOLUMNKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//column=STRING
		public Assignment getColumnAssignment_3() { return cColumnAssignment_3; }
		
		//STRING
		public RuleCall getColumnSTRINGTerminalRuleCall_3_0() { return cColumnSTRINGTerminalRuleCall_3_0; }
	}
	public class GetRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.GetRow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGETKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cROWKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cIndexAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIndexINTTerminalRuleCall_3_0 = (RuleCall)cIndexAssignment_3.eContents().get(0);
		
		//GetRow:
		//    'GET' 'ROW' name=ID index=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'GET' 'ROW' name=ID index=INT
		public Group getGroup() { return cGroup; }
		
		//'GET'
		public Keyword getGETKeyword_0() { return cGETKeyword_0; }
		
		//'ROW'
		public Keyword getROWKeyword_1() { return cROWKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//index=INT
		public Assignment getIndexAssignment_3() { return cIndexAssignment_3; }
		
		//INT
		public RuleCall getIndexINTTerminalRuleCall_3_0() { return cIndexINTTerminalRuleCall_3_0; }
	}
	
	
	private final ModelElements pModel;
	private final CommandElements pCommand;
	private final ContentElements pContent;
	private final CreateElements pCreate;
	private final LoadElements pLoad;
	private final PrintElements pPrint;
	private final HeadElements pHead;
	private final InsertColumnElements pInsertColumn;
	private final ToCSVElements pToCSV;
	private final DropColumnElements pDropColumn;
	private final DropRowElements pDropRow;
	private final InsertRowElements pInsertRow;
	private final GetColumnElements pGetColumn;
	private final GetRowElements pGetRow;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pCommand = new CommandElements();
		this.pContent = new ContentElements();
		this.pCreate = new CreateElements();
		this.pLoad = new LoadElements();
		this.pPrint = new PrintElements();
		this.pHead = new HeadElements();
		this.pInsertColumn = new InsertColumnElements();
		this.pToCSV = new ToCSVElements();
		this.pDropColumn = new DropColumnElements();
		this.pDropRow = new DropRowElements();
		this.pInsertRow = new InsertRowElements();
		this.pGetColumn = new GetColumnElements();
		this.pGetRow = new GetRowElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    commands+=Command*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Command:
	//    Create | Load | Print | Head | InsertColumn | ToCSV | DropColumn | DropRow | InsertRow | GetColumn | GetRow;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//Content:
	//    {Content} '['(fields+=STRING)* ']';
	public ContentElements getContentAccess() {
		return pContent;
	}
	
	public ParserRule getContentRule() {
		return getContentAccess().getRule();
	}
	
	//Create:
	//    'CREATE'  path=STRING ':' '['(columns+=STRING)* ']' ':' '['(content+=Content)* ']';
	public CreateElements getCreateAccess() {
		return pCreate;
	}
	
	public ParserRule getCreateRule() {
		return getCreateAccess().getRule();
	}
	
	//Load:
	//    'LOAD' name=ID '=' path=STRING ;
	public LoadElements getLoadAccess() {
		return pLoad;
	}
	
	public ParserRule getLoadRule() {
		return getLoadAccess().getRule();
	}
	
	//Print:
	//    'PRINT' name=STRING ;
	public PrintElements getPrintAccess() {
		return pPrint;
	}
	
	public ParserRule getPrintRule() {
		return getPrintAccess().getRule();
	}
	
	//Head:
	//    'HEAD' name=ID ;
	public HeadElements getHeadAccess() {
		return pHead;
	}
	
	public ParserRule getHeadRule() {
		return getHeadAccess().getRule();
	}
	
	//InsertColumn:
	//    'INSERT' 'COLUMN' name=ID column=STRING ':' (content+=STRING)+;
	public InsertColumnElements getInsertColumnAccess() {
		return pInsertColumn;
	}
	
	public ParserRule getInsertColumnRule() {
		return getInsertColumnAccess().getRule();
	}
	
	//ToCSV:
	//    'TO' 'CSV' name=ID path=STRING;
	public ToCSVElements getToCSVAccess() {
		return pToCSV;
	}
	
	public ParserRule getToCSVRule() {
		return getToCSVAccess().getRule();
	}
	
	//DropColumn:
	//    'DROP' 'COLUMN' name=ID (columns+=STRING)+;
	public DropColumnElements getDropColumnAccess() {
		return pDropColumn;
	}
	
	public ParserRule getDropColumnRule() {
		return getDropColumnAccess().getRule();
	}
	
	//DropRow:
	//    'DROP' 'ROW' name=ID (rows+=STRING)+;
	public DropRowElements getDropRowAccess() {
		return pDropRow;
	}
	
	public ParserRule getDropRowRule() {
		return getDropRowAccess().getRule();
	}
	
	//InsertRow:
	//    'INSERT' 'ROW' name=ID (rows+=STRING)+;
	public InsertRowElements getInsertRowAccess() {
		return pInsertRow;
	}
	
	public ParserRule getInsertRowRule() {
		return getInsertRowAccess().getRule();
	}
	
	//GetColumn:
	//    'GET' 'COLUMN' name=ID column=STRING;
	public GetColumnElements getGetColumnAccess() {
		return pGetColumn;
	}
	
	public ParserRule getGetColumnRule() {
		return getGetColumnAccess().getRule();
	}
	
	//GetRow:
	//    'GET' 'ROW' name=ID index=INT;
	public GetRowElements getGetRowAccess() {
		return pGetRow;
	}
	
	public ParserRule getGetRowRule() {
		return getGetRowAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
