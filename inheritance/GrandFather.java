package inheritance;
//father class cannot aces the "additional" properties of child class
//by convention only one public class cann be made in one file and has to be same name as  the file
public class GrandFather {

	public GrandFather() {
		
		//System.out.println("made changes for git command ");
		System.out.println("made changes for git command ");
		System.out.println("grandfather ");
	}
	
}

class Father extends GrandFather{
	
	public Father() {
		System.out.println("father ");
	}
}
class Son extends Father{
	
	public Son() {
		System.out.println("son ");
	}
	public static void main(String arg[]) {
		GrandFather gf=new GrandFather();
		Father f=new Father();
		Son s=new Son();//when son is called, internally firstly super() is called
	}
}
//constructors have a return type of their class
//Person p=new Person() ........(1)
//int k=p.display(); say display is a method with int retun type
// just like display, in (1) p variable of type Person stores the returned object \
//IMPLICIT RETURN TYPE OF CONSTRUCTORS IS THER CLASS NAME
