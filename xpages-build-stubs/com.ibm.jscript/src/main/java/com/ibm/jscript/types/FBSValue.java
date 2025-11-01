package com.ibm.jscript.types;

import java.util.Date;

import com.ibm.jscript.IValue;
import com.ibm.jscript.InterpretException;

public class FBSValue implements IValue {

	@Override
	public boolean isUndefined() {
		return false;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isArray() {
		return false;
	}

	@Override
	public boolean isJSArray() {
		return false;
	}

	@Override
	public boolean isJavaArray() {
		return false;
	}

	@Override
	public boolean isDate() {
		return false;
	}

	@Override
	public boolean isObject() {
		return false;
	}

	@Override
	public boolean isJSObject() {
		return false;
	}

	@Override
	public boolean isJavaObject() {
		return false;
	}

	@Override
	public boolean booleanValue() {
		return false;
	}

	@Override
	public short shortValue() {
		return 0;
	}

	@Override
	public int intValue() {
		return 0;
	}

	@Override
	public long longValue() {
		return 0;
	}

	@Override
	public double doubleValue() {
		return 0;
	}

	@Override
	public String stringValue() {
		return null;
	}

	@Override
	public Date dateValue() {
		return null;
	}

	@Override
	public Object toJavaObject() throws InterpretException {
		return null;
	}

	@Override
	public Object toJavaObject(Class paramClass) throws InterpretException {
		return null;
	}

	@Override
	public boolean hasProperty(String paramString) throws InterpretException {
		return false;
	}

	@Override
	public IValue getProperty(String paramString) throws InterpretException {
		return null;
	}

	@Override
	public void putProperty(String paramString, IValue paramIValue) throws InterpretException {
		
	}

	@Override
	public int getArrayLength() {
		return 0;
	}

	@Override
	public IValue getArrayElement(int paramInt) throws InterpretException {
		return null;
	}

	@Override
	public void setArrayElement(int paramInt, IValue paramIValue) throws InterpretException {
		
	}

}
