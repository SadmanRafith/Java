import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Makeup m1 = new Makeup("Sunday", 2);
		m1.details();
		m1.setMakeupDay("Monday");
		m1.details();
		
		Makeup m2 = new Makeup();
		m2.setMakeupDay("Tuesday");
		m2.setDuration(1);
		System.out.println("Day: "+m2.getMakeupDay());
		System.out.println("Duration: "+m2.getDuration());
		
	}
}