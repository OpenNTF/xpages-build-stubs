package com.ibm.xsp.registry;

public interface UpdatableLibrary extends FacesLibrary {
	void clearLibraryFragments();

	void addLibraryFragment(FacesLibraryFragment var1);

	boolean removeLibraryFragment(FacesLibraryFragment var1);
}