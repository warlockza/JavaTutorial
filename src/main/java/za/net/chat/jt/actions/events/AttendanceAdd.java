package za.net.chat.jt.actions.events;

import za.net.chat.jt.actions.base.BaseAction;

public class AttendanceAdd extends BaseAction {
	public String execute() {
		services.addPersonToEvent(personId, eventId);
		return redirect(String.format("Attendance.action?id=%d", eventId));
	}
	
	int eventId;
	public void setEventId(int value) {eventId = value;}

	int personId;
	public void setPersonId(int value) {personId = value;}
}
