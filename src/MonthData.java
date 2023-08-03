class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            // Вывод элементов массива в необходимом формате
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }
    int sumStepsFromMonth() {
        int sumSteps = 0;

        for (int i = 0; i < days.length; i++) {
            // Вывод элементов массива в необходимом формате
            sumSteps += days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            // поиск максимальной серии
            if (days[i] > goalByStepsPerDay) {
                currentSeries++;
            }
            else {
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
                currentSeries = 0;
            }
        }
        return finalSeries;
    }

    int avarageSteps() {
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }
        return sum/days.length;
    }
}