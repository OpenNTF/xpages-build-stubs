package com.ibm.xsp.library;

public interface XspLibrary {
	boolean isEnabled();

	String getLibraryId();

	String getPluginId();

	boolean isGlobalScope();

	String[] getDependencies();

	String[] getXspConfigFiles();

	String[] getFacesConfigFiles();

	String getTagVersion();

	String getDojoVersionRequired();

	Boolean isCompareTagVersionQualifier();

	int getBaseXspLibraryVersion();

	boolean isTagVersionUseMicroUnderscore();
}
