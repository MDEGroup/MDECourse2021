/**
 */
package it.disim.univaq.demo.webapplication;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.disim.univaq.demo.webapplication.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webapplication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.disim.univaq.demo/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webapplication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = it.disim.univaq.demo.webapplication.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.disim.univaq.demo.webapplication.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.demo.webapplication.impl.NamedImpl
	 * @see it.disim.univaq.demo.webapplication.impl.ModelPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.demo.webapplication.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.demo.webapplication.impl.ApplicationImpl
	 * @see it.disim.univaq.demo.webapplication.impl.ModelPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Enitities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ENITITIES = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.demo.webapplication.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.demo.webapplication.impl.EntityImpl
	 * @see it.disim.univaq.demo.webapplication.impl.ModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PROPERTIES = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.demo.webapplication.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.demo.webapplication.impl.PropertyImpl
	 * @see it.disim.univaq.demo.webapplication.impl.ModelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Is PK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_PK = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.disim.univaq.demo.webapplication.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.disim.univaq.demo.webapplication.impl.ReferenceImpl
	 * @see it.disim.univaq.demo.webapplication.impl.ModelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Is PK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IS_PK = PROPERTY__IS_PK;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REF = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.demo.webapplication.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see it.disim.univaq.demo.webapplication.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.demo.webapplication.Application#getEnitities <em>Enitities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enitities</em>'.
	 * @see it.disim.univaq.demo.webapplication.Application#getEnitities()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Enitities();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.demo.webapplication.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see it.disim.univaq.demo.webapplication.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.demo.webapplication.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.disim.univaq.demo.webapplication.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.demo.webapplication.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see it.disim.univaq.demo.webapplication.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link it.disim.univaq.demo.webapplication.Entity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see it.disim.univaq.demo.webapplication.Entity#getProperties()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Properties();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.demo.webapplication.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see it.disim.univaq.demo.webapplication.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link it.disim.univaq.demo.webapplication.Property#isIsPK <em>Is PK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is PK</em>'.
	 * @see it.disim.univaq.demo.webapplication.Property#isIsPK()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsPK();

	/**
	 * Returns the meta object for class '{@link it.disim.univaq.demo.webapplication.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see it.disim.univaq.demo.webapplication.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link it.disim.univaq.demo.webapplication.Reference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see it.disim.univaq.demo.webapplication.Reference#getRef()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Ref();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.disim.univaq.demo.webapplication.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.demo.webapplication.impl.ApplicationImpl
		 * @see it.disim.univaq.demo.webapplication.impl.ModelPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Enitities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ENITITIES = eINSTANCE.getApplication_Enitities();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.demo.webapplication.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.demo.webapplication.impl.NamedImpl
		 * @see it.disim.univaq.demo.webapplication.impl.ModelPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.demo.webapplication.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.demo.webapplication.impl.EntityImpl
		 * @see it.disim.univaq.demo.webapplication.impl.ModelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.demo.webapplication.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.demo.webapplication.impl.PropertyImpl
		 * @see it.disim.univaq.demo.webapplication.impl.ModelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Is PK</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_PK = eINSTANCE.getProperty_IsPK();

		/**
		 * The meta object literal for the '{@link it.disim.univaq.demo.webapplication.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.disim.univaq.demo.webapplication.impl.ReferenceImpl
		 * @see it.disim.univaq.demo.webapplication.impl.ModelPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__REF = eINSTANCE.getReference_Ref();

	}

} //ModelPackage
