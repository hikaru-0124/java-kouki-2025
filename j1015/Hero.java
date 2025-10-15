package j1015;

public class Hero {
    //属性:プロパティ:フィールド:メンバ変数
    String name; // 勇者の名前保存用
    int hp; // 勇者のHP保存用

    //操作:メンバメソッド
    public void attack(){
    }

    public void sleep(){
        //自分自身のhoフィールドを100にする(回復する)
        System.out.println(this.name + "は、眠って回復した！");
        System.out.print(this.name + "のHP："+ this.hp + " → ");
        this.hp = 100;
        System.out.println(this.hp);
        
        //~は眠って回復したと画面に表示
    }
    public void sit(int sec){

    }
    public void run(){

    }
}
