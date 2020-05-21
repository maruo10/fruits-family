package family;
import fruit.Apple;
import fruit.Banana;
import fruit.Fruit;

public class Ichiro extends Human{
    private int fullness;
    private int lack;
    public Ichiro(String name, int fullness, int lack){
        super(name);
        this.fullness = fullness;
        this.lack = lack;
    }

    public boolean isHungry() {
        // 一郎のデータは配列になってて、１つ目が満腹度。満腹度１００％にならないと空腹感はなくならない子。
        return this.fullness < (2000*1.0);
    }
      // 一郎の幸福度を返す
    public int isHappyPercent() {
        // 一郎のデータは配列になってて、２つめが幸福度。
        return this.lack;
    }
    public void eat(String fruit, Fruit fruitData) {
        // 一郎はりんごを食べない
        if (fruit.equals("apple")) {
            return;
        }
        String color = fruitData.getColor();
        int amount = fruitData.getAmount();
        int taste = fruitData.getTaste();
        int manpuku = this.fullness;

        // 白色のバナナは２倍の効果
        int kouka = 1;
        if (color.equals("white")) {
            kouka = 2;
        }

        // 量 * 味　を満腹度に加算する
        manpuku += amount * taste * kouka;

        // 満腹度データを更新
        this.fullness = manpuku;

        // 幸福度データを更新する。一郎は量によって幸福度が上がる
        this.lack = this.lack + amount;
    }

    @Override

    public String hungry_voice(){
        return "お腹すいた";
    }
}