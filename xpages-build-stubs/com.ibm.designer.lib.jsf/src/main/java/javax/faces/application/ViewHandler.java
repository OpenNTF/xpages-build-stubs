package javax.faces.application;

import java.io.IOException;
import java.util.Locale;

import javax.faces.FacesException;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

public abstract class ViewHandler {
	public static final String CHARACTER_ENCODING_KEY = "javax.faces.request.charset"; //$NON-NLS-1$
	public static final String DEFAULT_SUFFIX_PARAM_NAME = "javax.faces.DEFAULT_SUFFIX"; //$NON-NLS-1$
	public static final String DEFAULT_SUFFIX = ".jsp"; //$NON-NLS-1$

	public abstract Locale calculateLocale(FacesContext var1);

	public abstract String calculateRenderKitId(FacesContext var1);

	public abstract UIViewRoot createView(FacesContext var1, String var2);

	public abstract String getActionURL(FacesContext var1, String var2);

	public abstract String getResourceURL(FacesContext var1, String var2);

	public abstract void renderView(FacesContext var1, UIViewRoot var2) throws IOException, FacesException;

	public abstract UIViewRoot restoreView(FacesContext var1, String var2);

	public abstract void writeState(FacesContext var1) throws IOException;
}
