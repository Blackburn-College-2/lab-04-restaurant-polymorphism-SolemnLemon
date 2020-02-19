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
public class FancyCoffee extends Coffee {

    private ArrayList<Orderable> addOn = new ArrayList();

    public FancyCoffee(Size size, String name, Money baseCost) {
        super(size, name, baseCost);

    }

    public void add(Orderable o) {
        addOn.add(o);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < addOn.size(); i++) {//really wish i had documentation for what get receipt item does
            s = s + addOn.get(i).getReceiptItem();
        }

        return getName() + " " + getSize().toString() + " " + getPrice().toString() + "\n"
                + s;
    }
}
