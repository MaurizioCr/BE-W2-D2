import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        int count=0;
        boolean inputValido=false;
        String parolaAggiunta;

        //Creazione lista parola
        HashSet<String> parole = new HashSet<>();

        //Creazione lista parola duplicate
        HashSet<String> duplicati = new HashSet<>();

        do {
            try {
                //Ottengo il numero dall'utente
                System.out.println("Inserisci il numero di parole da inserire nella lista");
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

        do {
            System.out.println("Scrivi le parole da inserire");
            parolaAggiunta= scanner.nextLine();

            //Se la parola non viene aggiunta alla lista parole verrà aggiunta alla lista duplicati
            if (!parole.add(parolaAggiunta)) {
                duplicati.add(parolaAggiunta);
            }
            count++;
        } while (count!=n);
        scanner.close();

                        //For each delle liste

        System.out.println("*****ECCO LA TUA LISTA*****");
        for (String parola:parole
        ) {System.out.println(parola);
        }

        System.out.println("***** PAROLE DUPLICATE*****");
            for (String parola:duplicati
            ) {System.out.println(parola);
        }
    }
}
