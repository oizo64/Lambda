import Interface.Drivable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Klasa startowa
 */
public class Test {
    /**
     * Fukcja main
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        Consumer<Integer> consumer = n -> System.out.println(n);
        integerArrayList.forEach(consumer);

        Drivable drivable = x -> {
            System.out.println(x);
            return x * x;
        };

        int force = 6;
        System.out.println(drivable.accelerate(force));
        System.out.println(drivable.accelerate(force));

        List<String> namesList = Arrays.asList("Joh4rrsn", "Marry", "George", "Paul", "Alice", "Ann");
        namesList
                .stream()
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List<Integer> liczby = List.of(65, 44, 12, 4);
        List<Integer> newArr = liczby.stream().map(n-> n+1).toList();
        System.out.println(newArr);
        Object objects = new Object();
        System.out.println(     objects.toString() + objects.getClass());

    }




}
