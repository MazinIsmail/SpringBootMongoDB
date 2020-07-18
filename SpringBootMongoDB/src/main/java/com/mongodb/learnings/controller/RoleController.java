package com.mongodb.learnings.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.learnings.constants.RoleNames;
import com.mongodb.learnings.model.Role;
import com.mongodb.learnings.model.UserInfo;
import com.mongodb.learnings.service.RoleService;

@RestController
@RequestMapping(value = "/role")
public class RoleController {

	public static final Logger logger = LoggerFactory.getLogger(RoleController.class);

	@Autowired
	private RoleService roleService;

	@GetMapping(value = "/rolename/{roleName}")
	public ResponseEntity<?> getRoleByName(@PathVariable("roleName") @NotEmpty String roleName) {
		logger.info("In getRoleByName().");
		Role role = roleService.findByRoleName(roleName.trim());
		if (role == null) {
			return new ResponseEntity<Role>(role, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Role>(role, HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/rolename", consumes = { "application/json" })
	public ResponseEntity<?> deleteRoleByRoleName(@RequestBody @Valid @NotNull Role role) {
		logger.info("In deleteRoleByRoleName().");
		Role userRole = roleService.findByRoleName(role.getRoleName().trim());
		if (userRole == null) {
			return new ResponseEntity<String>("Role: " + role.getRoleName() + "  doesn't Exist!!",
					HttpStatus.NO_CONTENT);
		}
		roleService.deleteRole(userRole);
		logger.info("SuccessFully Deleted Role Record.");
		return new ResponseEntity<Role>(userRole, HttpStatus.NO_CONTENT);
	}

	@GetMapping(value = "/all")
	public ResponseEntity<List<Role>> getAllRoles() {
		logger.info("In getAllRoles().");
		List<Role> rolesList = roleService.getAllRole();
		return new ResponseEntity<>(rolesList, HttpStatus.OK);
	}

	@PostMapping(value = "/create", consumes = { "application/json" })
	public ResponseEntity<?> addRole(@RequestBody @Valid @NotNull Role role) {
		logger.info("In addRole().");
		if (roleService.isRoleExists(role)) {
			logger.info("Failed to Add Role:{}. Role name Already exists.", role.getRoleName());
			return new ResponseEntity<String>("Role Name:" + role.getRoleName() + "  Already exists",
					HttpStatus.CONFLICT);
		} else {
			role = roleService.saveRole(role);
			logger.info("SuccessFully Created Role Record.");
			return new ResponseEntity<Role>(role, HttpStatus.OK);
		}
	}

	@GetMapping(value = "/createAll")
	public ResponseEntity<?> createAllRoles() {
		logger.info("In createAllRoles().");
		List<Role> roleList = roleService.createAllRoles();
		logger.info("SuccessFully Created All Role Record.");
		return new ResponseEntity<List<Role>>(roleList, HttpStatus.OK);
	}

	@PutMapping(value = "/update", consumes = { "application/json" })
	public ResponseEntity<?> updateRoleByName(@RequestBody @Valid @NotNull Role role) {
		logger.info("In updateRoleByName().");
		if (roleService.isRoleExists(role)) {
			if (role.getRoleName().equalsIgnoreCase(RoleNames.SYSTEM_ADMIN.getRoleNameDesc())) {
				return new ResponseEntity<String>("Role Name: " + role.getRoleName() + " cannot be updated",
						HttpStatus.CONFLICT);
			}
			role = roleService.updateRole(role);
			logger.info("SuccessFully Updated Role Record.");
			return new ResponseEntity<Role>(role, HttpStatus.OK);
		} else {
			logger.error("Failed to Update Role:{}. Role name does not exist.", role.getRoleName());
			return new ResponseEntity<String>("Role Name:" + role.getRoleName() + "  does not exist",
					HttpStatus.CONFLICT);
		}
	}

	@DeleteMapping(value = "/deleteAll")
	public ResponseEntity<?> deleteAllRole() {
		logger.info("In deleteAllRole().");
		roleService.deleteAllRole();
		logger.info("SuccessFully Deleted All Role Records.");
		return new ResponseEntity<String>("SuccessFully Deleted All Role Records.", HttpStatus.NO_CONTENT);
	}

}
