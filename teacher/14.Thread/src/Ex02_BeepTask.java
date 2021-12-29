import java.awt.Toolkit;

//Runnable (<= interface )
public class Ex02_BeepTask implements Runnable {

	@Override
	public void run() {
		//실제 작업이 이루어 지는 부분
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//1000 1초. 
			System.out.println("동작함");
		}
	}

}
