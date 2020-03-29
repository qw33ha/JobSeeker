package final_project_2xb3_l03_g03;

import java.util.ArrayList;

public class Searching {

    public static int Location_Search(Job[] jobs , String location){

		int l = 0, r = jobs.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = location.compareTo(jobs[m].get_location()); 
  
            // Check if x is present at mid 
            if (res == 0) 
                return m; 
  
            // If x greater, ignore left half 
            if (res > 0) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        return -1; 
	}
	
	public static int[] Location_Range(Job[] jobs , String location, int mid){
		int low = mid;
		int hi = mid;
		while(hi < jobs.length) {
			if(0!=location.compareTo(jobs[hi].get_location())) {
                break;
			}
			hi++;
		}
		hi--;
		while(low >= 0) {
			if(0!=location.compareTo(jobs[low].get_location())) {
                break;
			}
			low--;
		}
		low++;
		int[] a = new int[] {low, hi};
		return a;
	}
	
	public static ArrayList<Job> LocationSearch(
			ArrayList<Job> jobs , String location){
		ArrayList<Job> new_jobs = new ArrayList<Job>();
		Job[] temp = jobs.toArray(new Job[jobs.size()]);
		int mid = Location_Search(temp, location);
		if(mid == -1) {
			System.out.println("no job found for given location");
			return new_jobs;
		}
		int [] a = Location_Range(temp, location, mid);
		int low = a[0];
		int hi = a[1];
		while (low <= hi) {
			temp[low].printInfo();
			new_jobs.add(temp[low]);
			low++;
		}
		return new_jobs;
	}
	
	public static int noc_Search(Job[] jobs , int noc){

		int l = 0, r = jobs.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res;
            
            if (noc == jobs[m].get_noc(0)) {
            	res = 0;
            }
            else if (noc > jobs[m].get_noc(0)) {
            	res = 1;
            }
            else {
            	res = -1;
            }
  
            // Check if x is present at mid 
            if (res == 0) 
                return m; 
  
            // If x greater, ignore left half 
            if (res > 0) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        return -1; 
	}
	
	public static int[] noc_Range(Job[] jobs , int noc, int mid){
		int low = mid;
		int hi = mid;
		while(hi < jobs.length) {
			if(noc != jobs[hi].get_noc(0)) {
                break;
			}
			hi++;
		}
		hi--;
		while(low >= 0) {
			if(noc != jobs[low].get_noc(0)) {
                break;
			}
			low--;
		}
		low++;
		int[] a = new int[] {low, hi};
		return a;
	}
	
	public static ArrayList<Job> NocSearch(
			ArrayList<Job> jobs , int noc){
		ArrayList<Job> new_jobs = new ArrayList<Job>();
		Job[] temp = jobs.toArray(new Job[jobs.size()]);
		int mid = noc_Search(temp, noc);
		if(mid == -1) {
			System.out.println("no job found for given noc");
			return new_jobs;
		}
		int [] a = noc_Range(temp, noc, mid);
		int low = a[0];
		int hi = a[1];
		while (low <= hi) {
			temp[low].printInfo();
			new_jobs.add(temp[low]);
			low++;
		}
		return new_jobs;
	}

}
