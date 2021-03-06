import java.awt.Toolkit;

public class Test_Thread1 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 4; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("동영상을 봅니다.");
				}
			}
		});
		thread1.start();
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 4; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("파일을 다운받습니다.");
				}
			}
		});
		thread2.start();
	}
}
