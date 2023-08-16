package model;

import java.util.*;
import java.sql.*;

public class ProductDAO {
	
	//전체 상품수
	
	public int total() {
		int total=0;
		try {
			String sql = "select count(*) cnt from products";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				total=rs.getInt("cnt");
			}
		}catch(Exception e) {
			System.out.println("총합오류" + e.toString());
		}
		return total;
	}
	
	public void update(ProductVO vo){
		try {
			String sql = "update products set name = ?, price = ?, rdate=now() where code=?";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setInt(2, vo.getPrice());
			ps.setInt(3, vo.getCode());
			ps.execute();
		}catch(Exception e) {
			System.out.println("상품수정오류" + e.toString());
		}	
	}
	
	public void delete(String code){
		try {
			String sql = "delete from products where code=?";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setString(1, code);
			ps.execute();
		}catch(Exception e) {
			System.out.println("상품삭제오류" + e.toString());
		}	
	}
	
	
	public ProductVO read(String code){
		ProductVO vo = new ProductVO();
		try {
			String sql = "select * from products where code = ?";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setString(1, code);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setCode(rs.getInt("code"));
				vo.setName(rs.getString("name"));
				vo.setPrice(rs.getInt("price"));
				vo.setRdate(rs.getTimestamp("rdate"));
			}
		}catch(Exception e) {
			System.out.println("상품정보오류" + e.toString());
		}	
		return vo;
	}
		
	public void insert(ProductVO vo){
		try {
			String sql = "insert into products(name, price) values (?, ?)";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setInt(2, vo.getPrice());
			ps.setString(1, vo.getName());
			ps.execute();
		}catch(Exception e) {
			System.out.println("상품등록오류" + e.toString());
		}	
	}
	
	public List<ProductVO> list(int page){
		List<ProductVO> array = new ArrayList<ProductVO>();
		try {
			String sql ="select * from products order by code desc limit ?, 5";
			PreparedStatement ps = Database.CON.prepareStatement(sql);
			ps.setInt(1, (page-1)*5);
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
