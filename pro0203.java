import java.util.Random;

public class pro0203 {
  public static void main(String[] args) {
    System.out.println("ようこそ占いへ");
    int fortune = new Random().nextInt(5)+1;
    switch (fortune){
      case 1:
      case 2:
        System.out.println("good!");
      case 3:
        System.out.println("nice");
      case 4:
      case 5:
      System.out.println("no good");
    }
  }
}
