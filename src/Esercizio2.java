import java.util.*;


public class Esercizio2 {
    public static List<Integer> numeriPari (List<Integer> lista){
        List <Integer> numeripari = new ArrayList();
        for (int i=0; i<lista.size(); i++){

            if (lista.get(i)%2==0){
                numeripari.add(lista.get(i));
            }
        }
        return numeripari ;
    }
    public static List<Integer> numeriDispari (List<Integer> lista){
        List <Integer> numeridispari = new ArrayList();
        for (int i=0; i<lista.size(); i++){

            if (lista.get(i)%2!=0){
                numeridispari.add(lista.get(i));
            }
        }
        return numeridispari ;
    }
    public static void main(String[] args) {
        int n = 0;
        boolean inputValido = false;
        boolean pari;
        //Per numero casuale
        Random random = new Random();

        List <Integer> randomNumber = new ArrayList();

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

        System.out.println("Numeri pari della lista: "+numeriPari(randomNumber));
        System.out.println("Numeri pari della lista: "+numeriDispari(randomNumber));


    }
}
