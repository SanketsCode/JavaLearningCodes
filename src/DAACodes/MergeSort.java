package DAACodes;

public class MergeSort {
	
	public static void conquer(int[] Arr, int si,int mid,int ei) {
		int[] merged = new int[ei-si+1];
		int idx1 = si;
		int idx2 = mid+1;
		int x=0;
		
		while(idx1 <= mid && idx2 <= ei) {
			if(Arr[idx1] <= Arr[idx2]) {
				merged[x++] = Arr[idx1++];
			}else {
				merged[x++] = Arr[idx2++];
			}
		}
		
		
		while(idx1 <= mid) {
			merged[x++] = Arr[idx1++];
		}
		
		while(idx2 <= ei) {
			merged[x++] = Arr[idx2++];
		}
		
		for(int i=0,j=si;i < merged.length;i++,j++) {
			Arr[j] = merged[i];
		}
		
	}
	
	public static void divide(int[] Arr,int si,int ei) {
		
		if(si >= ei) {
			return;
		}
		
		int mid = si + (ei - si)/2;
		divide(Arr,si,mid);
		divide(Arr,mid+1,ei);
		conquer(Arr, si, mid, ei);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr = {6,2,3,5,4,7};
		
		divide(Arr,0,Arr.length-1);
		
		for(int i=0; i < Arr.length;i++) {
			System.out.print(Arr[i]);
		}
		
	}

}
