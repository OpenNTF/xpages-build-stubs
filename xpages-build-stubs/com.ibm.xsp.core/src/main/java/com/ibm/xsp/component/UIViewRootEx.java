package com.ibm.xsp.component;

import java.util.List;

import javax.faces.FacesException;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;

import com.ibm.xsp.acl.ACL;
import com.ibm.xsp.application.NavigationRule;
import com.ibm.xsp.complex.Attr;
import com.ibm.xsp.complex.ViewRootBaseUrl;
import com.ibm.xsp.model.DataContext;
import com.ibm.xsp.model.DataSource;
import com.ibm.xsp.page.FacesComponentBuilder;
import com.ibm.xsp.resource.Resource;
import com.ibm.xsp.stylekit.ThemeControl;

public class UIViewRootEx extends UIViewRoot implements FacesComponent, FacesDataProvider, FacesPageProvider, FacesAutoForm, ThemeControl, FacesAttrsObject {

	@Override
	public List<Attr> getAttrs() {
		return null;
	}

	@Override
	public void addAttr(Attr var1) {
	}

	@Override
	public String getStyleKitFamily() {
		return null;
	}

	@Override
	public boolean isCreateForm() {
		return false;
	}

	@Override
	public void setCreateForm(boolean var1) {
	}

	@Override
	public void addResource(Resource var1) {
	}

	@Override
	public void addNavigationRule(NavigationRule var1) {
	}

	@Override
	public void setAfterPageLoad(MethodBinding var1) {
	}

	@Override
	public void setOnClientLoad(String var1) {
	}

	@Override
	public void setBeforePageLoad(MethodBinding var1) {
	}

	@Override
	public void setAfterRenderResponse(MethodBinding var1) {
	}

	@Override
	public void setAfterRestoreView(MethodBinding var1) {
	}

	@Override
	public void setBeforeRenderResponse(MethodBinding var1) {
	}

	@Override
	public void setDojoTheme(boolean var1) {
	}

	@Override
	public void setDojoParseOnLoad(boolean var1) {
	}

	@Override
	public void setEnableModifiedFlag(boolean var1) {
	}

	@Override
	public void setModifiedMessage(String var1) {
	}

	@Override
	public void setModifiedControl(String var1) {
	}

	@Override
	public void setDojoForm(boolean var1) {
	}

	@Override
	public void setPageBaseUrl(ViewRootBaseUrl var1) {
	}

	@Override
	public void setPageManifest(String var1) {
	}

	@Override
	public void setAcl(ACL var1) {
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
	public void initBeforeContents(FacesContext var1) throws FacesException {
	}

	@Override
	public void buildContents(FacesContext var1, FacesComponentBuilder var2) throws FacesException {
	}

	@Override
	public void initAfterContents(FacesContext var1) throws FacesException {
	}

	public boolean isDojoTheme() {
		return false;
	}
	
	public boolean isDojoParseOnLoad() {
		return false;
	}
}
