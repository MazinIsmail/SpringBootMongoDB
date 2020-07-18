package com.mongodb.learnings.service;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mongodb.learnings.constants.ModuleNameConstants;
import com.mongodb.learnings.constants.RoleNames;
import com.mongodb.learnings.constants.UserConstants;
import com.mongodb.learnings.model.ModuleAccess;
import com.mongodb.learnings.model.ModuleAccessRights;
import com.mongodb.learnings.model.Role;

@Component
public class RoleServiceHelper {

	public ModuleAccess setModuleAccessGeneralPrivileges(boolean viewAllAccounts, boolean viewAllClaims) {
		List<ModuleAccessRights> moduleAccessRightsList = new ArrayList<ModuleAccessRights>();
		ModuleAccessRights moduleAccessRight = new ModuleAccessRights(UserConstants.VIEW_ALL_ACCOUNTS, viewAllAccounts);
		moduleAccessRightsList.add(moduleAccessRight);

		moduleAccessRight = new ModuleAccessRights(UserConstants.VIEW_ALL_CLAIMS, viewAllClaims);
		moduleAccessRightsList.add(moduleAccessRight);

		ModuleAccess moduleAccess = new ModuleAccess(ModuleNameConstants.GENERAL_PRIVILEGES.getModuleNameDesc(),
				moduleAccessRightsList);
		return moduleAccess;
	}

	public ModuleAccess setModuleAccessUserConfiguration(boolean view, boolean edit, boolean activation,
			boolean delete) {
		List<ModuleAccessRights> moduleAccessRightsList = new ArrayList<ModuleAccessRights>();
		ModuleAccessRights moduleAccessRight = new ModuleAccessRights(UserConstants.VIEW, view);
		moduleAccessRightsList.add(moduleAccessRight);

		moduleAccessRight = new ModuleAccessRights(UserConstants.EDIT, edit);
		moduleAccessRightsList.add(moduleAccessRight);

		moduleAccessRight = new ModuleAccessRights(UserConstants.ACTIVATION, activation);
		moduleAccessRightsList.add(moduleAccessRight);

		moduleAccessRight = new ModuleAccessRights(UserConstants.DELETE, delete);
		moduleAccessRightsList.add(moduleAccessRight);

		ModuleAccess moduleAccess = new ModuleAccess(ModuleNameConstants.USER_CONFIGURATION.getModuleNameDesc(),
				moduleAccessRightsList);
		return moduleAccess;
	}

	public ModuleAccess setModuleAccessRoleAndPrivileges(boolean view, boolean edit) {
		List<ModuleAccessRights> moduleAccessRightsList = new ArrayList<ModuleAccessRights>();
		ModuleAccessRights moduleAccessRight = new ModuleAccessRights(UserConstants.VIEW, view);
		moduleAccessRightsList.add(moduleAccessRight);

		moduleAccessRight = new ModuleAccessRights(UserConstants.EDIT, edit);
		moduleAccessRightsList.add(moduleAccessRight);

		ModuleAccess moduleAccess = new ModuleAccess(ModuleNameConstants.ROLE_AND_PRIVILEGES.getModuleNameDesc(),
				moduleAccessRightsList);
		return moduleAccess;
	}

	public ModuleAccess setModuleAccessSystemSettings(boolean view, boolean edit) {
		List<ModuleAccessRights> moduleAccessRightsList = new ArrayList<ModuleAccessRights>();
		ModuleAccessRights moduleAccessRight = new ModuleAccessRights(UserConstants.VIEW, view);
		moduleAccessRightsList.add(moduleAccessRight);

		moduleAccessRight = new ModuleAccessRights(UserConstants.EDIT, edit);
		moduleAccessRightsList.add(moduleAccessRight);

		ModuleAccess moduleAccess = new ModuleAccess(ModuleNameConstants.SYSTEM_SETTINGS.getModuleNameDesc(),
				moduleAccessRightsList);
		return moduleAccess;
	}

	public ModuleAccess setModuleAccessReportsDashboard(boolean view) {
		List<ModuleAccessRights> moduleAccessRightsList = new ArrayList<ModuleAccessRights>();
		ModuleAccessRights moduleAccessRight = new ModuleAccessRights(UserConstants.VIEW, view);
		moduleAccessRightsList.add(moduleAccessRight);

		ModuleAccess moduleAccess = new ModuleAccess(ModuleNameConstants.REPORTS_DASHBOARD.getModuleNameDesc(),
				moduleAccessRightsList);
		return moduleAccess;
	}

	public ModuleAccess setModuleAccessAuditTrial(boolean view) {
		List<ModuleAccessRights> moduleAccessRightsList = new ArrayList<ModuleAccessRights>();
		ModuleAccessRights moduleAccessRight = new ModuleAccessRights(UserConstants.VIEW, view);
		moduleAccessRightsList.add(moduleAccessRight);

		ModuleAccess moduleAccess = new ModuleAccess(ModuleNameConstants.AUDIT_TRIAL.getModuleNameDesc(),
				moduleAccessRightsList);
		return moduleAccess;
	}

