package app.brack.chapter1.Q4;

/**
 * 問題は、明示的にパッケージ宣言したクラスから無名パッケージに属するクラスに
 * アクセスしようとするとコンパイルエラーとなる
 *
 * またstaticフィールドのため以下の参照もコンパイルエラー
 */
public class Q4SampleImpl extends Q4Sample {
  public static void main(String[] args) {
    // System.out.println(num);
  }
}