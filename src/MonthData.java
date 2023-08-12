class MonthData {
    final int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int day = 0; day < days.length; day++) {
            // Вывод элементов массива в необходимом формате
            System.out.println((day + 1) + " день: " + days[day]);
        }
    }
    int sumStepsFromMonth() {
        int sumSteps = 0;

        for (int day = 0; day < days.length; day++) {
            // Вывод элементов массива в необходимом формате
            sumSteps += days[day];
        }
        return sumSteps;
    }

    int max (int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    int maxSteps() {
        int maxSteps = 0;

        for (int day = 0; day < days.length; day++) {
            maxSteps = max(maxSteps, days[day]);
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;

        for (int day = 0; day < days.length; day++) {
            // поиск максимальной серии
            if (days[day] > goalByStepsPerDay) {
                currentSeries++;
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
            }
            else {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }

    int avarageSteps() {
        int sum = 0;
        for (int day = 0; day < days.length; day++) {
            sum += days[day];
        }
        return sum/days.length;
    }
}