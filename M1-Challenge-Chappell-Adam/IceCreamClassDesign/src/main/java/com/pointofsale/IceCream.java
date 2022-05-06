package com.pointofsale;

import java.util.Map;

public class IceCream {

        private String flavor;
        private double scoopPrice;
        private double quantityStocked;
        private Map<String, Double> nutrition;


        // Constructors
        public IceCream(){}

        public IceCream(String flavor, double scoopPrice, double quantityStocked, Map<String, Double> nutrition) {
            this.flavor = flavor;
            this.scoopPrice = scoopPrice;
            this.quantityStocked = quantityStocked;
            this.nutrition = nutrition;
        }
        // Unique Methods
        public double sellScoops(int scoops){
                this.quantityStocked -= scoops;
                this.quantityStocked -= (0.02 * scoops);
                System.out.println("Sold "+ scoops + " of " + this.flavor + " and a little bit fell on the floor, we now have " + this.quantityStocked + " servings left.");
                if(quantityStocked < 1000){
                        this.orderMore();
                }
                return this.scoopPrice * scoops;
        }

        public void orderMore(){
                this.quantityStocked += 1000;
                System.out.println("Ordered 1000 more servings of " + this.flavor + ".");
        }

        // Getters & Setters
        public String getFlavor() {return flavor;}
        public void setFlavor(String flavor) {this.flavor = flavor;}

        public double getScoopPrice() {return scoopPrice;}
        public void setScoopPrice(double scoopPrice) {this.scoopPrice = scoopPrice;}

        public double getQuantityStocked() {return quantityStocked;}
        public void setQuantityStocked(double quantity) {this.quantityStocked = quantity;}

        public Map<String, Double> getNutrition() {return nutrition;}
        public void setNutrition(Map<String, Double> nutrition) {this.nutrition = nutrition;}
}