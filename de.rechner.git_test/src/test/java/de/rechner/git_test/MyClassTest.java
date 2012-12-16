package de.rechner.git_test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest {

	private MyClass myClass;

	@Before
	public void setUp() throws Exception {
		myClass = new MyClass();
	}

	@Test
	public void testAdd() {
		assertEquals(5, myClass.add(3, 2));
	}

}
