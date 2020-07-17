package com.mongodb.learnings.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.learnings.model.UserInfo;
import com.mongodb.learnings.service.UserInfoService;

@RestController
@RequestMapping(value = "/user")
public class UserInfoController {

	public static final Logger logger = LoggerFactory.getLogger(UserInfoController.class);

	@Autowired
	private UserInfoService userInfoService;

	@GetMapping(value = "/")
	public List<UserInfo> getAllUsers() {
		return userInfoService.getAllUserInfoData();
	}

	@PostMapping(value = "/populateUser")
	public List<UserInfo> populateUser() {
		return userInfoService.getUsers();
	}

}
