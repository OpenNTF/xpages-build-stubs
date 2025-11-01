package com.ibm.domino.xsp.adapter.osgi;

import com.ibm.designer.runtime.domino.adapter.ComponentModule;
import com.ibm.designer.runtime.domino.adapter.HttpService;
import com.ibm.designer.runtime.domino.adapter.LCDEnvironment;

public abstract class AbstractOSGIModule extends ComponentModule {

	public AbstractOSGIModule(LCDEnvironment paramLCDEnvironment, HttpService paramHttpService, String paramString, boolean paramBoolean) {
		super(paramLCDEnvironment, paramHttpService, paramString, paramBoolean);
	}

	public String getDatabasePath() {
		return null;
	}
}
