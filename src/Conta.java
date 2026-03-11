public class Conta {
    //ATRIBUTOS
    public int iduConta;
    public String nome;
    public String dataNascimento;
    public String cpf;
    public String rg;
    public String endereco;
    public String telefone;
    public String email;

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