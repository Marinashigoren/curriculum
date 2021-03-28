package study;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * 本課題では、基本的な日付操作クラスの使い方を学びましょう。
 *
 * 問①から問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 * ※この課題に関しては課題実施日によって結果が異なるため、出力結果が個々で異なります。
 */
public class Study {

    public static void main(String args[]) {

        // Dateクラスのインスタンスを生成
        Date now = new Date();

        // 問① ローカル変数「now」を使用し、本日の日付を表示してください。
        System.out.println(now);

        // Calendarクラスのインスタンスを生成
        Calendar calendar = Calendar.getInstance();

        // 問② 「(Calendar.MONTH) + 数値」の処理は、想定していない値となる可能性があります。
        // その理由をコメントへ記述してください。
        // [「月の値+1」で扱っているため、「13月、14月、15月」という表示になってしまうから。]
        // [加算減算をしたい場合は右記のメソッドを使用する。→cal.add(年月日, 調整したい値（マイナス値も可）)]
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));
        // 問③ 上記の「calendar」を使用し、本日から1年2ヶ月15日先の日付を表示しなさい。
        // - この課題に関しては課題実施日によって結果が異なりますので、Wiki課題の画像とは結果が異なります。
        // - また、うるう年の場合は設定内容が正しくとも日付がズレて表示される可能性があります。
        calendar.add(Calendar.YEAR, 1);
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        System.out.println(sdf.format(date));
        calendar.add(Calendar.MONTH, 2);
        Date date2 = calendar.getTime();
        //SimpleDateFormat sdf2 = new SimpleDateFormat("mm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
        System.out.println(sdf2.format(date2));
        calendar.add(Calendar.DATE, 15);
        Date date3 = calendar.getTime();
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
        System.out.println(sdf3.format(date3));


        // うるう年判定
        printLeapYear(calendar.get(Calendar.YEAR));
    }

    /**
     * うるう年判定
     * 問③で日付がズレる可能性があるため補足として出力
     * @param year
     */
    private static void printLeapYear(final int year) {
        System.out.println(year + "年は、うるう年" + (Year.isLeap(year) ? "です。" : "ではありません。"));
    }
}