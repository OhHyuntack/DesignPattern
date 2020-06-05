package SingletonPattern;

import SingletonPattern.singleton.SingleObj;

public class Client {

	public static void main(String[] args) {
		for( int i = 0; i < 5; i++) {
			SingleObj obj = SingleObj.getInstance();
			System.out.println(obj.toString());
		}
	}

}
