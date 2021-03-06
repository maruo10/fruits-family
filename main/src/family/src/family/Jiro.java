package main.src.family.src.family;
import main.src.fruit.src.fruit.Apple;
import main.src.fruit.src.fruit.Banana;
import main.src.fruit.src.fruit.Fruit;

public class Jiro extends Human implements Eatlave{
    private int fullness;
    private int lack;
    public Jiro(int fullness, int lack){
        this.fullness = fullness;
        this.lack = lack;
    }

    // 次郎が空腹かどうかを返す
    public boolean isHungry() {
        // 次郎のデータは配列になってて、１つ目が満腹度。満腹度８０％を超えると空腹感はなくなる子。
        return this.fullness < (2000*0.8);
    }

    // 次郎の幸福度を返す
    public int isHappyPercent() {
        // 次郎のデータは配列になってて、２つめが幸福度。
        return this.lack;
    }

    // 次郎が食べる処理
    public void eat(String fruit, Fruit fruitData) {
        // りんご
        if (fruit.equals("apple")) {
            String color = fruitData.getColor();
            int amount = fruitData.getAmount();
            int taste = fruitData.getTaste();
            // Appleクラスにしかないブランド情報を取得
            Apple apple = (Apple)fruitData;
            String bland = apple.getBland();

            // 効果
            int kouka = 1;
            if (color.equals("red")) {
                kouka = 2;
            }
            if (bland.equals("ourin")) {
                kouka *= 2;
            }

            // 量 * 味 を満腹度に加算する
            this.fullness += amount * taste;

            // 幸福度データを更新する。次郎は味・色・ブランドによって幸福度が上がる
            this.lack += taste * kouka;

        // バナナ
        } else {
            String color = fruitData.getColor();
            int amount = fruitData.getAmount();
            int taste = fruitData.getTaste();
            // 白色のバナナは２倍の効果
            int kouka = 1;
            if (color.equals("white")) {
                kouka = 2;
            }

            // 量 * 味 を満腹度に加算する
            this.fullness += amount * taste * kouka;

            // 幸福度データを更新する。次郎はバナナの時は量によって幸福度が上がる
            this.lack += amount;
        }
    }

    public String getName(){
        return "二郎";
    }

    public void lackup(){
        System.out.println("二郎は人が食べているのをみて幸せに鳴っている");
        this.lack += 1;
    }

    @Override

    public String hungry_voice(){
        return "腹減った";
    }

    public String not_hungry_voice(){
        return "腹いっぱい";
    }
}