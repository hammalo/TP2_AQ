import static org.junit.jupiter.api.Assertions.*;

import org.example.BinarySearch;
import org.junit.jupiter.api.Test;

public class Ex3Test {



        @Test
        public void testBinarySearch() {
            int[] array = {1, 3, 5, 7, 9, 11, 13};

            // Test lorsque l'élément est présent dans le tableau
            assertEquals(0, BinarySearch.binarySearch(array, 1));
            assertEquals(3, BinarySearch.binarySearch(array, 7));
            assertEquals(6, BinarySearch.binarySearch(array, 13));

            // Test lorsque l'élément n'est pas présent dans le tableau
            assertEquals(-1, BinarySearch.binarySearch(array, 0));
            assertEquals(-1, BinarySearch.binarySearch(array, 2));
            assertEquals(-1, BinarySearch.binarySearch(array, 4));
            assertEquals(-1, BinarySearch.binarySearch(array, 8));
            assertEquals(-1, BinarySearch.binarySearch(array, 10));
            assertEquals(-1, BinarySearch.binarySearch(array, 12));
            assertEquals(-1, BinarySearch.binarySearch(array, 14));

            // Test avec un tableau vide
            int[] emptyArray = {};
            assertEquals(-1, BinarySearch.binarySearch(emptyArray, 5));

            // Test avec un tableau contenant un seul élément
            int[] singleElementArray = {5};
            assertEquals(0, BinarySearch.binarySearch(singleElementArray, 5));
            assertEquals(-1, BinarySearch.binarySearch(singleElementArray, 10));

            // Test avec un tableau contenant plusieurs occurrences de l'élément
            int[] multipleOccurrencesArray = {2, 2, 2, 2, 2, 2, 2};
            assertEquals(3, BinarySearch.binarySearch(multipleOccurrencesArray, 2));
        }
    }


