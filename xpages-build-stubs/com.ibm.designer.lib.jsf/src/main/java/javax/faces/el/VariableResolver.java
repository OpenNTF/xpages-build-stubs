package javax.faces.el;

import javax.faces.context.FacesContext;

public abstract class VariableResolver {
	public abstract Object resolveVariable(FacesContext var1, String var2) throws EvaluationException;
}
