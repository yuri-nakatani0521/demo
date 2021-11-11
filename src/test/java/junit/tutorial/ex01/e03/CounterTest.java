package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

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

//	@Test
//	void testCounter() {
//		fail("Not yet implemented");
//	}

	@Test
	@DisplayName("初期状態で実行")
	void testIncrement_1() {
		Counter counter = new Counter();
		int answer = counter.increment();
		assertEquals(1, answer, "値が正しくありません");
	}
	
	@Test
	@DisplayName("1回実行した状態")
	void testIncrement_2() {
		Counter counter = new Counter();
		counter.increment();
		assertEquals(2, counter.increment(), "値が正しくありません");
		
	}
	@Test
	@DisplayName("50回実行した状態")
	void testIncrement_50() {
		Counter counter = new Counter();
		int answer = 0;
		for(int i = 0; i <= 50; i++) {
			answer = counter.increment();
		}
		assertEquals(51, answer, "値が正しくありません");
	}

}
