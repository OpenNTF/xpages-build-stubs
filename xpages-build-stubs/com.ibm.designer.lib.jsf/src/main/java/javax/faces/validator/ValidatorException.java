package javax.faces.validator;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;

public class ValidatorException extends FacesException {

	public ValidatorException(FacesMessage var1) {
	}

	public ValidatorException(FacesMessage var1, Throwable var2) {
	}

	public FacesMessage getFacesMessage() {
		return null;
	}
}
