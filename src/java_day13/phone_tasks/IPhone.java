package day13_practice_tasks.phone_tasks;

public class IPhone {

    private String brand, model, size;
    private double price;
    private String color;


    public IPhone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        this.size = size;
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            System.err.println("The brand must not be null, empty, or blank.");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            System.err.println("The model must not be null, empty, or blank.");
            System.exit(2);
        }

        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("The price must be greater than zero.");
            System.exit(3);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            System.err.println("The color must not be null, empty, or blank.");
            System.exit(4);
        }

        this.color = color;
    }

    public void call(int phoneNumber) {
        System.out.println("calling the number " + phoneNumber);
    }

    public void text(int phoneNumber) {
        System.out.println("texting to the number " + phoneNumber);
    }

    public void faceTime(int phoneNumber) {
        System.out.println("facetiming with the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
1. Create a custom class named 'IPhone' with these specifications:
   Attributes:
       - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

   Encapsulation:
       - All fields must be private with getters and setters.
       Conditions for Encapsulation:
           - The 'brand', 'model', and 'color' must not be null, empty, or blank.
           - The 'price' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.
 */
