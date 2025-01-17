import java.util.Scanner;

public class division {
    public static int div(int num1,int num2){
        int output=num1/num2;
        return output;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println(div(num1, num2));
}
}
