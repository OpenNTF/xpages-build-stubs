package com.ibm.xsp.page;

import java.util.Locale;

import javax.faces.context.FacesContext;

public interface FacesPageDispatcher {
	FacesPage loadPage(FacesContext var1, String var2, Locale var3);
}
