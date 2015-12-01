package FilterPattern;

import java.util.List;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public class OrCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> otherCriteriaPersons = otherCriteria.meetCriteria(persons);

        for (Person person: otherCriteriaPersons){
            if (! firstCriteriaPersons.contains(person)){
                firstCriteriaPersons.add(person);
            }
        }
        return firstCriteriaPersons;
    }
}
