package javax.faces;

public class FacesException extends RuntimeException {

	public FacesException() {
		super();
	}

	public FacesException(String message, Throwable cause) {
		super(message, cause);
	}

	public FacesException(String message) {
		super(message);
	}

	public FacesException(Throwable cause) {
		super(cause);
	}
	
}
