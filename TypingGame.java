
import java.util.Scanner;
import java.util.InputMismatchException;

//タイピングゲームを実行するクラス
class TypingGame extends Gamestart {
    Gamestart gm = new Gamestart();
    Wordlist wl = new Wordlist();
    Scanner stdIn = new Scanner(System.in);
    Timer time = new Timer();

    //タイピングゲームを実行するtypinggameメソッド
    public void typinggame(){
        
        //ModeSekectメソッドを実行して難易度を設定
        gm.ModeSelect();
        
        //timerメソッドを実行してゲーム開始のカウントダウン
        time.timer();
        
        //タイピングゲームを実行する処理
        int score = 0;
        for(int i = 0; i<gm.level; i++){
          //お題となるランダムな短歌を出力して表示
          wl.setWord();
          System.out.println(" 「" + wl.getWordR() + "」 ");
          
          //テキストを入力＊＊＊ターミナルで実行するとここで入力した文字型が文字化けします
          String input = stdIn.next();
          System.out.println(input);//デバッグ用print
          
          //入力結果の成否に応じて点数が変動
          if(input.equals(wl.getWordR())){
            score += 10;
          }
          else {
            score -= 5;
          }
        }
        
        //結果と選択肢を表示
        System.out.println("あなたのスコアは" + score + "点でした。\nもう一度プレイしますか？");
        System.out.print("1 = プレイする or 2 = プレイしない :");
        
        //Restartメソッドを実行
        Restart();
    }
    
    //typingGameメソッドを再試行または終了するRestartメソッド
    private void Restart(){
      try{
        //選択肢として変数reを入力
        int re = stdIn.nextInt();
        
        //1が入力された場合はtypinggameメソッドを再試行
        if(re == 1){
          typinggame();
        }
        
        //2が入力された場合はゲームを終了
        else if(re == 2){
        System.out.println("お疲れさまでした。");
        }
        
        //1または2以外の整数が入力された場合の処理
        else{
          System.out.println("正しい値を入力してください！");
          Restart();
        }
       
        //整数以外が入力された場合の例外処理
      }catch(InputMismatchException e){
        System.out.println("正しい値を入力してください！");
        Restart();
      }
    }
}          