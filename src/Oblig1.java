import java.util.Arrays;
import java.util.Random;

public class Oblig1 {


    //************************************************
    //Oppgave 1
    //************************************************

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
    //Oppgave 3
    //***********************************************************

    public static int antallUlikeUsortert (int[] array) {
         if (array.length == 0) {
             return 0;
         } else {

             int antallUnikeTall = array.length;
             int counter = 0;

             for (int i = 0; i < array.length; i++) {

                 for (int j = array.length - 1; j > i; j--) {

                     if (array[i] == array[j]) {
                         counter++;
                     }
                 }
                 antallUnikeTall = antallUnikeTall - counter;
                 counter = 0;
             }

            return antallUnikeTall;
         }
    }

    //***********************************************************
    //Oppgave 4
    //***********************************************************

    public static void delSortering(Integer arr[]) {

        int n = arr.length;

        int l = 0, r = n - 1;
        int k = 0;

        while (l < r) {
            while (arr[l] % 2 != 0) {
                l++;
                k++;
            }

            while (arr[r] % 2 == 0 && l < r)
                r--;

            if (l < r) {
                int x = arr[l];
                arr[l] = arr[r];
                arr[r] = x;
            }
        }

        int p = arr.length;

        for (int i = 0; i < k-1; i++)
            for (int j = 0; j < k - i - 1; j++)
                if (arr[j] > arr[j + 1]) {

                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

        for (int m = k; m < p-1; m++)
            if (arr[m] > arr[m+1])
            {
                int midlertidig = arr[m];
                arr[m] = arr[m+1];
                arr[m+1] = midlertidig;
            }
    }

    //***********************************************************
    //Oppgave 5
    //***********************************************************

    public static void rotasjon(char[] a) {
        if (a.length != 0){

            char[] arr = a;
            int n = 1;

            for (int i = 0; i < n; i++) {
                int j;
                Character last;
                last = arr[arr.length - 1];

                for (j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;

            }
        }
    }



    //***********************************************************
    //Oppgave 6
    //***********************************************************

    /*


     */

    public static void rotasjon2(char[] a, int n) {

        if (a.length != 0) {
            char[] arr = a;
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    int j;

                    Character last;
                    last = arr[arr.length - 1];

                    for (j = arr.length - 1; j > 0; j--) {
                        arr[j] = arr[j - 1];

                    }
                    arr[0] = last;
                }
            }
            else if (n< 0){
                for (int i = 0; i > n; i--) {
                    /*
                    Rotering mot venstre, har ikke helt fått det til

                    int j;

                    Character first;
                    first = arr[arr.length -1];

                    for (j = arr.length + 1; j > 0; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[0] = first;*/
                }
            }
        }
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
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
