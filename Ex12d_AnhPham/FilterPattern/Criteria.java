package FilterPattern;

import java.util.List;

/**
 * Created by DuyAnhPham on 11/10/15.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
