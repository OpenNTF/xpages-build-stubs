package com.ibm.xsp.component;

import java.util.List;

import com.ibm.xsp.complex.Attr;

public interface FacesAttrsObject {
	List<Attr> getAttrs();

	void addAttr(Attr var1);
}
