import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.print("C(n,r) Turunden N Degerini Giriniz :");
        int n=input.nextInt();
        System.out.print("C(n,r) Turunden R Degerini Giriniz :");
        int r=input.nextInt();
        int facN=1;
        for (int i=1;i<=n;i++){
            facN=facN*i;
        }
        int facR=1;
        for (int i=1;i<=r;i++){
            facR=facR*i;
        }


        int kombinasyon=facN/(facR*(n-r));
        System.out.println("C("+n+","+r+") = "+kombinasyon);

    }
}