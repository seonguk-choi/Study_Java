import java.awt.Toolkit;

public class Ex03_ThreadInterface {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} //1000 1초
					System.out.println("동작함1");
				}	
			}
		});//<- Thread를 Interface를 넘겨서 생성함(파라메터)
		thread.start();
	}//main
}//class
