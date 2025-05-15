package com.ibm.xsp.renderkit;

import java.util.Iterator;

import javax.faces.context.FacesContext;
import javax.faces.render.RenderKit;
import javax.faces.render.RenderKitFactory;

public class ReadOnlyRenderKitFactory extends RenderKitFactory {

	@Override
	public void addRenderKit(String var1, RenderKit var2) {
		
	}

	@Override
	public RenderKit getRenderKit(FacesContext var1, String var2) {
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator getRenderKitIds() {
		return null;
	}

}
