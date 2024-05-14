public class Main {
    public static void main(String[] args) {
        //Task 1
        int[] incomes = new int[5];
        int sumIncomes = 0;
        incomes[0] = 65323;
        incomes[1] = 98211;
        incomes[2] = 85343;
        incomes[3] = 30543;
        incomes[4] = 77271;
        for (int i : incomes) {
            sumIncomes += i;
        }
        System.out.println("Задача 1\nСумма трат за месяц: " + sumIncomes + " рублей.");


        //Task 2
        int [] spending = new int[5];
        int maxSpending = -1;
        int minSpending = Integer.MAX_VALUE;
        spending[0] = 15443;
        spending[1] = 92171;
        spending[2] = 15341;
        spending[3] = 50523;
        spending[4] = 27231;
        for (int i =0; i < spending.length; i++) {
            final int currentMaxSpending = spending[i];
            if (currentMaxSpending > maxSpending) {
                maxSpending = currentMaxSpending;
            }
        }
        for (int i =0; i < spending.length; i++) {
            final int currentMinSpending = spending[i];
            if (currentMinSpending < minSpending) {
                minSpending = currentMinSpending;
            }
        }
        System.out.println("\nЗадача 2\nМинимальная сумма трат за неделю составила " + minSpending + " рублей." +
                " Максимальная сумма трат за неделю составила " + maxSpending + " рублей.");


        //Task 3
        int [] companySpending = new int[5];
        companySpending[0] = 313313;
        companySpending[1] = 498211;
        companySpending[2] = 385343;
        companySpending[3] = 250423;
        companySpending[4] = 550423;
        int averageSumCompanySpending = 0;
        for (int i : companySpending) {
            averageSumCompanySpending += i;
        }
        averageSumCompanySpending = averageSumCompanySpending / companySpending.length;
        System.out.println("\nЗадача 3\nСредняя сумма трат за месяц составила " + averageSumCompanySpending + " рублей.");


        //Task 4
        System.out.println("\nЗадача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', 'v', 'o', 'n', 'a', 'v', 'I'};
        if (Character.isUpperCase(reverseFullName [reverseFullName.length - 1])) {
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        } else {
            for (char i: reverseFullName) {
                System.out.print(i);
            }
        }
    }
}
