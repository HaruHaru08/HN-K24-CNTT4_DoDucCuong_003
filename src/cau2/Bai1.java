package cau2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int number=sc.nextInt();
        int[] arr=new int[number];
        for (int i = 0; i < number; i++) {
            arr[i]=sc.nextInt();
        }
        int max=0;
        int index1=-1;
        int index2=-1;
        for (int i = 0; i < number; i++) {
            for (int j = 1; j < number; j++) {
                if(arr[i]+arr[j]>max&&arr[i]!=arr[j]&&arr[i]==arr[j-1]){
                    max=arr[i]+arr[j];
                    index1=arr[i];
                    index2=arr[j];
                }
            }
        }
        System.out.println("Cặp số liền kề có tổng lớn nhất: "+index1+" và "+index2+"(Tổng: "+max+")");
    }
}
