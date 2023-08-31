package sandwichmaker.model.CondimentsTypes;

public class Cheese{
	public int cheeseCount;
	public double cheeseCost;

	public Cheese(){}
	public Cheese(int cheeseCount, double cheeseCost){
		this.cheeseCount = cheeseCount;
		this.cheeseCost = cheeseCost;
	}

	public int getCheeseCount() {
		return cheeseCount;
	}

	public void setCheeseCount(int cheese) {
		this.cheeseCount = cheese;
	}

	@Override
	public String toString() {
		return cheeseCount + " slice(s) of cheese at $" + cheeseCost + " per slice, ";
	}

	public double getCheeseCost() {
		return cheeseCost;
	}

	public void setCheeseCost(double cheeseCost) {
		this.cheeseCost = cheeseCost;
	}
}
