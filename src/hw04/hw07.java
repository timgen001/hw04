package hw04;

public class hw07
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		System.out.println(car1);
	}
}
/*class Car
{
	protected int num;
	protected double gas;
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num +"汽油量為" + gas + "的車子");
	}
	public  void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num +"汽油量為" + gas + "的車子");
	}
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
	public String toString()
	{
		String str = "車號" + num +"汽油量" + gas;
		return str;
	}
}
class RacingCar extends Car
{
	private int course;
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public RacingCar(int n,double g, int c)
	{
		super(n,g);
		course = c;
		System.out.println("將賽車編號設為" + course );
	}
	public  void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為" + course );
	}
	public void show()
	{
		System.out.println("賽車車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("將賽車編號設為" + course );
	}
}