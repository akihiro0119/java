import java.util.Scanner;

public class score {
  public static void main(String[] args){
    int[] score = {1,2,3,4,5,6,7,8,9};
    
    System.out.println("1桁の数字を入力して下さい");

    Scanner s = new Scanner(System.in);
    int input = s.nextInt();

    s.close();

    for(int n : score){

      if(n == input){
        System.out.println("あたり！");
        break;
      }
      else{
        System.out.println("No!");
      }
    }
  }
}
