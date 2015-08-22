package za.net.chat.jt.actions.base;

import com.opensymphony.xwork2.ActionSupport;
import za.net.chat.jt.actions.services.Services;


public class BaseAction extends ActionSupport {
	// So that spring can inject the business singleton
	protected Services services;
	public void setServices(Services value) {
		System.out.println("Services set to :"+value);
        services=value;
	}
	
	// For redirect results
	protected String redirectUrl;
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public String redirect(String to) {
		redirectUrl = to;
		return "redirect";
	}
}
