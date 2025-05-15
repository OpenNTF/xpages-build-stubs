package com.sun.faces.el;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.el.EvaluationException;
import javax.faces.el.MethodBinding;
import javax.faces.el.MethodNotFoundException;

@SuppressWarnings("rawtypes")
public class MethodBindingImpl extends MethodBinding {
	public MethodBindingImpl(Application var1, String var2, Class[] var3) {
		
	}

	@Override
	public Object invoke(FacesContext var1, Object[] var2) throws EvaluationException, MethodNotFoundException {
		return null;
	}

	@Override
	public Class getType(FacesContext var1) throws MethodNotFoundException {
		return null;
	}
}
