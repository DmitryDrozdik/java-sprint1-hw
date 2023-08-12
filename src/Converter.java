public class Converter {
    static final double TO_KM = 7.5e-4;
    static final double TO_KILO = 5.0e-2;

    int convertToKm(int steps) {
        return (int)(steps * TO_KM);
    }

    int convertStepsToKilocalories(int steps) {
        return (int)(steps * TO_KILO);
    }
}