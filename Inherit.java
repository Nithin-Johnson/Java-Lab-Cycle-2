
public class Inherit {
public static void main(String[] args) {
	//Calling method of parent class by object of parent class
	parentclass obj=new parentclass();
	obj.showparent();
	//Calling method of child class by object of child class
	childclass obj1=new childclass();
	obj1.showchild();
	//Calling method of parent class by object of child class
	obj1.showparent();
 }
}
class parentclass
{
	void showparent()
	{
		System.out.println("This is parent class");
	}
}
class childclass extends parentclass{
	void showchild()
	{
		System.out.println("This is child class");
	}
}