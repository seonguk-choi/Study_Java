package package5;

import package4.Test1;

public class TestMain {
	public static void main(String[] args) {
		//문제)Test1에 있는 data1 , data3을 
		//pacage5 testMain에서 사용할수있도록 한다.
		//사용하는 방법은 자유롭게 작성하면 되는데 !
		//단 , field에 지금 정의되어있는 접근제한자는 절대
		//손대지 않는다.
		Test1 t1 = new Test1();
		t1.setData1(10); 
		t1.data2 = "test";
		t1.setData3(20);
		System.out.println(t1.getData1() + t1.data2);
		
	}
}
