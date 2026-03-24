package com.ibm.xsp.page.parse;

import java.util.Map;

import com.ibm.xsp.page.FacesPageException;
import com.ibm.xsp.registry.FacesRegistry;

public class FacesDeserializer {
	public static final String OPTION_ERROR_HANDLER = "errorHandler"; //$NON-NLS-1$
	public static final String OPTION_ALLOW_NAMESPACED_MARKUP_TAGS = "allowNamespacedMarkupTags"; //$NON-NLS-1$
	
	public FacesDeserializer(FacesRegistry var1, Map<String, Object> var2) {
		
	}
	
	public ComponentElement readRoot(FacesReader var1) throws FacesPageException {
		return null;
	}
}
