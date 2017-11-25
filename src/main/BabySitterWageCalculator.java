package main;

public class BabySitterWageCalculator {

	int startTime;
	int bedTime;
	public BabySitterWageCalculator(int startTime, int bedTime) {
		super();
		this.startTime = startTime;
		this.bedTime = bedTime;
	}

	public int startTimeToBedTimePay() {
		int startToBedWage = 12;
		return (bedTime - startTime) * startToBedWage;
	}

	public int bedTimeToMidnightPay() {
		
		int midnight = 12;
		int bedTimeToMidnightWage=8;
		return (midnight - bedTime) * bedTimeToMidnightWage;
	}

	public int calculateWage() {
		
		return startTimeToBedTimePay() + bedTimeToMidnightPay();
	}


}
