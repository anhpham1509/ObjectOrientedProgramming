package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public class CriteriaFemale implements Criteria{

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person:persons){
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }

        return femalePersons;
    }
}
