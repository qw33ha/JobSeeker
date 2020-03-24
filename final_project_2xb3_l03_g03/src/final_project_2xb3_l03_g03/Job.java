package final_project_2xb3_l03_g03;

public class Job// DataType for a job title
{
	private int[] noc;// Four digit code by array
	private String title;
	private int outlook;// 0=Undetermined 1=Limited 2=Fair 3=Good
	private int year;// 20xx
	private String location;
	private int region;
	private String regions;
	
	public Job (int[] noc, String title, int outlook, int year, String location, int region, String regions)
	{
		this.noc = noc;
		this.title = title;
		this.outlook = outlook;
		this.year = year;
		this.location = location;
		this.region = region;
		this.regions = regions;
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
	public int get_region()
	{
		return region;
	}
	public int get_outlook()
	{
		return outlook+10-10;
	}
	public int get_year()
	{
		return year+1-1;
	}
	public String get_regions() {
		return regions;
	}
	
	public void printInfo() 
	{
		System.out.println("Job title: "+this.get_title());
		System.out.println("Noc _ "+this.get_noc(0)+" "+ this.get_noc(1)+" "+this.get_noc(2)+" "+this.get_noc(3));
		System.out.println("Outlook: "+this.get_outlook());
		System.out.println("Province: "+this.get_location());
		System.out.println("Econ region code: "+this.get_region());
		System.out.println("Econ region name: "+this.get_regions());

		System.out.println("Year "+this.get_year()+"\n");
		
	}
	
}//end