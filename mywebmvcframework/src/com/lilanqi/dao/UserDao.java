package com.lilanqi.dao;

import java.text.SimpleDateFormat;

import org.dom4j.Document;
import org.dom4j.Element;

import com.lilanqi.dao.impl.IUserDao;
import com.lilanqi.domain.User;
import com.lilanqi.util.XmlUtils;

public class UserDao implements IUserDao {

	@Override
	public User find(String userName, String userPwd) {
		try{
			Document document = XmlUtils.getDocument();
			//使用XPath表达式来操作XML节点
			Element e = (Element) document.selectSingleNode("//user[@userName='"+userName+"' and @userPwd='"+userPwd+"']");
			if(e==null){
				return null;
			}
			User user = new User();
			user.setId(e.attributeValue("id"));
			user.setEmail(e.attributeValue("email"));
			user.setUserPwd(e.attributeValue("userPwd"));
			user.setUserName(e.attributeValue("userName"));
			String birth = e.attributeValue("birthday");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			user.setBirthday(sdf.parse(birth));
			
			return user;
		
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public void add(User user) {
		try{
			Document document = XmlUtils.getDocument();
			Element root = document.getRootElement();
			Element user_node = root.addElement("user");  //创建user结点，并挂到root
			user_node.setAttributeValue("id", user.getId());
			user_node.setAttributeValue("userName", user.getUserName());
			user_node.setAttributeValue("userPwd", user.getUserPwd());
			user_node.setAttributeValue("email", user.getEmail());
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			user_node.setAttributeValue("birthday", sdf.format(user.getBirthday()));
		
			XmlUtils.write2Xml(document);
			
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public User find(String userName) {
		try{
			System.out.println(55);
			Document document = XmlUtils.getDocument();
			System.out.println(66);
			Element e = (Element) document.selectSingleNode("//user[@userName='"+userName+"']");
			System.out.println(77);
			System.out.println(444);
			if(e==null){
				return null;
			}
			System.out.println(333);
			User user = new User();
			user.setId(e.attributeValue("id"));
			user.setEmail(e.attributeValue("email"));
			user.setUserPwd(e.attributeValue("userPwd"));
			user.setUserName(e.attributeValue("userName"));
			String birth = e.attributeValue("birthday");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			user.setBirthday(sdf.parse(birth));
			
			return user;
		
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
