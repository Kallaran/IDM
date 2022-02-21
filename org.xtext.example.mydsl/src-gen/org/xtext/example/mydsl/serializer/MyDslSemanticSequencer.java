/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Content;
import org.xtext.example.mydsl.myDsl.Create;
import org.xtext.example.mydsl.myDsl.Head;
import org.xtext.example.mydsl.myDsl.InsertColumn;
import org.xtext.example.mydsl.myDsl.Load;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Print;
import org.xtext.example.mydsl.myDsl.ToCSV;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.CONTENT:
				sequence_Content(context, (Content) semanticObject); 
				return; 
			case MyDslPackage.CREATE:
				sequence_Create(context, (Create) semanticObject); 
				return; 
			case MyDslPackage.HEAD:
				sequence_Head(context, (Head) semanticObject); 
				return; 
			case MyDslPackage.INSERT_COLUMN:
				sequence_InsertColumn(context, (InsertColumn) semanticObject); 
				return; 
			case MyDslPackage.LOAD:
				sequence_Load(context, (Load) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.PRINT:
				sequence_Print(context, (Print) semanticObject); 
				return; 
			case MyDslPackage.TO_CSV:
				sequence_ToCSV(context, (ToCSV) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Content returns Content
	 *
	 * Constraint:
	 *     fields+=STRING*
	 */
	protected void sequence_Content(ISerializationContext context, Content semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Create
	 *     Create returns Create
	 *
	 * Constraint:
	 *     (path=STRING columns+=STRING* content+=Content*)
	 */
	protected void sequence_Create(ISerializationContext context, Create semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Head
	 *     Head returns Head
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Head(ISerializationContext context, Head semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.HEAD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.HEAD__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHeadAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns InsertColumn
	 *     InsertColumn returns InsertColumn
	 *
	 * Constraint:
	 *     (name=ID column=STRING)
	 */
	protected void sequence_InsertColumn(ISerializationContext context, InsertColumn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INSERT_COLUMN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INSERT_COLUMN__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INSERT_COLUMN__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INSERT_COLUMN__COLUMN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInsertColumnAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInsertColumnAccess().getColumnSTRINGTerminalRuleCall_3_0(), semanticObject.getColumn());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Load
	 *     Load returns Load
	 *
	 * Constraint:
	 *     (name=ID path=STRING)
	 */
	protected void sequence_Load(ISerializationContext context, Load semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LOAD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LOAD__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LOAD__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LOAD__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLoadAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLoadAccess().getPathSTRINGTerminalRuleCall_3_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     commands+=Command+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Print
	 *     Print returns Print
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Print(ISerializationContext context, Print semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PRINT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PRINT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrintAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns ToCSV
	 *     ToCSV returns ToCSV
	 *
	 * Constraint:
	 *     (name=ID path=STRING)
	 */
	protected void sequence_ToCSV(ISerializationContext context, ToCSV semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TO_CSV__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TO_CSV__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TO_CSV__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TO_CSV__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getToCSVAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getToCSVAccess().getPathSTRINGTerminalRuleCall_3_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
}
