
public class Jiro{
    // 次郎が空腹かどうかを返す
    static boolean isHungry(int[] data) {
        // 次郎のデータは配列になってて、１つ目が満腹度。満腹度８０％を超えると空腹感はなくなる子。
        return data[0] < (2000*0.8);
    }

    // 次郎の幸福度を返す
    static int isHappyPercent(int[] data) {
        // 次郎のデータは配列になってて、２つめが幸福度。
        return data[1];
    }

    // 次郎が食べる処理
    static void eat(int[] personData, String fruit, String[] fruitData) {
        // りんご
        if (fruit.equals("apple")) {
            String color = Fruit.getAppleColor(fruitData);
            int amount = Fruit.getAppleAmount(fruitData);
            int taste = Fruit.getAppleTaste(fruitData);
            String bland = Fruit.getAppleBland(fruitData);

            // 効果
            int kouka = 1;
            if (color.equals("red")) {
                kouka = 2;
            }
            if (bland.equals("ourin")) {
                kouka *= 2;
            }

            // 量 * 味 を満腹度に加算する
            personData[0] += amount * taste;

            // 幸福度データを更新する。次郎は味・色・ブランドによって幸福度が上がる
            personData[1] += taste * kouka;

        // バナナ
        } else {
            String color = Fruit.getBananaColor(fruitData);
            int amount = Fruit.getBananaAmount(fruitData);
            int taste = Fruit.getBananaTaste(fruitData);
            // 白色のバナナは２倍の効果
            int kouka = 1;
            if (color.equals("white")) {
                kouka = 2;
            }

            // 量 * 味 を満腹度に加算する
            personData[0] += amount * taste * kouka;

            // 幸福度データを更新する。次郎はバナナの時は量によって幸福度が上がる
            personData[1] += amount;
        }
    }
}