package com.mongodb.learnings.service;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mongodb.learnings.constants.ModuleNameConstants;
import com.mongodb.learnings.constants.RoleNames;
import com.mongodb.learnings.constants.UserConstants;
import com.mongodb.learnings.model.ModuleAccess;
import com.mongodb.learnings.model.Role;
import com.mongodb.learnings.model.UserInfo;
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

	public Role saveRole(Role role) {
		List<ModuleAccess> moduleAccessList = role.getModuleAccessList();
		Role roleInserted = null;
		try {
			if (isModuleNameExist(moduleAccessList)) {
				if (role.getCreatedBy() == null)
					role.setCreatedBy(UserConstants.SYSTEM);
				role.setCreatedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
				roleInserted = roleRepository.insert(role);
			}
		} catch (DataAccessException e) {
			logger.error("Error while saving role {}", e);
		}
		return roleInserted;
	}

	public Role updateRole(Role role) {
		List<ModuleAccess> moduleAccessList = role.getModuleAccessList();
		Role roleInserted = null;
		try {
			if (isModuleNameExist(moduleAccessList)) {
				if (role.getModifiedBy() == null)
					role.setModifiedBy(UserConstants.SYSTEM);
				role.setModifiedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
				roleInserted = roleRepository.save(role);
			}
		} catch (DataAccessException e) {
			logger.error("Error while saving role {}", e);
		}
		return roleInserted;
	}

	public void deleteAllRole() {
		roleRepository.deleteAll();
	}

	public boolean isModuleNameExist(List<ModuleAccess> moduleAccessList) {
		boolean flag = true;
		List<String> moduleNames = Stream.of(ModuleNameConstants.values()).map(ModuleNameConstants::getModuleNameDesc)
				.collect(Collectors.toList());

		for (ModuleAccess module : moduleAccessList) {
			if (!moduleNames.contains(module.getModuleName())) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public List<Role> createAllRoles() {
		List<Role> roleList = new ArrayList<Role>();
		roleList.add(roleServiceHelper.setRoleAgent());
		roleList.add(roleServiceHelper.setRoleAnalyst());
		roleList.add(roleServiceHelper.setRoleCompanyAdmin());
		roleList.add(roleServiceHelper.setRoleFinance());
		roleList.add(roleServiceHelper.setRoleManager());
		roleList.add(roleServiceHelper.setRoleSystemAdmin());
		roleList.add(roleServiceHelper.setRoleBasic());
		roleList.add(roleServiceHelper.setRoleRoot());

		logger.debug("size of list {}", roleList.size());
		roleList = roleRepository.insert(roleList);
		return roleList;
	}

	public List<Role> getAllRole() {
		Query query = new Query();
		query.addCriteria(
				new Criteria().orOperator(Criteria.where("roleName").ne(RoleNames.SYSTEM_ADMIN.getRoleNameDesc())))
				.fields();

		List<Role> rolesList = mongoTemplate.find(query, Role.class, "Roles");
		return rolesList;
	}
}
