package pack03_OOP;

public class FruitDAO {
	void display(FruitDTO[] dtos) {
		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i].getName());
			System.out.println(dtos[i].getPrice());
			
		}
	}
	void displayMax(FruitDTO[] dtos) {
		int max = dtos[0].getPrice();
		for (int i = 0; i < dtos.length; i++) {
			if(max < dtos[i].getPrice()) {
				max = dtos[i].getPrice();
			}
		}
		for (int i = 0; i < dtos.length; i++) {
			if(max == dtos[i].getPrice()) {
				System.out.println(dtos[i].getName());
			}
		}
	}
}
