package Filters.FiltersImpl;

import Filters.PersonFilter;
import Model.Person;

public class AdultFilter implements PersonFilter {
    @Override
    public boolean apply(Person person) {
        return person.getAge() >= 18;
    }
}
