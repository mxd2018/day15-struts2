package action;

import com.opensymphony.xwork2.ActionSupport;

public class ExceptionAction extends ActionSupport{
	public String execute() throws Exception{
		
		System.out.println(1/0);
		
		//throw new Exception("手动抛出一个异常");
		return SUCCESS;
	}
}
