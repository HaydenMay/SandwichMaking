/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sandwichmaker;

import sandwichmaker.model.Bread;
import sandwichmaker.model.CondimentsTypes.Cheese;
import sandwichmaker.model.Condiments;
import sandwichmaker.model.CondimentsTypes.Lettuce;
import sandwichmaker.model.CondimentsTypes.Pickles;
import sandwichmaker.model.CondimentsTypes.Tomatoes;
import sandwichmaker.model.Meat;
import sandwichmaker.model.Sandwich;

public class SandwichMaker {

    public Condiments gatherCondiments(Cheese cheese, Tomatoes tomatoes, Pickles pickles, Lettuce lettuce){
        Condiments newCondiments = new Condiments(cheese, tomatoes, pickles, lettuce);

        return newCondiments;
    }
    public Sandwich makeASandwich(Bread bread, Meat meat, Condiments condiments) {
        if( meat != null && bread != null) {
            Sandwich newSandwich = new Sandwich(bread, condiments, meat);
            System.out.println("Ingredients used: " + newSandwich.getMeat().toString() + " sandwich on " + newSandwich.getBread().getBreadType() + " with " + newSandwich.getCondiments().toString());
            System.out.println("Total Cost of the Sandwiches is: $" + String.format("%.2f%n", newSandwich.getCost()));
        }
        else
            System.out.println("To make a sandwich we require a meat and a bread");
        return new Sandwich();
    }

    

    public static void main(String[] args) {
        SandwichMaker sandwichMaker = new SandwichMaker();

        System.out.println("---------This is Sandwich 1------");
        Condiments newCondiments = sandwichMaker.gatherCondiments(new Cheese(2, 1.5), new Tomatoes(0, .10), null, new Lettuce(2, .30));

        sandwichMaker.makeASandwich(new Bread("Rye", .50), new Meat("Ham", 1, 3.57), newCondiments);


        System.out.println("---------This is Sandwich 2------");

        newCondiments = sandwichMaker.gatherCondiments(null, null, new Pickles(8,1), null );
        sandwichMaker.makeASandwich(new Bread("Wheat", 1), new Meat("Turkey", 2, 3.57), newCondiments);

    }
}
