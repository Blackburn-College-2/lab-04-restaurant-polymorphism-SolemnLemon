/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import edu.blackburn.cs.cs212.restaurantbase.MenuItem;
import edu.blackburn.cs.cs212.restaurantbase.Money;
import edu.blackburn.cs.cs212.restaurantbase.Receipt;

/**
 *
 * @author sunbe
 */
public class Coffee extends MenuItem{
    
   public String toString(){
   return getName()+" "+getSize().toString()+" "+getPrice().toString();
   }

    public Coffee( Size size, String name, Money basePrice) {
        super(name, basePrice);
        this.basePrice = basePrice;
        this.name = name;
        this.size = size;
        
    }

   
   Money basePrice;
   String name;
   Size size;
   
  
   @Override
   public String getReceiptItem(){
   
   return toString()+"\n";
   }

   //getters and setters
   @Override
    public Money getPrice() {
        return basePrice;
    }
@Override
    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public void setBasePrice(Money basePrice) {
        this.basePrice = basePrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    
    
}
