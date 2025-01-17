import java.util.Scanner;

public class multiplication {
    public static int mul(int num1,int num2){
        int output=num1+num2;
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println(mul(num1, num2));
}
}
