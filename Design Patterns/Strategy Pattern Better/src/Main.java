import Filters.FiltersImpl.AdultFilter;
import Filters.FiltersImpl.MarriedFilter;
import Filters.FiltersImpl.SeniorFilter;
import Model.PeopleCounter;
import Model.Person;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Doe", 20, false),
                new Person("Smith", 30, true),
                new Person("Old", 70, true));
        PeopleCounter counter = new PeopleCounter();
        counter.setFilter(new AdultFilter());
        System.out.println("Adult counter: " + counter.count(people));
        counter.setFilter(new SeniorFilter());
        System.out.println("Senior counter: " + counter.count(people));
        counter.setFilter(new MarriedFilter());
        System.out.println("Married counter: " + counter.count(people));
    }
}
