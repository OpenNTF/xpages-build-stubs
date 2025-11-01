package com.ibm.jscript;

public class InterpretException extends JavaScriptException {

	public InterpretException(Throwable nextException) {
		super(nextException);
	}

	public InterpretException(Throwable nextException, String msg, Object... params) {
		super(nextException, msg, params);
	}

}
