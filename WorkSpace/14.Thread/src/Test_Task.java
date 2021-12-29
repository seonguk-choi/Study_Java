import java.awt.Toolkit;

public class Test_Task implements Runnable{
	int mill = 0;
	String msg;
	
	
	public Test_Task(int mill, String msg) {
		super();
		this.mill = mill;
		this.msg = msg;
	}

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 4; i++) {
			toolkit.beep();
			try {
				Thread.sleep(mill);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg);
		}
	}
}
