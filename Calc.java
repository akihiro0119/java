import java.util.Scanner;
public class Calc {

public static void main(String[] args){
  Scanner s = new Scanner(System.in);

  System.out.println("数字を入力してください");

    int a = s.nextInt();
  
    System.out.println("数字を入力してください");

    int b = s.nextInt();

    s.close();

    int total = CalcLogic.plus(a,b);
    int delta = CalcLogic.minus(a,b);
    int call = CalcLogic.call(a,b);

    System.out.println("足したら" + total + "引いたら" + delta + "かけたら" + call);
  }
}
