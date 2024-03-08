package day13_practice_tasks.state;

public class StateClients {

    public static void main(String[] args) {

        Texas Texas = new Texas("Texas","TX",
                "Republican Party", "Greg Abbott","Ted Cruz",  30_000_000);


        System.out.println(Texas.getName());
        System.out.println(Texas.getAbbreviation());
        System.out.println(Texas.getPoliticalParty());
        System.out.println(Texas.getGovernor());
        System.out.println(Texas.getSenator());
        System.out.println(Texas.getPopulation());
        System.out.println(Texas);


    }
}
