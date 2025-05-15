package javax.faces;

public final class FactoryFinder {
	public static final String APPLICATION_FACTORY = "javax.faces.application.ApplicationFactory"; //$NON-NLS-1$
	public static final String FACES_CONTEXT_FACTORY = "javax.faces.context.FacesContextFactory"; //$NON-NLS-1$
	public static final String LIFECYCLE_FACTORY = "javax.faces.lifecycle.LifecycleFactory"; //$NON-NLS-1$
	public static final String RENDER_KIT_FACTORY = "javax.faces.render.RenderKitFactory"; //$NON-NLS-1$

	public static Object getFactory(String var0) throws FacesException {
		return null;
	}

	public static void releaseFactories() throws FacesException {

	}

	public static void setFactory(String var0, String var1) {

	}
}
