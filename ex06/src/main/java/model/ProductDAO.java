package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class ProductDAO {
	
	public void update(ProductVO vo){
		try {
			String sql = "update products set name=?, price=? where code=?";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setInt(2, vo.getPrice());
			ps.setInt(3, vo.getCode());
			ps.execute();
		}catch(Exception e) {
			System.out.println("수정" + e.toString());
		}
	}
	
	public void delete(int code){
		try {
			String sql = "delete from products where code = ?";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setInt(1, code);
			ps.execute();
		}catch(Exception e) {
			System.out.println("삭제" + e.toString());
		}
	}
	
	public void insert(ProductVO vo){
		try {
			String sql = "insert into products(name, price) values(?, ?)";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setInt(2, vo.getPrice());
			ps.execute();
		}catch(Exception e) {
			System.out.println("입력" + e.toString());
		}
	}

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
	
	
	public List<ProductVO> list(int page, String query){
		List<ProductVO> array = new ArrayList<ProductVO>();
		try {
			String sql= "select * from products where name like ? order by code desc limit ?,5";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setString(1, "%" + query + "%");
			ps.setInt(2, (page-1)*5);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setCode(rs.getInt("code"));
				vo.setPrice(rs.getInt("price"));
				vo.setName(rs.getString("name"));
				vo.setRdate(rs.getTimestamp("rdate"));
				array.add(vo);
			}
		}catch(Exception e) {
			System.out.println("상품목록" + e.toString());
		}
		return array;
	}
}
