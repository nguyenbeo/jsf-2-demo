package com.kthsoft.jsf.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationManagedBean", eager = true)
@RequestScoped
public class NavigationManagedBean implements Serializable {
	private static final long serialVersionUID = 8031518878922071632L;
	
	@ManagedProperty(value = "#{param.page}")
	private String page;

	public String navigateToNavigation2() {
		return "navigation2";
	}
	
	public String navigateToRightPage() {
		if ("1".equals(page)) {
			return "navigation1";
		} else if ("2".equals(page)) {
			return "navigation2";
		} else {
			return "navigation";
		}
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
}
