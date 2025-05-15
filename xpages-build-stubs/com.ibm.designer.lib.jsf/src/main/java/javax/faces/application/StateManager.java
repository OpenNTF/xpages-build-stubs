package javax.faces.application;

import java.io.IOException;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

public abstract class StateManager {
	public static final String STATE_SAVING_METHOD_PARAM_NAME = "javax.faces.STATE_SAVING_METHOD"; //$NON-NLS-1$
	public static final String STATE_SAVING_METHOD_CLIENT = "client"; //$NON-NLS-1$
	public static final String STATE_SAVING_METHOD_SERVER = "server"; //$NON-NLS-1$

	public abstract SerializedView saveSerializedView(FacesContext var1);

	protected abstract Object getTreeStructureToSave(FacesContext var1);

	protected abstract Object getComponentStateToSave(FacesContext var1);

	public abstract void writeState(FacesContext var1, SerializedView var2) throws IOException;

	public abstract UIViewRoot restoreView(FacesContext var1, String var2, String var3);

	protected abstract UIViewRoot restoreTreeStructure(FacesContext var1, String var2, String var3);

	protected abstract void restoreComponentState(FacesContext var1, UIViewRoot var2, String var3);

	public boolean isSavingStateInClient(FacesContext var1) {
		return false;
	}

	public class SerializedView {
		public SerializedView(Object var2, Object var3) {
		}

		public Object getStructure() {
			return null;
		}

		public Object getState() {
			return null;
		}
	}
}
