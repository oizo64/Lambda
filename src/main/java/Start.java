import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.function.*;

public class Start {
    public static void main(String[] args) throws FileNotFoundException {
        Predicate<String> strlLen = (s) -> s.length() <10;
        System.out.println(strlLen.test("applweretweted"));

        Consumer<String> newValue = (s -> System.out.println(s.toLowerCase()));
        newValue.accept("asdf#RWEFSDFsdVsefWEF");
        Function<Integer, String> stringFunction = (num) -> Integer.toString(num.toString().length());
        System.out.println(stringFunction.apply(26));

        Supplier<String> s = () -> "test";
        System.out.println(s.get());

        BinaryOperator<Integer> add = (a,b) -> a + b;
        System.out.println(add.apply(2,2));

        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("sdfgweWEFWEFSed"));

        IntFunction<String> stringIntFunction = Integer::toString;
        System.out.println(stringIntFunction.apply(44233523).length());

        UnaryOperator<String> stringUnaryOperator = "Hello, "::concat;
        System.out.println(stringUnaryOperator.apply("test"));

        Person person = new Person("Piotr", "Kwiatkowski");
        Student student = new Student(person.getFirstName(), person.getLastName(), "UMK");
        System.out.println(person.getClass());
        System.out.println(student.getClass());

        Person newPerson = (Person)student;
        System.out.println(newPerson.getClass());
    }
}
