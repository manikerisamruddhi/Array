public class Duplicate {
    public boolean duplicate(int arr[],int n) {

        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]==arr[j]) {
                    return true;
                }
               
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Duplicate d=new Duplicate();
        int arr[]=new int[] {1,2,3,4,3};
        int n=arr.length;
        System.out.println(d.duplicate(arr,n));
    }
}
