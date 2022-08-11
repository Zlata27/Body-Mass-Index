public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 80;
        int growth = 190;
        int bmi = service.calculate(weight, growth);

        System.out.println(bmi);
    }
}
