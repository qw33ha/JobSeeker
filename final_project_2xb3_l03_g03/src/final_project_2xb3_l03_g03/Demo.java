import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Demo extends Sorting{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		ArrayList<Job> joblist = new ArrayList<Job>();
		DataProcess data = new DataProcess();
		//joblist is an arraylist of all jobs in dataset
		joblist = data.get_data();
		//code2string works as a dictionary where index is the region code of the content,
		//the max region code is less than 6300 in Canada
		String[] code2string = new String[6300];
		for(Job j : joblist) {
			code2string[j.get_region()] = j.get_regions();
		}
       //////////////////////////////////////////////////////
        //sort the arraylist of jobs(joblist) with respect to region name string(regions) alphabetically
		Job[] temp = joblist.toArray(new Job[joblist.size()]);
    	sortRegions(temp);
    	ArrayList<Job> sortedjoblist1 = new ArrayList<Job>(Arrays.asList(temp));
    	//sorted jobs are stored in sortedjoblist1


        //////////////////////////////////////////////////////
        //show the options of catagories, regions
        //get the user information
        //select the given region and catagory, and have a newarraylist
        /////////////////////////////////////////////////////
        //create a graph according to that
        //show the list of jobs(sorted by outlook)
        //allow the user have a close look at one job(outlook, relevant jobs)
    }
}