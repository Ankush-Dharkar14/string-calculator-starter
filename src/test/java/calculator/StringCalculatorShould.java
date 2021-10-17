package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;


class StringCalculatorShould {

	private StringCalculator sc;

	@BeforeEach
	void initialize() {
		sc = new StringCalculator();
	}

	@Test
	@Order(1)
	public void test_StringIsEmpty_Return0() {
		assertEquals(sc.add(""), 0);
	}

	@Test
	@Order(2)
	public void test_StringHas1Value_ReturnOnly1_Value() {
		assertEquals(sc.add("1"), 1);
	}

	@Test
	@Order(3)
	public void test_StringHasTwoValues_ReturnSum() {
		assertEquals(sc.add("1,2"), 3);
	}
	
	@Test
	@Order(4)
	public void test_StringHasUnknownValues_ReturnSum() {
		assertEquals(sc.add("1,2,4"), 7);
	}
	
	@Test
	@Order(5)
	public void test_NumbersDelimitedWithNewLine_ReturnSum() {
		assertEquals(sc.add("1\n2,4"), 7);
	}
	
	@Test
	@Order(6)
	public void test_NumbersDelimitedWithDiffrentDelimiters_ReturnSum() {
		assertEquals(sc.add("//;\n2;4"), 6);
	}
	
	@Test
	@Order(7)
	public void test_NegativeNumbers() {
		assertEquals(sc.add("-8,5"), 5);
	}
	
	@Test
	@Order(8)
	public void test_MultipleNegativeNumbers() {
		assertEquals(sc.add("-8,-5,-2,5"), 5);
	}
	
	@Test
	 public void test_GetCount() {
		StringCalculator c=new StringCalculator();
		c.add("-8,5");
		c.add("-8,-5,-2,5");
		c.add(";\n2;4");
		assertEquals(c.GetCalledCount(),3);
	}
	
}
