/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Create#getPath <em>Path</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Create#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Create#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends Command
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreate_Path()
   * @model containment="true"
   * @generated
   */
  Type getPath();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Create#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(Type value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreate_Columns()
   * @model unique="false"
   * @generated
   */
  EList<String> getColumns();

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Content}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCreate_Content()
   * @model containment="true"
   * @generated
   */
  EList<Content> getContent();

} // Create
