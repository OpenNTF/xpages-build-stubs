package com.ibm.xsp.registry;

import java.util.Collection;
import java.util.List;

public interface FacesRegistry extends FacesReferenceContainer {
	String getId();

	FacesRenderKitLibrary getRenderKitLibrary(String var1);

	FacesLibrary getLibrary(String var1);

	Collection<String> getNamespaceUris();

	Collection<String> getRenderKitIds();

	List<FacesProject> getProjectList();

	boolean isNamespaceUri(String var1);

	FacesDefinition findDef(String var1, String var2);

	FacesDefinition findDef(String var1);

	List<FacesDefinition> findDefs();

	FacesComponentDefinition findComponent(String var1, String var2);

	FacesCompositeComponentDefinition findComposite(String var1, String var2);

	FacesComplexDefinition findComplex(String var1, String var2);

	List<FacesComponentDefinition> findComponentDefs();

	List<FacesCompositeComponentDefinition> findCompositeDefs();

	List<FacesComplexDefinition> findComplexDefs();
}