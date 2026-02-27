package com.ibm.designer.runtime.domino.adapter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Set;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.designer.runtime.domino.adapter.servlet.LCDAdapterHttpSession;
import com.ibm.designer.runtime.domino.adapter.servlet.LCDAdapterServletContext;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpServletRequestAdapter;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpServletResponseAdapter;
import com.ibm.designer.runtime.domino.bootstrap.adapter.HttpSessionAdapter;

@SuppressWarnings("rawtypes")
public abstract class ComponentModule {
	protected abstract class ServletInvoker {
		public abstract OutputStream getOutputStream() throws IOException;
		
		public abstract void setHeader(String headerName, String value);
	}

	public class RestartModuleSignal extends Error {
		public RestartModuleSignal(ComponentModule var2) {

		}
	}

	public ComponentModule(LCDEnvironment var1, HttpService var2, String var3, boolean var4) {

	}

	public long getLastRefresh() {
		return 0;
	}

	public abstract ClassLoader getModuleClassLoader();

	public abstract URL getResource(String var1) throws MalformedURLException;

	public final String getModuleName() {
		return null;
	}

	public Map<String, Object> getAttributes() {
		return null;
	}

	public abstract InputStream getResourceAsStream(String var1);

	public abstract boolean getResourceAsStream(OutputStream var1, String var2);

	public boolean isExpired(long var1) {
		return false;
	}

	public final Servlet createServlet(Servlet var1, String var2, Map var3) throws ServletException {
		return null;
	}

	public ServletContext getServletContext() {
		return null;
	}

	public HttpService getHttpService() {
		return null;
	}

	protected abstract void doInitModule();

	public String getWelcomePage() {
		return null;
	}

	protected abstract void doDestroyModule();

	public void doService(String contextPath, String pathInfo, HttpSessionAdapter httpSessionAdapter,
			HttpServletRequestAdapter servletRequest,
			HttpServletResponseAdapter servletResponse) throws javax.servlet.ServletException, IOException {

	}

	public abstract boolean exists();

	public abstract Set<String> getResourcePaths(String var1);

	public abstract boolean refresh();

	public Map<String, LCDAdapterHttpSession> getSessions() {
		return null;
	}

	public abstract boolean shouldRefresh();

	public ServletMatch getServlet(String var1) throws ServletException {
		return null;
	}

	public boolean hasServletFactories() {
		return false;
	}

	protected void invokeServlet(Servlet var1, HttpServletRequest var2, HttpServletResponse var3)
			throws ServletException, IOException {
	}

	public void notifySessionAdded(LCDAdapterHttpSession var1) {

	}

	public void notifySessionRemoved(LCDAdapterHttpSession var1) {

	}

	public boolean hasBundleResource() {
		return false;
	}

	public boolean isResourcesCache() {
		return false;
	}

	public boolean isResourcesModifiedSince(String var1, long var2) {
		return false;
	}

	public long getResourcesExpireTime(String var1) {
		return 0;
	}

	protected void writeResource(ServletInvoker var1, String var2) throws IOException {

	}

	public void initModule() {

	}

	public void updateLastModuleAccess() {

	}
	
	protected LCDAdapterServletContext createServletContext() {
		return null;
	}
	
	protected void writeResourceContent(ServletInvoker invoker, String res) throws IOException {
		
	}
	
	protected boolean shouldGZip(String paramString, int paramInt) {
		return false;
	}
	
	protected boolean supportsGzip(ServletInvoker paramServletInvoker) {
		return false;
	}
}
