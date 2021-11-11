package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

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
	@DisplayName("第二引数が0の時例外")
	void testDivide_1() {
		try {
			Calculator.divide(1, 0);
			fail("例外が発生しませんでした");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			assertEquals("divide by zero.", e.getMessage(), "例外が発生しました");
		} 
	}
	@Test
	@DisplayName("第二引数が0ではないとき")
	void testDivide_2() {
		int answer = Calculator.divide(6, 3);
		assertEquals(2.0, answer, "値が正しくありません");
	}

}
