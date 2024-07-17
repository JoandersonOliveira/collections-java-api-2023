package main.java.list.Financas;

public class Despesa {
    private Double valor;
    private String descricao;
    private boolean efetivada;
    private boolean recorrente;
    private  boolean vencida;

    public Despesa(Double valor,  String descricao){
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
        return "Despesa{" +
                "valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", efetivada=" + efetivada +
                ", recorrente=" + recorrente +
                ", vencida=" + vencida +
                '}';
    }
}
