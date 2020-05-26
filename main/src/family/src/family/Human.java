package main.src.family.src.family;
import main.src.fruit.src.fruit.Apple;
import main.src.fruit.src.fruit.Banana;
import main.src.fruit.src.fruit.Fruit;

public abstract class Human{

    public abstract boolean isHungry();
    public abstract int isHappyPercent();
    public abstract void eat(String f, Fruit d);
    public abstract String getName();

    public String hungry_voice(){
        return "hungry.";
    }

    public String not_hungry_voice(){
        return "not hungry";
    }
}