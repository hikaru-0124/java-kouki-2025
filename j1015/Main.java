package j1015;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(); //勇者誕生！！！！！！
        hero.name = "やきうどん"; //勇者を命名する
        hero.hp = 50; //勇者のHPを設定してあげよう
        hero.sleep();

        Matango matango = new Matango();
        matango.hp = 50;
        System.out.println("マタンゴのHPは、" + matango.hp);
    }
}
