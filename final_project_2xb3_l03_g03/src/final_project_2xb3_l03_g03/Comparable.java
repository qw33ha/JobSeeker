package final_project_2xb3_l03_g03;

public class Comparable {
	public static int CompareString(Job a, Job b) {
		String a1 = a.get_title();
		String b1 = b.get_title();
		int cmp = a1.compareTo(b1);
		return cmp;
	}
	
	public static int CompareOutlook(Job a, Job b) {
		int a1 = a.get_potential();
		int b1 = b.get_potential();
		if (a1 > b1)
			return 1;
		if (a1 < b1)
			return -1;
		return 0;
	}
}
