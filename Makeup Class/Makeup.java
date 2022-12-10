import java.lang.*;

public class Makeup
{
	private String makeupDay;
	private int duration;
	
	public Makeup()
	{
		System.out.println("Empty");
	}
	public Makeup(String makeupDay, int duration)
	{
		System.out.println("Parameterized");
		this.makeupDay=makeupDay;
		this.duration=duration;
	}
	
	public void setMakeupDay(String makeupDay)
	{
		this.makeupDay = makeupDay;
	}
	public String getMakeupDay()
	{
		return makeupDay;
	}
	
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
	public int getDuration()
	{
		return duration;
	}
	
	public void details()
	{
		System.out.println("Makeup day:"+makeupDay);
		System.out.println("Makeup duration:"+duration+" hours");
	}
	
}