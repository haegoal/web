package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class localDAO {
	public int total(String query){
		int total=0;
		try {
			String sql = "select count(*) cnt from products where name like ?";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setString(1, "%" + query + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				total = rs.getInt("cnt");
			}
		}catch(Exception e) {
			System.out.println("총합" + e.toString());
		}
		return total;
	}
	
	public List<localVO> list(int page, String query){
		List<localVO> array = new ArrayList<localVO>();
		try {
			String sql="select * from local where lname like ? or laddress like ?"
					+ "order by id limit ?, 5";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setString(1, "%" + query + "%");
			ps.setString(2, "%" + query + "%");
			ps.setInt(3, page);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				localVO vo = new localVO();
				vo.setId(rs.getInt("id"));
				vo.setLid(rs.getString("lid"));
				vo.setLname(rs.getString("lname"));
				vo.setLaddress(rs.getString("laddress"));
				vo.setLphone(rs.getString("lphone"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("지역목록" + e.toString());
		}
		return array;
	}
}
