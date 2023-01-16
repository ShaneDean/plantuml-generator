package de.elnarion.util.plantuml.generator.classdiagram.internal;

import java.util.Collections;
import java.util.List;

import de.elnarion.util.plantuml.generator.classdiagram.config.VisibilityType;

/**
 * The Class UMLClass encapsulates all information needed for creating a diagram
 * text for a uml class object.
 */
public class UMLClass implements PlantUMLDiagramElement {

	private String name;
	private ClassType classType;
	private List<UMLField> fields;
	private List<UMLMethod> methods;
	private List<UMLStereotype> stereotypes;

	/**
	 * Instantiates a new UML class.
	 *
	 * @param paramVisibilityType - {@link VisibilityType} - the visibility type
	 * @param paramClassType      - {@link ClassType} - the class type
	 * @param paramFields         - List&lt;{@link UMLField}&gt; - the uml field
	 *                            information list
	 * @param paramMethods        - List&lt;{@link UMLMethod}&gt; - the uml method
	 *                            information list
	 * @param paramName           - String - the class name
	 * @param paramStereotypes    - List&lt;UMLStereotype&gt; - the stereotypes of
	 *                            the class
	 */
	public UMLClass(ClassType paramClassType, List<UMLField> paramFields, List<UMLMethod> paramMethods,
			String paramName, List<UMLStereotype> paramStereotypes) {
		classType = paramClassType;
		name = paramName;
		fields = paramFields;
		methods = paramMethods;
		stereotypes = paramStereotypes;
	}

	/**
	 * Gets the name.
	 *
	 * @return String - the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String getDiagramText() {
		boolean isAnnotation = false;
		StringBuilder builder = new StringBuilder();
		isAnnotation = addClassType(isAnnotation, builder);
		builder.append(name);
		addStereotypes(builder);
		if (!isAnnotation) {
			builder.append(" {");
			addStereotypeTaggedValues(builder);
			builder.append(System.lineSeparator());
			if (fields != null && !fields.isEmpty()) {
				Collections.sort(fields, (UMLField o1, UMLField o2) -> o1.getName().compareTo(o2.getName()));
				for (UMLField field : fields) {
					builder.append("\t");
					builder.append(field.getDiagramText());
					builder.append(System.lineSeparator());
				}
			}
			if (methods != null && !methods.isEmpty()) {
				Collections.sort(methods, new UMLMethodComparator());
				for (UMLMethod method : methods) {
					builder.append("\t");
					builder.append(method.getDiagramText());
					builder.append(System.lineSeparator());
				}
			}
			builder.append("}");
			builder.append(System.lineSeparator());
		}
		return builder.toString();
	}

	private void addStereotypes(StringBuilder builder) {
		if (stereotypes != null) {
			for (UMLStereotype stereotype : stereotypes) {
				builder.append(" ");
				builder.append(stereotype.getDiagramText());
				builder.append(" ");
			}

		}
	}

	private void addStereotypeTaggedValues(StringBuilder builder) {
		if (stereotypes != null) {
			boolean addedTaggedValues = false;
			for (UMLStereotype stereotype : stereotypes) {

				if (stereotype.hasTaggedValues()) {
					builder.append(stereotype.getTaggedValueCompartment());
					addedTaggedValues = true;
				}
			}
			if (addedTaggedValues) {
				builder.append(System.lineSeparator());
				builder.append("--");
			}
		}
	}

	private boolean addClassType(boolean isAnnotation, StringBuilder builder) {
		switch (classType) {
		case ABSTRACT_CLASS:
			builder.append("abstract class ");
			break;
		case ANNOTATION:
			builder.append("annotation ");
			isAnnotation = true;
			break;
		case CLASS:
			builder.append("class ");
			break;
		case ENUM:
			builder.append("enum ");
			break;
		case INTERFACE:
			builder.append("interface ");
			break;
		default:
			break;
		}
		return isAnnotation;
	}

	/**
	 * Adds the field.
	 *
	 * @param paramField the param field
	 */
	public void addField(UMLField paramField) {
		fields.add(paramField);
	}

	/**
	 * Adds the method.
	 *
	 * @param paramMethod the param method
	 */
	public void addMethod(UMLMethod paramMethod) {
		methods.add(paramMethod);
	}

}
