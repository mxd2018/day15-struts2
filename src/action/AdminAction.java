package action;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {
	private String username;
	private String flag;

	public String isAdmin(){
		if("admin".equals(username)){
			flag="admin";
			
		}else{
			flag="user";
			
		}
		return "success";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	
}
