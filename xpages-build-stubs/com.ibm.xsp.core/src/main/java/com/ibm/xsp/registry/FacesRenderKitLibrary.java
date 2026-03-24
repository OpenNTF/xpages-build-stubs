package com.ibm.xsp.registry;

import java.util.List;

public interface FacesRenderKitLibrary {
	String getRenderKitId();

	List<FacesRenderKitFragment> getNonInheritedRenderKitFragments();

	FacesRegistry getRegistry();

	FacesRendererDefinition getRenderer(String var1);

	FacesRendererDefinition getNonInheritedRenderer(String var1);

	List<String> getNonInheritedRendererKeys();

	List<String> getAliases();

	boolean isRenderKitAlias(String var1);

	FacesRenderKitLibrary getBaseRenderKitLibrary();
}
