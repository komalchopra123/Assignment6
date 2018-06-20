import java.util.*;
class Subarray{
 public static int MaxInSubarray(int array[], int n){
 int length=1;
  int max=1;
 
 for( int i=1;i<n;i++)
 {
 if(array[i]>array[i-1])
 {
 length++;
 }

  else
 {
  if(max<length)
 {
 max=length;
 length=1;
 }
}
 }

if(max<length){
 max=length;
}
 return(max);
 }

 public static void main(String[] args){
 int array[]={5,6,3,5,7,8,9,1};
 int n=array.length;
 System.out.print("length=" + MaxInSubarray(array,n));

}
}
 









