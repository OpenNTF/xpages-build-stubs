package com.ibm.xsp.library;

public abstract class AbstractXspLibrary implements XspLibrary {

	@Override
	public boolean isEnabled() {
		return false;
	}

	@Override
	public String getPluginId() {
		return null;
	}

	@Override
	public boolean isGlobalScope() {
		return false;
	}

	@Override
	public String[] getDependencies() {
		return null;
	}

	@Override
	public String[] getXspConfigFiles() {
		return null;
	}

	@Override
	public String[] getFacesConfigFiles() {
		return null;
	}

	@Override
	public String getTagVersion() {
		return null;
	}

	@Override
	public String getDojoVersionRequired() {
		return null;
	}

	@Override
	public Boolean isCompareTagVersionQualifier() {
		return null;
	}

	@Override
	public int getBaseXspLibraryVersion() {
		return 0;
	}

	@Override
	public boolean isTagVersionUseMicroUnderscore() {
		return false;
	}

}
