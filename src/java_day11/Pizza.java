package day11_practice_tasks;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost(){
        int pizzaCost = 0;

        if (size.equalsIgnoreCase("small"))
            pizzaCost = 10;
        if(size.equalsIgnoreCase("medium"))
            pizzaCost = 12;
        if (size.equalsIgnoreCase("large"))
            pizzaCost = 14;

        return pizzaCost + numberOfCheeseTopping * 2 + numberOfPepperoniTopping * 2;
    }

    public String toString(){
        return "Pizza " +
                "size: " + size +
                ", number of cheese topping = " + numberOfCheeseTopping +
                ", number of pepperoni topping = " + numberOfPepperoniTopping +
                ", total cost: $" + calcCost();
    }

}

/*
Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping
 */