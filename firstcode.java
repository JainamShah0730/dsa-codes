package jainamproject;
import java.util.Scanner;

public class firstcode {

    static void print12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.print("\n");
            space -= 2;
        }
    }
    
    static void print13(int n) {
    	int num = 1 ;
                for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               
                System.out.print(num);
                num = num + 1 ; 
            }
            
           
            System.out.print("\n");
            
        }
    }
    
    static void print14(int n) {
    	
    	for (int i = 0 ; i< n ; i++ ) {
    		char ch =(char) ('A' + i) ;
    		for(int j = 0 ; j<= i ; j++)
    		{
    			System.out.print(ch);
    		}
    	System.out.println(" ");
    	}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // number of test cases
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();  // size of pattern
            print14(n);            // ✅ call the correct method
        }
        sc.close();
    }
}
