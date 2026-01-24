import java.util.Scanner;
//Package learning-java;


public class condition {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        //System.out.println("enter number");
        //int n= sc.nextInt();
        /*if(n%5==0){
            System.out.print(n + " " + " yes it is divisible");
        }else{
            System.out.print(n + " " +  "no it is not divisible");
        }*/
       //number is absolute integer
/*if (n<0){
System.out.println(n*(-1));

}else{
    System.out.println(n);
}*/

//check inetger or not
/*double x = sc.nextDouble();
int y = (int)x;
System.out.println(y);
if(x-y > 0){
    System.out.println("not an integer");
}else{
    System.out.println("it is an integer");
}*/
/*System.out.println("enter cost price");
int cp = sc.nextInt();
System.out.println("enter selling price");
int sp = sc.nextInt();
if(cp>sp){
    System.out.println("he is in loss");
    System.out.println(cp-sp);
}if(cp==sp){
    System.out.println("no profit no loss");
}else{
    System.out.println("he is in profit");
    System.out.println(sp-cp);
}*/

/*int n = 15;
if(n%2==0 || n%5==0){
    System.out.println("yes it is divisible by 2 and 5");
}else{
    System.out.println("no it is not");
}*/

// integer is 4digit or not
/*int n = sc.nextInt();
if(n>999 && n<10000){
    System.out.println("yes it is four digit number");
}else{
    System.out.println("no it is not");
}*/

/*System.out.println("enter number");
int n = sc.nextInt();
if(n%5==0 || n%3==0){
    System.out.println("yes it is divisible by 5 and 3");
}else{
    System.out.println("no it not");
}
*/
/*System.out.println("enter first side : " );
int x=sc.nextInt();
System.out.println("enter first side : " );
int y=sc.nextInt();
System.out.println("enter first side : " );
int z =sc.nextInt();
 if(x+y>z && x+z>y && y+z>x){
    System.out.println("yes, it is traingle");
 }else{
    System.out.println("no it not");
 }
//divisible by 5 & 3
//System.out.println("Enter number");
int n = sc.nextInt();
if(n%3==0 && n%5==0){
    System.out.println("divisible by both");
}else if(n%5==0 ){
System.out.println("it is divisible by 5");
}else if(n%3==0){
    System.out.println("yes it is by 3");
}else {
    System.out.println("no it not divisble bby any");
} 
    
// area of rect is parameter

System.out.println("ente length ");
int a = sc.nextInt();
System.out.println("ente breadth ");
int b = sc.nextInt();
int area = a*b;
int para= 2*(a+b);
if(area > para){
    System.out.println("yes it area is greater");
}else{
    System.out.println("no it not");
}*/

/*System.out.println("enter first number");
int a= sc.nextInt();
System.out.println("enter 2nd number");
int b= sc.nextInt();
System.out.println("enter 3rd number");
int c= sc.nextInt();
if(a>b && a>c){
    System.out.println("a is greatest");
}else if(b>a ){
    System.out.println("b is greatest");
}else{
    System.out.println("c is greatest");
}*/

int n= sc.nextInt();
System.out.println((n%2==0) ? "even"  : "odd");

    }

}