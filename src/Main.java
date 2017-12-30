import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Joakim on 30/12/2017.
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList();

        array.add(7);
        array.add(40);
        array.add(22);
        array.add(35);
        array.add(91);
        array.add(7);
        array.add(31);

        // O(1)
        isFirstValueNull(array);

        // O(n)
        findFirstObjectInArray(array, 4);


        // O(n^2)
        containsDuplicates(array);

        // O(2^)
        System.out.println(factorial(6));

        // O(log n)
        System.out.println(binarySearch(31, array));

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

    public static <T> void findFirstObjectInArray(List<T> array, T object) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == object) {
                System.out.println("Object found on index: " + i);
            }
        }


    }
    // O(N^2)
        public static <T> void containsDuplicates(List<T> elements) {
            for (int outer = 0; outer < elements.size(); outer++)
            {
                for (int inner = 0; inner < elements.size(); inner++)
                {
                    // Don't compare with self
                    if (outer != inner) {
                        if (elements.get(outer) == elements.get(inner)) {
                            System.out.println("Duplikater fundet");
                            return;
                        }
                    }
                }
            }

            System.out.println("Ingen duplikater fundet");
        }


    // O(2^N)
    public static int factorial (int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number-1);

    }

    public static boolean binarySearch(int key, List<Integer> data)
    {

        // Binary virker kun på sorteret dataset
        Collections.sort(data);
        int low = 0;
        int high = data.size()-1;

        while(high >= low) {
            int middle = (low + high) / 2;

            if (data.get(middle) == key) {
                return true;
            }
            if (data.get(middle) < key) {
                low = middle + 1;
                             }
            if (data.get(middle) > key) {
                high = middle - 1;
            }
        }
        return false;
    }


    }

