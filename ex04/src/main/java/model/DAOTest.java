package model;

public class DAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAO();

		
		for (BookVO vo : dao.list(1)) {
			System.out.println(vo.toString());
		}
	}

}
