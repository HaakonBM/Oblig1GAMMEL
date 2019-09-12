import org.junit.jupiter.api.Test;

public class Oblig1Test {

    @Test
    void maks() {
        int[] values = {1, 6, 41, 8, 0, 31};
        int størsteVerdi = 0;

        størsteVerdi = Oblig1.maks(values);

        if (størsteVerdi != 41) {
            System.out.println("Fant ikke største verdi");
        }

        System.out.println("Strørse verdi er " + størsteVerdi);
    }

    @Test
    void ombyttinger() {
        int[] values = {1, 6, 41, 8, 0, 31};

        int antallOmbyttinger = Oblig1.ombyttinger(values);

        System.out.println("Antall ombyttinger er " + antallOmbyttinger);


    }

    @Test
    void antallUlikeUsortert() {

        int[] array = {5, 3, 7, 4, 3, 5, 7, 8, 6, 7};

        int antallUnikeTall = Oblig1.antallUlikeUsortert(array);

        System.out.println("Antall unike tall er: " +  antallUnikeTall);

        int[] arrayTo = {2,7,9,11,7,2};

        int antall = Oblig1.antallUlikeUsortert(arrayTo);

        System.out.println("Antall unike tall i tabell to: " + antall);
    }


    @Test
    void delSortering(){
        Integer[] arr = {-3,4,9,5,2,8,-5,1,10 };

        delSortering(arr);

        System.out.println(Arrays.toString(arr));
    }


    @Test
    void rotasjon(){
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] charArrayEmpty = new char[0];
        char[] charArrayOne = {'a'};

        Rotasjon.rotasjon(charArray);
        System.out.println(Arrays.toString(charArray));

    }

}
