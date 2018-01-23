package action;

import com.opensymphony.xwork2.ActionSupport;

public class ErrorAction extends ActionSupport{
	public String execute(){
		//这里如果没有try/catch不会默认走Input视图
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
		
		return SUCCESS;
	}
}
