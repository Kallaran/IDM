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

// Entry rule entryRulePath
entryRulePath returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPathRule()); }
	iv_rulePath=rulePath
	{ $current=$iv_rulePath.current; }
	EOF;

// Rule Path
rulePath returns [EObject current=null]
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
				newLeafNode(lv_name_0_0, grammarAccess.getPathAccess().getNameSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPathRule());
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

// Entry rule entryRuleArray
entryRuleArray returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayRule()); }
	iv_ruleArray=ruleArray
	{ $current=$iv_ruleArray.current; }
	EOF;

// Rule Array
ruleArray returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_elements_0_0=RULE_STRING
			{
				newLeafNode(lv_elements_0_0, grammarAccess.getArrayAccess().getElementsSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getArrayRule());
				}
				addWithLastConsumed(
					$current,
					"elements",
					lv_elements_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)*
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
					newCompositeNode(grammarAccess.getCreateAccess().getPathPathParserRuleCall_1_0());
				}
				lv_path_1_0=rulePath
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateRule());
					}
					set(
						$current,
						"path",
						lv_path_1_0,
						"org.xtext.example.mydsl.MyDsl.Path");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getCreateAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCreateAccess().getColumsArrayParserRuleCall_3_0());
				}
				lv_colums_3_0=ruleArray
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateRule());
					}
					set(
						$current,
						"colums",
						lv_colums_3_0,
						"org.xtext.example.mydsl.MyDsl.Array");
					afterParserOrEnumRuleCall();
				}
			)
		)
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
					newCompositeNode(grammarAccess.getLoadAccess().getPathPathParserRuleCall_3_0());
				}
				lv_path_3_0=rulePath
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoadRule());
					}
					set(
						$current,
						"path",
						lv_path_3_0,
						"org.xtext.example.mydsl.MyDsl.Path");
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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
