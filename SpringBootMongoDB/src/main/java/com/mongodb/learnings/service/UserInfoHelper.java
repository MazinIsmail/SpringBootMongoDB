package com.mongodb.learnings.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.learnings.model.UserInfo;

@Service
public class UserInfoHelper {

	@Autowired
	private RoleService roleService;

	public List<UserInfo> getUsers() {

		UserInfo userInfo1 = new UserInfo();
		userInfo1.setUserFirstName("Mazin");
		userInfo1.setUserLastName("Ismail");

		UserInfo userInfo2 = new UserInfo();
		userInfo2.setUserFirstName("Bhairavi");
		userInfo2.setUserLastName("Balakrishnan");

		UserInfo userInfo3 = new UserInfo();
		userInfo3.setUserFirstName("Viswa");
		userInfo3.setUserLastName("Chari");

		List<UserInfo> userList = new ArrayList<UserInfo>();
		userList.add(userInfo1);
		userList.add(userInfo2);
		userList.add(userInfo3);

		return userList;
	}
}
