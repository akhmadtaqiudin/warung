package com.tyan.mangkubumi.core.model;

public class User {

	private String userName;
	private String password;
	private String hakAkses;
	private String iconRule;
	private String nameRule;
	private String urlRole;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHakAkses() {
		return hakAkses;
	}
	public void setHakAkses(String hakAkses) {
		this.hakAkses = hakAkses;
	}
	public String getIconRule() {
		return iconRule;
	}
	public void setIconRule(String iconRule) {
		this.iconRule = iconRule;
	}
	public String getNameRule() {
		return nameRule;
	}
	public void setNameRule(String nameRule) {
		this.nameRule = nameRule;
	}
	public String getUrlRole() {
		return urlRole;
	}
	public void setUrlRole(String urlRole) {
		this.urlRole = urlRole;
	}
}
