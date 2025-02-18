package dat102_oblig2.oppg1Test;

// ParentesSjekkerTest.java
import org.junit.jupiter.api.Test;

import dat102_oblig2.oppg1.ParentesSjekker;

import static org.junit.jupiter.api.Assertions.*;

class ParentesSjekkerTest {

    @Test
    void testGyldigeStrenger() {
        ParentesSjekker sjekker = new ParentesSjekker();

        // Test med gyldige strenger
        assertTrue(sjekker.sjekkParenteser("{ [ ( ) ] }"), "Test feilet for { [ ( ) ] }");
        assertTrue(sjekker.sjekkParenteser("class HelloWorld { public static void main(String[] args) { System.out.println(\"Hello World!\"); } }"),
                   "Test feilet for Java-program");

        // Andre gyldige tester
        assertTrue(sjekker.sjekkParenteser("()"), "Test feilet for ()");
        assertTrue(sjekker.sjekkParenteser("([])"), "Test feilet for ([])");
        assertTrue(sjekker.sjekkParenteser("{[()]}"), "Test feilet for {[()]}");
    }

    @Test
    void testUgyldigeStrenger() {
        ParentesSjekker sjekker = new ParentesSjekker();

        // Test med ugyldige strenger
        assertFalse(sjekker.sjekkParenteser("{ [ ( ) }"), "Test feilet for { [ ( ) }");
        assertFalse(sjekker.sjekkParenteser("[ ( ) ] }"), "Test feilet for [ ( ) ] }");
        assertFalse(sjekker.sjekkParenteser("{ [ ( ] ) }"), "Test feilet for { [ ( ] ) }");

        // Andre ugyldige tester
        assertFalse(sjekker.sjekkParenteser("("), "Test feilet for (");
        assertFalse(sjekker.sjekkParenteser("([)]"), "Test feilet for ([)]");
        assertFalse(sjekker.sjekkParenteser("{[}"), "Test feilet for {[}");
    }
}