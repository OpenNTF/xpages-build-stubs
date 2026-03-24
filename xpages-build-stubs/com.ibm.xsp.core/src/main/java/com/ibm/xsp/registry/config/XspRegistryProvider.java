package com.ibm.xsp.registry.config;

import com.ibm.xsp.registry.FacesSharableRegistry;

public interface XspRegistryProvider {
	String getId();

	FacesSharableRegistry getRegistry();

	String[] getDependIds();
}
