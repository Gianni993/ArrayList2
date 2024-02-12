import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class App {

/*
    Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
    In questa classe avere i metodi pubblici per ottenere le informazioni.
    Creare un ArrayList con 12 elementi e stamparlo in console.
    Mettere in ordine la collezione e stampare il risultato
*/
    public static void main(String[] args) throws Exception {
        
        List<Studente> studenti1 = new ArrayList<Studente>();
        new Studente("Simone", 21);

        studenti1.add(new Studente("Franco", 20));
        studenti1.add(new Studente("Simone", 21));
        studenti1.add(new Studente("Alessio", 22));
        studenti1.add(new Studente("Marco", 23));
        studenti1.add(new Studente("Beatrice", 24));
        studenti1.add(new Studente("Zidane", 25));
        studenti1.add(new Studente("Mimmo", 20));
        studenti1.add(new Studente("Simona", 27));
        studenti1.add(new Studente("Fabio", 28));
        studenti1.add(new Studente("Giammarco", 19));
        studenti1.add(new Studente("Gigi", 27));
        studenti1.add(new Studente("Albero", 25));

        Collections.sort(studenti1);
        
        System.out.println(studenti1);

    }
}
