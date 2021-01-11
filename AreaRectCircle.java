import java.util.Scanner;

public class AreaRectCircle
 {
	
	void Area(double x,double y){
		
		String area=String.format("%.3f", (x*y));
		System.out.println("Area of Rectange is "+area+" sq.units");
	}
	
	void Area(double x){
		
		double pi = 3.1415;
		String area= String.format("%.3f", (pi*x*x));
		System.out.println("Area of Circle is "+area+" sq.units");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double radius,length,breadth;
		
		System.out.println("Enter radius of circle :");
		radius =sc.nextDouble();
		AreaRectCircle circle = new AreaRectCircle();
		circle.Area(radius);
		
		System.out.println("Enter length and beadth of rectangle :");
		length = sc.nextDouble();
		breadth = sc.nextDouble();
		AreaRectCircle rectangle = new AreaRectCircle();
		rectangle.Area(length, breadth);
		
	
	}
	

}