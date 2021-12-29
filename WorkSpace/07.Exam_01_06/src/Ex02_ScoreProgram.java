import java.util.Scanner;

public class Ex02_ScoreProgram {
	public static void main(String[] args) {
		//1. 학생수 입력
		//2. 점수입력
		//3. 점수리스트
		//4. 분석(평균)
		//5. 종료
		//1.학생수 입력시 (1차원배열)
		//학생 배열이 생성되고 학생의 이름을 연속해서 입력한다.(배열의 크기만큼)
		//2.점수입력(2차원배열)
		//학생 a(국어 영어 수학) 점수를 연속으로 입력한다.
		//3. 점수 리스트
		//학생 a : 국어점수, 영어점수, 수학점수
		//4.학생 a 평균
		Scanner sc = new Scanner(System.in);
		/*System.out.println("학생 수를 입력하세요.");
		
		while(true) {
			int st = Integer.parseInt(sc.nextLine());
			if(st < 0) {
				System.out.println("다시입력해주세요.");
			}else {
				break;
			}
		}
		int st = Integer.parseInt(sc.nextLine());
		String[] strArray = new String[st];
		System.out.println("학생 이름을 입력하세요.");
		int i =1;
		while(st >= i) {
			strArray[i] = sc.nextLine();
			i++;
		}*/
		int[][] score = null;//참조타입은 null로 초기화
		String[] student = null;
		String[] subject = {"국어", "영어", "수학"};
		while(true) {
			System.out.println("1.학생수 입력 2.점수 입력 3.점수리스트 4.분석 5.종료");
			try {
				int menu = Integer.parseInt(sc.nextLine());
				if(menu == 1) {
					//학생의 수를 입력받고 학생의 이릅까지 입력
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
