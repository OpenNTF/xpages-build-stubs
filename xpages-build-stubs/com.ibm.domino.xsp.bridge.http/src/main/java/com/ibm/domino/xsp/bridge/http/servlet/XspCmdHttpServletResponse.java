package com.ibm.domino.xsp.bridge.http.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;

import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpServletResponseAdapter;

public class XspCmdHttpServletResponse implements HttpServletResponseAdapter {

	@Override
	public void addCookie(Cookie var1) {
	}

	@Override
	public void addDateHeader(String var1, long var2) {
	}

	@Override
	public void addHeader(String var1, String var2) {
	}

	@Override
	public void addIntHeader(String var1, int var2) {
	}

	@Override
	public boolean containsHeader(String var1) {
		return false;
	}

	@Override
	public String encodeRedirectUrl(String var1) {
		return null;
	}

	@Override
	public String encodeRedirectURL(String var1) {
		return null;
	}

	@Override
	public String encodeUrl(String var1) {
		return null;
	}

	@Override
	public String encodeURL(String var1) {
		return null;
	}

	@Override
	public void flushBuffer() throws IOException {
	}

	@Override
	public int getBufferSize() {
		return 0;
	}

	@Override
	public String getCharacterEncoding() {
		return null;
	}

	@Override
	public String getContentType() {
		return null;
	}

	@Override
	public Locale getLocale() {
		return null;
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		return null;
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		return null;
	}

	@Override
	public boolean isCommitted() {
		return false;
	}

	@Override
	public void reset() {
		
	}

	@Override
	public void resetBuffer() {
		
	}

	@Override
	public void sendError(int var1, String var2) throws IOException {
	}

	@Override
	public void sendError(int var1) throws IOException {
	}

	@Override
	public void sendRedirect(String var1) throws IOException {
	}

	@Override
	public void setBufferSize(int var1) {
	}

	@Override
	public void setCharacterEncoding(String var1) {
		
	}

	@Override
	public void setContentLength(int var1) {
		
	}

	@Override
	public void setContentType(String var1) {
		
	}

	@Override
	public void setDateHeader(String var1, long var2) {
		
	}

	@Override
	public void setHeader(String var1, String var2) {
	}

	@Override
	public void setIntHeader(String var1, int var2) {
	}

	@Override
	public void setLocale(Locale var1) {
	}

	@Override
	public void setStatus(int var1, String var2) {
	}

	@Override
	public void setStatus(int var1) {
		
	}

	public boolean writerInUse() {
		return false;
	}
	
	public boolean outputStreamInUse() {
		return false;
	}
}
