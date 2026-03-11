import java.util.Scanner;

public class Conta {
    //ATRIBUTOS
    public int idConta;
    public String nome;
    public String dataNascimento;
    public String cpf;
    private String senha;
    public String rg;
    public String endereco;
    public String telefone;
    public String email;

    //CONSTRUTOR PADRÃO
    public Conta(){
    }

    //CONSTRUTOR COM PARAMETRO - IDENTIFICAÇÃO

    public Conta(int id, String nome, String dataNascimento, String cpf) {
        this.idConta = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    // METODOS
    public void alterarSenha (String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            this.senha = novaSenha;
            System.out.println("Senha de " + nome + "foi alterada com sucesso!");
        }else {
            System.out.println("Erro: A senha atual informada está incorreta");
        }
        System.out.println("Executando alterarSenha() - Senha Alterada" + this.senha);
    }

    public void criarCadastro() {
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Iniciando Cadastro de usuário");

        System.out.print("Digite seu nome: ");
        this.nome = Entrada.nextLine();
        System.out.print("Digite seu CPF: ");
        this.cpf = Entrada.nextLine();
        System.out.print("Digite sua data de Nascimento [DD/MM/AAAA]: ");
        this.dataNascimento = Entrada.nextLine();
        System.out.print("Digite seu RG: ");
        this.rg = Entrada.nextLine();
        System.out.print("Digite seu telefone: ");
        this.telefone = Entrada.nextLine();
        System.out.print("Digite seu e-mail: ");
        this.email = Entrada.nextLine();
        System.out.print("Digite seu Endereço");
        this.endereco = Entrada.nextLine();

        System.out.println("Cadastro realizado com sucesso para: " + this.nome);
    }

    public void exibirConta () {
        System.out.println("Nome: " + nome);
        System.out.println(dataNascimento);
        System.out.println(cpf);
        System.out.println(rg);
    }

}
