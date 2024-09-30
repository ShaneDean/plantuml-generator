package de.elnarion.util.plantuml.generator.classdiagram.config;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class PlantUMLConfig.
 */
public class PlantUMLClassDiagramConfig {

	/** The field classifier to ignore. */
	private final List<ClassifierType> fieldClassifierToIgnore = new ArrayList<>();
	/** The method classifier to ignore. */
	private final List<ClassifierType> methodClassifierToIgnore = new ArrayList<>();
	/** The additional plant uml configs. */
	private final List<String> additionalPlantUmlConfigs = new ArrayList<>();
	/** The use plantuml smetana renderer in favor of GraphViz. */
	private boolean useSmetana = false;
	/** The destination classloader. */
	private ClassLoader destinationClassloader = this.getClass().getClassLoader();
	/** The scan packages. */
	private List<String> scanPackages = new ArrayList<>();
	/** The blacklist regexp. */
	private String blacklistRegexp = null;
	/** The whitelist regexp. */
	private String whitelistRegexp = null;
	/** The hide classes. */
	private List<String> hideClasses = null;
	/** The hide fields. */
	private boolean hideFields = false;
	/** The hide methods. */
	private boolean hideMethods = false;
	/** The remove fields. */
	private boolean removeFields = false;
	/** The remove methods. */
	private boolean removeMethods = false;
	/** The add JPA annotations. */
	private boolean addJPAAnnotations = false;
	/** The add Validation annotations. */
	private boolean addValidationAnnotations = false;
	/** The field blacklist regexp. */
	private String fieldBlacklistRegexp = null;
	/** The method blacklist regexp. */
	private String methodBlacklistRegexp = null;
	/** The max visibility fields. */
	private VisibilityType maxVisibilityFields = VisibilityType.PRIVATE;
	/** The max visibility methods. */
	private VisibilityType maxVisibilityMethods = VisibilityType.PRIVATE;
	/** use short class names in fields and methods in the diagram. */
	private boolean useShortClassNamesInFieldsAndMethods = false;

	/** The use short class names. */
	private boolean useShortClassNames = false;

	/**
	 * Instantiates a new plant UML config.
	 */
	protected PlantUMLClassDiagramConfig() {
		// default constructor with protected visibility because of corresponding
		// builder
	}

	/**
	 * Gets the method classifier to ignore.
	 *
	 * @return the method classifier to ignore
	 */
	public List<ClassifierType> getMethodClassifierToIgnore() {
		return methodClassifierToIgnore;
	}

	/**
	 * Gets the field classifier to ignore.
	 *
	 * @return the field classifier to ignore
	 */
	public List<ClassifierType> getFieldClassifierToIgnore() {
		return fieldClassifierToIgnore;
	}

	/**
	 * Gets the destination classloader.
	 *
	 * @return ClassLoader
	 */
	public ClassLoader getDestinationClassloader() {
		return destinationClassloader;
	}

	/**
	 * @param destinationClassloader the new destination classloader
	 */
	protected void setDestinationClassloader(ClassLoader destinationClassloader) {
		this.destinationClassloader = destinationClassloader;
	}

	/**
	 * @return List
	 */
	public List<String> getScanPackages() {
		return scanPackages;
	}

	/**
	 * @param scanPackages the new scan packages
	 */
	protected void setScanPackages(List<String> scanPackages) {
		this.scanPackages = scanPackages;
	}

	/**
	 * @return String
	 */
	public String getBlacklistRegexp() {
		return blacklistRegexp;
	}

	/**
	 * @param blacklistRegexp the new blacklist regexp
	 */
	protected void setBlacklistRegexp(String blacklistRegexp) {
		this.blacklistRegexp = blacklistRegexp;
	}

	/**
	 * @return String
	 */
	public String getWhitelistRegexp() {
		return whitelistRegexp;
	}

	/**
	 * @param whitelistRegexp the new whitelist regexp
	 */
	protected void setWhitelistRegexp(String whitelistRegexp) {
		this.whitelistRegexp = whitelistRegexp;
	}

	/**
	 * @return List
	 */
	public List<String> getHideClasses() {
		return hideClasses;
	}

	/**
	 * @param hideClasses the new hide classes
	 */
	protected void setHideClasses(List<String> hideClasses) {
		this.hideClasses = hideClasses;
	}

	/**
	 * @return boolean
	 */
	public boolean isHideFields() {
		return hideFields;
	}

	/**
	 * @param hideFields the new hide fields
	 */
	protected void setHideFields(boolean hideFields) {
		this.hideFields = hideFields;
	}

	/**
	 * @return boolean
	 */
	public boolean isHideMethods() {
		return hideMethods;
	}

	/**
	 * @param hideMethods the new hide methods
	 */
	protected void setHideMethods(boolean hideMethods) {
		this.hideMethods = hideMethods;
	}

