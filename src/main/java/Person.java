import java.util.Comparator;
import java.util.List;

public final class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public static Person getOldestPerson(List<Person> people) {
        return people.stream()
                .max(Comparator.comparing(Person::getAge))
                .get();
    }
}
