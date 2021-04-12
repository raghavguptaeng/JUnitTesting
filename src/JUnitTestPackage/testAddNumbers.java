package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(69, 420);
		assertEquals(489,result);
	}

}
