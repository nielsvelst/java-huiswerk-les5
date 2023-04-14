import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{

    List<String> attacks = Arrays.asList("inferno", "pyroball", "flamethrower", "firelash");
    private  String type = "fire";
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }



    public List<String> getAttacks() {
        return attacks;
    }

    void inferno(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println("do damage");
    };
}
