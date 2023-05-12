
package Baekjoon;

import java.util.Scanner;

class BOJ1340 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String monthS = in.next();
    String dayS = in.next();
    String yearS = in.next();
    String timeS = in.next();
    int[] monarr = {31,28,31,30,31,30,31,31,30,31,30,31};
    int month = 0;
    int day = 0;
    int year = 0;
    int hour = 0;
    int minute = 0;

    switch (monthS) {
      case "January":
        month = 1;
        break;
      case "February":
        month = 2;
        break;
      case "March":
        month = 3;
        break;
      case "April":
        month = 4;
        break;
      case "May":
        month = 5;
        break;
      case "June":
        month = 6;
        break;
      case "July":
        month = 7;
        break;
      case "August":
        month = 8;
        break;
      case "September":
        month = 9;
        break;
      case "October":
        month = 10;
        break;
      case "November":
        month = 11;
        break;
      case "December":
        month = 12;
        break;
    }

    day = Integer.parseInt(dayS.substring(0, dayS.length()-1));
    year = Integer.parseInt(yearS);
    hour = Integer.parseInt(timeS.substring(0, 2));
    minute = Integer.parseInt(timeS.substring(3));

    long sum = 0;
    sum += minute;
    sum += hour*60;
    sum += (day-1)*60*24;
    int sumMonth=0;
    for(int i=0;i<month-1;i++){
      sumMonth += monarr[i];
    }
    int yearAmount = 365;

    if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
      yearAmount++;
      if(3<=month){
        sumMonth++;
      }
    }
    sum += sumMonth*60*24;
    year = yearAmount * 24 * 60;

    double res = sum*100/(double)year;
    System.out.print(res);
  }
}
/*



 */
