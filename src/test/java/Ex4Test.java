import static org.junit.jupiter.api.Assertions.*;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;

public class Ex4Test {



        @Test
        public void testSolve() {
            // Test avec une équation ayant deux racines réelles distinctes
            double[] roots1 = QuadraticEquation.solve(1, -3, 2);
            assertArrayEquals(new double[]{2.0, 1.0}, roots1, 0.0001);

            // Test avec une équation ayant une seule racine réelle
            double[] roots2 = QuadraticEquation.solve(1, -2, 1);
            assertArrayEquals(new double[]{1.0}, roots2, 0.0001);

            // Test avec une équation n'ayant pas de racines réelles
            double[] roots3 = QuadraticEquation.solve(1, 2, 3);
            assertEquals(0, roots3.length);
        }

        @Test
        public void testSolveWithInvalidInput() {
            // Test avec a = 0
            assertThrows(IllegalArgumentException.class, () -> {
                QuadraticEquation.solve(0, 2, 3);
            });

            // Test avec delta négatif
            double[] roots = QuadraticEquation.solve(1, 1, 1);
            assertEquals(0, roots.length);
        }
    }


