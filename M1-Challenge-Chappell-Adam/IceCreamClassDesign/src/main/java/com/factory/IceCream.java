package com.factory;

import java.util.List;
import java.util.Objects;

public class IceCream {

    private String flavor;
    private List<String> recipe;
    private double unitCost;
    private int unitsStored;

    public IceCream(){}

    public IceCream(String flavor, List<String> recipe, double unitCost, int unitsStored) {
        this.flavor = flavor;
        this.recipe = recipe;
        this.unitCost = unitCost;
        this.unitsStored = unitsStored;
    }

    // Unique Methods
    public void shipToRetailers(double quantity){
        this.unitsStored -= quantity;
        System.out.println("Shipping " + quantity + " units of " + this.flavor + "to retailers, " + this.unitsStored + "left in stock.");
    }
    public void makeABatch(double quantity){
        this.unitsStored += quantity;
        System.out.println("Making " + quantity + " units of " + this.flavor + ", " + this.unitsStored + " are now in stock.");
    }


    // Standard Methods
    public String getFlavor() {return flavor;}
    public void setFlavor(String flavor) {this.flavor = flavor;}

    public List<String> getRecipe() {return recipe;}
    public void setRecipe(List<String> recipe) {this.recipe = recipe;}

    public double getUnitCost() {return unitCost;}
    public void setUnitCost(double unitCost) {this.unitCost = unitCost;}

    public int getUnitsStored() {return unitsStored;}
    public void setUnitsStored(int unitsStored) {this.unitsStored = unitsStored;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.unitCost, unitCost) == 0 && unitsStored == iceCream.unitsStored && Objects.equals(flavor, iceCream.flavor) && Objects.equals(recipe, iceCream.recipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, recipe, unitCost, unitsStored);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", recipe=" + recipe +
                ", unitCost=" + unitCost +
                ", unitsStored=" + unitsStored +
                '}';
    }
}