import java.util.Arrays;
import java.util.List;

public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;
    private String type;





    public Pokemon(String name, int level, int hp, String food, String sound){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }


    public String getType() {
        return type;
    }

    public void setHp(int hp) {
        this.hp = hp;
    };

    public void setType(String type){
        this.type = type;
    }
}
