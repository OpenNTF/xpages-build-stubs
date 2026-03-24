package com.ibm.xsp.registry;

import java.util.List;

public interface FacesLibraryFragment extends FacesExtensibleNode, FacesReferenceContainer {
	List<FacesDefinition> getDefs();

	List<String> getRenderKitIds();

	FacesRenderKitFragment getRenderKitFragment(String var1);

	String getFilePath();

	String getNamespaceUri();

	String getDefaultPrefix();

	FacesProject getProject();

	FacesDefinition getDefinition(String var1);
}
