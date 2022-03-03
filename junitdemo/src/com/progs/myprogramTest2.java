package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class myprogramTest2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("test class started");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("test class finished");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("test method syarted");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("test methods finished");
	}

	@Test
	void test1() {
		assertEquals(true, true);
	}

	void test2() {
		assertEquals(true,true);
	}
}
