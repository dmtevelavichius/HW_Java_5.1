public class Main {
    public static void main(String[] args) {
        BmiService indexService = new BmiService();
        double growth = 170;
        int weight = 75;
        double result=indexService.calculate(growth,weight);

        System.out.println(result);

    }
}

