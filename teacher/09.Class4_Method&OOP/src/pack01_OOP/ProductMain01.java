package pack01_OOP;

public class ProductMain01 {
	public static void main(String[] args) {
		//Product객체를 인스턴스화 해서 속성을 준다.
		//num : 1 name : 컴퓨터
		//num : 2 name : 노트북
		//num : 3 name : 프린터
		//출력 해보기.
		Product p1 = new Product();//인스턴스화 p1이라는 이름으로 Product<객체로만듬
		p1.num = 1;
		p1.name = "컴퓨터";
		Product p2 = new Product();//인스턴스화 p1이라는 이름으로 Product<객체로만듬
		p2.num = 2;
		p2.name = "노트북";
		Product p3 = new Product();//인스턴스화 p1이라는 이름으로 Product<객체로만듬
		p3.num = 3;
		p3.name = "프린터";
		p1.display();
		p2.display();
		p3.display();
		
	}
}
