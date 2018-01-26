package com.tyan.mangkubumi.core.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyan.mangkubumi.core.ClassContext;
import com.tyan.mangkubumi.core.dao.UserDao;
import com.tyan.mangkubumi.core.model.User;

public class UserAction extends CoreAction{

	private static final long serialVersionUID = 1L;
	private User user;
	private List<User> listUser = new ArrayList<>();
	private Map<String, Object> session;
	//private UserDao userDao = (UserDao) new ClassPathXmlApplicationContext("config-db.xml").getBean("userDao");
	private UserDao userDao = (UserDao) ClassContext.getContext().getBean("userDao");
	
	public String Login(){
		System.out.println("Jalankan Method Login");
		
		try {
			int x=0;
			x = userDao.checkUserLogin(user);
			if(x>0){
				session.put("userName",user);
				user =(User) session.get("userName");
				/*listUser = userDao.getUserLogin(user);*/
				return SUCCESS;				
			}
		} catch (Exception e) {
			addFieldError("invalid", "Username & Password Salah");
		}
		return ERROR;
	}
	
	public String LogOut(){
		System.out.println("Jalankan method LogOut");
		session.remove("userName");
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
