package javax.faces.event;

import javax.faces.component.UIComponent;

public class ActionEvent extends FacesEvent {

	public ActionEvent(UIComponent var1) {
		super(var1);
	}

	@Override
	public boolean isAppropriateListener(FacesListener var1) {
		return false;
	}

	@Override
	public void processListener(FacesListener var1) {
		
	}

}
