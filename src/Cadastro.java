public class Cadastro {
    //ATRIBUTOS
    int id;
    String nome;
    String dataNascimento;
    String cpf;
    String rg;
    String endereco;
    String telefone;
    String email;

    //CONSTRUTOR PADRÃO
    public Cadastro (){
    }

    //CONSTRUTOR COM PARAMETRO - IDENTIFICAÇÃO

    public Cadastro(int id, String nome, String dataNascimento, String cpf) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }
}