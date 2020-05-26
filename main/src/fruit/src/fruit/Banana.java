package main.src.fruit.src.fruit;
public class Banana implements Fruit{

    private String color;
    private int amount;
    private int taste;
    private int value;

    public Banana(String color, int amount, int taste, int value){
        this.color = color;
        this.amount = amount;
        this.taste = taste;
        this.value = value;
    }

    public String getColor(){
        return this.color;
    }

    public int getAmount(){
        return this.amount * this.value; 
    }

    public int getTaste(){
        return this.taste;
    }

    public int getValue(){
        return this.value;
    }
}