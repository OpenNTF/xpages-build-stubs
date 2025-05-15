package com.ibm.domino.xsp.module.nsf;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import com.ibm.designer.runtime.domino.adapter.ComponentModule;
import com.ibm.designer.runtime.domino.adapter.LCDEnvironment;

public final class NSFComponentModule extends ComponentModule {

	public NSFComponentModule(LCDEnvironment var1, NSFService var2, String var3, String var4) {
		super(var1, var2, var3, true);
	}

	@Override
	public long getLastRefresh() {
		return 0;
	}

	@Override
	public ClassLoader getModuleClassLoader() {
		return null;
	}

	@Override
	public URL getResource(String var1) throws MalformedURLException {
		return null;
	}

	@Override
	public InputStream getResourceAsStream(String var1) {
		return null;
	}

	@Override
	public boolean getResourceAsStream(OutputStream var1, String var2) {
		return false;
	}

	@Override
	protected void doInitModule() {
		
	}

	@Override
	protected void doDestroyModule() {
		
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public Set<String> getResourcePaths(String var1) {
		return null;
	}

	@Override
	public boolean refresh() {
		return false;
	}

	@Override
	public boolean shouldRefresh() {
		return false;
	}

	public String getDatabasePath() {
		return null;
	}
	
	public RuntimeFileSystem getRuntimeFileSystem() {
		return null;
	}
}
