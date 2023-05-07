import java.util.Scanner;
public class par_e_impar{
    public static void Main(String args[]){
       Scanner Leia = new Scanner(System.in);
       int n = Leia.nextInt();
       Leia.close();
       if (n%2 == 0){
           System.out.println("par");
        }else {
           System.out.println("impar");
       }
    }
}   