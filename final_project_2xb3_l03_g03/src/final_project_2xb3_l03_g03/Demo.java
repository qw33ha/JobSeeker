import java.io.*;
import java.security.InvalidParameterException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Demo extends Sorting{
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException{
		ArrayList<Job> joblist = new ArrayList<Job>();
		DataProcess data = new DataProcess();
		//joblist is an arraylist of all jobs in dataset
		joblist = data.get_data();
		int SIZE = joblist.size();
       //////////////////////////////////////////////////////
        //sort the arraylist of jobs(joblist) with respect to region name string(regions) alphabetically
		Job[] temp = joblist.toArray(new Job[joblist.size()]);
    	sortRegionS(temp);
    	ArrayList<Job> sortedjoblist = new ArrayList<Job>(Arrays.asList(temp));
    	//sorted jobs are stored in sortedjoblist
		//code2string works as a dictionary where index is the region code of the content,
		//the max region code is less than 6300 in Canada
		String[] code2string = new String[6300];
		for(Job j : sortedjoblist) {
			code2string[j.get_region()] = j.get_regions();
		}
		////////////////////////////////
		//demonstrate the regions we have and let the user pick one
		int userlocation = 0;
		int usercategory = -1;
		while(true) {
			System.out.println("Please choose from these regions and enter the four digit code of the region you are interested in:");
			for(int i = 0; i < SIZE - 1; i++) {
				if(!sortedjoblist.get(i).get_regions().equals(sortedjoblist.get(i+1).get_regions()) && sortedjoblist.get(i).get_region() != sortedjoblist.get(i+1).get_region()) {
					System.out.println(sortedjoblist.get(i).get_regions() + "    : " + sortedjoblist.get(i).get_region());					
				}
			}
			if(sortedjoblist.get(SIZE-1).get_region() != sortedjoblist.get(SIZE-2).get_region())
				System.out.println(sortedjoblist.get(SIZE-1).get_regions() + "    : " + sortedjoblist.get(SIZE-1).get_region());
			//now take user input
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			try {
				int input1 = Integer.parseInt(input);
				if(input1 < 6300 && input1 >= 0 && code2string[input1] != null) {
					userlocation = input1;
					break;
				}
			}
			catch(NumberFormatException e) {}
			System.out.println("Please enter the correct code");
			TimeUnit.SECONDS.sleep(1);
		}
        //////////////////////////////////////////////////////
		//now let the user choose category
		for(int i = 0; i < NOC.Noc.length; i++)
			System.out.println(i + ": " + NOC.Noc[i]);
		while(true) {
			System.out.println("\nPlease enter the index of the categories you are interested here: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			try {
				int input1 = Integer.parseInt(input);
				if(input1 >= 0 && input1 <= 9) {
					usercategory = input1;
					break;
				}
			}
			catch(NumberFormatException e) {}
			System.out.println("Please enter the correct index");
		}
		System.out.println(userlocation + ", " + usercategory);
        //get the user information
        //select the given region and category, and have a new arraylist
        /////////////////////////////////////////////////////
        //create a graph according to that
        //show the list of jobs(sorted by outlook)
        //allow the user have a close look at one job(outlook, relevant jobs)
    }
}