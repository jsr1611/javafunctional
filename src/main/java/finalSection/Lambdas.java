package finalSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
//        Function<String, String> toUpperCaseName = String::toUpperCase; // name.toUpperCase();
          Function<String, String> toUpperCaseName = name -> {
              //if you need some logic
              if(name.isBlank()) throw new IllegalStateException("");
              return name.toUpperCase();
          };

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            // logic
            if(name.isBlank()) throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        String upperCasedName = upperCaseName.apply("Alex", 20);
        System.out.println(upperCasedName);





    }
}
