package main.src.print;

public class Printer{

    // 名前出力の時はStringで受け取る
    public static void print(String name){
        System.out.print(name + " : ");
    }

    // 幸福度の時はintで受け取る
    public static void print(int lack){
        System.out.print(lack + "%\n");
    }

    // 各自の結果を表示する時はbool、string、stringで受け取る
    public static void print(boolean hungry, String voice, String not_voice){
        System.out.println(hungry ? voice : not_voice);
    }
}