// Warning: No line numbers available in class file
package com.ibm.xsp.registry;

import java.util.Collection;
import java.util.List;

public interface FacesSharableRegistry extends FacesRegistry {
   int TYPE_OTHER = 0;
   int TYPE_LIBRARY = 1;
   int TYPE_RUNTIME = 2;
   int TYPE_APPLICATION = 3;
   int TYPE_STANDARD = 4;

   List<FacesSharableRegistry> getDepends();

   FacesLibrary getLocalLibrary(String var1);

   Collection<String> getLocalNamespaceUris();

   FacesRenderKitLibrary getLocalRenderKitLibrary(String var1);

   Collection<String> getLocalRenderKitIds();

   boolean isLocalDef(FacesDefinition var1);

   List<FacesCompositeComponentDefinition> findCompositeLocalDefs();

   List<FacesComponentDefinition> findComponentLocalDefs();

   List<FacesDefinition> findLocalDefs();

   List<FacesComplexDefinition> findComplexLocalDefs();

   List<FacesProject> getLocalProjectList();

   int getRegistryType();
}