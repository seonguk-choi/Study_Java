import java.awt.Toolkit;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		Runnable threada = new ThreadB();
		Thread thread = new Thread(threada);
		thread.start();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 4; i++) {
			Thread.sleep(1000);
			System.out.println("동영상을 재생합니다.");
		}
	}
}
