
public class Ex05_ThreadNameMain {
	public static void main(String[] args) {
		Thread mainthread = Thread.currentThread();
		System.out.println("현재 스레드의 이름 : " + mainthread.getName());
		
		Ex05_ThreadNameA a = new Ex05_ThreadNameA();
		Ex05_ThreadNameB b = new Ex05_ThreadNameB();
		Thread c = new Ex05_ThreadNameA();
		Thread[] threadArr = new Thread[10]; 
		for (int i = 0; i < threadArr.length; i++) {
			threadArr[i] = new Ex05_ThreadNameB();
			System.out.println(threadArr[i].getName());
		}
		System.out.println(c.getName());
		//Ex05_ThreadNameB c = new Ex05_ThreadNameB();
		System.out.println(a.getName());
		System.out.println(b.getName());
	//	System.out.println(c.getName());
		a.start();
		b.start();
		//Ex05_ThreadNameA와 B를 인스턴스화 시키고.
		//두 쓰레드의 이름을 각각 출력하시고.
		//작업도 시작!
	
	}
}
