/*
For Loop 02
Exercise: For Loop 2

use a for-loop to print the first 10 numbers of the Fibonacci sequence
 */
public class Main {
    public static void main(String[] args) {
        int fn=0;
        int fm=1;
        for (int i = 0; i<10;i++){
            System.out.println(fn);
            int f=fn+fm;
            fn=fm;
            fm=f;

        }
    }
}
