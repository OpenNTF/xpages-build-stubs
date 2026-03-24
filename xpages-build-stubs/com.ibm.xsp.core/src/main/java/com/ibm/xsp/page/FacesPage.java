package com.ibm.xsp.page;

import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

public interface FacesPage {
	UIViewRoot createViewRoot(FacesContext var1) throws FacesPageException, UnsupportedOperationException;

	void addComponent(FacesContext var1, FacesComponentBuilder var2, UIComponent var3, String var4)
			throws FacesPageException, UnsupportedOperationException;
}