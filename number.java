import java.util.Random;
import java.util.Scanner;

public class number {
  public static void main(String[] args) {
  System.out.println("数当てゲーム");

  int ans = new Random().nextInt(9);

    for(int i = 0; i < 5; i++){


    System.out.println("0~9の数字を入力してください");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();

    s.close();

    if (ans == num ){
      System.out.println("good! よく出来ました！");
      break;
    }
    else{
      System.out.println("No!");
    }
  }
  System.out.println("ゲームを終了します!");
  }
}
