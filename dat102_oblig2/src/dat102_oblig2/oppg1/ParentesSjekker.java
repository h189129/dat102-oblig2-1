package dat102_oblig2.oppg1;

public class ParentesSjekker {

    public boolean sjekkParenteser(String s) {
        LenketStabel<Character> stabel = new LenketStabel<>();

        // Gjør om strengen til et char-array
        char[] tegn = s.toCharArray();

        // Iterer gjennom hvert tegn i strengen
        for (char c : tegn) {
            if (erStartParentes(c)) {
                // Legger startparenteser på stabelen
                stabel.push(c);
            } else if (erSluttParentes(c)) {
                // Hvis det er en sluttparentes, sjekk om den matcher toppen av stabelen
                if (stabel.isEmpty() || !erParentesPar(stabel.pop(), c)) {
                    return false; // Ugyldig hvis ingen matchende startparentes
                }
            }
        }

        // Strengen er gyldig hvis stabelen er tom etter at alle tegn er behandlet
        return stabel.isEmpty();
    }

    // Hjelpemetoder

    // Sjekker om et tegn er en startparentes
    private boolean erStartParentes(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    // Sjekker om et tegn er en sluttparentes
    private boolean erSluttParentes(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    // Sjekker om to tegn danner et gyldig parentespar
    private boolean erParentesPar(char start, char slutt) {
        return (start == '(' && slutt == ')') ||
               (start == '[' && slutt == ']') ||
               (start == '{' && slutt == '}');
    }
}