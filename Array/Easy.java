import java.util.*;


// Third largest element in Array

/**
 * Easy
 */
public class Easy {
    public static int largestelement(int[] arr) {
        int n = arr.length;

        int fst = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>fst){fst=arr[i];}
        }

        int snd = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>snd && arr[i]<fst ){snd=arr[i];}
        }
        int trd = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>trd && arr[i]<snd ){trd=arr[i];}
        }

        return trd;
    }
    public static void main(String[] args){
       

        int[] arr = { 1, 5, 9, 2, 4, 99, 22, 77, 33 };
        int val = largestelement(arr);

        System.out.println(val);
    }
    
}