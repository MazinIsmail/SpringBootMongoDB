package com.mongodb.learnings.model;

public class ModuleAccessRights {

	private String name;

	private boolean enabled;

	public ModuleAccessRights(String name, boolean enabled) {
		super();
		this.name = name;
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "RolePrivileges [name=" + name + ", enabled=" + enabled + "]";
	}

}
