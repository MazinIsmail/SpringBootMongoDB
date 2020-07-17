package com.mongodb.learnings.model;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Roles")
public class Role {

	@Id
	private String roleId;

	@NotEmpty
	private String roleName;

	private List<String> jobTitle;

	@NotEmpty
	private List<ModuleAccess> moduleAccessList;

	@CreatedBy
	private String createdBy;

	@CreatedDate
	private String createdDate;

	@LastModifiedBy
	private String modifiedBy;

	@LastModifiedDate
	private String modifiedDate;

	private String groupId;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<String> getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(List<String> jobTitle) {
		this.jobTitle = jobTitle;
	}

	public List<ModuleAccess> getModuleAccessList() {
		return moduleAccessList;
	}

	public void setModuleAccessList(List<ModuleAccess> moduleAccessList) {
		this.moduleAccessList = moduleAccessList;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", jobTitle=" + jobTitle + ", moduleAccessList="
				+ moduleAccessList + ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy="
				+ modifiedBy + ", modifiedDate=" + modifiedDate + ", groupId=" + groupId + "]";
	}

}