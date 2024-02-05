
import java.util.Scanner;
import java.util.InputMismatchException;

//ゲーム開始時に難易度を設定するクラス
class Gamestart implements QuestionNumber{
    Scanner stdIn = new Scanner(System.in);
    public int mode;
    public int level;
    
    //難易度を指定するModeSelectメソッドをオーバーライド
    @Override public void ModeSelect(){
      //テキストを表示
      System.out.println("タイピングゲームを開始します。\nspaceはすべて全角です。");
      System.out.print("NOMAL = 1 / HARD = 2 / VERY HARD = 3\n難易度を選択してください:");
      //１～３の入力された整数に応じてlevelに難易度を代入
      try{   
         mode = stdIn.nextInt();
         if(mode == 1){
            //levelに難易度nomalを代入
            level = nomal;
         }
         else if(mode == 2){
            //levelに難易度hardを代入
            level = hard;
         }
         else if(mode == 3){
            //levelに難易度veryhardを代入
            level = veryhard;
         }
         //1~3以外の整数が入力された場合の処理
         else{
            System.out.println("1~3の整数で入力してください");
            ModeSelect();
         }
       //整数以外が入力された場合の例外処理
      }catch(InputMismatchException e){
         System.out.println("1~3の整数で入力してください");
         ModeSelect();
      }
    }
}