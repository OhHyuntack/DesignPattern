package ObserverPattern.room;

import ObserverPattern.observer.Observer;

public class ChatRoom extends Observer{
	public ChatRoom(String roomName) {
		this.roomName = roomName;
	}

}
