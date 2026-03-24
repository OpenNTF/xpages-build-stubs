package com.ibm.xsp.application;

import java.io.IOException;
import java.util.Locale;

import javax.faces.FacesException;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import com.ibm.xsp.page.FacesPageDriver;

public abstract class ViewHandlerEx extends ViewHandler {

	public ViewHandlerEx() {
	}

	@Override
	public Locale calculateLocale(FacesContext var1) {
		return null;
	}

	@Override
	public String calculateRenderKitId(FacesContext var1) {
		return null;
	}

	@Override
	public UIViewRoot createView(FacesContext var1, String var2) {
		return null;
	}

	@Override
	public String getActionURL(FacesContext var1, String var2) {
		return null;
	}

	@Override
	public String getResourceURL(FacesContext var1, String var2) {
		return null;
	}

	@Override
	public void renderView(FacesContext var1, UIViewRoot var2) throws IOException, FacesException {
	}

	@Override
	public UIViewRoot restoreView(FacesContext var1, String var2) {
		return null;
	}

	@Override
	public void writeState(FacesContext var1) throws IOException {

	}
	
	public abstract FacesPageDriver getPageDriver();

	public abstract void setPageDriver(FacesPageDriver var1);
}
