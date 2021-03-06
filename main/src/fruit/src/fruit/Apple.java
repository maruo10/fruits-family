package main.src.fruit.src.fruit;
import main.src.scfruit.src.scfruit.Scfruit;
public class Apple implements Fruit{

    private String color;
    private int amount;
    private int taste;
    private String bland;

    public Apple(String color, int amount, int taste, String bland){
        Scfruit.check();
        this.color = color;
        this.amount = amount;
        this.taste = taste;
        this.bland = bland;
    }

    public String getColor(){
        return this.color;
    }

    public int getAmount(){
        return this.amount;
    }

    public int getTaste(){
        return this.taste;
    }

    public String getBland(){
        return this.bland;
    }
}