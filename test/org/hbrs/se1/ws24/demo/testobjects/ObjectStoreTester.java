package org.hbrs.se1.ws24.demo.testobjects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObjectStoreTester {
	private ObjectStore store1 = null;
	private ObjectStore store2 = null;
	private ObjectStore store3 = null;


	@BeforeEach
	public void setUp() {
	    store1 = new ObjectStore();
	    ObjectStore store2 = new ObjectStore();
	    store3 = store1;
	    store2 = store3;
	}

	@Test
	public void testIdentity() {
		assertNotSame( store1, store2 );
		assertSame( store1, store3 );
		assertSame( store1, store1 );
		
		assertSame( store2, store2 );
		assertNotSame( store2, store1 );
		assertNotSame( store2, store3 );
		
		assertNotSame( store3, store2 );
		assertSame( store3, store1 );
		assertSame( store3, store3 );
		
		// ...

		assertTrue ( store3 == store3  );
		assertFalse( store3 != store3  );
	}
	

}
