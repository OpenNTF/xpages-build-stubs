package com.ibm.xsp.model.domino;

import javax.faces.el.EvaluationException;
import javax.faces.el.PropertyNotFoundException;
import javax.faces.el.PropertyResolver;

public class DominoDocumentPropertyResolver extends PropertyResolver {
	public static final DominoDocumentPropertyResolver instance = new DominoDocumentPropertyResolver();

	@Override
	public boolean isReadOnly(Object var1, Object var2) throws EvaluationException, PropertyNotFoundException {
		return false;
	}

	@Override
	public boolean isReadOnly(Object var1, int var2) throws EvaluationException, PropertyNotFoundException {
		return false;
	}

	@Override
	public Object getValue(Object var1, Object var2) throws EvaluationException, PropertyNotFoundException {
		return null;
	}

	@Override
	public Object getValue(Object var1, int var2) throws EvaluationException, PropertyNotFoundException {
		return null;
	}

	@Override
	public Class getType(Object var1, Object var2) throws EvaluationException, PropertyNotFoundException {
		return null;
	}

	@Override
	public Class getType(Object var1, int var2) throws EvaluationException, PropertyNotFoundException {
		return null;
	}

	@Override
	public void setValue(Object var1, Object var2, Object var3) throws EvaluationException, PropertyNotFoundException {

	}

	@Override
	public void setValue(Object var1, int var2, Object var3) throws EvaluationException, PropertyNotFoundException {

	}

}
