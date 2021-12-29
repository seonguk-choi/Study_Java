package package4;

public class TestMain {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		/*t1.Data1 = 10;
		t1.data2 = "test";
		t1.data3 = 10;*/
		t1.setData1(10);
		t1.data2 = "testS";
		t1.setData3(10);
		System.out.println(t1.getData1() + t1.data2 + t1.getData3());
	}
}
