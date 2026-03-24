package com.ibm.xsp.page.parse;

import java.util.List;

public abstract class AbstractFacesElement implements FacesElement {

	public AbstractFacesElement() {
	}

	@Override
	public boolean hasChildren() {
		return false;
	}

	@Override
	public List<FacesElement> getChildren() {
		return null;
	}

	@Override
	public void addElement(FacesElement var1) {

	}

}
