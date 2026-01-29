import java.util.Arrays;
import java.util.Scanner;

public class basicarray{
  public static void main(String[] args) {
int arr[] ={22,11,44,31,78,56,87,72};
int max= Integer.MIN_VALUE;
int max2= Integer.MIN_VALUE;

for(int i =0 ; i<arr.length; i++){
  if(max<arr[i]){
    max=arr[i];
  }
}
for(int i =0 ; i<arr.length; i++){
  if(arr[i]>max2 && arr[i]!=max){
    max2=arr[i];
  }
}
System.out.println(max);
System.out.println(max2);


  } 
}
    

