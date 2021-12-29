package pack03_OOP;

import java.util.Arrays;

public class FruitMain {
	public static void main(String[] args) {
//		String name = "사과";
//		int price = 1000;
//		int cnt = 3;
//		String org = "한국";
//		FruitDTO dto = new FruitDTO(name, price, cnt, org);
		//100건의 데이터를 객체로 각각 담는다고 하면, dto1~100
		//데이터 출력 시에도 dto1~100
		FruitDTO dto1 = new FruitDTO("사과1", 1000, 3, "한국");
//		FruitDTO dto2 = new FruitDTO("사과2", 1000, 3, "한국");
//		FruitDTO dto3 = new FruitDTO("사과3", 1000, 3, "한국");
//		System.out.println(dto1.name + dto1.getName());
//		System.out.println(dto2.name + dto2.getName());
//		System.out.println(dto3.name + dto3.getName());==↓
		FruitDTO[] dtos = new FruitDTO[3];
		dtos[0] = new FruitDTO("사과1", 1000, 3, "한국");
		dtos[1] = new FruitDTO("사과2", 1100, 3, "한국");
		dtos[1] = new FruitDTO("오렌지", 1100, 3, "한국");
		dtos[1] = new FruitDTO("수박", 1100, 3, "한국");
		dtos[2] = new FruitDTO("사과3", 900, 3, "한국");
		System.out.println(Arrays.toString(dtos));
		FruitDAO dao = new FruitDAO();
		dao.display(dtos);
		dao.displayMax(dtos);
		
		
	}
}
