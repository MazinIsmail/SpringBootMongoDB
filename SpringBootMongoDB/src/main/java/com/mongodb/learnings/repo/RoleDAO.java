package com.mongodb.learnings.repo;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.learnings.model.Role;

@Repository
public class RoleDAO {

	@Autowired
	private EntityManager entityManager;

	public Role getRoleByRoleName(String roleName) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Role> q = cb.createQuery(Role.class);
		Root<Role> c = q.from(Role.class);
		return null;
	}
}
