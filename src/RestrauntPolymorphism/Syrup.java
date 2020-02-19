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
public class Syrup implements Orderable {

    String flavor;
    Money price;

    Syrup(String flavor, Money price) {
        this.flavor = flavor;
        this.price = price;

    }

    @Override
    public String getReceiptItem() {

        return toString();
    }

    //getters and setters
    public String getFlavor() {
        return flavor;
    }

    public Money getPrice() {
        return price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public String toString() {
        return getFlavor() + " " + getPrice();

    }
}
