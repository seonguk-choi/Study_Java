package pack02_crud;

import java.util.Scanner;

public class MemberMain {
public static void main(String[] args) {
	MemberDAO dao = new MemberDAO();
		//dao.connTest();
		//MemberDTO dto = new MemberDTO(6, "a", 0, "a", "a");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("num");
//		dto.setNum(Integer.parseInt(sc.nextLine()));
//		System.out.println("name");
//		dto.setName(sc.nextLine());
//		System.out.println("age");
//		dto.setAge(Integer.parseInt(sc.nextLine()));
//		System.out.println("addr");
//		dto.setAddr(sc.nextLine());
//		System.out.println("tel");
//		dto.setTel(sc.nextLine());
//		System.out.println(dto.getNum());
//		System.out.println(dto.getName());
//		System.out.println(dto.getAge());
//		System.out.println(dto.getAddr());
//		System.out.println(dto.getTel());
		//dao.connInsert(dto);
		//dao.UpdateMember(dto);
		//dao.DeleteMember(dto);
		dao.SelectMember();
	}
}
