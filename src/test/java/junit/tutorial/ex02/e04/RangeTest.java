package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

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

	
	@ParameterizedTest
	@ValueSource(doubles = {0.0, 10.5})
	void testRange_1(double value) {
		Range range = new Range(0.0, 10.5);
		assertTrue(range.contains(value));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {-0.1, 10.6})
	void testRange_2(double value) {
		Range range = new Range(0.0, 10.5);
		assertFalse(range.contains(value));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {-5.1, 5.1})
	void testRange_3(double value) {
		Range range = new Range(-5.1, 5.1);
		assertTrue(range.contains(value));
	}
	
	@ParameterizedTest
	@ValueSource(doubles = {-5.2, 5.2})
	void testRange_4(double value) {
		Range range = new Range(-5.1, 5.1);
		assertFalse(range.contains(value));
	}
	

	

}
