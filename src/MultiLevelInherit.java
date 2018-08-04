//MultiLevel inheritance
class P {  //Parent class
	P(){
		System.out.println("In class P");
	}
}
class Q extends P {  //Child of class P
	Q() {
		System.out.println("In class Q");
	}
}
class R extends Q {  //Child of class Q
	R() {
		System.out.println("In class R");
	}
}
public class MultiLevelInherit {
	
	public static void main(String[] args) {
		
		R r=new R(); //Demonstrating inheritance
	}
}

