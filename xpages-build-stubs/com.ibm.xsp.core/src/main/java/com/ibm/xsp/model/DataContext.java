package com.ibm.xsp.model;

public interface DataContext extends DataPublishingObject {
	String[] getVars();

	boolean isReadOnly();
}
