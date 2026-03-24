package com.ibm.xsp.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;

@SuppressWarnings("rawtypes")
public class TypedUtil {
	public static Map<String, Object> getRequestMap(ExternalContext var0) {
		return null;
	}

	public static Map<String, String> getRequestHeaderMap(ExternalContext var0) {
		return null;
	}

	public static Map<String, String> getRequestParameterMap(ExternalContext var0) {
		return null;
	}

	public static Map<String, Cookie> getRequestCookieMap(ExternalContext var0) {
		return null;
	}

	public static Map<String, Object> getSessionMap(ExternalContext var0) {
		return null;
	}

	public static Iterator<FacesMessage> getMessages(FacesContext var0) {
		return null;
	}

	@SuppressWarnings("unchecked")
	public static Iterator<FacesMessage> getMessages(FacesContext var0, String var1) {
		return var0.getMessages(var1);
	}

	public static List<UIComponent> getChildren(UIComponent var0) {
		return null;
	}

	public static Iterator<UIComponent> getFacetsAndChildren(UIComponent var0) {
		return null;
	}

	public static Map<String, UIComponent> getFacets(UIComponent var0) {
		return null;
	}

	public static Map<String, Object> getAttributes(UIComponent var0) {
		return null;
	}

	@Deprecated
	public static Map<String, Object> toAttributes(Map var0) {
		return null;
	}

	public static <T, U> Map<T, U> toAnyMap(Map<?, ?> var0) {
		return null;
	}
}