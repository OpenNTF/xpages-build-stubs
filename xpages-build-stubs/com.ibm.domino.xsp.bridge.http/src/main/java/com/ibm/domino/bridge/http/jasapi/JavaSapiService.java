package com.ibm.domino.bridge.http.jasapi;

public abstract class JavaSapiService implements IJavaSapiServiceHandler {
	public JavaSapiService(IJavaSapiEnvironment var1) {

	}

	public IJavaSapiEnvironment getEnvironment() {
		return null;
	}

	public void initialize(int var1, String[] var2) {
	}

	public void terminate() {
	}

	public void initializeThread(int var1) {
	}

	public void terminateThread(int var1) {
	}

	public void refreshConfiguration() {
	}

	public int processConsoleCommand(String[] var1, int var2) {
		return 0;
	}

	public void serverRestart(int var1, String[] var2) {
	}

	public void startRequest() {
	}

	public int rawRequest(IJavaSapiHttpRequestAdapter var1, IJavaSapiHttpResponseAdapter var2) {
		return 0;
	}

	public int rewriteURL(IJavaSapiHttpRequestAdapter var1, IJavaSapiHttpResponseAdapter var2) {
		return 0;
	}

	public int authenticate(IJavaSapiHttpRequestAdapter var1, IJavaSapiHttpResponseAdapter var2) {
		return 0;
	}

	public int processRequest(IJavaSapiHttpRequestAdapter var1, IJavaSapiHttpResponseAdapter var2) {
		return 0;
	}

	public void endRequest(IJavaSapiHttpRequestAdapter var1, IJavaSapiHttpResponseAdapter var2) {
	}
}
