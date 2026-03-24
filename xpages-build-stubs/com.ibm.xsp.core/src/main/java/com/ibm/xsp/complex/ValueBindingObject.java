package com.ibm.xsp.complex;

import javax.faces.el.ValueBinding;

public interface ValueBindingObject {
	ValueBinding getValueBinding(String var1);

	void setValueBinding(String var1, ValueBinding var2);
}
