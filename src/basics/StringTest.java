package basics;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Hello";
		String b="Hello";
		
		a.concat("asserserf");
		
		System.out.println(a);
		
		
		//StrictMath math="81";
		StringBuffer bf=new StringBuffer("mathatatical");
		System.out.println(bf.charAt(5)); 
		
		bf.append("newstring");
		System.out.println(bf);
	}

}
