package com.ibm.xsp.registry;

import java.util.Collection;

public interface FacesComponentDefinition extends FacesDefinition {
   String getComponentType();

   String getRendererType();

   String getComponentFamily();

   Collection<String> getFacetNames();

   FacesFacet getFacet(String var1);
}