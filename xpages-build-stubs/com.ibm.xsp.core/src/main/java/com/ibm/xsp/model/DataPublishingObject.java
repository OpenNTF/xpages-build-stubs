package com.ibm.xsp.model;

import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import com.ibm.xsp.FacesExceptionEx;
import com.ibm.xsp.util.DataPublisher;

public interface DataPublishingObject {
	void pushData(FacesContext var1, UIComponent var2, Map<String, Object> var3,
			List<DataPublisher.ShadowedObject> var4) throws FacesExceptionEx;

	void popData(FacesContext var1, UIComponent var2, Map<String, Object> var3) throws FacesExceptionEx;
}
