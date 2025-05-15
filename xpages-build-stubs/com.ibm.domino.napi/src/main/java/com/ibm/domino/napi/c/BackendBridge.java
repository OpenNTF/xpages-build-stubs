package com.ibm.domino.napi.c;

import lotus.domino.Session;

public class BackendBridge {
	public static native void setNoRecycle(Session var0, Object var1, boolean var2);
}
