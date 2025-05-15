package com.ibm.designer.runtime.domino.bootstrap;

import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpServletRequestAdapter;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpServletResponseAdapter;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpSessionAdapter;

public interface LCDRequestHandler {
	void initialize();

	void destroy();

	boolean isXspUrl(String var1, boolean var2);

	void service(RequestContext var1, HttpSessionAdapter var2, HttpServletRequestAdapter var3,
			HttpServletResponseAdapter var4) throws Exception;

	String[] getLoadedModuleNames();

	void refresh();

	void restart();

	void checkTimeout();

	Object execService(String var1, Object var2) throws Exception;

	Object tellCommand(String var1);

	boolean disableHttpMethodCheck(String var1, int var2);
}
