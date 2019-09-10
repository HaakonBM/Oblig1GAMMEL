import java.util.Arrays;
import java.util.Random;

public class Oblig1 {

    public static int maks (int[] array) {

        /* Skal teste om lengden er 0

        if (array.length <= 0) {
            throw exc
        }
        */
        int j = 1;
        int tempInt;

        for (int i = 0; i < array.length - 1; i++ ) {

            if (array[i] > array[j]) {
                tempInt = array[i];
                array[i] = array[j];
                array[j] = tempInt;
            }
            j++;
        }
        //Sjekker at tabellen er riktig sortert;
        for (int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }
         
        return array[array.length -1];

        /*Spørsmål til oppgaven
        - Når blir det flest ombyttinger?
        Det blir flest ombyttinger når den største verdien ligger først. Da vil den flyttes bakover ved hver eneste
        sammenligning. Det vil bli n -1 sammenligninger og like mange ombyttinger

        - Når blir det færrest ombyttinger?
        Det blir færrest ombyttinger når tabellen er allerede er sortert i stigende rekkefølge. Da vil ha n- 1
        sammenlikniger og ingen ombyttinger.

        - Hvor mange ombyttiger er det gjennomsnittlig?



         */
    }

    public static int ombyttinger (int[] array) {
        int antallOmbyttinger = 0;
        int hjelpeTeller = 1;
        int tempInt = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[hjelpeTeller]) {
                tempInt = array[i];
                array[i] = array[hjelpeTeller];
                array[hjelpeTeller] = tempInt;
                antallOmbyttinger++;
            }
            hjelpeTeller++;
        }
        return antallOmbyttinger;
    }

    //***********************************************************
    //Hjelpemetoder fra kompendiet
    //***********************************************************
    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            bytt(a,k,i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }
    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }
}
