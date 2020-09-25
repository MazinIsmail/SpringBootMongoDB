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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.learnings.model.Role;
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

	@GetMapping(value = "/paginate/rolename/{roleName}")
	public ResponseEntity<?> getRoleByNameList(@PathVariable("roleName") @NotEmpty String roleName) {
		logger.info("In getRoleByNameList()");
		roleService.sliceRole(roleName.trim());
		return new ResponseEntity<>(HttpStatus.OK);
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




}
