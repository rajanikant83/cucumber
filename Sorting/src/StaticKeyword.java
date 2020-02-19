
public class StaticKeyword {
	public static String  str = "Apple";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A();
		B();
		C();
	}
	
	public static void A(){
		str= "A Apple";
		System.out.println(str);
	}

	public static void B(){
		str= "B Apple";
		System.out.println(str);
	}
	
	public static void C(){
		str= " Apple";
		System.out.println(str);
	}
	
}
