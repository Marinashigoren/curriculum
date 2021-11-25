package Study;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0; i<3; i++) {
			for(int space=0; space<=i+1; space++) {
				System.out.print("");
				for(int hoshi=0; hoshi<i; hoshi++);{
					System.out.print("★");
				}
			}
			System.out.println();
		}
	}

}
