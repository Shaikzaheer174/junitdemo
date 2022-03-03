package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class myprogramTest {

	@Test
	void testfindsum() {
		myprogram prog=new myprogram();
		int actual=prog.findsum(10, 5);
		assertEquals(15,actual);	
	}
	
	void testfindsum2()
	{
		myprogram prog=new myprogram();
		int actual=prog.findsum(-2, 2);
		assertEquals(0,actual);
	}
	
}
