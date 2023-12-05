import java.util.*;

public class Esercizio2 {
    public static void main(String[] args) {
        int n = 0;
        boolean inputValido = false;
        boolean pari;
        //Per numero casuale
        Random random = new Random();

        List <Integer> randomNumber = new ArrayList();
        List <Integer> numeriPari = new ArrayList();
        List <Integer> numeriDispari = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                //Ottengo il numero sentential
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
        scanner.close();

        //Ordinare la lista
        Collections.sort(randomNumber);
        System.out.println("List ordinata: " + randomNumber);

        //Invertire la lista
        Collections.sort(randomNumber, Collections.reverseOrder());
        System.out.println("List non ordinata: " + randomNumber);
        System.out.println(randomNumber.get(0));

        //Nuova lista di numeri pari
        for (int i=0; i<randomNumber.size(); i++){

            if (randomNumber.get(i)%2==0){
                numeriPari.add(randomNumber.get(i));
            }
            else{
                numeriDispari.add(randomNumber.get(i));
            }
        }
        System.out.println("Numeri pari della lista: "+numeriPari);
        System.out.println("Numeri pari della lista: "+numeriDispari);


    }
}
