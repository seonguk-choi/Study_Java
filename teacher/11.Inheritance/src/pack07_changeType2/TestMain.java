package pack07_changeType2;

public class TestMain {
	public static void main(String[] args) {
		Child ch = new Child();
		Parent pr = ch; //?
		pr.method1();
	}
}
