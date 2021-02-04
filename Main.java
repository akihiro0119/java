import java.util.Scanner;

class Main {
  public static void main(String[] ages){
    System.out.println("あなたの名前を入力してください。");
    
    Scanner s = new Scanner(System.in);
    String name = s.nextLine(); 


    System.out.println("あなたの年齢を教えてください。");
    int age = s.nextInt();

    s.close();

    System.out.println("ようこそ、" + age + "歳の"+ name + "さん");

  }
}
