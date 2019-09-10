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
}
