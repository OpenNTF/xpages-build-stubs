package com.ibm.xsp.page;

import com.ibm.xsp.FacesExceptionEx;

public class FacesPageException extends FacesExceptionEx {

	public FacesPageException(Throwable cause) {
		super(cause);
	}

	public FacesPageException(String var1) {
		super(var1);
	}

	public FacesPageException(String var1, Throwable cause) {
		super(var1, cause);
	}
}
