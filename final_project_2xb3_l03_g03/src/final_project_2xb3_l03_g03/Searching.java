import java.util.ArrayList;

public class Searching {

    private static int Location_Search(ArrayList<Job> jobs , String location){

		int l = 0, r = jobs.size() - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res = location.compareTo(jobs.get(m).get_regions()); 
  
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
	
	public static ArrayList<Job> LocationSearch(ArrayList<Job> jobs , String location){
		int mid = Location_Search(jobs, location);
		int low = mid;
		int hi = mid;
		while(hi < jobs.size()) {
			if(0!=location.compareTo(jobs.get(hi).get_regions())) {
                break;
			}
			hi++;
		}
		hi--;
		while(low >= 0) {
			if(0!=location.compareTo(jobs.get(low).get_regions())) {
                break;
			}
			low--;
		}
		low++;
		ArrayList<Job> res = new ArrayList<Job>();
		for(int i = low; i <= hi; i++) {
			res.add(jobs.get(i));
		}
		return res;
	}
	
	private static int noc_Search(ArrayList<Job> jobs , int noc){

		int l = 0, r = jobs.size() - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            int res;
            
            if (noc == jobs.get(m).get_noc(0)) {
            	res = 0;
            }
            else if (noc > jobs.get(m).get_noc(0)) {
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
	
	public static ArrayList<Job> NocSearch(ArrayList<Job> jobs , int noc){
		int mid = noc_Search(jobs, noc);
		int low = mid;
		int hi = mid;
		while(hi < jobs.size()) {
			if(noc != jobs.get(hi).get_noc(0)) {
                break;
			}
			hi++;
		}
		hi--;
		while(low >= 0) {
			if(noc != jobs.get(low).get_noc(0)) {
                break;
			}
			low--;
		}
		low++;
		ArrayList<Job> res = new ArrayList<Job>();
		for(int i = low; i <= hi; i++) {
			res.add(jobs.get(i));
		}
		return res;
	}
}