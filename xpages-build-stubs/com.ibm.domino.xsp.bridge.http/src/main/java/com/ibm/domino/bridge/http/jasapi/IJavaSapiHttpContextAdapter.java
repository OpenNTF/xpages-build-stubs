package com.ibm.domino.bridge.http.jasapi;

public interface IJavaSapiHttpContextAdapter {
	void addContext(String var1, Object var2);

	void removeContext(String var1);

	Object getContext(String var1);

	long getContextID();

	IJavaSapiHttpRequestAdapter getRequest();

	IJavaSapiHttpResponseAdapter getResponse();

	String createContextName(String var1);
}
