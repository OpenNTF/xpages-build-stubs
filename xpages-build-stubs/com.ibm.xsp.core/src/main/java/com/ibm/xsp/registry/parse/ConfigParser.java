package com.ibm.xsp.registry.parse;

import com.ibm.xsp.library.FacesClassLoader;
import com.ibm.xsp.registry.FacesLibraryFragment;
import com.ibm.xsp.registry.FacesProject;
import com.ibm.xsp.registry.config.IconUrlSource;
import com.ibm.xsp.registry.config.ResourceBundleSource;
import org.w3c.dom.Element;


public interface ConfigParser {
	FacesLibraryFragment createFacesLibraryFragment(FacesProject var1, FacesClassLoader var2, String var3, Element var4,
			ResourceBundleSource var5, IconUrlSource var6, String var7);

	void addAnnotater(RegistryAnnotater var1);

	boolean removeAnnotater(RegistryAnnotater var1);
}
