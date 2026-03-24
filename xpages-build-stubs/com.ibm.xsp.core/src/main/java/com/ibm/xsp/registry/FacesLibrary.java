package com.ibm.xsp.registry;

import java.util.List;

public interface FacesLibrary {
   String getNamespaceUri();

   FacesRegistry getRegistry();

   List<FacesLibraryFragment> getFiles();

   FacesDefinition getDefinition(String var1);

   List<FacesDefinition> getDefs();

   String getFirstDefaultPrefix();
}