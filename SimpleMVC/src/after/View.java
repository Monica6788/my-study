package after;

import java.util.Scanner;

public class View {
	private Controller c;
	// 선언만 한 후에 생성자에서 할당해주는 것이 좋다~
	Scanner sc = new Scanner(System.in);
	
	public View() {
		this.c = new Controller();
	}
	
	public void mainView() {		// 풀이에서는 display
		System.out.print("이름: ");
		String name = sc.nextLine();
		Model m = new Model(name);
		c.insertModel(m);
		System.out.println(c.getModelInfo());
		
	}
	

}
