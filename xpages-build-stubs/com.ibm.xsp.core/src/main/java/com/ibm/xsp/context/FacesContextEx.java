package com.ibm.xsp.context;

import javax.faces.context.FacesContext;

import com.ibm.xsp.application.ApplicationEx;
import com.ibm.xsp.event.FacesContextListener;

public abstract class FacesContextEx extends FacesContext {
	public static FacesContextEx getCurrentInstance() {
		return null;
	}
	
	public abstract void addRequestListener(FacesContextListener var1);
	public abstract ApplicationEx getApplicationEx();
}
