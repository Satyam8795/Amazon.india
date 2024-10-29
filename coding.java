import java.util.*;
public class coding{
public static void main(String [] args){
    int [] arr =  new int [5];
    Scanner sc = new Scanner(System.in);
    
    for(int i = 0; i<5; i++){
        arr[i] = sc.nextInt();
    }
    reverse(arr);
    for(int i = 0; i<5; i++){
        System.out.println(arr[i]) ;
    }
    System.out.println(Arrays.toString(arr));
}
public static void reverse(int [] arr){
int start = arr[0];
int end = arr[4];
while(start < end){
    swap(arr,start,end);
    start++;
    end++;
}
}
public static void swap(int [] arr, int index1, int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
}
} 
