package leetcode;

public class Leetcode169 {
    public static void main(String[] args) {
int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majority(arr));
    }
    public static int majority(int[]arr){
        int n = arr.length;
        int maj = n/2;
        int count= 0;
        int countmaj = 0;
        for(int i=0;i<n;i++){
            count = 0;
            for(int j=0;j<n;j++){
                if(arr[i] ==arr[j]){
                    count++;
                }
            }
            if(count>maj){
                countmaj = arr[i];
            }
        }
        return countmaj;
    }
}
