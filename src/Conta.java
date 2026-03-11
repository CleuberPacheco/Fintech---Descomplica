public class Conta {
    //ATRIBUTOS
    int iduConta;
    String nome;
    String dataNascimento;
    String cpf;
    String rg;
    String endereco;
    String telefone;
    String email;

    //CONSTRUTOR PADRÃO
    public Conta(){
    }

    //CONSTRUTOR COM PARAMETRO - IDENTIFICAÇÃO

    public Conta(int id, String nome, String dataNascimento, String cpf) {
        this.iduConta = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }
}