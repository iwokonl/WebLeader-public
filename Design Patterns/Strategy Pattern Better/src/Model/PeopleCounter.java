package Model;

import Filters.PersonFilter;

import java.util.List;

public class PeopleCounter {
    private PersonFilter filter;

    public void setFilter(PersonFilter filter){
        this.filter = filter;
    }

    public int count(List<Person> people){
        int count = 0;
        for(Person person : people)
            if(filter.apply(person)) count++;
        return count;
    }
}
