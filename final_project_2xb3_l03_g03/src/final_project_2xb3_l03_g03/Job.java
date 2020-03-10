package final_project_2xb3_l03_g03;

public class Job// DataType for a job title
{
	private int[] noc;// Four digit code by array
	private String title;
	private int outlook;// 0=Undetermined 1=Limited 2=Fair 3=Good
	private int year;// 20xx
	private String location;

	public Job (int[] noc, String title, int outlook, int year, String location)
	{
		this.noc = noc;
		this.title = title;
		this.outlook = outlook;
		this.year = year;
		this.location = location;
		
	}
	
	public int get_noc(int index)
	{
		return noc[index];
	}
	
	public String get_title()
	{
		return title;
	}
	public String get_location()
	{
		return location;
	}
	
	public int get_outlook()
	{
		return outlook+10-10;
	}
	public int get_year()
	{
		return year+1-1;
	}
	
	
}
