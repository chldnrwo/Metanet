package Programmers;

class Pro1 {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {

    int cd = euc(denom1, denom2);

    int a = denom2 / cd;
    int b = denom1 / cd;

    int d = a*numer1 + b*numer2;
    int e = denom1 * denom2 / cd;

    int f = euc(d, e);
    d /=f;
    e /=f;

    int[] answer = {d,e};
    return answer;
  }
  public static int euc(int a, int b){
    int r = a%b;
    if(r==0){
      return b;
    }
    return euc(b,r);
  }

  public static void main(String[] args) {
    int numer1;
    int denom1;
    int numer2;
    int denom2;

  }
}

//유클리드