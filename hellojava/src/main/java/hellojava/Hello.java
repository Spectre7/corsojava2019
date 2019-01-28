package hellojava;

public class Hello{
	public static void main(String[] args){
		String a = new String("la mia stringa");	
		
		
		for(int i=a.length()-1;i>=0;i--){
			System.out.print(a.charAt(i));
		}	
	}
}
