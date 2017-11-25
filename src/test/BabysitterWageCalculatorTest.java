package test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import main.BabySitterWageCalculator;

public class BabysitterWageCalculatorTest {

	@Test
	public void shouldCalculateOneHourPayFromStartToBedTime() {
		BabySitterWageCalculator testCalc = new BabySitterWageCalculator(7, 8, 0);
		int testPay=testCalc.startTimeToBedTimePay()
;	Assert.assertEquals(12, testPay);
	}
	@Test
	public void shouldCalculateThreeHourPayFromStartToBedTime() {
		BabySitterWageCalculator testCalc = new BabySitterWageCalculator(5, 8, 0);
		int testPay=testCalc.startTimeToBedTimePay();
		assertEquals(36, testPay);
	}
	@Test
	public void shouldCalculatePayFromBedTimeToMidnight() {
		BabySitterWageCalculator testCalc = new BabySitterWageCalculator(5, 11, 0);
		int testPay=testCalc.bedTimeToMidnightPay();
		assertEquals(8, testPay);
	}
	@Test
	public void shouldCalculatePayFromStartTimeToMidnight() {
		BabySitterWageCalculator testCalc = new BabySitterWageCalculator(5, 8, 0);
		int testPay=testCalc.calculateWage();
		assertEquals(68, testPay);
	}
	@Test
	public void shouldCalculatePayFromMidnightToEndTime() {
		BabySitterWageCalculator testCalc = new BabySitterWageCalculator(5, 8, 1);
		int testPay=testCalc.midnightToEndTimeWage();
		assertEquals(16, testPay);
	}
}
