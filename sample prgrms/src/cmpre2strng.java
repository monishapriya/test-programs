
public class cmpre2strng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="moni";
		String s11="moni";
		String s111="MONI";
		String s2="meena";
		String s3=new String("memo");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s11));
		System.out.println(s11.equalsIgnoreCase(s111));
		System.out.println(s1.compareTo(s2));
		
		

	}

}
