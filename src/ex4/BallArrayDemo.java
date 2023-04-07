package ex4;

import ex3.Ball;

import java.util.Objects;

public class BallArrayDemo {
  public static void main(String[] args) {
    Ball[] balls = new Ball[5];

    for (int i = 0; i < 2; i++) {
      balls[i] = new Ball(i+5);
    }

    for(Ball ball : balls) {
      if(ball != null){
        System.out.println(ball.getRadius());
      }
      if(Objects.nonNull(ball)){
        System.out.println(ball.getVolumn());
      }
    }
  }
}
