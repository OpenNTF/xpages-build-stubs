package com.ibm.jscript;

import com.ibm.commons.util.AbstractException;

public abstract class JavaScriptException extends AbstractException {

	public JavaScriptException(Throwable nextException) {
		super(nextException);
	}

	public JavaScriptException(Throwable nextException, String msg, Object... params) {
		super(nextException, msg, params);
	}

}
