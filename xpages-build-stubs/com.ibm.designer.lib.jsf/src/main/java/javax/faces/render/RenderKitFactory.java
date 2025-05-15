package javax.faces.render;

import java.util.Iterator;

import javax.faces.context.FacesContext;

public abstract class RenderKitFactory {
	public static final String HTML_BASIC_RENDER_KIT = "HTML_BASIC"; //$NON-NLS-1$

	public abstract void addRenderKit(String var1, RenderKit var2);

	public abstract RenderKit getRenderKit(FacesContext var1, String var2);

	@SuppressWarnings("rawtypes")
	public abstract Iterator getRenderKitIds();
}
