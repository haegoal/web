package model;

public class testDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDAO dao = new ProductDAO();
		for (ProductVO vo : dao.list()) {
			System.out.println(vo.toString());
		}
	}

}