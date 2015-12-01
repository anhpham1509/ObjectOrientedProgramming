package CompositePattern.Situation;

public class CompositePattern {

    public static void main(String[] args) {

        Developer Supervisor = new Developer("Anh","Supervisor", 22);

        Developer Leader1 = new Developer("Duy","Leader of Front-end", 13);

        Developer Leader2 = new Developer("Pham","Leader of Back-end", 12);

        Developer FrontDev1 = new Developer("Hieu","Front-end Developer", 6);
        Developer FrontDev2 = new Developer("Tri","Front-end Developer", 7);

        Developer BackDev1 = new Developer("Hoang","Back-end Developer", 6);
        Developer BackDev2 = new Developer("Minh","Back-end Developer", 8);

        Supervisor.add(Leader1);
        Supervisor.add(Leader2);

        Leader1.add(FrontDev1);
        Leader1.add(FrontDev2);

        Leader2.add(BackDev1);
        Leader2.add(BackDev2);

        //print all employees of the organization
        System.out.println(Supervisor);

        for (Developer leadDeveloper : Supervisor.getSubordinates()) {
            System.out.println(leadDeveloper);

            for (Developer developer : leadDeveloper.getSubordinates()) {
                System.out.println(developer);
            }
        }
    }
}
