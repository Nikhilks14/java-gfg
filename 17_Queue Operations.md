# Queue Operations

Here, we will learn operations on queues.

Given N integers, the task is to insert those elements in the queue. Also, given M integers, task is to find the frequency of each number in the Queue.

## Example 1:

Input:
N = 8
1 2 3 4 5 2 3 1
M = 5
1 3 2 9 10

Output:
2
2
2
-1
-1

Explanation:
After inserting 1, 2, 3, 4, 5, 2, 3 and 1 into the queue, frequency of 1 is 2, 3 is 2 and 2 is 2. Since 9 and 10 are not there in the queue we output -1 for them.

Example 2:

Input:
N = 6
1 2 1 1 1 4
M = 4
1 5 4 3
Output:
4
-1
1
-1
Explanation:
After inserting 1, 2, 1, 1, 1 and 4 into the queue, frequency of 1 is 4 and that of 4 is 1. Since 5 and 3 are not there in the queue we output -1 for them.
Your Task:
Your task is to complete the functions insert() and findFrequency() which inserts the element into the queue and find the count of occurences of element in the queue respectively.

Expected Time Complexity: O(N*M)
Expected Space Complexity: O(N)

Constraints:
1 <= N <= 103
1 <= M <= 103
1 <= Elements of Queue <= 106

```
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

// Helper class Geeks to implement 
// insert() and findFrequency()
class Geeks{
    
    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){
        
        // Your code here
        q.add(k);
        
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        
        // Your code here
        Queue<Integer> c_q = new LinkedList<>();
        int ans=0;
        while(!q.isEmpty())
        {
            int curr = q.poll();
            c_q.add(curr);
            if(curr==k)
            ans++;
        }
        while(!c_q.isEmpty())
         q.add(c_q.poll());
        
        return ans;
        
    }
    
}

//{ Driver Code Starts.

// Driver class with driver code
class GFG {
    
    // Driver code
	public static void main (String[] args) {
		
		// Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    // Declaring Queue
		    Queue<Integer> q = new LinkedList<>();
		    int n = sc.nextInt();
		    
		    // Invoking object of Geeks class
		    Geeks obj = new Geeks();
		    
		    for(int i = 0;i<n;i++){
		        int k = sc.nextInt();
		        obj.insert(q, k);
		    }
		   
		    int x = sc.nextInt();
		    for(int i = 0;i<x;i++){
		        int k = sc.nextInt();
		        int f = obj.findFrequency(q, k);
		        if(f != 0){
		            System.out.println(f);
		        }
		        else{
		            System.out.println("-1");
		        }
		    }
		}
	}
}
// } Driver Code Ends
```