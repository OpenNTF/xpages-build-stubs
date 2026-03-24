package com.ibm.xsp.registry.config;

import com.ibm.xsp.library.LibraryWrapper;
import com.ibm.xsp.registry.FacesSharableRegistry;

public class SimpleRegistryProvider implements XspRegistryProvider {

	@Override
	public String getId() {
		return null;
	}

	@Override
	public FacesSharableRegistry getRegistry() {
		return null;
	}

	@Override
	public String[] getDependIds() {
		return null;
	}

	public void init(LibraryWrapper var1) {
		
	}
}
