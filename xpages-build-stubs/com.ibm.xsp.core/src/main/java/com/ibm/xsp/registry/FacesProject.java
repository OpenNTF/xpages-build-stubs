package com.ibm.xsp.registry;

import java.util.List;

public interface FacesProject extends FacesReferenceContainer {
	String getId();

	FacesRegistry getRegistry();

	FacesLibraryFragment getFile(String var1);

	List<FacesLibraryFragment> getFiles();
}