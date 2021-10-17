import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Find {

	private Order fibo;

	@BeforeEach
	void setUp() throws Exception {
		fibo = new Order();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int testSequence = 10;
		int endResult = 55;

		assertEquals(endResult, fibo.fib(testSequence));
	}

}
