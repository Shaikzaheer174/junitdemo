package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class code1testcase {

	@Test
	void test() {
		int res=new code1().divide(10, 5);
		assertEquals(2, res);
	}
	@Test
	void test2() {
		int res=new code1().divide(2, 2);
		assertEquals(1, res);
	}
	
	@Test
	void test3() {
		try {
			int res=new code1().divide(10, 5);
			assertEquals(-1, res);
		}
		catch (Exception e) {
			fail();
		}

	}	
	}
