package com.ibm.xsp;

import javax.faces.FacesException;

public class FacesExceptionEx extends FacesException {

	public FacesExceptionEx(Throwable cause) {
		super(cause);
	}

	public FacesExceptionEx(Throwable cause, String var2, Object... var3) {
		super(cause);
	}

	public FacesExceptionEx(String var1) {
		super(var1);
	}

	public FacesExceptionEx(String var1, Throwable cause) {
		super(var1);
	}

	public FacesExceptionEx(String var1, Object[] var2, Throwable cause) {
		super(var1);
	}

}
