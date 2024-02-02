
import java.util.Scanner;
import java.util.InputMismatchException;

//タイピングゲームを実行するクラス
class TypingGame extends Gamestart {
    
    Gamestart gm = new Gamestart();
    Wordlist wl = new Wordlist();
    Scanner stdIn = new Scanner(System.in);
    Timer time = new Timer();

    public void typinggame(){
        gm.ModeSelect();
        time.timer();
        int score = 0;
        for(int i = 0; i<gm.level; i++){
          wl.setWord();
          System.out.println(" 「" + wl.getWordR() + "」 ");
          
          String input = stdIn.nextLine();
          
          if(input == wl.getWordR()){
            score += 10;
          }
          else {
            score -= 5;
          }
        }

        System.out.println("あなたのスコアは" + score + "点でした。\nもう一度プレイしますか？");
        System.out.print("1 = プレイする or 2 = プレイしない :");
        
        Restart();
        
        
        
    }

    private void Restart(){
      try{
        int re = stdIn.nextInt();
        if(re == 1){
          typinggame();
        }
        else if(re == 2){
        System.out.println("お疲れさまでした");
        }
        else{
          System.out.println("正しい値を入力してください！");
          Restart();
        }
      }catch(InputMismatchException e){
        System.out.println("正しい値を入力してください！");
        Restart();
      }
    }
}          