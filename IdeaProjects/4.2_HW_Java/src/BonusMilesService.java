public class BmiService {
    public double calculate(double growth, int weight) {
        double variable=10000;
        double doubleGrowth = (growth * growth)/ variable;
        double index = weight / doubleGrowth;

        return index;

    }
}
