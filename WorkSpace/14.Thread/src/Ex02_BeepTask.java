import java.awt.Toolkit;

//Runnable (<- Interface)
public class Ex02_BeepTask implements Runnable {

	@Override
	public void run() {
		//실제 작업이 이루어지는 부분
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("동작함");
		}
	}
}
