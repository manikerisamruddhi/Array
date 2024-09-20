import java.util.Arrays;

public class ChocalateDistibute {
    public int findMinDiff(int arr[],int n,int m) {
        if(m == 0 || n == 0) {
            return 0;
        }

        if(n<m) {
            return -1;
        }

        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++) {
            int diff=arr[i+m-1]-arr[i];
            if(diff<minDiff) {
                minDiff=diff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        ChocalateDistibute c=new ChocalateDistibute();
        int arr[]=new int[] {7, 3, 2, 4, 9, 12, 56};
        int n=7,m=3;
        System.out.println(c.findMinDiff(arr, n, m));


    }
}
