package javax.faces.validator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public interface Validator {
	String NOT_IN_RANGE_MESSAGE_ID = "javax.faces.validator.NOT_IN_RANGE"; //$NON-NLS-1$

	void validate(FacesContext var1, UIComponent var2, Object var3) throws ValidatorException;
}
