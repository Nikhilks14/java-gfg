import java.util.PriorityQueue;

/**
 * K_largest_element
 */
public class K_largest_element {
    class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
	        pq.add(arr[i]);
	    }
	    for(int i=k;i<n;i++){
	        if(pq.peek()<arr[i]){
	            pq.poll();
	            pq.add(arr[i]);
	        }
	    }
	    int ans[]=new int[k];
	    int i=k-1;
	    while(pq.size()!=0){
	        ans[i--]=pq.peek();
	        pq.poll();
	    }
	    return ans;
    }
}

    public static void main(String[] args) {
        
    }
}