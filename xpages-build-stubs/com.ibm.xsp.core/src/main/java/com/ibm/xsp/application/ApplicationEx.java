package com.ibm.xsp.application;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import com.ibm.xsp.controller.FacesController;
import com.ibm.xsp.factory.FactoryLookup;

public abstract class ApplicationEx extends Application {
	public static ApplicationEx getInstance() {
		return null;
	}
	public static ApplicationEx getInstance(FacesContext context) {
		return null;
	}
	
	@Deprecated
	public abstract FactoryLookup getFactoryLookup();

	public abstract String getProperty(String var1, String var2);
	public abstract String getApplicationProperty(String var1, String var2);
	
	public abstract FacesController getController();
}
