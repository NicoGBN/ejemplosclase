package interfaces;

public class Tablet extends Device implements IConPeso{

	private double weight=10;
	
	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight=weight;
	}
	

}
