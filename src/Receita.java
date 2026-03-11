import java.time.LocalDate;
public class Receita {

    //ATRIBUTOS
    public int idReceita;
    public int idCarteira;
    public String nomeReceita;
    public String tipoReceita; //Sálario - Renda Extra - Freelancer
    public double valorReceita;
    public LocalDate dataReceita;

    //CONSTRUTOR PADRÃO

    public Receita() {
    }

    //CONSTRUTOR COM PARAMÊTRO - TIPO DE RECEITA

    public Receita(int idReceita, String nomeReceita, String tipoReceita, int idCarteira) {
        this.idReceita = idReceita;
        this.nomeReceita = nomeReceita;
        this.tipoReceita = tipoReceita;
        this.idCarteira = idCarteira;
    }
    //CONSTRUTOR COM PARAMÊTRO - VALOR DA RECEITA COM DATA
    public Receita(int idReceita, double valorReceita, LocalDate dataReceita) {
        this.idReceita = idReceita;
        this.valorReceita = valorReceita;
        this.dataReceita = dataReceita;
    }
}


