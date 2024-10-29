import java.util.*;
public class Arrays{
    public static void main(String [] args){
        //int[] arr = {1,5,78,56,67};
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[5];
        for(int i = 0; i<arr.length; i++){
            arr2[i] = arr[(arr.length-1)-i];
        }
       for(int num: arr2){
        System.out.print(num + " ");
       }
    }
}