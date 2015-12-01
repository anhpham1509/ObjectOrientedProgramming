package MementoPattern.Situation;

public class MementoPattern {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState(12.7, 22.6);
        originator.setState(6.8, 38.9);
        careTaker.add(originator.saveStateToMemento());

        originator.setState(40.5, 76.8);
        careTaker.add(originator.saveStateToMemento());

        originator.setState(5.6, 24.4);
        System.out.println("Current " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved " + originator.getState());
    }
}