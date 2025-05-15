package javax.servlet.http;

import java.util.Enumeration;

public interface HttpSessionContext {

	HttpSession getSession(String var1);

	@SuppressWarnings("rawtypes")
	Enumeration getIds();
}
