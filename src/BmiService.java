public class BmiService {
    public double calculate(int bodyMass, float height){
        double bmi = bodyMass / Math.pow(height, 2);
        return bmi;
    }

}
