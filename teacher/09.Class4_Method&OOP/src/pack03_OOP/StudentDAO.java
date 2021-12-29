package pack03_OOP;

public class StudentDAO {
	void display(StudentDTO[] dto , int[] scores) {
		for(int i=0; i<dto.length; i++ ) {
			System.out.print(dto[i].getName() + "  ");
			dto[i].setScores(scores);
			for (int j = 0; j < dto[i].getSubject().length; j++) {
				System.out.print(dto[i].getSubject()[j]);
				System.out.print(":"+dto[i].getScores()[j]+" ");
			}
			System.out.println(dto[i].getGrade());
			System.out.println();
		
		}
	}
	void displaySum(StudentDTO[] dto , int[] scores) {
		for(int i=0; i<dto.length; i++ ) {
			System.out.print(dto[i].getName() + "  ");
			dto[i].setScores(scores);
			for (int j = 0; j < dto[i].getSubject().length; j++) {
				System.out.print(dto[i].getSubject()[j]);
				System.out.print(":"+dto[i].getScores()[j]+" ");
			}
			System.out.print(" 합계 :" + getSum(dto[i]));
			System.out.println();
		
		}
	}
	
	void displayAvg(StudentDTO[] dto , int[] scores) {
		for(int i=0; i<dto.length; i++ ) {
			System.out.print(dto[i].getName() + "  ");
			dto[i].setScores(scores);
			for (int j = 0; j < dto[i].getSubject().length; j++) {
				System.out.print(dto[i].getSubject()[j]);
				System.out.print(":"+dto[i].getScores()[j]+" ");
			}
			System.out.print(" 평균 :" + getSum(dto[i])/dto[i].getSubject().length);
			System.out.println();
		
		}
	}
	int getSum(StudentDTO dto) {
		int sum = 0 ;
		for (int i = 0; i < dto.getScores().length; i++) {
			sum += dto.getScores()[i];
		}
		return sum ;
	}

	StudentDTO[] addStudent(StudentDTO[] dto) {
		//기존. 3건 
		//3건 + 1건
		StudentDTO[] tempDtos = new StudentDTO[dto.length+1];
		//[dto1] [dto2] [dto3] 
		//+1 []
		//[null] [null] [null] [null] 
		
		for (int i = 0; i < dto.length; i++) {
			tempDtos[i] = dto[i];
		}
		tempDtos[tempDtos.length-1] = new StudentDTO("추가 된 학생", dto[0].getSubject());
		int[] scores = { 30 , 40 , 50 };
		tempDtos[tempDtos.length-1].setScores(scores);
		//[dto1] [dto2] [dto3] [null] 
		
		return tempDtos;
	}

	void setGrade(StudentDTO[] dto) {
		for (int i = 0; i < dto.length; i++) {
			if(getSum(dto[i]) == 60) {
				dto[i].setGrade("A");
			}else{
				dto[i].setGrade("F");
			}
		}

	}
}
