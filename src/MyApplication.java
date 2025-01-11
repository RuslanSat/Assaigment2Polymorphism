import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Employee("George", "Harrison", "Developer", 50000.00));

        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Student("Paul", "McCartney", 3.9));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<? extends Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable.toString() + " earns " + String.format("%.2f", payable.getPaymentAmount()) + " tenge");
        }
    }
}


