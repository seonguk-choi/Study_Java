import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aa = 5;
		int max = 0;
		int min = 0;
		int[][] score = null;
		int[] ave = null;
		String[] student = null;
		String[] subject = {"국어", "영어", "수학", "과학"};
		while(true) {
			System.out.println("1.학생수입력 2.점수입력 3.점수리스트 4.분석(평균) 5.종료");
			try {
				int menu = Integer.parseInt(sc.nextLine());
				if(menu == 1 ) {
					System.out.println("학생의 수를 입력하세요.");
					int std_cnt = Integer.parseInt(sc.nextLine());
					student = new String[std_cnt];
					for (int i = 0 ; i <student.length ; i++) {
						System.out.println((i+1) + " 번째 학생의 이름을 입력하세요.");
						student[i] = sc.nextLine();
					}
					score = new int[std_cnt][subject.length+1];
				}
				if(menu == 2) {
					if(student == null) {
						System.out.println("먼저 학생 정보를 입력하세요. 메뉴1");
						continue;
					}
					for(int i = 0 ; i<score.length ; i++) {
						System.out.println(student[i] + " 의 점수를 입력하세요.");
						for(int j = 0 ; j < score[i].length-1 ; j++) {
							System.out.println(subject[j] + " 의 점수를 넣어주세요.");
							score[i][j] = aa;
							score[i][score[i].length-1] += score[i][j];
						}
						aa++;
					}
				}
				if(menu == 3) {
					for(int i = 0 ; i < score.length; i++) {
						System.out.println(student[i] + " 의 점수");
						for (int j = 0 ; j < score[i].length-1; j++) {
							System.out.print(score[i][j] + " ");
						}
						System.out.println();
					}
				}
				if(menu == 4) {
					for(int i = 0 ; i < score.length; i++) {
						for(int j = 0 ; j<score[i].length-1; j++) {
							System.out.println(student[i] + " 의 " + subject[j] + "점수 : " + score[i][j]);
						}
						System.out.println(student[i] + " 평균 : " + score[i][score[i].length-1]/subject.length);
						System.out.println(student[i] + " 총점 : " + score[i][score[i].length - 1]);
					}
					for(int i = 0 ; i < score.length; i++) {
						ave[i] = score[i][score[i].length-1]/subject.length;
						for(int j = 0 ; j<score[i].length-1; j++) {
								if(ave[i] > ave[i+1]) {
									max = ave[i];
							} else if (ave[i] > ave[i+1])
									min = ave[i];
						}System.out.println("1등 " + student[i] + "학생 의 평균 : " + max);
						 System.out.println("꼴등 " + student[i] + "학생 의 평균 : " + min);
					}
				}		
			} catch (Exception e) {
				
			}
		}
	}
}
