package day11_practice_tasks;

public class CarpetClients {

        public static void main(String[] args) {
            // Creating Carpet objects
            Carpet carpet1 = new Carpet(5.5, 8.5, 10, false);
            Carpet carpet2 = new Carpet(6.0, 9.0, 12, true);

            // Testing calcCost() and toString() methods
            System.out.println("Carpet 1: " + carpet1.toString());
            System.out.println("Carpet 2: " + carpet2.toString());
        }
    }