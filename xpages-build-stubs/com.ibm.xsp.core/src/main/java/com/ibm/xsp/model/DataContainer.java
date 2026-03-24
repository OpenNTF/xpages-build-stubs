package com.ibm.xsp.model;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public interface DataContainer extends Serializable {
	String getBeanId();

	String getId();

	void destroy();

	void serialize(ObjectOutput var1) throws IOException;

	void deserialize(ObjectInput var1) throws IOException;
}
