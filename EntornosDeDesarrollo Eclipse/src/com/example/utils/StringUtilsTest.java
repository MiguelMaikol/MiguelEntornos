package com.example.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReverse() {
		String input =StringUtils.reverse("e");
		
		assertEquals("e", input, "El resultado deberia ser null ");
	}

	@Test
	void testCountVowels() {
		int input =StringUtils.countVowels("");
		assertEquals(0, input, "El resultado deberia ser 0 vocales ");
	}

}
