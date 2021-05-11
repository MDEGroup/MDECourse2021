/**
 */
package it.disim.univaq.demo.webapplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.disim.univaq.demo.webapplication.Application#getEnitities <em>Enitities</em>}</li>
 * </ul>
 *
 * @see it.disim.univaq.demo.webapplication.ModelPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Named {
	/**
	 * Returns the value of the '<em><b>Enitities</b></em>' containment reference list.
	 * The list contents are of type {@link it.disim.univaq.demo.webapplication.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enitities</em>' containment reference list.
	 * @see it.disim.univaq.demo.webapplication.ModelPackage#getApplication_Enitities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEnitities();

} // Application
