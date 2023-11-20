import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a primeira nota do aluno:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota do aluno:");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2)/2;

        System.out.println("A nota final do aluno é " + media);
        if (media >= 7){
            System.out.println("Ele está aprovado!");
        } else if (media >= 5) {
            System.out.println(" Ele está de recuperação!");
        } else {
            System.out.println(" Ele está reprovado!");
        }
    }
}
