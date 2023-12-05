import java.util.*;

public class Esercizio2 {
    public static void main(String[] args) {
        int n = 0;
        int count=0;
        boolean inputValido = false;
        //Per numero casuale
        Random random = new Random();

        List randomNumber = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                //Ottengo il numero dall'utente
                System.out.println("Inserisci il numero di di valori casuali da generare nella tua lista ");
                n = scanner.nextInt();
                scanner.nextLine();

                //In caso di numero positivo input true per uscire dal loop
                if (n > 0) {
                    inputValido = true;
                } else {
                    System.err.println("Inserisci un valore intero positivo.");
                    scanner.nextLine();
                }

                //Catturare Errore non valore
            } catch (InputMismatchException ex) {
                System.err.println("Inserisci un valore intero positivo.");
                scanner.nextLine();
            }
            //Finchè l'input è false ripetere il loop
        } while (!inputValido);

        for (int i=0; i<n; i++){
            int numeroCasuale = random.nextInt(100) + 1;
            randomNumber.add(numeroCasuale);
        }

        Collections.sort(randomNumber);
        scanner.close();
        System.out.println(randomNumber);

    }
}
