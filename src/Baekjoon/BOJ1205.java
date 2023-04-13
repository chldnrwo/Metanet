package Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BOJ1205 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<Pair> list = new ArrayList<>();

    int N = in.nextInt();
    int score = in.nextInt();
    int P = in.nextInt();

    for (int i = 0; i < N; i++) {
      list.add(new Pair(in.nextInt(),0));
    }
    list.sort((p1,p2)->p2.getScore()-p1.getScore());

    if(list.size() == 0) {
      System.out.println(1);
      return;
    }else if(list.get(list.size()-1).getScore()>=score && list.size()>=P){
      System.out.println(-1);
      return;
    }
    list.add(new Pair(score,0));

    list.sort((p1,p2)->p2.getScore()-p1.getScore());
    for(int i=0;i<list.size();i++){
      list.get(i).setRank(i+1);
    }
    for(int i=1;i<list.size();i++){
      if(list.get(i-1).getScore() == list.get(i).getScore()){
        int a = list.get(i-1).getRank();
        list.get(i).setRank(a);
      }
    }

    for(Pair p : list){
      if(p.getScore()==score){
        System.out.println(p.getRank());
        break;
      }
    }
  }
}
class Pair{
  private int score;
  private int rank;

  public Pair(int score, int rank) {
    this.score = score;
    this.rank = rank;
  }
  public int getScore() {
    return score;
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
/*
공동등수 허가


 */
