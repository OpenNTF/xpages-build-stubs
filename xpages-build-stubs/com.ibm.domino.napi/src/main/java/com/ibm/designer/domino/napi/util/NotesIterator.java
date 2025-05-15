package com.ibm.designer.domino.napi.util;

import java.util.Iterator;

import com.ibm.designer.domino.napi.NotesAPIException;

@SuppressWarnings("rawtypes")
public interface NotesIterator extends Iterator {
	void recycle() throws NotesAPIException;
}
