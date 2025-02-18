package dat102_oblig2.oppg2;

// Oppgave 2 d

public class FibonacciIterativ {

    // Ikke-rekursiv metode for å beregne fibonacci-tall
    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0; // Basefall: f0 = 0
        } else if (n == 1) {
            return 1; // Basefall: f1 = 1
        }

        // Bruk to variabler for å lagre de to siste Fibonacci-verdiene
        long prev1 = 0; // f_{n-2}
        long prev2 = 1; // f_{n-1}
        long fib = 0;

        // Beregner Fibonacci-tallene iterativt
        for (int i = 2; i <= n; i++) {
            fib = prev1 + prev2; // f_n = f_{n-1} + f_{n-2}
            prev1 = prev2;       // Oppdater f_{n-2}
            prev2 = fib;         // Oppdater f_{n-1}
        }

        return fib;
    }

    // Hovedprogram for å teste metoden
    public static void main(String[] args) {
        // Test med noen verdier av n
        for (int i = 0; i <= 10; i++) {
            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
        }

        // Eksempel på hvor lang tid det tar for større verdier av n
        int n = 50;
        long startTime = System.nanoTime();
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        long endTime = System.nanoTime();

        System.out.printf("Tid brukt for Fibonacci(%d): %.6f sekunder%n", n, (endTime - startTime) / 1_000_000_000.0);
    }
}