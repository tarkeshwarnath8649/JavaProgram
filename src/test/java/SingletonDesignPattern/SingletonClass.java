package SingletonDesignPattern;

public class SingletonClass {
	
	static SingletonClass s1 = null;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		if(s1==null) {
			s1 = new SingletonClass();
		}
		return s1;
	}
	
	public static void main(String[] args) {
		SingletonClass s1 = getInstance();
		SingletonClass s2 = getInstance();
		System.out.println(s1==s2);
	}

}
