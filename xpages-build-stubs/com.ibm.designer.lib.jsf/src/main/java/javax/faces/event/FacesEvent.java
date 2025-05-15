package javax.faces.event;

import javax.faces.component.UIComponent;

public abstract class FacesEvent {
	public FacesEvent(UIComponent var1) {

	}

	public UIComponent getComponent() {
		return null;
	}

	public PhaseId getPhaseId() {
		return null;
	}

	public void setPhaseId(PhaseId var1) {

	}

	public void queue() {

	}

	public abstract boolean isAppropriateListener(FacesListener var1);

	public abstract void processListener(FacesListener var1);
}
