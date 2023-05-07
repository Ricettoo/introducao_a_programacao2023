import java.util.Scanner;
public class cardapio{
    public static void main(String[] args){
    Scanner Leia = new Scanner(System.in);
    int cod = Leia.nextInt();
    int qtd = Leia.nextInt();
    double total = 0.0;

if (cod == 1){
total = qtd * 4.0;
} else if(cod ==2){
    total = qtd * 4.5;
} else if (cod == 3){
    total = qtd * 5.0;
} else if (qtd == 4){
    total = qtd * 2;
} else if (qtd == 5){
    total = qtd * 1.5;
} else {
    System.out.println("Codigo nao encontrado.");
}
System.out.printf("Total: R$ %.2f\n",total);
}
 return 0;
}

