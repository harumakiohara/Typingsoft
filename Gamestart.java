
//ゲーム開始時の設定をするクラス
import java.util.Scanner;
import java.util.InputMismatchException;

class Gamestart implements QuestionNumber{
    Scanner stdIn = new Scanner(System.in);
    public int mode;
    protected int level;
    
    @Override public void ModeSelect(){
      System.out.println("タイピングゲームを開始します。\nspaceはすべて全角です。");
      System.out.print("NOMAL = 1 / HARD = 2 / VERY HARD = 3\n難易度を選択してください:");
      try{   
         mode = stdIn.nextInt();
         if(mode == 1){
            level = nomal;
         }
         else if(mode == 2){
            level = hard;
         }
         else if(mode == 3){
            level = veryhard;
         }
         else{
            System.out.println("1~3の整数で入力してください");
            ModeSelect();
         }
      }catch(InputMismatchException e){
         System.out.println("1~3の整数で入力してください");
         ModeSelect();
      }
    }
}