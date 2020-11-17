package com.mongodb.learnings.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mongodb.learnings.model.Role;
import com.mongodb.learnings.repo.RoleRepository;

@Service
public class RoleService {

	public static final Logger logger = LoggerFactory.getLogger(RoleService.class);

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private RoleServiceHelper roleServiceHelper;

	@Autowired
	private MongoTemplate mongoTemplate;

	public Role findByRoleName(String roleName) {
		return roleRepository.findByRoleNameIgnoreCase(roleName.trim());
	}

	public void deleteRole(Role role) {
		roleRepository.delete(role);
	}

	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	public boolean isRoleExists(Role role) {
		logger.debug("In exists().");
		return roleRepository.findByRoleNameIgnoreCase(role.getRoleName().trim()) != null;
	}

	private Sort orderBy() {

		return new Sort(Sort.Direction.DESC, "description")

				.and(new Sort(Sort.Direction.ASC, "title"));
	}

	public void sliceRole(String roleName) {
		Slice<Role> slice = null;
		try {
			/*
			 * Slice is a sized chunk of data with an indication of whether there is more
			 * data available. Slice avoids triggering a count query to calculate the
			 * overall number of pages as that might be expensive. A Slice only knows about
			 * whether a next or previous Slice is available, which might be sufficient when
			 * walking through a larger result set.
			 */
			Pageable pageable = PageRequest.of(0, 1);
			while (true) {
				slice = roleRepository.findByRoleName(roleName, pageable);
				int number = slice.getNumber();
				int numberOfElements = slice.getNumberOfElements();
				int size = slice.getSize();
				System.out.printf("slice info - page number %s, numberOfElements: %s, size: %s%n", number,
						numberOfElements, size);
				List<Role> roleList = slice.getContent();
				if (!slice.hasNext()) {
					break;
				}
				pageable = slice.nextPageable();
			}
		} catch (DataAccessException e) {
			logger.error("Error while saving role {}", e);
		}
	}

	public List<Role> findByRoleNameList() {
		List<Integer> listOfAge = new ArrayList<Integer>();
		listOfAge.add(10);
		listOfAge.add(30);
		listOfAge.add(40);

		Query query = new Query();
		query.addCriteria(new Criteria().orOperator(Criteria.where("groupId").in(listOfAge))).fields();
		logger.info("query: " + query.toString());
		List<Role> roleList = mongoTemplate.find(query, Role.class, "Role");
		System.out.println("roleList: " + roleList.toString());
		return roleList;
	}
}
