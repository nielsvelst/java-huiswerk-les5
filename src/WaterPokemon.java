import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    private final String type = "water";
    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return type;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
}
