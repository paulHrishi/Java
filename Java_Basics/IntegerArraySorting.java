package Java_Basics;
//you can use Arrays.sort method from java.util.Arrays package, also you can use treeset without duplicates arrays..
public class IntegerArraySorting {
    public static void main(String[] args) {
        int [] arr = {2,5,6,4,5,6};
        for(int i =0; i<arr.length;i++){
            int temp =0;
            for(int j =i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        for(int x: arr){
            System.out.println("sorted array is: "+x);
        }
    }
}
