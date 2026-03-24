package com.ibm.xsp.registry.parse;

import org.w3c.dom.Element;

import com.ibm.xsp.registry.FacesExtensibleNode;

public interface RegistryAnnotater {
	void annotate(RegistryAnnotaterInfo var1, FacesExtensibleNode var2, Element var3);
}
