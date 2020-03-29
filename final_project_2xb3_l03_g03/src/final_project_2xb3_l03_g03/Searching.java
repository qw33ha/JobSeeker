package final_project_2xb3_l03_g03;

import java.util.ArrayList;

public class Searching {

    public static int Location_Search(Job[] jobs , String location){

        int left = 0;
        int right = jobs.length - 1;

        while(left <= right ) {
            int mid = (left + (right - left) / 2);
            int res = location.compareTo(jobs[mid].get_location());
            if( res == 0 ) {
                while(mid >= 0) {
                    if(0!=location.compareTo(jobs[mid].get_location())) {
                        break;
                    }
                    mid--;
                }
                if(mid <= -1 ) {
                    return 0;
                }
                return mid + 1;//plus 1 because the while loop did 1 more subtraction.
            }else if( res < 0 ) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return -1;
	}
	
	public static ArrayList<Job> LocationSearch(
			ArrayList<Job> jobs , String location){
		ArrayList<Job> new_jobs = new ArrayList<Job>();
		Job[] temp = jobs.toArray(new Job[jobs.size()]);
		int index = Location_Search(temp, location);
		if(index == -1) {
			System.out.println("no job found for given location");
			return new_jobs;
		}
		for (; index < jobs.size(); index++) {
			if (temp[index].get_location() != location) {
				return new_jobs;
			}
			else {
				new_jobs.add(temp[index]);
				temp[index].printInfo();
				System.out.println();
			}
		}
		return new_jobs;
	}
	
	public static int noc_Search(Job[] jobs , int noc){
		int left = 0;
        int right = jobs.length - 1;

        while(left <= right ) {
            int mid = (left + (right - left) / 2);
            int res;
            if (noc == jobs[mid].get_noc(0)) {
            	res = 0;
            }
            else if (noc > jobs[mid].get_noc(0)) {
            	res = 1;
            }
            else {
            	res = -1;
            }
            if( res == 0 ) {
                while(mid >= 0) {
                    if(noc != jobs[mid].get_noc(0)) {
                        break;
                    }
                    mid--;
                }
                if(mid <= -1 ) {
                    return 0;
                }
                return mid + 1;//plus 1 because the while loop did 1 more subtraction.
            }else if( res < 0 ) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return -1;
	}
	
	public static ArrayList<Job> NocSearch(
			ArrayList<Job> jobs , int noc){
		ArrayList<Job> new_jobs = new ArrayList<Job>();
		Job[] temp = jobs.toArray(new Job[jobs.size()]);
		int index = noc_Search(temp, noc);
		if(index == -1) {
			System.out.println("no job found for given noc");
			return new_jobs;
		}
		for (; index < jobs.size(); index++) {
			if (temp[index].get_noc(0) != noc) {
				return new_jobs;
			}
			else {
				new_jobs.add(temp[index]);
				temp[index].printInfo();
				System.out.println();
			}
		}
		return new_jobs;
	}

}
