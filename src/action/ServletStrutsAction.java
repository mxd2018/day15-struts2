package action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ServletStrutsAction extends ActionSupport{
	/*
	 * ע�⣺���ﲻ��Ҫ�ṩset/get��������Ȼ����ͨ��get����ȥȡֵ
	 * 	   �����Map�������Ϊ���Լ����������������
	 */
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	
	
	@Override
	//ʹ��Servlet�ṩ��API
	public String execute() throws Exception {
		//�÷�ʽ���Ƽ�ʹ�ã���Ϊʹ�ô˷�ʽ���ַ���servlet�����
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		ServletContext application = ServletActionContext.getServletContext();
		
		request.setAttribute("req", "����request�����");
		session.setAttribute("sess", "����session�����");
		application.setAttribute("appl", "����application�������");
		
		return SUCCESS;
	}
	
	//ʹ��struts�ṩ��API
	public String MapStyle(){
		//����ϵķ�ʽ���Ƽ�ʹ��
		ActionContext context = ActionContext.getContext();
		//�������Ϊ����Դ��������
		request = (Map<String, Object>) context.get("request");
		session = context.getSession();
		application = context.getApplication();
		//��������з�ֵ��ǰ��ҳ�滹��һ��ͨ��...Scope������ȡ
		request.put("req", "����request�����Map��ʽ");
		session.put("sess", "����session�����Map��ʽ");
		application.put("appl", "����application�������Map��ʽ");
		
		return "success";
	}
	
}
