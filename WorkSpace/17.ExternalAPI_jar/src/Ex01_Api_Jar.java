import java.util.ArrayList;

//DAO <- Database Access Object
public class Ex01_Api_Jar {
	public static void main(String[] args) {
		Ex01_DAO dao = new Ex01_DAO();
			//dao.getConn();
			//dao.connTest();
			//dao.memberSelect();
		 ArrayList<Ex01_DTO> list = dao.memberSelect1();
		 for (Ex01_DTO dto : list) {
			System.out.print(dto.getNum() + "\t");
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getAge() + "\t");
			System.out.print(dto.getAddr() + "\t");
			System.out.println(dto.getTel());
		}
	}
}
