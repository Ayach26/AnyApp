package app.brack.chapter9.Q12;

import java.util.ArrayList;

public class Q12Main {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    for (String str : list) {
      if ("B".equals(str)) {
        list.remove(str);
      } else {
        System.out.println(str);
      }
    }
  }
}