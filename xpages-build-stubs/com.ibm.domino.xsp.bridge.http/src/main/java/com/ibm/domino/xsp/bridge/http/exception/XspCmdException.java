package com.ibm.domino.xsp.bridge.http.exception;

public class XspCmdException extends Exception {
	public static String codeToString(int var0) {
		return null;
	}

	public XspCmdException(int var1) {
		this(var1, ""); //$NON-NLS-1$
	}

	public XspCmdException(int var1, String var2) {
		super(""); //$NON-NLS-1$

	}

	public int getReturnCode() {
		return 0;
	}
}
