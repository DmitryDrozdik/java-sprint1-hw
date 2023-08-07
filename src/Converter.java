public class Converter {
    final double TO_KM = 7.5e-6;
    final double TO_KILO = 5.0e-2;

    int convertToKm(int steps) {
        return (int)(steps * TO_KM);
    }

    int convertStepsToKilocalories(int steps) {
        return (int)(steps * TO_KILO);
    }
}
