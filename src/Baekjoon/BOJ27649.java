package Baekjoon;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class Main {
//  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    List<String> list = new ArrayList<>();
//
//    String s = in.nextLine();
//
//    String[] lines = s.split(" ");
//
//    for(int i =0;i<lines.length;i++){
//      String s1 = lines[i].replaceAll("\\s", "");
//      lines[i] = s1;
//    }
//    String res = "";
//    for(int i =0;i<lines.length;i++){
//      if(!lines[i].equals("")){
//        String s2 = change(lines[i]);
//        res += s2+" ";
//      }
//    }
//    res = res.replace("  ", " ");
//    System.out.println(res);
//
//    //System.out.println(Arrays.toString(lines));
//  }
//  public static String change(String s){
//    String s1 = "";
//    for(int i=0; i<s.length(); i++){
//      String sp = s.substring(i,i+1);
//      if(sp.equals(">") || sp.equals("<") ||
//          sp.equals("(") || sp.equals(")")){
//       //앞뒤로 체크
//        s1 = s1 + " " + sp + " ";
//      }else {
//        s1 = s1 + sp;
//      }
//    }
//    s1 = s1.replace("&&"," && ");
//    s1 = s1.replace("||"," || ");
//
//    if(s1.substring(0,1).equals(" ")){
//      s1 = s1.substring(1);
//    }
//    if(s1.substring(s1.length()-1,s1.length()).equals(" ")){
//      s1 = s1.substring(0, s1.length()-1);
//    }
//    return s1;
//  }
//}
///*
//grep skku   <infile> outfile
//단어중에 앞뒤로 공백이면 제거
//(exit $?  )||expr $? + $?
//( exit $? ) || expr $? + $?
//grep Wall <Makefile|| echo NotSetCflagsWall>outfile
//grep Wall < Makefile || echo NotSetCflagsWall > outfile
// */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BOJ27649 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<String> list = new ArrayList<>();

    String s = in.nextLine();

    String[] lines = s.split(" ");

    for (int i = 0; i < lines.length; i++) {
      lines[i] = lines[i].trim();
    }

    StringBuilder res = new StringBuilder();
    for (String line : lines) {
      if (!line.equals("")) {
        String s2 = change(line);
        res.append(s2).append(" ");
      }
    }
    res = new StringBuilder(res.toString().replace("  ", " "));
    System.out.println(res.toString().trim());
  }

  public static String change(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      String sp = s.substring(i, i + 1);
      if (sp.equals(">") || sp.equals("<") || sp.equals("(") || sp.equals(")")) {
        sb.append(" ").append(sp).append(" ");
      } else {
        sb.append(sp);
      }
    }
    sb = new StringBuilder(sb.toString().replace("&&", " && "));
    sb = new StringBuilder(sb.toString().replace("||", " || "));

    if (sb.charAt(0) == ' ') {
      sb.deleteCharAt(0);
    }
    if (sb.charAt(sb.length() - 1) == ' ') {
      sb.deleteCharAt(sb.length() - 1);
    }
    return sb.toString();
  }
}

