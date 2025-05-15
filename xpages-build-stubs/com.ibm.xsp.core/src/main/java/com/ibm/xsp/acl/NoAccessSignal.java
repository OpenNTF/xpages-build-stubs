package com.ibm.xsp.acl;

public class NoAccessSignal extends Error {

	public NoAccessSignal() {
	}

	public NoAccessSignal(String message) {
		super(message);
	}

	public NoAccessSignal(Throwable cause) {
		super(cause);
	}

	public NoAccessSignal(Throwable cause, String message) {
		super(message, cause);
	}

}
