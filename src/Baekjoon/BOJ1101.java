package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

class BOJ1101 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();

    int[][] arr = new int[50][50]; //입력 받은 최소 수들 담는 역할
    int[] cnt = new int[50]; // 카드가 1장 이상인 경우 담기는 집합 배열
    boolean[] visit = new boolean[50]; //
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j] = in.nextInt();
        if(arr[i][j]>=1)cnt[i]++;
      }
    }
    //여기까진 값 넣는 거

    int ans = n;
    //한번에 1개 이상 옮길 수 있기에 조커박스로 다 몰아 넣는 경우를 생각하면
    //최대는 n일 수 밖에 없다.
    for(int i=0;i<n;i++){
      int rev = 0; //rev로 세는 거 시작
      Arrays.fill(visit, true);
      //자바의 경우 boolean 디폴트가 false이므로 굳이 초기화 안해도 된다.
      for(int j=0;j<n;j++){
        if(i==j) continue; //조커 박스 기존 행은 무시
        if(cnt[j] > 1) rev++;
          // 2가지 종류 이상의 카드가 각각 1장이상씩 존재하는 경우
          // 무조건 조커박스 이동해야됨
        else if(cnt[j] == 1) {
          for(int k=0;k<m;k++){
            if(arr[j][k]!=0){
              if(visit[k]){
                visit[k] = false;
              }else{
                rev++;
              }
              break;
            }
          }
        }
      }
      //System.out.println(i+" "+rev);
      ans = Math.min(ans, rev);
    }
    System.out.println(ans);
  }
}
// 1장 이상씩 뺄 수 있다
// 좀 고쳐야 됨
// 주석 하나씩 달기