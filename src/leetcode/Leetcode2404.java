package leetcode;

public class Leetcode2404 {
    public static void main(String[] args) {
int []arr = {0,1,1,2,2,4,4};
        System.out.println(max(arr));
    }
    public static int max(int []arr){
        int n = arr.length;
        int maxcount = Integer.MIN_VALUE;
        int max_element = 0;
        for(int i=0;i<n;i++){
            int count =0;
            for(int j = 0;j<n;j++){
                if(arr[i]==arr[j]){
                    if(arr[i]%2==0){
                        count++;
                    }
                }
            }
            if(count>maxcount){
                maxcount = count;
                max_element =arr[i];
            }
        }
        return max_element;
    }
    //failed in 77th test case
}
