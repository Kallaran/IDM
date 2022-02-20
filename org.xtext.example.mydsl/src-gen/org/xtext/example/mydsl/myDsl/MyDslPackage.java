/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMMANDS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CommandImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__PATH = 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CreateImpl <em>Create</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CreateImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCreate()
   * @generated
   */
  int CREATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE__NAME = COMMAND__NAME;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE__PATH = COMMAND__PATH;

  /**
   * The number of structural features of the '<em>Create</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LoadImpl <em>Load</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LoadImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLoad()
   * @generated
   */
  int LOAD = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__NAME = COMMAND__NAME;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__PATH = COMMAND__PATH;

  /**
   * The number of structural features of the '<em>Load</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PrintImpl <em>Print</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PrintImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrint()
   * @generated
   */
  int PRINT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT__NAME = COMMAND__NAME;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT__PATH = COMMAND__PATH;

  /**
   * The number of structural features of the '<em>Print</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PathImpl <em>Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PathImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPath()
   * @generated
   */
  int PATH = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH__NAME = 0;

  /**
   * The number of structural features of the '<em>Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getCommands()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Commands();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.example.mydsl.myDsl.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Command#getName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Command#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.xtext.example.mydsl.myDsl.Command#getPath()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Path();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Create <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create</em>'.
   * @see org.xtext.example.mydsl.myDsl.Create
   * @generated
   */
  EClass getCreate();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Load <em>Load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load</em>'.
   * @see org.xtext.example.mydsl.myDsl.Load
   * @generated
   */
  EClass getLoad();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Print <em>Print</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print</em>'.
   * @see org.xtext.example.mydsl.myDsl.Print
   * @generated
   */
  EClass getPrint();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path</em>'.
   * @see org.xtext.example.mydsl.myDsl.Path
   * @generated
   */
  EClass getPath();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Path#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Path#getName()
   * @see #getPath()
   * @generated
   */
  EAttribute getPath_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMMANDS = eINSTANCE.getModel_Commands();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CommandImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__PATH = eINSTANCE.getCommand_Path();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CreateImpl <em>Create</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CreateImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCreate()
     * @generated
     */
    EClass CREATE = eINSTANCE.getCreate();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LoadImpl <em>Load</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LoadImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLoad()
     * @generated
     */
    EClass LOAD = eINSTANCE.getLoad();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PrintImpl <em>Print</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PrintImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPrint()
     * @generated
     */
    EClass PRINT = eINSTANCE.getPrint();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PathImpl <em>Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PathImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPath()
     * @generated
     */
    EClass PATH = eINSTANCE.getPath();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH__NAME = eINSTANCE.getPath_Name();

  }

} //MyDslPackage
