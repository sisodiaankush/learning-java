import java.util.Scanner;

public class method {
    int sum (int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        method obj= new method();
        Scanner sc= new Scanner(System.in);
        int a = sc.nextint();
        int b = sc.nextInt();

        System.out.println("sum of two number");

       int ans= obj.add(a,b);
       System.out.println(ans);
    }
}