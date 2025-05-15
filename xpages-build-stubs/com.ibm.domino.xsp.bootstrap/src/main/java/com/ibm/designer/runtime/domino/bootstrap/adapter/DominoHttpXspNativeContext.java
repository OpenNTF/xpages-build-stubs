package com.ibm.designer.runtime.domino.bootstrap.adapter;

import lotus.domino.NotesException;

public interface DominoHttpXspNativeContext {
	long getServerDBHandle();

	long getUserDBHandle();

	long getUserListHandle();

	boolean getEnforceAccess();

	boolean getPreviewServer();

	Object getLsxbeSession(String var1) throws NotesException;

	String getServerVariable(String var1);
}
