package cau1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap mot chuoi bat ky:");
        String input = sc.nextLine();

        int countWord = 0;
        int countNumber = 0;
        int countDb = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ((c >= 'a' && c <= 'z') ||
                    (c >= 'A' && c <= 'Z')) {
                countWord++;
            }
            else if (c >= '0' && c <= '9') {
                countNumber++;
            }
            else {
                countDb++;
            }
        }

        System.out.println("Chu cai: " + countWord);
        System.out.println("Chu so: " + countNumber);
        System.out.println("Ky tu dac biet: " + countDb);
        int max = countWord;

        if (countNumber > max) {
            max = countNumber;
        }
        if (countDb > max) {
            max = countDb;
        }

        System.out.println("Nhom co nhieu ky tu nhat: " + max);
    }
}