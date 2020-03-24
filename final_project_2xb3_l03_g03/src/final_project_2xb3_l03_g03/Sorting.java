package final_project_2xb3_l03_g03;

public class Sorting extends Comparable {
	
	private static void exch(Job[] a, int i, int j) {
		Job t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void sortString(Job[] a) {
		sortString(a, 0, a.length - 1);
	}
	
	private static void sortString(Job[] a, int lo, int hi) {
		if (hi <= lo) return;
		int j = partitionString(a, lo, hi);
		sortString(a, lo, j - 1);
		sortString(a, j + 1, hi);
	}
	
	private static int partitionString(Job[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		Job v = a[lo];
		while(true) {
			while (CompareString(a[++i], v) < 0) if (i == hi) break;
			while (CompareString(v, a[--j]) < 0) if (j == lo) break;
			if (i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
	
	public static void sortOutlook(Job[] a) {
		sortOutlook(a, 0, a.length - 1);
	}
	
	private static void sortOutlook(Job[] a, int lo, int hi) {
		if (hi <= lo) return;
		int j = partitionOutlook(a, lo, hi);
		sortOutlook(a, lo, j - 1);
		sortOutlook(a, j + 1, hi);
	}
	
	private static int partitionOutlook(Job[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		Job v = a[lo];
		while(true) {
			while (CompareOutlook(a[++i], v) < 0) if (i == hi) break;
			while (CompareOutlook(v, a[--j]) < 0) if (j == lo) break;
			if (i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
	
	//sort by NOC[0]
	public static void sortNOC(Job[] a) {
		sortNOC(a, 0, a.length - 1);
	}
	
	private static void sortNOC(Job[] a, int lo, int hi) {
		if (hi <= lo) return;
		int j = partitionNOC(a, lo, hi);
		sortNOC(a, lo, j - 1);
		sortNOC(a, j + 1, hi);
	}
	
	private static int partitionNOC(Job[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		Job v = a[lo];
		while(true) {
			while ((CompareNOC(a[++i], v)) < 0) if (i == hi) break;
			while (CompareNOC(v, a[--j]) < 0) if (j == lo) break;
			if (i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
	
	//sort by region String "regions"
	public static void sortRegionS(Job[] a) {
		sortRegionS(a, 0, a.length - 1);
	}
	
	private static void sortRegionS(Job[] a, int lo, int hi) {
		if (hi <= lo) return;
		int j = partitionRegionS(a, lo, hi);
		sortRegionS(a, lo, j - 1);
		sortRegionS(a, j + 1, hi);
	}
	
	private static int partitionRegionS(Job[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		Job v = a[lo];
		while(true) {
			while ((CompareRegionS(a[++i], v)) < 0) if (i == hi) break;
			while (CompareRegionS(v, a[--j]) < 0) if (j == lo) break;
			if (i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
}
