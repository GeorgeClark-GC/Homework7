public class Main {
    public static void main(String[] args) {
        System.out.println("Example 1");
        int savings = 0;
        int month = 0;
        while(savings < 2459000){
            month ++;
            savings = savings + 15000;
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
    }
}