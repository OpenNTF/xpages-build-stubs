package com.ibm.designer.domino.napi;

public abstract class NotesHandle extends NotesObject implements NotesConstants {
	public final int getHandle() {
		return 0;
	}
	
	public final boolean isValidHandle() throws NotesAPIException {
		return false;
	}
	
	public final void checkHandle() throws NotesAPIException {
		
	}
}
