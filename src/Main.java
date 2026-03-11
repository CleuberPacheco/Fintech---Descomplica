import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("SISTEMA FINTECH - DESCOMPLICA");
        System.out.println("MENU\n1 - Login\n2 - Cadastro");
        int opcao = Entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Teste Resposta");
                break;
            case 2:
                Conta usuario = new Conta();
                usuario.criarCadastro();
                usuario.exibirConta();
        }
    }
}