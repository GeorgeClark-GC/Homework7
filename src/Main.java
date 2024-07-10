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
    }
}