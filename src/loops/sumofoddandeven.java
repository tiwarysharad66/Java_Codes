package loops;

public class sumofoddandeven {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,33,234,24,421,2,421,241,23};
        int esum = 0;
        int osum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2==0){
                esum+=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2!=0){
                osum+=arr[i];
            }


    }
        System.out.println("the sum of even is "+ esum +" "+ "and the sum of odd is" +osum );
}
    }
