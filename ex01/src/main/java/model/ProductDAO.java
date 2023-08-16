package model;

import java.util.*;
import java.sql.*;

public class ProductDAO {
	
	public void insert(ProductVO vo){
		try {
			String sql = "insert into products(name, price) values ('?', ?)";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setInt(2, vo.getPrice());
			ps.setString(1, vo.getName());
			ps.execute();
		}catch(Exception e) {
			System.out.println("상품등록오류" + e.toString());
		}	
	}
	
	
	
	public List<ProductVO> list(){
		List<ProductVO> array = new ArrayList<ProductVO>();
		try {
			String sql = "select * from products order by code desc";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setCode(rs.getInt("code"));
				vo.setName(rs.getString("name"));
				vo.setPrice(rs.getInt("price"));
				vo.setRdate(rs.getTimestamp("rdate"));
				array.add(vo);
				}
		}catch(Exception e) {
			System.out.println("상품목록오류" + e.toString());
		}	
		return array;
	}
	
}
