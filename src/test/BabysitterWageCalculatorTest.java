package test;

import org.junit.Assert;
import org.junit.Test;

import main.BabySitterWageCalculator;

public class BabysitterWageCalculatorTest {

	@Test
	public void shouldCalculateOneHourPayFromStartToBedTime() {
		BabySitterWageCalculator testCalc = new BabySitterWageCalculator(7, 8, 12);
		int testPay=testCalc.calculateWage()
;	Assert.assertEquals(12, testPay);
	}
	@Test
	public void shouldCalculateThreeHourPayFromStartToBedTime() {
		BabySitterWageCalculator testCalc = new BabySitterWageCalculator(5, 8, 12);
		int testPay=testCalc.calculateWage();
		Assert.assertEquals(36, testPay);
	}
}
