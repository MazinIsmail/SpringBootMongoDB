package com.mongodb.learnings.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.learnings.model.UserInfo;
import com.mongodb.learnings.repo.UserInfoRepo;

@Service
public class UserInfoService {
	public static final Logger logger = LoggerFactory.getLogger(UserInfoService.class);

	@Autowired
	private UserInfoRepo userInfoRepo;

	@Autowired
	private UserInfoHelper userInfoHelper;

	public List<UserInfo> getAllUserInfoData() {
		logger.debug("Start : getAllUserInfoData()");
		List<UserInfo> userInfoList = userInfoRepo.findAll();
		if (userInfoList.isEmpty()) {
			return null;
		}
		logger.debug("End : getAllUserInfoData()");
		return userInfoList;
	}

	public List<UserInfo> getUsers() {
		logger.debug("Start : getUsers()");
		List<UserInfo> userInfoList = userInfoRepo.saveAll(userInfoHelper.getUsers());
		logger.debug("End : getUsers()");
		return userInfoList;
	}
}
