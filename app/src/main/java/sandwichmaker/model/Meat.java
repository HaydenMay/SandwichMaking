package sandwichmaker.model;

public class Meat {

	private String meat;
	private int meatCount;

	private double costPerServing;
	private double meatCost;

	public Meat(){};
	public Meat(String meat, int meatCount, double costPerServing){
		this.meat = meat;
		this.meatCount = meatCount;
		this.costPerServing = costPerServing;
		this.meatCost = costPerServing * meatCount;
	}

	public String getMeat() {
		return meat;
	}

	public int getMeatCount() {
		return meatCount;
	}

	public void setMeatCount(int meatCount) {
		this.meatCount = meatCount;
	}

	public double getCostPerServing() {
		return costPerServing;
	}

	public void setCostPerServing(double costPerServing) {
		this.costPerServing = costPerServing;
	}

	@Override
	public String toString() {
		return this.meatCount + " serving(s) of " + this.meat ;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public double getMeatCost() {
		return meatCost;
	}

	public void setMeatCost(double meatCost) {
		this.meatCost = meatCost;
	}
}

