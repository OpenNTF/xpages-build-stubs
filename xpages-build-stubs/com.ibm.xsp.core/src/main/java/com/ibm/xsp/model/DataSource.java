package com.ibm.xsp.model;

import javax.faces.context.FacesContext;

import com.ibm.xsp.FacesExceptionEx;

public interface DataSource extends DataPublishingObject {
	String getBeanId();

	String getUniqueId();

	String[] getVars();

	String getVar();

	void setVar(String var1);

	String getScope();

	void setScope(String var1);

	boolean isReadonly();

	boolean isIgnoreRequestParams();

	void setIgnoreRequestParams(boolean var1);

	String getRequestParamPrefix();

	void setRequestParamPrefix(String var1);

	boolean save(FacesContext var1, boolean var2) throws FacesExceptionEx;

	void refresh();

	DataContainer getDataContainer() throws FacesExceptionEx;
}
