import static org.junit.jupiter.api.Assertions.*;

import org.example.Anagram;
import org.junit.jupiter.api.Test;


public class Ex2Test {

    @Test
    public void testIsAnagram() {
        // Test avec une chaîne vide
        assertTrue(Anagram.isAnagram("", ""));

        // Cas standard de test
        assertTrue(Anagram.isAnagram("listen", "silent"));

        // Test avec des chaînes de longueurs différentes
        assertFalse(Anagram.isAnagram("hello", "world"));

        // Test avec des chaînes contenant des espaces
        assertTrue(Anagram.isAnagram("school master", "the classroom"));

        // Test avec des chaînes contenant des caractères spéciaux
        assertTrue(Anagram.isAnagram("debit card", "bad credit"));

        // Test avec des chaînes nulles (devrait déclencher une exception)
        try {
            Anagram.isAnagram(null, "string");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // attendu
        }
        try {
            Anagram.isAnagram("string", null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // attendu
        }
        // Test avec les deux chaînes nulles (devrait déclencher une exception)
        try {
            Anagram.isAnagram(null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // attendu
        }
    }
}
