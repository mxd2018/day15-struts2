package action;

import com.opensymphony.xwork2.ActionSupport;

public class ErrorAction extends ActionSupport{
	public String execute(){
		//�������û��try/catch����Ĭ����Input��ͼ
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
		
		return SUCCESS;
	}
}
