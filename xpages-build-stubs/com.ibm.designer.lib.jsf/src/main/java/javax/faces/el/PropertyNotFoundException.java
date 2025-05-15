package javax.faces.el;

import javax.faces.FacesException;

public class PropertyNotFoundException extends FacesException {

	public PropertyNotFoundException() {
		super();
	}

	public PropertyNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PropertyNotFoundException(String message) {
		super(message);
	}

	public PropertyNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
