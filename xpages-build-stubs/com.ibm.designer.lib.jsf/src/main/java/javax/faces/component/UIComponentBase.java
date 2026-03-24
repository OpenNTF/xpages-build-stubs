package javax.faces.component;

import javax.faces.context.FacesContext;

public abstract class UIComponentBase extends UIComponent {

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
	
	@Override
	public void setRendererType(String var1) {
	}
}
