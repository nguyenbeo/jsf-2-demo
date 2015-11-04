package com.kthsoft.jsf.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DemoManagedBean implements Serializable {
	private static final long serialVersionUID = 8185771831360665660L;
	
	private String name = "DEFAUT";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getWelcome() {
		return "Welcome to " + name + " (from AJAX)";
	}
	
}
