package com.ibm.domino.napi;

import com.ibm.commons.util.AbstractException;

import lotus.domino.NotesException;

public class NException extends AbstractException {

	public NException(Throwable var1, String var2) {
		super(var1, var2, new Object[0]);
	}

	public NException(Throwable var1, String var2, int var3) {
		super(var1, var2, new Object[0]);
	}

	public NException(Throwable var1, String var2, Object... var3) {
		super(var1, "", new Object[0]); //$NON-NLS-1$
	}

	public NException(Throwable var1, int var2, String var3, String var4, int var5) {
		super(var1, var3, new Object[0]);// 73

	}

	public int getErrorCode() {
		return 0;
	}

	public String getFile() {
		return null;
	}

	public int getLine() {
		return 0;
	}

	public NotesException toNotesException() {
		return null;
	}

}
