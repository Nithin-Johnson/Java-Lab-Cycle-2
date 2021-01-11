public class Triangle2 {
	public static void main(String[] args) {
		Triangle obj= new Triangle();
	 }
	}
	class Triangle{
		Triangle()
		{
			int x=3,y=4,z=5;
			int s=(x+y+z)/2;
			double perimeter=x+y+z;
			double area= Math.sqrt(s*(s-x)*(s-y)*(s-z));
			System.out.println("Perimeter of triangle = "+perimeter);
			System.out.println("Area of triangle = "+area);
			
		}
	}