package pack01_interface;
//Interface의 상속은 implements 라는 키워드를 통해서 한다.
//Interface를 상속받게 되면 강제로 Interface 멤버에 있는 메소드들을
//강제한다.
public class TestMain implements TestInterface{
	public static void main(String[] args) {
		TestMain tm = new TestMain();
		tm.test1();
		tm.test2();
		tm.test3();
		System.out.println("서버연결로직 " + SEVERIP);
		
		/*TestInterface ti = new TestInterface() {
			
			@Override
			public void test2() {
				System.out.println("test2");
			}
			
			@Override
			public void test1() {
				// TODO Auto-generated method stub
				
			}
		};
		ti.test2();*/
	}

	@Override
	public void test1() {
		//DAO.test1();
	}

	@Override
	public void test2() {
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}
}
