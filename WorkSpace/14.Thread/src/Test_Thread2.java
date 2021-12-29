
public class Test_Thread2 {
	public static void main(String[] args) {
		Runnable run1 = new Test_Task(1000, "동영상을 봅니다.");
		Thread threadA = new Thread(run1);
		threadA.start();
	    Runnable run2 = new Test_Task(500, "파일을 다운로드합니다.");
	    Thread threadB = new Thread(run2);
	    threadB.start();
	}
}
