package action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	public String addUser(){
		System.out.println("使用占位符的方式********");
		return "success";
	}
	
	
	
}
