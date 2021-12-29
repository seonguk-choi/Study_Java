import java.sql.SQLException;
import java.util.ArrayList;
		
public class Ex02_HRMain {
	public static void main(String[] args) throws SQLException {
		Ex02_HRDAO dao = new Ex02_HRDAO();
		ArrayList<Ex02_HRDTO> list = dao.memberSelect1();
//		for (Ex02_HRDTO dto : list) {
//			System.out.print(dto.getEmployee_id() + "\t");
//			System.out.println(dto.getFirst_name() + " " + dto.getLast_name());
//		}

		//dao.memberSelect1();
		//dao.employeeList();
		dao.employeeList2();
	}	
}		
