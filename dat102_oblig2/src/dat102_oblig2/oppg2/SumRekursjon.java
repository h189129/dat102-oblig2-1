package dat102_oblig2.oppg2;

// Oppgave 2a

public class SumRekursjon {

    // Rekursiv metode for å beregne Sn
    public static int sum(int n) {
        if (n <= 0) {
            return 0; // Basefall: Hvis n <= 0, returner 0
        } else {
            return n + sum(n - 1); // Rekursivt fall: Legg til n med sum(n-1)
        }
    }

    // Hovedprogram for å teste metoden
    public static void main(String[] args) {
        // Test med S100
        int n = 100;
        System.out.println("Sum av de " + n + " første naturlige tallene er: " + sum(n));

        // Ekstra tester
        System.out.println("Sum av de 10 første naturlige tallene er: " + sum(10));
        System.out.println("Sum av de 50 første naturlige tallene er: " + sum(50));
    }
}