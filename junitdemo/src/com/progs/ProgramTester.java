package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgramTester {

	@Test
	public void test1() {
//		fail("Not yet implemented");
		try {
			int res=new Program1().solution("a#n90");
		}catch (bugException e) {
			assertEquals("Invalid character",e.getMessage());
		}
	}
}
