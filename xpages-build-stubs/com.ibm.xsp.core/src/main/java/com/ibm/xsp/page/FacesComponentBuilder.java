package com.ibm.xsp.page;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public interface FacesComponentBuilder {
	FacesComponentBuilder getParent();

	UIComponent getUIComponent();

	void buildAll(FacesContext var1, UIComponent var2, boolean var3) throws FacesPageException;

	void buildChildren(FacesContext var1, UIComponent var2) throws FacesPageException;

	boolean isFacetAvailable(FacesContext var1, UIComponent var2, String var3);

	boolean buildFacet(FacesContext var1, UIComponent var2, String var3) throws FacesPageException;

	void buildFacets(FacesContext var1, UIComponent var2) throws FacesPageException;
}
