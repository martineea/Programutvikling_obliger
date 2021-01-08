package programutvikling.oblig;


public class Oppgave2 {
    
    public static void main (String[] args){
        
        /* String str1 = new String("OsloMet");
        String str2 = new String("OsloMet");
        boolean erlik = str1 == str2;
        System.out.println(erlik);
        
        Denne sammenlikningen gir false (prøv selv), selv om de to strengene er like.
        Dette er fordi == operatoren gjør sammenlikning av verdiene til referansevariabler
        og vil derfor bare gi sann hvis de to referansevariablene refererer til samme objekt.
        Beskriv hva dette innebærer.

        En mer korrekt metode for å sammenlikne objekter er å bruke equals metoden.
        Gjør endringer i koden slik at sammenlikningen bruker denne equals metoden,
        noe som vil føre til at erlik-variabelen blir true.*/
        
        /* Vi oppretter to forskjellige String objekter. Selvom de begge inneholder stringen "Oslomet",
        så betyr ikke dette at de peker på samme objekt. De peker begge på hvert sitt objekt som begge inneholder "Oslomet". 
        Men skulle man fått dem til å peke på samme objekt måtte man satt str1 = str2. */
        
        String str1 = new String("OsloMet");
        String str2 = new String("OsloMet");
        boolean erlik = str1.equals(str2);
        System.out.println(erlik);
        
        
    }
    
}
