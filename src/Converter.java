public class Converter {

    int convertToKm(int steps) {
        double result = steps * (75.0 / 100 / 1000);
        return (int)result;
    }

    int convertStepsToKilocalories(int steps) {
        double result = steps * (50.0 / 1000);
        return (int)result;

    }


}
