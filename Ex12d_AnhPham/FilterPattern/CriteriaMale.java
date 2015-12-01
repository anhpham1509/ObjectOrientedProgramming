package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public class CriteriaMale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> malePersons = new ArrayList<Person>();

        for (Person person: persons){
            if (person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }

        return malePersons;
    }
}
