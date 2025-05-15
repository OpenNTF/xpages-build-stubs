package javax.faces.context;

import java.util.Iterator;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIViewRoot;
import javax.faces.render.RenderKit;

@SuppressWarnings("rawtypes")
public abstract class FacesContext {
	public static FacesContext getCurrentInstance() {
		return null;
	}

	public abstract Application getApplication();

	public abstract Iterator getClientIdsWithMessages();

	public abstract ExternalContext getExternalContext();

	public abstract FacesMessage.Severity getMaximumSeverity();

	public abstract Iterator getMessages();

	public abstract Iterator getMessages(String var1);

	public abstract RenderKit getRenderKit();

	public abstract boolean getRenderResponse();

	public abstract boolean getResponseComplete();

	public abstract ResponseStream getResponseStream();

	public abstract void setResponseStream(ResponseStream var1);

	public abstract ResponseWriter getResponseWriter();

	public abstract void setResponseWriter(ResponseWriter var1);

	public abstract UIViewRoot getViewRoot();

	public abstract void setViewRoot(UIViewRoot var1);

	public abstract void addMessage(String var1, FacesMessage var2);

	public abstract void release();

	public abstract void renderResponse();

	public abstract void responseComplete();

	public ClassLoader getContextClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}
}
