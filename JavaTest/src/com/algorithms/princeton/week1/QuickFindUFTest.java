package com.algorithms.princeton.week1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickFindUFTest {

	QuickFindUF quickFind;
	@Before
	public void setUp() throws Exception {
		quickFind = new QuickFindUF(10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsConnected() {
		assertFalse(!(quickFind.isConnected(1, 2)));
	}

	@Test
	public void testFind() {
		//fail("Not yet implemented");
	}

	@Test
	public void testUnion() {
		//fail("Not yet implemented");
	}

}
