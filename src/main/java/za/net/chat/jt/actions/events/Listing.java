package za.net.chat.jt.actions.events;

import za.net.chat.jt.actions.base.BaseAction;
import za.net.chat.jt.actions.data.*;
import java.util.List;

public class Listing extends BaseAction {
	
	public String execute() {
		events = services.getEvents();
		return "success";
	}
	
	List<Event> events;
	public List<Event> getEvents() { return events; }
}
