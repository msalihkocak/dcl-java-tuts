package com.example.banking.domain;

import java.io.Closeable;
import java.io.IOException;

public class PreciousResource implements Closeable {
	private int id;
	
	public PreciousResource(int id) {
		this.id = id;
	}

	@Override
	public void close() throws IOException {
		System.err.println("Closing the resource "+id);
		throw new IOException("Ooops!");
	}

}
