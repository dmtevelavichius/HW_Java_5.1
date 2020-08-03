public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int variable = 20;
        int price = 10_000;
        long miles = service.calculate(price) / variable;
        System.out.println(miles);
    }
}
