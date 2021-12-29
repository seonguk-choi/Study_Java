package pack03_Interfaces;
//dao를 구현할 수 있게 interface 설계도를 만듬
public interface DataAccessObject {
	//CRUD create read update delete
	//	   insert select update delete
	//DML 수행한다. 데이터 조작어
	public void select();//글을 조회한다.
	public void insert();//글을 추가한다.
	public void update();//글을 내용을 수정한다.
	public void delete();//글을 삭제한다.
	
}
