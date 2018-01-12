package com.jstl.test.dao;

import java.util.ArrayList;

import com.jstl.test.vo.UserClass;

public interface UserDAO {

	ArrayList<UserClass> selectUserList();
	UserClass selectUser(int uiNo);
	UserClass selectUser(String uiId);
	
}
