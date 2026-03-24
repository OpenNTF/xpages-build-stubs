package com.ibm.domino.napi.c;

import java.util.Vector;
import lotus.domino.Database;
import lotus.domino.Document;
import lotus.domino.DxlExporter;
import lotus.domino.DxlImporter;
import lotus.domino.Form;
import lotus.domino.NotesException;
import lotus.domino.Session;
import lotus.domino.ViewEntry;

public class BackendBridge {
	public static final native long getDatabaseHandleRO(Database paramDatabase);

	public static final native long getDocumentHandleRW(Document paramDocument);

	public static final native long detachDatabaseHandle(Database paramDatabase);

	public static final native long detachDocumentHandle(Document paramDocument);

	public static final native Database createDatabase(Session paramSession, long paramLong);

	public static final native Document createDocument(Database paramDatabase, long paramLong);

	public static final native void dxlExporterSetExtendedOptions(DxlExporter paramDxlExporter, int paramInt);

	public static final native void dxlImporterSetExtendedOptions(DxlImporter paramDxlImporter, int paramInt,
			String paramString);

	public static native Database setContextDatabaseContext2(Session paramSession, long paramLong, Class<?> paramClass)
			throws NotesException;

	public static native boolean computeWithForm(Document paramDocument, boolean paramBoolean1, boolean paramBoolean2)
			throws NotesException;

	public static native boolean computeWithFormExt(Document paramDocument, Form paramForm, boolean paramBoolean1,
			boolean paramBoolean2) throws NotesException;

	public static native void passThroughSecurityErrors(Database paramDatabase, boolean paramBoolean);

	public static native ViewEntry getViewEntryByKeyWithOptions(Object paramObject, Vector<?> paramVector, int paramInt)
			throws NotesException;

	public static native void setNoRecycle(Session paramSession, Object paramObject, boolean paramBoolean);

	public static native void forceRecycle(Session paramSession, Object paramObject);

	public static native Session createXPageSession(String paramString, long paramLong, boolean paramBoolean1,
			boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) throws NotesException;
}
