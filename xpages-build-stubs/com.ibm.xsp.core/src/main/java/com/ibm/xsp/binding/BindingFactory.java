package com.ibm.xsp.binding;

import javax.faces.application.Application;
import javax.faces.el.MethodBinding;
import javax.faces.el.ValueBinding;

public interface BindingFactory {
	String getPrefix();
	ValueBinding createValueBinding(final Application application, final String ref);
	MethodBinding createMethodBinding(final Application application, final String ref, @SuppressWarnings("rawtypes") final Class[] args);
}
