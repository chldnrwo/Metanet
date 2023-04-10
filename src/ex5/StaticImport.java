package ex5;

import java.util.Calendar;

import static java.util.Arrays.sort;
public class StaticImport {
  public static void main(String[] args) {
    int[] arr = {3, 4, 1, 5, 2, 6};
    char[] cArr = {'a', 'b', 'c', 'd', 'e',};
    sort(arr);
    sort(cArr);

    System.out.println(Calendar.JANUARY);
    Calendar.getInstance();
  }
}
