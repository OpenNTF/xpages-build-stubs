package javax.faces.application;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class FacesMessage implements Serializable {
	public static final String FACES_MESSAGES = "javax.faces.Messages"; //$NON-NLS-1$
	public static final Severity SEVERITY_INFO = new Severity(null);
	public static final Severity SEVERITY_WARN = new Severity(null);
	public static final Severity SEVERITY_ERROR = new Severity(null);
	public static final Severity SEVERITY_FATAL = new Severity(null);
	public static final List VALUES;
	public static final Map VALUES_MAP;

	static {
		VALUES = null;
		VALUES_MAP = null;
	}

	public FacesMessage() {
	}

	public FacesMessage(String var1) {
	}

	public FacesMessage(String var1, String var2) {
	}

	public FacesMessage(Severity var1, String var2, String var3) {
	}

	public String getDetail() {
		return null;
	}

	public void setDetail(String var1) {
	}

	public Severity getSeverity() {
		return null;
	}

	public void setSeverity(Severity var1) {
	}

	public String getSummary() {
		return null;
	}

	public void setSummary(String var1) {
	}

	public static class Severity implements Comparable {
		private Severity(String var1) {
		}

		public int compareTo(Object var1) {
			return 0;
		}

		public int getOrdinal() {
			return 0;
		}

		public String toString() {
			return null;
		}
	}
}
