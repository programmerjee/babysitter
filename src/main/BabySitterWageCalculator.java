package main;

public class BabySitterWageCalculator {

	int startTime;
	int bedTime;
	int endTime;
	public BabySitterWageCalculator(int startTime, int bedTime, int endTime) {
		super();
		this.startTime = startTime;
		this.bedTime = bedTime;
		this.endTime = endTime;
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


	public int midnightToEndTimeWage() {
		
		int midNightToEndTimePay=16;
		return endTime * midNightToEndTimePay;
	}


}
