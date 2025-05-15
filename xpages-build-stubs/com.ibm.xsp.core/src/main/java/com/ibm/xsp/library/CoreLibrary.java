package com.ibm.xsp.library;

public class CoreLibrary extends AbstractXspLibrary {
	   public static final String LIBRARY_ID = "com.ibm.xsp.core.library"; //$NON-NLS-1$
	   public static final String[] DEPEND_ON_CORE = new String[]{ LIBRARY_ID };

	public CoreLibrary() {
	}

	@Override
	public String getLibraryId() {
		return null;
	}

}
