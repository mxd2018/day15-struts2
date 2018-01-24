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
	 * 注意：这里不需要提供set/get方法，不然它会通过get方法去取值
	 * 	   这里的Map可以理解为是自己创建这三大域对象
	 */
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	
	//实现接口的方式，获得API
	public String MapStyle(){
		
		//往域对象中放值，前端页面还是一样通过...Scope域来获取
		request.put("req", "这是request域对象Map方式");
		session.put("sess", "这是session域对象Map方式");
		application.put("appl", "这是application的域对象Map方式");
		
		return "success";
	}

	/**
	 * 这三个接口使用的是拦截器的原理，拦截了请求创建好了域对象，即arg0
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
