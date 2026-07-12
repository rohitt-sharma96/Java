package JavaByHarry.J_006_Exercise_1;

import java.util.Scanner;

public class Marks {
    public static void main(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Marks of English :");
        int english = sc.nextInt();

        System.out.print("Enter the Marks of Hindi :");
        int hindi = sc.nextInt();

        System.out.print("Enter the Marks of Math :");
        int math = sc.nextInt();

        System.out.print("Enter the Marks of Science :");
        int science = sc.nextInt();

        System.out.print("Enter the Marks of Sanskrit :");
        int sanskrit = sc.nextInt();

        int ans = (hindi+english+math+science+sanskrit)/5;

        System.out.println("The percentage of total marks is :" +ans+"%");

    }
}
