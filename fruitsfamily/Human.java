public abstract class Human{
    private String name;
    
    Human(String name){
        this.name = name;
    }
    abstract boolean isHungry();
    abstract int isHappyPercent();
    abstract void eat(String f, Fruit d);

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