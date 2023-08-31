package sandwichmaker.model;

public class Bread {
    private String breadType;
    private double breadCost;

    public Bread() {
    }

    public Bread(String breadType, double breadCost) {
        this.setBreadType(breadType);
        this.setBreadCost(breadCost);
    }

    //Getters and Setters

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getBreadCost() {
        return breadCost;
    }

    public void setBreadCost(double breadCost) {
        this.breadCost = breadCost;
    }
}