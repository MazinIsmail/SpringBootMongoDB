package com.mongodb.learnings.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.learnings.model.UserInfo;

public interface UserInfoRepo extends MongoRepository<UserInfo, String> {

}
