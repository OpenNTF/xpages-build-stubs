package com.ibm.designer.runtime.domino.adapter;

import javax.servlet.ServletException;

public interface IServletFactory {
	void init(ComponentModule var1);

	ServletMatch getServletMatch(String var1, String var2) throws ServletException;
}
