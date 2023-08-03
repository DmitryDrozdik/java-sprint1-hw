import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();
            int i = scanner.nextInt();

            if (i == 1)
            {
                // здесь будет логика команды 1
                System.out.println("Выполняется команда 1");
                stepTracker.addNewNumberStepsPerDay();
            }
            else if (i == 2)
            {
                // здесь будет логика команды 2
                System.out.println("Выполняется команда 2");
                stepTracker.changeStepGoal();
            }
            else if (i == 3)
            {
                // здесь будет логика команды 3
                System.out.println("Выполняется команда 3");

            }
            else if (i == 4)
            {
                System.out.println("Пока!");
                scanner.close();
                return;
            }
            else
            {
                System.out.println("Такой команды нет");
            }
        }
    }

    static void printMenu() {
        System.out.println("Добрый день!");
        System.out.println("Выберете номер необходимого действия:");
        System.out.println("1 - Введите количество шагов за определенный день:");
        System.out.println("2 - Изменить цель по количеству шагов в день.");
        System.out.println("3 - напечатать статистику за определённый месяц.");
        System.out.println("4 - Выйти из приложения.");
    }
}