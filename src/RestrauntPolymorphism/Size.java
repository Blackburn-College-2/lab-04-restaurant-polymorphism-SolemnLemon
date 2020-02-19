/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestrauntPolymorphism;

/**
 *
 * @author sunbe
 */
import edu.blackburn.cs.cs212.restaurantbase.Measurement;

public class Size extends Measurement {

    public Size(double value, String units) {
        this.value = value;
        this.units = units;
    }

    double value;
    String units;

    @Override
    public String toString() {
        return getValue() + " " + getUnits();
    }

    public double getValue() {
        return value;
    }

    public String getUnits() {
        return units;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setUnits(String units) {
        this.units = units;
    }

}
