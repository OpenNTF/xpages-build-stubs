package com.ibm.domino.xsp.module.nsf;

import lotus.domino.NotesException;
import lotus.domino.Session;

public abstract class SessionCloner {
	public static SessionCloner getSessionCloner() {
		return null;
	}
	public Session getSession() throws NotesException {
		return null;
	}
}
