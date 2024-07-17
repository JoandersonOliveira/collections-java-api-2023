package main.java.set.OperacoesBasicas;

public class Convidado2 {
    private String nome;
    private int codigoConvidado ;

    public Convidado2(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;
    }

    @Override
    public String toString() {
        return "Convidados2{" +
                "nome='" + nome + '\'' +
                ", codigoConvidado=" + codigoConvidado +
                '}';
    }
}
