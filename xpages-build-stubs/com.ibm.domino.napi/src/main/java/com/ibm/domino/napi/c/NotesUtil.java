package com.ibm.domino.napi.c;

import com.ibm.domino.napi.NException;
import com.ibm.domino.napi.c.struct.TIMEDATE;
import com.ibm.domino.napi.c.struct.UNIVERSALNOTEID;

public class NotesUtil {
	public static final native String fromLMBCS(long paramLong, int paramInt);

	public static final native String fromLMBCSLen(long paramLong, int paramInt1, int paramInt2);

	public static final String fromLMBCSLen(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
		return null;
	}

	public static final String fromLMBCS(byte[] paramArrayOfbyte) {
		return null;
	}

	public static final byte[] toLMBCSBytes(String paramString) {
		return null;
	}

	public static final native void toLMBCSBuffer(String paramString, long paramLong, int paramInt1, int paramInt2);

	public static final native long toJavaDate(TIMEDATE paramTIMEDATE) throws NException;

	public static final native long toJavaDate2(long paramLong, int paramInt) throws NException;

	public static final native void fromJavaDate(TIMEDATE paramTIMEDATE, long paramLong) throws NException;

	public static final native String unidToString(UNIVERSALNOTEID paramUNIVERSALNOTEID) throws NException;

	public static final native String unidToString2(long paramLong, int paramInt) throws NException;

	public static final native void stringToUnid(String paramString, UNIVERSALNOTEID paramUNIVERSALNOTEID)
			throws NException;

	public static final native long createUserNameList(String paramString) throws NException;

	public static final native String dominoServerNameToDNSName(String paramString) throws NException;
	
	public static final native long toLMBCS(String paramString);
}
