public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 59; // kg
        float height = 1.69F; // metre
        double bmi = service.calculate(bodyMass, height);

        System.out.println("Body Mass Index = " + bmi);
    }
}
