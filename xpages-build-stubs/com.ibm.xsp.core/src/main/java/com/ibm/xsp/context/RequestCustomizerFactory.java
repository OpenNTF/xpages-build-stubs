package com.ibm.xsp.context;

import javax.faces.context.FacesContext;

public abstract class RequestCustomizerFactory {
	public abstract void initializeParameters(FacesContext facesContext, RequestParameters requestParameters);
}
