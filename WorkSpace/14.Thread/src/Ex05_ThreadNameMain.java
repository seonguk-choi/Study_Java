
public class Ex05_ThreadNameMain {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();//현재 메인에 있는 이름 갖고 옴
		System.out.println("현재 스레드의 이름 : " + mainThread.getName());
		
		Ex05_ThreadNameA mainThreadA = new Ex05_ThreadNameA();
		Ex05_ThreadNameB mainThreadB = new Ex05_ThreadNameB();
		Thread c = new Ex05_ThreadNameB();
		System.out.println(c.getName());
		mainThreadA.name();
		//c.name(); Thread는 정보가 깍여나간다. 
		Thread[] threadArr = new Thread[10];
		for (int i = 0; i < threadArr.length; i++) {
			threadArr[i] = new Ex05_ThreadNameB();
			System.out.println(threadArr[i].getName());
		}
		
		System.out.println("A 스레드의 이름 : " + mainThreadA.getName());
		mainThreadA.run();
		System.out.println("B 스레드의 이름 : " + mainThreadB.getName());
		mainThreadB.run();
	}
}
