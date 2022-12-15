public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println(" ");
        task2();
        System.out.println(" ");
        task3();
        System.out.println(" ");
        task4();
        System.out.println(" ");
        task5();
        System.out.println(" ");
        task6();
        System.out.println(" ");
        task7();
        System.out.println(" ");
        task8();

    }

    private static void task1() {
        System.out.println("Задача 1");

        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + ",сумма накоплений равна " + total + " рублей.");
        }

    }

    private static void task2() {
        System.out.println("Задача 2");

        int i = 0;
        while (i <= 9) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (; i >= 1; ) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");

        int populationSize = 12_000_000;
        int birthRatePer1000 = 17;
        int mortalityPer1000 = 8;
        int countOfYear = 0;

        while (countOfYear < 10) {
            populationSize = populationSize + ((birthRatePer1000 - mortalityPer1000) * (populationSize / 1000));
            countOfYear++;
            System.out.println("Год " + countOfYear + ", численность населения составляет " + populationSize);
        }

    }

    private static void task4() {
        System.out.println("Задача 4");

        double deposit = 15000;
        double interestRatePerMonth = 0.07;
        int countOfMonth = 0;
        for (; deposit < 12_000_000; ) {
            deposit = deposit + deposit * interestRatePerMonth;
            countOfMonth++;
            System.out.println("Месяц " + countOfMonth + ": итого " + deposit);
        }
        System.out.println("Итого: " + deposit);
    }


    private static void task5() {
        System.out.println("Задача 5");
        double deposit = 15000;
        double interestRatePerMonth = 0.07;
        int countOfMonth = 0;
        for (; deposit < 12_000_000; ) {
            deposit = deposit + deposit * interestRatePerMonth;
            countOfMonth++;
            if (countOfMonth % 6 == 0) {
                System.out.println("Месяц " + countOfMonth + ": итого " + deposit);
            }
        }
        System.out.println("Итого: " + deposit);
    }


    private static void task6() {
        System.out.println("Задача 6");
        double deposit = 15000;
        double interestRatePerMonth = 0.07;
        int countOfMonth;
        int countOfYear = 9;
        int totalCountOfMonth = countOfYear * 12;

        for (countOfMonth = 1; countOfMonth < totalCountOfMonth; ) {
            deposit = deposit + deposit * interestRatePerMonth;
            countOfMonth++;
            if (countOfMonth % 6 == 0) {
                System.out.println("Месяц " + countOfMonth + " Итого " + deposit);
            }
        }
        System.out.println("Итого: общее количество месяцев - " + countOfMonth +
                ". Общая сумма накоплений - " + deposit);
    }

    private static void task7() {
        System.out.println("Задача 7");

        int fridayDate = 1;
        int countOfDaysPerMonth = 31;

        while (fridayDate <= countOfDaysPerMonth) {
            System.out.println("Сегодня пятница " + fridayDate + "-е число. Необходимо подготовить отчет.");
            fridayDate = fridayDate + 7;
        }
    }

    private static void task8() {
        System.out.println("Задача 8");

        int year = 0;
        int frequencyOfCometAppearance = 79;
        while (year <= 2122-frequencyOfCometAppearance) {
            year += 79;
            if (year >= 1822) {
                System.out.println(year);
            }

        }

    }
}