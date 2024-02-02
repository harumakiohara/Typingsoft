
import java.util.Scanner;
import java.util.InputMismatchException;

//タイピングゲームを実行するクラス
class TypingGame extends Gamestart {
    
    Gamestart gm = new Gamestart();
    Wordlist wl = new Wordlist();
    Scanner stdIn = new Scanner(System.in);

    public void typinggame(){
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
        System.out.print("YES or NO :");
        try{
          String re = stdIn.next();
          if(re == "YES"){
            typinggame();
          }
          else{
            System.out.println("お疲れさまでした");
          }
        }catch(InputMismatchException e){
          System.out.println("お疲れさまでした");
        }
    }
}          