import org.example.Palindrome;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ex1Test {

    @Test
    public void testIsPalindrome() {
       // Test de cas limite avec une chaîne vide.
        assertTrue(Palindrome.isPalindrome(""));

        // Test de cas limite avec une chaîne nulle, vérifiant qu'une exception de type NullPointerException est levée.
        assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });

        // Test de cas standard avec un palindrome.
        assertTrue(Palindrome.isPalindrome("kayak"));
        assertTrue(Palindrome.isPalindrome("Esope reste ici et se repose"));
        assertTrue(Palindrome.isPalindrome("Was it a car or a cat I saw"));

        // Test de cas standard avec une chaîne qui n'est pas un palindrome.
        assertFalse(Palindrome.isPalindrome("louai louai"));
        assertFalse(Palindrome.isPalindrome("This is not a palindrome"));
        assertFalse(Palindrome.isPalindrome("hello"));

        // Test de cas limite avec une seule lettre.
        assertTrue(Palindrome.isPalindrome("t"));

    }
}