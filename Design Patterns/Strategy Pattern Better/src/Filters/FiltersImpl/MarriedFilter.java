package Filters.FiltersImpl;

import Filters.PersonFilter;
import Model.Person;

public class MarriedFilter implements PersonFilter {
    @Override
    public boolean apply(Person person) {
        return person.isMarried();
    }
}
