package com.ibm.xsp.http.fileupload;

public class FileUploadException extends Exception {

	public FileUploadException() {
	}

	public FileUploadException(String message) {
		super(message);
	}

	public FileUploadException(String message, Throwable cause) {
		super(message, cause);
	}
}