	/**
	 * @return boolean
	 */
	public boolean isRemoveFields() {
		return removeFields;
	}

	/**
	 * @param removeFields the new removes the fields
	 */
	protected void setRemoveFields(boolean removeFields) {
		this.removeFields = removeFields;
	}

	/**
	 * @return boolean
	 */
	public boolean isRemoveMethods() {
		return removeMethods;
	}

	/**
	 * @param removeMethods the new removes the methods
	 */
	protected void setRemoveMethods(boolean removeMethods) {
		this.removeMethods = removeMethods;
	}

	/**
	 * @return String
	 */
	public String getFieldBlacklistRegexp() {
		return fieldBlacklistRegexp;
	}

	/**
	 * @param fieldBlacklistRegexp the new field blacklist regexp
	 */
	protected void setFieldBlacklistRegexp(String fieldBlacklistRegexp) {
		this.fieldBlacklistRegexp = fieldBlacklistRegexp;
	}

	/**
	 * @return String
	 */
	public String getMethodBlacklistRegexp() {
		return methodBlacklistRegexp;
	}

	/**
	 * @param methodBlacklistRegexp the new method blacklist regexp
	 */
	protected void setMethodBlacklistRegexp(String methodBlacklistRegexp) {
		this.methodBlacklistRegexp = methodBlacklistRegexp;
	}

	/**
	 * @return VisibilityType
	 */
	public VisibilityType getMaxVisibilityFields() {
		return maxVisibilityFields;
	}

	/**
	 * @param maxVisibilityFields the new max visibility fields
	 */
	public void setMaxVisibilityFields(VisibilityType maxVisibilityFields) {
		this.maxVisibilityFields = maxVisibilityFields;
	}

	/**
	 * @return VisibilityType
	 */
	public VisibilityType getMaxVisibilityMethods() {
		return maxVisibilityMethods;
	}

	/**
	 * @param maxVisibilityMethods the new max visibility methods
	 */
	public void setMaxVisibilityMethods(VisibilityType maxVisibilityMethods) {
		this.maxVisibilityMethods = maxVisibilityMethods;
	}

	/**
	 * Checks if is adds the JPA annotations.
	 *
	 * @return true, if is adds the JPA annotations
	 */
	public boolean isAddJPAAnnotations() {
		return addJPAAnnotations;
	}

	/**
	 * Sets the adds the JPA annotations.
	 *
	 * @param addJPAAnnotations the new adds the JPA annotations
	 */
	public void setAddJPAAnnotations(boolean addJPAAnnotations) {
		this.addJPAAnnotations = addJPAAnnotations;
	}

	/**
	 * Checks if is adds the Validation annotations.
	 *
	 * @return true, if Validation annotations are activated
	 */
	public boolean isAddValidationAnnotations() {
		return addValidationAnnotations;
	}

	/**
	 * Sets the adds the Javax Validation annotations.
	 *
	 * @param addValidationAnnotations the new adds the Javax Validation annotations
	 */
	public void setAddValidationAnnotations(boolean addValidationAnnotations) {
		this.addValidationAnnotations = addValidationAnnotations;
	}

	/**
	 * Gets the additional plant uml configs.
	 *
	 * @return List
	 */
	public List<String> getAdditionalPlantUmlConfigs() {
		return additionalPlantUmlConfigs;
	}

	/**
	 * Enables generating uml files enabling to use internal Smetana renderer in favor
	 * of GraphViz <a href="https://plantuml.com/smetana02">Smetana</a>.
	 */
	public void setUseSmetana(boolean useSmetana) {
		this.useSmetana = useSmetana;
	}

	/**
	 * Checks if generating uml files using Smetana renderer enabled.
	 *
	 * @return true, if Smetana is enabled
	 */
	public boolean isUseSmetana() {
		return useSmetana;
	}

	/**
	 * Checks if is use short class names in fields and methods.
	 *
	 * @return true, if is use short class names in fields and methods
	 */
	public boolean isUseShortClassNamesInFieldsAndMethods() {
		return useShortClassNamesInFieldsAndMethods;
	}

	/**
	 * Sets the use short class names in fields and methods.
	 *
	 * @param useShortClassNamesInFieldsAndMethods the new use short class names in
	 *                                             fields and methods
	 */
	public void setUseShortClassNamesInFieldsAndMethods(boolean useShortClassNamesInFieldsAndMethods) {
		this.useShortClassNamesInFieldsAndMethods = useShortClassNamesInFieldsAndMethods;
	}

	/**
	 * Checks if is use short class names.
	 *
	 * @return true, if is use short class names
	 */
	public boolean isUseShortClassNames() {
		return useShortClassNames;
	}

	/**
	 * Sets the use short class names.
	 *
	 * @param useShortClassNames the new use short class names
	 */
	public void setUseShortClassNames(boolean useShortClassNames) {
		this.useShortClassNames = useShortClassNames;
	}

}
