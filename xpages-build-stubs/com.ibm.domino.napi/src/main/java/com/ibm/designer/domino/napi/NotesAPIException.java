package com.ibm.designer.domino.napi;

import com.ibm.commons.util.AbstractException;

import lotus.domino.NotesException;

public class NotesAPIException extends AbstractException {

	public NotesAPIException(int var1, String var2, String var3, int var4) {
		super(null);
	}

	public boolean isNativeException() {
		return false;
	}

	public int getNativeErrorCode() {
		return 0;
	}

	public void setNativeErrorCode(int var1) {

	}

	public String getNativeFile() {
		return null;
	}

	public void setNativeFile(String var1) {

	}

	public int getNativeLine() {
		return 0;
	}

	public void setNativeLine(int var1) {

	}

	public NotesException toNotesException() {
		return null;
	}
}
