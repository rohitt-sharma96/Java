package JavaByHarry.J_010_Resulting_Data_Type;

public class Resulting_Data_Type {
    static void main() {
//        int a = 654 + 6;
//        System.out.println(a);

        //Increment & Decrement
        int a = 55;
        int b = a++; // First a is assigned to b then a will incremented.
        int c = ++a; // First a is incremented then assigned to c.
        /*
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);   */

        //Quick Quiz - What will be the value of following expression x
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

    }
}
