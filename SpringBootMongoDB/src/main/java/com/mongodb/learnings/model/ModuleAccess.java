package com.mongodb.learnings.model;

import java.util.List;

import javax.validation.constraints.NotEmpty;

public class ModuleAccess {
	
	@NotEmpty
	private String moduleName;
	
	@NotEmpty
	private List<ModuleAccessRights> moduleAccessRights;
	
	public ModuleAccess() {
		super();
	}

	public ModuleAccess(@NotEmpty String moduleName, @NotEmpty List<ModuleAccessRights> moduleAccessRights) {
		super();
		this.moduleName = moduleName;
		this.moduleAccessRights = moduleAccessRights;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public List<ModuleAccessRights> getModuleAccessRights() {
		return moduleAccessRights;
	}

	public void setModuleAccessRights(List<ModuleAccessRights> moduleAccessRights) {
		this.moduleAccessRights = moduleAccessRights;
	}

	@Override
	public String toString() {
		return "ModuleAccess [moduleName=" + moduleName + ", moduleAccessRights=" + moduleAccessRights
				+ "]";
	}
	
}
