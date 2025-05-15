package com.ibm.domino.napi.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public class DominoSSLSocketFactory extends SSLSocketFactory {

	public DominoSSLSocketFactory() {
	}

	@Override
	public String[] getDefaultCipherSuites() {
		return null;
	}

	@Override
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@Override
	public Socket createSocket(Socket s, String host, int port, boolean autoClose) throws IOException {
		return null;
	}

	@Override
	public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
		return null;
	}

	@Override
	public Socket createSocket(String host, int port, InetAddress localHost, int localPort)
			throws IOException, UnknownHostException {
		return null;
	}

	@Override
	public Socket createSocket(InetAddress host, int port) throws IOException {
		return null;
	}

	@Override
	public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort)
			throws IOException {
		return null;
	}

	protected DominoX509KeyManager createDominoX509KeyManager() {
		return null;
	}

	protected DominoX509TrustManager createDominoX509TrustManager() {
		return null;
	}
	protected SSLContext createSSLContext() {
		return null;
	}
}
