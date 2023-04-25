package A;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for (int i = 0;i<n;i++){
     int total = in.nextInt();
     int[] nums = new int[total];
     for(int j=0;j<total;j++){
       nums[j] = in.nextInt();
     }
     int a = findMajorityElement(nums);
      System.out.println(a);
    }
  }
  public static int findMajorityElement(int[] nums)
  {
    // `m`은 다수 요소를 저장합니다(있는 경우).
    int m = -1;
    // 카운터 `i`를 0으로 초기화
    int i = 0;
    // 어레이의 각 요소 `nums[j]`에 대해 수행
    for (int j = 0; j < nums.length; j++) {
      // 카운터 `i`가 0이 되면
      if (i == 0) {
        // 현재 후보를 `nums[j]`로 설정
        m = nums[j];
        // 카운터를 1로 재설정
        i = 1;
      }
      // 그렇지 않으면 `nums[j]`가 현재 후보이면 카운터를 증가시킵니다.
      else if (m == nums[j]) {
        i++;
      }
      // 그렇지 않으면 `nums[j]`가 현재 후보이면 카운터를 줄입니다.
      else {
        i--;
      }
      System.out.println(m);
    }
    return m;
  }
}
/*
int로 커버는 됨


 */
