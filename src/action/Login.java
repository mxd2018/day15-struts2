package action;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
	private String username;
	
	public String login(){
		if("admin".equals(username)){
			return SUCCESS;
		}else{
			return "outer";
		}		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
