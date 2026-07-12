package JavaByHarry.J_007_PracticeSet;

import java.util.Scanner;

public class PracticeSet {
    public static void main(){
        //Q.1 W.A.P to sum three numbers in JAVA

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first digit :");
        int num1 = sc.nextInt();

        System.out.print("Enter first digit :");
        int num2 = sc.nextInt();

        System.out.print("Enter first digit :");
        int num3 = sc.nextInt();

        int sum = sumDigit(num1,num2,num3);
        System.out.println("The sum is : "+sum);

    }

    public static int sumDigit(int a, int b, int c){
        int ans = a+b+c;
        return ans;
    }
}
