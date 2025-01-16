package dat102.f02.tabellbag;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TabellBagTest {

	@Test
	void test() {

		BagADT<String> bag = new TabellBag<String>(2);

		assertEquals(0, bag.getCurrentSize());
		assertTrue(bag.isEmpty());

		assertFalse(bag.contains("Per"));

		assertTrue(bag.add("Per"));
		assertTrue(bag.add("Bashar"));
		assertFalse(bag.add("Alex"));

		assertEquals(2, bag.getCurrentSize());
		assertFalse(bag.isEmpty());

		assertTrue(bag.contains("Per"));
		assertTrue(bag.contains("Bashar"));
		assertFalse(bag.contains("Alex"));

		assertNotNull(bag.remove());
		assertNotNull(bag.remove());
		assertNull(bag.remove());

		assertEquals(0, bag.getCurrentSize());
		assertTrue(bag.isEmpty());

		assertFalse(bag.contains("Per"));
		assertFalse(bag.contains("Bashar"));
		assertFalse(bag.contains("Alex"));

	}

}
