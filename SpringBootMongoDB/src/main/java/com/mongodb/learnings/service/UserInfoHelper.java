package com.mongodb.learnings.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mongodb.learnings.model.Role;
import com.mongodb.learnings.model.UserInfo;

@Service
public class UserInfoHelper {

	public List<UserInfo> getUsers(){
		
		UserInfo userInfo1 =  new UserInfo();
		userInfo1.setActive(true);
		userInfo1.setCreatedBy("Mazin");
		userInfo1.setCreatedDate("17-07-2020");
		userInfo1.setDefaultHomePage("true");
		userInfo1.setEmail("Mazin@test.com");
		userInfo1.setId("1");
		userInfo1.setLastLogin(new Date());
		userInfo1.setModifiedBy("Mazin");
		userInfo1.setModifiedDate("17-07-2020");
		userInfo1.setUserFirstName("Mazin");
		userInfo1.setUserId("1234");
		userInfo1.setUserLastName("Ismail");
		userInfo1.setUserName("Mazin");
		userInfo1.setUserPassword("****");
		Role role1 = new Role();
		role1.setRoleName("TeamLead");
		userInfo1.setUserRole(role1);
		userInfo1.setUserStatus("Active");
		
		UserInfo userInfo2 =  new UserInfo();
		userInfo2.setActive(true);
		userInfo2.setCreatedBy("Bhairavi");
		userInfo2.setCreatedDate("17-07-2020");
		userInfo2.setDefaultHomePage("true");
		userInfo2.setEmail("Bhairavi@test.com");
		userInfo2.setId("1");
		userInfo2.setLastLogin(new Date());
		userInfo2.setModifiedBy("Bhairavi");
		userInfo2.setModifiedDate("17-07-2020");
		userInfo2.setUserFirstName("Bhairavi");
		userInfo2.setUserId("1234");
		userInfo2.setUserLastName("Balakrishnan");
		userInfo2.setUserName("Bhairavi");
		userInfo2.setUserPassword("****");
		Role role2 = new Role();
		role2.setRoleName("Developer");
		userInfo2.setUserRole(role2);
		userInfo2.setUserStatus("Active");
		
		UserInfo userInfo3 =  new UserInfo();
		userInfo3.setActive(true);
		userInfo3.setCreatedBy("Viswa");
		userInfo3.setCreatedDate("17-07-2020");
		userInfo3.setDefaultHomePage("true");
		userInfo3.setEmail("Viswa@test.com");
		userInfo3.setId("1");
		userInfo3.setLastLogin(new Date());
		userInfo3.setModifiedBy("Viswa");
		userInfo3.setModifiedDate("17-07-2020");
		userInfo3.setUserFirstName("Viswa");
		userInfo3.setUserId("1234");
		userInfo3.setUserLastName("Chari");
		userInfo3.setUserName("Viswa");
		userInfo3.setUserPassword("****");
		Role role3 = new Role();
		role3.setRoleName("Developer");
		userInfo3.setUserRole(role3);
		userInfo3.setUserStatus("Active");
		
		ArrayList<UserInfo> userList = new ArrayList();
		userList.add(userInfo1);
		userList.add(userInfo2);
		userList.add(userInfo3);
		
		return userList;
	}
}
