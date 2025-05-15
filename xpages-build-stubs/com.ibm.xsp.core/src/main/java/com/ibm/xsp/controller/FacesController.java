package com.ibm.xsp.controller;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import com.ibm.xsp.FacesExceptionEx;

public interface FacesController {

	void release(FacesContext var1) throws FacesExceptionEx;
	
	void render(FacesContext var1, UIViewRoot var2) throws FacesExceptionEx;
}
