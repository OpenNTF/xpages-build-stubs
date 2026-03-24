package com.ibm.xsp.component;

import java.util.List;

import com.ibm.xsp.model.DataContext;
import com.ibm.xsp.model.DataSource;

public interface FacesDataProvider {
	String DATA = "data"; //$NON-NLS-1$
	String DATA_CONTEXTS = "dataContexts"; //$NON-NLS-1$

	List<DataSource> getData();

	void addData(DataSource var1);

	List<DataContext> getDataContexts();

	void addDataContext(DataContext var1);
}
