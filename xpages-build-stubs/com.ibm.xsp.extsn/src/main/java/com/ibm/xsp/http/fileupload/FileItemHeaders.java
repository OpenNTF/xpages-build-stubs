package com.ibm.xsp.http.fileupload;

import java.util.Iterator;

public interface FileItemHeaders {
	String getHeader(String var1);

	Iterator<String> getHeaders(String var1);

	Iterator<String> getHeaderNames();
}
