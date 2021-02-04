public class email {
  public static void main(String[] args) {
    String title = "今度遊びに行きませんか？";
    String address = "eclipse01@gamil.com";
    String text = "お久しぶりですね。今度遊びに行きませんか？良い返事を期待していきます";
     new email(title,address,text);
  }

  private email(String title, String address, String text) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名:" + title);
    System.out.println("本文" + text);
  }
}
