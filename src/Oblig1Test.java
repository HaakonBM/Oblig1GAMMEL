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
}
