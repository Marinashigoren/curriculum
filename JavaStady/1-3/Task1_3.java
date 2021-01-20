/**
 * Task1-3 : 課題内容
 *
 * 本課題では、演算子の使い方を学んでいきましょう。
 * 問①から問⑦まであります。
 * 指定された数値、式、変数名を守って記述してください。
 *
 * 問③,⑤については、コメントを入れてください。
 * 問⑦については、変数名を使って出力してください。
 *
 */
public class Task1_3 {

    public static void main(String[] args) {
        int puls = 5 + 10;
        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。

        int minus = 20 - 7;
        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。

        // ③下記の処理について、何をしているのかコメントを記入してください。
        // [10 と 2 を掛けた値を、変数「multiply」へ代入]
        int multiply = 10 * 2;
        
        int remi = 20 % 6;
        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。

        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // [Stringクラスのtown変数に、文字列「有楽町」を代入
        //  Stringクラスのline変数に、文字列「線」を代入]
        String town = "有楽町";
        String line = "線";

        String train = town + line;
        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。

        System.out.println(puls);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(remi);
        System.out.println(train);
        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。

    }
}