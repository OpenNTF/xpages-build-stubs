package com.ibm.xsp.page;

import com.ibm.xsp.FacesExceptionEx;

public class PageNotFoundException extends FacesExceptionEx {
	private static final long serialVersionUID = 1L;

	public PageNotFoundException(Throwable cause) {
		super(cause);
	}

	public PageNotFoundException(String var1) {
		super(var1);
	}

	public PageNotFoundException(String var1, Throwable cause) {
		super(var1, cause);
	}
}
