package heroes.willpower;

public class Breton extends Willpower {
    private static final String HERO_TYPE = "BRETON";

    public Breton(String name, int magicka, int fatigue, int health) {
        super(name, magicka, fatigue, health, HERO_TYPE);
    }
}
