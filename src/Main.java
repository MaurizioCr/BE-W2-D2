import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=0;
        int count=0;
        String parolaAggiunta;
        HashSet<String> parole = new HashSet<>();
        HashSet<String> duplicati = new HashSet<>();

        try {
            System.out.println("Inserisci il numero di parole da inserire nella lista");
            n = scanner.nextInt();
            scanner.nextLine();
        }
        catch (InputMismatchException ex){
            System.out.println("Inserisci un valore positivo");
        }


        do {
            System.out.println("Scrivi le parole da inserire");
            parolaAggiunta= scanner.nextLine();
            if (!parole.add(parolaAggiunta)) {
                duplicati.add(parolaAggiunta);
            }
            count++;
        } while (count!=n);
        scanner.close();

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
