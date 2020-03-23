package final_project_2xb3_l03_g03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import final_project_2xb3_l03_g03.Sorting;
import final_project_2xb3_l03_g03.Comparable;

public class Demo extends Sorting{
	public static String[][] CSVReader(String filepath) {

	     String csvFile = filepath;
	     BufferedReader br = null;
	     String line = "";
	     int N;
	     if (csvFile.contentEquals("2016a"))
	    	 N = 45241;
	     if (csvFile.contentEquals("2016b"))
	    	 N = 43501;
	     if (csvFile.contentEquals("2017") | csvFile.contentEquals("2018") | csvFile.contentEquals("2019"))
	    	 N = 42501;
	     
	     String[][] dataset = new String[N][11];
	     int row = 0;  		
	     
	     try {

	         br = new BufferedReader(new FileReader(csvFile));
	         while ((line = br.readLine()) != null) {
	         	
	         	String temp = line;
	         	dataset[row] = temp.split(",");
	         	row++;
	         }

	     } catch (FileNotFoundException e) {
	         e.printStackTrace();
	     } catch (IOException e) {
	         e.printStackTrace();
	     } finally {
	         if (br != null) {
	             try {
	                 br.close();
	             } catch (IOException e) {
	                 e.printStackTrace();
	             }
	         }
	     }
	     
	     return dataset;
	 }
    
	private static int convertNOC(String noc) {
		int len = noc.length();
		String s = noc.substring(3, len);
		return Integer.parseInt(s);
	}

	
	public static void main(String[] args){
        //read from the csv files, get an arraylist of jobs --- Senni Tan
    	ArrayList<Job> jobs = new ArrayList<Job>();
    	String[][] dataset2016a = CSVReader("2016a");
    	String[][] dataset2016b = CSVReader("2016b");
    	String[][] dataset2017 = CSVReader("2017");
    	String[][] dataset2018 = CSVReader("2018");
    	String[][] dataset2019 = CSVReader("2019");
    	
    	for(int i=1;i<dataset2016a.length;i++) {
    		int noc = convertNOC(dataset2016a[i][0].toString());
    		String title = dataset2016a[i][1].toString();
    		String outlook = dataset2016a[i][3].toString();
    		int year = 2016;
    		String location = dataset2016a[i][10].toString();
    		int region = Integer.parseInt(dataset2016a[i][9].toString());
			Job element = new Job(noc, title, outlook, year, location, region);
			jobs.add(element);
		}
    	
    	for(int i=1;i<dataset2016b.length;i++) {
    		int noc = convertNOC(dataset2016a[i][0].toString());
    		String title = dataset2016a[i][1].toString();
    		String outlook = dataset2016a[i][2].toString();
    		int year = 2016;
    		String location = dataset2016a[i][7].toString();
    		int region = Integer.parseInt(dataset2016a[i][6].toString());
			Job element = new Job(noc, title, outlook, year, location, region);
			jobs.add(element);
		}
    	
    	for(int i=1;i<dataset2017.length;i++) {
    		int noc = convertNOC(dataset2016a[i][0].toString());
    		String title = dataset2016a[i][1].toString();
    		String outlook = dataset2016a[i][2].toString();
    		int year = 2017;
    		String location = dataset2016a[i][7].toString();
    		int region = Integer.parseInt(dataset2016a[i][6].toString());
			Job element = new Job(noc, title, outlook, year, location, region);
			jobs.add(element);
		}
    	
    	for(int i=1;i<dataset2018.length;i++) {
    		int noc = convertNOC(dataset2016a[i][0].toString());
    		String title = dataset2016a[i][1].toString();
    		String outlook = dataset2016a[i][2].toString();
    		int year = 2018;
    		String location = dataset2016a[i][7].toString();
    		int region = Integer.parseInt(dataset2016a[i][6].toString());
			Job element = new Job(noc, title, outlook, year, location, region);
			jobs.add(element);
		}
    	
    	for(int i=1;i<dataset2019.length;i++) {
    		int noc = convertNOC(dataset2016a[i][0].toString());
    		String title = dataset2016a[i][1].toString();
    		String outlook = dataset2016a[i][2].toString();
    		int year = 2019;
    		String location = dataset2016a[i][7].toString();
    		int region = Integer.parseInt(dataset2016a[i][6].toString());
			Job element = new Job(noc, title, outlook, year, location, region);
			jobs.add(element);
		}
    	
        //also get an arraylist of regions --- Senni Tan
    	ArrayList<Integer> regions = new ArrayList<Integer>();
    	ArrayList<String> locations = new ArrayList<String>();
    	int len = jobs.size();
    	for (int i = 0; i < len; i++) {
    		Job job = jobs.get(i);
    		int region = job.get_region();
    		String location = job.get_location();
    		regions.add(region);
    		locations.add(location);
    	}
        //////////////////////////////////////////////////////
        //sort the arraylist of region, and the regions alphabetically --- Senni Tan
    	ArrayList<Job> jobsInString = new ArrayList<Job>();
    	ArrayList<Job> jobsInOutlook = new ArrayList<Job>();
    	ArrayList<String> locationInString = new ArrayList<String>();
    	Job[] tmp = new Job[jobs.size()];
    	String[] Locations = new String[jobs.size()];
    	for (int i = 0; i < len; i++) {
    		Job job = jobs.get(i);
    		String location = locations.get(i);
    		tmp[i] = job;
    		Locations[i] = location;
    	}
    	sortString(tmp);
    	for (int i = 0; i < len; i++)
    		jobsInString.add(tmp[i]);
    	sortOutlook(tmp);
    	for (int i = 0; i < len; i++)
    		jobsInOutlook.add(tmp[i]);
    	sortLocation(Locations);
    	for (int i = 0; i < len; i++)
    		locationInString.add(Locations[i]);
    			
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