/* Problem: Arrays right rotation
Write a function rotate(ar[],n) that rotates arr[] of size n by d elements.
Date: 02 Jan 2021 
Author : Rajesh Thokala
input: 1,2,3,4,5,6,7
n=2
output: 3,4,5,6,7,1,2  */
public class ArrayRotateTest{
public static void main(String args[]){
int a[]=new int[7];
for(int i=0;i<a.length;i++){
a[i]=i+1;
System.out.println(a[i]);
}
System.out.println("Calling rotate method ");
int ra[]=rotate(4,a);
}
public static int[] rotate(int n,int ar[]){
    int arr[]=ar;
while(n>0){
int temp=arr[0];
for(int j=0;j<arr.length-1;j++){
arr[j]=arr[j+1];
}
arr[arr.length-1]=temp;
n--;
}
for(int k=0;k<arr.length;k++){
System.out.println(" "+arr[k]);
}
return arr;
}
}