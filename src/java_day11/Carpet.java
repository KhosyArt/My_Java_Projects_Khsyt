package day11_practice_tasks;
public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        double totalPrice = width * length * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
        return totalPrice;
    }

    public String toString() {
        String persian = isPersian ? "Yes" : "No";
        return "Carpet width: " + width + ", length: " + length +
                ", unit price: $" + unitPrice + ", Persian: " + persian +
                ", Total cost: $" + calcCost();
    }

}
/*
Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice
 */