package final_project_2xb3_l03_g03;

import java.util.ArrayList;

public class Searching {

    public static ArrayList<Job> field_search(ArrayList<Job> dataset, int field){
		ArrayList<Job> new_dataset = new ArrayList<Job>();
		for(int i = 0; i < dataset.size(); i++) {
			Job currentjob = dataset.get(i);
			if(currentjob.get_noc(0) == field)
				new_dataset.add(currentjob);
		}
		return new_dataset;
	}

    public static ArrayList<Job> region_search(ArrayList<Job> dataset, int region){
		ArrayList<Job> new_dataset = new ArrayList<Job>();
		for(int i = 0; i < dataset.size(); i++) {
			Job currentjob = dataset.get(i);
			if(currentjob.get_region() == region)
				new_dataset.add(currentjob);
		}
		if (new_dataset.size() == 0) {
			System.out.println("no job found for the given region");
			return null;
		}
		else {
			for (int i = 0; i < new_dataset.size(); i++) {
				new_dataset.get(i).printInfo();
				System.out.println();
			}
		}	
		return new_dataset;
	}

    public static ArrayList<Job> noc_search(ArrayList<Job> dataset, int[] noc){
		ArrayList<Job> new_dataset = new ArrayList<Job>();
		for(int i = 0; i < dataset.size(); i++) {
			Job currentjob = dataset.get(i);
			if(currentjob.get_noc(0) == noc[0] & 
					currentjob.get_noc(1) == noc[1]& 
					currentjob.get_noc(2) == noc[2]& 
					currentjob.get_noc(3) == noc[3])
				new_dataset.add(currentjob);
		}
		if (new_dataset.size() == 0) {
			System.out.println("no job found for the given location");
			return null;
		}
		else {
			for (int i = 0; i < new_dataset.size(); i++) {
				new_dataset.get(i).printInfo();
				System.out.println();
			}
		}	
		return new_dataset;
	}

}
