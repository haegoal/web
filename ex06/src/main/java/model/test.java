package model;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localDAO dao = new localDAO();
		
		for (localVO vo : dao.list(2, "")) {
			System.out.println(vo.toString());
		}
	}

}
