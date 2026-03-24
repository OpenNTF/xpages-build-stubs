package com.ibm.xsp.component;

import java.util.List;

import javax.faces.FacesException;
import javax.faces.context.FacesContext;

import com.ibm.xsp.complex.Attr;
import com.ibm.xsp.dojo.DojoAttribute;
import com.ibm.xsp.dojo.FacesDojoComponent;
import com.ibm.xsp.model.DataContext;
import com.ibm.xsp.model.DataSource;
import com.ibm.xsp.page.FacesComponentBuilder;
import com.ibm.xsp.stylekit.ThemeControl;

public class UIPanelEx extends UIDataPanelBase implements ThemeControl, FacesDojoComponent, FacesAttrsObject {
	public static final String COMPONENT_TYPE = "com.ibm.xsp.Panel"; //$NON-NLS-1$
	public static final String RENDERER_TYPE = "javax.faces.Panel"; //$NON-NLS-1$

	@Override
	public void initBeforeContents(FacesContext var1) throws FacesException {
	}

	@Override
	public void buildContents(FacesContext var1, FacesComponentBuilder var2) throws FacesException {
	}

	@Override
	public void initAfterContents(FacesContext var1) throws FacesException {
	}

	@Override
	public List<DataSource> getData() {
		return null;
	}

	@Override
	public void addData(DataSource var1) {
	}

	@Override
	public List<DataContext> getDataContexts() {
		return null;
	}

	@Override
	public void addDataContext(DataContext var1) {
	}

	@Override
	public List<Attr> getAttrs() {
		return null;
	}

	@Override
	public void addAttr(Attr var1) {
	}

	@Override
	public String getDojoType() {
		return null;
	}

	@Override
	public List<DojoAttribute> getDojoAttributes() {
		return null;
	}

	@Override
	public String getStyleKitFamily() {
		return null;
	}

}
