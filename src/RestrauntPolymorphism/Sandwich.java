/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestrauntPolymorphism;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Orderable;
import java.util.ArrayList;

/**
 *
 * @author sunbe
 */
public class Sandwich implements Orderable {

    Money price;
    ArrayList<Orderable> contents = new ArrayList();

    public Sandwich(Money basePrice) {
        this.price = basePrice;
    }

    public String getReceiptItem() {

        return toString();

    }

    @Override
    public Money getPrice() {
        return price;

    }

    public void add(Orderable o) {
        contents.add(o);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < contents.size(); i++) {
            s = s + contents.get(i);
        }
        return "Sandwich    " + getPrice() + s;

    }
}
