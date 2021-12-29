package pack07_ChangeType;

public class TestMain {
	public static void main(String[] args) {
		child ch = new child();
		//Parent pr = new Parent();
		Parent pr = ch;
		pr.metheod1();
		pr.metheod2();
	}
}
