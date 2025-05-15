package com.ibm.designer.runtime.domino.adapter.util;

public class PageNotFoundException extends RuntimeException {

	public PageNotFoundException(String message) {
		super(message);
	}

	public PageNotFoundException(Throwable cause) {
		super(cause);
	}

	public PageNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
