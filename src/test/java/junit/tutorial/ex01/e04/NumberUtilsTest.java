package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("偶数の時trueを返す")
	void testIsEven() {
		boolean result = NumberUtils.isEven(10);
		assertEquals(true, result, "値が正しくありません");
	}
	
	@Test
	@DisplayName("奇数の時falseを返す")
	void testIsOdd() {
		boolean result = NumberUtils.isEven(7);
		assertEquals(false, result, "値が正しくありません");
	}

}
