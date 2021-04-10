package check;

import constants.Constants;

public class Check{
	private static String firstName = "とば";
	private static String lastName = "まりな";
	//Mainメソッドでstaticがついている場合は、staticをつける

    private static String printName(String firstName,String lastName){
    //Mainメソッドにstaticが入っているので、staticが必要
    	return firstName + lastName;
    	//Maineメソッドに結果を返すため、returnが必要
  }

    public static void main(String[] args) {
    	//Check check = new Check();
    	System.out.println("printNameメソッド→" + printName(firstName,lastName));

    	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
    	//別パッケージの変数を呼び出すときは、クラス名.変数名を書く
    	//コンストラクタの引数を合わせる
    	pet.introduce();
    	//petが小文字なのはインスタンスのところを使っているから

	    RobotPet robo = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	    robo.introduce();

  }
}

