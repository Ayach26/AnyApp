package app.Scanner;
import java.util.Scanner;

/**
 * N個のデータの入力(カンマ区切り)
 */
public class ScannerSplitComma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] str = sc.nextLine().split(",");
    for (int i = 0; i < str.length; i++) {
        System.out.println(str[i]);
    }
  }
}
