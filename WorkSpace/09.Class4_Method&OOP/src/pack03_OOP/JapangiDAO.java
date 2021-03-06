package pack03_OOP;

import java.util.Scanner;

public class JapangiDAO {
	Scanner sc = new Scanner(System.in);
	int price;
	int getIncome(int cash) {			
		System.out.println("돈을 넣어주세요.");
			while(true){
					try {
					cash = Integer.parseInt(sc.nextLine());
					if(cash % 10 != 0 || cash < 0) {
						System.out.println("다시 넣어주세요.");
					} else if(cash % 10 == 0 && cash > 0){
						System.out.println("금액 : " + cash);
						return cash;
					}
				} catch (Exception e) {
					System.out.println("숫자로 입력하세요.");
				}
			}
	}
	int getBuy(JapangiDTO[] dto, int cash) {
		System.out.println("음료를 고르세요.");
		int num = 1;
		for (int i = 0; i < dto.length; i++) {
			System.out.println((num+i) + "번 " + dto[i].getName() +" "+ dto[i].getPrice() +"원 "+ dto[i].getCnt()+"개");
		}
		num = Integer.parseInt(sc.nextLine());
		System.out.println(dto[num-1].getName() + "를 골랐습니다.");
		System.out.println("개수를 선택하세요.");
		int cnt = Integer.parseInt(sc.nextLine());
		int count;
		while(true) {
			try {
					if(dto[num-1].getPrice()*cnt > cash&& dto[num-1].getCnt() > cnt) {
						System.out.println("돈을 더 넣어주세요.");
						int income = Integer.parseInt(sc.nextLine());
						cash = cash + income;
						System.out.println("금액 :" + cash);
						if(dto[num-1].getPrice()*cnt < cash) {
							count = dto[num-1].getCnt() - cnt;
							System.out.println(dto[num-1].getName()+ "의 남은 개수 : " + count);
							dto[num-1].setCnt(dto[num-1].getCnt() - cnt);
						}else if(dto[num-1].getPrice()*cnt > cash) {
							System.out.println("돈이 부족합니다.");
							continue;
					}
				} else {
					if(dto[num-1].getCnt() < cnt) {
						System.out.println("개수가 부족합니다. 다시입력하세요.");
						cnt = Integer.parseInt(sc.nextLine());
						continue;
					}else {
						cash = cash - dto[num-1].getPrice()*cnt;
						count = dto[num-1].getCnt() - cnt;
						System.out.println(dto[num-1].getName()+ "의 남은 개수 : " + count);
						dto[num-1].setCnt(dto[num-1].getCnt() - cnt);
						
					}
				}
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요.");
				continue;
			}
			System.out.println("남은 금액 :" + cash);
			return cash;
		}
	}
	void getCharge(int cash) {
		int charge  = 0;
		if(cash >=1000) {
			charge = cash / 1000;
			cash = cash-1000*charge;
			System.out.println("1000원 : " + charge + "장 남았습니다.");
		}
		if(cash >=500) {
			charge = cash / 500;
			cash = cash-500*charge;
			System.out.println("500원 : " + charge + "개 남았습니다.");
		}
		if(cash >=100) {
			charge = cash / 100;
			cash = cash-100*charge;
			System.out.println("100원 : " + charge + "개 남았습니다.");
		}
		if(cash >=50) {
			charge = cash / 50;
			cash = cash-50*charge;
			System.out.println("50원 : " + charge + "개 남았습니다.");
		}
		if(cash >=10) {
			charge = cash / 10;
			cash = cash-10*charge;
			System.out.println("10원 : " + charge + "개 남았습니다.");
		}else {
			System.out.println("거스름돈이 안남았습니다.");
		}
	}
	boolean getMaster(JapangiDTO[] dto) {
		String id;
		String pw;
		System.out.println("관지자 로그인 : 아이디와 비번을 입력해주세요.");
		while(true) {
			id = sc.nextLine();
			pw = sc.nextLine();
			System.out.println("ID : " + id + " " + "PW : " + pw);
			if(id.equals("master") && pw.equals("admin")) {
				System.out.println(id+ "님 이 로그인하였습니다.");
				return true;
				
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	JapangiDTO[] addProduct(JapangiDTO[] dto) {
		System.out.println("추가할 제품 수를 입력하세요.");
		int cnt = 0;
		while(true) {
			cnt = Integer.parseInt(sc.nextLine());
			JapangiDTO[] tempDto = new JapangiDTO[dto.length +cnt];
			try {
				if(cnt > 0 ) {
					
					for (int i = 0; i < dto.length; i++) {
						tempDto[i] = dto[i];
					}
					System.out.println("제품정보를 입력하세요.");
					for (int i = 0 ; i < cnt; i++) {
						System.out.println("제품명 정보를 입력하세요.");
						tempDto[i+dto.length] = new JapangiDTO(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())); 
					}
				}else {
					System.out.println("다시 입력하세요.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요.");
				continue;
			}
			for (int i = 0; i < dto.length; i++) {
				System.out.println((i+1) + "번 " + dto[i].getName() +" "+ dto[i].getPrice() +"원 "+ dto[i].getCnt()+"개");
			}
			return tempDto;
		}
	}
	JapangiDTO[] correctProduct(JapangiDTO[] dto) {
		System.out.println("수정할 제품 번호를 입력하세요.");
		for (int i = 0; i < dto.length; i++) {
			System.out.println((i+1) + "번 " + dto[i].getName() +" "+ dto[i].getPrice() +"원 "+ dto[i].getCnt()+"개");
		}
		int cnt = 0;
		while(true) {
			cnt = Integer.parseInt(sc.nextLine());
			System.out.println(cnt+ "번 " +  dto[cnt-1].getName() + "를 선택하였습니다.");
			try {
				if(cnt > 0) {
					System.out.println("제품정보를 입력하세요.");
					dto[cnt-1] = new JapangiDTO(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));  
				}else {
					System.out.println("다시 입력하세요.");
					continue;
					}
				}
			 catch (Exception e) {
				System.out.println("숫자로 입력하세요.");
				continue;
			}
			for (int i = 0; i < dto.length; i++) {
				System.out.println((i+1) + "번 " + dto[i].getName() +" "+ dto[i].getPrice() +"원 "+ dto[i].getCnt()+"개");
			}
			return dto;
		}
	}
	JapangiDTO[] deleteProduct(JapangiDTO[] dto) {
		System.out.println("제거할 제품 번호를 입력하세요.");
		for (int i = 0; i < dto.length; i++) {
			System.out.println((i+1) + "번 " + dto[i].getName() +" "+ dto[i].getPrice() +"원 "+ dto[i].getCnt()+"개");
		}
		int cnt = 0;
		int k = 0;
		JapangiDTO[] tempDto = new JapangiDTO[dto.length-1];
		while(true) {
			cnt = Integer.parseInt(sc.nextLine());
			try {
				if(cnt > 0 && cnt <= dto.length) {
					for (int i = 0; i < dto.length; i++) {
						if(dto[cnt-1] == dto[i]) {
							dto[i] = null;
							k--;
						} else {
							for (int j = k; j < dto.length-1 ; j++) {
								tempDto[k] = dto[i];								
							}
						}
						k++;
					}
				}else {
					System.out.println("다시 입력하세요.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요.");
				continue;
			}
			for (int i = 0; i < tempDto.length; i++) {
				System.out.println((i+1) + "번 " + tempDto[i].getName() +" "+ tempDto[i].getPrice() +"원 "+ tempDto[i].getCnt()+"개");
			}
			return tempDto;
		}
	}
	
}
