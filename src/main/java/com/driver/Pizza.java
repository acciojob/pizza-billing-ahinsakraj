package com.driver;

public class Pizza {

    private int price;
    private final boolean isVeg;
    private String bill;

    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;
    private boolean billPrepared;

    private final int basePrice;
    private final int cheesePrice;
    private int toppingsPrice;
    private final int takeAwayPrice;

    public Pizza(Boolean isVeg){
        // your code goes here
        this.isVeg = isVeg;
        if(this.isVeg) {
            this.basePrice = 300;
        } else {
            this.basePrice = 400;
        }
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;
        this.price = this.basePrice;
        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.extraCheese) {
            this.extraCheese = true;
            this.price += this.cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.extraToppings) {
            this.extraToppings = true;
            if(this.isVeg) {
                this.toppingsPrice = 70;
            } else {
                this.toppingsPrice = 120;
            }
            this.price += this.toppingsPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.takeAway) {
            this.takeAway = true;
            this.price += this.takeAwayPrice;
        }
    }

    public String getBill() {
        if(!billPrepared) {
            billPrepared = true;

            // your code goes here
            int finalPrice = 0;
            finalPrice += basePrice;
            this.bill += "Base Price Of The Pizza: " + this.basePrice + "\n";
            if(this.extraCheese) {
                this.bill += "Extra Cheese Added: " + this.cheesePrice + "\n";
                finalPrice += this.cheesePrice;
            }
            if(this.extraToppings) {
                this.bill += "Extra Toppings Added: " + this.toppingsPrice + "\n";
                finalPrice += this.toppingsPrice;
            }
            if(this.takeAway) {
                this.bill += "Paperbag Added: " + this.takeAwayPrice + "\n";
                finalPrice += this.takeAwayPrice;
            }
            this.bill += "Total Price: " + finalPrice + "\n";
        }
        return this.bill;
    }
}
