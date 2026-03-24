package com.ibm.xsp.registry.parse;

import com.ibm.xsp.registry.FacesRegistry;
import java.net.URL;
import java.util.ResourceBundle;

public interface RegistryAnnotaterInfo {
	ResourceBundle getResourceBundle();

	URL getDesignIconUrl(String var1);

	FacesRegistry getRegistry();
}
