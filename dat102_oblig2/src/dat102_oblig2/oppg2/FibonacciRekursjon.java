package dat102_oblig2.oppg2;

// Oppgave 2 c

public class FibonacciRekursjon {

    // Rekursiv metode for å beregne fibonacci-tall
    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0; // Basefall: f0 = 0
        } else if (n == 1) {
            return 1; // Basefall: f1 = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Rekursivt fall
        }
    }

    // Hovedprogram for å teste metoden
    public static void main(String[] args) {
        // Test med noen verdier av n
        for (int i = 0; i <= 10; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }

        // Eksempel på hvor lang tid det tar for større verdier av n
        for (int n = 35; n <= 46; n++) {
	        long startTime = System.nanoTime();
	        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
	        long endTime = System.nanoTime();
	
	        System.out.printf("Tid brukt for Fibonacci(%d): %.6f sekunder%n", n, (endTime - startTime) / 1_000_000_000.0);
        }
    }
}
