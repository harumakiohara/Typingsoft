//問題数を決めるクラス
public interface QuestionNumber {
    //難易度となる変数nomal,hard,veryhard,
    public int nomal = 10;
    public int hard = 20;
    public int veryhard = 30; 

    //難易度を指定するModeSelectメソッド
    void ModeSelect();
} 
