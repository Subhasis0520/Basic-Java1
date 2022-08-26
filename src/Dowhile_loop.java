import java.util.Scanner;

public class Dowhile_loop {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        do{
            System.out.println(c);
            c++;
        }while(c<=n);
    }
}
