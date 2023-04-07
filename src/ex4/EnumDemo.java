package ex4;

public class EnumDemo {
  public static void main(String[] args) {
    final int NORTH = 0;
    final int SOUTH = 1;
    final int EAST = 2;
    final int WEST = 3;
    final int UP = 0;
    final int DOWN = 1;

//    if(UpnDown.UP == Direction.NORTH){
//
//    }
    System.out.println(Direction.EAST);
    System.out.println(Direction.SOUTH);
    System.out.println(Direction.WEST);
    System.out.println(Direction.NORTH);

    Direction dir = Direction.EAST;
    if(dir  == Direction.EAST) {
      System.out.println("동쪽입니다.");
    }else if(dir.compareTo(Direction.WEST)==0){
      System.out.println("서쪽입니다.");
    }
  }
}
