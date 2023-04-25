package Baekjoon;

import java.util.Scanner;

class BOJ1062 {
  static boolean[] alp;
  static int N,K;
  static int max = Integer.MIN_VALUE;
  static String[] words;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    K = in.nextInt();
    words = new String[N];
    for(int i=0; i<N; i++){
      String s = in.next();
      s = s.replace("anta","");
      s = s.replace("tica","");
      words[i] = s;
    }

    if(K<5){
      System.out.println(0);
      System.exit(0);
    }else if(K==26){
      System.out.println(N);
      System.exit(0);
    }

    alp = new boolean[26];
    alp['a'-97] = true;
    alp['n'-97] = true;
    alp['t'-97] = true;
    alp['i'-97] = true;
    alp['c'-97] = true;

    bt(0,0);
    System.out.println(max);
  }
  public static void bt(int a, int len){
    if(len == K - 5) {
      int count = 0;
      for(int i = 0; i < N; i++) {
        //뽑은 알파벳으로 몇개의 단어를 읽을 수 있는지 카운트.
        boolean read = true;

        for(int j = 0; j < words[i].length(); j++) {
          if(!alp[words[i].charAt(j) - 'a']) {
            read = false;
            break;
          }
        }
        if(read) count++;
      }
      max = Math.max(max, count);
      return;
    }

    for(int i = a; i < 26; i++) {
      if(alp[i] == false) {
        alp[i] = true;
        bt(i, len + 1);
        alp[i] = false;
      }
    }
  }

}
/*
시간 많이 짧음

N<=50
K<=26

남극에 사는 김지민 선생님은 학생들이 되도록이면 많은 단어를
읽을 수 있도록 하려고 한다. 그러나 지구온난화로 인해
얼음이 녹아서 곧 학교가 무너지기 때문에,
김지민은 K개의 글자를 가르칠 시간 밖에 없다.
김지민이 가르치고 난 후에는,
학생들은 그 K개의 글자로만 이루어진 단어만을 읽을 수 있다.
김지민은 어떤 K개의 글자를 가르쳐야 학생들이 읽을 수 있는
단어의 개수가 최대가 되는지 고민에 빠졌다.

남극언어의 모든 단어는 "anta"로 시작되고, "tica"로 끝난다.
남극언어에 단어는 N개 밖에 없다고 가정한다.
학생들이 읽을 수 있는 단어의 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N과 K가 주어진다.
N은 50보다 작거나 같은 자연수이고,
K는 26보다 작거나 같은 자연수 또는 0이다.
둘째 줄부터 N개의 줄에 남극 언어의 단어가 주어진다.
단어는 영어 소문자로만 이루어져 있고, 길이가 8보다 크거나 같고,
15보다 작거나 같다. 모든 단어는 중복되지 않는다.

출력
첫째 줄에 김지민이 K개의 글자를 가르칠 때,
학생들이 읽을 수 있는 단어 개수의 최댓값을 출력한다.

a,n,t,i,c 5자는 무조건 들어가야하고
가운데 단어중 최대한 많은 단어를 읽을 수 있게 가르쳐야한다

26^n가지 전부 탐색
최대 경우의 수는 26^7
 */
