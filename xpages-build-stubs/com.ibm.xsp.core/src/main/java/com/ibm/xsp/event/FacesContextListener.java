package com.ibm.xsp.event;

import javax.faces.context.FacesContext;

public interface FacesContextListener {
	void beforeContextReleased(FacesContext facesContext);

	void beforeRenderingPhase(FacesContext facesContext);
}
