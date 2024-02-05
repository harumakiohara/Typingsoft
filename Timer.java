
//ゲーム開始のカウントダウンのためのタイマークラス
public class Timer {
    //ゲーム開始の合図をするタイマーメソッド
    public void timer(){
        try{
         //カウントダウンのテキストを1秒区切りで表示
         System.out.println("     3     ");
         Thread.sleep(1000);
         System.out.println("     2     ");
         Thread.sleep(1000);
         System.out.println("     1     ");
         Thread.sleep(1000);
         System.out.println("   start   \n-----------------------------");
        }catch(InterruptedException e){
           e.printStackTrace();
        }
    }
}
