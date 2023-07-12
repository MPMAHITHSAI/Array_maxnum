package Arraypro;

import java.util.Scanner;

class Arrayprob{
	public static int CountNumber(int arr[]) {
	int size = arr.length;
	int max = Integer.MIN_VALUE;
	int count = 0;
	for(int i=0;i < size;i++)
	{
		if(arr[i]> max) {
			max = arr[i];
		}
	}
	for (int i=0;i<size;i++)
	{
		if(arr[i]== max) {
			count++;
		}
	}
	return size-count;
}
}

public class Arrayfiles{
	public static void main (String[] args) {
	Scanner	sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int [n];
	for (int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	Arrayprob Array = new Arrayprob();
	int count=Arrayprob.CountNumber(arr);
	System.out.println("Count Number: "+count);
	
	}
}