package final_project_2xb3_l03_g03;

public class Sorting extends Comparable {
	
	private static void exch(Job[] a, int i, int j) {
		Job t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static void exchString(String[] a, int i, int j) {
		String t = a[i];
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
	
	public static void sortLocation(String[] a) {
		sortLocation(a, 0, a.length - 1);
	}
	
	private static void sortLocation(String[] a, int lo, int hi) {
		if (hi <= lo) return;
		int j = partitionLocation(a, lo, hi);
		sortLocation(a, lo, j - 1);
		sortLocation(a, j + 1, hi);
	}
	
	private static int partitionLocation(String[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		String v = a[lo];
		while(true) {
			while ((a[++i].compareTo(v)) < 0) if (i == hi) break;
			while (v.compareTo(a[--j]) < 0) if (j == lo) break;
			if (i >= j) break;
			exchString(a, i, j);
		}
		exchString(a, lo, j);
		return j;
	}
}
