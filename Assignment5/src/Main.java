import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of lines:");
        int num=scanner.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=num;j>i;j--){
                System.out.printf(" ");
            }
            for(int z=1;z<=(2*i-1);z++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

        for(int i=1;i<=3;i++){
            for(int j=num;j>1;j--){
                System.out.printf(" ");
            }
            System.out.printf("*\n");
        }
    }
}