package com.ibm.xsp.http.fileupload.servlet;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ibm.xsp.http.fileupload.FileItem;
import com.ibm.xsp.http.fileupload.FileItemFactory;
import com.ibm.xsp.http.fileupload.FileUploadException;

public class ServletFileUpload {
	public ServletFileUpload(FileItemFactory var1) {
		
	}
	
	public Map<String, List<FileItem>> parseParameterMap(HttpServletRequest var1) throws FileUploadException {
		return null;
	}
}
