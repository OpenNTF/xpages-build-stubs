package com.ibm.domino.bridge.http.jasapi;

import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.Cookie;

public interface IJavaSapiHttpRequestAdapter {
	String getRequestURI();

	StringBuffer getRequestURL();

	String getQueryString();

	String getServerVariable(String var1);

	String getAllHeaders();

	String getHeader(String var1);

	Cookie[] getCookies();

	String getMethod();

	String getContextPath();

	String getRemoteUser();

	String getRemoteUserGroups();

	String getRemoteAddr();

	String getRemoteHost();

	int getIntHeader(String var1);

	long getDateHeader(String var1);

	String getScheme();

	int getServerPort();

	String getProtocol();

	String getContentType();

	String getServerName();

	int getContentLength();

	Enumeration<String> getHeaderNames();

	String getAuthType();

	boolean getPreviewServer();

	boolean isSecure();

	String getLocalName();

	int getLocalPort();

	Locale getLocale();

	Enumeration getLocales();

	String getCharacterEncoding();

	Object getAttribute(String var1);

	String[] getParameterValues(String var1);

	String getParameter(String var1);

	Enumeration<String> getParameterNames();

	Map<String, String[]> getParameterMap();

	boolean isRequestProcessed();

	boolean userInUserCache();

	String getUserNameToAuthenticate();

	String getUserPasswordToAuthenticate();

	String getUserAuthMappedResource();

	void setProcessRequestOwner(String var1, boolean var2);

	void setAuthenticatedUserName(String var1, String var2);

	void setRequestHeader(String var1, String var2);

	void rewriteUrl(String var1);
}
