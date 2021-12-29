package pack03_Interfaces;

public class MsSqlDAO implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MsSql을 이용해서 조회");
		
	}

	@Override
	public void insert() {
		System.out.println("MsSql을 이용해서 추가");
		
	}

	@Override
	public void update() {
		System.out.println("MsSql을 이용해서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MsSql을 이용해서 삭제");
		
	}
}
