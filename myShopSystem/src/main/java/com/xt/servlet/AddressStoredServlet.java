package com.xt.servlet;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.xt.common.AddressDetail;
import com.xt.common.BaseServlet;
import com.xt.dao.AddressDao;
import com.xt.impl.UserInfoServiceImpl;

@WebServlet("*.address")
public class AddressStoredServlet extends BaseServlet{

	static UserInfoServiceImpl uis = new UserInfoServiceImpl();
	AddressDao addressDao = new AddressDao();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		String path = request.getServletPath();
		
		HttpSession session = request.getSession();
		int user_info_id = (int)session.getAttribute("userName");
		
		if("/delete.address".equals(path)) {
			try {
				String id = request.getParameter("id");
				boolean isOk = addressDao.deleteAddressById(id);
				response.getWriter().print(isOk?"true":"false");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		if("/findAll.address".equals(path)) {
			
			
			List<AddressDetail> addressDetailList = addressDao.findAllAddressByUserId(user_info_id);
			
			System.out.println(addressDetailList);
			
			request.setAttribute("addressDetailList", addressDetailList );
			
			try {
				request.getRequestDispatcher("address.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if("/add.address".equals(path)) {
			
			response.setContentType("text/html; charset=UTF-8");
			String name = request.getParameter("name");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			String detailAddress = request.getParameter("detailaddress");
			String city = address.substring(0, address.indexOf('省'));
			String province = address.substring(address.indexOf('省') + 1, address.indexOf('市'));
			String area = address.substring(address.indexOf('市') + 1, address.indexOf('区'));
			String uuid = UUID.randomUUID().toString();
			uis.updataAddressInformation(uuid, name, phone, address, detailAddress,user_info_id);
			AddressDetail ad = new AddressDetail(uuid, name, phone, address, detailAddress, province, city, area,user_info_id);
			try {
				response.getWriter().write(new Gson().toJson(ad));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
