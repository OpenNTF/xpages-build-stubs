package javax.faces.application;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.el.MethodBinding;
import javax.faces.el.PropertyResolver;
import javax.faces.el.ReferenceSyntaxException;
import javax.faces.el.ValueBinding;
import javax.faces.el.VariableResolver;
import javax.faces.event.ActionListener;
import javax.faces.validator.Validator;

@SuppressWarnings("rawtypes")
public abstract class Application {
	public abstract ActionListener getActionListener();

	public abstract void setActionListener(ActionListener var1);

	public abstract Locale getDefaultLocale();

	public abstract void setDefaultLocale(Locale var1);

	public abstract String getDefaultRenderKitId();

	public abstract void setDefaultRenderKitId(String var1);

	public abstract String getMessageBundle();

	public abstract void setMessageBundle(String var1);

	public abstract NavigationHandler getNavigationHandler();

	public abstract void setNavigationHandler(NavigationHandler var1);

	public abstract PropertyResolver getPropertyResolver();

	public abstract void setPropertyResolver(PropertyResolver var1);

	public abstract VariableResolver getVariableResolver();

	public abstract void setVariableResolver(VariableResolver var1);

	public abstract ViewHandler getViewHandler();

	public abstract void setViewHandler(ViewHandler var1);

	public abstract StateManager getStateManager();

	public abstract void setStateManager(StateManager var1);

	public abstract void addComponent(String var1, String var2);

	public abstract UIComponent createComponent(String var1) throws FacesException;

	public abstract UIComponent createComponent(ValueBinding var1, FacesContext var2, String var3)
			throws FacesException;

	public abstract Iterator getComponentTypes();

	public abstract void addConverter(String var1, String var2);

	public abstract void addConverter(Class var1, String var2);

	public abstract Converter createConverter(String var1);

	public abstract Converter createConverter(Class var1);

	public abstract Iterator getConverterIds();

	public abstract Iterator getConverterTypes();

	public abstract MethodBinding createMethodBinding(String var1, Class[] var2) throws ReferenceSyntaxException;

	public abstract Iterator getSupportedLocales();

	public abstract void setSupportedLocales(Collection var1);

	public abstract void addValidator(String var1, String var2);

	public abstract Validator createValidator(String var1) throws FacesException;

	public abstract Iterator getValidatorIds();

	public abstract ValueBinding createValueBinding(String var1) throws ReferenceSyntaxException;
}
