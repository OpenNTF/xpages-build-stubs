package com.ibm.xsp.dojo;

import java.util.List;

public interface FacesDojoComponent {
	String getDojoType();

	List<DojoAttribute> getDojoAttributes();
}
