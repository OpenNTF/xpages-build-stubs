package com.ibm.xsp.complex;

import javax.faces.component.StateHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

import com.ibm.xsp.binding.ComponentBindingObject;

public abstract class ValueBindingObjectImpl implements ValueBindingObject, ComponentBindingObject, StateHolder {
	
	protected ValueBindingObjectImpl() {
	}

	@Override
	public Object saveState(FacesContext var1) {
		return null;
	}

	@Override
	public void restoreState(FacesContext var1, Object var2) {
	}

	@Override
	public boolean isTransient() {
		return false;
	}

	@Override
	public void setTransient(boolean var1) {
	}
	
	@Override
	public ValueBinding getValueBinding(String var1) {
		return null;
	}
	
	@Override
	public void setValueBinding(String var1, ValueBinding var2) {
	}

	@Override
	public UIComponent getComponent() {
		return null;
	}
	
	@Override
	public void setComponent(UIComponent var1) {
		
	}
}
