import java.util.Scanner;


public class Main {
    public static void main (String [] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("SISTEMA FINTECH - DESCOMPLICA");
        System.out.println("Cadastro de usuário");

        Conta usuario = new Conta();
        usuario.criarCadastro();
    }
}