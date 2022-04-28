package streams;

import imperative.Main;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Ali", Gender.MALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Alice", Gender.FEMALE)
        );

//        people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println; // = x -> System.out.println(x);

//        people.stream()
//                .map(personStringFunction)
//                .mapToInt(length)
//                .forEach(println);

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        boolean containsOnlyFemales = people.stream()
                .allMatch(personPredicate);

        System.out.println(containsOnlyFemales);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
