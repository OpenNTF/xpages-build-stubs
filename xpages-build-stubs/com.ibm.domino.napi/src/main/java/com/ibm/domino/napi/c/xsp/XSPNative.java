package com.ibm.domino.napi.c.xsp;

import lotus.domino.Database;
import lotus.domino.NotesException;
import lotus.domino.Session;

public class XSPNative {

	public static native Session createXPageSession(String var0, long var1, boolean var3, boolean var4)
			throws NotesException;

	public static native Session createXPageSessionExt(String var0, long var1, boolean var3, boolean var4, boolean var5)
			throws NotesException;

	public static native long getDBHandle(Database var0) throws NotesException;

	public static native Database setContextDatabase(Session var0, long var1) throws NotesException;
}
