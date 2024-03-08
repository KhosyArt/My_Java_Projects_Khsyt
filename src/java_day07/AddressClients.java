package java_day07;

public class AddressClients {

    public static void main(String[] args) {

        Address address2 = new Address();
        address2.getInfo(1524, "Maier Drive", "Austin", "TX", "78731");

        System.out.println(address2.toString());

    }
}
