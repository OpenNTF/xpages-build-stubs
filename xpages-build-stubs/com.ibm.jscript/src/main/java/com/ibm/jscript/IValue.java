package com.ibm.jscript;

import java.util.Date;

public interface IValue {
	boolean isUndefined();

	boolean isNull();

	boolean isNumber();

	boolean isBoolean();

	boolean isString();

	boolean isArray();

	boolean isJSArray();

	boolean isJavaArray();

	boolean isDate();

	boolean isObject();

	boolean isJSObject();

	boolean isJavaObject();

	boolean booleanValue();

	short shortValue();

	int intValue();

	long longValue();

	double doubleValue();

	String stringValue();

	Date dateValue();

	Object toJavaObject() throws InterpretException;

	Object toJavaObject(Class paramClass) throws InterpretException;

	boolean hasProperty(String paramString) throws InterpretException;

	IValue getProperty(String paramString) throws InterpretException;

	void putProperty(String paramString, IValue paramIValue) throws InterpretException;

	int getArrayLength();

	IValue getArrayElement(int paramInt) throws InterpretException;

	void setArrayElement(int paramInt, IValue paramIValue) throws InterpretException;
}
