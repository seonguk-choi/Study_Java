package pack03_OOP;

public class FruitDAO {
	void display(FruitDTO[] dtos) {
		for (int i = 0; i < dtos.length; i++) {
			System.out.println(dtos[i].getName());
			System.out.println(dtos[i].getPrice());
			System.out.println(dtos[i].getCnt());
			System.out.println(dtos[i].getOrg());
			
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
	void displaySort(FruitDTO[] dtos) {
		FruitDTO[] tempArr = new FruitDTO[1];
		for (int i = 0; i < dtos.length; i++) {
			for(int j = i+1 ; j < dtos.length ; j++) {
				if(dtos[i].getPrice() > dtos[j].getPrice() ) {
					tempArr[0] = dtos[i];
					dtos[i] = dtos[j];
					dtos[j] = tempArr[0];
				}
			}
		}
		for (int i = 0; i < dtos.length; i++) {
				System.out.println(dtos[i].getName());
		}
	}
}
