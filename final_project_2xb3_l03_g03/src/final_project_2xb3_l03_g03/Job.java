package final_project_2xb3_l03_g03;

public class Job// DataType for a job title
{
	private int noc;
	private String title;
	private String outlook;// 0=Undetermined 1=Limited 2=Fair 3=Good
	private int potential;
	private int year;// 20xx
	private String location;
	private int region; // region code
	
	private static int convertOutlook(String s) {
		// 0=Undetermined 1=Limited 2=Fair 3=Good
		if (s.contentEquals("Good"))
			return 3;
		if (s.contentEquals("Fair"))
			return 2;
		if (s.contentEquals("Limited"))
			return 1;
		return 0;
	}
	
	public Job (int noc, String title, String outlook, int year, String location, int region)
	{
		this.noc = noc;
		this.title = title;
		this.potential = convertOutlook(outlook);
		this.outlook = outlook;
		this.year = year;
		this.location = location;
		this.region = region;
	}
	
	public int get_noc()
	{
		return this.noc;
	}
	
	public int get_nocDigit(int index) {
		int N = 0;
		int d = this.noc;
		while (d != 0) {
			d /= 10;
			N++;
		}
		int[] digits = new int[N-1];
		d = this.noc;
		int count = 0;
		int digit = 0;
		while (d != 0) {
			digit = d%10;
			d/=10;
			digits[N-1-count] = digit;
			count++;
		}
		return digits[index];
	}
	
	public String get_title()
	{
		return this.title;
	}
	
	public String get_location()
	{
		return this.location;
	}
	
	public int get_region()
	{
		return this.region;
	}
	
	public int get_potential() {
		return this.potential;
	}
	
	public String get_outlook()
	{
		return this.outlook;
	}
	
	public int get_year()
	{
		return this.year;
	}
	
	public void printInfo() 
	{
		System.out.println("Job title: " + this.get_title());
		System.out.println("Noc _ " + this.noc);
		System.out.println("Outlook: " + this.get_outlook());
		System.out.println("Province: " + this.get_location());
		System.out.println("Econ region code: " + this.get_region());

		System.out.println("Year " + this.get_year() + "\n");
		
	}
	
}//end
