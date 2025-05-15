package com.ibm.xsp.application.events;

import com.ibm.xsp.application.ApplicationEx;

public interface ApplicationListener {
	String APPLICATION_LISTENER_SERVICE = "com.ibm.xsp.core.events.ApplicationListener";

	void applicationCreated(ApplicationEx var1);

	void applicationDestroyed(ApplicationEx var1);
}
