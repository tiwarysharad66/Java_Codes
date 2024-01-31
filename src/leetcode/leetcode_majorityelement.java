package leetcode;

public class leetcode_majorityelement {
    public static void main(String[] args) {
        int arr[] = {6,6,6,7,7};
        int count1 = 0;
        int maxcount = Integer.MIN_VALUE;
        int majority = 0;
        int n = arr.length;
        int nums = n/2;
        for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
    if(arr[i]==arr[j]){
        count1++;
    }
}
if(count1>maxcount) {
    maxcount = count1;

}
        }
        System.out.println(majority);
    }

}
