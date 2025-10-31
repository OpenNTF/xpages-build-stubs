package com.ibm.designer.runtime.domino.adapter;

import java.util.List;

import com.ibm.designer.runtime.domino.bootstrap.LCDRequestHandler;
import com.ibm.designer.runtime.domino.bootstrap.RequestContext;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpServletRequestAdapter;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpServletResponseAdapter;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpSessionAdapter;

public class LCDEnvironment implements LCDRequestHandler {
	public static LCDEnvironment getInstance() {
		return null;
	}

	@Override
	public void initialize() {
		
	}

	@Override
	public void destroy() {
		
	}

	@Override
	public boolean isXspUrl(String var1, boolean var2) {
		return false;
	}

	@Override
	public void service(RequestContext var1, HttpSessionAdapter var2, HttpServletRequestAdapter var3,
			HttpServletResponseAdapter var4) throws Exception {
		
	}

	@Override
	public String[] getLoadedModuleNames() {
		return null;
	}

	@Override
	public void refresh() {
		
	}

	@Override
	public void restart() {
		
	}

	@Override
	public void checkTimeout() {
		
	}

	@Override
	public Object execService(String var1, Object var2) throws Exception {
		return null;
	}

	@Override
	public Object tellCommand(String var1) {
		return null;
	}

	@Override
	public boolean disableHttpMethodCheck(String var1, int var2) {
		return false;
	}
	
	public List<HttpService> getServices() {
		return null;
	}
	
	public List<ComponentModule> getActiveModules() {
		return null;
	}
}
