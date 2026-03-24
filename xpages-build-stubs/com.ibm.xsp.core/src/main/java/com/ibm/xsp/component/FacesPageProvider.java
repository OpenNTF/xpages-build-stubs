package com.ibm.xsp.component;

import javax.faces.el.MethodBinding;

import com.ibm.xsp.acl.ACL;
import com.ibm.xsp.application.NavigationRule;
import com.ibm.xsp.complex.ViewRootBaseUrl;
import com.ibm.xsp.resource.Resource;

public interface FacesPageProvider {
	void addResource(Resource var1);

	void addNavigationRule(NavigationRule var1);

	void setAfterPageLoad(MethodBinding var1);

	void setOnClientLoad(String var1);

	void setBeforePageLoad(MethodBinding var1);

	void setAfterRenderResponse(MethodBinding var1);

	void setAfterRestoreView(MethodBinding var1);

	void setBeforeRenderResponse(MethodBinding var1);

	void setDojoTheme(boolean var1);

	void setDojoParseOnLoad(boolean var1);

	void setEnableModifiedFlag(boolean var1);

	void setModifiedMessage(String var1);

	void setModifiedControl(String var1);

	void setDojoForm(boolean var1);

	void setPageBaseUrl(ViewRootBaseUrl var1);

	void setPageManifest(String var1);

	void setAcl(ACL var1);
}
