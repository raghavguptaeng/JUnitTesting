package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTesting junit = new jUnitTesting();
		String result = junit.addStrings("Raghav ","E19CSE258");
		assertEquals("Raghav E19CSE258",result);
	}

}
