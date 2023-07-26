package basics;

public class childclass extends ParentClass {
	
	public childclass() {
		super();
		System.out.println("testing constructor from childclass");
	}
	
	public void classchild() {
		
		System.out.println("testing superfrom childclass");
	}
	
	
	public void cclass1() {
		
		
		String gerlt="hello world";
		
		String value ="This is from Child CLass value"; 
		
		System.out.println(gerlt);
		System.out.println(super.value);
		System.out.println(super.value1);
		System.out.println(value);
		super.classchild();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		childclass nmeth=new childclass();
		nmeth.cclass1();
		
		
	}

}
