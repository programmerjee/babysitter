package main;

public class BabySitterWageCalculator {

	int startTime;
	int bedTime;
	int startToBedWage;
	public BabySitterWageCalculator(int startTime, int bedTime, int startToBedWage) {
		super();
		this.startTime = startTime;
		this.bedTime = bedTime;
		this.startToBedWage = startToBedWage;
	}

	public int calculateWage() {
		
		return (bedTime - startTime) * startToBedWage;
	}

}
