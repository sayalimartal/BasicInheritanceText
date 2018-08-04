//Parent class
class Top1{
	void disp1() {
		System.out.println("Inside top class");
	}
}

//Child class
class Bottom1 extends Top1{
	void disp1() {
		System.out.println("Inside bottom 1 class");
	}
}

//Child class
class Bottom2 extends Top1{
	void disp1() {
		System.out.println("Inside bottom 2 class");
	}
}

//Child class
class Bottom3 extends Top1{
	void disp1() {
		System.out.println("Inside bottom 3 class");
	}
}

//Test class demonstrating method overriding
public class TopBottomTest {
	public static void main(String[] args) {
		
		Bottom1 bottom1=new Bottom1();
		bottom1.disp1();
		
		Bottom2 bottom2=new Bottom2();
		bottom2.disp1();
		
		Bottom3 bottom3=new Bottom3();
		bottom3.disp1();
	}
}
