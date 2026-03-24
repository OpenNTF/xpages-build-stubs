package com.ibm.xsp.page.parse;

import com.ibm.xsp.page.parse.types.PersistenceTreeContent;
import java.util.List;

public interface FacesElement extends PersistenceTreeContent {
	boolean hasChildren();

	List<FacesElement> getChildren();

	void addElement(FacesElement var1);
}