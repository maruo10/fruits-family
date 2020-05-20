
public class Fruit{
    // バナナの色を返す関数
    static String getBananaColor(String[] data) {
        return data[0];
    }

    // バナナの量を返す関数
    static int getBananaAmount(String[] data) {
        return Integer.parseInt(data[1]) * Integer.parseInt(data[3]);
    }

    // バナナのうまみ具合を返す関数
    static int getBananaTaste(String[] data) {
        return Integer.parseInt(data[2]);
    }

    // りんごの色を返す関数
    static String getAppleColor(String[] data) {
        return data[0];
    }

    // りんごの量を返す関数
    static int getAppleAmount(String[] data) {
        return Integer.parseInt(data[1]);
    }

    // りんごのうまみ具合を返す関数
    static int getAppleTaste(String[] data) {
        return Integer.parseInt(data[2]);
    }

    // りんごのブランドを返す関数
    static String getAppleBland(String[] data) {
        return data[3];
    }
}