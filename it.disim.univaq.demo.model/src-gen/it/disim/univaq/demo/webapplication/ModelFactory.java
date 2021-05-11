/**
 */
package it.disim.univaq.demo.webapplication;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.disim.univaq.demo.webapplication.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = it.disim.univaq.demo.webapplication.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named</em>'.
	 * @generated
	 */
	Named createNamed();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
