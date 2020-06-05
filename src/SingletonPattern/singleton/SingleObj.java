package SingletonPattern.singleton;

public class SingleObj {
	private static SingleObj singleObj = null;
	
	//외부에서 직접 생성하지 못하도록 private 선언
	private SingleObj(){}
	
	//오직 1개의 객체만 생성
	public static SingleObj getInstance(){
		if( singleObj  == null ) {
			singleObj  = new SingleObj();
		}
		
		return singleObj;
	}
}
