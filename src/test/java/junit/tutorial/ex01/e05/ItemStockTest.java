package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
	@DisplayName("初期状態で0を取得")
	void testGetNum() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item(null, 0);
		assertEquals(0,itemStock.getNum(item) , "0が取得できません");
	}

	@Test
	@DisplayName("getNum()で1を取得する")
	void testAdd() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("book", 500);
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(1, result, "1が取得できません");
	}
	
	@Test
	@DisplayName("同じitemを追加、2を取得する")
	void testAdd_2() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("book", 500);
		itemStock.add(item);
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(2, result, "2が取得できません");
	}
	
	@Test
	@DisplayName("異なるitemを追加、1を取得する")
	void testAdd_3() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("book", 500);
		Item item2 = new Item("CD", 300);
		itemStock.add(item);
		itemStock.add(item2);
		int result = itemStock.getNum(item2);
		assertEquals(1, result, "1が取得できません");
	}
	
}
