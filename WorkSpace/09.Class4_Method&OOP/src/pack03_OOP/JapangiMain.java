package pack03_OOP;

import java.util.Scanner;

public class JapangiMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JapangiDTO[] dto = new JapangiDTO[3];
		int cash = -1;
		dto[0] = new JapangiDTO("콜라", 800, 8);
		dto[1] = new JapangiDTO("사이다", 1000, 5);
		dto[2] = new JapangiDTO("환타", 900, 1);
		
		JapangiDAO dao = new JapangiDAO();
		while(true) {
			System.out.println("1.돈넣기 2.음료뽑기 3.거스름돈 4.관리자 5.종료");
			int num = Integer.parseInt(sc.nextLine());
			try {
				if(num == 1) {
					cash = dao.getIncome(cash);
				}
				else if(num == 2 && cash >= 0) {
					cash = dao.getBuy(dto, cash);
				}
				else if(num == 3 && cash >= 0) {
					dao.getCharge(cash);
				}
				else if(num == 4) {
					if(dao.getMaster(dto)) {
						System.out.println("1.음료추가 2.음료수정 3.음료삭제 4. 로그아웃");
						try {
							num = Integer.parseInt(sc.nextLine());
							if(num == 1) {
								dto = dao.addProduct(dto);
							}
							else if(num == 2) {
								dto = dao.correctProduct(dto);
							}
							else if(num == 3) {
								dto = dao.deleteProduct(dto);
							}
							else if(num == 4 ) {
								System.out.println("로그아웃합니다.");
								continue;
							}else {
								System.out.println("다시입력해주세요.");
							}
							
						} catch (Exception e) {
							System.out.println("숫자를 입력하세요.");
						}
					}else {
						System.out.println("로그인에 실패하였습니다.");
						continue;
					}
				}
				else if(num == 5) {
					System.out.println("종료합니다.");
					break;
				}
				else {
					System.out.println("다시입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
			}
			
		}
	}
}
