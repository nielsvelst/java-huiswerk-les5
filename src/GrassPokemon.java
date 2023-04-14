import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private final String type = "grass";
    private List<String> attacks = Arrays.asList("leaveblade","leechseed", "solarbeam", "leafstorm");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
}
