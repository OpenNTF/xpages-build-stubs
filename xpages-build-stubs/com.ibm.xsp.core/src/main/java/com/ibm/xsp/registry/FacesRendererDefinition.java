package com.ibm.xsp.registry;

import java.util.Collection;

public interface FacesRendererDefinition extends FacesDefinition {
	String getComponentFamily();

	String getRendererType();

	FacesFacet getFacet(String var1);

	Collection<String> getFacetNames();

	FacesRenderKitFragment getRenderKitFragment();
}
