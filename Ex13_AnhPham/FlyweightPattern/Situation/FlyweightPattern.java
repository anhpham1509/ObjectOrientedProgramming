package FlyweightPattern.Situation;

public class FlyweightPattern {
    private static final String types[] = {"Land", "Water", "Forest"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Unit unit = (Unit) ItemFactory.getRoad(getRandomLength());
            unit.setX(getRandomX());
            unit.setY(getRandomY());
            unit.setLength(5);
            unit.set();
        }
    }

    private static String getRandomLength() {
        return types[(int) (Math.random() * types.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
