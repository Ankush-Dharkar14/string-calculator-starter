package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class StringCalculatorShould {

	private StringCalculator sc;

	@BeforeEach
	void initialize() {
		sc = new StringCalculator();
	}

	@Test
	public void test_StringIsEmpty_Return0() {
		assertEquals(sc.add(""), 0);
	}

	@Test
	public void test_StringHas1Value_ReturnOnly1_Value() {
		assertEquals(sc.add("1"), 1);
	}

	@Test
	public void test_StringHasTwoValues_ReturnSum() {
		assertEquals(sc.add("1,2"), 3);
	}
	
	@Test
	public void test_StringHasUnknownValues_ReturnSum() {
		assertEquals(sc.add("1,2,4"), 7);
	}

}
