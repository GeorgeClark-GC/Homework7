public class Main {
    public static void main(String[] args) {
        System.out.println("Example 1");
        int savings = 0;
        int month = 0;
        int contribution = 15000;
        while(savings < 2459000){
            month ++;
            savings = savings + savings/100 + contribution;
            System.out.println("Месяц " + month + ", сумма накоплений равна: " + savings + " рублей.");
        }
        System.out.println("Example 2");
        int i = 0;
        while (i < 10){
            i ++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0;){
            System.out.print(i + " ");
            i --;
        }
        System.out.println();
        System.out.println("Example 3");
        int population = 12000000;
        int born = 17;
        int death = 8;
        int year = 0;
        do
        {
            year ++;
            population = population + (population/1000)*born - (population/1000)*death;
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек.");
        }while (year < 10);
        System.out.println("Example 4");
        int bankSavings = 15000;
        int newMonth = 0;
        do{
            newMonth ++;
            bankSavings = bankSavings + (bankSavings/100)*7;
            System.out.println("Месяц " + newMonth + ", сумма накоплений равна: " + bankSavings + " рублей.");
        }while(bankSavings < 12000000);
        System.out.println("Example 5");
        int bankSavingsSecond = 15000;
        int newMonthSecond = 0;
        do{
            newMonthSecond ++;
            bankSavingsSecond = bankSavingsSecond + (bankSavingsSecond/100)*7;
            if (newMonthSecond % 6 == 0) {
                System.out.println("Месяц " + newMonthSecond + ", сумма накоплений равна: " + bankSavingsSecond + " рублей.");
            }
        }while(bankSavingsSecond < 12000000);
        System.out.println("Example 6");
        int bankSavingsVasily = 15000;
        int yearVasily = 0;
        int monthVasily = 0;
        do {
            monthVasily++;
            bankSavingsVasily = bankSavingsVasily + (bankSavingsVasily / 100) * 7;
            if (monthVasily % 6 == 0) {
                System.out.println("Месяц " + monthVasily + ", сумма накоплений равна: " + bankSavingsVasily + " рублей.");
            }
            if (monthVasily % 12 == 0){
                yearVasily++;
            }
        }while (yearVasily < 9);
        System.out.println("Example 7");
        int day = 1;
        int firstFriday = 5;
        day = firstFriday;
        while (day <= 31){
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчёт.");
            day = day + 7;
        }
        System.out.println("Example 8");
        int yearComet = 0;
        int thisYear = 2024;
        int timelapse = 79;
        int min = thisYear - 200;
        int max = thisYear + 100;
        do {
            yearComet = yearComet + timelapse;
            if (yearComet > min && yearComet < max){
                System.out.println(yearComet);
            }
        }while (yearComet < max);
    }
}
