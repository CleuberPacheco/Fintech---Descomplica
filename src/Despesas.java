import java.time.LocalDate;

public class Despesas {
    //ATRIBUTOS
    int idDespesa;
    int idCarteira;
    String nomeDespesa;
    double valorDespesa;
    String tipoDespesa;
    LocalDate dataDespesa;

    //CONSTRUTOR PADRÂO
    public Despesas() {
    }

    //CONSTRUTOR COM PARAMETROS - TIPO DE DESPESA
    public Despesas(int idDespesa, int idCarteira, String nomeDespesa, String tipoDespesa) {
        this.idDespesa = idDespesa;
        this.idCarteira = idCarteira;
        this.nomeDespesa = nomeDespesa;
        this.tipoDespesa = tipoDespesa;
    }

    //CONSTRUTOR COM PARAMETROS - VALOR DA DESPESA COM DATA

    public Despesas(int idDespesa, double valorDespesa, LocalDate dataDespesa) {
        this.idDespesa = idDespesa;
        this.valorDespesa = valorDespesa;
        this.dataDespesa = dataDespesa;
    }

    //METODOS

}