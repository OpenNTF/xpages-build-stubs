package com.ibm.xsp.page;

import javax.faces.context.FacesContext;

public interface FacesPageDriver {
	String FACES_EXTSN = ".xsp"; //$NON-NLS-1$

	FacesPageDispatcher loadPage(FacesContext var1, String var2) throws FacesPageException;
}