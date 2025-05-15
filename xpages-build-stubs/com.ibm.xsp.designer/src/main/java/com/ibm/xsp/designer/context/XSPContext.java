package com.ibm.xsp.designer.context;

import java.util.Locale;

import javax.faces.context.FacesContext;

public abstract class XSPContext {
	public static XSPContext getXSPContext(FacesContext facesContext) {
		return null;
	}

	public Locale getLocale() {
		return null;
	}
}
