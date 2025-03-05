import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number:");
        int number = scanner.nextInt();

        int num=number;
        int sum =0;
        while(num>0){
            sum = sum*10 + num%10;
            num = num/10;
        }
        if(sum == number){
            System.out.println("number "+number+" is palindrome");
        }else{
            System.out.println("number "+number+" is not palindrome");
        }
    }
}