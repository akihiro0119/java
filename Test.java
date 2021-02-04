import java.util.Scanner;
import java.util.Random;

public class Test {
  public static void main(String[] args) {
    System.out.println("ようこそ占いへ");
    System.out.println("あなたの名前を入力してください。");

    Scanner s = new Scanner(System.in);

    String name = s.nextLine();

    System.out.println("あなたの年齢を教えてください。");

    int age = s.nextInt();

    s.close();

    int fortune = new Random().nextInt(100);
    fortune++;
    System.out.println("占い結果が出ました。");
    System.out.println(age + "歳の" + name + "さん、あなたの運勢は" + fortune + "点です");
  }
}