	public Role setRoleRoot() {

		List<ModuleAccess> moduleAccessList = new ArrayList<>();
		moduleAccessList.add(setModuleAccessUserConfiguration(true, false, false, false));
		moduleAccessList.add(setModuleAccessRoleAndPrivileges(true, false));
		moduleAccessList.add(setModuleAccessSystemSettings(true, false));
		moduleAccessList.add(setModuleAccessReportsDashboard(true));
		moduleAccessList.add(setModuleAccessAuditTrial(true));
		moduleAccessList.add(setModuleAccessGeneralPrivileges(true, true));

		Role role = new Role();
		role.setModuleAccessList(moduleAccessList);
		role.setRoleName(RoleNames.ROOT.getRoleNameDesc());
		role.setJobTitle(new ArrayList<String>(Arrays.asList(UserConstants.ROOT_ADMINSTRATOR)));
		role.setCreatedBy(UserConstants.SYSTEM);
		role.setCreatedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
		role.setGroupId(RoleNames.ROOT.getGroupId());
		return role;
	}

	public Role setRoleSystemAdmin() {

		List<ModuleAccess> moduleAccessList = new ArrayList<>();
		moduleAccessList.add(setModuleAccessUserConfiguration(true, true, true, true));
		moduleAccessList.add(setModuleAccessRoleAndPrivileges(true, false));
		moduleAccessList.add(setModuleAccessSystemSettings(true, true));
		moduleAccessList.add(setModuleAccessReportsDashboard(true));
		moduleAccessList.add(setModuleAccessAuditTrial(true));
		moduleAccessList.add(setModuleAccessGeneralPrivileges(true, true));

		Role role = new Role();
		role.setModuleAccessList(moduleAccessList);
		role.setRoleName(RoleNames.SYSTEM_ADMIN.getRoleNameDesc());
		role.setJobTitle(new ArrayList<String>(Arrays.asList(UserConstants.SYSTEM_ADMINSTRATOR)));
		role.setCreatedBy(UserConstants.SYSTEM);
		role.setCreatedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
		role.setGroupId(RoleNames.SYSTEM_ADMIN.getGroupId());
		return role;
	}

	public Role setRoleSupport() {

		List<ModuleAccess> moduleAccessList = new ArrayList<>();
		moduleAccessList.add(setModuleAccessUserConfiguration(true, true, true, true));
		moduleAccessList.add(setModuleAccessRoleAndPrivileges(true, false));
		moduleAccessList.add(setModuleAccessSystemSettings(true, true));
		moduleAccessList.add(setModuleAccessReportsDashboard(true));
		moduleAccessList.add(setModuleAccessAuditTrial(true));
		moduleAccessList.add(setModuleAccessGeneralPrivileges(false, false));

		Role role = new Role();
		role.setModuleAccessList(moduleAccessList);
		role.setRoleName(RoleNames.SUPPORT.getRoleNameDesc());
		role.setJobTitle(new ArrayList<String>(Arrays.asList(UserConstants.SUPPORT)));
		role.setCreatedBy(UserConstants.SYSTEM);
		role.setCreatedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
		role.setGroupId(RoleNames.SUPPORT.getGroupId());
		return role;
	}

	public Role setRoleCompanyAdmin() {

		List<ModuleAccess> moduleAccessList = new ArrayList<>();
		moduleAccessList.add(setModuleAccessUserConfiguration(true, true, true, true));
		moduleAccessList.add(setModuleAccessRoleAndPrivileges(true, true));
		moduleAccessList.add(setModuleAccessSystemSettings(true, false));
		moduleAccessList.add(setModuleAccessReportsDashboard(true));
		moduleAccessList.add(setModuleAccessAuditTrial(true));
		moduleAccessList.add(setModuleAccessGeneralPrivileges(true, true));

		Role role = new Role();
		role.setModuleAccessList(moduleAccessList);
		role.setRoleName(RoleNames.COMPANY_ADMIN.getRoleNameDesc());
		role.setJobTitle(new ArrayList<String>(Arrays.asList(UserConstants.COMPANY_ADMINSTRATOR)));
		role.setCreatedBy(UserConstants.SYSTEM);
		role.setCreatedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
		role.setGroupId(RoleNames.COMPANY_ADMIN.getGroupId());

		return role;
	}

