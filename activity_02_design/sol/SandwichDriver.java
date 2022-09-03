public class SandwichDriver {

    public static void main(String[] args) {
        Sandwich s1 = new Sandwich("Big Mac", 450, 5.5);
        System.out.println(s1);
        System.out.println("Is healthy? " + s1.isHealthy());
    }
}
