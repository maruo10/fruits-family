package main.src.family.src.family;
import main.src.fruit.src.fruit.Apple;
import main.src.fruit.src.fruit.Banana;
import main.src.fruit.src.fruit.Fruit;

public class Saburo extends Human{
    private int apple_value;
    private int apple_taste;
    private int banana_value;
    private int banana_taste;
    public Saburo(int apple_value, int apple_taste, int banana_value, int banana_taste){
        this.apple_value = apple_value;
        this.apple_taste = apple_taste;
        this.banana_value = banana_value;
        this.banana_taste = banana_taste;
    }

    // 三郎が空腹かどうかを返す
    public boolean isHungry() {
        // 三郎のデータは配列になってて、１つ目がりんごの量、２つ目がりんごの味、３つ目がバナナの量、４つ目がバナナの味
        return (this.apple_value * this.apple_taste + this.banana_value * this.banana_taste) < (2000*0.95);
    }
    // 三郎の幸福度を返す
    public int isHappyPercent() {
        // 三郎のデータは配列になってて、１つ目がりんごの量、２つ目がりんごの味、３つ目がバナナの量、４つ目がバナナの味
        // 三郎の幸福度は味重視
        return (this.apple_taste * 2 + this.banana_taste * 3);
    }

    // 三郎が食べる処理
    public void eat(String fruit, Fruit fruitData) {
        // りんご
        if (fruit.equals("apple")) {
            this.apple_value += fruitData.getAmount(); // 量
            this.apple_taste += fruitData.getTaste();  // 味
        // バナナ
        } else {
            this.banana_value += fruitData.getAmount();  // 量
            this.banana_taste += fruitData.getTaste();   // 味
        }
    }

    public String getName(){
        return "三郎";
    }

    @Override

    public String not_hungry_voice(){
        return "腹いっぱい";
    }
}