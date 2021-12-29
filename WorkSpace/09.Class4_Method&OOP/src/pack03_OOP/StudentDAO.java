package pack03_OOP;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentDAO {
	void display(StudentDTO[] dtos) {
		for (int i = 0; i < dtos.length ; i++) {
			System.out.print(dtos[i].getName()+"\t");
			System.out.println(dtos[i].getNum(i));
			for (int j = 0; j < dtos[i].subject.length ; j++) {
				System.out.print(dtos[i].getSubject(j) +"\t");
				System.out.println(dtos[i].getScore(j));
			}
			
		}
	}
	void displaySum(StudentDTO[] dtos) {
		for (int i = 0; i < dtos.length ; i++) {
			int sum = 0;
			for (int j = 0; j < dtos[i].subject.length ; j++) {
				sum +=dtos[i].getScore(j);
			}
			System.out.println(dtos[i].getName()+sum);
			
		}
	}
	void displayAvg(StudentDTO[] dtos) {
		for (int i = 0; i < dtos.length ; i++) {
			int sum = 0;
			int avg = 0;
			for (int j = 0; j < dtos[i].subject.length ; j++) {
				sum +=dtos[i].getScore(j);
				avg = sum/dtos[i].subject.length;
			}
			System.out.println(dtos[i].getName()+avg);
			
		}
	}
	void displayGrade(StudentDTO[] dtos) {
		for (int i = 0; i < dtos.length ; i++) {
			int sum = 0;
			int avg = 0;
			for (int j = 0; j < dtos[i].subject.length ; j++) {
				sum +=dtos[i].getScore(j);
				avg = sum/dtos[i].subject.length;
			}
			if(avg >= 90) {
				System.out.println(dtos[i].getName()+"A");
			} else if (avg >= 80) {
				System.out.println(dtos[i].getName()+"B");
			} else if (avg >= 70) {
				System.out.println(dtos[i].getName()+"C");
			} else if (avg >= 60) {
				System.out.println(dtos[i].getName()+"D");
			}else {
				System.out.println(dtos[i].getName()+"F");
			}
			
		}
	}
	void displayNewstd(StudentDTO[] dtos) {
		Scanner sc = new Scanner(System.in);
		int std_cnt = Integer.parseInt(sc.nextLine());
		StudentDTO[] dtosNew = new StudentDTO[std_cnt];
		Random r = new Random();
		String[] subject = {"Java", "CSS", "javaScript"};
		int[]score = new int[subject.length];
		for (int i = 0; i < std_cnt ; i++) {
			System.out.println("학생이름을 입력하세요.");
			dtosNew[i] = new StudentDTO("name", subject, score, i+1);		
			String name = sc.nextLine();
			dtosNew[i].getName(name);
			System.out.print(dtosNew[i].getName(name)+"\t");
			System.out.println(dtosNew[i].getNum(i)+dtos.length);
				for (int j = 0; j < dtosNew[i].subject.length ; j++) {
					score[j] = r.nextInt(100)+1;
					System.out.print(dtosNew[i].getSubject(j) +"\t");
					System.out.println(dtosNew[i].getScore(j));
				}
		}
	}
	StudentDTO[] displayAddstd(StudentDTO dtos) {
		StudentDTO[] tempDtos = new StudentDTO(name, subject, score, num);
		for (int i = 0; i < tempDtos.length; i++) {
			
		}
		return null;
	}
}
