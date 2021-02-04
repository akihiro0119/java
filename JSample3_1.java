public class JSample3_1 {
  public static void main(String args[]){
    num(0);
    num(1);
    num(2);
  }

  private static void num(int no){
    int n[] = {18,29,36};

    try{
      System.out.println(n[no]);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("配列の範囲を超えています");
      return;
    }
    finally{
      System.out.println("要素の出力を終了します");
    }
  }
}
