import java.awt.Toolkit;

//Thread라는 클래스 자체를 부모클래스로 두고
//기능을 사용하게 하는 방법
public class Ex04_ExtendsThread extends Thread{
	@Override //재정의
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("동작함");
		}	
		test();
	}
	public void test() {
		System.out.println("test");
	}
}
