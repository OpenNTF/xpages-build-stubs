package com.ibm.xsp.page.parse;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class FacesReader {
	public interface ReaderContent {
		
	}
	public static class Tag implements ReaderContent {
		
	}
	
	public FacesReader(InputStream var1) throws ParserConfigurationException, SAXException, IOException {
		
	}
	
	public FacesReader(Document var1) {
		
	}
	
	public Tag getRootTag() {
		return null;
	}
}
