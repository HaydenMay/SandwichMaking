package sandwichmaker.model.CondimentsTypes;

public class Lettuce {
	
	public int lettuceCount;
	public double lettuceCost;
	
	
	public Lettuce(){}
	public Lettuce(int lettuceCount, double lettuceCost){
		this.lettuceCount = lettuceCount;
		this.lettuceCost = lettuceCost;
	}

	public int getLettuceCount() {
		return lettuceCount;
	}

	public void setLettuceCount(int lettuceCount) {
		this.lettuceCount = lettuceCount;
	}
	@Override
	public String toString() {
		return lettuceCount + " piece(s) of lettuce at $" + lettuceCost + " each, ";
	}
	public double getLettuceCost() {
		return lettuceCost;
	}

	public void setLettuceCost(double lettuceCost) {
		this.lettuceCost = lettuceCost;
	}
}
