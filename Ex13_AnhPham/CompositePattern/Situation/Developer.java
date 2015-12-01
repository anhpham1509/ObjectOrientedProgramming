package CompositePattern.Situation;

import java.util.ArrayList;
import java.util.List;

public class Developer {

    private String name;
    private String position;
    private int experience;
    private List<Developer> subordinates;

    // constructor
    public Developer(String name, String position, int experience) {
        this.name = name;
        this.position = position;
        this.experience = experience;
        subordinates = new ArrayList<Developer>();
    }

    public void add(Developer e) {
        subordinates.add(e);
    }

    public void remove(Developer e) {
        subordinates.remove(e);
    }

    public List<Developer> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Developer :[ Name : " + name + ", position : " + position + ", experience : " + experience +" years ]");
    }
}
