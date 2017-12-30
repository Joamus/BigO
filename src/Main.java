import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joakim on 30/12/2017.
 */
public class Main {

    public static void main(String[] args) {

    }

    // O(1)
    public static <T> void isFirstValueNull (List<T> array) {
        if (array.get(0) == null) {
            System.out.println("First value of array is null");
        } else if (array.get(0) != null) {
            System.out.println("First value of array is NOT null");
        }

    }

    // O(N)

    public static <T> void findObjectInArray (List<T> array, T object) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == object) {
                System.out.println("Object found on index: " + i);
            }
        }


    }
    // O(N^2)
        public static <T> void ContainsDuplicates(List<T> elements) {
            for (int outer = 0; outer < elements.size(); outer++)
            {
                for (int inner = 0; inner < elements.size(); inner++)
                {
                    // Don't compare with self
                    if (outer != inner) {
                        if (elements.get(outer) == elements.get(inner)) {
                            System.out.println("Duplikater fundet");
                        }
                    }
                }
            }

            System.out.println("Ingen duplikater fundet");
        }


    // O(2^N)
    public static void twoN (int number, int power) {
        

    }

    public static void logN () {


    }
}
