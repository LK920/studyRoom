package baekjoon;

import java.util.Scanner;

public class B2525 {
    static int hour;
    static int min;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        min = sc.nextInt();
        int during = sc.nextInt();
        int tot = hour*60 + min + during;
        if(tot >= 24 * 60) tot-= 24*60;
        int newHour = tot/60;
        int newMin = tot%60;
        System.out.println(newHour+ " " + newMin);
    }
}
