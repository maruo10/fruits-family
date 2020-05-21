package family;
import fruit.Apple;
import fruit.Banana;
import fruit.Fruit;

public abstract class Human{
    private String name;
    
    Human(String name){
        this.name = name;
    }
    public abstract boolean isHungry();
    public abstract int isHappyPercent();
    public abstract void eat(String f, Fruit d);

    public String hungry_voice(){
        return "hungry.";
    }

    public String not_hungry_voice(){
        return "not hungry";
    }

    public String getName(){
        return this.name;
    }
}