import java.util.Scanner;

//メインクラス

import java.util.InputMismatchException;

public class Jikkou {
    public static void main(String[] args) {
        TypingGame tg = new TypingGame();
        Timer time = new Timer();
        Scanner stdIn = new Scanner(System.in);

        tg.ModeSelect();
        time.timer();
        int num = 0;
        while (num <= 1) {
            tg.typinggame();
            try{
                 String re = stdIn.nextLine();
                 if(re == "YES"){
                   num = 0;
                 }
                 else{
                 System.out.println("お疲れさまでした");
                 num += 1;
                }
               }catch(InputMismatchException e){
               System.out.println("お疲れさまでした");
               num += 1;
               }
        }
    }
    
    
}
