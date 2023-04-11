package ex6.Chapter10.sec1;

public class Rectangle extends Number implements Comparable<Integer> {
  private int width, height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }
  public int getWidth() {
    return width;
  }
  public int getHeight() {
    return height;
  }
  public int getArea() {
    return width * height;
  }
  @Override
  public String toString() {
    return String.format("Rectangle[width=%d, height=%d]", width, height);
  }
  @Override
  public int compareTo(Integer o) {
    return Integer.compare(width, o.width);
  }
}
