/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestrauntPolymorphism;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;

/**
 *
 * @author sunbe
 */
public class Meat implements Orderable {// i see no reason why meat and topping are seperate classes they apear to be exactly the same and serve the same purpose
    
    Money price;
    String name;

    public Meat(String name, Money price) {
        this.price = price;
        this.name = name;

    }

    @Override
    public String getReceiptItem() {
        return toString();

    }

    public String toString() {
        return "\n"+ getName()+"      "+ getPrice();

    }

    public Money getPrice() {
        return price;
    }
        public String getName() {
        return name;
    }
}
