package com.ibm.domino.bridge.http.jasapi;

public class JavaSapiEnvironment implements IJavaSapiEnvironment {
	public static JavaSapiEnvironment getInstance() {
		return null;
	}

	@Override
	public boolean getPreviewServer() {
		return false;
	}

	@Override
	public IJavaSapiEnvironment getEnvironment() {
		return null;
	}
	
	public synchronized void registerServices() {
		
	}

}
