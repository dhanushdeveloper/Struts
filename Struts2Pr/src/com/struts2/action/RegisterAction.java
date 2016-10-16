package com.struts2.action;



import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class RegisterAction {
private String Name;
private List<String> countries;
public List<String> getCountries() {
	return countries;
}
public void setCountries(List<String> countries) {
	this.countries = countries;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
private String pwd;
	public String execute() {
		String result = null;
		// TODO Auto-generated method stub
		System.out.println("hi welcome to struts2"+ "\t"  +this.Name+ "\t" + this.pwd);
		if (Name.equals("DHANUSH")){
			result = "user is successfully authenicated, redirecting to home page..........";
		}
		ValueStack stack = ActionContext.getContext().getValueStack();
		stack.set("response", result);
		List<String> countries = new ArrayList<>();
		countries.add("india");
		countries.add("USA");
		countries.add("Bangladesh");
		countries.add("Australia");
		countries.add("England");
		countries.add("London");
		setCountries(countries);
return "success";
	}

}
