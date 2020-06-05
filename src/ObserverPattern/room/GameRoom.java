package ObserverPattern.room;

import ObserverPattern.observer.Observer;

public class GameRoom extends Observer{
	public GameRoom(String roomName) {
		this.roomName = roomName;
	}

}
