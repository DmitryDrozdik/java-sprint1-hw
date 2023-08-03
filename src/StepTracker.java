import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];

    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        // ввод и проверка номера месяца
        int month;

        while(true) {
            System.out.println("Введите номер месяца");
            month = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Введено неверное значение месяца! Значение месяца должно быть от 1 до 12.");
            }
            else
            {
                month -= 1;
                break;
            }
        }

        System.out.println("Введите день от 1 до 30 (включительно)");


        // ввод и проверка дня

        int day;

        while(true) {
            System.out.println("Введите номер дня");
            day = scanner.nextInt();

            if (day < 1 || day > 30) {
                System.out.println("Введено неверное значение дня! Значение дня должно быть от 1 до 30.");
            }
            else
            {
                day -= 1;
                break;
            }
        }


        // ввод и проверка количества шагов

        int step;

        while(true) {
            System.out.println("Введите количество шагов");
            // ввод и проверка количества шагов
            step = scanner.nextInt();

            if (step < 1) {
                System.out.println("Введено неверное значение количества шагов! Значение количества шагов должно быть больше 0");
            }
            else
            {
                break;
            }
        }


        // Получение соответствующего объекта MonthData из массива
        MonthData monthData = monthToData[month];
        // Сохранение полученных данных
        monthData.days[day] = step;
    }

    void changeStepGoal() {
        int step;

        while(true) {
            System.out.println("Введите цель по количеству шагов:");
            step = scanner.nextInt();

            if (step < 1) {
                System.out.println("Введено неверное значение количества шагов! Значение количества шагов должно быть больше 0");
            }
            else
            {
                break;
            }
        }

    }
}