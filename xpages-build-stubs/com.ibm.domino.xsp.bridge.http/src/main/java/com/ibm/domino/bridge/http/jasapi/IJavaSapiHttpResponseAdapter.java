package com.ibm.domino.bridge.http.jasapi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletOutputStream;

public interface IJavaSapiHttpResponseAdapter {
	String getCharacterEncoding();

	void setCharacterEncoding(String var1);

	boolean writerInUse();

	boolean outputStreamInUse();

	void setStatus(int var1, String var2);

	void setStatus(int var1);

	void setHeader(String var1, String var2);

	void setHeader(String var1);

	boolean containsHeader(String var1);

	void setIntHeader(String var1, int var2);

	ServletOutputStream getOutputStream();

	PrintWriter getWriter() throws IOException;

	void writeHeaders();

	void write(byte[] var1, int var2, int var3) throws IOException;

	int getBufferSize();

	void setBufferSize(int var1);

	void flushBuffer() throws IOException;

	boolean isCommitted();

	void reset();

	void resetBuffer();
}