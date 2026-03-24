package com.ibm.xsp.http.fileupload;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

public interface FileItem extends Serializable, FileItemHeadersSupport {
	InputStream getInputStream() throws IOException;

	String getContentType();

	String getName();

	boolean isInMemory();

	long getSize();

	byte[] get();

	String getString(String var1) throws UnsupportedEncodingException;

	String getString();

	void write(File var1) throws Exception;

	void delete();

	String getFieldName();

	void setFieldName(String var1);

	boolean isFormField();

	void setFormField(boolean var1);

	OutputStream getOutputStream() throws IOException;
}