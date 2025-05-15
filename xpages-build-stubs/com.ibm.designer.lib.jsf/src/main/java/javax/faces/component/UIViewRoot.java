package javax.faces.component;

import java.util.Map;

import javax.faces.context.FacesContext;

@SuppressWarnings("rawtypes")
public class UIViewRoot extends UIComponentBase {

	@Override
	public Object saveState(FacesContext var1) {
		return null;
	}

	@Override
	public void restoreState(FacesContext var1, Object var2) {
	}

	@Override
	public boolean isTransient() {
		return false;
	}

	@Override
	public void setTransient(boolean var1) {

	}
	
	public Map getViewMap() {
		return null;
	}

}
