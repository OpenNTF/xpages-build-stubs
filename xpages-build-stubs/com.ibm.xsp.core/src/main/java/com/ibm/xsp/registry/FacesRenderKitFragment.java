package com.ibm.xsp.registry;

import java.util.List;

public interface FacesRenderKitFragment extends FacesExtensibleNode {
	List<FacesRendererDefinition> getDefs();

	List<String> getRendererKeys();

	FacesRendererDefinition getRendererDefinition(String var1, String var2);

	FacesLibraryFragment getLibraryFragment();

	String getRenderKitId();

	String getBaseRenderKitId();

	boolean isRenderKitAlias(String var1);

	List<String> getAliases();

	FacesRendererDefinition getRenderer(String var1);
}
