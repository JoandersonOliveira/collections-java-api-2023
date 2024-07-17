package main.java.list.Financas;

public class Receita {
    private Double valor;
    private String descricao;
    private boolean efetivada;
    private boolean recorrente;
    private  boolean vencida;

    public Receita(Double valor,  String descricao){
        this.valor = valor;
        this.descricao = descricao;
    }

    public Double getValor(){
        return valor;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Receita{" +
                "valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", efetivada=" + efetivada +
                ", recorrente=" + recorrente +
                ", vencida=" + vencida +
                '}';
    }
}
