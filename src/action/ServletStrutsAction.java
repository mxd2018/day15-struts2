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
	 * 注意：这里不需要提供set/get方法，不然它会通过get方法去取值
	 * 	   这里的Map可以理解为是自己创建这三大域对象
	 */
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	
	
	@Override
	//使用Servlet提供的API
	public String execute() throws Exception {
		//该方式不推荐使用，因为使用此方式就又返回servlet编程了
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		ServletContext application = ServletActionContext.getServletContext();
		
		request.setAttribute("req", "这是request域对象");
		session.setAttribute("sess", "这是session域对象");
		application.setAttribute("appl", "这是application的域对象");
		
		return SUCCESS;
	}
	
	//使用struts提供的API
	public String MapStyle(){
		//松耦合的方式，推荐使用
		ActionContext context = ActionContext.getContext();
		//可以理解为获得自创的域对象
		request = (Map<String, Object>) context.get("request");
		session = context.getSession();
		application = context.getApplication();
		//往域对象中放值，前端页面还是一样通过...Scope域来获取
		request.put("req", "这是request域对象Map方式");
		session.put("sess", "这是session域对象Map方式");
		application.put("appl", "这是application的域对象Map方式");
		
		return "success";
	}
	
}
