package za.net.chat.jt.actions.people;

import za.net.chat.jt.actions.base.BaseAction;
import za.net.chat.jt.actions.data.*;
import java.util.List;

public class Listing extends BaseAction {

	public String execute() {
		people = services.getPeople();
		return "success";
	}
	
	List<Person> people;
	public List<Person> getPeople() { return people; }
}
