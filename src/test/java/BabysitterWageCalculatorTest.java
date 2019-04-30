import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
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
		int testPay=testCalc.midnightToEndTimePay();
		assertEquals(16, testPay);
	}
	@Test
	public void shouldCalculatePayFrom6PMTo4AM() {
		BabySitterWageCalculator testCalc = new BabySitterWageCalculator(6, 9, 4);
		int testPay=testCalc.calculateWage();
		assertEquals(124, testPay);
	}
	@Test
	public void shouldCalculatePayFrom10PMTo1AM() {
		BabySitterWageCalculator testCalc = new BabySitterWageCalculator(10, 11, 1);
		int testPay=testCalc.calculateWage();
		assertEquals(36, testPay);
	}
}
