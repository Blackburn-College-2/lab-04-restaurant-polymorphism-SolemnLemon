/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;

/**
 *
 * @author paul.kline
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coffee drank = new Coffee(
                new Size(8.0, "oz"),
                "8 ounce coffee",
                new Money(2.0)
        );
        Receipt drinks = new Receipt();
        drinks.add(drank);
        
        drinks.add(new Coffee(
                new Size(8.0, "oz"),
                "8 ounce dark coffee",
                new Money(2.0)
        ));
        
        drinks.add(new Coffee(
                new Size(12.0, "oz"),
                "12 ounce dark coffee",
                new Money(2.0)
        ));
                drinks.add(new Coffee(
                new Size(12.0, "oz"),
                "12 ounce high Caffiene coffee",
                new Money(2.0)
        ));
                        drinks.add(new Coffee(
                new Size(12.0, "oz"),
                "12 ounce decaf coffee",
                new Money(2.0)
        ));
                        System.out.println(drinks.prepare());
    }
    
}
