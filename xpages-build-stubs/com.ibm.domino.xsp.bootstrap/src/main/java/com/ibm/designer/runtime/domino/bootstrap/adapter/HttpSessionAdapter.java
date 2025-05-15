package com.ibm.designer.runtime.domino.bootstrap.adapter;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionContext;

public interface HttpSessionAdapter {
	Object getAttribute(String var1);

	@SuppressWarnings("rawtypes")
	Enumeration getAttributeNames();

	long getCreationTime();

	String getId();

	long getLastAccessedTime();

	int getMaxInactiveInterval();

	ServletContext getServletContext();

	HttpSessionContext getSessionContext();

	Object getValue(String var1);

	String[] getValueNames();

	void invalidate();

	boolean isNew();

	void putValue(String var1, Object var2);

	void removeAttribute(String var1);

	void removeValue(String var1);

	void setAttribute(String var1, Object var2);

	void setMaxInactiveInterval(int var1);
}
