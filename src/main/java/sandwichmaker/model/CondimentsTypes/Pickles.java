package sandwichmaker.model.CondimentsTypes;

public class Pickles {
	public int pickleCount;
	public double picklesCost;
	public Pickles(){}
	public Pickles(int pickleCount, double picklesCost){
		this.pickleCount = pickleCount;
		this.picklesCost = picklesCost;
	}

	public int getPickleCount() {
		return pickleCount;
	}

	public void setPickleCount(boolean pickles) {
		this.pickleCount = pickleCount;
	}
	@Override
	public String toString() {
		return pickleCount + " pickles at $" + picklesCost + " per pickle ";
	}
	public double getPicklesCost() {
		return picklesCost;
	}

	public void setPicklesCost(double picklesCost) {
		this.picklesCost = picklesCost;
	}

}
