import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Para ler o nome do usuário
        System.out.println("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

 // Para ler o nome, a quantidade N de vezes, que é numero inteiro
        System.out.println("Digite a quantidade de vezes que o nome do usuário deve se repetir: ");
        int N = scanner.nextInt();

 // Para exibir o nome, a quantidade de vezes desejada
        int quantidade = 0;
        while (quantidade < N) {
            System.out.println(nome);
            quantidade++;
        }

        scanner.close();

    }
}
