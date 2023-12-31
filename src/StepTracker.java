import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10_000;
    Converter converter = new Converter();

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    int takeNum(boolean isIndex, String propmt, String errorMsg, int lower_bound, int upper_bound) {
        int result;
        while (true) {
            System.out.println(propmt);
            result = scanner.nextInt();

            if (result < lower_bound || result > upper_bound) {
                System.out.println(errorMsg);
            } else {
                if (isIndex) {
                    result -= 1;
                }
                break;
            }
        }
        return result;
    }

    void addNewNumberStepsPerDay() {
        // ввод и проверка номера месяца
        System.out.println("Введите месяц от 1 до 12 (включительно)");
        int month = takeNum(
                true,
                "Введите номер месяца",
                "Неверный номер месяца, номер месяца должен быть от 1 до 12",
                1, 12);

        System.out.println("Введите день от 1 до 30 (включительно)");
        // ввод и проверка дня
        int day = takeNum(true,
                "Введите номер дня",
                "Введено неверное значение дня! Значение дня должно быть от 1 до 30.",
                1, 30);

        // ввод и проверка количества шагов
        int step = takeNum(false,
                "Введите количество шагов",
                "Введено неверное значение количества шагов! Значение количества шагов должно быть больше 0",
                1, 100_000);

        // Получение соответствующего объекта MonthData из массива
        MonthData monthData = monthToData[month];
        // Сохранение полученных данных
        monthData.days[day] = step;
    }

    void changeStepGoal() {
        goalByStepsPerDay = takeNum(false,
                "Введите цель по количеству шагов:",
                "Введено неверное значение количества шагов! Значение количества шагов должно быть больше 0",
                1, 100_000);
    }

    void printStatistic () {
        // ввод и проверка номера месяца

        int month = takeNum(true,
                "Введите номер месяца",
                "Введено неверное значение месяца! Значение месяца должно быть от 1 до 12.",
                1, 12);

        MonthData monthData = monthToData[month]; // получение соответствующего месяца
        monthData.printDaysAndStepsFromMonth(); // вывод общей статистики по дням
        int monthSteps = monthData.sumStepsFromMonth();

        System.out.println("Сумма шагов за месяц:" + monthSteps + "."); // вывод суммы шагов за месяц
        System.out.println("Вывод максимального пройденного количества шагов за месяц: " + monthData.maxSteps() + ".");        // вывод максимального пройденного количества шагов за месяц
        System.out.println("Вывод среднего пройденного количества шагов за месяц:" + monthData.avarageSteps() + "."); // вывод среднего пройденного количества шагов за месяц
        System.out.println("Вывод пройденной за месяц дистанции в км:" + converter.convertToKm(monthSteps) + "."); // вывод пройденной за месяц дистанции в км
        System.out.println("Вывод количества сожжённых килокалорий за месяц: " + converter.convertStepsToKilocalories(monthSteps) + ".");        // вывод количества сожжённых килокалорий за месяц
        System.out.println("Лучшая серия за месяц: " + monthData.bestSeries(goalByStepsPerDay)); // вывод лучшей серии
        System.out.println(); //дополнительный перенос строки
    }
}
