package javax.servlet.http;

import java.security.Principal;
import java.util.Enumeration;
import javax.servlet.ServletRequest;

@SuppressWarnings("rawtypes")
public interface HttpServletRequest extends ServletRequest {
	String BASIC_AUTH = "BASIC"; //$NON-NLS-1$
	String FORM_AUTH = "FORM"; //$NON-NLS-1$
	String CLIENT_CERT_AUTH = "CLIENT_CERT"; //$NON-NLS-1$
	String DIGEST_AUTH = "DIGEST"; //$NON-NLS-1$

	String getAuthType();

	Cookie[] getCookies();

	long getDateHeader(String var1);

	String getHeader(String var1);

	Enumeration getHeaders(String var1);

	Enumeration getHeaderNames();

	int getIntHeader(String var1);

	String getMethod();

	String getPathInfo();

	String getPathTranslated();

	String getContextPath();

	String getQueryString();

	String getRemoteUser();

	boolean isUserInRole(String var1);

	Principal getUserPrincipal();

	String getRequestedSessionId();

	String getRequestURI();

	StringBuffer getRequestURL();

	String getServletPath();

	HttpSession getSession(boolean var1);

	HttpSession getSession();

	boolean isRequestedSessionIdValid();

	boolean isRequestedSessionIdFromCookie();

	boolean isRequestedSessionIdFromURL();

	boolean isRequestedSessionIdFromUrl();
}
