//practical no. : 2

class circle
{
	private int x,y;
	private double r;
	
	circle()
	{
		System.out.println("Circle()");
		
	}
	circle(double r)
	{
		this.r=r;
		System.out.println("Circle(double r)");
	}
	circle(int x)
	{
		this.x=x;
		System.out.println("Circle(int x)");
	}
	circle(int x,int y, double r)
	{
		this.x=x;
		this.y=y;
		this.r=r;
		System.out.println("Circle(int x, int y, double r)");
	}
	circle(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Circle(int x, int y)");
	}
	
	public double area()
	{
		return Math.PI * r * r;
	}
}

class circle1
{
	public static void main(String [] args )
	{
			circle c=new circle(10.0);
			System.out.println("Area of Circle is :" +c.area());
			
			circle c1=new circle(20.0);
			System.out.println("Area of Circle is :" +c1.area());
	}
}