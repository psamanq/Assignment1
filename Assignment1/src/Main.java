public class Main {
    public static void main(String[] args) {
        int x = 0;
        for(int i=2;i<100;i++){
            for(int j=2;j<i;j++){
                if(i % j == 0){
                    x =1;
                }
            }
            if(x == 0){
                System.out.println(i);
            }
            x = 0;
        }
    }
}