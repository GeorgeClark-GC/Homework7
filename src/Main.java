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
    }
}