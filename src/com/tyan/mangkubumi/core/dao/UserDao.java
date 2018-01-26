package com.tyan.mangkubumi.core.dao;

import java.sql.SQLException;
import java.util.List;

import com.tyan.mangkubumi.core.model.User;

public interface UserDao {

	int checkUserLogin(User u) throws SQLException;
	List<User> getUserLogin(User record);
	
}
