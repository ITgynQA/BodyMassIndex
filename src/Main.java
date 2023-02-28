public class Main {

    public static void main(String[] args) {

        BmiService servise = new BmiService();
        double bmi = servise.calculate(1.87, 98 );
        System.out.println(bmi);

    }
}
