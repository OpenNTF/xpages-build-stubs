package com.ibm.xsp.component;

import javax.faces.FacesException;
import javax.faces.context.FacesContext;

import com.ibm.xsp.page.FacesComponentBuilder;

public interface FacesComponent {
	void initBeforeContents(FacesContext var1) throws FacesException;

	void buildContents(FacesContext var1, FacesComponentBuilder var2) throws FacesException;

	void initAfterContents(FacesContext var1) throws FacesException;
}
