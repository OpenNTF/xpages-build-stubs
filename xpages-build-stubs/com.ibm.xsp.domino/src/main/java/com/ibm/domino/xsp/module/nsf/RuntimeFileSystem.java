package com.ibm.domino.xsp.module.nsf;

import java.util.Map;

import com.ibm.designer.domino.napi.NotesConstants;

public class RuntimeFileSystem implements NotesConstants {
	public abstract static class NSFResource {

	}

	public abstract static class NSFFile extends NSFResource {
		public String getUpdatedBy() {
			return null;
		}
	}

	public Map<String, NSFResource> getAllResources() {
		return null;
	}

	public NSFResource getResource(String var1) {
		return null;
	}
}
