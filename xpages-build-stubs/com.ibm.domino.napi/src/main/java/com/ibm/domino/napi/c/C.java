package com.ibm.domino.napi.c;

public class C {
	public static void initLibrary(String paramString) {
	}
	
	public static native int strlen(long ptr, int i);
	
	public static native void readByteArray(byte[]a, int b, long c, int d, int e);
	
	public static native void free(long ptr);
}
