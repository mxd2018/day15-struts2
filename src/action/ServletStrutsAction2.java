package action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ServletStrutsAction2 extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{
	/*
	 * ע�⣺���ﲻ��Ҫ�ṩset/get��������Ȼ����ͨ��get����ȥȡֵ
	 * 	   �����Map�������Ϊ���Լ����������������
	 */
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	
	//ʵ�ֽӿڵķ�ʽ�����API
	public String MapStyle(){
		
		//��������з�ֵ��ǰ��ҳ�滹��һ��ͨ��...Scope������ȡ
		request.put("req", "����request�����Map��ʽ");
		session.put("sess", "����session�����Map��ʽ");
		application.put("appl", "����application�������Map��ʽ");
		
		return "success";
	}

	/**
	 * �������ӿ�ʹ�õ�����������ԭ�����������󴴽���������󣬼�arg0
	 */
	@Override
	public void setApplication(Map<String, Object> arg0) {
		this.application=arg0;
		
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
		
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request=arg0;
		
	}
	
}
