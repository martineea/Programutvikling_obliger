package programutvikling.oblig;


import java.util.*;


public class Oppgave1 {
    
    public static void main (String[] args){
        
        /* Gjør endringer i koden slik at du istedenfor bruker:
        1. LinkedList. Det vil si at du erstatter "ArrayList" med "LinkedList".
          Beskriv hva den endrede koden skriver ut til konsollen.
          I hvilke tilfeller er det anbefalt at man bruker ArrayList og hvilke tilfeller burde man bruke LinkedList?*/
        
        List<Integer> liste = new LinkedList<>();
        liste.add(1);
        liste.add(5);
        liste.add(5);
        liste.add(2);

        System.out.println(liste);
        
        /* Det samme blir skrevet ut, altså [1,5,5,2].
        Bedre å bruke LinkedList dersom man skal gjøre mange dynamiske endringer, som å slette.
        ArrayList derimot har raskere aksess, og foretrekkes derfor dersom det ikke skal gjøres dynamiske endringer */
        
          
       /* 
        2. Set med TreeSet. Her må du erstatte "List" med "Set" og "ArrayList" med "TreeSet".
          Beskriv hva denne koden skriver ut til konsoll og hvorfor utskriften er annerledes sammenliknet med List-koden.*/
        
        Set<Integer> liste1 = new TreeSet<>();
        liste1.add(1);
        liste1.add(5);
        liste1.add(5);
        liste1.add(2);

        System.out.println(liste1);
        
        /* Når jeg endrer fra List til Set, gjør jeg om listen til en mengde. Set er altså en matematisk mengde.
        En mengde kan ikke inneholde duplikate elementer. Derfor blir utskriften annerledes, da det ikke blir to 5-tall, men ett.
        Treeset er en konkret klasse innenfor mengder som lagrer objektene i en gitt rekkefølge,
        man ser derfor at mengden er sortert [1,2,5] */
        
        
    }
    
}
