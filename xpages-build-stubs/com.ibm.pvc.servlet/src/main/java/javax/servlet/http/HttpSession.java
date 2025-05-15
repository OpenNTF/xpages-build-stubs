package javax.servlet.http;

import java.util.Enumeration;
import javax.servlet.ServletContext;

@SuppressWarnings("rawtypes")
public interface HttpSession {
	long getCreationTime();

	String getId();

	long getLastAccessedTime();

	ServletContext getServletContext();

	void setMaxInactiveInterval(int var1);

	int getMaxInactiveInterval();

	@Deprecated
	HttpSessionContext getSessionContext();

	Object getAttribute(String var1);

	Object getValue(String var1);

	Enumeration getAttributeNames();

	String[] getValueNames();

	void setAttribute(String var1, Object var2);

	void putValue(String var1, Object var2);

	void removeAttribute(String var1);

	void removeValue(String var1);

	void invalidate();

	boolean isNew();
}
