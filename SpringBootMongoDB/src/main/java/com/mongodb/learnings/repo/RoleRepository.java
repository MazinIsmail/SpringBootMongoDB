package com.mongodb.learnings.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.learnings.model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

	Role findByRoleNameIgnoreCase(String roleName);

	Role findByGroupIdIgnoreCase(String groupId);

}
