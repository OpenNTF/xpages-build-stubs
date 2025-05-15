package javax.servlet;

import java.io.IOException;
import java.io.InputStream;

public abstract class ServletInputStream extends InputStream {
	protected ServletInputStream() {
	}

	public int readLine(byte[] b, int off, int len) throws IOException {
		return 0;
	}
}
