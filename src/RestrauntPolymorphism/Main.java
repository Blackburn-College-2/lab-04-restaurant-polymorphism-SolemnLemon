/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestrauntPolymorphism;

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
        Receipt receipt = new Receipt();
        receipt.add(drank);

        receipt.add(new Coffee(
                new Size(8.0, "oz"),
                "8 ounce dark coffee",
                new Money(2.0)
        ));

        receipt.add(new Coffee(
                new Size(12.0, "oz"),
                "12 ounce dark coffee",
                new Money(2.0)
        ));
        receipt.add(new Coffee(
                new Size(12.0, "oz"),
                "12 ounce high Caffiene coffee",
                new Money(2.0)
        ));
        receipt.add(new Coffee(
                new Size(12.0, "oz"),
                "12 ounce decaf coffee",
                new Money(2.0)
        ));



        FancyCoffee fc = (new FancyCoffee(
                new Size(12.0, "oz"),
                "12 ounce coffee with syrups",
                new Money(2.5)));
        fc.add(new Syrup("chocolate", new Money(2.0)));
        receipt.add(fc);
        

        
        Topping cheese=new Topping("Cheese",new Money(0.20));
  
        Sandwich grilledCheese= new Sandwich(new Money(2.0));
        grilledCheese.add(cheese);
        receipt.add(grilledCheese);
         System.out.println(receipt.prepare());
         System.out.println("Total: "+ receipt.getTotalPrice());
        
         
         
    }

}
