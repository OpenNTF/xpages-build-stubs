package com.ibm.xsp.registry;

import java.util.Collection;

public abstract class AbstractFacesDefinition implements FacesDefinition {

	@Override
	public Object getExtension(String var1) {
		return null;
	}

	@Override
	public void setExtension(String var1, Object var2) {
		
	}

	@Override
	public String getTagName() {
		return null;
	}

	@Override
	public String getNamespaceUri() {
		return null;
	}

	@Override
	public String getFirstDefaultPrefix() {
		return null;
	}

	@Override
	public FacesLibraryFragment getFile() {
		return null;
	}

	@Override
	public FacesDefinition getParent() {
		return null;
	}

	@Override
	public String getId() {
		return null;
	}

	@Override
	public Class<?> getJavaClass() {
		return null;
	}

	@Override
	public FacesProperty getProperty(String var1) {
		return null;
	}

	@Override
	public boolean isProperty(String var1) {
		return false;
	}

	@Override
	public boolean isDefinedProperty(String var1) {
		return false;
	}

	@Override
	public boolean isTag() {
		return false;
	}

	@Override
	public String getDefaultProperty() {
		return null;
	}

	@Override
	public FacesProperty getDefaultFacesProperty() {
		return null;
	}

	@Override
	public Collection<String> getDefinedPropertyNames() {
		return null;
	}

	@Override
	public Collection<String> getDefinedInlinePropertyNames() {
		return null;
	}

	@Override
	public Collection<String> getPropertyNames() {
		return null;
	}

	@Override
	public Collection<String> getGroupTypeRefs() {
		return null;
	}

	@Override
	public boolean isGroupProperty(String var1) {
		return false;
	}

	@Override
	public String getSince() {
		return null;
	}

	@Override
	public String getReferenceId() {
		return null;
	}

}
