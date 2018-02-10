import java.util.*;


public class alidator2{

	public static void main(String []args){

	String lol="";
	String regex="^(?:(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])).{8,120}$";
	System.out.println("input");
	Scanner teemo=new Scanner(System.in);
	lol=teemo.nextLine();
	
	if(lol.equals("password")){
	System.out.println("password can not be password");
	}

	else if(lol.length()<8){
	System.out.println("too short");
}		
	else if(lol.matches(regex)){
	System.out.println("passed");
	}else{
	System.out.println("too weak");

	}

}}