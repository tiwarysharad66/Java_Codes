package leetcode;

public class subarraysum_divisiblebyk {
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        System.out.println(subcount(arr,5));
    }
    public static int subcount(int arr[],int k){
        int prefix[] = new int[arr.length];
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int count=0;
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] +arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                if(start==0){
                   currentsum =prefix[end];
                   if(currentsum%k==0){
                       count++;
                   }
                }
                else{
                    currentsum = prefix[end] - prefix[start-1];
                    if(currentsum%k==0){
                        count++;
                    }
                }


            }
        }
        return count;
    }
}
//timelimit exceed
