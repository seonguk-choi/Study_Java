import java.awt.Toolkit;

public class ThreadA {
	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 4; i++) {
			Thread.sleep(1000);
			System.out.println("동영상을 재생합니다.");
		}
	}
}
