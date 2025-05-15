package com.ibm.domino.xsp.module.nsf;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.ibm.designer.domino.napi.NotesAPIException;
import com.ibm.designer.domino.napi.NotesDatabase;

import lotus.domino.Database;
import lotus.domino.Session;

public final class NotesContext {

	public static NotesContext getCurrent() {
		return null;
	}

	public static NotesContext getCurrentUnchecked() {
		return null;
	}

	public static void initThread(NotesContext var0) {

	}

	public static void termThread() {

	}

	public NotesContext(NSFComponentModule var1) {

	}

	public NSFComponentModule getModule() {
		return null;
	}

	public Database getCurrentDatabase() {
		return null;
	}

	public Session getCurrentSession() {
		return null;
	}

	public Session getSessionAsSigner() throws SecurityException {
		return null;
	}

	public Session getSessionAsSignerFullAdmin() throws SecurityException {
		return null;
	}

	public Session getSessionAsSigner(boolean var1) throws SecurityException {
		return null;
	}

	public NotesDatabase getNotesDatabase() throws NotesAPIException {
		return null;
	}

	public void initRequest(HttpServletRequest var1) throws ServletException {

	}
}
