package Test;

public class TestMain {
	public static void main(String[] args) {
		UserDTO dto = new UserDTO(null, null, null, null, null, null);
		UserDAO dao = new UserDAO();
		NoticeDAO ndao = new NoticeDAO();
		while(true) {
			System.out.println("1.로그인 2.회원가입 3.로그아웃 4.프로그램종료");
			int menu = dao.rtnInt("메뉴를 선택해주세요.");
			if(menu == 1) {
				//1.로그인(3회불일치시 프로그램 자동 종료)
				if(dao.Login(dto)) {
					System.out.println("1.회원정보 수정 2.회원탈퇴 3.공지사항보기");
					int choice = dao.rtnInt("메뉴를 선택해주세요.");
					if(choice ==1) {
						//1-1.회원정보수정(비밀번호 확인) x
						dao.UpdateUser(dto);
					}else if(choice ==2) {
						//1-2.회원탈퇴(아이디 비밀번호 확인)
						dao.DeleteUser(dto);
					}else if(choice ==3) {
						//1-3공지사항보기(NoticeTBL 출력)
						ndao.SelectNotice();
					}else {
						System.out.println("없는 메뉴입니다 다시 선택해주세요");
					}
				} else {
					break;
				}
			}else if(menu == 2){
				//2.회원가입(id중복확인, 회원가입 완료)
				dao.InsertUser(dto);
			}else if(menu == 3) {
				//3.로그아웃
				if(dto.getUser_id() == null) {
					System.out.println("로그인을 먼저하세요.");
				} else {
					System.out.println("로그아웃을 합니다.");
					break;
				}
			}else if(menu == 4) {
				//3.프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("없는 메뉴입니다 다시 선택해주세요");
			}
		}
	}
}
