package com.sun.faces.el;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.faces.el.EvaluationException;
import javax.faces.el.PropertyNotFoundException;
import javax.faces.el.ValueBinding;

import com.sun.faces.el.ValueBindingImpl;

public class ValueBindingImpl extends ValueBinding {

	public ValueBindingImpl(Application application) {
	}
	
	public void setRef(String ref) {
		
	}

	@Override
	public Object getValue(FacesContext var1) throws EvaluationException, PropertyNotFoundException {
		return null;
	}

	@Override
	public void setValue(FacesContext var1, Object var2) throws EvaluationException, PropertyNotFoundException {
		
	}

	@Override
	public boolean isReadOnly(FacesContext var1) throws EvaluationException, PropertyNotFoundException {
		return false;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class getType(FacesContext var1) throws EvaluationException, PropertyNotFoundException {
		return null;
	}

}
