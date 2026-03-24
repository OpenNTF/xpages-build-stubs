package com.ibm.xsp.registry;

import java.util.Collection;

public interface FacesDefinition extends FacesExtensibleNode {
	String getTagName();

	String getNamespaceUri();

	String getFirstDefaultPrefix();

	FacesLibraryFragment getFile();

	FacesDefinition getParent();

	String getId();

	Class<?> getJavaClass();

	FacesProperty getProperty(String var1);

	boolean isProperty(String var1);

	boolean isDefinedProperty(String var1);

	boolean isTag();

	String getDefaultProperty();

	FacesProperty getDefaultFacesProperty();

	Collection<String> getDefinedPropertyNames();

	Collection<String> getDefinedInlinePropertyNames();

	Collection<String> getPropertyNames();

	Collection<String> getGroupTypeRefs();

	boolean isGroupProperty(String var1);

	String getSince();

	String getReferenceId();
}