	public Role setRoleAgent() {

		List<ModuleAccess> moduleAccessList = new ArrayList<>();
		moduleAccessList.add(setModuleAccessUserConfiguration(true, true, true, true));
		moduleAccessList.add(setModuleAccessRoleAndPrivileges(false, false));
		moduleAccessList.add(setModuleAccessSystemSettings(false, false));
		moduleAccessList.add(setModuleAccessReportsDashboard(false));
		moduleAccessList.add(setModuleAccessAuditTrial(false));
		moduleAccessList.add(setModuleAccessGeneralPrivileges(false, false));

		Role role = new Role();
		role.setModuleAccessList(moduleAccessList);
		role.setRoleName(RoleNames.AGENT.getRoleNameDesc());
		role.setJobTitle(new ArrayList<String>(Arrays.asList("jobTitle2")));
		role.setCreatedBy(UserConstants.SYSTEM);
		role.setCreatedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
		role.setGroupId(RoleNames.AGENT.getGroupId());

		return role;
	}

	public Role setRoleAnalyst() {

		List<ModuleAccess> moduleAccessList = new ArrayList<>();
		moduleAccessList.add(setModuleAccessUserConfiguration(true, true, true, true));
		moduleAccessList.add(setModuleAccessRoleAndPrivileges(false, false));
		moduleAccessList.add(setModuleAccessSystemSettings(false, false));
		moduleAccessList.add(setModuleAccessReportsDashboard(false));
		moduleAccessList.add(setModuleAccessAuditTrial(true));
		moduleAccessList.add(setModuleAccessGeneralPrivileges(false, false));

		Role role = new Role();
		role.setModuleAccessList(moduleAccessList);
		role.setRoleName(RoleNames.ANALYST.getRoleNameDesc());
		role.setJobTitle(new ArrayList<String>(Arrays.asList("jobTitle3")));
		role.setCreatedBy(UserConstants.SYSTEM);
		role.setCreatedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
		role.setGroupId(RoleNames.ANALYST.getGroupId());

		return role;
	}

	public Role setRoleManager() {

		List<ModuleAccess> moduleAccessList = new ArrayList<>();
		moduleAccessList.add(setModuleAccessUserConfiguration(true, true, true, true));
		moduleAccessList.add(setModuleAccessRoleAndPrivileges(false, false));
		moduleAccessList.add(setModuleAccessSystemSettings(false, false));
		moduleAccessList.add(setModuleAccessReportsDashboard(true));
		moduleAccessList.add(setModuleAccessAuditTrial(true));
		moduleAccessList.add(setModuleAccessGeneralPrivileges(false, false));

		Role role = new Role();
		role.setModuleAccessList(moduleAccessList);
		role.setRoleName(RoleNames.MANAGER.getRoleNameDesc());
		role.setJobTitle(new ArrayList<String>(Arrays.asList("jobTitle4")));
		role.setCreatedBy(UserConstants.SYSTEM);
		role.setCreatedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
		role.setGroupId(RoleNames.MANAGER.getGroupId());

		return role;
	}

	public Role setRoleFinance() {

		List<ModuleAccess> moduleAccessList = new ArrayList<>();
		moduleAccessList.add(setModuleAccessUserConfiguration(true, true, true, true));
		moduleAccessList.add(setModuleAccessRoleAndPrivileges(false, false));
		moduleAccessList.add(setModuleAccessSystemSettings(false, false));
		moduleAccessList.add(setModuleAccessReportsDashboard(true));
		moduleAccessList.add(setModuleAccessAuditTrial(true));
		moduleAccessList.add(setModuleAccessGeneralPrivileges(false, false));

		Role role = new Role();
		role.setModuleAccessList(moduleAccessList);
		role.setRoleName(RoleNames.FINANCE.getRoleNameDesc());
		role.setJobTitle(new ArrayList<String>(Arrays.asList("jobTitle5")));
		role.setCreatedBy(UserConstants.SYSTEM);
		role.setCreatedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
		role.setGroupId(RoleNames.FINANCE.getGroupId());

		return role;
	}

	public Role setRoleBasic() {

		List<ModuleAccess> moduleAccessList = new ArrayList<>();
		moduleAccessList.add(setModuleAccessUserConfiguration(true, false, false, false));
		moduleAccessList.add(setModuleAccessRoleAndPrivileges(false, false));
		moduleAccessList.add(setModuleAccessSystemSettings(false, false));
		moduleAccessList.add(setModuleAccessReportsDashboard(false));
		moduleAccessList.add(setModuleAccessAuditTrial(false));
		moduleAccessList.add(setModuleAccessGeneralPrivileges(false, false));

		Role role = new Role();
		role.setModuleAccessList(moduleAccessList);
		role.setRoleName(RoleNames.BASIC.getRoleNameDesc());
		role.setJobTitle(new ArrayList<String>(Arrays.asList("jobTitle1")));
		role.setCreatedBy(UserConstants.SYSTEM);
		role.setCreatedDate(ZonedDateTime.now(ZoneOffset.UTC).toString());
		role.setGroupId(RoleNames.BASIC.getGroupId());

		return role;
	}

}
