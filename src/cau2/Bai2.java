package cau2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int number=sc.nextInt();
        int[] arr=new int[number];
        for (int i = 0; i < number; i++) {
            arr[i]=sc.nextInt();
        }
        int[] newArrRight=new int[number];
        int[] newArrLeft=new int[number];
        int lengthRight=0;
        int lengthLeft=0;
        int index=0;
        for (int i = 0; i < number; i++) {
            if (arr[i]%2!=0){
                newArrRight[lengthRight]=arr[i];
                lengthRight++;
            }
        }
        for (int i = 0; i < number; i++) {
            if (arr[i]%2==0){
                newArrLeft[lengthLeft]=arr[i];
                lengthLeft++;
            }
        }
        for (int i = 0; i <lengthRight; i++) {
            for (int j = i+1; j < lengthRight; j++) {
                if (newArrRight[i]<newArrRight[j]){
                    int temp=newArrRight[i];
                    newArrRight[i]=newArrRight[j];
                    newArrRight[j]=temp;
                }
            }
        }
        for (int i = 0; i < lengthRight; i++) {
            System.out.println(newArrRight[i]);
        }
        for (int i = 0; i <lengthLeft; i++) {
            for (int j = i+1; j < lengthLeft; j++) {
                if (newArrLeft[i]>newArrLeft[j]){
                    int temp=newArrLeft[i];
                    newArrLeft[i]=newArrLeft[j];
                    newArrLeft[j]=temp;
                }
            }
        }
        for (int i = 0; i < lengthLeft; i++) {
            System.out.println(newArrLeft[i]);
        }
        int k = 0;
        for (int i = 0; i < lengthRight; i++) {
            arr[k++] = newArrRight[i];
        }
        for (int i = 0; i < lengthLeft; i++) {
            arr[k++] = newArrLeft[i];
        }
        for (int i = 0; i < number; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
