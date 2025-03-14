package org.hbrs.se1.ws24.solutions.uebung9;

public class GraficDocument extends AbstractCoreDocument {
	
	private final static int SIZE = 1200;
	
	private String url;
	
	public GraficDocument( String url ){
		this.url= url;
	}

	@Override
	public int size() {
		return SIZE;
	}

}
