
public class Test_Thread {
	public static void main(String[] args) {
//		Runnable run3 = new Test_Task(1000,"동영상을 봅니1313다.");
//		Thread thread22 = new Thread(run3);
//		thread22.start();
//		Runnable run4 = new Test_Task(500,"aaaa.");
//		Thread thread33 = new Thread(run4);
//		thread33.start();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 4; i++) {
					System.out.println("파일을 다운로드합니다.");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		thread1.start();
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 4; i++) {
					System.out.println("파일을 다운로드합니다.");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		thread2.start();
	}
}
