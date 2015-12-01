package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public class CriteriaSingle implements Criteria{

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person: persons){
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
