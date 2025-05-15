package com.ibm.domino.xsp.module.nsf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import com.ibm.designer.runtime.domino.adapter.ComponentModule;
import com.ibm.designer.runtime.domino.adapter.HttpService;
import com.ibm.designer.runtime.domino.adapter.LCDEnvironment;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpServletRequestAdapter;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpServletResponseAdapter;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpSessionAdapter;

public class NSFService extends HttpService {
	public static synchronized void addHandledExtensions(String var0) {
		
	}

	public NSFService(LCDEnvironment env) {
		super(env);
	}

	@Override
	public boolean doService(String contextPath, String path, HttpSessionAdapter httpSession,
			HttpServletRequestAdapter httpRequest, HttpServletResponseAdapter httpResponse)
			throws ServletException, IOException {
		return false;
	}

	@Override
	public void getModules(List<ComponentModule> modules) {
		
	}

	public NSFComponentModule loadModule(String var1) throws ServletException {
		return null;
	}
}
