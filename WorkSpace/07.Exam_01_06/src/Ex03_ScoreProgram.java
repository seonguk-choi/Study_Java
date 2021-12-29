import java.util.Scanner;

public class Ex03_ScoreProgram {
	public static void main(String[] args) {
		//분석기능추가
		//1. 모든 학생들의 총점, 과목별 점수, 평균점수를 전체 보여주고
		//2. 1등이 누구인지 출력
		//3. 꼴등이 누구인지 출력
		//4. 반평균이 몇점인지 출력
		Scanner sc = new Scanner(System.in);
		int[][] score = null;//참조타입은 null로 초기화
		String[] student = null;
		String[] subject = {"국어", "영어", "수학"};
		while(true) {
			System.out.println("1.학생수 입력 2.점수 입력 3.점수리스트 4.분석(평균) 5.모든학생의 총점 6.과목별점수 7.과목별 평균점수 8.반평균점수 9.1등  10.2등 11.종료");
			try {
				int menu = Integer.parseInt(sc.nextLine());
				if(menu == 1) {
					//학생의 수를 입력받고 학생의 이름까지 입력
					//2차원 배열을 입력받은 학생의 수로 초기화
					System.out.println("학생의 수를 입력해주세요.");
					int std_cnt = Integer.parseInt(sc.nextLine());
					student = new String[std_cnt]; //1차배열이 생성됨
					for(int i = 0 ; i<student.length ; i++) {
						System.out.println((i+1) + " 번째 학생의 이름을 입력해주세요.");
						student[i] = sc.nextLine();
					}
					score = new int[std_cnt][subject.length];//과목 국, 영, 수
				} else if(menu == 2) {
					if(student == null) {
						System.out.println("먼저 학생의 정보를 입력해주세요. 메뉴1");
						continue;
					}
					for(int i = 0 ; i<score.length ; i++) {
						for(int j = 0 ; j<score[i].length ; j++) {
							System.out.println(student[i] + " 학생의 " + subject[j] + "점수를 입력하세요.");
							score[i][j] = Integer.parseInt(sc.nextLine());
						}
					}
				} else if(menu == 3) {
					if(student == null) {
						System.out.println("먼저 학생의 정보를 입력해주세요. 메뉴1");
						continue;
					}
					int i = Integer.parseInt(sc.nextLine());
						for(int j = 0 ; j<score.length ; j++) {
							System.out.println(student[i] + " 학생의 " + subject[j] + "점수는 " + score[i][j] + " 입니다.");
						}
				} else if(menu == 4) {
					if(student == null) {
						System.out.println("먼저 학생의 정보를 입력해주세요. 메뉴1");
						continue;
					}	
						int sum = 0;
						int h = Integer.parseInt(sc.nextLine());
						for(int i = 0 ; i<score.length ; i++) {
						sum += score[h][i];	
					}
						System.out.println(student[h] + " 학생의 국영수 평균점수는 " + (sum/subject.length) +" 입니다.");
				} else if(menu == 5) {
					if(student == null) {
						System.out.println("먼저 학생의 정보를 입력해주세요. 메뉴1");
						continue;
					}
					int sumAll = 0;
					 for(int i = 0 ; i<score.length ; i++) {
						 int sum = 0;
						 for(int j = 0 ; j < score[i].length ; j++) {
							 sum += score[i][j];
						 } sumAll += sum;
					 }System.out.println("모든 학생의 총점은 : " + sumAll + " 입니다.");	
				} else if(menu == 6) {
					if(student == null) {
						System.out.println("먼저 학생의 정보를 입력해주세요. 메뉴1");
						continue;
					}//6.과목별점수
					 for(int j = 0 ; j<subject.length ; j++) {
						 int sum = 0;
						 for(int i = 0 ; i < score.length ; i++) {
						 sum += score[i][j];
						 }System.out.println(subject[j] + "의 총점은 : " + sum + " 입니다.");	
					}
					
				} else if(menu == 7) {
					if(student == null) {
						System.out.println("먼저 학생의 정보를 입력해주세요. 메뉴1");
						continue;
					} 
					 for(int j = 0 ; j<subject.length ; j++) {
						 int sum = 0;
						 for(int i = 0 ; i < score.length ; i++) {
						 sum += score[i][j];
						 }System.out.println(subject[j] + "의 평균점수는 : " + sum/subject.length + " 입니다.");	
					}
				} else if(menu == 8) {
					if(student == null) {
						System.out.println("먼저 학생의 정보를 입력해주세요. 메뉴1");
						continue;
					} for(int j = 0 ; j<subject.length ; j++) {
						 int sum = 0;
						 for(int i = 0 ; i < score.length ; i++) {
						 sum += score[i][j];
						 int[] lank = new
						 }System.out.println(subject[j] + "의 평균점수는 : " + sum/subject.length/score.length + " 입니다.");	
					}
					for(int h = 0 ; h <arr.length ; h++) {
						 for(int l = h+1 ; l <arr.length ; l++) {
							 if(arr[h] > arr[l]) {
								 int temp = arr[h];
								 arr[h] = arr[l];
								 arr[l] = temp;
							 }
						 }System.out.println(arr[h]);
					 }
				} else if(menu == 9) { //1등 //꼴등
					if(student == null) {
						System.out.println("먼저 학생의 정보를 입력해주세요. 메뉴1");
						continue;
					}
					
					 for(int i = 0 ; i<score.length ; i++) {
						 int sum = 0;
						 for(int j = 0 ; j < score[i].length ; j++) {
							 sum += score[i][j]; 
						 }System.out.println(student[i] + " 학생의 국영수 평균점수는 " + (sum/subject.length) +" 입니다.");
						 for(int h = 0 ; h <arr.length ; h++) {
						
						 }
					 }
					
				} else if(menu == 10) {
					if(student == null) {
						System.out.println("먼저 학생의 정보를 입력해주세요. 메뉴1");
						continue;
					} else {
						System.out.println("종료합니다.");
						break;
					}
				} 
			}catch (Exception e) {
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}
