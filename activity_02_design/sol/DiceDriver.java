public class DiceDriver {

    public static void main(String[] args) {
        Dice d = new Dice(8);
        System.out.println(d);
        for (int i = 0; i < 10; i++) {
            d.rollv2();
            System.out.println(d.getValue());
        }
    }
}
