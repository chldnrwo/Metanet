package ex8.Chapter12.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneProgram {
  static Scanner in = new Scanner(System.in);
  static Map<String, Phone> map = new HashMap<String, Phone>();
  public static void main(String[] args) {

    while(true){
      System.out.print("명령어를 입력해주세요 : ");
      String line = in.nextLine();
      if(line.equals("등록")) {
        System.out.println("등록을 종료하고 싶으시면 성함에 END를 입력해주세요");
        entry();
      }else if(line.equals("삭제")){
        System.out.print("삭제하실 분의 성함을 알려주세요 : ");
        String id = in.nextLine();
        delete(id);
      }else if(line.equals("찾기")){
        System.out.print("찾으실 분의 성함을 알려주세요 : ");
        String id = in.nextLine();
        search(id);
      }else if(line.equals("전체보기")){
        showAll();
      }else if(line.equals("종료")){
        System.out.print("프로그램을 종료합니다");
        System.exit(0);
      }else{
        System.out.println("알맞은 명령어를 입력해주세요");
      }
    }



  }
  public static void entry(){
    while(true){
      System.out.print("등록 하실 분의 성함을 알려주세요 : ");
      String name = in.nextLine();
      if(name.equals("END")){
        break;
      }
      if(map.containsKey(name)){
        System.out.println("동일한 이름을 가진분이 존재합니다");
        continue;
      }
      System.out.print("등록 하실 분의 주소를 알려주세요 : ");
      String address = in.nextLine();
      System.out.print("등록 하실 분의 전화번호를 알려주세요 : ");
      String number = in.nextLine();

      Phone p = new Phone(name, address, number);
      map.put(name, p);

    }
  }
  public static void delete(String name){

    if(map.containsKey(name)){
      map.remove(name);
      System.out.println("삭제가 완료되었습니다");
    }else{
      System.out.println("등록되지 않은 사람입니다");
    }
  }
  public static void search(String n){
    Phone p = map.get(n);
    String name = p.getName();
    String address = p.getAddress();
    String number = p.getNumber();

    System.out.printf("이름 : %s, 주소 : %s, 전화번호 : %s \n", name, address,number);
  }
  public static void showAll(){
    for(Phone p : map.values()){
      String name = p.getName();
      String address = p.getAddress();
      String number = p.getNumber();

      System.out.printf("이름 : %s, 주소 : %s, 전화번호 : %s \n", name, address,number);
    }
  }
}
