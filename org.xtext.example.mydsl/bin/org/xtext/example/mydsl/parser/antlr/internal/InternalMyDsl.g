/*
 * generated by Xtext 2.25.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getCommandsCommandParserRuleCall_0());
			}
			lv_commands_0_0=ruleCommand
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"commands",
					lv_commands_0_0,
					"org.xtext.example.mydsl.MyDsl.Command");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_STRING
			{
				newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTypeRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCommandAccess().getCreateParserRuleCall_0());
		}
		this_Create_0=ruleCreate
		{
			$current = $this_Create_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getLoadParserRuleCall_1());
		}
		this_Load_1=ruleLoad
		{
			$current = $this_Load_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getPrintParserRuleCall_2());
		}
		this_Print_2=rulePrint
		{
			$current = $this_Print_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getHeadParserRuleCall_3());
		}
		this_Head_3=ruleHead
		{
			$current = $this_Head_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getInsertColumnParserRuleCall_4());
		}
		this_InsertColumn_4=ruleInsertColumn
		{
			$current = $this_InsertColumn_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCommandAccess().getToCSVParserRuleCall_5());
		}
		this_ToCSV_5=ruleToCSV
		{
			$current = $this_ToCSV_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleContent
entryRuleContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContentRule()); }
	iv_ruleContent=ruleContent
	{ $current=$iv_ruleContent.current; }
	EOF;

// Rule Content
ruleContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getContentAccess().getContentAction_0(),
					$current);
			}
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getContentAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				lv_fields_2_0=RULE_STRING
				{
					newLeafNode(lv_fields_2_0, grammarAccess.getContentAccess().getFieldsSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContentRule());
					}
					addWithLastConsumed(
						$current,
						"fields",
						lv_fields_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)*
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getContentAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleCreate
entryRuleCreate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreateRule()); }
	iv_ruleCreate=ruleCreate
	{ $current=$iv_ruleCreate.current; }
	EOF;

// Rule Create
ruleCreate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CREATE'
		{
			newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getCREATEKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCreateAccess().getPathTypeParserRuleCall_1_0());
				}
				lv_path_1_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateRule());
					}
					set(
						$current,
						"path",
						lv_path_1_0,
						"org.xtext.example.mydsl.MyDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getCreateAccess().getColonKeyword_2());
		}
		otherlv_3='['
		{
			newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_3());
		}
		(
			(
				lv_columns_4_0=RULE_STRING
				{
					newLeafNode(lv_columns_4_0, grammarAccess.getCreateAccess().getColumnsSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCreateRule());
					}
					addWithLastConsumed(
						$current,
						"columns",
						lv_columns_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)*
		otherlv_5=']'
		{
			newLeafNode(otherlv_5, grammarAccess.getCreateAccess().getRightSquareBracketKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getCreateAccess().getColonKeyword_6());
		}
		otherlv_7='['
		{
			newLeafNode(otherlv_7, grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCreateAccess().getContentContentParserRuleCall_8_0());
				}
				lv_content_8_0=ruleContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateRule());
					}
					add(
						$current,
						"content",
						lv_content_8_0,
						"org.xtext.example.mydsl.MyDsl.Content");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9=']'
		{
			newLeafNode(otherlv_9, grammarAccess.getCreateAccess().getRightSquareBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleLoad
entryRuleLoad returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoadRule()); }
	iv_ruleLoad=ruleLoad
	{ $current=$iv_ruleLoad.current; }
	EOF;

// Rule Load
ruleLoad returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='LOAD'
		{
			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLOADKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLoadAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLoadRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoadAccess().getPathTypeParserRuleCall_3_0());
				}
				lv_path_3_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoadRule());
					}
					set(
						$current,
						"path",
						lv_path_3_0,
						"org.xtext.example.mydsl.MyDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePrint
entryRulePrint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrintRule()); }
	iv_rulePrint=rulePrint
	{ $current=$iv_rulePrint.current; }
	EOF;

// Rule Print
rulePrint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='PRINT'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPRINTKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPrintAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrintRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleHead
entryRuleHead returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeadRule()); }
	iv_ruleHead=ruleHead
	{ $current=$iv_ruleHead.current; }
	EOF;

// Rule Head
ruleHead returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='HEAD'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeadAccess().getHEADKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getHeadAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHeadRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleInsertColumn
entryRuleInsertColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInsertColumnRule()); }
	iv_ruleInsertColumn=ruleInsertColumn
	{ $current=$iv_ruleInsertColumn.current; }
	EOF;

// Rule InsertColumn
ruleInsertColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='INSERT'
		{
			newLeafNode(otherlv_0, grammarAccess.getInsertColumnAccess().getINSERTKeyword_0());
		}
		otherlv_1='COLUMN'
		{
			newLeafNode(otherlv_1, grammarAccess.getInsertColumnAccess().getCOLUMNKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getInsertColumnAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInsertColumnRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_column_3_0=RULE_STRING
				{
					newLeafNode(lv_column_3_0, grammarAccess.getInsertColumnAccess().getColumnSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInsertColumnRule());
					}
					setWithLastConsumed(
						$current,
						"column",
						lv_column_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleToCSV
entryRuleToCSV returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getToCSVRule()); }
	iv_ruleToCSV=ruleToCSV
	{ $current=$iv_ruleToCSV.current; }
	EOF;

// Rule ToCSV
ruleToCSV returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TO'
		{
			newLeafNode(otherlv_0, grammarAccess.getToCSVAccess().getTOKeyword_0());
		}
		otherlv_1='CSV'
		{
			newLeafNode(otherlv_1, grammarAccess.getToCSVAccess().getCSVKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getToCSVAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getToCSVRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_path_3_0=RULE_STRING
				{
					newLeafNode(lv_path_3_0, grammarAccess.getToCSVAccess().getPathSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getToCSVRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
