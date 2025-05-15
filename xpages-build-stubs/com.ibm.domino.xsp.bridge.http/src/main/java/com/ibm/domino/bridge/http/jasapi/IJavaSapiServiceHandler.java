package com.ibm.domino.bridge.http.jasapi;

public interface IJavaSapiServiceHandler {
	int HTEXTENSION_SUCCESS = 0;
	int HTEXTENSION_REQUEST_PROCESSED = 1;
	int HTEXTENSION_EVENT_HANDLED = 2;
	int HTEXTENSION_EVENT_DECLINED = 3;
	int HTEXTENSION_REQUEST_AUTHENTICATED = 4;
	int HTEXTENSION_REQUEST_TRANSLATED_DONE = 5;
	int HTEXTENSION_REQUEST_TRANSLATED_CONTINUE = 6;
	int HTThreadUnknown = 0;
	int HTThreadConfig = 1;
	int HTThreadWorker = 2;
	int HTThreadAccept = 3;
	int HTThreadTime = 4;
	int HTThreadLogger = 5;
	int HTThreadStats = 6;

	String getServiceName();

	void initialize(int var1, String[] var2);

	void terminate();

	void initializeThread(int var1);

	void terminateThread(int var1);

	void refreshConfiguration();

	int processConsoleCommand(String[] var1, int var2);

	void serverRestart(int var1, String[] var2);

	void startRequest(IJavaSapiHttpContextAdapter var1);

	int rawRequest(IJavaSapiHttpContextAdapter var1);

	int rewriteURL(IJavaSapiHttpContextAdapter var1);

	int authenticate(IJavaSapiHttpContextAdapter var1);

	int processRequest(IJavaSapiHttpContextAdapter var1);

	void endRequest(IJavaSapiHttpContextAdapter var1);
}
