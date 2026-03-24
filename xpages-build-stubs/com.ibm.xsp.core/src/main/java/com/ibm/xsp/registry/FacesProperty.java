package com.ibm.xsp.registry;

public interface FacesProperty extends FacesExtensibleNode {
	String getName();

	Class<?> getJavaClass();

	boolean isAttribute();

	boolean isRequired();

	String getSince();

	FacesLibraryFragment getFile();
}
