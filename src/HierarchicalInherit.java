//Hierarchical inheritance
class M {  //Parent class
	M(){
		System.out.println("In class M");
	}
}
class N extends M {  //Child of class M
	N() {
		System.out.println("In class N");
	}
}
class O extends M {  //Child of class M
	O() {
		System.out.println("In class O");
	}
}
public class HierarchicalInherit {
	
	public static void main(String[] args) {
		
		N n=new N(); //Demonstrating inheritance
		O o=new O();
	}
}
