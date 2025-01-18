import java.util.*;
public class largest {
    public static int largest(int num1,int num2,int num3){
        int max=0;
        if (num1>num2){
            if(num1>num3){
                max=num1;
            }
            else{
                max=num3;
            }
        }
        else if(num2>num1){
            if(num2>num3){
                max=num2;
            }
            else{
                max=num3;
            }
        }
        return max;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(largest(num1, num2, num3));

    }
}
