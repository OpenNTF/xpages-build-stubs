package com.ibm.designer.runtime.domino.bootstrap.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;

@SuppressWarnings("rawtypes")
public interface HttpServletRequestAdapter {
	String PRELOAD_SESSION_ID = "_preload_id_"; //$NON-NLS-1$

	String getPathInfo();

	String getServletPath();

	String getContextPath();

	String getRealPath(String var1);

	String getAuthType();

	String getCharacterEncoding();

	int getContentLength();

	String getContentType();

	Cookie[] getCookies();

	long getDateHeader(String var1);

	String getHeader(String var1);

	Enumeration getHeaderNames();

	Enumeration getHeaders(String var1);

	ServletInputStream getInputStream() throws IOException;

	int getIntHeader(String var1);

	String getLocalAddr();

	Locale getLocale();

	Enumeration getLocales();

	String getLocalName();

	int getLocalPort();

	String getMethod();

	String getParameter(String var1);

	Map getParameterMap();

	Enumeration getParameterNames();

	String[] getParameterValues(String var1);

	String getPathTranslated();

	String getProtocol();

	String getQueryString();

	BufferedReader getReader() throws IOException;

	String getRemoteAddr();

	String getRemoteHost();

	int getRemotePort();

	String getRemoteUser();

	Object getRequestDispatcher(String var1);

	String getRequestedSessionId();

	String getRequestURI();

	StringBuffer getRequestURL();

	String getConversationId();

	String getScheme();

	String getServerName();

	int getServerPort();

	Principal getUserPrincipal();

	void setUserPrincipal(Principal var1);

	boolean isRequestedSessionIdFromCookie();

	boolean isRequestedSessionIdFromUrl();

	boolean isRequestedSessionIdFromURL();

	boolean isRequestedSessionIdValid();

	boolean isSecure();

	boolean isUserInRole(String var1);

	void setCharacterEncoding(String var1) throws UnsupportedEncodingException;
}
