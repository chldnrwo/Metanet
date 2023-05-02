package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BOJ1296 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    int num = in.nextInt();
    int L=0,O=0,V=0,E=0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'L'){
        L++;
      }else  if(s.charAt(i) == 'O'){
        O++;
      }else if(s.charAt(i) == 'V'){
        V++;
      }else if(s.charAt(i) == 'E'){
        E++;
      }
    }
    //System.out.println(L+" "+O+" "+V+" "+E);
    Pair[] pairs = new Pair[num];

    for(int k = 0; k < num; k++) {
      String s2 = in.next();
      int L2=0,O2=0,V2=0,E2=0;
      for(int i = 0; i < s2.length(); i++) {
        if(s2.charAt(i) == 'L'){
          L2++;
        }else  if(s2.charAt(i) == 'O'){
          O2++;
        }else if(s2.charAt(i) == 'V'){
          V2++;
        }else if(s2.charAt(i) == 'E'){
          E2++;
        }
      }
      //System.out.println(L2+" "+O2+" "+V2+" "+E2);
      int a = d(L+L2,O+O2,V+V2, E+E2);
      //System.out.println(a);
      pairs[k] = new Pair(s2, a);
    }
    Arrays.sort(pairs);
    System.out.println(pairs[0].name);



  }
  static class Pair implements Comparable<Pair>{
    String name;
    int mod;

    public Pair(String name, int mod) {
      this.name = name;
      this.mod = mod;
    }

    @Override
    public int compareTo(Pair p) {
      if(this.mod == p.mod){
        return this.name.compareTo(p.name);
      }
      return p.mod - this.mod;
    }
  }
  public static int d(int L, int O, int V, int E){
    int a = ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;
    return a;
  }
}
/*



 */
