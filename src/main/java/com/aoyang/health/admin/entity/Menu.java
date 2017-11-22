package com.aoyang.health.admin.entity;

import java.util.List;

public class Menu extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String name;

	private String parentId;

	private Integer order;

	private String url;

	private Boolean deleted;

	private List<Menu> subMenuList;

	private Menu parentMenu;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParantId() {
		return parentId;
	}

	public void setParantId(String parantId) {
		this.parentId = parantId;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public List<Menu> getSubMenuList() {
		return subMenuList;
	}

	public void setSubMenuList(List<Menu> subMenuList) {
		this.subMenuList = subMenuList;
	}

	public Menu getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(Menu parentMenu) {
		this.parentMenu = parentMenu;
	}

}
