import java.util.*;

public class Main
{
	public static void main(String[] args)
	{ Scanner scan=new Scanner(System.in);
	String a=scan.next();
	String b=scan.next();
	
	int sum=a.length()+b.length();
	System.out.println(sum);
	   
	if(a.compareTo(b)>0){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
	
	//changing string to char arrray
		char[]array=a.toCharArray();
		//changing into capital letter at index 0
		array[0]=Character.toUpperCase(array[0]);
		//storing that array in new string array
		String firstStringFirstLttrCaps=new String(array);
		//same operations for second word
		char[]array2=b.toCharArray();
		array2[0]=Character.toUpperCase(array2[0]);
		String secondStringCaps=new String(array2);
		
		
		System.out.println(firstStringFirstLttrCaps);
		System.out.println(secondStringCaps);
	}
}
