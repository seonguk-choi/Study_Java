package pack03_OOP;

public class BookDAO {
	//BookDTO(클래스타입)을 배열구조로 가진 dtos를 for문으로 전부 보여줌.
	 void displayBookList(BookDTO[] dtos) {
		//System.out.println("제목");
		for(int i = 0 ; i<dtos.length; i++) {//0~2
			System.out.println(dtos[i].getName()+dtos[i].getPrice());
		}
	}
	
	 void displayBookList(BookDTO[] dtos, String inputData) {
		//System.out.println("제목");
		int count = 0;
		for(int i = 0 ; i<dtos.length; i++) {//0~2
			if(dtos[i].getTitle().equals(inputData)) {
				count ++;
				System.out.println(dtos[i].getName()+dtos[i].getPrice());
			}
			
		}
		if(count == 0) {
			System.out.println("검색 결과 없음");
		}
	}
}
