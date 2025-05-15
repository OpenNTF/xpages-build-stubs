package javax.faces.event;

@SuppressWarnings("rawtypes")
public class PhaseId implements Comparable {
	public static final PhaseId ANY_PHASE = new PhaseId(null);
	public static final PhaseId RESTORE_VIEW = new PhaseId(null);
	public static final PhaseId APPLY_REQUEST_VALUES = new PhaseId(null);
	public static final PhaseId PROCESS_VALIDATIONS = new PhaseId(null);
	public static final PhaseId UPDATE_MODEL_VALUES = new PhaseId(null);
	public static final PhaseId INVOKE_APPLICATION = new PhaseId(null);
	public static final PhaseId RENDER_RESPONSE = new PhaseId(null);

	private PhaseId(String var1) {

	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	public int getOrdinal() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
