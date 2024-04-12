package com.ibm.xsp.context;

import javax.faces.context.FacesContext;

import com.ibm.xsp.event.FacesContextListener;

public abstract class FacesContextEx extends FacesContext {
	public abstract void addRequestListener(FacesContextListener var1);
}
