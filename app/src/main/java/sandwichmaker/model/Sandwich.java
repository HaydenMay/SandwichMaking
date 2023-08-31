package sandwichmaker.model;

public class Sandwich {
    public double totalCost;
    Bread bread;
    Condiments condiments;
    Meat meat;

    public Sandwich(){}
    public Sandwich(Bread bread, Condiments condiments, Meat meat){

        this.bread = bread;
        this.condiments = condiments;
        this.meat = meat;
        this.totalCost = this.condiments.getTotalCost() + this.bread.getBreadCost() + this.meat.getMeatCost();
    }

    public double getCost() {
        return totalCost;
    }

    public void setCost(double cost) {
        this.totalCost = cost;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public Condiments getCondiments() {
        return condiments;
    }

    public void setCondiments(Condiments condiments) {
        this.condiments = condiments;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }
}
