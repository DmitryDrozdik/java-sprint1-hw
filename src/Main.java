import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();
            int i = scanner.nextInt();

            switch (i) {
                case 1:
                    // здесь будет логика команды 1
                    System.out.println("Выполняется команда 1");
                    stepTracker.addNewNumberStepsPerDay();
                    break;

                case 2:
                    // здесь будет логика команды 2
                    System.out.println("Выполняется команда 2");
                    stepTracker.changeStepGoal();
                    break;

                case 3:
                    // здесь будет логика команды 3
                    System.out.println("Выполняется команда 3");
                    stepTracker.printStatistic();
                    break;

                case 4:
                    System.out.println("Пока!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Такой команды нет");
            }
        }
    }

    static void printMenu() {
        System.out.println(
                "Добрый день!\n" +
                "Выберете номер необходимого действия:\n" +
                "1 - Введите количество шагов за определенный день:\n" +
                "2 - Изменить цель по количеству шагов в день.\n" +
                "3 - Напечатать статистику за определённый месяц.\n" +
                "4 - Выйти из приложения.\n"
        );
    }
}