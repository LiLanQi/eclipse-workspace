package com.xt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xt.common.AddressDetail;
import com.xt.util.DBUtil;

public class AddressDao {

	
	public boolean deleteAddressById(String id) {
		
		
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement ps =  con.prepareStatement("delete from user_info_address where id = ?");
			
			ps.setString(1, id);
			int n = ps.executeUpdate();
			System.out.println(n);
			return n>0?true:false;
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return false;
	}
	
	
	
	public List<AddressDetail> findAllAddressByUserId(int userId){
		List<AddressDetail> addressDetailList = new ArrayList<>();
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user_info_address where user_info_id = ?");
			
			ps.setInt(1, userId);
			
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				
				String id = rs.getString("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String address = rs.getString("address");
				String detailAddress = rs.getString("detailaddress");
				int user_info_id = rs.getInt("user_info_id");
				
				int index_province = address.indexOf("省");
				int index_city = address.indexOf("市");
				int index_area = address.indexOf("区");
				
				String province = address.substring(0,index_province);
				String city = address.substring(index_province+1,index_city);
				String area = address.substring(index_city+1,index_area);
				
				AddressDetail addressDetail = new AddressDetail(id, name, phone, address, detailAddress, province,
						city, area, user_info_id);
				
				
				addressDetailList.add(addressDetail);
				
				
				
				
			}
			return addressDetailList;
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return addressDetailList;
		
		
	}
}
