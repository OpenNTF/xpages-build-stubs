package javax.servlet;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Set;

@SuppressWarnings("rawtypes")
public interface ServletContext {
	ServletContext getContext(String var1);

	String getContextPath();

	int getMajorVersion();

	int getMinorVersion();

	String getMimeType(String var1);

	Set getResourcePaths(String var1);

	URL getResource(String var1) throws MalformedURLException;

	InputStream getResourceAsStream(String var1);

	RequestDispatcher getRequestDispatcher(String var1);

	RequestDispatcher getNamedDispatcher(String var1);

	Servlet getServlet(String var1) throws ServletException;

	Enumeration getServlets();

	Enumeration getServletNames();

	void log(String var1);

	void log(Exception var1, String var2);

	void log(String var1, Throwable var2);

	String getRealPath(String var1);

	String getServerInfo();

	String getInitParameter(String var1);

	Enumeration getInitParameterNames();

	Object getAttribute(String var1);

	Enumeration getAttributeNames();

	void setAttribute(String var1, Object var2);

	void removeAttribute(String var1);

	String getServletContextName();
}
