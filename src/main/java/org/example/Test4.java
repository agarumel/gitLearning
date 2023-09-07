package org.example;

import java.util.Scanner;

public class Test4 {

    // Q-2
    public static void doSum(){
        int a = 74;
        int b= 36;
       int sum= a+b;
        System.out.println(sum);

    }
    //Q-3
    public static void doDiv(){
        int a= 50;
        int b=3;
        int Div= 50/3;
        System.out.println(Div);
    }
    //Q-4
    public static void doTest(int a,int b,int c){
        int num1=a+b*c;
        System.out.println(num1);
    }
    public static void doTest0(int a,int b,int c){
        int num2 = (a+b)%c;
        System.out.println(num2);
    }
    public static void doTest1(int a, int b, int c, int d){
        int test1=a+b*c/d;
        System.out.println(test1);
    }
    public static void doTest2(int a,int b,int c,int d,int e,int f){
        int test2= a+b/c*d-e%f;
        System.out.println(test2);
    }

    // Q-5
    public static void doMulti(int a,int b){
        int multi = a*b;
        System.out.println(multi);
    }
    //Q-6
    public static void doAMSDR(int a,int b){
        int sum=a+b;
        int multi = a*b;
        int sub=a-b;
        int div=a/b;
        int rem=a%b;
        System.out.println(sum);
        System.out.println(multi);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(rem);
    }
    //Q-7
    public static void multification(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        System.out.println("Multification table for" + num + ":");
        for (int i=1; i<=10; i++) {
            int result= num*i;
            System.out.println(num + "*" + i + "=" + result);
        }
    }
    //Q-9
    public static void doDouble(double a,double b,double c,double d, double e,double f) {
        double result= ((a*b-c*d)/(e-f));
        System.out.println(result);
    }
    //Q-10
    public static void doDouble1() {
        double result=4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)) ;
        System.out.println(result);
    }


    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Rumel");
        doSum();
        doDiv();
        doTest(-5,8,6);
        doTest0(55,9,9);
        doTest1(20,-3,5,8);
        doTest2(5,15,3,2,8,3);
        doMulti(25,5);
        doAMSDR(125,24);
        multification();
        System.out.println("    J    a   v     v   a ");
        System.out.println("    J   a a   v   v   a a");
        System.out.println("J   J  aaaaa   V V   aaaaa");
        System.out.println("  JJ   a    a   V   a     a");
        doDouble(25.5,3.5,3.5,3.5,40.5,4.5);
        doDouble1();

    }
}
