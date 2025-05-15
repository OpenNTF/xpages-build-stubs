package com.ibm.domino.napi.c;

import com.ibm.domino.napi.NException;

public class Os {
	public static final native String OSGetEnvironmentString(String var0) throws NException;
	public static final native String OSGetDataDirectory();
	public static final native void OSMemFree(long var0) throws NException;
}
