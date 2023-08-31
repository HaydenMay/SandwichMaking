package sandwichmaker.model;

import sandwichmaker.model.CondimentsTypes.Lettuce;
import sandwichmaker.model.CondimentsTypes.Tomatoes;
import sandwichmaker.model.CondimentsTypes.Pickles;
import sandwichmaker.model.CondimentsTypes.Cheese;



public class Condiments {

    public double totalCost;

    Lettuce lettuce;
    Tomatoes tomatoes;
    Pickles pickles;
    Cheese cheese;

    public Condiments(){}
    public Condiments(Cheese cheese, Tomatoes tomatoes, Pickles pickles, Lettuce lettuce){
        System.out.println("Gathering Condiments");

        if(hasCheese(cheese)){
            this.cheese = new Cheese(cheese.cheeseCount, cheese.getCheeseCost());
            this.totalCost += this.cheese.cheeseCost * this.cheese.cheeseCount;
        }
        if(hasTomatoes(tomatoes)){
            this.tomatoes = new Tomatoes(tomatoes.tomatoCount, tomatoes.getTomatoCost());
            this.totalCost += this.tomatoes.tomatoCost * this.tomatoes.tomatoCount;
        }
        if(hasPickles(pickles)){
            this.pickles = new Pickles(pickles.pickleCount, pickles.getPicklesCost());
            this.totalCost += this.pickles.picklesCost * this.pickles.pickleCount;
        }
        if(hasLettuce(lettuce)){
            this.lettuce = new Lettuce(lettuce.lettuceCount, lettuce.getLettuceCost());
            this.totalCost += this.lettuce.lettuceCost * this.lettuce.lettuceCount;
        }
    }

    private boolean hasCheese(Cheese cheese) {
        return ( cheese != null) ? true : false;
    }
    private boolean hasTomatoes(Tomatoes tomatoes) {
        return ( tomatoes != null) ? true : false;
    }
    private boolean hasPickles(Pickles pickles) {
        return (pickles != null) ? true : false;
    }
    private boolean hasLettuce(Lettuce lettuce) {
        return ( lettuce != null) ? true : false;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public String toString() {
        return (((this.cheese != null && this.cheese.cheeseCount > 0) ? this.cheese.toString() : "") +
                ((this.tomatoes != null && this.tomatoes.tomatoCount > 0) ? this.tomatoes.toString() : "") +
                ((this.pickles != null && this.pickles.pickleCount > 0) ? this.pickles.toString() : "") +
                ((this.lettuce != null && this.lettuce.lettuceCount > 0) ? this.lettuce.toString() : ""));
    }
}

