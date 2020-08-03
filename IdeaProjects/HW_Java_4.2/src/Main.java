public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int growth = 170;
        int weight = 75;
        int variable = 10000;
        long doubleGrowth = (growth * growth)/ variable;
        long index = service.calculate(weight) / doubleGrowth;

        System.out.println(index);

    }
}
