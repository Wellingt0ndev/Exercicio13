package exercicio13;

import java.util.Scanner;

/**
 *
 * @author Wellington F
 */
public class Exercicio13 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o tamanho do primeiro lado: ");
        a = leitor.nextInt();
        System.out.print("Digite o tamanho do segundo lado: ");
        b = leitor.nextInt();
        System.out.print("Digite o tamanho do terceiro lado: ");
        c = leitor.nextInt();
        if(a< b + c && b< c + a && c< a+ b){
            System.out.println("Formam um triângulo");
            if(a==b && b==c){
                System.out.println("É um Equilátero");
            }else if(a != b && b != c && c != a){
                System.out.println("É um Escaleno");
            }else{
                System.out.println("É um Isóscele");
            }
        }else{
            System.out.println("Não forma um triângulo");
        }
        
    }
    
}
