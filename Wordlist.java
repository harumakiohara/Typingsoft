
import java.util.Random;

//問題を格納したwordlistリストを持つクラス
public class Wordlist{
    //単語を格納するリストwordlist
    private String[] wordlist = {
        "春すぎて　夏来にけらし　白妙の　衣ほすてふ　天の香具山",
        "夏の夜は　まだ宵ながら　明けぬるを　雲のいづこに　月宿るらむ",
        "花の色は　うつりにけりな　いたづらに　わが身世にふる　ながめせしまに",
        "ひさかたの　光のどけき　春の日に　しづ心なく　花の散るらむ",
        "わが園に　梅の花散る　ひさかたの　天より雪の　流れ来るかも",
        "とをちには　夕立すらし　ひさかたの　天の香具山　雲隠れゆく",
        "千早ぶる　神代もきかず　龍田川　からくれなゐに　水くくるとは",
        "秋の夜も　名のみなりけり　逢ふといへば　事ぞともなく　明けぬるものを",
        "君待つと、我が恋ひをれば　我が宿の　簾動かし　秋の風吹く",
        "田子の浦に　うちいでてみれば　白妙の富士の高嶺に　雪は降りつつ",
        "かささぎの　渡せる橋に　おく霜の　白きを見れば　夜ぞ更けにける",
        "朝ぼらけ　有明の月と　見るまでに　吉野の里に　降れる白雪",
        "恋ひわび　しばしも寝ばや　夢のうちに　見ゆれば逢ひぬ　見ねば忘れぬ",
        "忘れじの　行く末までは　難ければ　今日を限りの　命ともがな",
        "しのぶれど　色に出でにけり　わが恋は　物や思ふと　人の問ふまで",
    };

    //お題となるランダムな整数を代入する変数word
    private String word;
    
    //wordlistの単語の中からランダムな単語を変数wordに代入するメソッド
    public void setWord(){
        //wordlistの長さを参照しランダムな番号を変数setに代入 
        int set = new Random().nextInt(getWordL());
        //変数setの番号の位置にある単語を変数wordに代入
        this.word = wordlist[set];
    }
    
    //変数wordを返すメソッド
    public String getWordR(){
        return word;
    }
    
    //wordlistの長さを返すメソッド
    public int getWordL(){
        return wordlist.length;
    }
}
