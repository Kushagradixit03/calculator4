import java.util.Scanner;

public class subtraction{

    public static int add(int num1,int num2,int num3){
        int output=num1-num2-num3;
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        System.out.println(add(num1, num2,num3));
    }
}