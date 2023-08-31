package sandwichmaker.model.CondimentsTypes;

public class Tomatoes {
	public int tomatoCount;
	public double tomatoCost;

	public Tomatoes(){}
	public Tomatoes(int tomatoCount, double tomatoCost){
		this.tomatoCount = tomatoCount;
		this.tomatoCost = tomatoCost;
	}

	public int getTomatoCount() {
		return tomatoCount;
	}

	public void setTomatoCount(int tomato) {
		this.tomatoCount = tomatoCount;
	}
	@Override
	public String toString() {
		return tomatoCount + " tomato(es) at $" + tomatoCost + " per tomato, ";
	}
	public double getTomatoCost() {
		return tomatoCost;
	}

	public void setTomatoCost(double tomatoCost) {
		this.tomatoCost = tomatoCost;
	}
}
