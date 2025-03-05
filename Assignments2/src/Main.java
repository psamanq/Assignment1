import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number:");
        int num = scanner.nextInt();

        if (num < 1){
            System.out.println("number is less than 1");
            return;
        }

        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum = sum + i;
            }
        }

        if(sum == num) {
            System.out.println("number " + num + " is perfect number");
        }else{
            System.out.println("number " + num + " is not perfect number");
        }
    }
}