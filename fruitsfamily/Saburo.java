
public class Saburo{
    // 三郎が空腹かどうかを返す
    static boolean isHungry(int[] data) {
        // 三郎のデータは配列になってて、１つ目がりんごの量、２つ目がりんごの味、３つ目がバナナの量、４つ目がバナナの味
        return (data[0]*data[1]+data[2]*data[3]) < (2000*0.95);
    }
    // 三郎の幸福度を返す
    static int isHappyPercent(int[] data) {
        // 三郎のデータは配列になってて、１つ目がりんごの量、２つ目がりんごの味、３つ目がバナナの量、４つ目がバナナの味
        // 三郎の幸福度は味重視
        return (data[1] * 2 + data[3] * 3);
    }

    // 三郎が食べる処理
    static void eat(int[] personData, String fruit, String[] fruitData) {
        // りんご
        if (fruit.equals("apple")) {
            personData[0] += Fruit.getAppleAmount(fruitData); // 量
            personData[1] += Fruit.getAppleTaste(fruitData);  // 味
        // バナナ
        } else {
            personData[2] += Fruit.getBananaAmount(fruitData);  // 量
            personData[3] += Fruit.getBananaTaste(fruitData);   // 味
        }
    }
}