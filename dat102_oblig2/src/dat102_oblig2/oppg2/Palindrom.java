package dat102_oblig2.oppg2;

// Oppgave 2 b

public class Palindrom {

    // Rekursiv metode for å sjekke om en streng er et palindrom
    public static boolean isPalindrome(String s) {
        // Fjern mellomrom og gjør alle tegn til små bokstaver for å forenkle sammenligningen
        String normalized = s.replaceAll("\\s+", "").toLowerCase();

        return isPalindromeHelper(normalized, 0, normalized.length() - 1);
    }

    // Hjelpe-metode som bruker to pekere (start og slutt)
    private static boolean isPalindromeHelper(String s, int start, int end) {
        // Basefall: Hvis start >= slutt, er strengen et palindrom
        if (start >= end) {
            return true;
        }

        // Sjekk om de to tegnene på start- og sluttposisjonen er like
        if (s.charAt(start) != s.charAt(end)) {
            return false; // Ikke et palindrom
        }

        // Rekursivt kall med oppdaterte indekser
        return isPalindromeHelper(s, start + 1, end - 1);
    }

    // Hovedprogram for å teste metoden
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba")); // true
        System.out.println(isPalindrome("regninger")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome("A man a plan a canal Panama")); // true
    }
}