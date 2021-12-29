package pack04_OOPjapangi;

import java.util.Arrays;
import java.util.Scanner;

public class JapangiMain {
	public static void main(String[] args) {
		//무한반복을 하는 루프를 만들고 특정 키 입력시 종료되는 구조를 먼저만듬.
		DrinkDAO dao = new DrinkDAO();//인스턴스화(인스턴스 멤버를 사용하기위해서
									  //객체를 객체화함 (인스턴스화함))
		DrinkDTO[] dtos = dao.initDTOS();
		int menu = 0;
		int money = 0;
		while(true) {
			dao.menudisplay(dtos);
			System.out.println("1.금액 입력 2.음료 뽑기 3.관리자 모드 (-1입력시 자판기 종료)");
			menu = dao.rtnInt("숫자를 입력해주세요.");
			if(menu == 1) {
				//금액 입력
				System.out.println("금액 입력 로직을 넣어야함");
				money = dao.rtnMoney();
			}else if(menu == 2){
				//음료 뽑기
				dao.menudisplay(dtos);
				int choice = dao.rtnInt("음료를 선택해주세요.");
				money = dao.drinkBuy(money, choice , dtos);
			}else if(menu == 3) {

				if(dao.adminLogin()) {
					System.out.println("관리자모드를 실행합니다.");
					System.out.println("1.추가 2.수정 3.삭제");
					int choice = dao.rtnInt("메뉴를 선택해주세요.");
					if(choice == 1) {
						dtos = dao.addDrink(dtos);
					}else if(choice == 2) {
						dtos = dao.modifyDrink(dtos);
					}else if(choice == 3) {
						dtos = dao.deleteDrink(dtos);
					}else {
						System.out.println("잘못입력하셨습니다.종료합니다.");
					}
				}else {
					System.out.println("잘못된접근입니다.");
				}
			}else if(menu == -1){
				break;
			}else {
				System.out.println("없는 메뉴입니다 다시 선택해주세요"+menu);
			}
			
		}
	}
}
