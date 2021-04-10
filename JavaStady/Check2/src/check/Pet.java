package check;

public class Pet {

    private String name;
    private String masterName;

    public Pet(String name, String masterName) {
    //コンストラクタを使うには引数に値を入れる
    //Java吉とhogeが渡される
        this.name = name;
        this.masterName = masterName;
    }

    protected String getName() {
    //nameを持って来るメソッド
        return name;
    }

    protected String getMasterName() {
        return masterName;
    }

    public void introduce() {
    //introduceが表示メソッド
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
    //robopetのコンストラクタ
        super(name, masterName);
        //親クラスのname,masterNameに入れる
    }

    public void introduce() {
        System.out.println("◇私はロボット。名前は" + getName() + "。");
                                                      //getNameメソッドから持ってきている
        System.out.println("◇ご主人様は" + getMasterName() + "。");
                                            //getMasterNameメソッドから持ってきている
    }
}