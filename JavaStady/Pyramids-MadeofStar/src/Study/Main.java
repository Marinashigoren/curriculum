package Study;

public class Main {

	public static void main(String[] args) {
		for(int i=0, line=9;  i<line; i++) {
			for(int space=line-1; i<space; space--) {
				System.out.print("　");
			}
				for(int hoshi=0; hoshi<(i+1)*2-1; hoshi++){
					System.out.print("★");
				}
			System.out.println();
		}
	}

}
